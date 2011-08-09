/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel - initial API and implementation and initial documentation
 *******************************************************************************/ 
package de.uni_mannheim.swt.plm.reasoning.service.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.plm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

/**
 * @author bastian
 *
 */
public class ExecuteModelTests implements IObjectActionDelegate {

	private List<Element> selectedElements = new LinkedList<Element>();
	private static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service";
	
	public ExecuteModelTests() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		try
		{
			if (selectedElements.size() > 0)
				((IReasoningService )ExtensionPointService.Instance().getReasoningService(ID)).getAllModelSupertypes((Clabject) selectedElements.get(0));
		} catch (CoreException e) {
			e.printStackTrace();
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
