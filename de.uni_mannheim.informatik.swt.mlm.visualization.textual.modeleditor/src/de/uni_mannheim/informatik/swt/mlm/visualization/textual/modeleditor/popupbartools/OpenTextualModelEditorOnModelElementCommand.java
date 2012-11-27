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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.popupbartools;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.Activator;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelEditorInput;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;


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
		
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			page.openEditor(new MultiLevelModelEditorInput((Model)((IGraphicalEditPart)host).resolveSemanticElement()), Activator.PLUGIN_ID, true);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}