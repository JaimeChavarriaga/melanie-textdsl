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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class HyponymCommand extends AbstractHandler {
	
	
	IReasoningService reasoner = new ReasoningService().Instance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getParameters().get("type");
		Clabject instance = (Clabject)event.getParameters().get("instance");
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		CompositeCheck check = compute(type, instance);
		resultModel.getCheck().add(check);
		reasoner.getReasoningHistory().add(resultModel);
		return check.isResult();
	}
	
	protected CompositeCheck compute(Clabject type, Clabject instance) {
		return isHyponym(type, instance);
	}
	
	private CompositeCheck isHyponym(Clabject type, Clabject instance) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, null);
		check.setName("IsHyponym");
		boolean result = true;
		CompositeCheck propertyConforms = (new PropertyConformsCommand()).compute(type, instance);
		check.getCheck().add(propertyConforms);
		if (!propertyConforms.isResult()) {
			result = false;
		}
		CompositeCheck additionalFeatures = (new HasAdditionalPropertiesCommand()).compute(type, instance);
		check.getCheck().add(additionalFeatures);
		if (!additionalFeatures.isResult()) {
			result = false;
		}
		check.setResult(result);
		return check;
	}

}
