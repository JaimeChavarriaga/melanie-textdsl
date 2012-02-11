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
package de.uni_mannheim.informatik.swt.mlm.reasoning.service.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
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

	public Check compute(Feature fsuper, Feature fsub) {
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		if (fsuper == null || fsub == null) {
			System.out.println("Call to equality command with bogous input: " + fsuper + " " + fsub);
			return result;
		}
		result.setName("Feature Equality");
		if (!fsuper.getName().equals(fsub.getName())) {
			Check nameCheck = ReasoningResultFactory.eINSTANCE.createCheck();
			nameCheck.setName("Name");
			result.getChildren().add(nameCheck);
			return result;
		}
		if (fsuper.getDurability() != fsub.getDurability()) {
			Check tempCheck = ReasoningResultFactory.eINSTANCE.createCheck();
			tempCheck.setName("Durability");
			result.getChildren().add(tempCheck);
			return result;
		}
		if (fsuper instanceof Attribute) {
			if (fsub instanceof Attribute) {
				Attribute asuper = (Attribute) fsuper;
				Attribute asub = (Attribute) fsub;
				if (asuper.getMutability() != asub.getMutability()) {
					Check tempCheck = ReasoningResultFactory.eINSTANCE.createCheck();
					tempCheck.setName("Mutability");
					result.getChildren().add(tempCheck);
					return result;
				}
				if (asuper.getDatatype() == null || asub.getDatatype() == null) {
					if (asuper.getDatatype() == null && asub.getDatatype() == null) {
						ReasoningResultFactory.eINSTANCE.createInformation(fsuper, "Both of the datatypes are not set", result);
					} else {
						ReasoningResultFactory.eINSTANCE.createInformation(fsuper, "Either one of the datatypes is not set, but not both", result);
						return result;
					}
				} else if (!asuper.getDatatype().equals(asub.getDatatype())) {
					Check tempCheck = ReasoningResultFactory.eINSTANCE.createCheck();
					tempCheck.setName("Durability");
					result.getChildren().add(tempCheck);
					return result;
				}
			} else {
				Check tempCheck = ReasoningResultFactory.eINSTANCE.createCheck();
				tempCheck.setName("Linguistic type");
				result.getChildren().add(tempCheck);
				return result;
			}
		} else {
			if (fsub instanceof Attribute) {
				Check tempCheck = ReasoningResultFactory.eINSTANCE.createCheck();
				tempCheck.setName("Linguistic type");
				result.getChildren().add(tempCheck);
				return result;
			}
		}
		result.setResult(true);
		return result;
	}
}