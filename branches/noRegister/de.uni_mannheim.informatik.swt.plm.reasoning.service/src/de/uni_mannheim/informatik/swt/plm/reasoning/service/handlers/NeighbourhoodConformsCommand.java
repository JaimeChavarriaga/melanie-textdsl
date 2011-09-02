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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNameLocalConformanceCheck;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class NeighbourhoodConformsCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.neighbourhoodconformscommand";

	IReasoningService reasoner = new ReasoningService().Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getParameters().get("type");
		Clabject instance = (Clabject)event.getParameters().get("instance");
		return neighbourhoodConforms(type, instance);
	}
	
	public boolean neighbourhoodConforms(Clabject type,
			Clabject instance) {
		CompositeCheck check = reasoner.createRegisterCompositeCheck("NeighbourhoodConformance[Delegation]", instance, type, instance.getName()+".neighbourhoodConforms("+type.getName() + ")");
		boolean result = false;
		if (type instanceof Connection && instance instanceof Connection) {
			result = neighbourhoodConformsConnection((Connection) type, (Connection) instance);
		} else if (type instanceof Entity && instance instanceof Entity) {
			result = neighbourhoodConformsClabject(type, instance);
		} else {
			System.out.println("mismatching types");
		}
		check.setResult(result);
		reasoner.deRegisterCheck(check);
		return result;
	}

	public boolean neighbourhoodConformsClabject(Clabject type,
			Clabject instance) {
		CompositeCheck check = reasoner.createRegisterCompositeCheck("NeighbourhoodConformance[Clabject]", instance, type, instance.getName()+".neighbourhoodConformsClabject("+type.getName() + ")");
		if (!reasoner.run(ReasoningService.LOCAL_CONFORMS, new Object[]{type, instance})) {
			reasoner.deRegisterCheck(check);
			return false;
		}
		for (String rN:type.getAllAssociateRoleNames()) {
			RoleNameLocalConformanceCheck rCheck = ReasoningResultFactory.eINSTANCE.createRoleNameLocalConformanceCheck();
			reasoner.registerCheck(rCheck);
			rCheck.setRoleName(rN);
			rCheck.setResult(true);
			for (Clabject t :type.getAllAssociatesForRoleName(rN)) {
				boolean found = false;
				for (Clabject i:instance.getAllAssociatesForRoleName(rN)) {
					if (reasoner.run(ReasoningService.LOCAL_CONFORMS, new Object[]{t, i})) {
						found = true;
						break;
					}
				}
				if (!found) {
					rCheck.setResult(false);
				}
			}
			reasoner.deRegisterCheck(rCheck);
		}
		ConnectionsLocalConformanceCheck conCheck = ReasoningResultFactory.eINSTANCE.createConnectionsLocalConformanceCheck();
		reasoner.registerCheck(conCheck);
		conCheck.setResult(true);
		for(Connection t:type.getAllConnections()) {
			conCheck.setNoTypeConnections(conCheck.getNoTypeConnections() + 1);
			boolean found = false;
			for (Connection i: instance.getAllConnections()) {
				if (reasoner.run(ReasoningService.LOCAL_CONFORMS, new Object[]{t, i})) {
					boolean error = false;
					for (String rN: t.getRoleName()) {
						if (!reasoner.run(ReasoningService.LOCAL_CONFORMS, new Object[]{t.getParticipantForRoleName(rN), i.getParticipantForRoleName(rN)})) {
							error = true;
							break;
						}
					}
					if (!error) {
						found = true;
						break;
					}
				}
			}
			if (!found) {
				conCheck.setResult(false);
				reasoner.deRegisterCheck(conCheck);
				reasoner.deRegisterCheck(check);
				return false;
			}
		}
		reasoner.deRegisterCheck(conCheck);
		check.setResult(true);
		reasoner.deRegisterCheck(check);
		return true;
	}

	public boolean neighbourhoodConformsConnection(Connection type,
			Connection instance) {
		CompositeCheck check = reasoner.createRegisterCompositeCheck("NeighbourhoodConformance[Connection]", instance, type, instance.getName()+".neighbourhoodConformsConnection("+type.getName() + ")");
		reasoner.registerCheck(check);
		if (!(neighbourhoodConformsClabject(type, instance))) {
			reasoner.deRegisterCheck(check);
			return false;
		}
		for (String rN: type.getRoleName()) {
			RoleNameLocalConformanceCheck roleCheck = ReasoningResultFactory.eINSTANCE.createRoleNameLocalConformanceCheck();
			reasoner.registerCheck(roleCheck);
			roleCheck.setRoleName(rN);
			if (!reasoner.run(ReasoningService.LOCAL_CONFORMS, new Object[]{type.getParticipantForRoleName(rN), instance.getParticipantForRoleName(rN)})) {
				reasoner.deRegisterCheck(roleCheck);
				reasoner.deRegisterCheck(check);
				return false;
			}
			roleCheck.setResult(true);
			reasoner.deRegisterCheck(roleCheck);
		}
		check.setResult(true);
		reasoner.deRegisterCheck(check);
		return true;
	}
}