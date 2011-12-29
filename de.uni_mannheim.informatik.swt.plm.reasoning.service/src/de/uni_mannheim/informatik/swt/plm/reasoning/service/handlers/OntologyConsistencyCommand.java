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

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class OntologyConsistencyCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.ontologyconsistencycommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		Element element = (Element)event.getObjectParameterForExecution("ontology");
		CompositeCheck check = compute(element);
		resultModel.getCheck().add(check);

		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected CompositeCheck compute(Element el) {
		if (!(el instanceof Ontology))
			throw new IllegalArgumentException();
		
		return ontologyIsConsistent((Ontology) el);
	}

	private CompositeCheck ontologyIsConsistent(Ontology el) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck(el, el, null);
		check.setResult(true);
		List<Model> models = el.getContent(); 
		/*Collections.sort(models, new Comparator<Model>() {
			public int compare(Model m1, Model m2) {
				if (m1.getLevel() < m2.getLevel()) 
					return 1;
				else if (m1.getLevel() < m2.getLevel())
					return -1;
				return 0;
			}
		});*/
		int rootLevel = models.get(0).getLevel();
		for (Model m:el.getContent()) {
			if (m.getLevel() != rootLevel) {
				CompositeCheck modelCheck = (new ModelConsistentClassificationCommand()).compute(m);
				check.getCheck().add(modelCheck);
				if (!modelCheck.isResult()) {
					check.setResult(false);
				}
			}
		}
		return check;
	}
}