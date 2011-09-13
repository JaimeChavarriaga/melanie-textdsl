/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl#isComplete <em>Complete</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl#isDisjoint <em>Disjoint</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl#getSupertype <em>Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleSpecializationImpl extends GeneralizationImpl implements MultipleSpecialization {
	/**
	 * The default value of the '{@link #isComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean complete = COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisjoint() <em>Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisjoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISJOINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisjoint() <em>Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisjoint()
	 * @generated
	 * @ordered
	 */
	protected boolean disjoint = DISJOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> subtype;

	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected Clabject supertype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleSpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.MULTIPLE_SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComplete() {
		return complete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplete(boolean newComplete) {
		boolean oldComplete = complete;
		complete = newComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.MULTIPLE_SPECIALIZATION__COMPLETE, oldComplete, complete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisjoint() {
		return disjoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisjoint(boolean newDisjoint) {
		boolean oldDisjoint = disjoint;
		disjoint = newDisjoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.MULTIPLE_SPECIALIZATION__DISJOINT, oldDisjoint, disjoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clabject> getSubtype() {
		if (subtype == null) {
			subtype = new EObjectResolvingEList<Clabject>(Clabject.class, this, PLMPackage.MULTIPLE_SPECIALIZATION__SUBTYPE);
		}
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject getSupertype() {
		if (supertype != null && supertype.eIsProxy()) {
			InternalEObject oldSupertype = (InternalEObject)supertype;
			supertype = (Clabject)eResolveProxy(oldSupertype);
			if (supertype != oldSupertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PLMPackage.MULTIPLE_SPECIALIZATION__SUPERTYPE, oldSupertype, supertype));
			}
		}
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject basicGetSupertype() {
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertype(Clabject newSupertype) {
		Clabject oldSupertype = supertype;
		supertype = newSupertype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.MULTIPLE_SPECIALIZATION__SUPERTYPE, oldSupertype, supertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PLMPackage.MULTIPLE_SPECIALIZATION__COMPLETE:
				return isComplete();
			case PLMPackage.MULTIPLE_SPECIALIZATION__DISJOINT:
				return isDisjoint();
			case PLMPackage.MULTIPLE_SPECIALIZATION__SUBTYPE:
				return getSubtype();
			case PLMPackage.MULTIPLE_SPECIALIZATION__SUPERTYPE:
				if (resolve) return getSupertype();
				return basicGetSupertype();
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
			case PLMPackage.MULTIPLE_SPECIALIZATION__COMPLETE:
				setComplete((Boolean)newValue);
				return;
			case PLMPackage.MULTIPLE_SPECIALIZATION__DISJOINT:
				setDisjoint((Boolean)newValue);
				return;
			case PLMPackage.MULTIPLE_SPECIALIZATION__SUBTYPE:
				getSubtype().clear();
				getSubtype().addAll((Collection<? extends Clabject>)newValue);
				return;
			case PLMPackage.MULTIPLE_SPECIALIZATION__SUPERTYPE:
				setSupertype((Clabject)newValue);
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
			case PLMPackage.MULTIPLE_SPECIALIZATION__COMPLETE:
				setComplete(COMPLETE_EDEFAULT);
				return;
			case PLMPackage.MULTIPLE_SPECIALIZATION__DISJOINT:
				setDisjoint(DISJOINT_EDEFAULT);
				return;
			case PLMPackage.MULTIPLE_SPECIALIZATION__SUBTYPE:
				getSubtype().clear();
				return;
			case PLMPackage.MULTIPLE_SPECIALIZATION__SUPERTYPE:
				setSupertype((Clabject)null);
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
			case PLMPackage.MULTIPLE_SPECIALIZATION__COMPLETE:
				return complete != COMPLETE_EDEFAULT;
			case PLMPackage.MULTIPLE_SPECIALIZATION__DISJOINT:
				return disjoint != DISJOINT_EDEFAULT;
			case PLMPackage.MULTIPLE_SPECIALIZATION__SUBTYPE:
				return subtype != null && !subtype.isEmpty();
			case PLMPackage.MULTIPLE_SPECIALIZATION__SUPERTYPE:
				return supertype != null;
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
		result.append(" (complete: ");
		result.append(complete);
		result.append(", disjoint: ");
		result.append(disjoint);
		result.append(')');
		return result.toString();
	}

} //MultipleSpecializationImpl
