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
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Role;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.Pair;

public class SubsumptionCommand extends AbstractHandler {

	public static final String ID_SUBSUMPTION = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.subsumptioncommand";
	public static final String ID_ISSUBTYPE = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.isSubtype";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	Set<Pair<Clabject,Clabject>> marks = null;
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		marks = null;
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		CompositeCheck check = null;
		
		Model model = (Model) event.getObjectParameterForExecution("model");
		if (model == null) {
			Clabject supertype = (Clabject)event.getObjectParameterForExecution("supertype");
			Clabject subtype = (Clabject)event.getObjectParameterForExecution("subtype");
			check = compute(supertype,subtype);
		} else {
			check = compute(model);
		}
		resultModel.getCheck().add(check);		
		
		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	private CompositeCheck compute(Model model) {
		List<Clabject> clabjects = model.getAllClabjects();
		CompositeCheck result = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		result.setName("Model Subsumption");
		for (Clabject one: clabjects) {
			for (Clabject other : clabjects) {
				result.getCheck().add(compute(one, other));
			}
		}
		result.setResult(true);
		return result;
	}

	private Set<Pair<Clabject, Clabject>> getMarks() {
		if (marks == null)
			marks = new HashSet<Pair<Clabject, Clabject>>();
		return marks;
	}
	
	protected CompositeCheck compute(Clabject supertype, Clabject subtype) {
		Set<Pair<Clabject, Clabject>> marks = getMarks();
		Pair<Clabject, Clabject> pair = new Pair<Clabject, Clabject>(supertype, subtype);
		if (marks.contains(pair)) {
			CompositeCheck cachedResult = ReasoningResultFactory.eINSTANCE.createCompositeCheck(subtype, supertype, null);
			cachedResult.setName("Subsumption[Cached]");
			cachedResult.setExpression(subtype.represent() + ".subsume(" + supertype.represent() + ")");
			cachedResult.setResult(true);
			return cachedResult;
		}
		marks.add(pair);
		CompositeCheck result = subsume(supertype, subtype);
		return result; 
	}
	
	private CompositeCheck subsume(Clabject supertype, Clabject subtype) {
		CompositeCheck child = null;
		if (supertype instanceof Connection && subtype instanceof Connection) {
			child = subsumeConnection((Connection) supertype, (Connection) subtype);
		} else if (supertype instanceof Entity && subtype instanceof Entity) {
			child = subsumeClabject(supertype, subtype);
		} else {
//			System.out.println("missmatching types " + type + "|" + instance);
			child = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
			child.setName("MissMatching Types");
		}
		return child;
	}

	private CompositeCheck subsumeConnection(Connection supertype,
			Connection subtype) {
		CompositeCheck result = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		result.setName("Subsumption[Connection]");
		CompositeCheck clabject = subsumeClabject(supertype, subtype);
		result.getCheck().add(clabject);
		if (!clabject.isResult()) {
			return result;
		}
		CompositeCheck order = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		order.setName("Order");
		result.getCheck().add(order);
		order.setResult(supertype.getAllRoles().size() == subtype.getAllRoles().size());
		if (!order.isResult()) {
			return result;
		}
		CompositeCheck roles = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		order.setName("Roles");
		result.getCheck().add(roles);
		for (Role rsuper: supertype.getAllRoles()) {
			CompositeCheck role = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
			order.setName(rsuper.represent());
			result.getCheck().add(role);
			boolean found = false;
			for (Role rsub: subtype.getAllRoles()) {
				CompositeCheck aRole = roleSubtypeConforms(rsuper, rsub);
				role.getCheck().add(aRole);
				if (aRole.isResult()) {
					found = true;
					break;
				}
			}
			if (found) {
				role.setResult(true);
			} else {
				return result;
			}
		}
		roles.setResult(true);
		result.setResult(true);
		return result;
	}

	private CompositeCheck subsumeClabject(Clabject supertype, Clabject subtype) {
		CompositeCheck result = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		result.setName("isSubtype");
		Check levelCheck = ReasoningResultFactory.eINSTANCE.createLevelComparison(supertype, subtype, result);
		levelCheck.setExpression("same Level");
		if (supertype.getLevel() == subtype.getLevel()) levelCheck.setResult(true);
		if (!levelCheck.isResult())
			return result;
		CompositeCheck featuresCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		featuresCheck.setName("Features");
		result.getCheck().add(featuresCheck);
		for (Feature fsuper: supertype.getAllFeatures()) {
			if (fsuper.getDurability() > 0) {
				Feature fsub = subtype.getFeatureForName(fsuper.getName());
				CompositeCheck featureCheck = (new EqualityCommand()).compute(fsuper, fsub);
				featureCheck.setName(fsuper.getName());
				featuresCheck.getCheck().add(featureCheck);
				if (!featureCheck.isResult()) {
					return result;
				}
			}
		}
		featuresCheck.setResult(true);
		CompositeCheck navigationsCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		navigationsCheck.setName("Navigations");
		result.getCheck().add(navigationsCheck);
		for (Role rsuper: supertype.getAllNavigations()) {
			if (rsuper.getConnection().getPotency() > 0) {
				CompositeCheck navigationCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
				navigationCheck.setName(rsuper.represent());
				navigationsCheck.getCheck().add(navigationCheck);
				boolean found = false;
				for (Role rsub: subtype.getAllNavigations()) {
					CompositeCheck aNavCheck = roleSubtypeConforms(rsuper, rsub);
					navigationCheck.getCheck().add(aNavCheck);
					if (aNavCheck.isResult()) {
						found = true;
						break;
					}
				}
				if (found) {
					navigationCheck.setResult(true);
				} else {
					return result;
				}
			}
		}
		navigationsCheck.setResult(true);
		result.setResult(true);
		return result;
	}

	private CompositeCheck roleSubtypeConforms(Role rsuper, Role rsub) {
		CompositeCheck result = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		result.setName(rsub.represent());
		CompositeCheck roleName = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		roleName.setName("RoleName");
		result.getCheck().add(roleName);
		roleName.setResult(rsuper.roleName().equals(rsub.roleName()));
		if (!roleName.isResult()){
			result.setResult(false);
			return result;
		}
		
		CompositeCheck lower = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		lower.setName("Lower");
		result.getCheck().add(lower);
		lower.setResult(rsuper.getLower() <= rsub.getLower());
		if (!lower.isResult()){
			result.setResult(false);
			return result;
		}
		
		CompositeCheck upper = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		upper.setName("Upper");
		result.getCheck().add(upper);
		upper.setResult(rsuper.getUpper() >= rsub.getUpper());
		if (!upper.isResult()){
			result.setResult(false);
			return result;
		}
		
		CompositeCheck navigable = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		navigable.setName("Navigale");
		result.getCheck().add(navigable);
		navigable.setResult(rsuper.isNavigable() == rsub.isNavigable());
		if (!navigable.isResult()){
			result.setResult(false);
			return result;
		}
		
		CompositeCheck destination = compute(rsuper.getDestination(), rsub.getDestination());
		result.getCheck().add(destination);
		if (!destination.isResult()){
			result.setResult(false);
			return result;
		}
		
		CompositeCheck connection = compute(rsuper.getConnection(), rsub.getConnection());
		result.getCheck().add(connection);
		if (!connection.isResult()){
			result.setResult(false);
			return result;
		}
		
		result.setResult(true);
		return result;
	}
	
	
}