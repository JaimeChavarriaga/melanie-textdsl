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

import de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion#getTarget() <em>Get Target</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class InversionTest extends SetRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InversionTest.class);
	}

	/**
	 * Constructs a new Inversion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InversionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Inversion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Inversion getFixture() {
		return (Inversion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PLMFactory.eINSTANCE.createInversion());
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

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion#getTarget() <em>Get Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion#getTarget()
	 * @generated
	 */
	public void testGetTarget() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //InversionTest
