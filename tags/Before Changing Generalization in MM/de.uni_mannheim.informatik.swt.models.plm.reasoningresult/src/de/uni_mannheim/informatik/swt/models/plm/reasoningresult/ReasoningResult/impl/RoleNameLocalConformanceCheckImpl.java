/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNameLocalConformanceCheck;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Name Local Conformance Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNameLocalConformanceCheckImpl#getRoleName <em>Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleNameLocalConformanceCheckImpl extends CompositeCheckImpl implements RoleNameLocalConformanceCheck {
	/**
	 * The default value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_NAME_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected String roleName = ROLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleNameLocalConformanceCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.ROLE_NAME_LOCAL_CONFORMANCE_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleName(String newRoleName) {
		String oldRoleName = roleName;
		roleName = newRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.ROLE_NAME_LOCAL_CONFORMANCE_CHECK__ROLE_NAME, oldRoleName, roleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.ROLE_NAME_LOCAL_CONFORMANCE_CHECK__ROLE_NAME:
				return getRoleName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReasoningResultPackage.ROLE_NAME_LOCAL_CONFORMANCE_CHECK__ROLE_NAME:
				setRoleName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReasoningResultPackage.ROLE_NAME_LOCAL_CONFORMANCE_CHECK__ROLE_NAME:
				setRoleName(ROLE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReasoningResultPackage.ROLE_NAME_LOCAL_CONFORMANCE_CHECK__ROLE_NAME:
				return ROLE_NAME_EDEFAULT == null ? roleName != null : !ROLE_NAME_EDEFAULT.equals(roleName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (roleName: ");
		result.append(roleName);
		result.append(')');
		return result.toString();
	}

} //RoleNameLocalConformanceCheckImpl
