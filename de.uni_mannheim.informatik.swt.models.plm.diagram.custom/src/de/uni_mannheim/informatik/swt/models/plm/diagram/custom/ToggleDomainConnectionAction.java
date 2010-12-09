package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.internal.image.GIFFileFormat;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.DomainConnectionFigure;

public class ToggleDomainConnectionAction implements IObjectActionDelegate {

	public final static String ID = "de.uni_mannheim.informatik.swt.models.plm.diagram.custom.toggledomainconnectionationaction";
	
	private DomainConnectionEditPart selectedElement;
	
	public ToggleDomainConnectionAction()  {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {
		
		IFigure figure = selectedElement.getFigure();
		figure.setSize(4,4);
		DomainConnectionFigure shapeFigure = (DomainConnectionFigure)figure.getChildren().get(0);
		shapeFigure.getPoints().removeAllPoints();
		shapeFigure.getPoints().addPoint(0, 0);
		shapeFigure.getPoints().addPoint(0, 1);
		shapeFigure.getPoints().addPoint(1, 1);
		shapeFigure.getPoints().addPoint(1, 0);
		shapeFigure.setBackgroundColor(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
		shapeFigure.setSize(4, 4);
		shapeFigure.revalidate();
		shapeFigure.repaint();
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
