/*******************************************************************************
 * Copyright (c) 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/ 
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultiLevelModelViewerConfiguration;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultilevelColorProvider;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.diagram.edit.parts.Connection2EditPart;
import de.uni_mannheim.informatik.swt.models.plm.diagram.edit.parts.ConnectionEditPart;
import de.uni_mannheim.informatik.swt.models.plm.diagram.edit.parts.Entity2EditPart;
import de.uni_mannheim.informatik.swt.models.plm.diagram.edit.parts.EntityEditPart;
import de.uni_mannheim.informatik.swt.models.plm.diagram.part.PLMDiagramEditor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModelContent;

public class MultiLevelModelTextEditor extends TextEditor {

	private MultilevelColorProvider multilevelColorProvider;
	private WeavingModel weavingModel;
	
	public MultiLevelModelTextEditor() {
		super();

		multilevelColorProvider = new MultilevelColorProvider();
		setSourceViewerConfiguration(new MultiLevelModelViewerConfiguration(multilevelColorProvider));
		setDocumentProvider(new MultiLevelModelDocumentProvider());
	}
	
	public void dispose() {
		multilevelColorProvider.dispose();
		super.dispose();
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		
		weavingModel = MultiLevelModelEditorInput.LatestInstance.getWeavingModel();
		
		((ITextViewerExtension)getSourceViewer()).appendVerifyKeyListener(new VerifyKeyListener() {
			
			@Override
			public void verifyKey(VerifyEvent event) {
				
				//use event.stateMask to detect STRG+X etc.
				if (!
							//Character was pressed
 						(	(event.keyCode >= 91 && event.keyCode <= 127)
							//Number was pressed or math signs such as "-"
						|| 	(event.keyCode >= 32 && event.keyCode <= 61)
							// "/"	"+"
						||	(event.keyCode >= 16777258 && event.keyCode <= 16777296)
						||  (event.keyCode >= 131072 && event.keyCode <= 131072)
							//Enter key, Back space
						||	(event.keyCode >= 8 && event.keyCode <= 13)
						)
					)
					return;
				
				WeavingModel weavingModel = MultiLevelModelEditorInput.LatestInstance.getWeavingModel();
				TextElement textElement = weavingModel.findTextElementForOffset(((StyledText)event.getSource()).getCaretOffset(), SearchStrategy.ATTRIBUTE_PREFFERED).get(0);
				
				if ((event.keyCode == 127 || event.keyCode == 8) 
						&& ((WeavingLink)textElement.eContainer()).getModelElement() instanceof Clabject){
					event.doit = false;
					removeClabjectFromTextAndModel((WeavingLink)textElement.eContainer());
					return;
				}
				
				//Not an Attribute is edited -> Drop changes!
				if ( !( ((WeavingLink)textElement.eContainer()).getModelElement() instanceof Attribute ) ){
					event.doit = false;
				}
			}
		});

		// Cannot use IReconcilingStrategy and IReconcilingStrategy extension because dirty regions
		// of model elements which are inserted through text editor.
		getSourceViewer().addTextListener(new ITextListener() {
			
			@Override
			public void textChanged(TextEvent event) {
				if (weavingModel == null)
					return;
				
				syncTextWithModel(event);
			}
		});
		
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(new ISelectionListener() {
			
			@Override
			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				if (!(selection instanceof TextSelection))
					return;
				
				TextSelection textSelection = (TextSelection)selection;
				int offSet = textSelection.getOffset();
				
				List<TextElement> textElements = weavingModel.findTextElementForOffset(offSet);
				
				if (textElements.size() == 0)
					return;
				
				TextElement textElement = textElements.get(0);
				WeavingLink weavingLink = (WeavingLink)textElement.eContainer();
				Clabject clabjectToSelect;
				
				if (weavingLink.getModelElement() instanceof Attribute)
					clabjectToSelect = (Clabject)((WeavingLink)weavingLink.eContainer()).getModelElement();
				else if (weavingLink.getModelElement() instanceof Clabject)
					clabjectToSelect = (Clabject)weavingLink.getModelElement();
				else
					return;
				
				if (clabjectToSelect.eResource() == null)
					return;
				
				String fileName = clabjectToSelect.eResource().getURI().lastSegment();
				IEditorReference editorReference = null;
				for (IEditorReference reference : PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getEditorReferences())
					if (reference.getPartName().equals(fileName))
						editorReference = reference;
				
				if (editorReference == null)
					return;
				
				IEditorPart editorPart = editorReference.getEditor(true);
				
				if (! (editorPart instanceof PLMDiagramEditor) )
					return;
				
				PLMDiagramEditor plmDiagramEditor = (PLMDiagramEditor)editorPart;
				
				List editParts = plmDiagramEditor.getDiagramGraphicalViewer().findEditPartsForElement(EMFCoreUtil.getProxyID(clabjectToSelect), EntityEditPart.class);
				if (editParts.size() == 0)
					editParts = plmDiagramEditor.getDiagramGraphicalViewer().findEditPartsForElement(EMFCoreUtil.getProxyID(clabjectToSelect), Entity2EditPart.class);
				else if (editParts.size() == 0)
					editParts = plmDiagramEditor.getDiagramGraphicalViewer().findEditPartsForElement(EMFCoreUtil.getProxyID(clabjectToSelect), ConnectionEditPart.class);
				else if (editParts.size() == 0)
					editParts = plmDiagramEditor.getDiagramGraphicalViewer().findEditPartsForElement(EMFCoreUtil.getProxyID(clabjectToSelect), Connection2EditPart.class);
				else if (editParts.size() == 0)
					return;
				
				IGraphicalEditPart editPart = (IGraphicalEditPart)editParts.get(0);
				plmDiagramEditor.getDiagramGraphicalViewer().select(editPart);
				plmDiagramEditor.getDiagramGraphicalViewer().reveal(editPart);
			}
		});
		
		
		
//		getSourceViewer().getTextWidget().addLineBackgroundListener(new LineBackgroundListener() {
//			
//			@Override
//			public void lineGetBackground(LineBackgroundEvent event) {
//				WeavingModel weavingModel = MultiLevelModelEditorInput.LatestInstance.getWeavingModel();
//				TextElement textElement = weavingModel.findTextElementForOffset(((StyledText)event.getSource()).getCaretOffset()).get(0);
//				
//				//Not an Attribute is edited -> Drop changes!
//				if ( !( ((WeavingLink)textElement.eContainer()).getModelElement() instanceof Attribute ) ){
//					event.lineBackground = multilevelColorProvider.getColor(new RGB(150, 150, 150));
//				}
//			}
//		});
	}

	
	private void removeClabjectFromTextAndModel(WeavingLink linkToClabject){
		MessageBox deleteClabjectBox = new MessageBox(PlatformUI.getWorkbench().getDisplay().getActiveShell(), SWT.ICON_QUESTION | SWT.YES | SWT.NO);
		deleteClabjectBox.setMessage("Do you want to delete " + linkToClabject.getModelElement().getName() + "?");
		deleteClabjectBox.setText("Delete Clabject");
		
		if (deleteClabjectBox.open() == SWT.NO)
			return;
		
		CompoundCommand cCmd = new CompoundCommand();
		
		Clabject clabjectToDelete = (Clabject)linkToClabject.getModelElement();
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(clabjectToDelete);
		cCmd.append(RemoveCommand.create(domain, clabjectToDelete));
		
		List<Classification> classificationsToDelete = new ArrayList<>(clabjectToDelete.getClassificationsAsInstance());
		classificationsToDelete.addAll(clabjectToDelete.getClassificationsAsType());
		if (classificationsToDelete.size() > 0)
			cCmd.append(RemoveCommand.create(domain, classificationsToDelete));
		
		for (Clabject c : clabjectToDelete.getEigenConnections()){
			List<Classification> connectionClassificationsToDelete = new ArrayList<>(c.getClassificationsAsInstance());
			connectionClassificationsToDelete.addAll(c.getClassificationsAsType());
			if (connectionClassificationsToDelete.size() > 0)
				cCmd.append(RemoveCommand.create(domain, connectionClassificationsToDelete));
			
			cCmd.append(RemoveCommand.create(domain, c.getClassificationsAsInstance()));
			cCmd.append(RemoveCommand.create(domain, c.getClassificationsAsType()));
		}
		
		cCmd.append(RemoveCommand.create(domain, clabjectToDelete.getEigenConnections()));
		
		domain.getCommandStack().execute(cCmd);
		
		EcoreUtil.delete(linkToClabject);

		//Remove the whole text from the model
		try {
			processTextChanged = false;
			getSourceViewer().getDocument().replace(linkToClabject.calculateOffset(), linkToClabject.calculateLength(), "");
		} catch (BadLocationException e) {
			processTextChanged = true;
			e.printStackTrace();
		}
	}
	
	/**
	 * Delegates to the methods for instering/removing text
	 * 
	 * @param dirtyRegion
	 */
	public void syncTextWithModel(TextEvent event){
		
		if (! processTextChanged){
			processTextChanged = true;
			return;
		}
		
		int offset = event.getOffset();
		
		List<TextElement> possibleWeavingLinks = weavingModel.findTextElementForOffset(offset, SearchStrategy.ATTRIBUTE_PREFFERED);
		
		if (possibleWeavingLinks.size() != 1)
				return;

		
		TextElement textElement = possibleWeavingLinks.get(0);
		WeavingLink link = (WeavingLink)textElement.eContainer();

		if (event.getReplacedText() == null)
			syncTextInserted(event.getText(), offset, textElement, link);
		else if (event.getReplacedText() != null && event.getText().length() == 0)
			syncTextRemoved(event.getReplacedText(), offset, textElement, link);
	}
	
	/**
	 * Syncs multi-level model and weaving model on text insert
	 * 
	 * @param dirtyRegion
	 * @param textElement
	 * @param link
	 */
	public void syncTextInserted(String newText, int offset, final TextElement textElement, final WeavingLink link){
		int relativeOffset = offset - textElement.getOffset();
		
		if (relativeOffset > textElement.getText().length())
			return;
		
		String firstPart = textElement.getText().substring(0, relativeOffset);
		String secondPart = textElement.getText().substring(relativeOffset);
		final String newString = firstPart + newText + secondPart;
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
	public void syncTextRemoved(String removedText, int offset, TextElement textElement, WeavingLink link){
		int relativeOffset = offset - textElement.getOffset();
		
		if (relativeOffset > textElement.getText().length())
			return;
		
		int lengthToRemove = removedText.length();
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
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(link.getModelElement());
		//Update the multi-level model
		Command updateMultiLevelModelCommand = SetCommand.create(domain, link.getModelElement(), PLMPackage.eINSTANCE.getAttribute_Value(), newString);
		domain.getCommandStack().execute(updateMultiLevelModelCommand);
		
		textElement.setText(newString);
		recalculateOffset(((WeavingModel)EcoreUtil.getRootContainer(link)).getLinks().get(0), 0);
		try {
			weavingModel.eResource().save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Because this reconciler works asynchronous to the UI thread the
		// damage repairer etc. are already run before the weaving model is
		// updated. Thus, it must be run mannualy after updating the weaving
		// model.
		getSourceViewer().invalidateTextPresentation();
	}
	
	/**
	 * Recalculates offset and length of TextElements
	 *
	 * @param link
	 * @param offset
	 * @param document
	 * @return
	 */
	public static int recalculateOffset(WeavingLink link, int offset){
		int currentOffset = offset;
		
		for (WeavingModelContent element : link.getChildren()){
			if (element instanceof TextElement){
				int length = ((TextElement)element).getText().length();
				((TextElement)element).setLength(length);
				((TextElement)element).setOffset(currentOffset);
				currentOffset = currentOffset + length;
			}
			else{
				currentOffset = recalculateOffset((WeavingLink)element, currentOffset);
			}
		}		
		
		return currentOffset;
	}
	
	
	private static boolean processTextChanged = true;
	
	/**
	 * This is set true by MultiLevelModelTemplateProposal to prevent updating.
	 * Only valid for one change e.g. applying an template.
	 */
	public static void setProcessTextChanged(boolean process){
		processTextChanged = process;
	}
}