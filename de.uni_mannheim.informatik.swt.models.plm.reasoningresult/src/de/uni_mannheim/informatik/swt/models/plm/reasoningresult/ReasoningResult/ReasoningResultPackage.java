/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory
 * @model kind="package"
 * @generated
 */
public interface ReasoningResultPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ReasoningResult";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://swt.informatik.uni-mannheim.de/ReasoningResult";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ReasoningResult";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReasoningResultPackage eINSTANCE = de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultModelImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getReasoningResultModel()
	 * @generated
	 */
	int REASONING_RESULT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_RESULT_MODEL__CHECK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_RESULT_MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_RESULT_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.CheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.CompositeCheckImpl <em>Composite Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.CompositeCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getCompositeCheck()
	 * @generated
	 */
	int COMPOSITE_CHECK = 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CHECK__RESULT = CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CHECK__EXPRESSION = CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CHECK__CHECK = CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CHECK__NAME = CHECK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CHECK__SOURCE = CHECK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CHECK__TARGET = CHECK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composite Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CHECK_FEATURE_COUNT = CHECK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.NameComparisonImpl <em>Name Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.NameComparisonImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getNameComparison()
	 * @generated
	 */
	int NAME_COMPARISON = 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_COMPARISON__RESULT = CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_COMPARISON__EXPRESSION = CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_COMPARISON__SOURCE = CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_COMPARISON__TARGET = CHECK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Name Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_COMPARISON_FEATURE_COUNT = CHECK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DurabilityComparisonImpl <em>Durability Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DurabilityComparisonImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getDurabilityComparison()
	 * @generated
	 */
	int DURABILITY_COMPARISON = 4;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURABILITY_COMPARISON__RESULT = CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURABILITY_COMPARISON__EXPRESSION = CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURABILITY_COMPARISON__SOURCE = CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURABILITY_COMPARISON__TARGET = CHECK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Durability Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURABILITY_COMPARISON_FEATURE_COUNT = CHECK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MutabilityComparisonImpl <em>Mutability Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MutabilityComparisonImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getMutabilityComparison()
	 * @generated
	 */
	int MUTABILITY_COMPARISON = 5;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABILITY_COMPARISON__RESULT = CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABILITY_COMPARISON__EXPRESSION = CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABILITY_COMPARISON__SOURCE = CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABILITY_COMPARISON__TARGET = CHECK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mutability Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABILITY_COMPARISON_FEATURE_COUNT = CHECK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DatatypeComparisonImpl <em>Datatype Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DatatypeComparisonImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getDatatypeComparison()
	 * @generated
	 */
	int DATATYPE_COMPARISON = 6;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_COMPARISON__RESULT = CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_COMPARISON__EXPRESSION = CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_COMPARISON__SOURCE = CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_COMPARISON__TARGET = CHECK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datatype Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_COMPARISON_FEATURE_COUNT = CHECK_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel
	 * @generated
	 */
	EClass getReasoningResultModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel#getCheck()
	 * @see #getReasoningResultModel()
	 * @generated
	 */
	EReference getReasoningResultModel_Check();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel#getName()
	 * @see #getReasoningResultModel()
	 * @generated
	 */
	EAttribute getReasoningResultModel_Name();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.Check#isResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.Check#isResult()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Result();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.Check#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.Check#getExpression()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Expression();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck <em>Composite Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck
	 * @generated
	 */
	EClass getCompositeCheck();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck#getCheck()
	 * @see #getCompositeCheck()
	 * @generated
	 */
	EReference getCompositeCheck_Check();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck#getName()
	 * @see #getCompositeCheck()
	 * @generated
	 */
	EAttribute getCompositeCheck_Name();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck#getSource()
	 * @see #getCompositeCheck()
	 * @generated
	 */
	EReference getCompositeCheck_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck#getTarget()
	 * @see #getCompositeCheck()
	 * @generated
	 */
	EReference getCompositeCheck_Target();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison <em>Name Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Comparison</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison
	 * @generated
	 */
	EClass getNameComparison();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison#getSource()
	 * @see #getNameComparison()
	 * @generated
	 */
	EReference getNameComparison_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison#getTarget()
	 * @see #getNameComparison()
	 * @generated
	 */
	EReference getNameComparison_Target();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison <em>Durability Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Durability Comparison</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison
	 * @generated
	 */
	EClass getDurabilityComparison();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getSource()
	 * @see #getDurabilityComparison()
	 * @generated
	 */
	EReference getDurabilityComparison_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getTarget()
	 * @see #getDurabilityComparison()
	 * @generated
	 */
	EReference getDurabilityComparison_Target();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison <em>Mutability Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutability Comparison</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison
	 * @generated
	 */
	EClass getMutabilityComparison();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison#getSource()
	 * @see #getMutabilityComparison()
	 * @generated
	 */
	EReference getMutabilityComparison_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison#getTarget()
	 * @see #getMutabilityComparison()
	 * @generated
	 */
	EReference getMutabilityComparison_Target();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison <em>Datatype Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Comparison</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison
	 * @generated
	 */
	EClass getDatatypeComparison();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison#getSource()
	 * @see #getDatatypeComparison()
	 * @generated
	 */
	EReference getDatatypeComparison_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison#getTarget()
	 * @see #getDatatypeComparison()
	 * @generated
	 */
	EReference getDatatypeComparison_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReasoningResultFactory getReasoningResultFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultModelImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getReasoningResultModel()
		 * @generated
		 */
		EClass REASONING_RESULT_MODEL = eINSTANCE.getReasoningResultModel();

		/**
		 * The meta object literal for the '<em><b>Check</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REASONING_RESULT_MODEL__CHECK = eINSTANCE.getReasoningResultModel_Check();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REASONING_RESULT_MODEL__NAME = eINSTANCE.getReasoningResultModel_Name();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.CheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__RESULT = eINSTANCE.getCheck_Result();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__EXPRESSION = eINSTANCE.getCheck_Expression();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.CompositeCheckImpl <em>Composite Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.CompositeCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getCompositeCheck()
		 * @generated
		 */
		EClass COMPOSITE_CHECK = eINSTANCE.getCompositeCheck();

		/**
		 * The meta object literal for the '<em><b>Check</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CHECK__CHECK = eINSTANCE.getCompositeCheck_Check();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CHECK__NAME = eINSTANCE.getCompositeCheck_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CHECK__SOURCE = eINSTANCE.getCompositeCheck_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CHECK__TARGET = eINSTANCE.getCompositeCheck_Target();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.NameComparisonImpl <em>Name Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.NameComparisonImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getNameComparison()
		 * @generated
		 */
		EClass NAME_COMPARISON = eINSTANCE.getNameComparison();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_COMPARISON__SOURCE = eINSTANCE.getNameComparison_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_COMPARISON__TARGET = eINSTANCE.getNameComparison_Target();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DurabilityComparisonImpl <em>Durability Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DurabilityComparisonImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getDurabilityComparison()
		 * @generated
		 */
		EClass DURABILITY_COMPARISON = eINSTANCE.getDurabilityComparison();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURABILITY_COMPARISON__SOURCE = eINSTANCE.getDurabilityComparison_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURABILITY_COMPARISON__TARGET = eINSTANCE.getDurabilityComparison_Target();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MutabilityComparisonImpl <em>Mutability Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MutabilityComparisonImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getMutabilityComparison()
		 * @generated
		 */
		EClass MUTABILITY_COMPARISON = eINSTANCE.getMutabilityComparison();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTABILITY_COMPARISON__SOURCE = eINSTANCE.getMutabilityComparison_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTABILITY_COMPARISON__TARGET = eINSTANCE.getMutabilityComparison_Target();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DatatypeComparisonImpl <em>Datatype Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DatatypeComparisonImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getDatatypeComparison()
		 * @generated
		 */
		EClass DATATYPE_COMPARISON = eINSTANCE.getDatatypeComparison();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_COMPARISON__SOURCE = eINSTANCE.getDatatypeComparison_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_COMPARISON__TARGET = eINSTANCE.getDatatypeComparison_Target();

	}

} //ReasoningResultPackage
