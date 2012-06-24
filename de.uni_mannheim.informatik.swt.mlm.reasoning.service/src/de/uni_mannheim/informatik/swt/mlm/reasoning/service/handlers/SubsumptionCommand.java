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
		Model model = null;
		try {
			model = (Model) event.getObjectParameterForExecution("model");
		} catch(Exception e) {
			e.printStackTrace();
		}
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
		Information potentialPairs = ReasoningResultFactory.eINSTANCE.createInformation(model, "potential Pairs", result);
		Information foundPairs = ReasoningResultFactory.eINSTANCE.createInformation(model, "accepted pairs", result);
		Information rejectedPairs = ReasoningResultFactory.eINSTANCE.createInformation(model, "rejected Pairs", result);
		Check currentPair;
		// The found Pairs
		List<Pair<Clabject,Clabject>> pairs = new ArrayList<Pair<Clabject,Clabject>>();
		List<Pair<Clabject,Clabject>> potentials = new ArrayList<Pair<Clabject,Clabject>>();
		int count = 0;
		
		for (Clabject one: clabjects) {
			for (Clabject other : clabjects) {
				// If the clabjects are the same, the case is trivial, so don't bother
				if (!one.equals(other)) {
					Clabject potSubtype = other;
					Clabject potSupertype = one;
					if (potSubtype.getModelSupertypes().contains(potSupertype)) {
						continue;
					}
					if (potSubtype.getModelDisjointSiblings().contains(potSupertype)) {
						continue;
					}
					if (!potSubtype.eClass().equals(potSupertype.eClass())) {
						continue;
					}
					potentials.add(new Pair<Clabject,Clabject>(potSupertype,potSubtype));
					ReasoningResultFactory.eINSTANCE.createInformation(model, potSupertype.represent() + "<-" + potSubtype.represent(), potentialPairs);
				}
			}
		}
		for (Pair<Clabject,Clabject> potential: potentials) {
			Clabject potSubtype = potential.getSecond();
			Clabject potSupertype = potential.getFirst();
			// The actual subsumption check
			 currentPair = compute(potSupertype, potSubtype);
			 count++;
			// handle a success
			 if (currentPair.isResult()) {
				 pairs.add(potential);
				 Information temp = ReasoningResultFactory.eINSTANCE.createInformation(model, potSupertype.represent() + "<-" + potSubtype.represent(), foundPairs);
				 temp.getChildren().add(currentPair);
			 } else {
				 Information temp = ReasoningResultFactory.eINSTANCE.createInformation(model, potSupertype.represent() + "<-" + potSubtype.represent(), rejectedPairs);
				 temp.getChildren().add(currentPair);
			 }
		}
		performedChecks.setMessage("Performed Checks: " + count);
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
		clabject.setName("Subsumtion[Clabject]");
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
		roles.setName("Roles");
		result.getChildren().add(roles);
		for (Role rsuper: supertype.getAllRoles()) {
			Check role = ReasoningResultFactory.eINSTANCE.createCheck();
			role.setName(rsuper.represent());
			roles.getChildren().add(role);
			boolean found = false;
			for (Role rsub: subtype.getAllRoles()) {
				if (rsub.conforms(rsuper)) {
					ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Conforming Role:"+rsub.represent(), role);
					// Now for the destination
					Check destination = compute(rsuper.getDestination(), rsub.getDestination());
					role.getChildren().add(destination);
					if (destination.isResult()) {
						found = true;
						break;
					}
				}
				ReasoningResultFactory.eINSTANCE.createInformation(supertype, "NOT Conforming Role:"+rsub.represent(), role);
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
		// Check that they are on the same level
		Check levelCheck = ReasoningResultFactory.eINSTANCE.createCheck(supertype, subtype, result);
		levelCheck.setExpression("same Level");
		levelCheck.setName("same Level");
		if (supertype.getLevel() == subtype.getLevel()) levelCheck.setResult(true);
		if (!levelCheck.isResult())
			return result;
		// If there is already information preventing that generalization, use it
		// Bogous call on an already modeled one
		if (supertype.getModelSubtypes().contains(subtype)) {
			ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Already Modelled", result);
			result.setResult(true);
			return result;
		}
		// Bogous call creating a circle
		if (subtype.getModelSubtypes().contains(supertype)) {
			ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Opposite Already Modeled", result);
			return result;
		}
		// If they are disjoint, they cannot be sub and supertype
		if (supertype.getModelDisjointSiblings().contains(subtype)) {
			ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Disjoint Siblings", result);
			return result;
		}
		// Check the features
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
		//Check the navigations
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
					if (rsub.conforms(rsuper)) {
						// Now for the destination
						Check destination = compute(rsuper.getDestination(), rsub.getDestination());
						navigationCheck.getChildren().add(destination);
						if (destination.isResult()) {
							found = true;
							break;
						}
					}
					ReasoningResultFactory.eINSTANCE.createInformation(supertype, "NOT Conforming Role:"+rsub.represent(), navigationCheck);
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

	
	
}