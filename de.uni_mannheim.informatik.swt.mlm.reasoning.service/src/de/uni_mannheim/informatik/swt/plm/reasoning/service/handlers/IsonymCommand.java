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

import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.PotencyComparison;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;

public class IsonymCommand extends AbstractHandler {
	
	//TODO: Register as command and fill in ID here
	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.isonymcommand";
		
	IReasoningService reasoner = new ReasoningService().Instance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getObjectParameterForExecution("type");
		Clabject instance = (Clabject)event.getObjectParameterForExecution("instance");
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
		return isIsonym(type, instance);
	}
	
	private CompositeCheck isIsonym(Clabject type, Clabject instance) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, null);
		check.setName("IsIsonym");
		boolean result = true;
		CompositeCheck propertyConforms = (new PropertyConformsCommand()).compute(type, instance);
		check.getCheck().add(propertyConforms);
		if (!propertyConforms.isResult()) {
			result = false;
		}
		CompositeCheck additionalFeatures = (new HasAdditionalPropertiesCommand()).compute(type, instance);
		additionalFeatures.setPassedIconResult(false);
		additionalFeatures.setName("does NOT have additional properties");
		check.getCheck().add(additionalFeatures);
		if (additionalFeatures.isResult()) {
			result = false;
		}
		PotencyComparison potencyCheck = ReasoningResultFactory.eINSTANCE.createPotencyComparison(instance, type, check);
		potencyCheck.setInstancePotency(instance.getPotency());
		potencyCheck.setTargetPotency(type.getPotency());
		potencyCheck.setResult(true);
		if (type.getPotency() != -1) {
			if (instance.getPotency() == -1) {
				result = false;
				potencyCheck.setResult(false);
			} else if (instance.getPotency() + 1 != type.getPotency()){
				result = false;
				potencyCheck.setResult(false);
			}
		}
		check.setResult(result);
		return check;
	}

}
