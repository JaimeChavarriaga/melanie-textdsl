/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Connection Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.TypeConnectionSearchImpl#getTypeConnection <em>Type Connection</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.TypeConnectionSearchImpl#getNoSearchedConnections <em>No Searched Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConnectionSearchImpl extends CompositeCheckImpl implements TypeConnectionSearch {
	/**
	 * The cached value of the '{@link #getTypeConnection() <em>Type Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection typeConnection;

	/**
	 * The default value of the '{@link #getNoSearchedConnections() <em>No Searched Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoSearchedConnections()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_SEARCHED_CONNECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoSearchedConnections() <em>No Searched Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoSearchedConnections()
	 * @generated
	 * @ordered
	 */
	protected int noSearchedConnections = NO_SEARCHED_CONNECTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConnectionSearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.TYPE_CONNECTION_SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getTypeConnection() {
		if (typeConnection != null && typeConnection.eIsProxy()) {
			InternalEObject oldTypeConnection = (InternalEObject)typeConnection;
			typeConnection = (Connection)eResolveProxy(oldTypeConnection);
			if (typeConnection != oldTypeConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.TYPE_CONNECTION_SEARCH__TYPE_CONNECTION, oldTypeConnection, typeConnection));
			}
		}
		return typeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetTypeConnection() {
		return typeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeConnection(Connection newTypeConnection) {
		Connection oldTypeConnection = typeConnection;
		typeConnection = newTypeConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.TYPE_CONNECTION_SEARCH__TYPE_CONNECTION, oldTypeConnection, typeConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoSearchedConnections() {
		return noSearchedConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoSearchedConnections(int newNoSearchedConnections) {
		int oldNoSearchedConnections = noSearchedConnections;
		noSearchedConnections = newNoSearchedConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.TYPE_CONNECTION_SEARCH__NO_SEARCHED_CONNECTIONS, oldNoSearchedConnections, noSearchedConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.TYPE_CONNECTION_SEARCH__TYPE_CONNECTION:
				if (resolve) return getTypeConnection();
				return basicGetTypeConnection();
			case ReasoningResultPackage.TYPE_CONNECTION_SEARCH__NO_SEARCHED_CONNECTIONS:
				return getNoSearchedConnections();
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
			case ReasoningResultPackage.TYPE_CONNECTION_SEARCH__TYPE_CONNECTION:
				setTypeConnection((Connection)newValue);
				return;
			case ReasoningResultPackage.TYPE_CONNECTION_SEARCH__NO_SEARCHED_CONNECTIONS:
				setNoSearchedConnections((Integer)newValue);
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
			case ReasoningResultPackage.TYPE_CONNECTION_SEARCH__TYPE_CONNECTION:
				setTypeConnection((Connection)null);
				return;
			case ReasoningResultPackage.TYPE_CONNECTION_SEARCH__NO_SEARCHED_CONNECTIONS:
				setNoSearchedConnections(NO_SEARCHED_CONNECTIONS_EDEFAULT);
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
			case ReasoningResultPackage.TYPE_CONNECTION_SEARCH__TYPE_CONNECTION:
				return typeConnection != null;
			case ReasoningResultPackage.TYPE_CONNECTION_SEARCH__NO_SEARCHED_CONNECTIONS:
				return noSearchedConnections != NO_SEARCHED_CONNECTIONS_EDEFAULT;
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
		result.append(" (noSearchedConnections: ");
		result.append(noSearchedConnections);
		result.append(')');
		return result.toString();
	}

} //TypeConnectionSearchImpl
