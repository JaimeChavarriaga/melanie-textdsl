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
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.ReasoningServiceUtil;

public class IsonymCommand extends AbstractHandler {
	
	//TODO: Register as command and fill in ID here
	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.isonymcommand";
		
	IReasoningService reasoner = new ReasoningService().Instance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getObjectParameterForExecution("type");
		Clabject instance = (Clabject)event.getObjectParameterForExecution("instance");
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Isonym " + ReasoningServiceUtil.getDateString());
		Check check = compute(type, instance);
		resultModel.getChildren().add(check);

		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected Check compute(Clabject type, Clabject instance) {
		return isIsonym(type, instance);
	}
	
	private Check isIsonym(Clabject type, Clabject instance) {
		Check check = ReasoningResultFactory.eINSTANCE.createCheck(instance, type, null);
		check.setName("IsIsonym");
		boolean result = true;
		Check propertyConforms = (new PropertyConformsCommand()).compute(type, instance);
		check.getChildren().add(propertyConforms);
		if (!propertyConforms.isResult()) {
			result = false;
		}
		Check additionalFeatures = (new HasAdditionalPropertiesCommand()).compute(type, instance);
		additionalFeatures.setPassedIconResult(false);
		additionalFeatures.setName("_no_ additional properties");
		check.getChildren().add(additionalFeatures);
		if (additionalFeatures.isResult()) {
			result = false;
		}
		Check potencyCheck = ReasoningResultFactory.eINSTANCE.createCheck(instance, type, check);
		//FIXME
		//potencyCheck.setInstancePotency(instance.getPotency());
		//potencyCheck.setTargetPotency(type.getPotency());
		potencyCheck.setResult(true);
		potencyCheck.setName("Potency Conformance");
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
