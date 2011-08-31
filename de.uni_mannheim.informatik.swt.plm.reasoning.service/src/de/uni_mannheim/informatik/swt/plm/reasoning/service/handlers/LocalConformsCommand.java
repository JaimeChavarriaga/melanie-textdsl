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
package de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class LocalConformsCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.localconformscommand";
	
	IReasoningService service = new ReasoningService().Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getParameters().get("type");
		Clabject instance = (Clabject)event.getParameters().get("instance");
		
		if (type instanceof Connection && instance instanceof Connection)
			return localConformsConnection((Connection) type, (Connection) instance);
		if (type instanceof Entity && instance instanceof Entity)
			return localConformsClabject(type, instance);
		return false;
	}
	
	public boolean localConformsConnection(Connection type, Connection instance) {
		if (!localConformsClabject(type, instance)) {
			return false;
		} 
		for (String rN : type.getRoleName()) {
			boolean found = instance.getRoleName().contains(rN);
			if (!found) {
				return false;
			} 
			if (! (instance.isNavigableForRoleName(rN) == (type.isNavigableForRoleName(rN)))) {
				return false;
			}
		}
		return false;
	}
	
	public boolean localConformsClabject(Clabject type, Clabject instance) {
		if (type.getLevel() + 1 != instance.getLevel()) {
			return false;
		}
		for (Feature current: type.getAllFeatures()) {
			boolean found = false;
			for (Feature possible : instance.getAllFeatures()) {
				if (service.run(IReasoningService.FEATURE_CONFORMS, new Object[]{current, possible})) {
					found = true;
					break;
				}
			}
			if (!found) {
				return false;
			}
		}
		return true;
	}
}