/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel - initial API and implementation and initial documentation
 *    Ralph Gerbig - non reasoning related programming
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
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
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
		Clabject type = (Clabject)event.getObjectParameterForExecution("type");
		Clabject instance = (Clabject)event.getObjectParameterForExecution("instance");
		
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		CompositeCheck check = compute(type, instance);
		resultModel.getCheck().add(check);

		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected CompositeCheck compute(Clabject type, Clabject instance) {
		return neighbourhoodConforms(type, instance);
	}
	
	private CompositeCheck neighbourhoodConforms(Clabject type,
			Clabject instance) {
		CompositeCheck result = reasoner.createCompositeCheck("NeighbourhoodConformance[Delegation]", instance, type, instance.getName()+".neighbourhoodConforms("+type.getName() + ")");
		CompositeCheck child = null;
		if (type instanceof Connection && instance instanceof Connection) {
			child = neighbourhoodConformsConnection((Connection) type, (Connection) instance);
		} else if (type instanceof Entity && instance instanceof Entity) {
			child = neighbourhoodConformsClabject(type, instance);
		} else {
			System.out.println("mismatching types");
		}
		result.getCheck().add(child);
		result.setResult(child.isResult());
		return result;
	}

	private CompositeCheck neighbourhoodConformsClabject(Clabject type,
			Clabject instance) {
		CompositeCheck result = reasoner.createCompositeCheck("NeighbourhoodConformance[Clabject]", instance, type, instance.getName()+".neighbourhoodConformsClabject("+type.getName() + ")");
		CompositeCheck localC = (new LocalConformsCommand()).compute(type, instance);
		result.getCheck().add(localC);
		if (!localC.isResult()) {
			return result;
		}
		for (String rN: type.getDomainRoleNames()) {
			RoleNameLocalConformanceCheck rCheck = ReasoningResultFactory.eINSTANCE.createRoleNameLocalConformanceCheck();
			result.getCheck().add(rCheck);
			rCheck.setRoleName(rN);
			rCheck.setResult(true);
			for (Clabject t :type.getDomainForRoleName(rN)) {
				boolean found = false;
				for (Clabject i:instance.getDomainForRoleName(rN)) {
					CompositeCheck innerLocal = (new LocalConformsCommand()).compute(t,i);
					rCheck.getCheck().add(innerLocal);
					if (innerLocal.isResult()) {
						found = true;
						break;
					}
				}
				if (!found) {
					rCheck.setResult(false);
				}
			}
		}
		ConnectionsLocalConformanceCheck conCheck = ReasoningResultFactory.eINSTANCE.createConnectionsLocalConformanceCheck();
		conCheck.setResult(true);
		result.getCheck().add(conCheck);
		for(Connection t:type.getAllConnections()) {
			CompositeCheck tCheck = reasoner.createCompositeCheck(t.getName(), instance, t, "keine ahnung");
			tCheck.setResult(true);
			conCheck.getCheck().add(tCheck);
			conCheck.setNoTypeConnections(conCheck.getNoTypeConnections() + 1);
			boolean found = false;
			for (Connection i: instance.getAllConnections()) {
				CompositeCheck iCheck = reasoner.createCompositeCheck(i.getName(), t, i, "immernoch keine ahnung");
				tCheck.getCheck().add(iCheck);
				CompositeCheck innerstLocal = (new LocalConformsCommand()).compute(t, i);
				iCheck.getCheck().add(innerstLocal);
				if (innerstLocal.isResult()) {
					boolean error = false;
					for (String rN: t.getRoleNames()) {
						CompositeCheck partLocal = (new LocalConformsCommand()).compute(t.getParticipantForRoleName(rN), i.getParticipantForRoleName(rN));
						iCheck.getCheck().add(partLocal);
						if (!partLocal.isResult()) {
							error = true;
							break;
						}
					} 
					if (!error) {
						found = true;
						iCheck.setResult(true);
						break;
					}
				}
			}
			if (!found) {
				tCheck.setResult(false);
				conCheck.setResult(false);
				return result;
			}
		}
		result.setResult(true);
		return result;
	}

	private CompositeCheck neighbourhoodConformsConnection(Connection type,
			Connection instance) {
		CompositeCheck result = reasoner.createCompositeCheck("NeighbourhoodConformance[Connection]", instance, type, instance.getName()+".neighbourhoodConformsConnection("+type.getName() + ")");
		CompositeCheck clabCheck = neighbourhoodConformsClabject(type, instance);
		result.getCheck().add(clabCheck);
		if (!clabCheck.isResult()) {
			return result;
		}
		CompositeCheck roleNames = reasoner.createCompositeCheck("RoleNamesLocalConform", instance, type, "blah");
		result.getCheck().add(roleNames);
		for (String rN: type.getRoleNames()) {
			RoleNameLocalConformanceCheck roleCheck = ReasoningResultFactory.eINSTANCE.createRoleNameLocalConformanceCheck();
			roleNames.getCheck().add(roleCheck);
			roleCheck.setRoleName(rN);
			CompositeCheck parts = (new LocalConformsCommand()).compute(type.getParticipantForRoleName(rN), instance.getParticipantForRoleName(rN));
			roleCheck.getCheck().add(parts);
			if (!parts.isResult()) {
				return result;
			}
			roleCheck.setResult(true);
		}
		roleNames.setResult(true);
		result.setResult(true);
		return result;
	}

	
}