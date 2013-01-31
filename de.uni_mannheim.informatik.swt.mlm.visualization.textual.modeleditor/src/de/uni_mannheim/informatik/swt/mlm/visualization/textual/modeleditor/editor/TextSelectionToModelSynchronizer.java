/*******************************************************************************
 * Copyright (c) 2013 University of Mannheim: Chair for Software Engineering
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
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

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

public class TextSelectionToModelSynchronizer implements ISelectionListener {
	
	private WeavingModel weavingModel;
	
	public TextSelectionToModelSynchronizer(WeavingModel weavingModel){
		this.weavingModel = weavingModel;
	}
	
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

}
