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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor;

import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.e4.compatibility.CompatibilityEditor;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelEditorInput;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelTextEditor;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.ITextualVisualizationService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.diagram.part.PLMDiagramEditor;
import de.uni_mannheim.informatik.swt.models.plm.graphicalrepresentation.graphicalrepresentation.provider.GraphicalrepresentationItemProviderAdapterFactory;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.AbstractColor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationFactory;
import de.uni_mannheim.informatik.swt.plm.visualization.editor.views.VisualizationEditorView;

public class TextualVisualizationService implements
		ITextualVisualizationService {

	@Override
	public String getVisualizationEditorViewID() {
		return VisualizationEditorView.ID;
	}

	@Override
	public boolean isVisibleInVisualizerEditorView(EObject element) {
		return (element instanceof TextualDSLVisualizer) 
				|| (element instanceof TextualVisualizationDescriptor)
				|| (element instanceof AbstractColor);
	}

	@Override
	public AdapterFactory getItemProviderAdapterFactory() {
		return new GraphicalrepresentationItemProviderAdapterFactory();
	}

	@Override
	public AbstractDSLVisualizer createNewSpecificDSLVisualizer() {
		return TextualrepresentationFactory.eINSTANCE.createTextualDSLVisualizer();
	}

	@SuppressWarnings("restriction")
	@Override
	public void run(Object host) {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			
			//IEditorPart newEditor = 
			page.openEditor(new MultiLevelModelEditorInput((Model)((IGraphicalEditPart)host).resolveSemanticElement()), Activator.PLUGIN_ID, true);
			
			MPart lmlEditorContainingPart = null;
			MPart textEditorContainingPart = null;
			
			EPartService service = (EPartService)PlatformUI.getWorkbench().getService(EPartService.class);
			for (MPart part : service.getParts())
				//The LML Editor is found
				if (part.getElementId().equals(CompatibilityEditor.MODEL_ELEMENT_ID)
						&& ((CompatibilityEditor)part.getObject()).getEditor().getClass().equals(PLMDiagramEditor.class))
					lmlEditorContainingPart = part;
				else if (part.getElementId().equals(CompatibilityEditor.MODEL_ELEMENT_ID)
						&& ((CompatibilityEditor)part.getObject()).getEditor().getClass().equals(MultiLevelModelTextEditor.class))
					textEditorContainingPart = part;
				else if (lmlEditorContainingPart != null && textEditorContainingPart != null)
					break;
			
			if (lmlEditorContainingPart == null
					&& textEditorContainingPart == null)
				return;
			
			MPartStack editorContainingStack = (MPartStack)((EObject)lmlEditorContainingPart).eContainer();
			editorContainingStack.getChildren().remove(textEditorContainingPart);
			
			MPartSashContainer container = (MPartSashContainer)((EObject)editorContainingStack).eContainer();
			container.setHorizontal(false);
			//container.setContainerData("5000");
			MPartStack rightPartStack = MBasicFactory.INSTANCE.createPartStack();
			rightPartStack.getTags().add("newtablook");
			rightPartStack.getTags().add("org.eclipse.e4.primaryDataStack");
			rightPartStack.getTags().add("EditorStack");
			rightPartStack.getTags().add("active");
			rightPartStack.getChildren().add(textEditorContainingPart);
			container.getChildren().add(rightPartStack);
			
		} catch (PartInitException e) {
			e.printStackTrace();
		}

	}

}
