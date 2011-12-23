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
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.custom;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.CompositeCheck;


/**
 * 
 * This class provides the logic to display the right image depening on isResult
 * and isRootCause for all Checks.
 *
 */
public class BaseItemProvider extends ItemProviderAdapter {

	public BaseItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getImage(Object object) {
		if (object instanceof Check)
			return ((Check) object).isRootCause() ? getResourceLocator().getImage("icon_lightning.png")
					: ((Check) object).isResult() ?  getResourceLocator().getImage("icon_ok.png")
							: getResourceLocator().getImage("icon_false.png");
					
		return super.getImage(object);
	}
	
	@Override
	public String getText(Object object) {
		if (object instanceof CompositeCheck)
			return ((CompositeCheck) object).getName();
		
		return getString("_UI_" + ((EObject)object).eClass().getName() + "_type");
	}
}
