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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>PLM</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PLMTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new PLMTests("PLM Tests");
		suite.addTestSuite(ModelTest.class);
		suite.addTestSuite(OntologyTest.class);
		suite.addTestSuite(EqualityTest.class);
		suite.addTestSuite(InversionTest.class);
		suite.addTestSuite(ComplementTest.class);
		suite.addTestSuite(GeneralizationTest.class);
		suite.addTestSuite(ClassificationTest.class);
		suite.addTestSuite(ClabjectTest.class);
		suite.addTestSuite(EntityTest.class);
		suite.addTestSuite(ConnectionTest.class);
		suite.addTestSuite(RoleTest.class);
		suite.addTestSuite(LMLVisualizerTest.class);
		suite.addTestSuite(AttributeTest.class);
		suite.addTestSuite(MethodTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLMTests(String name) {
		super(name);
	}

} //PLMTests
