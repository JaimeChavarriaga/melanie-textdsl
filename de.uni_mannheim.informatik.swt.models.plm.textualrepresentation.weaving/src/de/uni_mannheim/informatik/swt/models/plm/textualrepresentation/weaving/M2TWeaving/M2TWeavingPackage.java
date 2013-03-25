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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface M2TWeavingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "M2TWeaving";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://swt.informatik.uni-mannheim.de/M2TWeaving";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "M2TWeaving";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	M2TWeavingPackage eINSTANCE = de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingModelImpl <em>Weaving Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingModelImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingPackageImpl#getWeavingModel()
	 * @generated
	 */
	int WEAVING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_MODEL__LINKS = 0;

	/**
	 * The number of structural features of the '<em>Weaving Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_MODEL_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Link For PLM Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_MODEL___FIND_LINK_FOR_PLM_ELEMENT__ELEMENT = 0;

	/**
	 * The operation id for the '<em>Find Text Element For Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_MODEL___FIND_TEXT_ELEMENT_FOR_OFFSET__INT = 1;

	/**
	 * The operation id for the '<em>Find Text Element For Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_MODEL___FIND_TEXT_ELEMENT_FOR_OFFSET__INT_SEARCHSTRATEGY = 2;

	/**
	 * The number of operations of the '<em>Weaving Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_MODEL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingModelContentImpl <em>Weaving Model Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingModelContentImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingPackageImpl#getWeavingModelContent()
	 * @generated
	 */
	int WEAVING_MODEL_CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Weaving Model Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_MODEL_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Weaving Model Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_MODEL_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingLinkImpl <em>Weaving Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingLinkImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingPackageImpl#getWeavingLink()
	 * @generated
	 */
	int WEAVING_LINK = 2;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_LINK__MODEL_ELEMENT = WEAVING_MODEL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_LINK__CHILDREN = WEAVING_MODEL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weaving Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_LINK_FEATURE_COUNT = WEAVING_MODEL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_LINK___CALCULATE_OFFSET = WEAVING_MODEL_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_LINK___CALCULATE_LENGTH = WEAVING_MODEL_CONTENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Weaving Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVING_LINK_OPERATION_COUNT = WEAVING_MODEL_CONTENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.TextElementImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__OFFSET = WEAVING_MODEL_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__LENGTH = WEAVING_MODEL_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__TEXT = WEAVING_MODEL_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = WEAVING_MODEL_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Length Trimmed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT___GET_LENGTH_TRIMMED = WEAVING_MODEL_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_OPERATION_COUNT = WEAVING_MODEL_CONTENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy <em>Search Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingPackageImpl#getSearchStrategy()
	 * @generated
	 */
	int SEARCH_STRATEGY = 4;


	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel <em>Weaving Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weaving Model</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel
	 * @generated
	 */
	EClass getWeavingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel#getLinks()
	 * @see #getWeavingModel()
	 * @generated
	 */
	EReference getWeavingModel_Links();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel#findLinkForPLMElement(de.uni_mannheim.informatik.swt.models.plm.PLM.Element) <em>Find Link For PLM Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Link For PLM Element</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel#findLinkForPLMElement(de.uni_mannheim.informatik.swt.models.plm.PLM.Element)
	 * @generated
	 */
	EOperation getWeavingModel__FindLinkForPLMElement__Element();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel#findTextElementForOffset(int) <em>Find Text Element For Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Text Element For Offset</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel#findTextElementForOffset(int)
	 * @generated
	 */
	EOperation getWeavingModel__FindTextElementForOffset__int();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel#findTextElementForOffset(int, de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy) <em>Find Text Element For Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Text Element For Offset</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel#findTextElementForOffset(int, de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy)
	 * @generated
	 */
	EOperation getWeavingModel__FindTextElementForOffset__int_SearchStrategy();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModelContent <em>Weaving Model Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weaving Model Content</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModelContent
	 * @generated
	 */
	EClass getWeavingModelContent();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink <em>Weaving Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weaving Link</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink
	 * @generated
	 */
	EClass getWeavingLink();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink#getModelElement()
	 * @see #getWeavingLink()
	 * @generated
	 */
	EReference getWeavingLink_ModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink#getChildren()
	 * @see #getWeavingLink()
	 * @generated
	 */
	EReference getWeavingLink_Children();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink#calculateOffset() <em>Calculate Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Offset</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink#calculateOffset()
	 * @generated
	 */
	EOperation getWeavingLink__CalculateOffset();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink#calculateLength() <em>Calculate Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Length</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink#calculateLength()
	 * @generated
	 */
	EOperation getWeavingLink__CalculateLength();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement#getOffset()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Offset();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement#getLength()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Length();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement#getText()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Text();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement#getLengthTrimmed() <em>Get Length Trimmed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Length Trimmed</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement#getLengthTrimmed()
	 * @generated
	 */
	EOperation getTextElement__GetLengthTrimmed();

	/**
	 * Returns the meta object for enum '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy <em>Search Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Strategy</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy
	 * @generated
	 */
	EEnum getSearchStrategy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	M2TWeavingFactory getM2TWeavingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingModelImpl <em>Weaving Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingModelImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingPackageImpl#getWeavingModel()
		 * @generated
		 */
		EClass WEAVING_MODEL = eINSTANCE.getWeavingModel();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAVING_MODEL__LINKS = eINSTANCE.getWeavingModel_Links();

		/**
		 * The meta object literal for the '<em><b>Find Link For PLM Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEAVING_MODEL___FIND_LINK_FOR_PLM_ELEMENT__ELEMENT = eINSTANCE.getWeavingModel__FindLinkForPLMElement__Element();

		/**
		 * The meta object literal for the '<em><b>Find Text Element For Offset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEAVING_MODEL___FIND_TEXT_ELEMENT_FOR_OFFSET__INT = eINSTANCE.getWeavingModel__FindTextElementForOffset__int();

		/**
		 * The meta object literal for the '<em><b>Find Text Element For Offset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEAVING_MODEL___FIND_TEXT_ELEMENT_FOR_OFFSET__INT_SEARCHSTRATEGY = eINSTANCE.getWeavingModel__FindTextElementForOffset__int_SearchStrategy();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingModelContentImpl <em>Weaving Model Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingModelContentImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingPackageImpl#getWeavingModelContent()
		 * @generated
		 */
		EClass WEAVING_MODEL_CONTENT = eINSTANCE.getWeavingModelContent();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingLinkImpl <em>Weaving Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingLinkImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingPackageImpl#getWeavingLink()
		 * @generated
		 */
		EClass WEAVING_LINK = eINSTANCE.getWeavingLink();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAVING_LINK__MODEL_ELEMENT = eINSTANCE.getWeavingLink_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAVING_LINK__CHILDREN = eINSTANCE.getWeavingLink_Children();

		/**
		 * The meta object literal for the '<em><b>Calculate Offset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEAVING_LINK___CALCULATE_OFFSET = eINSTANCE.getWeavingLink__CalculateOffset();

		/**
		 * The meta object literal for the '<em><b>Calculate Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEAVING_LINK___CALCULATE_LENGTH = eINSTANCE.getWeavingLink__CalculateLength();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.TextElementImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__OFFSET = eINSTANCE.getTextElement_Offset();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__LENGTH = eINSTANCE.getTextElement_Length();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__TEXT = eINSTANCE.getTextElement_Text();

		/**
		 * The meta object literal for the '<em><b>Get Length Trimmed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_ELEMENT___GET_LENGTH_TRIMMED = eINSTANCE.getTextElement__GetLengthTrimmed();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy <em>Search Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.M2TWeavingPackageImpl#getSearchStrategy()
		 * @generated
		 */
		EEnum SEARCH_STRATEGY = eINSTANCE.getSearchStrategy();

	}

} //M2TWeavingPackage
