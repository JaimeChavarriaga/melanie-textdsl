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
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.ReasoningServiceUtil;

public class ModelConsistentClassificationCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.modelconsistentclassificationcommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Consistent Classification " + ReasoningServiceUtil.getDateString());
		Model model = (Model)event.getObjectParameterForExecution("model");
		Check check = compute(model);
		resultModel.getChildren().add(check);
		
		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected Check compute(Model model) {
		return isConsistentlyClassified(model);
	}

	private Check isConsistentlyClassified(Model model) {
		Model classifyingModel = model.getClassifyingModel();
		Check check = ReasoningResultFactory.eINSTANCE.createCheck(model, classifyingModel, null);
		check.setResult(true);
		check.setName("ConsistentClassification");
		if (classifyingModel == null) {
			//There is no classifying model, so model is the rootmodel or there has been an error. 
			//Either way the result is false
			check.setExpression(model.getName() + " is root model.");
			check.setResult(false);
			return check;
		}
		Check classificationCheck = ReasoningResultFactory.eINSTANCE.createCheck(model, classifyingModel, check);
		classificationCheck.setName("Classificiations");
		classificationCheck.setResult(true);
		for (Classification inst: model.getAllClassifications()) {
			Check aClassificationCheck = ReasoningResultFactory.eINSTANCE.createCheck(model, classifyingModel, classificationCheck);
			aClassificationCheck.setResult(true);
			aClassificationCheck.setName(inst.represent());
			aClassificationCheck.setExpression(inst.represent()+ ".isConsistent()");
			if (!inst.isExpressed()) {
				aClassificationCheck.setExpression(inst.getName() + " is not expressed.");
				continue;
			}
			Check actualCheck = (new ClassificationConsistencyCommand()).compute(inst);
			aClassificationCheck.getChildren().add(actualCheck);
			aClassificationCheck.setResult(actualCheck.isResult());
			if (!aClassificationCheck.isResult()) {
				classificationCheck.setResult(false);
				check.setResult(false);
				return check;
			}
		}
		Check generalizationCheck = ReasoningResultFactory.eINSTANCE.createCheck(classifyingModel, classifyingModel, check);
		generalizationCheck.setName("Generalizations");
		generalizationCheck.setResult(true);
		for (Generalization gener:classifyingModel.getAllGeneralizations()) {
			Check aGenerCheck = ReasoningResultFactory.eINSTANCE.createCheck(model, classifyingModel, generalizationCheck); 
			aGenerCheck.setName(gener.represent());
			aGenerCheck.setResult(true);
			Check actualCheck = (new GeneralizationConsistencyCommand()).compute(gener);
			aGenerCheck.getChildren().add(actualCheck);
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