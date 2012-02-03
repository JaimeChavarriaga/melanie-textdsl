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

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Information;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.ReasoningServiceUtil;

public class PotencyCompletenessCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.potencycompletenesscommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Potency Completeness " + ReasoningServiceUtil.getDateString());
		Element element = (Element)event.getObjectParameterForExecution("clabject");
		CompositeCheck check = compute(element);
		resultModel.getChildren().add(check);

		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected CompositeCheck compute(Element el) {
		if (!(el instanceof Clabject))
			throw new IllegalArgumentException();
		return clabjectIsPotencyComplete((Clabject) el);
	}

	private CompositeCheck clabjectIsPotencyComplete(Clabject c) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		check.setName("Potency Completeness");
		check.setExpression(c.getName() + ".isPotencyComplete()");
		check.setResult(true);
		ReasoningResultFactory.eINSTANCE.createInformation(c, "potency " + c.getPotencyString(), check);
		if (c.getPotency() < 0) {//* potency
			return check;
		} else { 
			Model classifiedModel = c.getModel().getClassifiedModel();	
			if (classifiedModel == null) { //we are on the leaf model
				if (c.getPotency() == 0) { // Potency 0 on the leafmodel is nice
					ReasoningResultFactory.eINSTANCE.createInformation(c, "Leaf Model", check);
					return check;
				} else { // Not 0 and not * on the leaf model is not fine
					check.setResult(false);
					ReasoningResultFactory.eINSTANCE.createInformation(c, "Has to have isonyms but no classified model", check);
					return check;
				}
			}
			// we have a classified model
			ReasoningResultFactory.eINSTANCE.createInformation(c, "Classified Model: " + classifiedModel.getName(), check);
			Information possibleIsonymsInformation = ReasoningResultFactory.eINSTANCE.createInformation(classifiedModel, "Possible Isonyms",check);
			List<Clabject> clabjects = classifiedModel.getAllClabjects();
			for (Clabject temp: clabjects) {
				Information temper = ReasoningResultFactory.eINSTANCE.createInformation();
				temper.setMessage(temp.represent());
				temper.setSubject(temp);
				possibleIsonymsInformation.getChildren().add(temper);
			}
			if (c.getPotency() == 0) {// There must not be any isonym
				CompositeCheck noIsonymsCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
				noIsonymsCheck.setName("No Isonyms");
				check.getChildren().add(noIsonymsCheck);
				noIsonymsCheck.setResult(true); // Innocent until proven guilty
				Information actualIsonymsInfo = ReasoningResultFactory.eINSTANCE.createInformation(classifiedModel, "Actual Isonyms",noIsonymsCheck);
				for (Clabject possible: clabjects) {
					CompositeCheck cCheck = new IsonymCommand().compute(c, possible);
					noIsonymsCheck.getChildren().add(cCheck);
					if (cCheck.isResult()) { // found one, there should be none
						noIsonymsCheck.setResult(false);
						check.setResult(false);
						Information temper = ReasoningResultFactory.eINSTANCE.createInformation();
						temper.setMessage(possible.represent());
						temper.setSubject(possible);
						actualIsonymsInfo.getChildren().add(temper);
					}
				}
			} else { // There has to be an isonym and all isonyms have to be potency complete
				CompositeCheck isonymExists = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
				isonymExists.setName("Isonym Exists");
				check.getChildren().add(isonymExists);
				CompositeCheck allIsonymsPotencyComplete = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
				allIsonymsPotencyComplete.setName("All Isonyms Potency Complete");
				check.getChildren().add(allIsonymsPotencyComplete);
			}
		}
		return check;
	}
}