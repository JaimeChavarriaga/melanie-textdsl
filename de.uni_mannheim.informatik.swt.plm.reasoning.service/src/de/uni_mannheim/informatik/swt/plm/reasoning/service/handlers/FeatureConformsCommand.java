package de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Method;

public class FeatureConformsCommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Feature type = (Feature)event.getParameters().get("type");
		Feature instance = (Feature)event.getParameters().get("instance");
		
		if (type instanceof Method && instance instanceof Method)
			return methodConforms((Method) type, (Method) instance);
		if (type instanceof Attribute && instance instanceof Attribute)
			return attributeConforms((Attribute) type, (Attribute) instance);
		System.out.println("Mismatching Linguistic types");
		return false;
	}
	
	public boolean attributeConforms(Attribute type, Attribute instance) {
		if (type.getName() == null) {
			throw new RuntimeException("Malformed type attribute " + type);
		} 
		if (!type.getName().equals(instance.getName())) {
			return false;
		} //TODO: proper datatype handling
		else if(type.getDatatype() != null && (!type.getDatatype().equals(instance.getDatatype()))) {
			return false;
		} else if (type.getDurability()> -1 && !(instance.getDurability()+1 == type.getDurability())) {
			return false;
		} else if (type.getMutability()> -1 && !((instance.getMutability()+1 == type.getMutability()) || (type.getMutability() == 0 && instance.getMutability() == 0))) {
			return false;
		} else if (type.getMutability() == 0 && !(type.getValue().equals(instance.getValue()))) {
			return false;
		}
		return true;
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
