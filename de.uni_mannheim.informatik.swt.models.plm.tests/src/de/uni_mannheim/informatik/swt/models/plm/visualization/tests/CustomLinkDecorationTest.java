/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.tests;

import de.uni_mannheim.informatik.swt.models.plm.visualization.CustomLinkDecoration;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Custom Link Decoration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomLinkDecorationTest extends LinkDecorationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CustomLinkDecorationTest.class);
	}

	/**
	 * Constructs a new Custom Link Decoration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomLinkDecorationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Custom Link Decoration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CustomLinkDecoration getFixture() {
		return (CustomLinkDecoration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VisualizationFactory.eINSTANCE.createCustomLinkDecoration());
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

} //CustomLinkDecorationTest
