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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Role;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.Pair;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.ReasoningServiceUtil;

public class PropertyConformsCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.propertyconformscommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	Set<Pair<Clabject,Clabject>> marks = null;
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		marks = null;
		Clabject type = (Clabject)event.getObjectParameterForExecution("type");
		Clabject instance = (Clabject)event.getObjectParameterForExecution("instance");
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Property Conformance " + ReasoningServiceUtil.getDateString());
		Check check = compute(type, instance);
		resultModel.getChildren().add(check);

		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	private Set<Pair<Clabject, Clabject>> getMarks() {
		if (marks == null)
			marks = new HashSet<Pair<Clabject, Clabject>>();
		return marks;
	}
	
	protected Check compute(Clabject type, Clabject instance) {
		Set<Pair<Clabject, Clabject>> marks = getMarks();
		Pair<Clabject, Clabject> pair = new Pair<Clabject, Clabject>(type, instance);
		if (marks.contains(pair)) {
			Check cachedResult = ReasoningResultFactory.eINSTANCE.createCheck(instance, type, null);
			cachedResult.setName("PropertyConformance[Cached]");
			cachedResult.setExpression(instance.represent() + ".propertyConforms(" + type.represent() + ")");
			cachedResult.setResult(true);
			return cachedResult;
		}
		marks.add(pair);
		Check result = propertyConforms(type, instance);
		return result; 
	}
	
	private Check propertyConforms(Clabject type, Clabject instance) {
		Check child = null;
		if (type instanceof Connection && instance instanceof Connection) {
			child = propertyConformsConnection((Connection) type, (Connection) instance);
		} else if (type instanceof Entity && instance instanceof Entity) {
			child = propertyConformsClabject(type, instance);
		} else {
			child = ReasoningResultFactory.eINSTANCE.createCheck();
			child.setName("MissMatching Types");
		}
		return child;
	}
	
	private Check propertyConformsClabject(Clabject type, Clabject instance) {
		//FIXME
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();//("PropertyConformance[Clabject]", instance, type, instance.represent()+".propertyConformsClabject("+type.represent()+")");
		result.setName("Property Conformance[Clabject]");
		Check neighbour = (new NeighbourhoodConformsCommand()).compute(type, instance);
		result.getChildren().add(neighbour);
		if (!neighbour.isResult()) {
			return result;
		}
		Check allCCheck = ReasoningResultFactory.eINSTANCE.createCheck(instance, type, result);
		//TODO: expression for check with roles
		allCCheck.setName("Relationships");
		allCCheck.setResult(true);
		for (Role rT: type.getAllNavigationsAsDestination()) {
			Check roleCheck = ReasoningResultFactory.eINSTANCE.createCheck();
			roleCheck.setName(rT.represent());
			//TODO: expression
			roleCheck.setResult(true);
			if (rT.getLower() > 0) {
				boolean found = false;
				for (Role rI: instance.getAllNavigationsAsDestination()) {
					if (rI.conforms(rT)) {
						Check actualCheck = ReasoningResultFactory.eINSTANCE.createCheck();
						actualCheck.setName(rI.represent());
						//TODO: expression
						Check connectionCheck = compute(rT.getConnection(), rI.getConnection());
						if (connectionCheck.isResult()) {
							found = true;
							actualCheck.setResult(true);
							break;
						}
					}
				}
				if (!found) {
					roleCheck.setResult(false);
					allCCheck.setResult(false);
				}
			}
		}
		Check isExprCheck = (new IsExpressedInstanceOfExcludedCommand()).compute(type, instance); 
		result.getChildren().add(isExprCheck);
		if (!isExprCheck.isResult()) {
			return result;
		}
		result.setResult(true);
		return result;
	}

	private Check propertyConformsConnection(Connection type,
			Connection instance) {
		//FIXME
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();//("PropertyConformance[Connection]", instance, type, instance.represent()+".propertyConformsConnection("+type.represent()+")");
		result.setName("Property Conformance[Connection]");
		Check clabCheck = propertyConformsClabject(type, instance);
		result.getChildren().add(clabCheck);
		if (!clabCheck.isResult()) {
			return result;
		}
		Check multCheck = (new MultiplicityConformsCommand()).compute(type); 
		result.getChildren().add(multCheck);	
		if (!multCheck.isResult()) {
			return result;
		}
		//FIXME
		Check allRoles = ReasoningResultFactory.eINSTANCE.createCheck();//("Type Roles", instance, type, "dei mudda");
		result.getChildren().add(allRoles);
		for (Role rT: type.getRole()) {
			Check oneRole = ReasoningResultFactory.eINSTANCE.createCheck();
			oneRole.setName(rT.represent());
			allRoles.getChildren().add(oneRole);
			for (Role rI : instance.getRole()) {
				if (rI.conforms(rT)) {
					Check actualCheck = compute(rT.getDestination(), rI.getDestination());
					oneRole.getChildren().add(actualCheck);
					if (actualCheck.isResult()) {
						oneRole.setResult(true);
					}
				}
			}
			if (!oneRole.isResult()) {
				return result;
			} 
		}
		allRoles.setResult(true);
		result.setResult(true);
		return result;
	}
}