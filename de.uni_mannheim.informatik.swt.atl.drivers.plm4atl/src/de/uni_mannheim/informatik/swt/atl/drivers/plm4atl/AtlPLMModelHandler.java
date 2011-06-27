package de.uni_mannheim.informatik.swt.atl.drivers.plm4atl;

import org.eclipse.m2m.atl.drivers.emf4atl.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.vm.ModelLoader;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;

public class AtlPLMModelHandler extends AtlEMFModelHandler {

	@Override
	public boolean isHandling(ASMModel model) {
		// TODO Auto-generated method stub
		return super.isHandling(model);
	}
	
	@Override
	public ModelLoader createModelLoader() {
		// TODO Auto-generated method stub
		//return super.createModelLoader();
		return new PLMModelLoader();
	}
}
