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
package de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.Pair;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class PropertyConformsCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.propertyconformscommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	Set<Pair<Clabject,Clabject>> marks = null;
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getParameters().get("type");
		Clabject instance = (Clabject)event.getParameters().get("instance");
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		CompositeCheck check = compute(type, instance);
		resultModel.getCheck().add(check);
		reasoner.getReasoningHistory().add(resultModel);
		return check.isResult();
	}
	
	private Set<Pair<Clabject, Clabject>> getMarks() {
		if (marks == null)
			marks = new HashSet<Pair<Clabject, Clabject>>();
		return marks;
	}
	
	protected CompositeCheck compute(Clabject type, Clabject instance) {
		Set<Pair<Clabject, Clabject>> marks = getMarks();
		Pair<Clabject, Clabject> pair = new Pair<Clabject, Clabject>(type, instance);
		if (marks.contains(pair)) {
			CompositeCheck cachedResult = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, null);
			cachedResult.setName("PropertyConformance[Cached]");
			cachedResult.setExpression(instance.getName() + ".propertyConforms(" + type.getName() + ")");
			cachedResult.setResult(true);
			return cachedResult;
		}
		marks.add(pair);
		CompositeCheck result = propertyConforms(type, instance);
		return result; 
	}
	
	private CompositeCheck propertyConforms(Clabject type, Clabject instance) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		check.setName("Property Conformance[Delegation]");
		check.setSource(instance);
		check.setTarget(type);
		check.setExpression(instance.getName()+".propertyConforms("+type.getName()+")");
		CompositeCheck child = null;
		if (type instanceof Connection && instance instanceof Connection) {
			child = propertyConformsConnection((Connection) type, (Connection) instance);
			check.getCheck().add(child);
			check.setResult(child.isResult());
		} else if (type instanceof Entity && instance instanceof Entity) {
			child = propertyConformsClabject(type, instance);
			check.getCheck().add(child);
			check.setResult(child.isResult());
		} else {
			System.out.println("mismatching types " + type + "|" + instance);
		}
		return check;
	}
	
	private CompositeCheck propertyConformsClabject(Clabject type, Clabject instance) {
		CompositeCheck result = reasoner.createCompositeCheck("PropertyConformance[Clabject]", instance, type, instance.getName()+".propertyConformsClabject("+type.getName()+")");
		CompositeCheck neighbour = (new NeighbourhoodConformsCommand()).compute(type, instance);
		result.getCheck().add(neighbour);
		if (!neighbour.isResult()) {
			return result;
		}
		AllConnectionsCheck allCCheck = ReasoningResultFactory.eINSTANCE.createAllConnectionsCheck(instance, type, result);
		allCCheck.setName(allCCheck.getExpression());
		allCCheck.setExpression("forall delta_t in " + type.getName() + ".connections(): exists delta_i in " + instance.getName() + ".connections(): delta_i.propertyConforms(delta_t)");
		for(Connection deltaT:type.getAllConnections()) {
			allCCheck.setNoTypeConnection(allCCheck.getNoTypeConnection() + 1);
			boolean found = false;
			TypeConnectionSearch typeCS = ReasoningResultFactory.eINSTANCE.createTypeConnectionSearch(instance, type, deltaT, allCCheck);
			typeCS.setTypeConnection(deltaT);
			for (Connection deltaI: instance.getAllConnections()) {
				typeCS.setNoSearchedConnections(typeCS.getNoSearchedConnections() + 1);
				CompositeCheck child = compute(deltaT, deltaI);
				typeCS.getCheck().add(child);
				if(child.isResult()) {
					found = true;
					break;
				}
			}
			if (found) {
				typeCS.setResult(true);
			}
			if (!found) {
				return result;
			}
		}
		allCCheck.setResult(true);
		CompositeCheck isExprCheck = (new IsExpressedInstanceOfExcludedCommand()).compute(type, instance); 
		result.getCheck().add(isExprCheck);
		if (!isExprCheck.isResult()) {
			return result;
		}
		result.setResult(true);
		return result;
	}

	private CompositeCheck propertyConformsConnection(Connection type,
			Connection instance) {
		CompositeCheck result = reasoner.createCompositeCheck("PropertyConformance[Connection]", instance, type, instance.getName()+".propertyConformsConnection("+type.getName()+")");
		CompositeCheck clabCheck = propertyConformsClabject(type, instance);
		result.getCheck().add(clabCheck);
		if (!clabCheck.isResult()) {
			return result;
		}
		CompositeCheck multCheck = (new MultiplicityConformsCommand()).compute(type); 
		result.getCheck().add(multCheck);	
		if (!multCheck.isResult()) {
			return result;
		}
		CompositeCheck allRoles = reasoner.createCompositeCheck("allRoleNames", instance, type, "dei mudda");
		result.getCheck().add(allRoles);
		for(String rN:type.getRoleName()) {
			CompositeCheck oneRole = compute(type.getParticipantForRoleName(rN), instance.getParticipantForRoleName(rN));
			allRoles.getCheck().add(oneRole);
			if (!oneRole.isResult()) {
				return result;
			}
			oneRole.setResult(true);
		}
		allRoles.setResult(true);
		result.setResult(true);
		return result;
	}
}