package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration;

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.widgets.Display;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModelContent;

public class SyncModelAndTextReconcilingStrategy implements
		IReconcilingStrategy, IReconcilingStrategyExtension {

	private WeavingModel weavingModel;
	private ISourceViewer sourceViewer;
	
	private IDocument document;
	
	
	public SyncModelAndTextReconcilingStrategy(WeavingModel weavingModel, ISourceViewer sourceViewer){
		this.weavingModel = weavingModel;
		this.sourceViewer = sourceViewer;
	}
	
	@Override
	public void initialReconcile() {
		// Do nothing
	}
	
	@Override
	public void setProgressMonitor(IProgressMonitor monitor) {
		// Do nothing
	}

	@Override
	public void setDocument(IDocument document) {
		this.document = document;
	}

	@Override
	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
		//If there is no weaving model we cannot sync
		if (weavingModel == null)
			return;
		
		syncTextWithModel(dirtyRegion);
	}

	@Override
	public void reconcile(IRegion partition) {
		// Do nothing

	}

	/**
	 * Delegates to the methods for instering/removing text
	 * 
	 * @param dirtyRegion
	 */
	public void syncTextWithModel(DirtyRegion dirtyRegion){
		int offset = dirtyRegion.getOffset();
		
		List<TextElement> possibleWeavingLinks = weavingModel.findTextElementForOffset(offset - 1);
		Assert.isTrue(possibleWeavingLinks.size() == 1);

		
		TextElement textElement = possibleWeavingLinks.get(0);
		WeavingLink link = (WeavingLink)textElement.eContainer();
		
		if (dirtyRegion.getType() == DirtyRegion.INSERT)
			syncTextInserted(dirtyRegion, textElement, link);
		else if (dirtyRegion.getType() == DirtyRegion.REMOVE)
			syncTextRemoved(dirtyRegion, textElement, link);
	}

	//@Inject UISynchronize synchronize;
	
	/**
	 * Syncs multi-level model and weaving model on text insert
	 * 
	 * @param dirtyRegion
	 * @param textElement
	 * @param link
	 */
	public void syncTextInserted(DirtyRegion dirtyRegion, final TextElement textElement, final WeavingLink link){
		int relativeOffset = dirtyRegion.getOffset() - textElement.getOffset();
		
		if (relativeOffset > textElement.getText().length())
			return;
		
		String firstPart = textElement.getText().substring(0, relativeOffset);
		String secondPart = textElement.getText().substring(relativeOffset);
		final String newString = firstPart + dirtyRegion.getText() + secondPart;
		textElement.setText(newString);
		
		if (link.getModelElement() instanceof Attribute){
			changeModel(newString, link, textElement);
		}
	}
	
	/**
	 * Syncs multi-level and weaving model on text remove
	 * 
	 * @param dirtyRegion
	 * @param textElement
	 * @param link
	 */
	public void syncTextRemoved(DirtyRegion dirtyRegion, TextElement textElement, WeavingLink link){
		int relativeOffset = dirtyRegion.getOffset() - textElement.getOffset();
		
		if (relativeOffset > textElement.getText().length())
			return;
		
		int lengthToRemove = dirtyRegion.getLength();
		String firstPart = textElement.getText().substring(0, relativeOffset);
		
		if (relativeOffset + lengthToRemove > textElement.getText().length())
			return;
			
		String secondPart = textElement.getText().substring(relativeOffset + lengthToRemove);
		final String newString = firstPart + secondPart;
		textElement.setText(newString);
		
		if (link.getModelElement() instanceof Attribute){
			changeModel(newString, link, textElement);
		}
	}
	
	/**
	 * Changes the text in the multi-level and weaving model and updates 
	 * offset, length etc. in the weaving model.
	 * 
	 * @param newString
	 * @param link
	 * @param textElement
	 */
	private void changeModel(final String newString, final WeavingLink link, final TextElement textElement){
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(link.getModelElement());
				//Update the multi-level model
				Command updateMultiLevelModelCommand = SetCommand.create(domain, link.getModelElement(), PLMPackage.eINSTANCE.getAttribute_Value(), newString);
				domain.getCommandStack().execute(updateMultiLevelModelCommand);
				
				textElement.setText(newString);
				recalculateOffset(((WeavingModel)EcoreUtil.getRootContainer(link)).getLinks().get(0), 0, document.get());
				
				// Because this reconciler works asynchronous to the UI thread the
				// damage repairer etc. are already run before the weaving model is
				// updated. Thus, it must be run mannualy after updating the weaving
				// model.
				sourceViewer.invalidateTextPresentation();
			}
		});
	}
	
	/**
	 * Recalculates offset and lenght of TextElements
	 *
	 * @param link
	 * @param offset
	 * @param document
	 * @return
	 */
	private int recalculateOffset(WeavingLink link, int offset, String document){
		int currentOffset = offset;
		
		for (WeavingModelContent element : link.getChildren()){
			if (element instanceof TextElement){
				int length = ((TextElement)element).getText().length();
				((TextElement)element).setLenght(length);
				((TextElement)element).setOffset(currentOffset);
				currentOffset = currentOffset + length;
			}
			else{
				currentOffset = recalculateOffset((WeavingLink)element, currentOffset, document);
			}
		}
		
		return currentOffset;
	}
}