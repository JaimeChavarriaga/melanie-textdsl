package de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Method;
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
	
	public boolean featureConforms(Feature type, Feature instance) {
		FeatureConformanceCheck check = ReasoningResultFactory.eINSTANCE.createFeatureConformanceCheck();
		check.setSource(instance);
		check.setTarget(type);
		check.setName("FeatureConformance[Delegation]");
		check.setExpression(instance.getName()+".conforms(" + type.getName() + ")");
		reasoner.registerCheck(check);
		boolean result = false;
		if (type instanceof Method && instance instanceof Method) {
			result =  methodConforms((Method) type, (Method) instance);
		} else if (type instanceof Attribute && instance instanceof Attribute) {
			result = attributeConforms((Attribute) type, (Attribute) instance);
		} else {
			System.out.println("Mismatching Linguistic types");
		}
		check.setResult(result);
		reasoner.deRegisterCheck(check);
		return result;
	}
	
	public boolean attributeConforms(Attribute type, Attribute instance) {
		if (type.getName() == null) {
			throw new RuntimeException("Malformed type attribute " + type);
		} 
		FeatureConformanceCheck check = ReasoningResultFactory.eINSTANCE.createFeatureConformanceCheck();
		check.setSource(instance);
		check.setTarget(type);
		check.setName("AttributeConformance");
		check.setExpression(instance.getName()+".conforms(" + type.getName() + ")");
		reasoner.registerCheck(check);
		boolean result = true;
		NameComparison nameC = ReasoningResultFactory.eINSTANCE.createNameComparison();
		nameC.setExpression(instance.getName() + " == " + type.getName());
		reasoner.registerCheck(nameC);
		if (!type.getName().equals(instance.getName())) {
			result = false;
		} else {
			nameC.setResult(true);
		}
		reasoner.deRegisterCheck(nameC);
		//TODO: proper datatype handling
		DatatypeComparison datatypeC = ReasoningResultFactory.eINSTANCE.createDatatypeComparison();
		datatypeC.setExpression(instance.getDatatype() + " == " + type.getDatatype());
		reasoner.registerCheck(datatypeC);
		if(type.getDatatype() != null && (!type.getDatatype().equals(instance.getDatatype()))) {
			result = false;
		} else {
			datatypeC.setResult(true);
		}
		reasoner.deRegisterCheck(datatypeC);
		DurabilityComparison durabC = ReasoningResultFactory.eINSTANCE.createDurabilityComparison();
		durabC.setExpression(type.getName()+".durability == * or " + instance.getName() + ".durability + 1 == " + type.getName() + ".durability");
		reasoner.registerCheck(durabC);
		if (type.getDurability()> -1 && !(instance.getDurability()+1 == type.getDurability())) {
			result = false;
		} else {
			durabC.setResult(true);
		}
		reasoner.deRegisterCheck(durabC);
		MutabilityComparison mutabC = ReasoningResultFactory.eINSTANCE.createMutabilityComparison();
		mutabC.setExpression(type.getName() + ".mutability == * or " + instance.getName() + ".mutability + 1 == " + type.getName() + ".mutability or " + instance.getName() + ".mutability == " + type.getName()+ ".mutability == 0");
		reasoner.registerCheck(mutabC);
		if (type.getMutability()> -1 && !((instance.getMutability()+1 == type.getMutability()) || (type.getMutability() == 0 && instance.getMutability() == 0))) {
			result = false;
		} else {
			mutabC.setResult(true);
		}
		reasoner.deRegisterCheck(mutabC);
		if (type.getMutability() == 0) {
			ValueComparison valueC = ReasoningResultFactory.eINSTANCE.createValueComparison();
			reasoner.registerCheck(valueC);
			valueC.setExpression(type.getName() + ".value == " + instance.getName() + ".value");
			if (!(type.getValue().equals(instance.getValue()))) {
				result = false;
			} else {
				valueC.setResult(true);
			}
			reasoner.deRegisterCheck(valueC);
		}
		check.setResult(result);
		reasoner.deRegisterCheck(check);
		return result;
	}

	public boolean methodConforms(Method type, Method instance) {
		if (type.getName() == null) {
			throw new RuntimeException("Malformed type method " + type);
		} 
		if (!type.getName().equals(instance.getName())) {
			return false;
		}  else if (type.getDurability()> -1 && !(instance.getDurability()+1 == type.getDurability())) {
			return false;
		}
		return true;
	}

}
