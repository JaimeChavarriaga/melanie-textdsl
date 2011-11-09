/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.tests;

import de.uni_mannheim.informatik.swt.models.plm.visualization.RoundedRectangle;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rounded Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoundedRectangleTest extends RectangleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoundedRectangleTest.class);
	}

	/**
	 * Constructs a new Rounded Rectangle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundedRectangleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rounded Rectangle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RoundedRectangle getFixture() {
		return (RoundedRectangle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VisualizationFactory.eINSTANCE.createRoundedRectangle());
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

} //RoundedRectangleTest
