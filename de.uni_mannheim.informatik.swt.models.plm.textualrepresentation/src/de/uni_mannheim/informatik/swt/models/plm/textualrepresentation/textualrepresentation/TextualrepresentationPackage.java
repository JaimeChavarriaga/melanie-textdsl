/**
 */
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation;

import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Textual Visualization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DSL_VISUALIZER__TEXTUAL_VISUALIZATION = PLMPackage.ABSTRACT_VISUALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textual DSL Visualizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DSL_VISUALIZER_FEATURE_COUNT = PLMPackage.ABSTRACT_VISUALIZER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Textual Visualization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DSL_VISUALIZER___CREATE_TEXTUAL_VISUALIZATION = PLMPackage.ABSTRACT_VISUALIZER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Textual DSL Visualizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DSL_VISUALIZER_OPERATION_COUNT = PLMPackage.ABSTRACT_VISUALIZER_OPERATION_COUNT + 1;

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
	 * The number of operations of the '<em>Textual Visualization Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_VISUALIZATION_DESCRIPTOR_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = TEXTUAL_VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 0;

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
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = TEXTUAL_VISUALIZATION_DESCRIPTOR_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#getTextualVisualization <em>Textual Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Textual Visualization</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#getTextualVisualization()
	 * @see #getTextualDSLVisualizer()
	 * @generated
	 */
	EReference getTextualDSLVisualizer_TextualVisualization();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#createTextualVisualization() <em>Create Textual Visualization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Textual Visualization</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#createTextualVisualization()
	 * @generated
	 */
	EOperation getTextualDSLVisualizer__CreateTextualVisualization();

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
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal
	 * @generated
	 */
	EClass getLiteral();

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
		 * The meta object literal for the '<em><b>Textual Visualization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_DSL_VISUALIZER__TEXTUAL_VISUALIZATION = eINSTANCE.getTextualDSLVisualizer_TextualVisualization();

		/**
		 * The meta object literal for the '<em><b>Create Textual Visualization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXTUAL_DSL_VISUALIZER___CREATE_TEXTUAL_VISUALIZATION = eINSTANCE.getTextualDSLVisualizer__CreateTextualVisualization();

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
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.LiteralImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.ValueImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualrepresentationPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

	}

} //TextualrepresentationPackage
