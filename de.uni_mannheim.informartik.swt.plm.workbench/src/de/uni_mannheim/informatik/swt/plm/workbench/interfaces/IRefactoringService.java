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
package de.uni_mannheim.informatik.swt.plm.workbench.interfaces;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Interface for refactoring extension point.
 *
 */
public interface IRefactoringService {
	
	/**
	 * Refactors the feature of the modelElement with the value
	 * 
	 * @param modelElement Model element to change value in
	 * @param feature Feature to change
	 * @param value Value to set
	 * @return true -> refactoring worked; false -> else
	 */
	public boolean changeValue(EObject modelElement, EStructuralFeature feature, Object value);
	
	public boolean delete(EObject modelElement);
	
	public String[] getAvailableRefactoringCommands(EObject modelElement);
}
