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
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_RESULT_MODEL_OPERATION_COUNT = 0;

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
	 * The number of operations of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_OPERATION_COUNT = 0;

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
	 * The number of operations of the '<em>Composite Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CHECK_OPERATION_COUNT = CHECK_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>Name Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_COMPARISON_OPERATION_COUNT = CHECK_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>Durability Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURABILITY_COMPARISON_OPERATION_COUNT = CHECK_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>Mutability Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTABILITY_COMPARISON_OPERATION_COUNT = CHECK_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>Datatype Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_COMPARISON_OPERATION_COUNT = CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.AllConnectionsCheckImpl <em>All Connections Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.AllConnectionsCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getAllConnectionsCheck()
	 * @generated
	 */
	int ALL_CONNECTIONS_CHECK = 7;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONNECTIONS_CHECK__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONNECTIONS_CHECK__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONNECTIONS_CHECK__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONNECTIONS_CHECK__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONNECTIONS_CHECK__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONNECTIONS_CHECK__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The feature id for the '<em><b>No Type Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONNECTIONS_CHECK__NO_TYPE_CONNECTION = COMPOSITE_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Connections Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONNECTIONS_CHECK_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Connections Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONNECTIONS_CHECK_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.TypeConnectionSearchImpl <em>Type Connection Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.TypeConnectionSearchImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getTypeConnectionSearch()
	 * @generated
	 */
	int TYPE_CONNECTION_SEARCH = 8;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONNECTION_SEARCH__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONNECTION_SEARCH__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONNECTION_SEARCH__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONNECTION_SEARCH__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONNECTION_SEARCH__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONNECTION_SEARCH__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The feature id for the '<em><b>Type Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONNECTION_SEARCH__TYPE_CONNECTION = COMPOSITE_CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No Searched Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONNECTION_SEARCH__NO_SEARCHED_CONNECTIONS = COMPOSITE_CHECK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Connection Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONNECTION_SEARCH_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Connection Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONNECTION_SEARCH_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ExpressedInstanceExcludedCheckImpl <em>Expressed Instance Excluded Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ExpressedInstanceExcludedCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getExpressedInstanceExcludedCheck()
	 * @generated
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK = 9;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The feature id for the '<em><b>Expressed Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK__EXPRESSED_TYPES = COMPOSITE_CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affected Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_TYPES = COMPOSITE_CHECK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disjoint Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK__DISJOINT_SIBLINGS = COMPOSITE_CHECK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Affected Disjoint Intersection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_DISJOINT_INTERSECTION = COMPOSITE_CHECK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Expressed Instance Excluded Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 4;


	/**
	 * The number of operations of the '<em>Expressed Instance Excluded Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSED_INSTANCE_EXCLUDED_CHECK_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MultiplicityCheckImpl <em>Multiplicity Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MultiplicityCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getMultiplicityCheck()
	 * @generated
	 */
	int MULTIPLICITY_CHECK = 10;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_CHECK__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_CHECK__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_CHECK__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_CHECK__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_CHECK__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_CHECK__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The feature id for the '<em><b>No Of Domain Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_CHECK__NO_OF_DOMAIN_CONNECTION = COMPOSITE_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiplicity Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_CHECK_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiplicity Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_CHECK_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MultiplicityRoleNameCheckImpl <em>Multiplicity Role Name Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MultiplicityRoleNameCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getMultiplicityRoleNameCheck()
	 * @generated
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK = 11;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK__LOWER = COMPOSITE_CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK__UPPER = COMPOSITE_CHECK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Counts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK__COUNTS = COMPOSITE_CHECK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK__ROLE_NAME = COMPOSITE_CHECK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multiplicity Role Name Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Multiplicity Role Name Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ROLE_NAME_CHECK_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNamePropertyConformanceCheckImpl <em>Role Name Property Conformance Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNamePropertyConformanceCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getRoleNamePropertyConformanceCheck()
	 * @generated
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK = 12;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__ROLE_NAME = COMPOSITE_CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__TYPE_PARTICIPANT = COMPOSITE_CHECK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__INSTANCE_PARTICIPANT = COMPOSITE_CHECK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role Name Property Conformance Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 3;


	/**
	 * The number of operations of the '<em>Role Name Property Conformance Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_PROPERTY_CONFORMANCE_CHECK_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNameLocalConformanceCheckImpl <em>Role Name Local Conformance Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNameLocalConformanceCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getRoleNameLocalConformanceCheck()
	 * @generated
	 */
	int ROLE_NAME_LOCAL_CONFORMANCE_CHECK = 13;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_LOCAL_CONFORMANCE_CHECK__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_LOCAL_CONFORMANCE_CHECK__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_LOCAL_CONFORMANCE_CHECK__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_LOCAL_CONFORMANCE_CHECK__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_LOCAL_CONFORMANCE_CHECK__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_LOCAL_CONFORMANCE_CHECK__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_LOCAL_CONFORMANCE_CHECK__ROLE_NAME = COMPOSITE_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Name Local Conformance Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_LOCAL_CONFORMANCE_CHECK_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 1;


	/**
	 * The number of operations of the '<em>Role Name Local Conformance Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_LOCAL_CONFORMANCE_CHECK_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ConnectionsLocalConformanceCheckImpl <em>Connections Local Conformance Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ConnectionsLocalConformanceCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getConnectionsLocalConformanceCheck()
	 * @generated
	 */
	int CONNECTIONS_LOCAL_CONFORMANCE_CHECK = 14;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_LOCAL_CONFORMANCE_CHECK__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_LOCAL_CONFORMANCE_CHECK__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_LOCAL_CONFORMANCE_CHECK__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_LOCAL_CONFORMANCE_CHECK__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_LOCAL_CONFORMANCE_CHECK__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_LOCAL_CONFORMANCE_CHECK__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The feature id for the '<em><b>No Type Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_LOCAL_CONFORMANCE_CHECK__NO_TYPE_CONNECTIONS = COMPOSITE_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connections Local Conformance Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_LOCAL_CONFORMANCE_CHECK_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 1;


	/**
	 * The number of operations of the '<em>Connections Local Conformance Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_LOCAL_CONFORMANCE_CHECK_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LocalConformanceCheckImpl <em>Local Conformance Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LocalConformanceCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getLocalConformanceCheck()
	 * @generated
	 */
	int LOCAL_CONFORMANCE_CHECK = 15;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONFORMANCE_CHECK__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONFORMANCE_CHECK__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONFORMANCE_CHECK__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONFORMANCE_CHECK__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONFORMANCE_CHECK__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONFORMANCE_CHECK__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The number of structural features of the '<em>Local Conformance Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONFORMANCE_CHECK_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Conformance Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONFORMANCE_CHECK_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.TypeFeatureCheckImpl <em>Type Feature Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.TypeFeatureCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getTypeFeatureCheck()
	 * @generated
	 */
	int TYPE_FEATURE_CHECK = 16;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_CHECK__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_CHECK__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_CHECK__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_CHECK__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_CHECK__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_CHECK__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The feature id for the '<em><b>No Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_CHECK__NO_FEATURES = COMPOSITE_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Feature Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_CHECK_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Feature Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_CHECK_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.FeatureSearchCheckImpl <em>Feature Search Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.FeatureSearchCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getFeatureSearchCheck()
	 * @generated
	 */
	int FEATURE_SEARCH_CHECK = 17;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEARCH_CHECK__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEARCH_CHECK__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEARCH_CHECK__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEARCH_CHECK__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEARCH_CHECK__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEARCH_CHECK__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The feature id for the '<em><b>No Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEARCH_CHECK__NO_FEATURES = COMPOSITE_CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEARCH_CHECK__TYPE_FEATURE = COMPOSITE_CHECK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Search Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEARCH_CHECK_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Search Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SEARCH_CHECK_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.FeatureConformanceCheckImpl <em>Feature Conformance Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.FeatureConformanceCheckImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getFeatureConformanceCheck()
	 * @generated
	 */
	int FEATURE_CONFORMANCE_CHECK = 18;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFORMANCE_CHECK__RESULT = COMPOSITE_CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFORMANCE_CHECK__EXPRESSION = COMPOSITE_CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFORMANCE_CHECK__CHECK = COMPOSITE_CHECK__CHECK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFORMANCE_CHECK__NAME = COMPOSITE_CHECK__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFORMANCE_CHECK__SOURCE = COMPOSITE_CHECK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFORMANCE_CHECK__TARGET = COMPOSITE_CHECK__TARGET;

	/**
	 * The number of structural features of the '<em>Feature Conformance Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFORMANCE_CHECK_FEATURE_COUNT = COMPOSITE_CHECK_FEATURE_COUNT + 0;


	/**
	 * The number of operations of the '<em>Feature Conformance Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFORMANCE_CHECK_OPERATION_COUNT = COMPOSITE_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LevelComparisonImpl <em>Level Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LevelComparisonImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getLevelComparison()
	 * @generated
	 */
	int LEVEL_COMPARISON = 19;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_COMPARISON__RESULT = CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_COMPARISON__EXPRESSION = CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Target Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_COMPARISON__TARGET_LEVEL = CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_COMPARISON__INSTANCE_LEVEL = CHECK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Level Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_COMPARISON_FEATURE_COUNT = CHECK_FEATURE_COUNT + 2;


	/**
	 * The number of operations of the '<em>Level Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_COMPARISON_OPERATION_COUNT = CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ValueComparisonImpl <em>Value Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ValueComparisonImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getValueComparison()
	 * @generated
	 */
	int VALUE_COMPARISON = 20;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON__RESULT = CHECK__RESULT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON__EXPRESSION = CHECK__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON__SOURCE = CHECK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON__TARGET = CHECK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON_FEATURE_COUNT = CHECK_FEATURE_COUNT + 2;


	/**
	 * The number of operations of the '<em>Value Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON_OPERATION_COUNT = CHECK_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck <em>All Connections Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Connections Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck
	 * @generated
	 */
	EClass getAllConnectionsCheck();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck#getNoTypeConnection <em>No Type Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Type Connection</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck#getNoTypeConnection()
	 * @see #getAllConnectionsCheck()
	 * @generated
	 */
	EAttribute getAllConnectionsCheck_NoTypeConnection();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch <em>Type Connection Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Connection Search</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch
	 * @generated
	 */
	EClass getTypeConnectionSearch();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch#getTypeConnection <em>Type Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Connection</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch#getTypeConnection()
	 * @see #getTypeConnectionSearch()
	 * @generated
	 */
	EReference getTypeConnectionSearch_TypeConnection();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch#getNoSearchedConnections <em>No Searched Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Searched Connections</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch#getNoSearchedConnections()
	 * @see #getTypeConnectionSearch()
	 * @generated
	 */
	EAttribute getTypeConnectionSearch_NoSearchedConnections();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck <em>Expressed Instance Excluded Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expressed Instance Excluded Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck
	 * @generated
	 */
	EClass getExpressedInstanceExcludedCheck();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getExpressedTypes <em>Expressed Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expressed Types</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getExpressedTypes()
	 * @see #getExpressedInstanceExcludedCheck()
	 * @generated
	 */
	EReference getExpressedInstanceExcludedCheck_ExpressedTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getAffectedTypes <em>Affected Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Types</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getAffectedTypes()
	 * @see #getExpressedInstanceExcludedCheck()
	 * @generated
	 */
	EReference getExpressedInstanceExcludedCheck_AffectedTypes();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getDisjointSiblings <em>Disjoint Siblings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disjoint Siblings</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getDisjointSiblings()
	 * @see #getExpressedInstanceExcludedCheck()
	 * @generated
	 */
	EReference getExpressedInstanceExcludedCheck_DisjointSiblings();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getAffectedDisjointIntersection <em>Affected Disjoint Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Disjoint Intersection</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getAffectedDisjointIntersection()
	 * @see #getExpressedInstanceExcludedCheck()
	 * @generated
	 */
	EReference getExpressedInstanceExcludedCheck_AffectedDisjointIntersection();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck <em>Multiplicity Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck
	 * @generated
	 */
	EClass getMultiplicityCheck();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck#getNoOfDomainConnection <em>No Of Domain Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Of Domain Connection</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck#getNoOfDomainConnection()
	 * @see #getMultiplicityCheck()
	 * @generated
	 */
	EAttribute getMultiplicityCheck_NoOfDomainConnection();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck <em>Multiplicity Role Name Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Role Name Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck
	 * @generated
	 */
	EClass getMultiplicityRoleNameCheck();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck#getLower()
	 * @see #getMultiplicityRoleNameCheck()
	 * @generated
	 */
	EAttribute getMultiplicityRoleNameCheck_Lower();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck#getUpper()
	 * @see #getMultiplicityRoleNameCheck()
	 * @generated
	 */
	EAttribute getMultiplicityRoleNameCheck_Upper();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck#getCounts <em>Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Counts</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck#getCounts()
	 * @see #getMultiplicityRoleNameCheck()
	 * @generated
	 */
	EAttribute getMultiplicityRoleNameCheck_Counts();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck#getRoleName()
	 * @see #getMultiplicityRoleNameCheck()
	 * @generated
	 */
	EAttribute getMultiplicityRoleNameCheck_RoleName();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck <em>Role Name Property Conformance Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name Property Conformance Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck
	 * @generated
	 */
	EClass getRoleNamePropertyConformanceCheck();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck#getRoleName()
	 * @see #getRoleNamePropertyConformanceCheck()
	 * @generated
	 */
	EAttribute getRoleNamePropertyConformanceCheck_RoleName();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck#getTypeParticipant <em>Type Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Participant</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck#getTypeParticipant()
	 * @see #getRoleNamePropertyConformanceCheck()
	 * @generated
	 */
	EReference getRoleNamePropertyConformanceCheck_TypeParticipant();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck#getInstanceParticipant <em>Instance Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Participant</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck#getInstanceParticipant()
	 * @see #getRoleNamePropertyConformanceCheck()
	 * @generated
	 */
	EReference getRoleNamePropertyConformanceCheck_InstanceParticipant();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNameLocalConformanceCheck <em>Role Name Local Conformance Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name Local Conformance Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNameLocalConformanceCheck
	 * @generated
	 */
	EClass getRoleNameLocalConformanceCheck();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNameLocalConformanceCheck#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNameLocalConformanceCheck#getRoleName()
	 * @see #getRoleNameLocalConformanceCheck()
	 * @generated
	 */
	EAttribute getRoleNameLocalConformanceCheck_RoleName();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck <em>Connections Local Conformance Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections Local Conformance Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck
	 * @generated
	 */
	EClass getConnectionsLocalConformanceCheck();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck#getNoTypeConnections <em>No Type Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Type Connections</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck#getNoTypeConnections()
	 * @see #getConnectionsLocalConformanceCheck()
	 * @generated
	 */
	EAttribute getConnectionsLocalConformanceCheck_NoTypeConnections();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LocalConformanceCheck <em>Local Conformance Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Conformance Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LocalConformanceCheck
	 * @generated
	 */
	EClass getLocalConformanceCheck();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeFeatureCheck <em>Type Feature Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Feature Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeFeatureCheck
	 * @generated
	 */
	EClass getTypeFeatureCheck();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeFeatureCheck#getNoFeatures <em>No Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Features</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeFeatureCheck#getNoFeatures()
	 * @see #getTypeFeatureCheck()
	 * @generated
	 */
	EAttribute getTypeFeatureCheck_NoFeatures();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck <em>Feature Search Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Search Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck
	 * @generated
	 */
	EClass getFeatureSearchCheck();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck#getNoFeatures <em>No Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Features</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck#getNoFeatures()
	 * @see #getFeatureSearchCheck()
	 * @generated
	 */
	EAttribute getFeatureSearchCheck_NoFeatures();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck#getTypeFeature <em>Type Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Feature</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck#getTypeFeature()
	 * @see #getFeatureSearchCheck()
	 * @generated
	 */
	EReference getFeatureSearchCheck_TypeFeature();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureConformanceCheck <em>Feature Conformance Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Conformance Check</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureConformanceCheck
	 * @generated
	 */
	EClass getFeatureConformanceCheck();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison <em>Level Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level Comparison</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison
	 * @generated
	 */
	EClass getLevelComparison();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison#getTargetLevel <em>Target Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Level</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison#getTargetLevel()
	 * @see #getLevelComparison()
	 * @generated
	 */
	EAttribute getLevelComparison_TargetLevel();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison#getInstanceLevel <em>Instance Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Level</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison#getInstanceLevel()
	 * @see #getLevelComparison()
	 * @generated
	 */
	EAttribute getLevelComparison_InstanceLevel();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ValueComparison <em>Value Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Comparison</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ValueComparison
	 * @generated
	 */
	EClass getValueComparison();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ValueComparison#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ValueComparison#getSource()
	 * @see #getValueComparison()
	 * @generated
	 */
	EReference getValueComparison_Source();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ValueComparison#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ValueComparison#getTarget()
	 * @see #getValueComparison()
	 * @generated
	 */
	EReference getValueComparison_Target();

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

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.AllConnectionsCheckImpl <em>All Connections Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.AllConnectionsCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getAllConnectionsCheck()
		 * @generated
		 */
		EClass ALL_CONNECTIONS_CHECK = eINSTANCE.getAllConnectionsCheck();

		/**
		 * The meta object literal for the '<em><b>No Type Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONNECTIONS_CHECK__NO_TYPE_CONNECTION = eINSTANCE.getAllConnectionsCheck_NoTypeConnection();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.TypeConnectionSearchImpl <em>Type Connection Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.TypeConnectionSearchImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getTypeConnectionSearch()
		 * @generated
		 */
		EClass TYPE_CONNECTION_SEARCH = eINSTANCE.getTypeConnectionSearch();

		/**
		 * The meta object literal for the '<em><b>Type Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CONNECTION_SEARCH__TYPE_CONNECTION = eINSTANCE.getTypeConnectionSearch_TypeConnection();

		/**
		 * The meta object literal for the '<em><b>No Searched Connections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_CONNECTION_SEARCH__NO_SEARCHED_CONNECTIONS = eINSTANCE.getTypeConnectionSearch_NoSearchedConnections();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ExpressedInstanceExcludedCheckImpl <em>Expressed Instance Excluded Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ExpressedInstanceExcludedCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getExpressedInstanceExcludedCheck()
		 * @generated
		 */
		EClass EXPRESSED_INSTANCE_EXCLUDED_CHECK = eINSTANCE.getExpressedInstanceExcludedCheck();

		/**
		 * The meta object literal for the '<em><b>Expressed Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSED_INSTANCE_EXCLUDED_CHECK__EXPRESSED_TYPES = eINSTANCE.getExpressedInstanceExcludedCheck_ExpressedTypes();

		/**
		 * The meta object literal for the '<em><b>Affected Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_TYPES = eINSTANCE.getExpressedInstanceExcludedCheck_AffectedTypes();

		/**
		 * The meta object literal for the '<em><b>Disjoint Siblings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSED_INSTANCE_EXCLUDED_CHECK__DISJOINT_SIBLINGS = eINSTANCE.getExpressedInstanceExcludedCheck_DisjointSiblings();

		/**
		 * The meta object literal for the '<em><b>Affected Disjoint Intersection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_DISJOINT_INTERSECTION = eINSTANCE.getExpressedInstanceExcludedCheck_AffectedDisjointIntersection();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MultiplicityCheckImpl <em>Multiplicity Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MultiplicityCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getMultiplicityCheck()
		 * @generated
		 */
		EClass MULTIPLICITY_CHECK = eINSTANCE.getMultiplicityCheck();

		/**
		 * The meta object literal for the '<em><b>No Of Domain Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_CHECK__NO_OF_DOMAIN_CONNECTION = eINSTANCE.getMultiplicityCheck_NoOfDomainConnection();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MultiplicityRoleNameCheckImpl <em>Multiplicity Role Name Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MultiplicityRoleNameCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getMultiplicityRoleNameCheck()
		 * @generated
		 */
		EClass MULTIPLICITY_ROLE_NAME_CHECK = eINSTANCE.getMultiplicityRoleNameCheck();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ROLE_NAME_CHECK__LOWER = eINSTANCE.getMultiplicityRoleNameCheck_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ROLE_NAME_CHECK__UPPER = eINSTANCE.getMultiplicityRoleNameCheck_Upper();

		/**
		 * The meta object literal for the '<em><b>Counts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ROLE_NAME_CHECK__COUNTS = eINSTANCE.getMultiplicityRoleNameCheck_Counts();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ROLE_NAME_CHECK__ROLE_NAME = eINSTANCE.getMultiplicityRoleNameCheck_RoleName();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNamePropertyConformanceCheckImpl <em>Role Name Property Conformance Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNamePropertyConformanceCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getRoleNamePropertyConformanceCheck()
		 * @generated
		 */
		EClass ROLE_NAME_PROPERTY_CONFORMANCE_CHECK = eINSTANCE.getRoleNamePropertyConformanceCheck();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__ROLE_NAME = eINSTANCE.getRoleNamePropertyConformanceCheck_RoleName();

		/**
		 * The meta object literal for the '<em><b>Type Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__TYPE_PARTICIPANT = eINSTANCE.getRoleNamePropertyConformanceCheck_TypeParticipant();

		/**
		 * The meta object literal for the '<em><b>Instance Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__INSTANCE_PARTICIPANT = eINSTANCE.getRoleNamePropertyConformanceCheck_InstanceParticipant();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNameLocalConformanceCheckImpl <em>Role Name Local Conformance Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNameLocalConformanceCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getRoleNameLocalConformanceCheck()
		 * @generated
		 */
		EClass ROLE_NAME_LOCAL_CONFORMANCE_CHECK = eINSTANCE.getRoleNameLocalConformanceCheck();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_NAME_LOCAL_CONFORMANCE_CHECK__ROLE_NAME = eINSTANCE.getRoleNameLocalConformanceCheck_RoleName();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ConnectionsLocalConformanceCheckImpl <em>Connections Local Conformance Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ConnectionsLocalConformanceCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getConnectionsLocalConformanceCheck()
		 * @generated
		 */
		EClass CONNECTIONS_LOCAL_CONFORMANCE_CHECK = eINSTANCE.getConnectionsLocalConformanceCheck();

		/**
		 * The meta object literal for the '<em><b>No Type Connections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_LOCAL_CONFORMANCE_CHECK__NO_TYPE_CONNECTIONS = eINSTANCE.getConnectionsLocalConformanceCheck_NoTypeConnections();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LocalConformanceCheckImpl <em>Local Conformance Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LocalConformanceCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getLocalConformanceCheck()
		 * @generated
		 */
		EClass LOCAL_CONFORMANCE_CHECK = eINSTANCE.getLocalConformanceCheck();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.TypeFeatureCheckImpl <em>Type Feature Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.TypeFeatureCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getTypeFeatureCheck()
		 * @generated
		 */
		EClass TYPE_FEATURE_CHECK = eINSTANCE.getTypeFeatureCheck();

		/**
		 * The meta object literal for the '<em><b>No Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_FEATURE_CHECK__NO_FEATURES = eINSTANCE.getTypeFeatureCheck_NoFeatures();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.FeatureSearchCheckImpl <em>Feature Search Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.FeatureSearchCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getFeatureSearchCheck()
		 * @generated
		 */
		EClass FEATURE_SEARCH_CHECK = eINSTANCE.getFeatureSearchCheck();

		/**
		 * The meta object literal for the '<em><b>No Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SEARCH_CHECK__NO_FEATURES = eINSTANCE.getFeatureSearchCheck_NoFeatures();

		/**
		 * The meta object literal for the '<em><b>Type Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SEARCH_CHECK__TYPE_FEATURE = eINSTANCE.getFeatureSearchCheck_TypeFeature();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.FeatureConformanceCheckImpl <em>Feature Conformance Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.FeatureConformanceCheckImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getFeatureConformanceCheck()
		 * @generated
		 */
		EClass FEATURE_CONFORMANCE_CHECK = eINSTANCE.getFeatureConformanceCheck();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LevelComparisonImpl <em>Level Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LevelComparisonImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getLevelComparison()
		 * @generated
		 */
		EClass LEVEL_COMPARISON = eINSTANCE.getLevelComparison();

		/**
		 * The meta object literal for the '<em><b>Target Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL_COMPARISON__TARGET_LEVEL = eINSTANCE.getLevelComparison_TargetLevel();

		/**
		 * The meta object literal for the '<em><b>Instance Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL_COMPARISON__INSTANCE_LEVEL = eINSTANCE.getLevelComparison_InstanceLevel();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ValueComparisonImpl <em>Value Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ValueComparisonImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultPackageImpl#getValueComparison()
		 * @generated
		 */
		EClass VALUE_COMPARISON = eINSTANCE.getValueComparison();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_COMPARISON__SOURCE = eINSTANCE.getValueComparison_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_COMPARISON__TARGET = eINSTANCE.getValueComparison_Target();

	}

} //ReasoningResultPackage
