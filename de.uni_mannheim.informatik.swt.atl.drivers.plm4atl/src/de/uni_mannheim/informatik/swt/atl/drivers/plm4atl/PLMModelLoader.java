package de.uni_mannheim.informatik.swt.atl.drivers.plm4atl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.drivers.emf4atl.EMFModelLoader;
import org.eclipse.m2m.atl.engine.vm.ASMEmitter;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;

public class PLMModelLoader extends EMFModelLoader {

	@Override
	protected ASMEMFModel createASMEMFModel(String name, Resource extent,
			ASMModel metamodel, boolean isTarget) {
		// TODO Auto-generated method stub
		ASMEMFModel model = super.createASMEMFModel(name, extent, metamodel, isTarget);
		
		//The meta-meta model is handeled by EMF
		if ("MOF".equals(metamodel.getName()))
			return model;
		//The model itself is handeled by the plm handler
		else
			return new ASMPLMModel(name, extent, (ASMEMFModel)metamodel, isTarget, this);
	}
	
}
