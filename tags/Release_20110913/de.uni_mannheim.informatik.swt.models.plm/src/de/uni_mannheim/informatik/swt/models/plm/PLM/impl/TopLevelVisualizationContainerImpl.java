/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Visualization Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.TopLevelVisualizationContainerImpl#getCompletness <em>Completness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TopLevelVisualizationContainerImpl extends VisualizationContainerImpl implements TopLevelVisualizationContainer {
	/**
	 * The default value of the '{@link #getCompletness() <em>Completness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletness()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETNESS_EDEFAULT = "elision";

	/**
	 * The cached value of the '{@link #getCompletness() <em>Completness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletness()
	 * @generated
	 * @ordered
	 */
	protected String completness = COMPLETNESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopLevelVisualizationContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.TOP_LEVEL_VISUALIZATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompletness() {
		return completness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletness(String newCompletness) {
		String oldCompletness = completness;
		completness = newCompletness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS, oldCompletness, completness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PLMPackage.TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS:
				return getCompletness();
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
			case PLMPackage.TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS:
				setCompletness((String)newValue);
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
			case PLMPackage.TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS:
				setCompletness(COMPLETNESS_EDEFAULT);
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
			case PLMPackage.TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS:
				return COMPLETNESS_EDEFAULT == null ? completness != null : !COMPLETNESS_EDEFAULT.equals(completness);
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
		result.append(" (completness: ");
		result.append(completness);
		result.append(')');
		return result.toString();
	}

} //TopLevelVisualizationContainerImpl
