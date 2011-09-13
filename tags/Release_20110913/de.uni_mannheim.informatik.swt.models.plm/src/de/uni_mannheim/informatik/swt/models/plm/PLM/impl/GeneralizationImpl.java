/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.GeneralizationImpl#getDiscriminant <em>Discriminant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends LogicalElementImpl implements Generalization {
	/**
	 * The default value of the '{@link #getDiscriminant() <em>Discriminant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminant()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminant() <em>Discriminant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminant()
	 * @generated
	 * @ordered
	 */
	protected String discriminant = DISCRIMINANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscriminant() {
		return discriminant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminant(String newDiscriminant) {
		String oldDiscriminant = discriminant;
		discriminant = newDiscriminant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.GENERALIZATION__DISCRIMINANT, oldDiscriminant, discriminant));
	}

	/**
	 * The cached invocation delegate for the '{@link #getSupertypes() <em>Get Supertypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SUPERTYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.GENERALIZATION___GET_SUPERTYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getSupertypes() {
		try {
			return (EList<Clabject>)GET_SUPERTYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getSubtypes() <em>Get Subtypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SUBTYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.GENERALIZATION___GET_SUBTYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getSubtypes() {
		try {
			return (EList<Clabject>)GET_SUBTYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case PLMPackage.GENERALIZATION__DISCRIMINANT:
				return getDiscriminant();
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
			case PLMPackage.GENERALIZATION__DISCRIMINANT:
				setDiscriminant((String)newValue);
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
			case PLMPackage.GENERALIZATION__DISCRIMINANT:
				setDiscriminant(DISCRIMINANT_EDEFAULT);
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
			case PLMPackage.GENERALIZATION__DISCRIMINANT:
				return DISCRIMINANT_EDEFAULT == null ? discriminant != null : !DISCRIMINANT_EDEFAULT.equals(discriminant);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PLMPackage.GENERALIZATION___GET_SUPERTYPES:
				return getSupertypes();
			case PLMPackage.GENERALIZATION___GET_SUBTYPES:
				return getSubtypes();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (discriminant: ");
		result.append(discriminant);
		result.append(')');
		return result.toString();
	}

} //GeneralizationImpl
