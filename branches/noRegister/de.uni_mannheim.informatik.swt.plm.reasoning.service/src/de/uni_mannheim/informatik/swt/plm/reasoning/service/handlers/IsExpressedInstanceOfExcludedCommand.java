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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.Predicate;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class IsExpressedInstanceOfExcludedCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.propertyconformscommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getParameters().get("type");
		Clabject instance = (Clabject)event.getParameters().get("instance");
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		CompositeCheck check = compute(type, instance);
		reasoner.getReasoningHistory().add(resultModel);
		return check.isResult();
	}
	
	protected CompositeCheck compute(Clabject type, Clabject instance) {
		return isExpressedInstanceOfExcluded(type, instance);
	}
	
	private CompositeCheck isExpressedInstanceOfExcluded(Clabject type,
			final Clabject instance) {
		ExpressedInstanceExcludedCheck result = ReasoningResultFactory.eINSTANCE.createExpressedInstanceExcludedCheck();
		Set<Instantiation> classifications = new HashSet<Instantiation>(instance.getModel().getAllInstantiations());
		classifications = (Set<Instantiation>) ReasoningServiceUtil.filter(classifications, new Predicate<Instantiation>() {
			public boolean apply(Instantiation inst) {
				if (inst.isExpressed())
					return inst.getInstance().equals(instance);
				return false;
			}
		});
		Set<Clabject> expressedTypes = new HashSet<Clabject>();
		Set<Clabject> temp = new HashSet<Clabject>();
		for (Instantiation inst: classifications) {
			temp.add(inst.getType());
		}
		for (Clabject current: temp) {
			expressedTypes.add(current);
			expressedTypes.addAll(current.getModelSupertypes());
		}
		result.getExpressedTypes().addAll(expressedTypes);
		
		Set<Clabject> disjointTwins = new HashSet<Clabject>();
		Set<Generalization> generalizationsA = new HashSet<Generalization>(type.getModel().getAllGeneralizations());
		generalizationsA = (Set<Generalization>) ReasoningServiceUtil.filter(generalizationsA, new Predicate<Generalization>() {
			public boolean apply(Generalization gener) {
				if (gener instanceof MultipleSpecialization) 
					return ((MultipleSpecialization) gener).isDisjoint();
				return false;
			}
		});
		Set<MultipleSpecialization> generalizations = new HashSet<MultipleSpecialization>((Collection<? extends MultipleSpecialization>) generalizationsA); 
		for (MultipleSpecialization gener:generalizations) {
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
		if (ReasoningServiceUtil.intersect(disjointTwins, conflicts).size() > 0){
			result.setResult(true);
			return result;
		}
		
		return result;
	}

	
}