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
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.ReasoningServiceUtil;

public class ClassificationConsistencyCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.Oswt.plm.reasoning.service.commands.classificationconsistencycommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Classification Consistency " + ReasoningServiceUtil.getDateString());
		Element element = (Element)event.getObjectParameterForExecution("classification");
		Check check = compute(element);
		resultModel.getChildren().add(check);
		
		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected Check compute(Element el) {
		
		if (! (el instanceof Classification))
			throw new IllegalArgumentException();
			
		return classificationIsConsistent((Classification) el);
	}

	private Check classificationIsConsistent(Classification inst) {
		Check check = ReasoningResultFactory.eINSTANCE.createCheck(inst, inst, null);
		check.setName("Classification Consistency");
		check.setExpression("TODO");//TODO Expression
		check.setResult(true);
		Clabject instance = inst.getInstance();
		Clabject type = inst.getType();
		Check instanceCheck = (new InstanceCommand()).compute(type, instance);
		check.getChildren().add(instanceCheck);
		if (!instanceCheck.isResult()) {
			check.setResult(false);
			return check;
		}
		Check kindCheck = ReasoningResultFactory.eINSTANCE.createCheck(inst, inst, check);
		kindCheck.setName("Kind Instance");
		kindCheck.setResult(true);
		if (inst.getKind().equals(ClassificationKind.ISONYM) || inst.getKind().equals(ClassificationKind.INSTANTIATION)) {
			kindCheck.setName("Kind Isonym");
			Check isonymCheck = (new IsonymCommand()).compute(type, instance);
			kindCheck.getChildren().add(isonymCheck);
			if (!isonymCheck.isResult()) {
				kindCheck.setResult(false);
				check.setResult(false);
				return check;
			}
		} else if (inst.getKind().equals(ClassificationKind.HYPONYM)) {
			kindCheck.setName("Kind Hyponym");
			Check hyponymCheck = (new HyponymCommand()).compute(type, instance);
			kindCheck.getChildren().add(hyponymCheck);
			if (!hyponymCheck.isResult()) {
				kindCheck.setResult(false);
				check.setResult(false);
				return check;
			}
		}
		// We don't need to check instance as we would already have returned if that was not the case
		return check;
	}
}