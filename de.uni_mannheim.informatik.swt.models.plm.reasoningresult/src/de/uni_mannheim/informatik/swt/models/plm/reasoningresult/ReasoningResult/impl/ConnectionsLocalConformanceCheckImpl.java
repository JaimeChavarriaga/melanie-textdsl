/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connections Local Conformance Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ConnectionsLocalConformanceCheckImpl#getNoTypeConnections <em>No Type Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionsLocalConformanceCheckImpl extends CompositeCheckImpl implements ConnectionsLocalConformanceCheck {
	/**
	 * The default value of the '{@link #getNoTypeConnections() <em>No Type Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoTypeConnections()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_TYPE_CONNECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoTypeConnections() <em>No Type Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoTypeConnections()
	 * @generated
	 * @ordered
	 */
	protected int noTypeConnections = NO_TYPE_CONNECTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionsLocalConformanceCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.CONNECTIONS_LOCAL_CONFORMANCE_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoTypeConnections() {
		return noTypeConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoTypeConnections(int newNoTypeConnections) {
		int oldNoTypeConnections = noTypeConnections;
		noTypeConnections = newNoTypeConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.CONNECTIONS_LOCAL_CONFORMANCE_CHECK__NO_TYPE_CONNECTIONS, oldNoTypeConnections, noTypeConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.CONNECTIONS_LOCAL_CONFORMANCE_CHECK__NO_TYPE_CONNECTIONS:
				return getNoTypeConnections();
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
			case ReasoningResultPackage.CONNECTIONS_LOCAL_CONFORMANCE_CHECK__NO_TYPE_CONNECTIONS:
				setNoTypeConnections((Integer)newValue);
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
			case ReasoningResultPackage.CONNECTIONS_LOCAL_CONFORMANCE_CHECK__NO_TYPE_CONNECTIONS:
				setNoTypeConnections(NO_TYPE_CONNECTIONS_EDEFAULT);
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
			case ReasoningResultPackage.CONNECTIONS_LOCAL_CONFORMANCE_CHECK__NO_TYPE_CONNECTIONS:
				return noTypeConnections != NO_TYPE_CONNECTIONS_EDEFAULT;
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
		result.append(" (noTypeConnections: ");
		result.append(noTypeConnections);
		result.append(')');
		return result.toString();
	}

} //ConnectionsLocalConformanceCheckImpl
