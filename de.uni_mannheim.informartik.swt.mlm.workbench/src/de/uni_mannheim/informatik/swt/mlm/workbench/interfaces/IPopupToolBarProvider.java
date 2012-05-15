/*******************************************************************************
 * Copyright (c) 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.workbench.interfaces;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface IPopupToolBarProvider {

	/**
	 * 
	 * Lists all PopUpBarToolButtons that are available for an eobject
	 * 
	 * @param object
	 * @return the available PopUpBarToolButtons (org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool) 
	 */
	public List<Object> getPopUpToolbarButtonsForEObject(EObject object);
	
}
