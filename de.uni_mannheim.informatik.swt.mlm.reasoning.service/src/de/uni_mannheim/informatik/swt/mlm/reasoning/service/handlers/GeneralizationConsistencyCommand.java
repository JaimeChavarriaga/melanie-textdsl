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
package de.uni_mannheim.informatik.swt.mlm.reasoning.service.handlers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;

public class GeneralizationConsistencyCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.generalizationconsistencycommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Generalization Consistency" + ReasoningServiceUtil.getDateString());
		Element element = (Element)event.getObjectParameterForExecution("generalization");
		Check check = compute(element);
		resultModel.getChildren().add(check);
		
		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected Check compute(Element el) {
		
		if (!(el instanceof Generalization))
			throw new IllegalArgumentException();
		
		return generalizationIsConsistent((Generalization) el);
	}

	private Check generalizationIsConsistent(Generalization gener) {
		Check check = ReasoningResultFactory.eINSTANCE.createCheck(gener, gener, null);
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
			Check domainSearch = ReasoningResultFactory.eINSTANCE.createCheck(gener, gener, check);
			domainSearch.setName("domainSearch");
			domainSearch.setResult(true);
			Clabject s = supertype.get(0);
			for (Clabject c:classified.getAllClabjects()) {
				Check domainC = (new IsonymCommand()).compute(s, c);
				domainSearch.getChildren().add(domainC);
				if (domainC.isResult()) {
					superInstances.add(c);
					//FIXME
					//domainSearch.getSupertypeIsonyms().add(c);
				}
			}
			//Now for the actual claims
			if (gener.isComplete()) {
				//There can be no superinstance that is not an instance of any of the subtypes
				Check completeCheck = ReasoningResultFactory.eINSTANCE.createCheck(gener, gener, check);
				completeCheck.setName("CompleteViolation");
				completeCheck.setResult(true);
				for (Clabject i:superInstances) {
					boolean found = false;
					for (Clabject su:subtype) {
						Check actualC = (new IsonymCommand()).compute(su,i);
						completeCheck.getChildren().add(actualC);
						if (actualC.isResult()) {
							//FIXME
							//domainSearch.getInterestingInstances().add(i);
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
				Check disjointCheck = ReasoningResultFactory.eINSTANCE.createCheck(gener, gener, check);
				disjointCheck.setName("DisjointViolation");
				disjointCheck.setResult(true);
				for (Clabject i: superInstances) {
					boolean one = false;
					for (Clabject su:subtype) {
						Check actualC = (new IsonymCommand()).compute(su,i);
						disjointCheck.getChildren().add(actualC);
						if (actualC.isResult()) {
							if (!one) {
								one = true;
							} else {
								//FIXME
								//domainSearch.getInterestingInstances().add(i);
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
			Check domainSearch = ReasoningResultFactory.eINSTANCE.createCheck(gener, gener, check);
			domainSearch.setName("InstanceDomainSearch");
			for (Clabject i: domain) {
				boolean all = true;
				for (Clabject s: supertype) {
					Check domainC = (new IsonymCommand()).compute(s,i);
					domainSearch.getChildren().add(domainC);
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
				Check violationCheck = ReasoningResultFactory.eINSTANCE.createCheck(gener, gener, check);
				violationCheck.setName("IntersectionViolation");
				violationCheck.setResult(true);
				Clabject sub = subtype.get(0);
				for (Clabject i: superInstances) {
					Check actualC = (new IsonymCommand()).compute(sub, i);
					violationCheck.getChildren().add(actualC);
					if (!actualC.isResult()) {
						violationCheck.setResult(false);
						check.setResult(false);
						return check;
					}
				}
			}
		}
		if (!complex) {
			Check informational = ReasoningResultFactory.eINSTANCE.createCheck(gener, gener, check);
			informational.setName("No complex claims.");
			informational.setResult(true);
		}
		return check;
	}
}