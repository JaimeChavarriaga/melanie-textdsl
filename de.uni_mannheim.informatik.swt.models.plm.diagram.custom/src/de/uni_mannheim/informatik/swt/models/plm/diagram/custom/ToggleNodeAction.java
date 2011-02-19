package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Field;
import de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.MultipleGeneralizationEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.MultipleSpecializationEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditor;


/**
 * 
 * @author Ralph Gerbig (rgerbig@rumms.uni-mannheim.de)
 *
 * This class is used to collapse/expand DomainConnections based on information
 * in the model. Collapsed means that the DomainConnection is rendered as small 
 * black rectangle. Collapsed means that the DomainConnection will rendered as
 * hexagon, its default figure.
 *
 */
public class ToggleNodeAction implements IObjectActionDelegate {

	public final static String ID = "de.uni_mannheim.informatik.swt.models.plm.diagram.custom.toggledomainconnectionationaction";
	
	private AbstractBorderedShapeEditPart selectedElement;
	
	public ToggleNodeAction()  {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Reads the rendering information attached to the ontology. If no information
	 * is present it will be created. After reading the information of collapsedDomainConnections
	 * Field it is decided whether the ID of the connection will be removed or added to the
	 * connection. In the end the visual state of the DomainConnectionEditPart is changed.
	 */
	@Override
	public void run(IAction action) {
		
		if (selectedElement == null)
			return;
		
		Element self = (Element)selectedElement.resolveSemanticElement();
		
		//We are not toggeling elided nodes
		/*if (self instanceof Clabject && ((Clabject)self).isElided())
			return;*/
		
		//No rendering information found => add new rendering information
		if (self.getRenderer() == null)
		{
			AddVisualizationAction.execute((ShapeNodeEditPart)selectedElement);
		}
		
		//********************************************************
		//Do toggling based on information in the diagram
		//********************************************************
		Field collapsedField = null;
		
		for(Element e : self.getRenderer().getChildren())
		{
			//We are only interested in fields
			if (e instanceof Field)
			{
				if (e.getName().equals("collapsed"))
				{
					collapsedField = (Field)e;
					break;
				}
			}
		}
		
		//get a array with all collapsed ids
		boolean collapsed = Boolean.parseBoolean(collapsedField.getValue());

		//write the new string to the command
		SetRequest setNewValueRequest = 
			new SetRequest(collapsedField, PLMPackage.eINSTANCE.getField_Value(), Boolean.toString(!collapsed));
		SetValueCommand setNewValueCommand = new SetValueCommand(setNewValueRequest);
		selectedElement.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setNewValueCommand));
		
		//********************************************************
		//Change the connection's new visual state
		//********************************************************
		if (selectedElement instanceof DomainConnectionEditPart)
			((DomainConnectionEditPart)selectedElement).updateView(false);
		else if(selectedElement instanceof BinaryGeneralizationEditPart)
			((BinaryGeneralizationEditPart)selectedElement).updateView(false);
		else if(selectedElement instanceof MultipleSpecializationEditPart)
			((MultipleSpecializationEditPart)selectedElement).updateView(false);
		else if(selectedElement instanceof MultipleGeneralizationEditPart)
			((MultipleGeneralizationEditPart)selectedElement).updateView(false);
	}

	//*****************************************************
	// Find edit part for semantic element
	//*****************************************************
	//********************************************************
	//Get currently open editor for retrieving of EditParts
	//********************************************************
	//IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
	//If no PLM Diagram is opened we want to do nothing
	//if (! (editorPart instanceof PLMDiagramEditor))
	//	return;
	//PLMDiagramEditor plmEditor = (PLMDiagramEditor)editorPart;
	//EditPart ontologyPart = 
	//	(EditPart)plmEditor.getDiagramGraphicalViewer().findEditPartsForElement(EMFCoreUtil.getProxyID(ont), NodeEditPart.class).get(0);
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedElement = null;
		if (selection instanceof IStructuredSelection) 
		{
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof DomainConnectionEditPart 
					|| structuredSelection.getFirstElement() instanceof BinaryGeneralizationEditPart
					|| structuredSelection.getFirstElement() instanceof MultipleSpecializationEditPart
					|| structuredSelection.getFirstElement() instanceof MultipleGeneralizationEditPart) 
			{
				selectedElement = (AbstractBorderedShapeEditPart) structuredSelection.getFirstElement();
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

}
