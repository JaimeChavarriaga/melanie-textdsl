/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/

package de.uni_mannheim.informatik.swt.atl.drivers.plm4atl;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.drivers.emf4atl.EMFModelLoader;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;

public class PLMModelLoader extends EMFModelLoader {

	public static PLMModelLoader eInstance = null;
	
	public Map getLoadedModels(){
		return loadedModels;
	}
	
	public PLMModelLoader() {
		eInstance = this;
	}
	
	@Override
	protected ASMEMFModel createASMEMFModel(String name, Resource extent,
			ASMModel metamodel, boolean isTarget) {
		// TODO Auto-generated method stub
		//ASMEMFModel model = super.createASMEMFModel(name, extent, metamodel, isTarget);
		
		//The meta-meta model is handeled by EMF
		//if ("MOF".equals(metamodel.getName()))
		//	return new ASMPLMModel(name, extent, (ASMEMFModel)metamodel, isTarget, this);
		//The model itself is handeled by the plm handler
		//else
		return new ASMPLMModel(name, extent, (ASMEMFModel)metamodel, isTarget, this);
	}
}
