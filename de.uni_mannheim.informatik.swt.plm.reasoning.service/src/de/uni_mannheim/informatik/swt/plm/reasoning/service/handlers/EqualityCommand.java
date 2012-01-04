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

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;

/**
 * @author bastian
 *
 */
public class EqualityCommand extends AbstractHandler {

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("JAJA");
		return null;
	}

	public CompositeCheck compute(Feature fsuper, Feature fsub) {
		CompositeCheck result = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		result.setName("Feature Equality");
		if (!fsuper.getName().equals(fsub.getName())) {
			CompositeCheck nameCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
			nameCheck.setName("Name");
			result.getCheck().add(nameCheck);
			return result;
		}
		if (fsuper.getDurability() != fsub.getDurability()) {
			CompositeCheck tempCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
			tempCheck.setName("Durability");
			result.getCheck().add(tempCheck);
			return result;
		}
		if (fsuper instanceof Attribute) {
			if (fsub instanceof Attribute) {
				if (((Attribute) fsuper).getMutability() != ((Attribute) fsub).getMutability()) {
					CompositeCheck tempCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
					tempCheck.setName("Durability");
					result.getCheck().add(tempCheck);
					return result;
				}
				if (!((Attribute) fsuper).getDatatype().equals(((Attribute) fsub).getDatatype())) {
					CompositeCheck tempCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
					tempCheck.setName("Durability");
					result.getCheck().add(tempCheck);
					return result;
				}
				if (((Attribute) fsuper).getMutability() == 0 && !((Attribute) fsuper).getValue().equals(((Attribute) fsub).getValue())) {
					CompositeCheck tempCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
					tempCheck.setName("Value");
					result.getCheck().add(tempCheck);
					return result;
				}
			} else {
				CompositeCheck tempCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
				tempCheck.setName("Linguistic type");
				result.getCheck().add(tempCheck);
				return result;
			}
		} else {
			if (fsub instanceof Attribute) {
				CompositeCheck tempCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
				tempCheck.setName("Linguistic type");
				result.getCheck().add(tempCheck);
				return result;
			}
		}
		result.setResult(true);
		return result;
	}

}
