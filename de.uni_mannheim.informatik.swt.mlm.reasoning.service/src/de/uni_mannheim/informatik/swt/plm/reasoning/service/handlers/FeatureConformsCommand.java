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
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Method;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.ReasoningServiceUtil;

public class FeatureConformsCommand extends AbstractHandler {
	
	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.featureconformscommand";
	
	IReasoningService reasoner = new ReasoningService().Instance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Feature type = (Feature)event.getObjectParameterForExecution("type");
		Feature instance = (Feature)event.getObjectParameterForExecution("instance");
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Feature Conformance " + ReasoningServiceUtil.getDateString());
		Check check = compute(type, instance);
		resultModel.getChildren().add(check);

		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected Check compute(Feature current, Feature possible) {
		return featureConforms(current, possible);
	}
	
	private Check featureConforms(Feature type, Feature instance) {
		Check child = null;
		if (type instanceof Method && instance instanceof Method) {
			child =  methodConforms((Method) type, (Method) instance);
		} else if (type instanceof Attribute && instance instanceof Attribute) {
			child = attributeConforms((Attribute) type, (Attribute) instance);
		} else {
			child = ReasoningResultFactory.eINSTANCE.createCheck();
			child.setName("MissMatching Types");
			ReasoningResultFactory.eINSTANCE.createInformation(type, "types " + type.eClass().getName() + " <> " + instance.eClass().getName(), child);
		}
		return child;
	}
	
	private Check attributeConforms(Attribute type, Attribute instance) {
		if (type.getName() == null) {
			throw new RuntimeException("Malformed type attribute " + type);
		} 
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setSource(instance);
		result.setTarget(type);
		result.setName("AttributeConformance");
		result.setExpression(instance.getName()+".conforms(" + type.getName() + ")");
		result.setResult(true);
		Check nameC = ReasoningResultFactory.eINSTANCE.createCheck();
		nameC.setExpression(instance.getName() + " == " + type.getName());
		nameC.setName("Name");
		result.getChildren().add(nameC);
		if (!type.getName().equals(instance.getName())) {
			result.setResult(false);
		} else {
			nameC.setResult(true);
		}
		//FIXME: proper datatype handling
		Check datatypeC = ReasoningResultFactory.eINSTANCE.createCheck();
		datatypeC.setExpression(instance.getDatatype() + " == " + type.getDatatype());
		result.getChildren().add(datatypeC);
		datatypeC.setName("Datatype");
		Object typeDatatype, instanceDatatype;
		typeDatatype = type.getDatatype();
		instanceDatatype = instance.getDatatype();
		if (typeDatatype == null) {
			if (instanceDatatype == null) {
				datatypeC.setResult(true);
			} else {
				result.setResult(false);
			}
		} else if(!typeDatatype.equals(instanceDatatype)) {
			result.setResult(false);
		} else {
			datatypeC.setResult(true);
		}
		Check durabC = ReasoningResultFactory.eINSTANCE.createCheck();
		durabC.setExpression(type.getName()+".durability == * or " + instance.getName() + ".durability + 1 == " + type.getName() + ".durability");
//		FIXME
//		durabC.setInstanceDurability(instance.getDurability());
//		durabC.setTypeDurability(type.getDurability());
		result.getChildren().add(durabC);
		durabC.setName("Durability");
		if (type.getDurability()> -1 && !(instance.getDurability()+1 == type.getDurability())) {
			result.setResult(false);
		} else {
			durabC.setResult(true);
		}
		Check mutabC = ReasoningResultFactory.eINSTANCE.createCheck();
		mutabC.setExpression(type.getName() + ".mutability == * or " + instance.getName() + ".mutability + 1 == " + type.getName() + ".mutability or " + instance.getName() + ".mutability == " + type.getName()+ ".mutability == 0");
		//FIXME
//		mutabC.setInstanceMutability(instance.getMutability());
//		mutabC.setTypeMutability(type.getMutability());
		result.getChildren().add(mutabC);
		mutabC.setName("Mutability");
		if (type.getMutability()> -1 && !((instance.getMutability()+1 == type.getMutability()) || (type.getMutability() == 0 && instance.getMutability() == 0))) {
			result.setResult(false);
		} else {
			mutabC.setResult(true);
		}
		if (type.getMutability() == 0) {
			Check valueC = ReasoningResultFactory.eINSTANCE.createCheck();
			valueC.setExpression(type.getName() + ".value == " + instance.getName() + ".value");
			mutabC.getChildren().add(valueC);
			valueC.setName("Value");
			Object typeValue, instanceValue;
			typeValue = type.getValue();
			instanceValue = instance.getValue();
			//System.out.println(""+typeValue+ instanceValue);
			if (typeValue == null) {
				if (instanceValue == null) {
					valueC.setResult(true);
				} else {
					result.setResult(false);
				}
			} else if (!(type.getValue().equals(instance.getValue()))) {
				result.setResult(false);
			} else {
				valueC.setResult(true);
			}
		}
		if (!result.isResult())
			result.setRootCause(true);
		return result;
	}

	private Check methodConforms(Method type, Method instance) {
		if (type.getName() == null) {
			throw new RuntimeException("Malformed type method " + type);
		} 
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setResult(true);
		result.setName("MethodConformance");
		Check nameC = ReasoningResultFactory.eINSTANCE.createCheck();
		nameC.setExpression(instance.getName() + " == " + type.getName());
		result.getChildren().add(nameC);
		nameC.setName("Name");
		if (!type.getName().equals(instance.getName())) {
			result.setResult(false);
		} else {
			nameC.setResult(true);
		}
		Check durabC = ReasoningResultFactory.eINSTANCE.createCheck();
		durabC.setExpression(type.getName()+".durability == * or " + instance.getName() + ".durability + 1 == " + type.getName() + ".durability");
		result.getChildren().add(durabC);
		durabC.setName("Durability");
		if (type.getDurability()> -1 && !(instance.getDurability()+1 == type.getDurability())) {
			result.setResult(false);
		} else {
			durabC.setResult(true);
		}
		return result;	
	}
}
