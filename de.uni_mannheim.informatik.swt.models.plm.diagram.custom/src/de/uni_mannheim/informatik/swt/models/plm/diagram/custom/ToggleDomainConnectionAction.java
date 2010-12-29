package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditor;



public class ToggleDomainConnectionAction implements IObjectActionDelegate {

	public final static String ID = "de.uni_mannheim.informatik.swt.models.plm.diagram.custom.toggledomainconnectionationaction";
	
	private DomainConnectionEditPart selectedElement;
	
	public ToggleDomainConnectionAction()  {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {
		
		DomainConnectionEditPart editPart = (DomainConnectionEditPart)selectedElement;
		editPart.toggle(true);
		
		/*figure.setSize(4,4);
		DomainConnectionFigure shapeFigure = (DomainConnectionFigure)figure.getChildren().get(0);
		shapeFigure.getPoints().removeAllPoints();
		shapeFigure.getPoints().addPoint(0, 0);
		shapeFigure.getPoints().addPoint(0, 1);
		shapeFigure.getPoints().addPoint(1, 1);
		shapeFigure.getPoints().addPoint(1, 0);
		shapeFigure.setBackgroundColor(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
		shapeFigure.setSize(4, 4);
		shapeFigure.revalidate();
		shapeFigure.repaint();*/
		
		EObject obj = (EObject)selectedElement.resolveSemanticElement();
		LMLModel root = (LMLModel)EcoreUtil.getRootContainer(obj);
		Ontology ont = (Ontology)EcoreUtil.getObjectByType(root.getElements(), PLMPackage.eINSTANCE.getEClassifier("Ontology"));
		
		//No rendering information found => add new rendering information
		if (ont.getRenderer() == null)
		{
			IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			if (! (editorPart instanceof PLMDiagramEditor))
				return;
			
			PLMDiagramEditor plmEditor = (PLMDiagramEditor)editorPart;
			EditPart ontologyPart = 
				(EditPart)plmEditor.getDiagramGraphicalViewer().findEditPartsForElement(EMFCoreUtil.getProxyID(ont), NodeEditPart.class).get(0);
			AddVisualizationAction.execute((ShapeNodeEditPart)ontologyPart);
			
		}
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
