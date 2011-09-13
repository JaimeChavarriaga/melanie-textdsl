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
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class ConsistencyCommand extends AbstractHandler {

	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		Element element = (Element)event.getParameters().get("element");
		CompositeCheck check = compute(element);
		resultModel.getCheck().add(check);
		reasoner.getReasoningHistory().add(resultModel);
		return check.isResult();
	}
	
	protected CompositeCheck compute(Element el) {
		if (el instanceof Ontology) {
			return ontologyIsConsistent((Ontology) el);
		} else if (el instanceof Generalization) {
			return generalizationIsConsistent((Generalization) el);
		} else if (el instanceof Instantiation) {
			return classificationIsConsistent((Instantiation) el);
		}
		System.out.println("Unknown Consistency Type " + el);
		return null;
	}

	private CompositeCheck classificationIsConsistent(Instantiation inst) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck(inst, inst, null);
		check.setName("Consistency[Classification]");
		check.setResult(true);
		Clabject instance = inst.getInstance();
		Clabject type = inst.getType();
		CompositeCheck instanceCheck = (new InstanceCommand()).compute(type, instance);
		check.getCheck().add(instanceCheck);
		if (!instanceCheck.isResult()) {
			check.setResult(false);
			return check;
		}
		CompositeCheck kindCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(inst, inst, check);
		kindCheck.setName("Kind Instance");
		kindCheck.setResult(true);
		if (inst.getKind().equals(ClassificationKind.ISONYM) || inst.getKind().equals(ClassificationKind.INSTANTIATION)) {
			kindCheck.setName("Kind Isonym");
			CompositeCheck isonymCheck = (new IsonymCommand()).compute(type, instance);
			kindCheck.getCheck().add(isonymCheck);
			if (!isonymCheck.isResult()) {
				kindCheck.setResult(false);
				check.setResult(false);
				return check;
			}
		} else if (inst.getKind().equals(ClassificationKind.HYPONYM)) {
			kindCheck.setName("Kind Hyponym");
			CompositeCheck hyponymCheck = (new HyponymCommand()).compute(type, instance);
			kindCheck.getCheck().add(hyponymCheck);
			if (!hyponymCheck.isResult()) {
				kindCheck.setResult(false);
				check.setResult(false);
				return check;
			}
		}
		// We don't need to check instance as we would already have returned if that was not the case
		return check;
	}

	private CompositeCheck generalizationIsConsistent(Generalization gener) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck(gener, gener, null);
		check.setName("Consistency[Generalization]");
		check.setExpression(gener.getName());
		check.setResult(true);
		List<Clabject> subtype = gener.getSubtypes();
		List<Clabject> supertype = gener.getSupertypes();
		Model classified = gener.getModel().getClassifiedModel();
		if (classified == null) {
			//If there is nothing classified, the generalization cannot make a false statement
			//TODO This view may not be shared by Colin and needs to be changed if so
			return check;
		}
		List<Clabject> domain = classified.getAllClabjects();
		Set<Clabject> superInstances = new HashSet<Clabject>();
		
		if (gener instanceof MultipleSpecialization) {
			MultipleSpecialization msGener = (MultipleSpecialization) gener;
			if (msGener.isComplete() || msGener.isDisjoint()) {
				CompositeCheck domainSearch = ReasoningResultFactory.eINSTANCE.createCompositeCheck(gener, gener, check);
				domainSearch.setName("domainSearch");
				for (Clabject s: supertype) {
					for (Clabject i: domain) {
						CompositeCheck domainC = (new IsonymCommand()).compute(s,i);
						domainSearch.getCheck().add(domainC);
						if (domainC.isResult()) {
							superInstances.add(i);
						}
					}
				}
				if (supertype.size() != 1) {
					throw new RuntimeException("ConsistencyCommand.generalizationIsConsistent multipleSpecialization must have one supertype");
				} else {
					if (msGener.isComplete()) {
						CompositeCheck completeCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(gener, gener, check);
						completeCheck.setName("CompleteViolation");
						completeCheck.setResult(true);
						for (Clabject i:superInstances) {
							boolean found = false;
							for (Clabject s:subtype) {
								CompositeCheck actualC = (new IsonymCommand()).compute(s,i);
								completeCheck.getCheck().add(actualC);
								if (actualC.isResult()) {
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
					if (msGener.isDisjoint()) {
						CompositeCheck disjointCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(gener, gener, check);
						disjointCheck.setName("DisjointViolation");
						disjointCheck.setResult(true);
						for (Clabject i: superInstances) {
							boolean one = false;
							for (Clabject s:subtype) {
								CompositeCheck actualC = (new IsonymCommand()).compute(s,i);
								disjointCheck.getCheck().add(actualC);
								if (actualC.isResult()) {
									if (!one) {
										one = true;
									} else {
										disjointCheck.setResult(false);
										check.setResult(false);
										return check;
									}
								}
							}
						}
					}
				}
			}
		}
		if (gener instanceof MultipleGeneralization) {
			MultipleGeneralization mgGener = (MultipleGeneralization) gener;
			if (mgGener.isIntersection()) {
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
		}
		return check;
	}

	private CompositeCheck ontologyIsConsistent(Ontology el) {
		// TODO Auto-generated method stub
		return null;
	}
	


	
}