/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.nodels.plm.PLM.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uni_mannheim.informatik.swt.nodels.plm.PLM.PClabject;
import uni_mannheim.informatik.swt.nodels.plm.PLM.PConnector;
import uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PConnector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.impl.PConnectorImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.impl.PConnectorImpl#getRoleNames <em>Role Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PConnectorImpl extends PLevelSpecificElementImpl implements PConnector {
	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<PClabject> participants;

	/**
	 * The cached value of the '{@link #getRoleNames() <em>Role Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> roleNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.PCONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PClabject> getParticipants() {
		if (participants == null) {
			participants = new EObjectResolvingEList<PClabject>(PClabject.class, this, PLMPackage.PCONNECTOR__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoleNames() {
		if (roleNames == null) {
			roleNames = new EDataTypeUniqueEList<String>(String.class, this, PLMPackage.PCONNECTOR__ROLE_NAMES);
		}
		return roleNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PLMPackage.PCONNECTOR__PARTICIPANTS:
				return getParticipants();
			case PLMPackage.PCONNECTOR__ROLE_NAMES:
				return getRoleNames();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PLMPackage.PCONNECTOR__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends PClabject>)newValue);
				return;
			case PLMPackage.PCONNECTOR__ROLE_NAMES:
				getRoleNames().clear();
				getRoleNames().addAll((Collection<? extends String>)newValue);
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
			case PLMPackage.PCONNECTOR__PARTICIPANTS:
				getParticipants().clear();
				return;
			case PLMPackage.PCONNECTOR__ROLE_NAMES:
				getRoleNames().clear();
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
			case PLMPackage.PCONNECTOR__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case PLMPackage.PCONNECTOR__ROLE_NAMES:
				return roleNames != null && !roleNames.isEmpty();
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
		result.append(" (roleNames: ");
		result.append(roleNames);
		result.append(')');
		return result.toString();
	}

} //PConnectorImpl
