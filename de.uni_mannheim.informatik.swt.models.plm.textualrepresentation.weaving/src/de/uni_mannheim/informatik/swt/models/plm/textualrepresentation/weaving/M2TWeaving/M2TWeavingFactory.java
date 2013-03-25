/*******************************************************************************
 * Copyright (c) 2012, 2013 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingPackage
 * @generated
 */
public interface M2TWeavingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	M2TWeavingFactory eINSTANCE = de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Weaving Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weaving Model</em>'.
	 * @generated
	 */
	WeavingModel createWeavingModel();

	/**
	 * Returns a new object of class '<em>Weaving Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weaving Link</em>'.
	 * @generated
	 */
	WeavingLink createWeavingLink();

	/**
	 * Returns a new object of class '<em>Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Element</em>'.
	 * @generated
	 */
	TextElement createTextElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	M2TWeavingPackage getM2TWeavingPackage();

} //M2TWeavingFactory
