package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;


import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Field;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityDomainEntityFieldsCompartmentEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelDomainElementsComartmentEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes;

public class AddVisualizationAction implements IObjectActionDelegate {

	public final static String ID = "de.uni_mannheim.informatik.swt.models.plm.diagram.custom.addvisualizationaction";
	
	private DomainEntityEditPart selectedElement;
	
	public AddVisualizationAction(){
	
	}

	@Override
	public void run(IAction action) {
		CompoundCommand cc = new CompoundCommand("Create Visualization DomainEntity and Connection");

		// Create the new topic for the other end.
		CreateViewRequest visualizationDomainEntityRequest = CreateViewRequestFactory.getCreateShapeRequest(PLMElementTypes.DomainEntity_3005, selectedElement.getDiagramPreferencesHint());
		
		Point p = selectedElement.getFigure().getBounds().getTopRight().getCopy();
		selectedElement.getFigure().translateToAbsolute(p);
		int edgeCount = selectedElement.getNotationView().getSourceEdges().size();
		// A quick hack to get subtopics to layout to the right, from top to bottom; added edge count * 5 > 100 to prefent negative value
		int offset = (edgeCount * 50) > 100 ? (edgeCount * 50) - 100: 100;
		visualizationDomainEntityRequest.setLocation(p.translate(100, offset));

		ModelDomainElementsComartmentEditPart mapEditPart = (ModelDomainElementsComartmentEditPart) selectedElement.getParent();
		Command createTopicCmd = mapEditPart.getCommand(visualizationDomainEntityRequest);
		IAdaptable visualizationDomainEntityViewAdapter = (IAdaptable) ((List) visualizationDomainEntityRequest.getNewObject()).get(0);
		
		cc.add(createTopicCmd);

		// create the visualization DomainEntity link command
		ICommand createDomainEntityToVisualizationConnectionCommand = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(PLMElementTypes.DomainEntityRenderer_4007,
				((IHintedType) PLMElementTypes.DomainEntityRenderer_4007).getSemanticHint(), selectedElement.getDiagramPreferencesHint()), new EObjectAdapter((EObject) selectedElement.getModel()),
				visualizationDomainEntityViewAdapter, selectedElement.getViewer());

		cc.add(new ICommandProxy(createDomainEntityToVisualizationConnectionCommand));

		selectedElement.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		
		// put the new topic in edit mode and set it up
		final EditPartViewer viewer = selectedElement.getViewer();
		final EditPart elementPart = (EditPart) viewer.getEditPartRegistry().get(visualizationDomainEntityViewAdapter.getAdapter(View.class));
		
		
		
		if (elementPart != null) {
			
			//**************************************************************
			//Setup of Visualization Object
			//**************************************************************
			DomainEntity visualizer = (DomainEntity) ViewUtil.resolveSemanticElement((View)elementPart.getModel());
			SetRequest request = new SetRequest(visualizer, PLMPackage.eINSTANCE.getElement_Name(), "leftVisualization");
			SetValueCommand command = new SetValueCommand(request);
			elementPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(command));
			
			//**************************************************************
			//Add fields to compartment
			//**************************************************************
			DomainEntityDomainEntityFieldsCompartmentEditPart fieldsCompartment = null;
			//find the DomainEntityDomainEntityFieldsCompartmentEditPart
			for (int i = 0; i <  elementPart.getChildren().size(); i++)
			{
				if (elementPart.getChildren().get(i) instanceof DomainEntityDomainEntityFieldsCompartmentEditPart)
					fieldsCompartment = (DomainEntityDomainEntityFieldsCompartmentEditPart)elementPart.getChildren().get(i);
			}
			
			if (fieldsCompartment != null)
			{
				for(EStructuralFeature attr : visualizer.eClass().getEAllAttributes())
				{
					//Create Element				
					ViewAndElementDescriptor fieldDescriptor = new ViewAndElementDescriptor(
							new CreateElementRequestAdapter(new CreateElementRequest(PLMElementTypes.Field_3007)),
							Node.class,
							((IHintedType)PLMElementTypes.Field_3007).getSemanticHint(), 
							selectedElement.getDiagramPreferencesHint()
							);
					CreateViewAndElementRequest fieldRequest = new CreateViewAndElementRequest(fieldDescriptor);
					CompoundCommand fieldsCC = new CompoundCommand("Create Field");
					fieldsCC.add(fieldsCompartment.getCommand(fieldRequest));
					selectedElement.getDiagramEditDomain().getDiagramCommandStack().execute(fieldsCC);
					
					
					//Set values
					FieldEditPart fieldPart = (FieldEditPart) viewer.getEditPartRegistry().get(fieldDescriptor.getAdapter(View.class));
					Field field = (Field) ViewUtil.resolveSemanticElement((View)fieldPart.getModel());
					SetRequest setFieldNameRequest = new SetRequest(field, PLMPackage.eINSTANCE.getElement_Name(), attr.getName());
					SetValueCommand setFieldNameCommand = new SetValueCommand(setFieldNameRequest);
					fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldNameCommand));
				}
			}		
			
			//**************************************************************
			//Set edit element
			//**************************************************************
			Display.getCurrent().asyncExec(new Runnable() {

				public void run() {
					
					viewer.setSelection(new StructuredSelection(elementPart));
					Request der = new Request(RequestConstants.REQ_DIRECT_EDIT);
					elementPart.performRequest(der);
				}
			});
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof DomainEntityEditPart) {
				selectedElement = (DomainEntityEditPart) structuredSelection.getFirstElement();
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

}
