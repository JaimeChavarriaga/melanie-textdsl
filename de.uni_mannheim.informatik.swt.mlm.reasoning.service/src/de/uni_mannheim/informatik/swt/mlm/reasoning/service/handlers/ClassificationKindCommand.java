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
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Information;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;

public class ClassificationKindCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.classificationkindcommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Classification " + ReasoningServiceUtil.getDateString());
		Check check = null;
		Classification classification = (Classification) event.getObjectParameterForExecution("classification");
		check = compute(classification);
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
	private Check compute(Classification classification) {
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setName("Classification Kind Detection");
		PLMTransactionService pts = new PLMTransactionService(classification.getModel(), "Classification Trait");
		Clabject instance = classification.getInstance();
		Clabject type = classification.getType();
		//Start with the hardest: Isonym
		Check isonymCheck = new IsonymCommand().compute(type, instance);
		result.getChildren().add(isonymCheck);
		if (isonymCheck.isResult()) {
			pts.changeModelElementValue(classification, PLMPackage.eINSTANCE.getClassification_Kind(), ClassificationKind.ISONYM);
		} else {
			// now check for hyponym
			Check hyponymCheck = new HyponymCommand().compute(type, instance);
			result.getChildren().add(hyponymCheck);
			if (hyponymCheck.isResult()) {
				pts.changeModelElementValue(classification, PLMPackage.eINSTANCE.getClassification_Kind(), ClassificationKind.HYPONYM);
			} else { // not an isonym, not an hyponym ==> not an instance, so let's delete the classification all together
				// TODO This should be configurable
				pts.deleteModelElement(classification);
			}
		}
		pts.execute();
		// necessary administration
		result.setResult(true);
		return result;
	}

	
	
}