package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;


import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

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
		AddVisualizationHelper.addVisualization(selectedElement);
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
