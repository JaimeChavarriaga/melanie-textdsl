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

import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.widgets.Composite;
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
import de.uni_mannheim.informatik.swt.models.plm.diagram.edit.parts.Connection2EditPart;
import de.uni_mannheim.informatik.swt.models.plm.diagram.edit.parts.ConnectionEditPart;
import de.uni_mannheim.informatik.swt.models.plm.diagram.edit.parts.Entity2EditPart;
import de.uni_mannheim.informatik.swt.models.plm.diagram.edit.parts.EntityEditPart;
import de.uni_mannheim.informatik.swt.models.plm.diagram.part.PLMDiagramEditor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

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
 						(	(event.keyCode >= 91 && event.keyCode <= 122)
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
				TextElement textElement = weavingModel.findTextElementForOffset(((StyledText)event.getSource()).getCaretOffset()).get(0);
				
				//Not an Attribute is edited -> Drop changes!
				if ( !( ((WeavingLink)textElement.eContainer()).getModelElement() instanceof Attribute ) ){
					event.doit = false;
				}
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
}