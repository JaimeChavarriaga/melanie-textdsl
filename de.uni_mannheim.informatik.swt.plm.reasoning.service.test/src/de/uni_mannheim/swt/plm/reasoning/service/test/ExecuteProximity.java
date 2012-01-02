/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig, Bastian Kennel 
 *    				  - initial API and implementation and initial documentation
 *******************************************************************************/ 
package de.uni_mannheim.swt.plm.reasoning.service.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.proximity.ProximityIndicator;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;

/**
 * @author bastian
 *
 */
public class ExecuteProximity implements IObjectActionDelegate {

	private List<Element> selectedElements = new LinkedList<Element>();
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		InputDialog dialog = new InputDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "ProximityIndication", "keine", "[](){}", null);
		int temp = dialog.open();
		if (temp == InputDialog.OK) {
			String erg = (new ProximityIndicator()).run((Clabject) selectedElements.get(0), dialog.getValue());
			System.out.println(erg);
		} 
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection)
	{	
		selectedElements.clear();
		
		if (selection instanceof IStructuredSelection)
		{
			Iterator i = ((IStructuredSelection) selection).iterator();
			
			while (i.hasNext())
			{
				Object obj = i.next();
				
				if (obj instanceof IGraphicalEditPart && ((IGraphicalEditPart)obj).resolveSemanticElement() instanceof Element)
					selectedElements.add((Element)((IGraphicalEditPart)obj).resolveSemanticElement());
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

}
