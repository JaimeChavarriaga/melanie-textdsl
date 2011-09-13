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
import de.uni_mannheim.informatik.swt.models.plm.PLM.Method;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ValueComparison;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class FeatureConformsCommand extends AbstractHandler {
	
	IReasoningService reasoner = new ReasoningService().Instance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Feature type = (Feature)event.getParameters().get("type");
		Feature instance = (Feature)event.getParameters().get("instance");
		
		return featureConforms(type, instance);
	}
	
	protected CompositeCheck compute(Feature current, Feature possible) {
		return featureConforms(current, possible);
	}
	
	private CompositeCheck featureConforms(Feature type, Feature instance) {
		FeatureConformanceCheck result = ReasoningResultFactory.eINSTANCE.createFeatureConformanceCheck();
		result.setSource(instance);
		result.setTarget(type);
		result.setName("FeatureConformance[Delegation]");
		result.setExpression(instance.getName()+".conforms(" + type.getName() + ")");
		CompositeCheck child = null;
		if (type instanceof Method && instance instanceof Method) {
			child =  methodConforms((Method) type, (Method) instance);
		} else if (type instanceof Attribute && instance instanceof Attribute) {
			child = attributeConforms((Attribute) type, (Attribute) instance);
		} else {
			System.out.println("Mismatching Linguistic types");
			return result;
		}
		result.getCheck().add(child);
		result.setResult(child.isResult());
		return result;
	}
	
	private CompositeCheck attributeConforms(Attribute type, Attribute instance) {
		if (type.getName() == null) {
			throw new RuntimeException("Malformed type attribute " + type);
		} 
		FeatureConformanceCheck result = ReasoningResultFactory.eINSTANCE.createFeatureConformanceCheck();
		result.setSource(instance);
		result.setTarget(type);
		result.setName("AttributeConformance");
		result.setExpression(instance.getName()+".conforms(" + type.getName() + ")");
		result.setResult(true);
		NameComparison nameC = ReasoningResultFactory.eINSTANCE.createNameComparison();
		nameC.setExpression(instance.getName() + " == " + type.getName());
		result.getCheck().add(nameC);
		if (!type.getName().equals(instance.getName())) {
			result.setResult(false);
		} else {
			nameC.setResult(true);
		}
		//TODO: proper datatype handling
		DatatypeComparison datatypeC = ReasoningResultFactory.eINSTANCE.createDatatypeComparison();
		datatypeC.setExpression(instance.getDatatype() + " == " + type.getDatatype());
		result.getCheck().add(datatypeC);
		if(type.getDatatype() != null && (!type.getDatatype().equals(instance.getDatatype()))) {
			result.setResult(false);
		} else {
			datatypeC.setResult(true);
		}
		DurabilityComparison durabC = ReasoningResultFactory.eINSTANCE.createDurabilityComparison();
		durabC.setExpression(type.getName()+".durability == * or " + instance.getName() + ".durability + 1 == " + type.getName() + ".durability");
		durabC.setInstanceDurability(instance.getDurability());
		durabC.setTypeDurability(type.getDurability());
		result.getCheck().add(durabC);
		if (type.getDurability()> -1 && !(instance.getDurability()+1 == type.getDurability())) {
			result.setResult(false);
		} else {
			durabC.setResult(true);
		}
		MutabilityComparison mutabC = ReasoningResultFactory.eINSTANCE.createMutabilityComparison();
		mutabC.setExpression(type.getName() + ".mutability == * or " + instance.getName() + ".mutability + 1 == " + type.getName() + ".mutability or " + instance.getName() + ".mutability == " + type.getName()+ ".mutability == 0");
		mutabC.setInstanceMutability(instance.getMutability());
		mutabC.setTypeMutability(type.getMutability());
		result.getCheck().add(mutabC);
		if (type.getMutability()> -1 && !((instance.getMutability()+1 == type.getMutability()) || (type.getMutability() == 0 && instance.getMutability() == 0))) {
			result.setResult(false);
		} else {
			mutabC.setResult(true);
		}
		if (type.getMutability() == 0) {
			ValueComparison valueC = ReasoningResultFactory.eINSTANCE.createValueComparison();
			valueC.setExpression(type.getName() + ".value == " + instance.getName() + ".value");
			result.getCheck().add(valueC);
			if (!(type.getValue().equals(instance.getValue()))) {
				result.setResult(false);
			} else {
				valueC.setResult(true);
			}
		}
		return result;
	}

	private CompositeCheck methodConforms(Method type, Method instance) {
		if (type.getName() == null) {
			throw new RuntimeException("Malformed type method " + type);
		} 
		CompositeCheck result = reasoner.createCompositeCheck("Conformance[Method]", instance, type, "jo");
		result.setResult(true);
		NameComparison nameC = ReasoningResultFactory.eINSTANCE.createNameComparison();
		nameC.setExpression(instance.getName() + " == " + type.getName());
		result.getCheck().add(nameC);
		if (!type.getName().equals(instance.getName())) {
			result.setResult(false);
		} else {
			nameC.setResult(true);
		}
		DurabilityComparison durabC = ReasoningResultFactory.eINSTANCE.createDurabilityComparison();
		durabC.setExpression(type.getName()+".durability == * or " + instance.getName() + ".durability + 1 == " + type.getName() + ".durability");
		result.getCheck().add(durabC);
		if (type.getDurability()> -1 && !(instance.getDurability()+1 == type.getDurability())) {
			result.setResult(false);
		} else {
			durabC.setResult(true);
		}
		return result;	
	}

}
