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
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
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
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Field;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityDomainEntityFieldsCompartment2EditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityDomainEntityFieldsCompartmentEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes;

public class AddVisualizationAction implements IObjectActionDelegate {

	public final static String ID = "de.uni_mannheim.informatik.swt.models.plm.diagram.custom.addvisualizationaction";
	
	private ShapeNodeEditPart selectedElement;
	
	public AddVisualizationAction(){
	
	}

	@Override
	public void run(IAction action) {
		execute(selectedElement);
	}

	public static void execute(ShapeNodeEditPart selectedElement)
	{
		CompoundCommand cc = new CompoundCommand("Create Visualization DomainEntity and Connection");

		IElementType type;;
		
		//Create View in Root Container
		if (selectedElement instanceof OntologyEditPart)
			type = PLMElementTypes.DomainEntity_2003;
		//Create View in Model
		else
			type = PLMElementTypes.DomainEntity_3018;
		
		// Create the new topic for the other end.
		CreateViewRequest visualizationDomainEntityRequest = CreateViewRequestFactory.getCreateShapeRequest(type, selectedElement.getDiagramPreferencesHint());
			
		Point p = selectedElement.getFigure().getBounds().getTopRight().getCopy();
		selectedElement.getFigure().translateToAbsolute(p);
		int edgeCount = selectedElement.getNotationView().getSourceEdges().size();
		// A quick hack to get subtopics to layout to the right, from top to bottom; added edge count * 5 > 100 to prevent negative value
		int offset = (edgeCount * 50) > 100 ? (edgeCount * 50) - 100: 100;
		visualizationDomainEntityRequest.setLocation(p.translate(100, offset));

		EditPart mapEditPart = (EditPart) selectedElement.getParent();
		Command createVisualizationDomainEntityCmd = mapEditPart.getCommand(visualizationDomainEntityRequest);
		IAdaptable visualizationDomainEntityViewAdapter = (IAdaptable) ((List) visualizationDomainEntityRequest.getNewObject()).get(0);
		
		cc.add(createVisualizationDomainEntityCmd);

		// create the visualization DomainEntity link command
		ICommand createDomainEntityToVisualizationConnectionCommand = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(PLMElementTypes.ElementRenderer_4017,
				((IHintedType) PLMElementTypes.ElementRenderer_4017).getSemanticHint(), selectedElement.getDiagramPreferencesHint()), new EObjectAdapter((EObject) selectedElement.getModel()),
				visualizationDomainEntityViewAdapter, selectedElement.getViewer());

		cc.add(new ICommandProxy(createDomainEntityToVisualizationConnectionCommand));

		selectedElement.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
		
		//**************************************************************
		//Set up new DomainEntity
		//**************************************************************
		final EditPartViewer viewer = selectedElement.getViewer();
		final EditPart elementPart = (EditPart) viewer.getEditPartRegistry().get(visualizationDomainEntityViewAdapter.getAdapter(View.class));
		
		if (elementPart != null) {
			
			//**************************************************************
			//Setup of Visualization Object
			//**************************************************************
			DomainEntity visualizer = (DomainEntity) ViewUtil.resolveSemanticElement((View)elementPart.getModel());
			Element source = (Element) ViewUtil.resolveSemanticElement((View)selectedElement.getModel());
			SetRequest request = new SetRequest(visualizer, PLMPackage.eINSTANCE.getElement_Name(), source.getName() + "Visualization");
			SetValueCommand command = new SetValueCommand(request);
			elementPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(command));
			
			//**************************************************************
			//Add fields to compartment
			//**************************************************************
			CompartmentEditPart fieldsCompartment = null;
			//find the DomainEntityDomainEntityFieldsCompartmentEditPart
			for (int i = 0; i <  elementPart.getChildren().size(); i++)
			{
				if (elementPart.getChildren().get(i) instanceof DomainEntityDomainEntityFieldsCompartmentEditPart)
				{
					fieldsCompartment = (CompartmentEditPart)elementPart.getChildren().get(i);
					break;
				}
				else if (elementPart.getChildren().get(i) instanceof DomainEntityDomainEntityFieldsCompartment2EditPart)
				{
					fieldsCompartment = (CompartmentEditPart)elementPart.getChildren().get(i);
					break;
				}
			}
			
