/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiation;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PInstantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PInstantiationImpl#getTargetLevel <em>Target Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PInstantiationImpl extends PConnectorImpl implements PInstantiation {
	/**
	 * The default value of the '{@link #getTargetLevel() <em>Target Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetLevel() <em>Target Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLevel()
	 * @generated
	 * @ordered
	 */
	protected int targetLevel = TARGET_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PInstantiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PanLevelModelPackage.Literals.PINSTANTIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetLevel() {
		return targetLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLevel(int newTargetLevel) {
		int oldTargetLevel = targetLevel;
		targetLevel = newTargetLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PanLevelModelPackage.PINSTANTIATION__TARGET_LEVEL, oldTargetLevel, targetLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PanLevelModelPackage.PINSTANTIATION__TARGET_LEVEL:
				return getTargetLevel();
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
			case PanLevelModelPackage.PINSTANTIATION__TARGET_LEVEL:
				setTargetLevel((Integer)newValue);
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
			case PanLevelModelPackage.PINSTANTIATION__TARGET_LEVEL:
				setTargetLevel(TARGET_LEVEL_EDEFAULT);
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
			case PanLevelModelPackage.PINSTANTIATION__TARGET_LEVEL:
				return targetLevel != TARGET_LEVEL_EDEFAULT;
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
		result.append(" (targetLevel: ");
		result.append(targetLevel);
		result.append(')');
		return result.toString();
	}

} //PInstantiationImpl
