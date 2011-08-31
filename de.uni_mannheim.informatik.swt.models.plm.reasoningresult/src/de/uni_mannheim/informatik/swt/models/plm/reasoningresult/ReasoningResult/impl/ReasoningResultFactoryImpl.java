/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReasoningResultFactoryImpl extends EFactoryImpl implements ReasoningResultFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReasoningResultFactory init() {
		try {
			ReasoningResultFactory theReasoningResultFactory = (ReasoningResultFactory)EPackage.Registry.INSTANCE.getEFactory("http://swt.informatik.uni-mannheim.de/ReasoningResult"); 
			if (theReasoningResultFactory != null) {
				return theReasoningResultFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReasoningResultFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningResultFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ReasoningResultPackage.REASONING_RESULT_MODEL: return createReasoningResultModel();
			case ReasoningResultPackage.COMPOSITE_CHECK: return createCompositeCheck();
			case ReasoningResultPackage.NAME_COMPARISON: return createNameComparison();
			case ReasoningResultPackage.DURABILITY_COMPARISON: return createDurabilityComparison();
			case ReasoningResultPackage.MUTABILITY_COMPARISON: return createMutabilityComparison();
			case ReasoningResultPackage.DATATYPE_COMPARISON: return createDatatypeComparison();
			case ReasoningResultPackage.ALL_CONNECTIONS_CHECK: return createAllConnectionsCheck();
			case ReasoningResultPackage.TYPE_CONNECTION_SEARCH: return createTypeConnectionSearch();
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK: return createExpressedInstanceExcludedCheck();
			case ReasoningResultPackage.MULTIPLICITY_CHECK: return createMultiplicityCheck();
			case ReasoningResultPackage.MULTIPLICITY_ROLE_NAME_CHECK: return createMultiplicityRoleNameCheck();
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK: return createRoleNamePropertyConformanceCheck();
			case ReasoningResultPackage.ROLE_NAME_LOCAL_CONFORMANCE_CHECK: return createRoleNameLocalConformanceCheck();
			case ReasoningResultPackage.CONNECTIONS_LOCAL_CONFORMANCE_CHECK: return createConnectionsLocalConformanceCheck();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningResultModel createReasoningResultModel() {
		ReasoningResultModelImpl reasoningResultModel = new ReasoningResultModelImpl();
		return reasoningResultModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCheck createCompositeCheck() {
		CompositeCheckImpl compositeCheck = new CompositeCheckImpl();
		return compositeCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameComparison createNameComparison() {
		NameComparisonImpl nameComparison = new NameComparisonImpl();
		return nameComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurabilityComparison createDurabilityComparison() {
		DurabilityComparisonImpl durabilityComparison = new DurabilityComparisonImpl();
		return durabilityComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutabilityComparison createMutabilityComparison() {
		MutabilityComparisonImpl mutabilityComparison = new MutabilityComparisonImpl();
		return mutabilityComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeComparison createDatatypeComparison() {
		DatatypeComparisonImpl datatypeComparison = new DatatypeComparisonImpl();
		return datatypeComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllConnectionsCheck createAllConnectionsCheck() {
		AllConnectionsCheckImpl allConnectionsCheck = new AllConnectionsCheckImpl();
		return allConnectionsCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConnectionSearch createTypeConnectionSearch() {
		TypeConnectionSearchImpl typeConnectionSearch = new TypeConnectionSearchImpl();
		return typeConnectionSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressedInstanceExcludedCheck createExpressedInstanceExcludedCheck() {
		ExpressedInstanceExcludedCheckImpl expressedInstanceExcludedCheck = new ExpressedInstanceExcludedCheckImpl();
		return expressedInstanceExcludedCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityCheck createMultiplicityCheck() {
		MultiplicityCheckImpl multiplicityCheck = new MultiplicityCheckImpl();
		return multiplicityCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityRoleNameCheck createMultiplicityRoleNameCheck() {
		MultiplicityRoleNameCheckImpl multiplicityRoleNameCheck = new MultiplicityRoleNameCheckImpl();
		return multiplicityRoleNameCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNamePropertyConformanceCheck createRoleNamePropertyConformanceCheck() {
		RoleNamePropertyConformanceCheckImpl roleNamePropertyConformanceCheck = new RoleNamePropertyConformanceCheckImpl();
		return roleNamePropertyConformanceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNameLocalConformanceCheck createRoleNameLocalConformanceCheck() {
		RoleNameLocalConformanceCheckImpl roleNameLocalConformanceCheck = new RoleNameLocalConformanceCheckImpl();
		return roleNameLocalConformanceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionsLocalConformanceCheck createConnectionsLocalConformanceCheck() {
		ConnectionsLocalConformanceCheckImpl connectionsLocalConformanceCheck = new ConnectionsLocalConformanceCheckImpl();
		return connectionsLocalConformanceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningResultPackage getReasoningResultPackage() {
		return (ReasoningResultPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReasoningResultPackage getPackage() {
		return ReasoningResultPackage.eINSTANCE;
	}

} //ReasoningResultFactoryImpl
