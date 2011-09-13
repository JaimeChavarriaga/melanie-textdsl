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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.plm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

/**
 * @author bastian
 *
 */
public class ExecuteModelTests implements IObjectActionDelegate {

	private List<Element> selectedElements = new LinkedList<Element>();
	private static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service";
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		try
		{
			if (selectedElements.size() > 0) {
				Element e = (Element) selectedElements.get(0);
				IReasoningService reasoner = ((IReasoningService )ExtensionPointService.Instance().getReasoningService(ID)).Instance();
				if(e instanceof Clabject) {
					
					if (selectedElements.size() > 1) {
						Clabject type = (Clabject) selectedElements.get(0);
						Clabject instance = (Clabject) selectedElements.get(1);
						System.out.println("isInstance " + reasoner.run(IReasoningService.IS_INSTANCE, new Object[]{type, instance}));
						if (type instanceof Connection) {
							System.out.println("Local Construction Conformance " + reasoner.localConstructionConformsConnection((Connection) type, (Connection) instance));
							System.out.println("Neighbour Construction Conformance " + reasoner.neighbourhoodConstructionConformsConnection((Connection) type, (Connection) instance) );
						} 
					} else {
						Clabject c = (Clabject) e;
						System.out.println("Model Supertypes" + c.getModelSupertypes());
						System.out.println("Model Subtypes" + c.getModelSubtypes());
						System.out.println("Model Instances" + c.getModelInstances());
						System.out.println("Model Types" + c.getModelTypes());
						if (e instanceof Connection) {
							System.out.println("Multiplicity conformance " + reasoner.run(IReasoningService.MULTIPLICITY_CONFORMS, new Object[]{e}));
						}
					} 
				} else if (e instanceof Attribute) {
					Attribute type = (Attribute) e;
					Attribute instance = (Attribute) selectedElements.get(1);
					
					System.out.println("" + instance + ".conforms("+type+")" + reasoner.run(IReasoningService.FEATURE_CONFORMS, new Object[]{type, instance}));
				} else 	if (e instanceof Generalization || e instanceof Instantiation) {
						System.out.println("Logical Element Consistency " + reasoner.run(IReasoningService.IS_CONSISTENT, new Object[]{e}));
				} else if(e instanceof Model) {
					System.out.println("Model Consistent Classification " + reasoner.run(IReasoningService.IS_CONSISTENTLY_CLASSIFIED, new Object[]{e}));
				}
			}
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
