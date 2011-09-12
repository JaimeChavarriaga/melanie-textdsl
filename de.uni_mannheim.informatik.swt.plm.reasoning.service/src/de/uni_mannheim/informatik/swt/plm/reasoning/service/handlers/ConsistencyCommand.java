/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class ConsistencyCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.consistencycommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Element element = (Element)event.getParameters().get("element");
		return compute(element);
	}
	
	protected CompositeCheck compute(Element el) {
		if (el instanceof Ontology) {
			return ontologyIsConsistent((Ontology) el);
		} else if (el instanceof Generalization) {
			return generalizationIsConsistent((Generalization) el);
		} else if (el instanceof Instantiation) {
			return classificationIsConsistent((Instantiation) el);
		}
		System.out.println("Unknown Consistency Type " + el);
		return null;
	}

	private CompositeCheck classificationIsConsistent(Instantiation inst) {
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
		
		return check;
	}

	private CompositeCheck generalizationIsConsistent(Generalization el) {
		// TODO Auto-generated method stub
		return null;
	}

	private CompositeCheck ontologyIsConsistent(Ontology el) {
		// TODO Auto-generated method stub
		return null;
	}
	


	
}