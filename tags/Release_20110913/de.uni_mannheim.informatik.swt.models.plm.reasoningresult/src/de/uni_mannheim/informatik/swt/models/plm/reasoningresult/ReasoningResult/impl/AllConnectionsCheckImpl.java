/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Connections Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.AllConnectionsCheckImpl#getNoTypeConnection <em>No Type Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllConnectionsCheckImpl extends CompositeCheckImpl implements AllConnectionsCheck {
	/**
	 * The default value of the '{@link #getNoTypeConnection() <em>No Type Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoTypeConnection()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_TYPE_CONNECTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoTypeConnection() <em>No Type Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoTypeConnection()
	 * @generated
	 * @ordered
	 */
	protected int noTypeConnection = NO_TYPE_CONNECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllConnectionsCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.ALL_CONNECTIONS_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoTypeConnection() {
		return noTypeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoTypeConnection(int newNoTypeConnection) {
		int oldNoTypeConnection = noTypeConnection;
		noTypeConnection = newNoTypeConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.ALL_CONNECTIONS_CHECK__NO_TYPE_CONNECTION, oldNoTypeConnection, noTypeConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.ALL_CONNECTIONS_CHECK__NO_TYPE_CONNECTION:
				return getNoTypeConnection();
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
			case ReasoningResultPackage.ALL_CONNECTIONS_CHECK__NO_TYPE_CONNECTION:
				setNoTypeConnection((Integer)newValue);
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
			case ReasoningResultPackage.ALL_CONNECTIONS_CHECK__NO_TYPE_CONNECTION:
				setNoTypeConnection(NO_TYPE_CONNECTION_EDEFAULT);
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
			case ReasoningResultPackage.ALL_CONNECTIONS_CHECK__NO_TYPE_CONNECTION:
				return noTypeConnection != NO_TYPE_CONNECTION_EDEFAULT;
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
		result.append(" (noTypeConnection: ");
		result.append(noTypeConnection);
		result.append(')');
		return result.toString();
	}

} //AllConnectionsCheckImpl
