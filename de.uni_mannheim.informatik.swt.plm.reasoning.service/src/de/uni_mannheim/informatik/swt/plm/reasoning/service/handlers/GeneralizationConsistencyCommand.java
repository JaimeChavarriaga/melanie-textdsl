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

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.DomainSearch;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class GeneralizationConsistencyCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.generalizationconsistencycommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		Element element = (Element)event.getObjectParameterForExecution("generalization");
		CompositeCheck check = compute(element);
		resultModel.getCheck().add(check);
		
		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected CompositeCheck compute(Element el) {
		
		if (!(el instanceof Generalization))
			throw new IllegalArgumentException();
		
		return generalizationIsConsistent((Generalization) el);
	}

	private CompositeCheck generalizationIsConsistent(Generalization gener) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck(gener, gener, null);
		check.setName("Consistency[Generalization]");
		check.setExpression(gener.getName());
		check.setResult(true);
		List<Clabject> subtype = gener.getSubtype();
		List<Clabject> supertype = gener.getSupertype();
		Model classified = gener.getModel().getClassifiedModel();
		if (classified == null) {
			//If there is nothing classified, the generalization cannot make a false statement
			//TODO This view may not be shared by Colin and needs to be changed if so
			return check;
		}
		List<Clabject> domain = classified.getAllClabjects();
		Set<Clabject> superInstances = new HashSet<Clabject>();
		boolean complex = false;
		if (gener.isDisjoint() || gener.isComplete()) { 
			//There has to be one supertype and more than one subtype
			complex = true;
			if ( (subtype.size()<= 1) || (supertype.size() != 1)) {
				throw new RuntimeException("Generalization " + gener + " not well formed. So no can do consistency Check."); 
			}
			DomainSearch domainSearch = ReasoningResultFactory.eINSTANCE.createDomainSearch(gener, gener, check);
			domainSearch.setName("domainSearch");
			domainSearch.setResult(true);
			Clabject s = supertype.get(0);
			for (Clabject c:classified.getAllClabjects()) {
				CompositeCheck domainC = (new IsonymCommand()).compute(s, c);
				domainSearch.getCheck().add(domainC);
				if (domainC.isResult()) {
					superInstances.add(c);
					domainSearch.getSupertypeIsonyms().add(c);
				}
			}
			//Now for the actual claims
			if (gener.isComplete()) {
				//There can be no superinstance that is not an instance of any of the subtypes
				CompositeCheck completeCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(gener, gener, check);
				completeCheck.setName("CompleteViolation");
				completeCheck.setResult(true);
				for (Clabject i:superInstances) {
					boolean found = false;
					for (Clabject su:subtype) {
						CompositeCheck actualC = (new IsonymCommand()).compute(su,i);
						completeCheck.getCheck().add(actualC);
						if (actualC.isResult()) {
							domainSearch.getInterestingInstances().add(i);
							found = true;
							break;
						}
					}
					if (!found) {
						completeCheck.setResult(false);
						check.setResult(false);
						return check;
					}
				}
			}
			if (gener.isDisjoint()) {
				CompositeCheck disjointCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(gener, gener, check);
				disjointCheck.setName("DisjointViolation");
				disjointCheck.setResult(true);
				for (Clabject i: superInstances) {
					boolean one = false;
					for (Clabject su:subtype) {
						CompositeCheck actualC = (new IsonymCommand()).compute(su,i);
						disjointCheck.getCheck().add(actualC);
						if (actualC.isResult()) {
							if (!one) {
								one = true;
							} else {
								domainSearch.getInterestingInstances().add(i);
								disjointCheck.setResult(false);
								check.setResult(false);
								return check;
							}
						}
					}
				}
			}
		}
		if (gener.isIntersection()) {
			complex = true;
			CompositeCheck domainSearch = ReasoningResultFactory.eINSTANCE.createCompositeCheck(gener, gener, check);
			domainSearch.setName("InstanceDomainSearch");
			for (Clabject i: domain) {
				boolean all = true;
				for (Clabject s: supertype) {
					CompositeCheck domainC = (new IsonymCommand()).compute(s,i);
					domainSearch.getCheck().add(domainC);
					if (!domainC.isResult()) {
						all = false;
						break;
					}
				}
				if (all) {
					superInstances.add(i);
				}
			}
			//Assume that the length of the subtypes is 1
			if (subtype.size() != 1) {
				throw new RuntimeException("ConsistencyCommand.generalizationIsConsistent multipleGeneralization must have one subtype");
			} else {
				CompositeCheck violationCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(gener, gener, check);
				violationCheck.setName("IntersectionViolation");
				violationCheck.setResult(true);
				Clabject sub = subtype.get(0);
				for (Clabject i: superInstances) {
					CompositeCheck actualC = (new IsonymCommand()).compute(sub, i);
					violationCheck.getCheck().add(actualC);
					if (!actualC.isResult()) {
						violationCheck.setResult(false);
						check.setResult(false);
						return check;
					}
				}
			}
		}
		if (!complex) {
			CompositeCheck informational = ReasoningResultFactory.eINSTANCE.createCompositeCheck(gener, gener, check);
			informational.setName("No complex claims.");
			informational.setResult(true);
		}
		return check;
	}
}