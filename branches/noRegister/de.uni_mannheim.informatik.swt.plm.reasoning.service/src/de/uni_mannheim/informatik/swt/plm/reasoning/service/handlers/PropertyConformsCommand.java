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
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class PropertyConformsCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.propertyconformscommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getParameters().get("type");
		Clabject instance = (Clabject)event.getParameters().get("instance");
		boolean result = propertyConforms(type, instance);
		return result;
	}
	
	public boolean propertyConforms(Clabject type, Clabject instance) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		check.setName("Property Conformance[Delegation]");
		check.setSource(instance);
		check.setTarget(type);
		check.setExpression(instance.getName()+".propertyConforms("+type.getName()+")");
		reasoner.registerCheck(check);
		boolean result = false;
		if (type instanceof Connection && instance instanceof Connection) {
			result = propertyConformsConnection((Connection) type, (Connection) instance);
		} else if (type instanceof Entity && instance instanceof Entity) {
			result = propertyConformsClabject(type, instance);
		} else {
			System.out.println("mismatching types");
		}
		check.setResult(result);
		reasoner.deRegisterCheck(check);
		return result;
	}
	
	public boolean propertyConformsClabject(Clabject type, Clabject instance) {
		CompositeCheck check = reasoner.createRegisterCompositeCheck("PropertyConformance[Clabject]", instance, type, instance.getName()+".propertyConformsClabject("+type.getName()+")");
		if (!reasoner.run(ReasoningService.NEIGHBOURHOOD_CONFORMS, new Object[]{type, instance})) {
			reasoner.deRegisterCheck(check);
			return false;
		}
		AllConnectionsCheck allCCheck = ReasoningResultFactory.eINSTANCE.createAllConnectionsCheck();
		reasoner.registerCheck(allCCheck);
		for(Connection deltaT:type.getAllConnections()) {
			allCCheck.setNoTypeConnection(allCCheck.getNoTypeConnection() + 1);
			boolean found = false;
			TypeConnectionSearch typeCS = ReasoningResultFactory.eINSTANCE.createTypeConnectionSearch();
			reasoner.registerCheck(typeCS);
			typeCS.setTypeConnection(deltaT);
			for (Connection deltaI: instance.getAllConnections()) {
				typeCS.setNoSearchedConnections(typeCS.getNoSearchedConnections() + 1);
				if(propertyConforms(deltaT, deltaI)) {
					found = true;
					break;
				}
			}
			if (found) {
				typeCS.setResult(true);
			}
			reasoner.deRegisterCheck(typeCS);
			if (!found) {
				reasoner.deRegisterCheck(allCCheck);
				reasoner.deRegisterCheck(check);
				return false;
			}
		}
		allCCheck.setResult(true);
		reasoner.deRegisterCheck(allCCheck);
		if (reasoner.run(ReasoningService.IS_EXPRESSED_INSTANCE_OF_EXCLUDED, new Object[]{type, instance})) {
			reasoner.deRegisterCheck(check);
			return false;
		}
		check.setResult(true);
		reasoner.deRegisterCheck(check);
		return true;
	}

	public boolean propertyConformsConnection(Connection type,
			Connection instance) {
		CompositeCheck check = reasoner.createRegisterCompositeCheck("PropertyConformance[Connection]", instance, type, instance.getName()+".propertyConformsConnection("+type.getName()+")");
		if (!propertyConformsClabject(type, instance)) {
			reasoner.deRegisterCheck(check);
			return false;
		}
		if (!reasoner.run(ReasoningService.MULTIPLICITY_CONFORMS, new Object[]{type})) {
			reasoner.deRegisterCheck(check);
			return false;
		}
		for(String rN:type.getRoleName()) {
			if (!propertyConforms(type.getParticipantForRoleName(rN), instance.getParticipantForRoleName(rN))) {
				reasoner.deRegisterCheck(check);
				return false;
			}
		}
		check.setResult(true);
		reasoner.deRegisterCheck(check);
		return true;
	}
}