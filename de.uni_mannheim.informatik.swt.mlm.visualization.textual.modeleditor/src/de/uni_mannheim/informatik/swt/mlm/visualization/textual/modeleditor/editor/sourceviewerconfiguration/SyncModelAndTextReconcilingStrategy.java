package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.swt.widgets.Display;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelEditorInput;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModelContent;

public class SyncModelAndTextReconcilingStrategy implements
		IReconcilingStrategy, IReconcilingStrategyExtension {

	private WeavingModel weavingModel;
	private MultiLevelModelEditorInput editorInput;
	
	private IDocument document;
	
	public SyncModelAndTextReconcilingStrategy(WeavingModel weavingModel, MultiLevelModelEditorInput input){
		this.weavingModel = weavingModel;
		this.editorInput = input;
	}
	
	@Override
	public void setProgressMonitor(IProgressMonitor monitor) {
		// Do nothing
	}

	@Override
	public void initialReconcile() {
		for (WeavingLink link : weavingModel.getLinks()){
			recalculateWeavingModelOffsets(link, 0,  editorInput.getModelText());
		}
		
		try {
			weavingModel.eResource().save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
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
	 * 
	 * @param dirtyRegion
	 */
	public void syncTextWithModel(DirtyRegion dirtyRegion){
		int offset = dirtyRegion.getOffset();
		
		List<TextElement> possibleWeavingLinks = weavingModel.findTextElementForOffset(offset - 1);
		if (possibleWeavingLinks.size() != 1)
			throw new UnsupportedOperationException("Operation not supported!");
		
		TextElement textElement = possibleWeavingLinks.get(0);
		WeavingLink link = (WeavingLink)textElement.eContainer();
		
		if (dirtyRegion.getType() == DirtyRegion.INSERT)
			syncTextInserted(dirtyRegion, textElement, link);
		else if (dirtyRegion.getType() == DirtyRegion.REMOVE)
			syncTextRemoved(dirtyRegion, textElement, link);
	}

	//@Inject UISynchronize synchronize;
	
	/**
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
			Display.getDefault().syncExec(new Runnable() {
				
				@Override
				public void run() {
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(link.getModelElement()); 
					Command cmd = SetCommand.create(domain, link.getModelElement(), PLMPackage.eINSTANCE.getAttribute_Value(), newString);
					domain.getCommandStack().execute(cmd);
				}
			});
		}
		
		//recalculateWeavingModelOffsets(link, dirtyRegion.getOffset() - 1, document.get());
	}
	
	/**
	 * 
	 * @param dirtyRegion
	 * @param textElement
	 * @param link
	 */
	public void syncTextRemoved(DirtyRegion dirtyRegion, final TextElement textElement, final WeavingLink link){
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
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(link.getModelElement()); 
					Command cmd = SetCommand.create(domain, link.getModelElement(), PLMPackage.eINSTANCE.getAttribute_Value(), newString);
					domain.getCommandStack().execute(cmd);
				}
			});		
		}
	}
	
	/**
	 * 
	 * @param link
	 * @param offset
	 * @param document
	 */
	public static int recalculateWeavingModelOffsets(WeavingLink link, int offset, String document){
		int currentOffset = offset;
		
		for (WeavingModelContent element : link.getChildren()){
			if (element instanceof TextElement){
				currentOffset = document.indexOf(((TextElement)element).getText(), currentOffset);
				int length = ((TextElement)element).getText().length();
				((TextElement)element).setLenght(length);
				((TextElement)element).setOffset(currentOffset);
				currentOffset = currentOffset + length;
			}
			else{
				currentOffset = recalculateWeavingModelOffsets((WeavingLink)element, currentOffset, document);
			}
		}
		
		return currentOffset;
	}
}