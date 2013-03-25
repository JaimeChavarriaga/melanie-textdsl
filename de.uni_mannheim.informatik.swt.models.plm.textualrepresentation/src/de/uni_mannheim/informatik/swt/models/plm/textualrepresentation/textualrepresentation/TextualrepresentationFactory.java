/*******************************************************************************
 * Copyright (c) 2011-2013 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage
 * @generated
 */
public interface TextualrepresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextualrepresentationFactory eINSTANCE = de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Textual DSL Visualizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textual DSL Visualizer</em>'.
	 * @generated
	 */
	TextualDSLVisualizer createTextualDSLVisualizer();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Value Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Choice</em>'.
	 * @generated
	 */
	ValueChoice createValueChoice();

	/**
	 * Returns a new object of class '<em>Standard Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Color</em>'.
	 * @generated
	 */
	StandardColor createStandardColor();

	/**
	 * Returns a new object of class '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RGB Color</em>'.
	 * @generated
	 */
	RGBColor createRGBColor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TextualrepresentationPackage getTextualrepresentationPackage();

} //TextualrepresentationFactory
