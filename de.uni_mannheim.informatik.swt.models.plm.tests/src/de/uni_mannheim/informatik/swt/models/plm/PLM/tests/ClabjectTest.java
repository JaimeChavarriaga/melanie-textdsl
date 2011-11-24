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

import javax.swing.event.PopupMenuListener;

import junit.textui.TestRunner;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clabject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#allInstancesFrom(java.lang.String) <em>All Instances From</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModel() <em>Get Model</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelSupertypes() <em>Get Model Supertypes</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelSubtypes() <em>Get Model Subtypes</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationsAsInstance() <em>Get Model Classifications As Instance</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationsAsType() <em>Get Model Classifications As Type</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelInstances() <em>Get Model Instances</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelTypes() <em>Get Model Types</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllFeatures() <em>Get All Features</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllAttributes() <em>Get All Attributes</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllMethods() <em>Get All Methods</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isModelInstanceOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) <em>Is Model Instance Of</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isModelTypeOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) <em>Is Model Type Of</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenConnections() <em>Get Eigen Connections</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllConnections() <em>Get All Connections</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedConnections() <em>Get Inherited Connections</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelCompleteTypes() <em>Get Model Complete Types</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelIncompleteTypes() <em>Get Model Incomplete Types</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getBlueprint() <em>Get Blueprint</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelOffspring() <em>Get Model Offspring</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelIsonyms() <em>Get Model Isonyms</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelHyponyms() <em>Get Model Hyponyms</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getDomainForConnection(de.uni_mannheim.informatik.swt.models.plm.PLM.Connection) <em>Get Domain For Connection</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getPossibleDomainSpecificVisualizers() <em>Get Possible Domain Specific Visualizers</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelDirectSupertypes() <em>Get Model Direct Supertypes</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelGeneralizationsAsSubtype() <em>Get Model Generalizations As Subtype</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelGeneralizationsAsSupertype() <em>Get Model Generalizations As Supertype</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenNavigations() <em>Get Eigen Navigations</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedNavigations() <em>Get Inherited Navigations</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllNavigations() <em>Get All Navigations</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelDirectTypes() <em>Get Model Direct Types</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationTree() <em>Get Model Classification Tree</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ClabjectTest extends DomainElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClabjectTest.class);
	}

	/**
	 * Constructs a new Clabject test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClabjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clabject test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Clabject getFixture() {
		return (Clabject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PLMFactory.eINSTANCE.createClabject());
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
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#allInstancesFrom(java.lang.String) <em>All Instances From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#allInstancesFrom(java.lang.String)
	 * @generated
	 */
	public void testAllInstancesFrom__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModel() <em>Get Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <p>
	 * 
	 * <table>
	 * 	<tr>
	 * 		<th>Case1</th>
	 * 		<th>Case2</th>
	 * 		<th>Case3</th>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><img src="doc-files/Clabject/GetModel/case1.png" /></td>
	 *      <td><img src="doc-files/Clabject/GetModel/case2.png" /></td>
	 *      <td><img src="doc-files/Clabject/GetModel/case3.png" /></td>
	 *  </tr>
	 * </table>
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModel()
	 * 
	 * @generated NOT
	 */
	public void testGetModel() {
		
		Ontology ontology = PLMFactory.eINSTANCE.createOntology();
		ontology.setName("Containing Ontology");
		
		Model o0 =  PLMFactory.eINSTANCE.createModel();
		o0.setName("O_0");
		
		Model o1 = PLMFactory.eINSTANCE.createModel();
		o1.setName("O_1");
		
		ontology.getContent().add(o0);
		ontology.getContent().add(o1);

		//Clabject directly contained in model - Case 1
		Clabject clabjectContainedInO0 = PLMFactory.eINSTANCE.createClabject();
		o0.getContent().add(clabjectContainedInO0);
		
		assertEquals(o0, clabjectContainedInO0.getModel());
		
		//Clabject contained in clabject - Case 2
		Clabject clabjectContainedInClabjectContainedInO0 = PLMFactory.eINSTANCE.createClabject();
		clabjectContainedInO0.getContent().add(clabjectContainedInClabjectContainedInO0);
		assertEquals(o0, clabjectContainedInClabjectContainedInO0.getModel());
		
		//Clabject neither contained in model nor clabject - Case 3
		Clabject clabjectNotContained = PLMFactory.eINSTANCE.createClabject();
		assertEquals(null, clabjectNotContained.getModel());
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelSupertypes() <em>Get Model Supertypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <p>
	 * 
	 * <table>
	 * 	<tr>
	 * 		<th>Case1</th>
	 * 		<th>Case2</th>
	 * 		<th>Case3</th>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><img src="doc-files/Clabject/GetModelSupertypes/case1.png" /></td>
	 *		<td><img src="doc-files/Clabject/GetModelSupertypes/case2.png" /></td>
	 *		<td><img src="doc-files/Clabject/GetModelSupertypes/case3.png" /></td>
	 *  </tr>
	 * </table>
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelSupertypes()
	 * @generated
	 */
	public void testGetModelSupertypes() {
		Ontology ontology = PLMFactory.eINSTANCE.createOntology();
		ontology.setName("Containing Ontology");
		
		Model o0 =  PLMFactory.eINSTANCE.createModel();
		o0.setName("O_0");
		
		// here we have one subClass, one superClass and one supSupClass - case 1
		Clabject subClass = PLMFactory.eINSTANCE.createClabject();
		o0.getContent().add(subClass);
		subClass.setName("subClass");
		
		Clabject superClass = PLMFactory.eINSTANCE.createClabject();
		o0.getContent().add(superClass);
		superClass.setName("superClass");
		
		Generalization generalization = PLMFactory.eINSTANCE.createGeneralization();
		o0.getContent().add(generalization);
		generalization.setName("generalization");
		generalization.getSubtype().add(subClass);
		generalization.getSupertype().add(superClass);
		
		Clabject superSuperClass = PLMFactory.eINSTANCE.createClabject();
		o0.getContent().add(superSuperClass);
		superSuperClass.setName("superSuperClass");
		
		Generalization generalization2 = PLMFactory.eINSTANCE.createGeneralization();
		o0.getContent().add(generalization2);
		generalization2.setName("generalization2");
		generalization2.getSubtype().add(superClass);
		generalization2.getSupertype().add(superSuperClass);
		
		assertTrue(subClass.getModelSupertypes().contains(superClass));
		assertTrue(subClass.getModelSupertypes().contains(superSuperClass));
		
		// one superClass has two superSuperClasses - case 2
		Clabject superSuperClass2 = PLMFactory.eINSTANCE.createClabject();
		o0.getContent().add(superSuperClass2);
		generalization2.getSupertype().add(superSuperClass2);
		
		assertTrue(subClass.getModelSupertypes().contains(superSuperClass)
					&& subClass.getModelSupertypes().contains(superSuperClass2));
		
		// case 3
		Clabject superClass2 = PLMFactory.eINSTANCE.createClabject();
		o0.getContent().add(superClass2);
		
		Clabject superSuperClass3 = PLMFactory.eINSTANCE.createClabject();
		o0.getContent().add(superSuperClass3);
		
		Generalization generalization3 = PLMFactory.eINSTANCE.createGeneralization();
		o0.getContent().add(generalization3);
		generalization3.getSubtype().add(superClass2);
		generalization3.getSupertype().add(superSuperClass3);
		
		Generalization generalization4 = PLMFactory.eINSTANCE.createGeneralization();
		o0.getContent().add(generalization4);
		generalization4.getSubtype().add(subClass);
		generalization4.getSupertype().add(superClass2);
		
		assertTrue(subClass.getModelSupertypes().contains(superClass)
					&& subClass.getModelSupertypes().contains(superClass2)
					&& subClass.getModelSupertypes().contains(superSuperClass2)
					&& subClass.getModelSupertypes().contains(superSuperClass3));
		
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelSubtypes() <em>Get Model Subtypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelSubtypes()
	 * @generated
	 */
	public void testGetModelSubtypes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationsAsInstance() <em>Get Model Classifications As Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationsAsInstance()
	 * @generated
	 */
	public void testGetModelClassificationsAsInstance() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationsAsType() <em>Get Model Classifications As Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationsAsType()
	 * @generated
	 */
	public void testGetModelClassificationsAsType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelInstances() <em>Get Model Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelInstances()
	 * @generated
	 */
	public void testGetModelInstances() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelTypes() <em>Get Model Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelTypes()
	 * @generated
	 */
	public void testGetModelTypes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllFeatures() <em>Get All Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllFeatures()
	 * @generated
	 */
	public void testGetAllFeatures() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
		
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllAttributes() <em>Get All Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllAttributes()
	 * @generated
	 */
	public void testGetAllAttributes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllMethods() <em>Get All Methods</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllMethods()
	 * @generated
	 */
	public void testGetAllMethods() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isModelInstanceOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) <em>Is Model Instance Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isModelInstanceOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 * @generated
	 */
	public void testIsModelInstanceOf__Clabject() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isModelTypeOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) <em>Is Model Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isModelTypeOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 * @generated
	 */
	public void testIsModelTypeOf__Clabject() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenConnections() <em>Get Eigen Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenConnections()
	 * @generated
	 */
	public void testGetEigenConnections() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllConnections() <em>Get All Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllConnections()
	 * @generated
	 */
	public void testGetAllConnections() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedConnections() <em>Get Inherited Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedConnections()
	 * @generated
	 */
	public void testGetInheritedConnections() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelCompleteTypes() <em>Get Model Complete Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelCompleteTypes()
	 * @generated
	 */
	public void testGetModelCompleteTypes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelIncompleteTypes() <em>Get Model Incomplete Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelIncompleteTypes()
	 * @generated
	 */
	public void testGetModelIncompleteTypes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getBlueprint() <em>Get Blueprint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getBlueprint()
	 * @generated
	 */
	public void testGetBlueprint() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelOffspring() <em>Get Model Offspring</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelOffspring()
	 * @generated
	 */
	public void testGetModelOffspring() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelIsonyms() <em>Get Model Isonyms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelIsonyms()
	 * @generated
	 */
	public void testGetModelIsonyms() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelHyponyms() <em>Get Model Hyponyms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelHyponyms()
	 * @generated
	 */
	public void testGetModelHyponyms() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getDomainForConnection(de.uni_mannheim.informatik.swt.models.plm.PLM.Connection) <em>Get Domain For Connection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getDomainForConnection(de.uni_mannheim.informatik.swt.models.plm.PLM.Connection)
	 * @generated
	 */
	public void testGetDomainForConnection__Connection() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getPossibleDomainSpecificVisualizers() <em>Get Possible Domain Specific Visualizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getPossibleDomainSpecificVisualizers()
	 * @generated
	 */
	public void testGetPossibleDomainSpecificVisualizers() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelDirectSupertypes() <em>Get Model Direct Supertypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelDirectSupertypes()
	 * @generated
	 */
	public void testGetModelDirectSupertypes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelGeneralizationsAsSubtype() <em>Get Model Generalizations As Subtype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelGeneralizationsAsSubtype()
	 * @generated
	 */
	public void testGetModelGeneralizationsAsSubtype() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelGeneralizationsAsSupertype() <em>Get Model Generalizations As Supertype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelGeneralizationsAsSupertype()
	 * @generated
	 */
	public void testGetModelGeneralizationsAsSupertype() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenNavigations() <em>Get Eigen Navigations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenNavigations()
	 * @generated
	 */
	public void testGetEigenNavigations() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedNavigations() <em>Get Inherited Navigations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedNavigations()
	 * @generated
	 */
	public void testGetInheritedNavigations() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllNavigations() <em>Get All Navigations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllNavigations()
	 * @generated
	 */
	public void testGetAllNavigations() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelDirectTypes() <em>Get Model Direct Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelDirectTypes()
	 * @generated
	 */
	public void testGetModelDirectTypes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationTree() <em>Get Model Classification Tree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationTree()
	 * @generated
	 */
	public void testGetModelClassificationTree() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelDirectSuperTypes() <em>Get Model Direct Super Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * <p>
	 * 
	 * <table>
	 * 	<tr>
	 * 		<th>Case1</th>
	 * 		<th>Case2</th>
	 * 		<th>Case3</th>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><img src="doc-files/Clabject/GetModelDirectSuperTypes/case1.png" /></td>
	 *      <td><img src="doc-files/Clabject/GetModelDirectSuperTypes/case2.png" /></td>
	 *      <td><img src="doc-files/Clabject/GetModelDirectSuperTypes/case3.png" /></td>
	 *  </tr>
	 * </table>
	 * 
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelDirectSuperTypes()
	 * @generated NOT
	 */
	public void testGetModelDirectSuperTypes() {
		Ontology ontology = PLMFactory.eINSTANCE.createOntology();
		
		Model o0 = PLMFactory.eINSTANCE.createModel();
		ontology.getContent().add(o0);
		
		Clabject superClass = PLMFactory.eINSTANCE.createClabject();
		superClass.setName("superClass");
		o0.getContent().add(superClass);
		
		Clabject subClass = PLMFactory.eINSTANCE.createClabject();
		subClass.setName("subClass");
		o0.getContent().add(subClass);
		
		Generalization generalization = PLMFactory.eINSTANCE.createGeneralization();
		generalization.getSubtype().add(subClass);
		generalization.getSupertype().add(superClass);
		o0.getContent().add(generalization);
		
		//Here we do have only one direct supertype - Case 1
		assertEquals(superClass, subClass.getModelDirectSupertypes().get(0));
		
		//Here we have two direct supertypes - Case 2
		Clabject superClass2 = PLMFactory.eINSTANCE.createClabject();
		superClass2.setName("superClass2");
		generalization.getSupertype().add(superClass2);
		
		assertTrue(subClass.getModelDirectSupertypes().contains(superClass) 
						&& subClass.getModelDirectSupertypes().contains(superClass2));
		
		//Here we have a second generalization - Case 3
		Generalization generalization2 = PLMFactory.eINSTANCE.createGeneralization();
		generalization2.getSubtype().add(subClass);
		o0.getContent().add(generalization2);
		
		Clabject superClass3 = PLMFactory.eINSTANCE.createClabject();
		superClass3.setName("superClass3");
		generalization2.getSupertype().add(superClass3);

		assertTrue(subClass.getModelDirectSupertypes().contains(superClass) 
					&& subClass.getModelDirectSupertypes().contains(superClass2)
					&& subClass.getModelDirectSupertypes().contains(superClass3));
	}

	/**
	 * Tests the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelGeneralizationsAsSubType() <em>Get Model Generalizations As Sub Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 *  <p>
	 * <table>
	 * 	<tr>
	 * 		<th>Case1</th>
	 * 		<th>Case2</th>
	 * 	</tr>
	 * 	<tr>
	 * 		<td><img src="doc-files/Clabject/GetModelGeneralizationsAsSubType/case1.png" /></td>
	 *      <td><img src="doc-files/Clabject/GetModelGeneralizationsAsSubType/case2.png" /></td>
	 *  </tr>
	 * </table>
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelGeneralizationsAsSubType()
	 * @generated NOT
	 */
	public void testGetModelGeneralizationsAsSubType() {
		Ontology ontology = PLMFactory.eINSTANCE.createOntology();
		
		Model o0 = PLMFactory.eINSTANCE.createModel();
		ontology.getContent().add(o0);
		
		Clabject subClass = PLMFactory.eINSTANCE.createClabject();
		o0.getContent().add(subClass);
		
		Clabject superClass = PLMFactory.eINSTANCE.createClabject();
		o0.getContent().add(superClass);
		
		Generalization generalization = PLMFactory.eINSTANCE.createGeneralization();
		generalization.getSubtype().add(subClass);
		generalization.getSupertype().add(superClass);
		generalization.setName("generalization");
		o0.getContent().add(generalization);
		
		//Here we have single superClass, single subClass, single generalization - Case 1
		assertEquals(generalization, subClass.getModelGeneralizationsAsSubtype().get(0));
			
		//Here we have two superClass, single subClasses, two generalizations - Case 2
		Clabject superClass2 = PLMFactory.eINSTANCE.createClabject();
		o0.getContent().add(superClass2);
		
		Generalization generalization2 = PLMFactory.eINSTANCE.createGeneralization();
		generalization2.getSupertype().add(superClass2);
		generalization2.getSubtype().add(subClass);
		generalization2.setName("generalization2");
		o0.getContent().add(generalization2);
		
		assertTrue(subClass.getModelGeneralizationsAsSubtype().contains(generalization2)
				     	&& subClass.getModelGeneralizationsAsSubtype().contains(generalization));
		
	}

} //ClabjectTest
