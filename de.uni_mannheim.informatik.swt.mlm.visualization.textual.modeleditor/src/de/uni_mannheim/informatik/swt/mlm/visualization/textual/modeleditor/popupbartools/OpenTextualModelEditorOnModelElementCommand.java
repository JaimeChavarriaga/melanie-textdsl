/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.popupbartools;

import java.util.LinkedList;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;


public class OpenTextualModelEditorOnModelElementCommand extends Command{
	
	private IGraphicalEditPart host = null;
	
	/**
	 * 
	 * @param host Element which shall be toggled
	 */
	public OpenTextualModelEditorOnModelElementCommand(IGraphicalEditPart host){
		this.host = host;
	}
	
	@Override
	public void execute() {
		super.execute();
		
		
	}
}