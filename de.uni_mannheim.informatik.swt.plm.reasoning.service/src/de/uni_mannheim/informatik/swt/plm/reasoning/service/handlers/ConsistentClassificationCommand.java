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

import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class ConsistentClassificationCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.consistentclassificationycommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		Model model = (Model)event.getParameters().get("model");
		CompositeCheck check = compute(model);
		resultModel.getCheck().add(check);
		if ((Boolean)event.getObjectParameterForExecution("silent"))
			reasoner.getReasoningHistory().add(resultModel);
		return check.isResult();
	}
	
	protected CompositeCheck compute(Model model) {
		return isConsistentlyClassified(model);
	}

	private CompositeCheck isConsistentlyClassified(Model model) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck(model, model, null);
		check.setResult(true);
		Model classifyingModel = model.getClassifyingModel();
		check.setName("ConsistentClassification");
		if (classifyingModel == null) {
			//There is no classifying model, so model is the rootmodel or there has been an error. 
			//Either way the result is false
			check.setExpression(model.getName() + " is root model.");
			check.setResult(false);
			return check;
		}
		CompositeCheck classificationCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(model, model, check);
		classificationCheck.setName("Classificiations");
		classificationCheck.setResult(true);
		for (Classification inst: model.getAllClassifications()) {
			CompositeCheck aClassificationCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(model, model, classificationCheck);
			aClassificationCheck.setResult(true);
			aClassificationCheck.setName(inst.getName());
			if (!inst.isExpressed()) {
				aClassificationCheck.setExpression(inst.getName() + " is not expressed.");
				continue;
			}
			CompositeCheck actualCheck = (new ClassificationConsistencyCommand()).compute(inst);
			aClassificationCheck.getCheck().add(actualCheck);
			aClassificationCheck.setResult(actualCheck.isResult());
			if (!aClassificationCheck.isResult()) {
				classificationCheck.setResult(false);
				check.setResult(false);
				return check;
			}
		}
		CompositeCheck generalizationCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(classifyingModel, classifyingModel, check);
		generalizationCheck.setName("Generalizations");
		generalizationCheck.setResult(true);
		for (Generalization gener:classifyingModel.getAllGeneralizations()) {
			CompositeCheck aGenerCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(model, model, generalizationCheck); 
			aGenerCheck.setName(gener.getName());
			aGenerCheck.setResult(true);
			CompositeCheck actualCheck = (new GeneralizationConsistencyCommand()).compute(gener);
			aGenerCheck.getCheck().add(actualCheck);
			if (!actualCheck.isResult()) {
				aGenerCheck.setResult(false);
				generalizationCheck.setResult(false);
				check.setResult(false);
				return check;
			}
		}
		return check;
	}
}