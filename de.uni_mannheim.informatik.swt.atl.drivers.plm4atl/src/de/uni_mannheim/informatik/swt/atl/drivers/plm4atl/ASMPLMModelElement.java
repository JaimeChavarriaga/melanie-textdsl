package de.uni_mannheim.informatik.swt.atl.drivers.plm4atl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModelElement;
import org.eclipse.m2m.atl.engine.vm.ClassNativeOperation;
import org.eclipse.m2m.atl.engine.vm.StackFrame;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMBoolean;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModelElement;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclAny;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclType;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMString;

public class ASMPLMModelElement extends ASMEMFModelElement {

	protected ASMPLMModelElement(Map modelElements, ASMModel model,
			EObject object) {
		super(modelElements, model, object);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addSupertype(ASMOclType supertype) {
		// TODO Auto-generated method stub
		super.addSupertype(supertype);
	}
	
	@Override
	public ASMBoolean conformsTo(ASMOclType other) {
		// TODO Auto-generated method stub
		return super.conformsTo(other);
	}
	
	@Override
	protected ASMOclAny emf2ASM(StackFrame frame, Object value) {
		// TODO Auto-generated method stub
		return super.emf2ASM(frame, value);
	}
	
	@Override
	protected Object asm2EMF(StackFrame frame, ASMOclAny value,
			String propName, EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return super.asm2EMF(frame, value, propName, feature);
	}
	
	@Override
	public ASMModelElement getAcquaintance(String name) {
		// TODO Auto-generated method stub
		return super.getAcquaintance(name);
	}
	
	@Override
	public ASMModelElement getMetaobject() {
		// TODO Auto-generated method stub
		return super.getMetaobject();
	}
	
	@Override
	public ASMModel getModel() {
		// TODO Auto-generated method stub
		return super.getModel();
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
	@Override
	public EObject getObject() {
		// TODO Auto-generated method stub
		return super.getObject();
	}
	
	@Override
	public ASMModelElement getProperty(String name) {
		// TODO Auto-generated method stub
		return super.getProperty(name);
	}
	
	@Override
	public ASMModelElement getPropertyType(String name) {
		// TODO Auto-generated method stub
		return super.getPropertyType(name);
	}
	
	@Override
	public List getSupertypes() {
		// TODO Auto-generated method stub
		return super.getSupertypes();
	}
	
	
}
