/*******************************************************************************
 * Copyright (c) 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.reasoning.service.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.model.PLMTransactionService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.Pair;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Equality;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Role;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Information;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;

public class SubsumptionCommand extends AbstractHandler {

	public static final String ID_SUBSUMPTION = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.subsumptioncommand";
	public static final String ID_ISSUBTYPE = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.isSubtype";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	Map<Pair<Clabject,Clabject>,Boolean> marks = null;
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		marks = null;
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Subsumtion " + ReasoningServiceUtil.getDateString());
		Check check = null;
		
		Model model = (Model) event.getObjectParameterForExecution("model");
		if (model == null) {
			Clabject supertype = (Clabject)event.getObjectParameterForExecution("supertype");
			Clabject subtype = (Clabject)event.getObjectParameterForExecution("subtype");
			check = compute(supertype,subtype);
		} else {
			check = compute(model);
		}
		resultModel.getChildren().add(check);		
		
		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	private Map<Pair<Clabject, Clabject>,Boolean> getMarks() {
		if (marks == null)
			marks = new HashMap<Pair<Clabject, Clabject>,Boolean>();
		return marks;
	}
		
	/**
	 * 
	 * @param model
	 * @return
	 */
	private Check compute(Model model) {
		// All the Clabjects of a model are to be checked
		List<Clabject> clabjects = model.getAllClabjects();
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setName("Subsumption");
		// Info for the reasoning view
		Information processedInfo = ReasoningResultFactory.eINSTANCE.createInformation(model, "Processed Clabjects: " + clabjects.size(), result);
		for (Clabject c: clabjects)
			ReasoningResultFactory.eINSTANCE.createInformation(model, c.represent(), processedInfo);
		// Toplevel nodes for the details
		Information performedChecks = ReasoningResultFactory.eINSTANCE.createInformation(model, "", result);
		Information foundPairs = ReasoningResultFactory.eINSTANCE.createInformation(model, "Found pairs", result);
		Check currentPair;
		// The found Pairs
		List<Pair<Clabject,Clabject>> pairs = new ArrayList<Pair<Clabject,Clabject>>();
		int count = 0;
		for (Clabject one: clabjects) {
			for (Clabject other : clabjects) {
				// If the clabjects are equal, the case is trivial, so don't bother
				if (!one.equals(other)) {
					if (one.getModelSubtypes().contains(other)) {
						currentPair = ReasoningResultFactory.eINSTANCE.createCheck();
						currentPair.setResult(true);
						currentPair.setName("modeled Generalization");
					} else {
						// The actual subsumption check
						 currentPair = compute(one, other);
					}
					 count++;
					 performedChecks.getChildren().add(currentPair);
					 // handle a success
					 if (currentPair.isResult()) {
						 Pair<Clabject,Clabject> pair = new Pair<Clabject,Clabject>(one, other);
						 pairs.add(pair);
					 }
				}
			}
		}
		performedChecks.setMessage("Performed Checks: " + count);
		for (Pair<Clabject,Clabject> pair: pairs) {
			ReasoningResultFactory.eINSTANCE.createInformation(model, pair.getFirst().represent() + "<-" + pair.getSecond().represent(), foundPairs);
		}
		// Inside the newly found pairs, detect the similartiy sets
		Set<Set<Clabject>> similaritySets = ReasoningServiceUtil.computeSimilaritySets(pairs);
		if (similaritySets.size()>0) {
			Information similarityInformation = ReasoningResultFactory.eINSTANCE.createInformation(model, "Similarity Sets", result);
			int index = 0;
			for (Set<Clabject> similaritySet:similaritySets) {
				Information currentSet = ReasoningResultFactory.eINSTANCE.createInformation(model, "" + index++, similarityInformation);
				for (Clabject c: similaritySet) {
					ReasoningResultFactory.eINSTANCE.createInformation(model, c.getName(), currentSet);
				}
			}
		}
		// now create the equalities for each of the sets
		for (Set<Clabject> similaritySet: similaritySets) {
			PLMTransactionService pts = new PLMTransactionService(model, "Similarity Set Equality Creation Transaction");
			Set<Clabject> processed = new HashSet<Clabject>();
			for (Clabject c:similaritySet) {
				for (Clabject other :similaritySet) {
					if (!c.equals(other) && !processed.contains(other) && !ReasoningServiceUtil.containsEquality(model, c, other)) {
						Equality equality = PLMFactory.eINSTANCE.createEquality();
						equality.setBase(c);
						equality.setEqual(other);
						pts.newModelElement(equality);
					}
				}
				processed.add(c);
			}
			pts.execute();
		}
		// for those pairs which are not equal, a generalization can be created
		// the policy is to create generalizations that are not redundant and have the most possible subtypes
		Map<Clabject,Set<Clabject>> generalizationData = new HashMap<Clabject,Set<Clabject>>();
		for (Pair<Clabject,Clabject> pair: pairs) {
			if (!ReasoningServiceUtil.similaritySetsContainPair(similaritySets, pair)) {
				Clabject supertype = pair.getFirst();
				Clabject subtype = pair.getSecond();
				if (!subtype.getModelSupertypes().contains(supertype)) {
					if (!generalizationData.containsKey(supertype)) {
						generalizationData.put(supertype, new HashSet<Clabject>());
					}
					generalizationData.get(supertype).add(subtype);
				}
				
			}
		}
		// And now the creation of the generalizations
		Set<Generalization> generalizations = new HashSet<Generalization>();
		if (generalizationData.size() > 0) {
			PLMTransactionService pts = new PLMTransactionService(model, "Generalization Creation Transaction");
			for (Entry<Clabject,Set<Clabject>> entry:generalizationData.entrySet()) {
				Clabject supertype = entry.getKey();
				Set<Clabject> subtypes = entry.getValue();
				Generalization gener = PLMFactory.eINSTANCE.createGeneralization();
				generalizations.add(gener);
				gener.getSupertype().add(supertype);
				gener.getSubtype().addAll(subtypes);
				pts.newModelElement(gener);
			}
			pts.execute();
		}
		// Because of generalization chains, it is better to realize the generalizations once they are all present
		if (generalizations.size() > 0) {
			Information generRealizationInfo = ReasoningResultFactory.eINSTANCE.createInformation(model, "Generalization Realizations", result);
			for (Generalization gener: generalizations) {
				generRealizationInfo.getChildren().add(new GeneralizationRealizationCommand().compute(gener));
			}
		}
		// TODO  detect generalization boolean traits
		// For the detection of the boolean traits, there has to be a classified domain
		Model classifiedModel = model.getClassifiedModel();
		if (classifiedModel == null) {
			ReasoningResultFactory.eINSTANCE.createInformation(model,"No classified Model", result);
		} else {
			Information booleanTraitInfo = ReasoningResultFactory.eINSTANCE.createInformation(model,"Boolean Trait Reasoning", result);
			for (Generalization gener: generalizations) {
				Check generCheck = new GeneralizationBooleanTraitCommand().compute(gener);
				booleanTraitInfo.getChildren().add(generCheck);
			}
		}
		// necessary administration
		result.setResult(true);
		return result;
	}

	protected Check compute(Clabject supertype, Clabject subtype) {
		getMarks();
		Pair<Clabject, Clabject> pair = new Pair<Clabject, Clabject>(supertype, subtype);
		if (marks.containsKey(pair)) {
			Check cachedResult = ReasoningResultFactory.eINSTANCE.createCheck(subtype, supertype, null);
			cachedResult.setName("Subsumption[Cached]");
			cachedResult.setExpression(subtype.represent() + ".subsume(" + supertype.represent() + ")");
			cachedResult.setResult(marks.get(pair));
			return cachedResult;
		}
		marks.put(pair, true);
		Check result = subsume(supertype, subtype);
		if (!result.isResult()) {
			marks.put(pair, false);
		}
		return result; 
	}
	
	private Check subsume(Clabject supertype, Clabject subtype) {
		Check child = null;
		if (supertype instanceof Connection && subtype instanceof Connection) {
			child = subsumeConnection((Connection) supertype, (Connection) subtype);
		} else if (supertype instanceof Entity && subtype instanceof Entity) {
			child = subsumeClabject(supertype, subtype);
		} else {
			child = ReasoningResultFactory.eINSTANCE.createCheck();
			child.setName("MissMatching Types");
		}
		return child;
	}

	private Check subsumeConnection(Connection supertype,
			Connection subtype) {
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setName("Subsumption[Connection]");
		Check clabject = subsumeClabject(supertype, subtype);
		result.getChildren().add(clabject);
		if (!clabject.isResult()) {
			return result;
		}
		Check order = ReasoningResultFactory.eINSTANCE.createCheck();
		order.setName("Order");
		result.getChildren().add(order);
		order.setResult(supertype.getAllRoles().size() == subtype.getAllRoles().size());
		if (!order.isResult()) {
			return result;
		}
		Check roles = ReasoningResultFactory.eINSTANCE.createCheck();
		order.setName("Roles");
		result.getChildren().add(roles);
		for (Role rsuper: supertype.getAllRoles()) {
			Check role = ReasoningResultFactory.eINSTANCE.createCheck();
			order.setName(rsuper.represent());
			result.getChildren().add(role);
			boolean found = false;
			for (Role rsub: subtype.getAllRoles()) {
				Check aRole = roleSubtypeConforms(rsuper, rsub);
				role.getChildren().add(aRole);
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

	private Check subsumeClabject(Clabject supertype, Clabject subtype) {
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setName("isSubtype");
		result.setExpression(subtype.getName() + ".subsumes(" + supertype.getName() +")");
		Check levelCheck = ReasoningResultFactory.eINSTANCE.createCheck(supertype, subtype, result);
		levelCheck.setExpression("same Level");
		if (supertype.getLevel() == subtype.getLevel()) levelCheck.setResult(true);
		if (!levelCheck.isResult())
			return result;
		Check featuresCheck = ReasoningResultFactory.eINSTANCE.createCheck();
		featuresCheck.setName("Features");
		result.getChildren().add(featuresCheck);
		for (Feature fsuper: supertype.getAllFeatures()) {
			if (fsuper.getDurability() > 0) {
				Feature fsub = subtype.getFeatureForName(fsuper.getName());
				if (fsub == null) {
					ReasoningResultFactory.eINSTANCE.createInformation(fsuper, subtype.represent() + " does not have a feature " + fsuper.getName(),featuresCheck);
					return result;
				}
				Check featureCheck = (new EqualityCommand()).compute(fsuper, fsub);
				featureCheck.setName(fsuper.getName());
				featuresCheck.getChildren().add(featureCheck);
				if (!featureCheck.isResult()) {
					return result;
				}
			}
		}
		featuresCheck.setResult(true);
		Check navigationsCheck = ReasoningResultFactory.eINSTANCE.createCheck();
		navigationsCheck.setName("Navigations");
		result.getChildren().add(navigationsCheck);
		for (Role rsuper: supertype.getAllNavigations()) {
			if (rsuper.getConnection().getPotency() > 0) {
				Check navigationCheck = ReasoningResultFactory.eINSTANCE.createCheck();
				navigationCheck.setName(rsuper.represent());
				navigationsCheck.getChildren().add(navigationCheck);
				boolean found = false;
				for (Role rsub: subtype.getAllNavigations()) {
					Check aNavCheck = roleSubtypeConforms(rsuper, rsub);
					navigationCheck.getChildren().add(aNavCheck);
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

	private Check roleSubtypeConforms(Role rsuper, Role rsub) {
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setName(rsub.represent());
		Check roleName = ReasoningResultFactory.eINSTANCE.createCheck();
		roleName.setName("RoleName");
		result.getChildren().add(roleName);
		roleName.setResult(rsuper.roleName().equals(rsub.roleName()));
		if (!roleName.isResult()){
			result.setResult(false);
			return result;
		}
		
		Check lower = ReasoningResultFactory.eINSTANCE.createCheck();
		lower.setName("Lower");
		result.getChildren().add(lower);
		lower.setResult(rsuper.getLower() <= rsub.getLower());
		if (!lower.isResult()){
			result.setResult(false);
			return result;
		}
		
		Check upper = ReasoningResultFactory.eINSTANCE.createCheck();
		upper.setName("Upper");
		result.getChildren().add(upper);
		upper.setResult(rsuper.getUpper() >= rsub.getUpper());
		if (!upper.isResult()){
			result.setResult(false);
			return result;
		}
		
		Check navigable = ReasoningResultFactory.eINSTANCE.createCheck();
		navigable.setName("Navigale");
		result.getChildren().add(navigable);
		navigable.setResult(rsuper.isNavigable() == rsub.isNavigable());
		if (!navigable.isResult()){
			result.setResult(false);
			return result;
		}
		
		Check destination = compute(rsuper.getDestination(), rsub.getDestination());
		result.getChildren().add(destination);
		if (!destination.isResult()){
			result.setResult(false);
			return result;
		}
		
		Check connection = compute(rsuper.getConnection(), rsub.getConnection());
		result.getChildren().add(connection);
		if (!connection.isResult()){
			result.setResult(false);
			return result;
		}
		
		result.setResult(true);
		return result;
	}
	
}