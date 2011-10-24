//package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;
//
//import java.util.List;
//
//import org.eclipse.core.runtime.IAdaptable;
//import org.eclipse.draw2d.geometry.Point;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EStructuralFeature;
//import org.eclipse.emf.edit.command.SetCommand;
//import org.eclipse.gef.EditPart;
//import org.eclipse.gef.EditPartViewer;
//import org.eclipse.gef.Request;
//import org.eclipse.gef.commands.Command;
//import org.eclipse.gef.commands.CompoundCommand;
//import org.eclipse.gmf.runtime.common.core.command.ICommand;
//import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
//import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
//import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
//import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
//import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
//import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
//import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
//import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
//import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
//import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
//import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
//import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
//import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
//import org.eclipse.gmf.runtime.emf.type.core.IElementType;
//import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
//import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
//import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
//import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
//import org.eclipse.gmf.runtime.notation.Node;
//import org.eclipse.gmf.runtime.notation.NotationPackage;
//import org.eclipse.gmf.runtime.notation.View;
//import org.eclipse.jface.viewers.StructuredSelection;
//import org.eclipse.swt.widgets.Display;
//
//import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
//import de.uni_mannheim.informatik.swt.models.plm.PLM.Field;
//import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
//import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
//import de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer;
//import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart;
//import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart;
//import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart;
//import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.MultipleGeneralizationEditPart;
//import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.MultipleSpecializationEditPart;
//import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart;
//import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes;
//
//public class AddVisualizationHelper {
//
//	public static void addVisualization(IGraphicalEditPart editPart){
//		CompoundCommand cc = new CompoundCommand("Create Visualizer and Connection");
//
//		IElementType type;
//		
//		//Currently no support to visualiz ontologies
//		if (editPart instanceof OntologyEditPart)
//			return;
//		
//		//type = PLMElementTypes.Visualizer_3039;
//		
//		// Create the new topic for the other end.
//		//CreateViewRequest visualizerRequest = CreateViewRequestFactory.getCreateShapeRequest(type, editPart.getDiagramPreferencesHint());
//			
//		Point p = editPart.getFigure().getBounds().getTopRight().getCopy();
//		editPart.getFigure().translateToAbsolute(p);
//		int edgeCount = editPart.getNotationView().getSourceEdges().size();
//		// A quick hack to get subtopics to layout to the right, from top to bottom; added edge count * 5 > 100 to prevent negative value
//		int offset = (edgeCount * 50) > 100 ? (edgeCount * 50) - 100: 100;
//		//visualizerRequest.setLocation(p.translate(100, offset));
//
//		EditPart modelEditPart = (EditPart) editPart.getParent();
//		//Command createVisualizationDomainEntityCmd = modelEditPart.getCommand(visualizerRequest);
//		//IAdaptable visualizationDomainEntityViewAdapter = (IAdaptable) ((List) visualizerRequest.getNewObject()).get(0);
//		
//		//cc.add(createVisualizationDomainEntityCmd);
//
//		// create the visualization DomainEntity link command
//		//ICommand createDomainEntityToVisualizationConnectionCommand = new DeferredCreateConnectionViewAndElementCommand(new CreateConnectionViewAndElementRequest(PLMElementTypes.ElementVisualizer_4017,
//		//		((IHintedType) PLMElementTypes.ElementVisualizer_4017).getSemanticHint(), editPart.getDiagramPreferencesHint()), new EObjectAdapter((EObject) editPart.getModel()),
//		//		visualizationDomainEntityViewAdapter, editPart.getViewer());
//
//		//cc.add(new ICommandProxy(createDomainEntityToVisualizationConnectionCommand));
//
//		editPart.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
//		
//		//**************************************************************
//		//Set up new DomainEntity
//		//**************************************************************
//		final EditPartViewer viewer = editPart.getViewer();
//		//final IGraphicalEditPart visualizerEditPart = (IGraphicalEditPart) viewer.getEditPartRegistry().get(visualizationDomainEntityViewAdapter.getAdapter(View.class));
//		
//		/*if (visualizerEditPart != null) {
//			
//			//**************************************************************
//			//Setup of Visualization Object
//			//**************************************************************
//			Visualizer visualizer = (Visualizer) ViewUtil.resolveSemanticElement((View)visualizerEditPart.getModel());
//			Element source = (Element) ViewUtil.resolveSemanticElement((View)editPart.getModel());
//			SetRequest request = new SetRequest(visualizer, PLMPackage.eINSTANCE.getElement_Name(), source.getName() + "Visualizer");
//			SetValueCommand command = new SetValueCommand(request);
//			visualizerEditPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(command));
//			
//			//**************************************************************
//			//Add fields to compartment
//			//**************************************************************
//			CompartmentEditPart fieldsCompartment = null;
//			//find the DomainEntityDomainEntityFieldsCompartmentEditPart
//			for (int i = 0; i <  visualizerEditPart.getChildren().size(); i++)
//			{
//				/*
//				 * **********************************************************
//				 * NEEDS to be fixed
//				 * **********************************************************
//				 * if (visualizerEditPart.getChildren().get(i) instanceof VisualizerDomainEntityFieldsCompartmentEditPart)
//				{
//					fieldsCompartment = (CompartmentEditPart)visualizerEditPart.getChildren().get(i);
//					break;
//				}*/
//				/*else if (elementPart.getChildren().get(i) instanceof DomainEntityDomainEntityFieldsCompartment2EditPart)
//				{
//					fieldsCompartment = (CompartmentEditPart)elementPart.getChildren().get(i);
//					break;
//				}*/
//			}
//			
//			if (fieldsCompartment != null)
//			{
//				//Go through all meta model attributes and create a field
//				for(EStructuralFeature attr : visualizer.eClass().getEAllAttributes())
//				{
//					//Create Field
//					ViewAndElementDescriptor fieldDescriptor = new ViewAndElementDescriptor(
//							new CreateElementRequestAdapter(new CreateElementRequest(PLMElementTypes.Field_3019)),
//							Node.class,
//							((IHintedType)PLMElementTypes.Field_3019).getSemanticHint(), 
//							editPart.getDiagramPreferencesHint()
//							);
//					CreateViewAndElementRequest fieldRequest = new CreateViewAndElementRequest(fieldDescriptor);
//					CompoundCommand fieldsCC = new CompoundCommand("Create Field");
//					fieldsCC.add(fieldsCompartment.getCommand(fieldRequest));
//					editPart.getDiagramEditDomain().getDiagramCommandStack().execute(fieldsCC);
//					
//					
//					//Set values
//					FieldEditPart fieldPart = (FieldEditPart) viewer.getEditPartRegistry().get(fieldDescriptor.getAdapter(View.class));
//					Field field = (Field) ViewUtil.resolveSemanticElement((View)fieldPart.getModel());
//					
//					SetRequest setFieldNameRequest = new SetRequest(field, PLMPackage.eINSTANCE.getElement_Name(), attr.getName());
//					SetRequest setFieldDurabilityRequest = new SetRequest(field, PLMPackage.eINSTANCE.getFeature_Durability(), 0);
//					SetRequest setFieldValueVariabilityRequest = new SetRequest(field, PLMPackage.eINSTANCE.getField_ValueVariability(), 0);
//					SetRequest setFieldValueRequest = new SetRequest(field, PLMPackage.eINSTANCE.getField_Value(), "VisualRenderingEnum::MAX");
//					
//					
//					SetValueCommand setFieldNameCommand = new SetValueCommand(setFieldNameRequest);
//					SetValueCommand setFieldDurabilityCommand = new SetValueCommand(setFieldDurabilityRequest);
//					SetValueCommand setFieldValueVariabilityCommand = new SetValueCommand(setFieldValueVariabilityRequest);
//					SetValueCommand setFieldValueCommand = new SetValueCommand(setFieldValueRequest);
//					
//					
//					fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldNameCommand));
//					fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldDurabilityCommand));
//					fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldValueVariabilityCommand));
//					fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldValueCommand));
//				}
//			}
//
//			//**************************************************************
//			//Add Special fields for Connections (DomainConnection, Generalization)
//			//**************************************************************
//			if (editPart instanceof DomainConnectionEditPart 
//					|| editPart instanceof BinaryGeneralizationEditPart 
//					|| editPart instanceof MultipleGeneralizationEditPart
//					|| editPart instanceof MultipleSpecializationEditPart)
//			{
//				//**************************************************************
//				//Create Field
//				//**************************************************************
//				ViewAndElementDescriptor fieldDescriptor = new ViewAndElementDescriptor(
//						new CreateElementRequestAdapter(new CreateElementRequest(PLMElementTypes.Field_3019)),
//						Node.class,
//						((IHintedType)PLMElementTypes.Field_3019).getSemanticHint(), 
//						editPart.getDiagramPreferencesHint()
//						);
//				CreateViewAndElementRequest fieldRequest = new CreateViewAndElementRequest(fieldDescriptor);
//				CompoundCommand fieldsCC = new CompoundCommand("Create Field");
//				fieldsCC.add(fieldsCompartment.getCommand(fieldRequest));
//				editPart.getDiagramEditDomain().getDiagramCommandStack().execute(fieldsCC);
//				
//				//**************************************************************
//				//Set values
//				//**************************************************************
//				FieldEditPart fieldPart = (FieldEditPart) viewer.getEditPartRegistry().get(fieldDescriptor.getAdapter(View.class));
//				Field field = (Field) ViewUtil.resolveSemanticElement((View)fieldPart.getModel());
//				
//				//Configure Request
//				SetRequest setFieldNameRequest = new SetRequest(field, PLMPackage.eINSTANCE.getElement_Name(), "collapsed");
//				SetRequest setFieldDurabilityRequest =  new SetRequest(field, PLMPackage.eINSTANCE.getClabject_Potency(), 0);
//				SetRequest setFieldDefaultValueRequest =  new SetRequest(field, PLMPackage.eINSTANCE.getField_Value(), "false");
//				
//				//Configure Values
//				SetValueCommand setFieldNameCommand = new SetValueCommand(setFieldNameRequest);
//				SetValueCommand setFieldDurabilityCommand = new SetValueCommand(setFieldDurabilityRequest);
//				SetValueCommand setFieldDefaultValueCommand = new SetValueCommand(setFieldDefaultValueRequest);
//				
//				
//				//Execute changes
//				fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldNameCommand));
//				fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldDurabilityCommand));
//				fieldPart.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setFieldDefaultValueCommand));
//			}
//			
//			//If containing model does not want to show visualizers => Hide it.
//			if (visualizerEditPart.resolveSemanticElement().eContainer() instanceof Model
//					&& ((Model)visualizerEditPart.resolveSemanticElement().eContainer()).getVisualizersShown().equals("ShowRenderingOptions::NONE"))
//			{
//				org.eclipse.emf.common.command.Command cmd =
//					SetCommand.create(visualizerEditPart.getEditingDomain(), visualizerEditPart.getNotationView(), NotationPackage.eINSTANCE.getView_Visible(), false);
//				visualizerEditPart.getEditingDomain().getCommandStack().execute(cmd);
//			}
//			else
//			{
//				//**************************************************************
//				//Set edit element
//				//**************************************************************
//				Display.getCurrent().asyncExec(new Runnable() {
//	
//					public void run() {
//						viewer.setSelection(new StructuredSelection(visualizerEditPart));
//						Request der = new Request(RequestConstants.REQ_DIRECT_EDIT);
//						visualizerEditPart.performRequest(der);
//					}
//				});
//			}
//		}
//	}
//	
//}