			if (fieldsCompartment != null)
			{
				for(EStructuralFeature attr : visualizer.eClass().getEAllAttributes())
				{
					//Create Field
					ViewAndElementDescriptor fieldDescriptor = new ViewAndElementDescriptor(
							new CreateElementRequestAdapter(new CreateElementRequest(PLMElementTypes.Field_3019)),
							Node.class,
							((IHintedType)PLMElementTypes.Field_3019).getSemanticHint(), 
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
					SetRequest setFieldDurabilityRequest = new SetRequest(field, PLMPackage.eINSTANCE.getFeature_Durability(), 0);
					SetRequest setFieldValueVariabilityRequest = new SetRequest(field, PLMPackage.eINSTANCE.getField_ValueVariability(), 0);
					SetRequest setFieldValueRequest = new SetRequest(field, PLMPackage.eINSTANCE.getField_Value(), "VisualRenderingEnum::MAX");
					
					
					SetValueCommand setFieldNameCommand = new SetValueCommand(setFieldNameRequest);
					SetValueCommand setFieldDurabilityCommand = new SetValueCommand(setFieldDurabilityRequest);
					SetValueCommand setFieldValueVariabilityCommand = new SetValueCommand(setFieldValueVariabilityRequest);
					SetValueCommand setFieldValueCommand = new SetValueCommand(setFieldValueRequest);
					
					
					fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldNameCommand));
					fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldDurabilityCommand));
					fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldValueVariabilityCommand));
					fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldValueCommand));
				}
			}

			//**************************************************************
			//Add Special fields for Ontology (CollapsedDomainConnections)
			//**************************************************************
			if (selectedElement instanceof OntologyEditPart)
			{
				//**************************************************************
				//Create Field
				//**************************************************************
				ViewAndElementDescriptor fieldDescriptor = new ViewAndElementDescriptor(
						new CreateElementRequestAdapter(new CreateElementRequest(PLMElementTypes.Field_3019)),
						Node.class,
						((IHintedType)PLMElementTypes.Field_3019).getSemanticHint(), 
						selectedElement.getDiagramPreferencesHint()
						);
				CreateViewAndElementRequest fieldRequest = new CreateViewAndElementRequest(fieldDescriptor);
				CompoundCommand fieldsCC = new CompoundCommand("Create Field");
				fieldsCC.add(fieldsCompartment.getCommand(fieldRequest));
				selectedElement.getDiagramEditDomain().getDiagramCommandStack().execute(fieldsCC);
				
				//**************************************************************
				//Set values
				//**************************************************************
				FieldEditPart fieldPart = (FieldEditPart) viewer.getEditPartRegistry().get(fieldDescriptor.getAdapter(View.class));
				Field field = (Field) ViewUtil.resolveSemanticElement((View)fieldPart.getModel());
				
				//Configure Request
				SetRequest setFieldNameRequest = new SetRequest(field, PLMPackage.eINSTANCE.getElement_Name(), "collapsedNodes");
				SetRequest setFieldDurabilityRequest =  new SetRequest(field, PLMPackage.eINSTANCE.getClabject_Potency(), 0);
				SetRequest setFieldDefaultValueRequest =  new SetRequest(field, PLMPackage.eINSTANCE.getField_Value(), "Sequence{}");
				
				//Configure Values
				SetValueCommand setFieldNameCommand = new SetValueCommand(setFieldNameRequest);
				SetValueCommand setFieldDurabilityCommand = new SetValueCommand(setFieldDurabilityRequest);
				SetValueCommand setFieldDefaultValueCommand = new SetValueCommand(setFieldDefaultValueRequest);
				
				
				//Execute changes
				fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldNameCommand));
				fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldDurabilityCommand));
				fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldDefaultValueCommand));
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
			if (structuredSelection.getFirstElement() instanceof ShapeNodeEditPart) {
				selectedElement = (ShapeNodeEditPart) structuredSelection.getFirstElement();
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}
}
