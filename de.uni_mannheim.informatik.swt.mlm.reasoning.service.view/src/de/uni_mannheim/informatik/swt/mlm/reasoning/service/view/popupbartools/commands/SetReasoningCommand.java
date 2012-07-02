/*******************************************************************************
 * Copyright (c) 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.reasoning.service.view.popupbartools.commands;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.view.views.ReasoningView;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;

public class SetReasoningCommand extends Command{
	
	private IGraphicalEditPart host = null;
	
	/**
	 * 
	 * @param host Element to introspect
	 */
	public SetReasoningCommand(IGraphicalEditPart host){
		this.host = host;
	}
	
	@Override
	public void execute() {
		super.execute();
		
		ReasoningView view;
		try {
			view = (ReasoningView)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(ReasoningView.ID);
			view.setReasoningSource((Element)host.resolveSemanticElement());
			view.setReasoningTarget(null);
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().setFocus();
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}