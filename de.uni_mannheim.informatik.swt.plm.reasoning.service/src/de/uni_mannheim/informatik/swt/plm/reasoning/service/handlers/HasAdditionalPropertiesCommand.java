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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Role;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.HasAdditionalPropertiesCheck;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class HasAdditionalPropertiesCommand extends AbstractHandler {
	
	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.hasadditionalpropertiescommand";
	
	IReasoningService reasoner = new ReasoningService().Instance();
	boolean complexNavigationSearch = false;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getParameters().get("type");
		Clabject instance = (Clabject)event.getParameters().get("instance");
		//the command is executed standalone; so we check propertyConformance and not only for the name
		complexNavigationSearch = true;
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		CompositeCheck check = compute(type, instance);
		resultModel.getCheck().add(check);
		
		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected CompositeCheck compute(Clabject type, Clabject instance) {
		return hasAdditionalFeatures(type, instance);
	}
	
	private CompositeCheck hasAdditionalFeatures(Clabject type, Clabject instance) {
		HasAdditionalPropertiesCheck check = ReasoningResultFactory.eINSTANCE.createHasAdditionalPropertiesCheck();
		check.setResult(false);
		check.setName("hasAdditionalProperties");
		check.setExpression("jo..");
		//First search the features
		CompositeCheck featuresCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, check);
		featuresCheck.setName("Features");
		featuresCheck.setExpression("exists pi_i in "+instance.getName()+".getAllFeatures(): nexists pi_t in "+ type.getName() +".getAllFeatures(): pi_i.conformsTo(pi_T)");
		for (Feature i: instance.getAllFeatures()) {
			CompositeCheck featCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, featuresCheck);
			featCheck.setName(i.getName());
			featCheck.setExpression("nexists pi_t in "+type.getName() + ".getAllFeatures(): "+i.getName() + ".conformsTo(pi_T)");
			boolean unique = true;
			for (Feature t: type.getAllFeatures()) {
				CompositeCheck actualFeatCheck = (new FeatureConformsCommand()).compute(t, i);
				featCheck.getCheck().add(actualFeatCheck);
				if (actualFeatCheck.isResult()) {
					unique = false;
					break;
				}
			}
			if (unique) {
				featCheck.setResult(true);
				featuresCheck.setResult(true);
				check.setResult(true);
				return check;
			}
		}
		//Then search for the Connections
		CompositeCheck navigationsCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, check);
		navigationsCheck.setName("Navigations");
		navigationsCheck.setExpression("exists rN in "+instance.getName()+".getAllAssociateRoleNames(): exists ... einiges");
		for (Role rI: instance.getAllNavigations()) {
			CompositeCheck roleCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, navigationsCheck);
			roleCheck.setName(rI.represent());
			boolean found = false;
			for (Role rT: type.getAllNavigations()) {
				boolean roleNameSufficient = false;
				// RoleName sufficiency is given if the roleNames are equal or if the destinations property conform and both roleNames are default
				if (rT.roleName().equals(rI.roleName())) {
					roleNameSufficient = true;
				} else if(rT.hasDefaultRoleName() && rI.hasDefaultRoleName()){
					Check destinationCheck = (new PropertyConformsCommand()).compute(rT.getDestination(), rI.getDestination());
					roleCheck.getCheck().add(destinationCheck);
					//TODO: include in result model
					if (destinationCheck.isResult()) {
						roleNameSufficient = true;
					}
				}
				if (roleNameSufficient) {
					if (rT.isNavigable() == rI.isNavigable()) {
						found = true;
						break;
					}
				}
			}
			if (!found) {
				roleCheck.setResult(true);
				navigationsCheck.setResult(true);
				check.setResult(true);
				return check;
			}
		}
		return check;
	}

}
