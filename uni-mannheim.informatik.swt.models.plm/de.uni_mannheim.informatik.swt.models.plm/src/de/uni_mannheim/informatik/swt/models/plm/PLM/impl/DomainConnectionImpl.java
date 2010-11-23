/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainConnectionImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainConnectionImpl#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainConnectionImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainConnectionImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainConnectionImpl#getIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainConnectionImpl#isTransitive <em>Transitive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainConnectionImpl extends ClabjectImpl implements DomainConnection {
	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> participant;

	/**
	 * The cached value of the '{@link #getRoleName() <em>Role Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> roleName;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> upper;

	/**
	 * The cached value of the '{@link #getIsNavigable() <em>Is Navigable</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> isNavigable;

	/**
	 * The default value of the '{@link #isTransitive() <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransitive() <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitive()
	 * @generated
	 * @ordered
	 */
	protected boolean transitive = TRANSITIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.DOMAIN_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clabject> getParticipant() {
		if (participant == null) {
			participant = new EObjectResolvingEList<Clabject>(Clabject.class, this, PLMPackage.DOMAIN_CONNECTION__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoleName() {
		if (roleName == null) {
			roleName = new EDataTypeUniqueEList<String>(String.class, this, PLMPackage.DOMAIN_CONNECTION__ROLE_NAME);
		}
		return roleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getLower() {
		if (lower == null) {
			lower = new EDataTypeUniqueEList<Integer>(Integer.class, this, PLMPackage.DOMAIN_CONNECTION__LOWER);
		}
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getUpper() {
		if (upper == null) {
			upper = new EDataTypeUniqueEList<Integer>(Integer.class, this, PLMPackage.DOMAIN_CONNECTION__UPPER);
		}
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getIsNavigable() {
		if (isNavigable == null) {
			isNavigable = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, PLMPackage.DOMAIN_CONNECTION__IS_NAVIGABLE);
		}
		return isNavigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransitive() {
		return transitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitive(boolean newTransitive) {
		boolean oldTransitive = transitive;
		transitive = newTransitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.DOMAIN_CONNECTION__TRANSITIVE, oldTransitive, transitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PLMPackage.DOMAIN_CONNECTION__PARTICIPANT:
				return getParticipant();
			case PLMPackage.DOMAIN_CONNECTION__ROLE_NAME:
				return getRoleName();
			case PLMPackage.DOMAIN_CONNECTION__LOWER:
				return getLower();
			case PLMPackage.DOMAIN_CONNECTION__UPPER:
				return getUpper();
			case PLMPackage.DOMAIN_CONNECTION__IS_NAVIGABLE:
				return getIsNavigable();
			case PLMPackage.DOMAIN_CONNECTION__TRANSITIVE:
				return isTransitive();
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
			case PLMPackage.DOMAIN_CONNECTION__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Clabject>)newValue);
				return;
			case PLMPackage.DOMAIN_CONNECTION__ROLE_NAME:
				getRoleName().clear();
				getRoleName().addAll((Collection<? extends String>)newValue);
				return;
			case PLMPackage.DOMAIN_CONNECTION__LOWER:
				getLower().clear();
				getLower().addAll((Collection<? extends Integer>)newValue);
				return;
			case PLMPackage.DOMAIN_CONNECTION__UPPER:
				getUpper().clear();
				getUpper().addAll((Collection<? extends Integer>)newValue);
				return;
			case PLMPackage.DOMAIN_CONNECTION__IS_NAVIGABLE:
				getIsNavigable().clear();
				getIsNavigable().addAll((Collection<? extends Boolean>)newValue);
				return;
			case PLMPackage.DOMAIN_CONNECTION__TRANSITIVE:
				setTransitive((Boolean)newValue);
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
			case PLMPackage.DOMAIN_CONNECTION__PARTICIPANT:
				getParticipant().clear();
				return;
			case PLMPackage.DOMAIN_CONNECTION__ROLE_NAME:
				getRoleName().clear();
				return;
			case PLMPackage.DOMAIN_CONNECTION__LOWER:
				getLower().clear();
				return;
			case PLMPackage.DOMAIN_CONNECTION__UPPER:
				getUpper().clear();
				return;
			case PLMPackage.DOMAIN_CONNECTION__IS_NAVIGABLE:
				getIsNavigable().clear();
				return;
			case PLMPackage.DOMAIN_CONNECTION__TRANSITIVE:
				setTransitive(TRANSITIVE_EDEFAULT);
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
			case PLMPackage.DOMAIN_CONNECTION__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case PLMPackage.DOMAIN_CONNECTION__ROLE_NAME:
				return roleName != null && !roleName.isEmpty();
			case PLMPackage.DOMAIN_CONNECTION__LOWER:
				return lower != null && !lower.isEmpty();
			case PLMPackage.DOMAIN_CONNECTION__UPPER:
				return upper != null && !upper.isEmpty();
			case PLMPackage.DOMAIN_CONNECTION__IS_NAVIGABLE:
				return isNavigable != null && !isNavigable.isEmpty();
			case PLMPackage.DOMAIN_CONNECTION__TRANSITIVE:
				return transitive != TRANSITIVE_EDEFAULT;
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
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", isNavigable: ");
		result.append(isNavigable);
		result.append(", transitive: ");
		result.append(transitive);
		result.append(')');
		return result.toString();
	}

} //DomainConnectionImpl
