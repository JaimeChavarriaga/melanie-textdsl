/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Name Property Conformance Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNamePropertyConformanceCheckImpl#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNamePropertyConformanceCheckImpl#getTypeParticipant <em>Type Participant</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.RoleNamePropertyConformanceCheckImpl#getInstanceParticipant <em>Instance Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleNamePropertyConformanceCheckImpl extends CompositeCheckImpl implements RoleNamePropertyConformanceCheck {
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
	 * The cached value of the '{@link #getTypeParticipant() <em>Type Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParticipant()
	 * @generated
	 * @ordered
	 */
	protected Clabject typeParticipant;

	/**
	 * The cached value of the '{@link #getInstanceParticipant() <em>Instance Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceParticipant()
	 * @generated
	 * @ordered
	 */
	protected Clabject instanceParticipant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleNamePropertyConformanceCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__ROLE_NAME, oldRoleName, roleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject getTypeParticipant() {
		if (typeParticipant != null && typeParticipant.eIsProxy()) {
			InternalEObject oldTypeParticipant = (InternalEObject)typeParticipant;
			typeParticipant = (Clabject)eResolveProxy(oldTypeParticipant);
			if (typeParticipant != oldTypeParticipant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__TYPE_PARTICIPANT, oldTypeParticipant, typeParticipant));
			}
		}
		return typeParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject basicGetTypeParticipant() {
		return typeParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeParticipant(Clabject newTypeParticipant) {
		Clabject oldTypeParticipant = typeParticipant;
		typeParticipant = newTypeParticipant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__TYPE_PARTICIPANT, oldTypeParticipant, typeParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject getInstanceParticipant() {
		if (instanceParticipant != null && instanceParticipant.eIsProxy()) {
			InternalEObject oldInstanceParticipant = (InternalEObject)instanceParticipant;
			instanceParticipant = (Clabject)eResolveProxy(oldInstanceParticipant);
			if (instanceParticipant != oldInstanceParticipant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__INSTANCE_PARTICIPANT, oldInstanceParticipant, instanceParticipant));
			}
		}
		return instanceParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject basicGetInstanceParticipant() {
		return instanceParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceParticipant(Clabject newInstanceParticipant) {
		Clabject oldInstanceParticipant = instanceParticipant;
		instanceParticipant = newInstanceParticipant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__INSTANCE_PARTICIPANT, oldInstanceParticipant, instanceParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__ROLE_NAME:
				return getRoleName();
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__TYPE_PARTICIPANT:
				if (resolve) return getTypeParticipant();
				return basicGetTypeParticipant();
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__INSTANCE_PARTICIPANT:
				if (resolve) return getInstanceParticipant();
				return basicGetInstanceParticipant();
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
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__ROLE_NAME:
				setRoleName((String)newValue);
				return;
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__TYPE_PARTICIPANT:
				setTypeParticipant((Clabject)newValue);
				return;
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__INSTANCE_PARTICIPANT:
				setInstanceParticipant((Clabject)newValue);
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
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__ROLE_NAME:
				setRoleName(ROLE_NAME_EDEFAULT);
				return;
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__TYPE_PARTICIPANT:
				setTypeParticipant((Clabject)null);
				return;
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__INSTANCE_PARTICIPANT:
				setInstanceParticipant((Clabject)null);
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
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__ROLE_NAME:
				return ROLE_NAME_EDEFAULT == null ? roleName != null : !ROLE_NAME_EDEFAULT.equals(roleName);
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__TYPE_PARTICIPANT:
				return typeParticipant != null;
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__INSTANCE_PARTICIPANT:
				return instanceParticipant != null;
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

} //RoleNamePropertyConformanceCheckImpl
