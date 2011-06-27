package de.uni_mannheim.informatik.swt.atl.drivers.plm4atl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.engine.vm.ModelLoader;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModelElement;

import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;

public class ASMPLMModel extends ASMEMFModel {

	private Map classifiers;
	
	protected ASMPLMModel(String name, Resource extent, ASMEMFModel metamodel,
			boolean isTarget, ModelLoader ml) {
		super(name, extent, metamodel, isTarget, ml);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ASMModelElement findModelElement(String name) {
		// TODO Auto-generated method stub
		
		String[] indentifier = name.split("::");
		
		//We have something in the form OX::Element
		if (indentifier.length == 2)
		{
			EObject obj = null;
			
			Iterator<EObject> it = extent.getAllContents();
			while(it.hasNext())
			{
				obj = (EObject)it.next();
			}
			return new ASMPLMModelElement(modelElements, this, obj);
		}
		else 
			return null;
	}
	
	@Override
	public Set getAllElementsByType(ASMModelElement type) {
		// TODO Auto-generated method stub
		return super.getAllElementsByType(type);
	}
	
	@Override
	public Set getAllElementsByType(String typeName) {
		// TODO Auto-generated method stub
		return super.getAllElementsByType(typeName);
	}
	
	@Override
	public Set getElementsByType(ASMModelElement type) {
		// TODO Auto-generated method stub
		return super.getElementsByType(type);
	}
	
	@Override
	public Set getElementsByType(String typeName) {
		// TODO Auto-generated method stub
		return super.getElementsByType(typeName);
	}
	
	@Override
	public synchronized ASMModelElement getASMModelElement(EObject object) {
		// TODO Auto-generated method stub
		return super.getASMModelElement(object);
	}
	
	@Override
	public ModelLoader getModelLoader() {
		// TODO Auto-generated method stub
		return super.getModelLoader();
	}
}
