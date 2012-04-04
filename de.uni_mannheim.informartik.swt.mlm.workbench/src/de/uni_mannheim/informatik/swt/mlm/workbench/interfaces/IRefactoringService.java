/*******************************************************************************
 * Copyright (c) 2011, 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.workbench.interfaces;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface for refactoring extension point.
 *
 */
public interface IRefactoringService {

	/**
	 * Starts listening to a model
	 * 
	 * @param modelRoot
	 */
	public void startListening(EObject modelRoot);
	
	/**
	 * Stops listening to a model
	 * 
	 * @param modelRoot
	 */
	public void stopListening(EObject modelRoot);
}