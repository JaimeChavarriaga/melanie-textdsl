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
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.edit.command.SetCommand;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.model.PLMTransactionService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Information;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;

public class GeneralizationBooleanTraitCommand extends AbstractHandler {
	
	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.generalizationrealizationcommand";
	IReasoningService reasoner = (new ReasoningService()).Instance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Generalization Realization " + ReasoningServiceUtil.getDateString());
		Check check = null;
		Generalization gener = (Generalization) event.getObjectParameterForExecution("generalization");  
		check = compute(gener);
		resultModel.getChildren().add(check);		
		
		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		return check.isResult();
	}

	Check compute(Generalization gener) {
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setName("Generalization Boolean Trait Detection");
		result.setResult(true);
		PLMTransactionService pts = new PLMTransactionService(gener.getModel(), "Generalization Boolean Trait Detection");
		ReasoningResultFactory.eINSTANCE.createInformation(gener, "Generalization: " + gener.represent(), result);
		Model model = gener.getModel();
		Model classifiedModel = model.getClassifiedModel();
		if (classifiedModel == null) {
			ReasoningResultFactory.eINSTANCE.createInformation(model, "No classified Model", result);
			result.setResult(false);
			return result;
		} 
		List<Clabject> instances = classifiedModel.getAllClabjects();
		// Detect the type of generalization
		if (gener.getSupertype().size()>1) {
			// Multiple Generalization, check for intersection
			Information intersectionInformation = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Intersection", result);
			Information subtypeInstancesInformation = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Subtype Instances", intersectionInformation);
			Information checkInformation = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Checks", intersectionInformation);
			Set<Clabject> subtypeInstances = new HashSet<Clabject>();
			Clabject subtype = gener.getSubtype().get(0); //Assuming the Well-formedness
			ReasoningResultFactory.eINSTANCE.createInformation(gener, "Subtype: " + subtype.represent(), intersectionInformation);
			for (Clabject possible: instances) {
				Check tempCheck = new InstanceCommand().compute(subtype, possible);
				checkInformation.getChildren().add(tempCheck);
				if (tempCheck.isResult()) {
					subtypeInstances.add(possible);
					ReasoningResultFactory.eINSTANCE.createInformation(gener, possible.represent(), subtypeInstancesInformation);
				}
			}
			//Now there must not exist an instance of all the supertypes that is not an instance of the subtype
			Information allSupertypeInstancesInformation = ReasoningResultFactory.eINSTANCE.createInformation(gener, "All Supertype Instances", intersectionInformation);
			Information superCheckInformation = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Checks", allSupertypeInstancesInformation);
			Set<Clabject> allSupertypeInstances = new HashSet<Clabject>();
			for (Clabject possible: instances)  {
				boolean notAll = false;
				for (Clabject supertype: gener.getSupertype()) {
					Check temp = new InstanceCommand().compute(supertype, possible);
					superCheckInformation.getChildren().add(temp);
					if (!temp.isResult()) {
						notAll = true;
						break;
					}
				}
				if (!notAll) {
					allSupertypeInstances.add(possible);
				}
			}
			// Now search for an instance negating it or set it to true otherwise
			boolean intersection = true;
			Information negationInformation = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Instances negating intersection", intersectionInformation);
			for (Clabject allSuper: allSupertypeInstances) {
				if (!subtypeInstances.contains(allSuper)) {
					intersection = false;
					ReasoningResultFactory.eINSTANCE.createInformation(gener, allSuper.represent(), negationInformation);
				}
			}
			pts.changeModelElementValue(gener, PLMPackage.eINSTANCE.getGeneralization__IsIntersection(), intersection);
		} else if (gener.getSubtype().size()>1) {
			// Multiple Specialization, check for disjoint and complete
			Information disjointInformation = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Disjoint", result);
			Information completeInformation = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Complete", result);
			Information supertypeInstancesInformation = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Supertype Instances", result);
			Information checkInformation = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Checks", result);
			Set<Clabject> supertypeInstances = new HashSet<Clabject>();
			Clabject supertype = gener.getSupertype().get(0); //Assuming the Well-formedness
			ReasoningResultFactory.eINSTANCE.createInformation(gener, "Supertype: " + supertype.represent(), result);
			for (Clabject possible: instances) {
				Check temp = new InstanceCommand().compute(supertype, possible);
				checkInformation.getChildren().add(temp);
				if (temp.isResult()) {
					supertypeInstances.add(possible);
					ReasoningResultFactory.eINSTANCE.createInformation(gener, possible.represent(), supertypeInstancesInformation);
				}
			}
			//disjoint: None of these can be an instance of more than one subtype
			boolean disjoint = true;
			Information negatingDisjointInformation = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Negating Supertype Instances", disjointInformation);
			for (Clabject superInstance: supertypeInstances) {
				int count = 0;
				for (Clabject subtype: gener.getSubtype()) {
					Check temp = new InstanceCommand().compute(subtype, superInstance);
					checkInformation.getChildren().add(temp);
					if (temp.isResult()) {
						count++;
					}
				}
				if (count > 1) {
					ReasoningResultFactory.eINSTANCE.createInformation(gener, superInstance.represent(), negatingDisjointInformation);
					disjoint = false;
				}
			}
			pts.changeModelElementValue(gener, PLMPackage.eINSTANCE.getGeneralization_Disjoint(), disjoint);
		} else {
			// Binary, nothing to do here but to reset the traits
			
		}
		pts.execute();
		return result;
	}
	
	

}
