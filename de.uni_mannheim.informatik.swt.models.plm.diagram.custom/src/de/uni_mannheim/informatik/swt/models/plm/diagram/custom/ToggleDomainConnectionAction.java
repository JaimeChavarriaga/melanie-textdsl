package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
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

import de.uni_mannheim.informatik.swt.models.plm.PLM.Field;
import de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart;
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
public class ToggleDomainConnectionAction implements IObjectActionDelegate {

	public final static String ID = "de.uni_mannheim.informatik.swt.models.plm.diagram.custom.toggledomainconnectionationaction";
	
	private DomainConnectionEditPart selectedElement;
	
	public ToggleDomainConnectionAction()  {
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
		
		DomainConnectionEditPart connection = (DomainConnectionEditPart)selectedElement;
		
		//********************************************************
		//Get currently open editor for retrieving of EditParts
		//********************************************************
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		//If no PLM Diagram is opened we want to do nothing
		if (! (editorPart instanceof PLMDiagramEditor))
			return;
		PLMDiagramEditor plmEditor = (PLMDiagramEditor)editorPart;
		
		
		//********************************************************
		//Get the base Ontology as the rendering information for
		//DomainConnections is connected to it
		//********************************************************
		EObject obj = (EObject)selectedElement.resolveSemanticElement();
		LMLModel root = (LMLModel)EcoreUtil.getRootContainer(obj);
		Ontology ont = (Ontology)EcoreUtil.getObjectByType(root.getElements(), PLMPackage.eINSTANCE.getEClassifier("Ontology"));
		
		//No rendering information found => add new rendering information
		if (ont.getRenderer() == null)
		{
			EditPart ontologyPart = 
				(EditPart)plmEditor.getDiagramGraphicalViewer().findEditPartsForElement(EMFCoreUtil.getProxyID(ont), NodeEditPart.class).get(0);
			AddVisualizationAction.execute((ShapeNodeEditPart)ontologyPart);
		}
		
		//********************************************************
		//Do toggling based on information in the diagram
		//********************************************************
		Field collapsedDomainConnectionsField = null;
		
		for(Field f : ont.getRenderer().getFields())
		{
			if (f.getName().equals("collapsedDomainConnections"));
				collapsedDomainConnectionsField = f;
		}
		
		//get a array with all collapsed ids
		String value = collapsedDomainConnectionsField.getValue();
		String[] collapsedConnections = value.replace("Sequence{", "").replace("}", "").trim().split(";");
		//save the id if the connection was already toggled
		String toggledID = "";
		
		for (String s: collapsedConnections)
		{
			if (s.trim().replace(";", "").equals(EMFCoreUtil.getProxyID(obj)))
			{
				toggledID = s;
				break;
			}
		}
		
		//********************************************************
		//Save new information to the diagram
		//********************************************************
		String newCollapsedIDs = "";
		
		//we have no previously collapsed item => add it to the list
		if (toggledID.equals(""))
		{
			for (String s : collapsedConnections)
			{
				if(!s.equals(""))
				newCollapsedIDs += s + ";";
			}
			
			newCollapsedIDs += EMFCoreUtil.getProxyID(obj);
		}
		//we have a previously collapsed item => remove it from the list
		else
		{
			for (String s : collapsedConnections)
			{
				if (!s.equals(EMFCoreUtil.getProxyID(obj)))
					newCollapsedIDs += s + ";";
			}
		}
		
		//write the new string to the command
		SetRequest setNewValueRequest = 
			new SetRequest(collapsedDomainConnectionsField, PLMPackage.eINSTANCE.getField_Value(), "Sequence{" + newCollapsedIDs + "}");
		SetValueCommand setNewValueCommand = new SetValueCommand(setNewValueRequest);
		selectedElement.getViewer().getEditDomain().getCommandStack().execute(new ICommandProxy(setNewValueCommand));
		
		//********************************************************
		//Change the connection's new visual state
		//********************************************************
		connection.toggle();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof DomainConnectionEditPart) {
				selectedElement = (DomainConnectionEditPart) structuredSelection.getFirstElement();
			}
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

}
