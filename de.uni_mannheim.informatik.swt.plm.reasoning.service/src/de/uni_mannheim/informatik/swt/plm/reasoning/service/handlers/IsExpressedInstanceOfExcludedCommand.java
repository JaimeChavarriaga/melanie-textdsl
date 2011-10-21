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

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.Predicate;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class IsExpressedInstanceOfExcludedCommand extends AbstractHandler {

	//TODO: Register as command and fill in ID here
	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.isexpressedinstanceofexcludedconformscommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getObjectParameterForExecution("type");
		Clabject instance = (Clabject)event.getObjectParameterForExecution("instance");
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		CompositeCheck check = compute(type, instance);

		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected CompositeCheck compute(Clabject type, Clabject instance) {
		return isExpressedInstanceOfExcluded(type, instance);
	}
	
	private CompositeCheck isExpressedInstanceOfExcluded(Clabject type,
			final Clabject instance) {
		ExpressedInstanceExcludedCheck result = ReasoningResultFactory.eINSTANCE.createExpressedInstanceExcludedCheck(instance, type, null);
		Set<Classification> classifications = new HashSet<Classification>(instance.getModel().getAllClassifications());
		classifications = (Set<Classification>) ReasoningServiceUtil.filter(classifications, new Predicate<Classification>() {
			public boolean apply(Classification inst) {
				if (inst.isExpressed())
					return inst.getInstance().equals(instance);
				return false;
			}
		});
		Set<Clabject> expressedTypes = new HashSet<Clabject>();
		Set<Clabject> temp = new HashSet<Clabject>();
		for (Classification inst: classifications) {
			temp.add(inst.getType());
		}
		for (Clabject current: temp) {
			expressedTypes.add(current);
			expressedTypes.addAll(current.getModelSupertypes());
		}
		result.getExpressedTypes().addAll(expressedTypes);
		
		Set<Clabject> disjointTwins = new HashSet<Clabject>();
		Set<Generalization> generalizationsA = new HashSet<Generalization>(type.getModel().getAllGeneralizations());
		System.out.println(generalizationsA);
		generalizationsA = (Set<Generalization>) ReasoningServiceUtil.filter(generalizationsA, new Predicate<Generalization>() {
			public boolean apply(Generalization gener) {
				if (gener.getDisjoint() == null)
					return false;
				return gener.getDisjoint();
			}
		});
		Set<Generalization> generalizations = new HashSet<Generalization>(generalizationsA); 
		for (Generalization gener:generalizations) {
			if(ReasoningServiceUtil.intersect(new HashSet<Clabject>(gener.getSubtype()), expressedTypes).size() > 0) {
				disjointTwins.addAll(gener.getSubtype());
			}
		}
		
		temp = new HashSet<Clabject>();
		for (Clabject current : disjointTwins) {
			temp.add(current);
			temp.addAll(current.getModelSupertypes());
		}
		disjointTwins = new HashSet<Clabject>(temp);
		disjointTwins.removeAll(expressedTypes);
		result.getDisjointSiblings().addAll(disjointTwins);
		
		Set<Clabject> conflicts = new HashSet<Clabject>();
		conflicts.add(type);
		conflicts.addAll(type.getModelSupertypes());
		result.getAffectedTypes().addAll(conflicts);
		result.getAffectedDisjointIntersection().addAll(ReasoningServiceUtil.intersect(disjointTwins, conflicts));
		result.setResult(true);
		if (disjointTwins.size() > 0 && conflicts.size() > 0) {
			//There have to be both disjoint Twins and possibly conflicting expressed types to justify the check.
			if (ReasoningServiceUtil.intersect(disjointTwins, conflicts).size() > 0){
				result.setResult(false);
			}
		}
		return result;
	}

	
}