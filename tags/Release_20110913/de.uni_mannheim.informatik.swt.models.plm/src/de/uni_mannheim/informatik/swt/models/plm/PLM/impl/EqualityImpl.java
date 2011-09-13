/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Equality;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

import de.uni_mannheim.informatik.swt.models.plm.PLM.SetRelationship;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EqualityImpl#getEqual <em>Equal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EqualityImpl extends SetRelationshipImpl implements Equality {
	/**
	 * The cached value of the '{@link #getEqual() <em>Equal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqual()
	 * @generated
	 * @ordered
	 */
	protected Clabject equal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.EQUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject getEqual() {
		if (equal != null && equal.eIsProxy()) {
			InternalEObject oldEqual = (InternalEObject)equal;
			equal = (Clabject)eResolveProxy(oldEqual);
			if (equal != oldEqual) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PLMPackage.EQUALITY__EQUAL, oldEqual, equal));
			}
		}
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject basicGetEqual() {
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEqual(Clabject newEqual) {
		Clabject oldEqual = equal;
		equal = newEqual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.EQUALITY__EQUAL, oldEqual, equal));
	}

	/**
	 * The cached invocation delegate for the '{@link #getTarget() <em>Get Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_TARGET__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.EQUALITY___GET_TARGET).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject getTarget() {
		try {
			return (Clabject)GET_TARGET__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PLMPackage.EQUALITY__EQUAL:
				if (resolve) return getEqual();
				return basicGetEqual();
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
			case PLMPackage.EQUALITY__EQUAL:
				setEqual((Clabject)newValue);
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
			case PLMPackage.EQUALITY__EQUAL:
				setEqual((Clabject)null);
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
			case PLMPackage.EQUALITY__EQUAL:
				return equal != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SetRelationship.class) {
			switch (baseOperationID) {
				case PLMPackage.SET_RELATIONSHIP___GET_TARGET: return PLMPackage.EQUALITY___GET_TARGET;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PLMPackage.EQUALITY___GET_TARGET:
				return getTarget();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EqualityImpl
