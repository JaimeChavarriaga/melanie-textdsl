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
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Information;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;

public class OntologyConsistencyCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.ontologyconsistencycommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Ontology Consistency " + ReasoningServiceUtil.getDateString());
		Element element = (Element)event.getObjectParameterForExecution("ontology");
		Check check = compute(element);
		resultModel.getChildren().add(check);
		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected Check compute(Element el) {
		if (!(el instanceof Ontology))
			throw new IllegalArgumentException();
		return ontologyIsConsistent((Ontology) el);
	}

	private Check ontologyIsConsistent(Ontology ontology) {
		Check check = ReasoningResultFactory.eINSTANCE.createCheck();
		check.setName("Ontology Consistency");
		check.setResult(true);
		List<Model> models = ontology.getContent(); 
		Information modelInformation = ReasoningResultFactory.eINSTANCE.createInformation(ontology,"Models",check);
		for (Model model: models)
			ReasoningResultFactory.eINSTANCE.createInformation(ontology,model.getName(),modelInformation);
		int rootLevel = models.get(0).getLevel();
		for (Model m:ontology.getContent()) {
			if (m.getLevel() != rootLevel) {
				Check modelCheck = (new ModelConsistentClassificationCommand()).compute(m);
				check.getChildren().add(modelCheck);
				if (!modelCheck.isResult()) {
					check.setResult(false);
				}
			}
		}
		return check;
	}
}