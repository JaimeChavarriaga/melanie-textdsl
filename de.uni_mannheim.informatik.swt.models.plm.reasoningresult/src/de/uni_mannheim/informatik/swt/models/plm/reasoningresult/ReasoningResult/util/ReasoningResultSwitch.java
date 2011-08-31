/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.util;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage
 * @generated
 */
public class ReasoningResultSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReasoningResultPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningResultSwitch() {
		if (modelPackage == null) {
			modelPackage = ReasoningResultPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ReasoningResultPackage.REASONING_RESULT_MODEL: {
				ReasoningResultModel reasoningResultModel = (ReasoningResultModel)theEObject;
				T result = caseReasoningResultModel(reasoningResultModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.CHECK: {
				Check check = (Check)theEObject;
				T result = caseCheck(check);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.COMPOSITE_CHECK: {
				CompositeCheck compositeCheck = (CompositeCheck)theEObject;
				T result = caseCompositeCheck(compositeCheck);
				if (result == null) result = caseCheck(compositeCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.NAME_COMPARISON: {
				NameComparison nameComparison = (NameComparison)theEObject;
				T result = caseNameComparison(nameComparison);
				if (result == null) result = caseCheck(nameComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.DURABILITY_COMPARISON: {
				DurabilityComparison durabilityComparison = (DurabilityComparison)theEObject;
				T result = caseDurabilityComparison(durabilityComparison);
				if (result == null) result = caseCheck(durabilityComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.MUTABILITY_COMPARISON: {
				MutabilityComparison mutabilityComparison = (MutabilityComparison)theEObject;
				T result = caseMutabilityComparison(mutabilityComparison);
				if (result == null) result = caseCheck(mutabilityComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.DATATYPE_COMPARISON: {
				DatatypeComparison datatypeComparison = (DatatypeComparison)theEObject;
				T result = caseDatatypeComparison(datatypeComparison);
				if (result == null) result = caseCheck(datatypeComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.ALL_CONNECTIONS_CHECK: {
				AllConnectionsCheck allConnectionsCheck = (AllConnectionsCheck)theEObject;
				T result = caseAllConnectionsCheck(allConnectionsCheck);
				if (result == null) result = caseCompositeCheck(allConnectionsCheck);
				if (result == null) result = caseCheck(allConnectionsCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.TYPE_CONNECTION_SEARCH: {
				TypeConnectionSearch typeConnectionSearch = (TypeConnectionSearch)theEObject;
				T result = caseTypeConnectionSearch(typeConnectionSearch);
				if (result == null) result = caseCompositeCheck(typeConnectionSearch);
				if (result == null) result = caseCheck(typeConnectionSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK: {
				ExpressedInstanceExcludedCheck expressedInstanceExcludedCheck = (ExpressedInstanceExcludedCheck)theEObject;
				T result = caseExpressedInstanceExcludedCheck(expressedInstanceExcludedCheck);
				if (result == null) result = caseCompositeCheck(expressedInstanceExcludedCheck);
				if (result == null) result = caseCheck(expressedInstanceExcludedCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.MULTIPLICITY_CHECK: {
				MultiplicityCheck multiplicityCheck = (MultiplicityCheck)theEObject;
				T result = caseMultiplicityCheck(multiplicityCheck);
				if (result == null) result = caseCompositeCheck(multiplicityCheck);
				if (result == null) result = caseCheck(multiplicityCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.MULTIPLICITY_ROLE_NAME_CHECK: {
				MultiplicityRoleNameCheck multiplicityRoleNameCheck = (MultiplicityRoleNameCheck)theEObject;
				T result = caseMultiplicityRoleNameCheck(multiplicityRoleNameCheck);
				if (result == null) result = caseCompositeCheck(multiplicityRoleNameCheck);
				if (result == null) result = caseCheck(multiplicityRoleNameCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK: {
				RoleNamePropertyConformanceCheck roleNamePropertyConformanceCheck = (RoleNamePropertyConformanceCheck)theEObject;
				T result = caseRoleNamePropertyConformanceCheck(roleNamePropertyConformanceCheck);
				if (result == null) result = caseCompositeCheck(roleNamePropertyConformanceCheck);
				if (result == null) result = caseCheck(roleNamePropertyConformanceCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.ROLE_NAME_LOCAL_CONFORMANCE_CHECK: {
				RoleNameLocalConformanceCheck roleNameLocalConformanceCheck = (RoleNameLocalConformanceCheck)theEObject;
				T result = caseRoleNameLocalConformanceCheck(roleNameLocalConformanceCheck);
				if (result == null) result = caseCompositeCheck(roleNameLocalConformanceCheck);
				if (result == null) result = caseCheck(roleNameLocalConformanceCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReasoningResultPackage.CONNECTIONS_LOCAL_CONFORMANCE_CHECK: {
				ConnectionsLocalConformanceCheck connectionsLocalConformanceCheck = (ConnectionsLocalConformanceCheck)theEObject;
				T result = caseConnectionsLocalConformanceCheck(connectionsLocalConformanceCheck);
				if (result == null) result = caseCompositeCheck(connectionsLocalConformanceCheck);
				if (result == null) result = caseCheck(connectionsLocalConformanceCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasoningResultModel(ReasoningResultModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheck(Check object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeCheck(CompositeCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameComparison(NameComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Durability Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Durability Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurabilityComparison(DurabilityComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mutability Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutability Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMutabilityComparison(MutabilityComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeComparison(DatatypeComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Connections Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Connections Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllConnectionsCheck(AllConnectionsCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Connection Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Connection Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConnectionSearch(TypeConnectionSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expressed Instance Excluded Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expressed Instance Excluded Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressedInstanceExcludedCheck(ExpressedInstanceExcludedCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityCheck(MultiplicityCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Role Name Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Role Name Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityRoleNameCheck(MultiplicityRoleNameCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Name Property Conformance Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Name Property Conformance Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleNamePropertyConformanceCheck(RoleNamePropertyConformanceCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Name Local Conformance Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Name Local Conformance Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleNameLocalConformanceCheck(RoleNameLocalConformanceCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connections Local Conformance Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connections Local Conformance Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionsLocalConformanceCheck(ConnectionsLocalConformanceCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ReasoningResultSwitch
