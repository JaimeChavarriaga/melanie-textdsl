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

import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

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
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface TextualrepresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "textualrepresentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://swt.informatik.uni-mannheim.de/MLM/textualrepresentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "textualrepresentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextualrepresentationPackage eINSTANCE = de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualDSLVisualizerImpl <em>Textual DSL Visualizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualDSLVisualizerImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getTextualDSLVisualizer()
	 * @generated
	 */
	int TEXTUAL_DSL_VISUALIZER = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DSL_VISUALIZER__CONTENT = PLMPackage.ABSTRACT_DSL_VISUALIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DSL_VISUALIZER__ROOT = PLMPackage.ABSTRACT_DSL_VISUALIZER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Textual DSL Visualizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DSL_VISUALIZER_FEATURE_COUNT = PLMPackage.ABSTRACT_DSL_VISUALIZER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Containing PLM Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DSL_VISUALIZER___GET_CONTAINING_PLM_ELEMENT = PLMPackage.ABSTRACT_DSL_VISUALIZER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Containing LML Visualizer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DSL_VISUALIZER___GET_CONTAINING_LML_VISUALIZER = PLMPackage.ABSTRACT_DSL_VISUALIZER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Textual DSL Visualizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DSL_VISUALIZER_OPERATION_COUNT = PLMPackage.ABSTRACT_DSL_VISUALIZER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualVisualizationDescriptorImpl <em>Textual Visualization Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualVisualizationDescriptorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getTextualVisualizationDescriptor()
	 * @generated
	 */
	int TEXTUAL_VISUALIZATION_DESCRIPTOR = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_VISUALIZATION_DESCRIPTOR__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Textual Visualization Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_VISUALIZATION_DESCRIPTOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Containing PLM Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_PLM_ELEMENT = 0;

	/**
	 * The operation id for the '<em>Get Containing Textual Visualizer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_TEXTUAL_VISUALIZER = 1;

	/**
	 * The number of operations of the '<em>Textual Visualization Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_VISUALIZATION_DESCRIPTOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.LiteralImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__EXPRESSION = TEXTUAL_VISUALIZATION_DESCRIPTOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__COLOR = TEXTUAL_VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LOWER = TEXTUAL_VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__UPPER = TEXTUAL_VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = TEXTUAL_VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Containing PLM Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL___GET_CONTAINING_PLM_ELEMENT = TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_PLM_ELEMENT;

	/**
	 * The operation id for the '<em>Get Containing Textual Visualizer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL___GET_CONTAINING_TEXTUAL_VISUALIZER = TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_TEXTUAL_VISUALIZER;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = TEXTUAL_VISUALIZATION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.ValueImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__EXPRESSION = TEXTUAL_VISUALIZATION_DESCRIPTOR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = TEXTUAL_VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Containing PLM Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___GET_CONTAINING_PLM_ELEMENT = TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_PLM_ELEMENT;

	/**
	 * The operation id for the '<em>Get Containing Textual Visualizer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___GET_CONTAINING_TEXTUAL_VISUALIZER = TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_TEXTUAL_VISUALIZER;

	/**
	 * The operation id for the '<em>Is Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___IS_ATTRIBUTE = TEXTUAL_VISUALIZATION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = TEXTUAL_VISUALIZATION_DESCRIPTOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.LiteralChoiceImpl <em>Literal Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.LiteralChoiceImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getLiteralChoice()
	 * @generated
	 */
	int LITERAL_CHOICE = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHOICE__EXPRESSION = TEXTUAL_VISUALIZATION_DESCRIPTOR__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHOICE__CHOICES = TEXTUAL_VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHOICE_FEATURE_COUNT = TEXTUAL_VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Containing PLM Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHOICE___GET_CONTAINING_PLM_ELEMENT = TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_PLM_ELEMENT;

	/**
	 * The operation id for the '<em>Get Containing Textual Visualizer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHOICE___GET_CONTAINING_TEXTUAL_VISUALIZER = TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_TEXTUAL_VISUALIZER;

	/**
	 * The number of operations of the '<em>Literal Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CHOICE_OPERATION_COUNT = TEXTUAL_VISUALIZATION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.AbstractColorImpl <em>Abstract Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.AbstractColorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getAbstractColor()
	 * @generated
	 */
	int ABSTRACT_COLOR = 5;

	/**
	 * The number of structural features of the '<em>Abstract Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.StandardColorImpl <em>Standard Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.StandardColorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getStandardColor()
	 * @generated
	 */
	int STANDARD_COLOR = 6;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COLOR__COLOR = ABSTRACT_COLOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Standard Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COLOR_FEATURE_COUNT = ABSTRACT_COLOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Standard Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COLOR_OPERATION_COUNT = ABSTRACT_COLOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.RGBColorImpl <em>RGB Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.RGBColorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getRGBColor()
	 * @generated
	 */
	int RGB_COLOR = 7;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__R = ABSTRACT_COLOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__G = ABSTRACT_COLOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR__B = ABSTRACT_COLOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RGB Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_FEATURE_COUNT = ABSTRACT_COLOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>RGB Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_COLOR_OPERATION_COUNT = ABSTRACT_COLOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.ColorEnum <em>Color Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.ColorEnum
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getColorEnum()
	 * @generated
	 */
	int COLOR_ENUM = 8;


	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer <em>Textual DSL Visualizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual DSL Visualizer</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer
	 * @generated
	 */
	EClass getTextualDSLVisualizer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#getContent()
	 * @see #getTextualDSLVisualizer()
	 * @generated
	 */
	EReference getTextualDSLVisualizer_Content();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#getRoot()
	 * @see #getTextualDSLVisualizer()
	 * @generated
	 */
	EReference getTextualDSLVisualizer_Root();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#getContainingPLMElement() <em>Get Containing PLM Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containing PLM Element</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#getContainingPLMElement()
	 * @generated
	 */
	EOperation getTextualDSLVisualizer__GetContainingPLMElement();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#getContainingLMLVisualizer() <em>Get Containing LML Visualizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containing LML Visualizer</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#getContainingLMLVisualizer()
	 * @generated
	 */
	EOperation getTextualDSLVisualizer__GetContainingLMLVisualizer();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor <em>Textual Visualization Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Visualization Descriptor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor
	 * @generated
	 */
	EClass getTextualVisualizationDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor#getExpression()
	 * @see #getTextualVisualizationDescriptor()
	 * @generated
	 */
	EAttribute getTextualVisualizationDescriptor_Expression();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor#getContainingPLMElement() <em>Get Containing PLM Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containing PLM Element</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor#getContainingPLMElement()
	 * @generated
	 */
	EOperation getTextualVisualizationDescriptor__GetContainingPLMElement();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor#getContainingTextualVisualizer() <em>Get Containing Textual Visualizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Containing Textual Visualizer</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor#getContainingTextualVisualizer()
	 * @generated
	 */
	EOperation getTextualVisualizationDescriptor__GetContainingTextualVisualizer();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal#getColor()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_Color();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal#getLower()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Lower();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal#getUpper()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Upper();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value#isAttribute() <em>Is Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Attribute</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value#isAttribute()
	 * @generated
	 */
	EOperation getValue__IsAttribute();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.LiteralChoice <em>Literal Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Choice</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.LiteralChoice
	 * @generated
	 */
	EClass getLiteralChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.LiteralChoice#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.LiteralChoice#getChoices()
	 * @see #getLiteralChoice()
	 * @generated
	 */
	EReference getLiteralChoice_Choices();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.AbstractColor <em>Abstract Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Color</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.AbstractColor
	 * @generated
	 */
	EClass getAbstractColor();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.StandardColor <em>Standard Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Color</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.StandardColor
	 * @generated
	 */
	EClass getStandardColor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.StandardColor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.StandardColor#getColor()
	 * @see #getStandardColor()
	 * @generated
	 */
	EAttribute getStandardColor_Color();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.RGBColor <em>RGB Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGB Color</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.RGBColor
	 * @generated
	 */
	EClass getRGBColor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.RGBColor#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.RGBColor#getR()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_R();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.RGBColor#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.RGBColor#getG()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_G();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.RGBColor#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.RGBColor#getB()
	 * @see #getRGBColor()
	 * @generated
	 */
	EAttribute getRGBColor_B();

	/**
	 * Returns the meta object for enum '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.ColorEnum <em>Color Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Enum</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.ColorEnum
	 * @generated
	 */
	EEnum getColorEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TextualrepresentationFactory getTextualrepresentationFactory();

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
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualDSLVisualizerImpl <em>Textual DSL Visualizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualDSLVisualizerImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getTextualDSLVisualizer()
		 * @generated
		 */
		EClass TEXTUAL_DSL_VISUALIZER = eINSTANCE.getTextualDSLVisualizer();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_DSL_VISUALIZER__CONTENT = eINSTANCE.getTextualDSLVisualizer_Content();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_DSL_VISUALIZER__ROOT = eINSTANCE.getTextualDSLVisualizer_Root();

		/**
		 * The meta object literal for the '<em><b>Get Containing PLM Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXTUAL_DSL_VISUALIZER___GET_CONTAINING_PLM_ELEMENT = eINSTANCE.getTextualDSLVisualizer__GetContainingPLMElement();

		/**
		 * The meta object literal for the '<em><b>Get Containing LML Visualizer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXTUAL_DSL_VISUALIZER___GET_CONTAINING_LML_VISUALIZER = eINSTANCE.getTextualDSLVisualizer__GetContainingLMLVisualizer();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualVisualizationDescriptorImpl <em>Textual Visualization Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualVisualizationDescriptorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getTextualVisualizationDescriptor()
		 * @generated
		 */
		EClass TEXTUAL_VISUALIZATION_DESCRIPTOR = eINSTANCE.getTextualVisualizationDescriptor();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_VISUALIZATION_DESCRIPTOR__EXPRESSION = eINSTANCE.getTextualVisualizationDescriptor_Expression();

		/**
		 * The meta object literal for the '<em><b>Get Containing PLM Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_PLM_ELEMENT = eINSTANCE.getTextualVisualizationDescriptor__GetContainingPLMElement();

		/**
		 * The meta object literal for the '<em><b>Get Containing Textual Visualizer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_TEXTUAL_VISUALIZER = eINSTANCE.getTextualVisualizationDescriptor__GetContainingTextualVisualizer();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.LiteralImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__COLOR = eINSTANCE.getLiteral_Color();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__LOWER = eINSTANCE.getLiteral_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__UPPER = eINSTANCE.getLiteral_Upper();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.ValueImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Is Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE___IS_ATTRIBUTE = eINSTANCE.getValue__IsAttribute();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.LiteralChoiceImpl <em>Literal Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.LiteralChoiceImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getLiteralChoice()
		 * @generated
		 */
		EClass LITERAL_CHOICE = eINSTANCE.getLiteralChoice();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_CHOICE__CHOICES = eINSTANCE.getLiteralChoice_Choices();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.AbstractColorImpl <em>Abstract Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.AbstractColorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getAbstractColor()
		 * @generated
		 */
		EClass ABSTRACT_COLOR = eINSTANCE.getAbstractColor();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.StandardColorImpl <em>Standard Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.StandardColorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getStandardColor()
		 * @generated
		 */
		EClass STANDARD_COLOR = eINSTANCE.getStandardColor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_COLOR__COLOR = eINSTANCE.getStandardColor_Color();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.RGBColorImpl <em>RGB Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.RGBColorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getRGBColor()
		 * @generated
		 */
		EClass RGB_COLOR = eINSTANCE.getRGBColor();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__R = eINSTANCE.getRGBColor_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__G = eINSTANCE.getRGBColor_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_COLOR__B = eINSTANCE.getRGBColor_B();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.ColorEnum <em>Color Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.ColorEnum
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getColorEnum()
		 * @generated
		 */
		EEnum COLOR_ENUM = eINSTANCE.getColorEnum();

	}

} //TextualrepresentationPackage
