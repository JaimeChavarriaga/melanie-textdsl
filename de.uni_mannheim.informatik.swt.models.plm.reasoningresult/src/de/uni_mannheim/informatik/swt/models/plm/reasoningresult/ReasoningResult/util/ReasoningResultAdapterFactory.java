/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.util;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage
 * @generated
 */
public class ReasoningResultAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReasoningResultPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningResultAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReasoningResultPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasoningResultSwitch<Adapter> modelSwitch =
		new ReasoningResultSwitch<Adapter>() {
			@Override
			public Adapter caseReasoningResultModel(ReasoningResultModel object) {
				return createReasoningResultModelAdapter();
			}
			@Override
			public Adapter caseCheck(Check object) {
				return createCheckAdapter();
			}
			@Override
			public Adapter caseCompositeCheck(CompositeCheck object) {
				return createCompositeCheckAdapter();
			}
			@Override
			public Adapter caseNameComparison(NameComparison object) {
				return createNameComparisonAdapter();
			}
			@Override
			public Adapter caseDurabilityComparison(DurabilityComparison object) {
				return createDurabilityComparisonAdapter();
			}
			@Override
			public Adapter caseMutabilityComparison(MutabilityComparison object) {
				return createMutabilityComparisonAdapter();
			}
			@Override
			public Adapter caseDatatypeComparison(DatatypeComparison object) {
				return createDatatypeComparisonAdapter();
			}
			@Override
			public Adapter caseAllConnectionsCheck(AllConnectionsCheck object) {
				return createAllConnectionsCheckAdapter();
			}
			@Override
			public Adapter caseTypeConnectionSearch(TypeConnectionSearch object) {
				return createTypeConnectionSearchAdapter();
			}
			@Override
			public Adapter caseExpressedInstanceExcludedCheck(ExpressedInstanceExcludedCheck object) {
				return createExpressedInstanceExcludedCheckAdapter();
			}
			@Override
			public Adapter caseMultiplicityCheck(MultiplicityCheck object) {
				return createMultiplicityCheckAdapter();
			}
			@Override
			public Adapter caseMultiplicityRoleNameCheck(MultiplicityRoleNameCheck object) {
				return createMultiplicityRoleNameCheckAdapter();
			}
			@Override
			public Adapter caseRoleNamePropertyConformanceCheck(RoleNamePropertyConformanceCheck object) {
				return createRoleNamePropertyConformanceCheckAdapter();
			}
			@Override
			public Adapter caseRoleNameLocalConformanceCheck(RoleNameLocalConformanceCheck object) {
				return createRoleNameLocalConformanceCheckAdapter();
			}
			@Override
			public Adapter caseConnectionsLocalConformanceCheck(ConnectionsLocalConformanceCheck object) {
				return createConnectionsLocalConformanceCheckAdapter();
			}
			@Override
			public Adapter caseLocalConformanceCheck(LocalConformanceCheck object) {
				return createLocalConformanceCheckAdapter();
			}
			@Override
			public Adapter caseTypeFeatureCheck(TypeFeatureCheck object) {
				return createTypeFeatureCheckAdapter();
			}
			@Override
			public Adapter caseFeatureSearchCheck(FeatureSearchCheck object) {
				return createFeatureSearchCheckAdapter();
			}
			@Override
			public Adapter caseFeatureConformanceCheck(FeatureConformanceCheck object) {
				return createFeatureConformanceCheckAdapter();
			}
			@Override
			public Adapter caseLevelComparison(LevelComparison object) {
				return createLevelComparisonAdapter();
			}
			@Override
			public Adapter caseValueComparison(ValueComparison object) {
				return createValueComparisonAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel
	 * @generated
	 */
	public Adapter createReasoningResultModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.Check
	 * @generated
	 */
	public Adapter createCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck <em>Composite Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck
	 * @generated
	 */
	public Adapter createCompositeCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison <em>Name Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison
	 * @generated
	 */
	public Adapter createNameComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison <em>Durability Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison
	 * @generated
	 */
	public Adapter createDurabilityComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison <em>Mutability Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison
	 * @generated
	 */
	public Adapter createMutabilityComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison <em>Datatype Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison
	 * @generated
	 */
	public Adapter createDatatypeComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck <em>All Connections Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck
	 * @generated
	 */
	public Adapter createAllConnectionsCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch <em>Type Connection Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch
	 * @generated
	 */
	public Adapter createTypeConnectionSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck <em>Expressed Instance Excluded Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck
	 * @generated
	 */
	public Adapter createExpressedInstanceExcludedCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck <em>Multiplicity Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck
	 * @generated
	 */
	public Adapter createMultiplicityCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck <em>Multiplicity Role Name Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck
	 * @generated
	 */
	public Adapter createMultiplicityRoleNameCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck <em>Role Name Property Conformance Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck
	 * @generated
	 */
	public Adapter createRoleNamePropertyConformanceCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNameLocalConformanceCheck <em>Role Name Local Conformance Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNameLocalConformanceCheck
	 * @generated
	 */
	public Adapter createRoleNameLocalConformanceCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck <em>Connections Local Conformance Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck
	 * @generated
	 */
	public Adapter createConnectionsLocalConformanceCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LocalConformanceCheck <em>Local Conformance Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LocalConformanceCheck
	 * @generated
	 */
	public Adapter createLocalConformanceCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeFeatureCheck <em>Type Feature Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeFeatureCheck
	 * @generated
	 */
	public Adapter createTypeFeatureCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck <em>Feature Search Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck
	 * @generated
	 */
	public Adapter createFeatureSearchCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureConformanceCheck <em>Feature Conformance Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureConformanceCheck
	 * @generated
	 */
	public Adapter createFeatureConformanceCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison <em>Level Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison
	 * @generated
	 */
	public Adapter createLevelComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ValueComparison <em>Value Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ValueComparison
	 * @generated
	 */
	public Adapter createValueComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ReasoningResultAdapterFactory
