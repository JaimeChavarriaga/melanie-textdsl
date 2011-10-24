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

import org.eclipse.m2m.atl.drivers.emf4atl.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.vm.ModelLoader;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;

public class AtlPLMModelHandler extends AtlEMFModelHandler {

	@Override
	public boolean isHandling(ASMModel model) {
		return model instanceof ASMPLMModel;
	}
	
	@Override
	public ModelLoader createModelLoader() {
		//We need to have our custom model loader here
		return new PLMModelLoader();
	}
}
