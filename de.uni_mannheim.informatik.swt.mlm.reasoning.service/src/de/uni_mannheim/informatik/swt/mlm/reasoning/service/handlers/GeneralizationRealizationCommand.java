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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.model.PLMTransactionService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Information;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;

public class GeneralizationRealizationCommand extends AbstractHandler {
	
	public static final String ID_GENER_REALIZATION = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.generalizationrealizationcommand";
	IReasoningService reasoner = (new ReasoningService()).Instance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Subsumtion " + ReasoningServiceUtil.getDateString());
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

	private Check compute(Generalization gener) {
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setName("Generalization Realization");
		result.setResult(true);
		PLMTransactionService pts = new PLMTransactionService(gener.getModel(), "Generalization Realization Transaction");
		// Detect the duplicate Features
		Information featureChecks = ReasoningResultFactory.eINSTANCE.createInformation();
		featureChecks.setMessage("Feature Equality Checks");
		for (Clabject supertype : gener.getSupertype()) {
			for (Feature superF : supertype.getFeature()) {
				for (Clabject subtype : gener.getSubtype()) {
					Feature subF = subtype.getFeatureForName(superF.getName());
					if (subF != null) {
						Check currentCheck = new EqualityCommand().compute(superF, subF);
						featureChecks.getChildren().add(currentCheck);
						if (currentCheck.isResult()) {
							// delete subF
						}
					}
					
				}
			}
		}
		return result;
	}
	
	

}
