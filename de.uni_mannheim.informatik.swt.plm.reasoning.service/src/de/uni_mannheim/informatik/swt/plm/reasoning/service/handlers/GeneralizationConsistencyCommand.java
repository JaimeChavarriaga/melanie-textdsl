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
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

//TODO: Which kind of consistency? Ontology or model?
public class GeneralizationConsistencyCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.generalizationconsistencycommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		Element element = (Element)event.getParameters().get("element");
		CompositeCheck check = compute(element);
		resultModel.getCheck().add(check);
		reasoner.getReasoningHistory().add(resultModel);
		return check.isResult();
	}
	
	protected CompositeCheck compute(Element el) {
		
		if (!(el instanceof Generalization))
			throw new IllegalArgumentException();
		
		return classificationIsConsistent((Classification) el);
	}

	private CompositeCheck classificationIsConsistent(Classification inst) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck(inst, inst, null);
		check.setName("Consistency[Classification]");
		check.setResult(true);
		Clabject instance = inst.getInstance();
		Clabject type = inst.getType();
		CompositeCheck instanceCheck = (new InstanceCommand()).compute(type, instance);
		check.getCheck().add(instanceCheck);
		if (!instanceCheck.isResult()) {
			check.setResult(false);
			return check;
		}
		CompositeCheck kindCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(inst, inst, check);
		kindCheck.setName("Kind Instance");
		kindCheck.setResult(true);
		//TODO: RENAMED INSTANTIATION to CLASSIFICATION is that right
		if (inst.getKind().equals(ClassificationKind.ISONYM) || inst.getKind().equals(ClassificationKind.CLASSIFICATION)) {
			kindCheck.setName("Kind Isonym");
			CompositeCheck isonymCheck = (new IsonymCommand()).compute(type, instance);
			kindCheck.getCheck().add(isonymCheck);
			if (!isonymCheck.isResult()) {
				kindCheck.setResult(false);
				check.setResult(false);
				return check;
			}
		} else if (inst.getKind().equals(ClassificationKind.HYPONYM)) {
			kindCheck.setName("Kind Hyponym");
			CompositeCheck hyponymCheck = (new HyponymCommand()).compute(type, instance);
			kindCheck.getCheck().add(hyponymCheck);
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