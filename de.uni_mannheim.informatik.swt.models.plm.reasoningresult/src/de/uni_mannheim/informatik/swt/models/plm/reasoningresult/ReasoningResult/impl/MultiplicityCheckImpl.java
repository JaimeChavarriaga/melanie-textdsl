/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MultiplicityCheckImpl#getNoOfDomainConnection <em>No Of Domain Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicityCheckImpl extends CompositeCheckImpl implements MultiplicityCheck {
	/**
	 * The default value of the '{@link #getNoOfDomainConnection() <em>No Of Domain Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOfDomainConnection()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_OF_DOMAIN_CONNECTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoOfDomainConnection() <em>No Of Domain Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOfDomainConnection()
	 * @generated
	 * @ordered
	 */
	protected int noOfDomainConnection = NO_OF_DOMAIN_CONNECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.MULTIPLICITY_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoOfDomainConnection() {
		return noOfDomainConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoOfDomainConnection(int newNoOfDomainConnection) {
		int oldNoOfDomainConnection = noOfDomainConnection;
		noOfDomainConnection = newNoOfDomainConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.MULTIPLICITY_CHECK__NO_OF_DOMAIN_CONNECTION, oldNoOfDomainConnection, noOfDomainConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.MULTIPLICITY_CHECK__NO_OF_DOMAIN_CONNECTION:
				return getNoOfDomainConnection();
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
			case ReasoningResultPackage.MULTIPLICITY_CHECK__NO_OF_DOMAIN_CONNECTION:
				setNoOfDomainConnection((Integer)newValue);
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
			case ReasoningResultPackage.MULTIPLICITY_CHECK__NO_OF_DOMAIN_CONNECTION:
				setNoOfDomainConnection(NO_OF_DOMAIN_CONNECTION_EDEFAULT);
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
			case ReasoningResultPackage.MULTIPLICITY_CHECK__NO_OF_DOMAIN_CONNECTION:
				return noOfDomainConnection != NO_OF_DOMAIN_CONNECTION_EDEFAULT;
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
		result.append(" (noOfDomainConnection: ");
		result.append(noOfDomainConnection);
		result.append(')');
		return result.toString();
	}

} //MultiplicityCheckImpl
