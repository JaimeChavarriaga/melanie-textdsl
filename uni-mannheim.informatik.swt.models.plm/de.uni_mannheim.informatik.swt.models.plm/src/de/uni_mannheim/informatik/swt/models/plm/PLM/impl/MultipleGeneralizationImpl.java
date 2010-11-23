/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization;
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
 * An implementation of the model object '<em><b>Multiple Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl#isIntersection <em>Intersection</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl#isUnion <em>Union</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleGeneralizationImpl extends GeneralizationImpl implements MultipleGeneralization {
	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected Clabject subtype;

	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> supertype;

	/**
	 * The default value of the '{@link #isIntersection() <em>Intersection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIntersection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERSECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIntersection() <em>Intersection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIntersection()
	 * @generated
	 * @ordered
	 */
	protected boolean intersection = INTERSECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnion() <em>Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnion() <em>Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnion()
	 * @generated
	 * @ordered
	 */
	protected boolean union = UNION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleGeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.MULTIPLE_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject getSubtype() {
		if (subtype != null && subtype.eIsProxy()) {
			InternalEObject oldSubtype = (InternalEObject)subtype;
			subtype = (Clabject)eResolveProxy(oldSubtype);
			if (subtype != oldSubtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PLMPackage.MULTIPLE_GENERALIZATION__SUBTYPE, oldSubtype, subtype));
			}
		}
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject basicGetSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(Clabject newSubtype) {
		Clabject oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.MULTIPLE_GENERALIZATION__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clabject> getSupertype() {
		if (supertype == null) {
			supertype = new EObjectResolvingEList<Clabject>(Clabject.class, this, PLMPackage.MULTIPLE_GENERALIZATION__SUPERTYPE);
		}
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIntersection() {
		return intersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntersection(boolean newIntersection) {
		boolean oldIntersection = intersection;
		intersection = newIntersection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.MULTIPLE_GENERALIZATION__INTERSECTION, oldIntersection, intersection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnion() {
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnion(boolean newUnion) {
		boolean oldUnion = union;
		union = newUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.MULTIPLE_GENERALIZATION__UNION, oldUnion, union));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PLMPackage.MULTIPLE_GENERALIZATION__SUBTYPE:
				if (resolve) return getSubtype();
				return basicGetSubtype();
			case PLMPackage.MULTIPLE_GENERALIZATION__SUPERTYPE:
				return getSupertype();
			case PLMPackage.MULTIPLE_GENERALIZATION__INTERSECTION:
				return isIntersection();
			case PLMPackage.MULTIPLE_GENERALIZATION__UNION:
				return isUnion();
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
			case PLMPackage.MULTIPLE_GENERALIZATION__SUBTYPE:
				setSubtype((Clabject)newValue);
				return;
			case PLMPackage.MULTIPLE_GENERALIZATION__SUPERTYPE:
				getSupertype().clear();
				getSupertype().addAll((Collection<? extends Clabject>)newValue);
				return;
			case PLMPackage.MULTIPLE_GENERALIZATION__INTERSECTION:
				setIntersection((Boolean)newValue);
				return;
			case PLMPackage.MULTIPLE_GENERALIZATION__UNION:
				setUnion((Boolean)newValue);
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
			case PLMPackage.MULTIPLE_GENERALIZATION__SUBTYPE:
				setSubtype((Clabject)null);
				return;
			case PLMPackage.MULTIPLE_GENERALIZATION__SUPERTYPE:
				getSupertype().clear();
				return;
			case PLMPackage.MULTIPLE_GENERALIZATION__INTERSECTION:
				setIntersection(INTERSECTION_EDEFAULT);
				return;
			case PLMPackage.MULTIPLE_GENERALIZATION__UNION:
				setUnion(UNION_EDEFAULT);
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
			case PLMPackage.MULTIPLE_GENERALIZATION__SUBTYPE:
				return subtype != null;
			case PLMPackage.MULTIPLE_GENERALIZATION__SUPERTYPE:
				return supertype != null && !supertype.isEmpty();
			case PLMPackage.MULTIPLE_GENERALIZATION__INTERSECTION:
				return intersection != INTERSECTION_EDEFAULT;
			case PLMPackage.MULTIPLE_GENERALIZATION__UNION:
				return union != UNION_EDEFAULT;
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
		result.append(" (intersection: ");
		result.append(intersection);
		result.append(", union: ");
		result.append(union);
		result.append(')');
		return result.toString();
	}

} //MultipleGeneralizationImpl
