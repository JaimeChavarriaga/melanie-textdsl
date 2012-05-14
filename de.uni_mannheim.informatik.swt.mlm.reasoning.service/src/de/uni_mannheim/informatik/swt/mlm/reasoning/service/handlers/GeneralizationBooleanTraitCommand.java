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

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.model.PLMTransactionService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
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
		} else if (gener.getSubtype().size()>1) {
			// Multiple Specialization, check for disjoint and complete
		} else {
			// Binary, nothing to do here but to reset the traits
			
		}
		pts.execute();
		return result;
	}
	
	

}
