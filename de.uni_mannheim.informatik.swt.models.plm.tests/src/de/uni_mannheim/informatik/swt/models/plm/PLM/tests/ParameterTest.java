/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Kun Feng - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.models.plm.PLM.tests;

import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Parameter;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterTest extends TestCase {

	/**
	 * The fixture for this Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Parameter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterTest.class);
	}

	/**
	 * Constructs a new Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Parameter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Parameter getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PLMFactory.eINSTANCE.createParameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ParameterTest
