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
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.model.PLMTransactionService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Information;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;

public class ClassificationCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.classificationcommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Classification " + ReasoningServiceUtil.getDateString());
		Check check = null;
		
		Model model = (Model) event.getObjectParameterForExecution("model");
		check = compute(model);
		resultModel.getChildren().add(check);		
		
		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
		
	/**
	 * 
	 * @param model
	 * @return
	 */
	private Check compute(Model model) {
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setName("Classification");
		Model classifyingModel = model.getClassifyingModel();
		if (classifyingModel == null) {
			result.setResult(false);
			ReasoningResultFactory.eINSTANCE.createInformation(model, "No classifying model", result);
			return result;
		}
		// Info for the reasoning view
		Information processedPairsInfo = ReasoningResultFactory.eINSTANCE.createInformation(model, "Processed Pairs", result);
		Information modelledPairsInfo = ReasoningResultFactory.eINSTANCE.createInformation(model, "Modelled Pairs", result);
		Information foundPairsInfo = ReasoningResultFactory.eINSTANCE.createInformation(model, "Found Pairs", result);
		Information classificationChecks = ReasoningResultFactory.eINSTANCE.createInformation(model, "ClassificationChecks", result);
		PLMTransactionService pts = new PLMTransactionService(model, "Model Classification");
		List<Clabject> instances = model.getAllClabjects();
		List<Clabject> types = classifyingModel.getAllClabjects();
		Set<Classification> newClassifications = new HashSet<Classification>();
		for (Clabject instance: instances) {
			for (Clabject type: types) {
				ReasoningResultFactory.eINSTANCE.createInformation(model, instance.represent() + "-->" + type.represent(), processedPairsInfo);
				if (instance.getModelTypes().contains(type)) {
					ReasoningResultFactory.eINSTANCE.createInformation(model, instance.represent() + "-->" + type.represent(), modelledPairsInfo);
				} else {
					Check classificationResult = new InstanceCommand().compute(type, instance);
					classificationChecks.getChildren().add(classificationResult);
					if (classificationResult.isResult()) {
						Classification classification = PLMFactory.eINSTANCE.createClassification();
						classification.setInstance(instance);
						classification.setType(type);
//						TODO: Detect the classification kind correctly
						classification.setKind(ClassificationKind.INSTANCE);
						newClassifications.add(classification);
						pts.newModelElement(classification);
						ReasoningResultFactory.eINSTANCE.createInformation(model, instance.represent() + "-->" + type.represent(), foundPairsInfo);
					}
				}
			}
		}
		// TODO: Remove classifications to supertypes of types. This shall be configurable
		// TODO: Realize the old classifications where they do not match the claim
		pts.execute();
		// necessary administration
		result.setResult(true);
		return result;
	}

	
	
}