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
package de.uni_mannheim.informatik.swt.gmf.plm.commands;

import java.util.LinkedList;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

public class ToggleCommand extends Command{
	
	private IGraphicalEditPart host = null;
	
	/**
	 * 
	 * @param host Element which shall be toggled
	 */
	public ToggleCommand(IGraphicalEditPart host){
		this.host = host;
	}
	
	@Override
	public void execute() {
		super.execute();
		
		Element self = (Element)host.resolveSemanticElement();
		
		if (self.getVisualizer() == null)
			return;
		
		LinkedList<String> attributes = new LinkedList<String>();
		
		for (String attr : self.getVisualizer().get(0).getAttributes())
		{
			if (attr.startsWith("collapsed"))
			{
				attributes.remove(attr);
				String value = self.getVisualizer().get(0).getValueForKey("collapsed");
				attr = (value.equals("true")) ? "collapsed= false":"collapsed= true";
				attributes.add(attr);
			}
			else
			{
				attributes.add(attr);
			}
		}
		
		EditingDomain domain = host.getEditingDomain();
		domain.getCommandStack().execute(SetCommand.create(domain, self.getVisualizer().get(0), PLMPackage.eINSTANCE.getLMLVisualizer_Attributes(), attributes));
	}
}