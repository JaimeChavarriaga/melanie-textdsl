/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion;
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
 * An implementation of the model object '<em><b>Inversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.InversionImpl#getInverse <em>Inverse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InversionImpl extends SetRelationshipImpl implements Inversion {
	/**
	 * The cached value of the '{@link #getInverse() <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverse()
	 * @generated
	 * @ordered
	 */
	protected Clabject inverse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.INVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject getInverse() {
		if (inverse != null && inverse.eIsProxy()) {
			InternalEObject oldInverse = (InternalEObject)inverse;
			inverse = (Clabject)eResolveProxy(oldInverse);
			if (inverse != oldInverse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PLMPackage.INVERSION__INVERSE, oldInverse, inverse));
			}
		}
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject basicGetInverse() {
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverse(Clabject newInverse) {
		Clabject oldInverse = inverse;
		inverse = newInverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.INVERSION__INVERSE, oldInverse, inverse));
	}

	/**
	 * The cached invocation delegate for the '{@link #getTarget() <em>Get Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_TARGET__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.INVERSION___GET_TARGET).getInvocationDelegate();

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
			case PLMPackage.INVERSION__INVERSE:
				if (resolve) return getInverse();
				return basicGetInverse();
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
			case PLMPackage.INVERSION__INVERSE:
				setInverse((Clabject)newValue);
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
			case PLMPackage.INVERSION__INVERSE:
				setInverse((Clabject)null);
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
			case PLMPackage.INVERSION__INVERSE:
				return inverse != null;
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
				case PLMPackage.SET_RELATIONSHIP___GET_TARGET: return PLMPackage.INVERSION___GET_TARGET;
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
			case PLMPackage.INVERSION___GET_TARGET:
				return getTarget();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InversionImpl
