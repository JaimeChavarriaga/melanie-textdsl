/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualization Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizationContainerImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizationContainerImpl#getVisualizersShown <em>Visualizers Shown</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VisualizationContainerImpl extends EObjectImpl implements VisualizationContainer {
	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_EDEFAULT = "all";

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected String origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisualizersShown() <em>Visualizers Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizersShown()
	 * @generated
	 * @ordered
	 */
	protected static final String VISUALIZERS_SHOWN_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getVisualizersShown() <em>Visualizers Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizersShown()
	 * @generated
	 * @ordered
	 */
	protected String visualizersShown = VISUALIZERS_SHOWN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.VISUALIZATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(String newOrigin) {
		String oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.VISUALIZATION_CONTAINER__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisualizersShown() {
		return visualizersShown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualizersShown(String newVisualizersShown) {
		String oldVisualizersShown = visualizersShown;
		visualizersShown = newVisualizersShown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN, oldVisualizersShown, visualizersShown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PLMPackage.VISUALIZATION_CONTAINER__ORIGIN:
				return getOrigin();
			case PLMPackage.VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN:
				return getVisualizersShown();
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
			case PLMPackage.VISUALIZATION_CONTAINER__ORIGIN:
				setOrigin((String)newValue);
				return;
			case PLMPackage.VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN:
				setVisualizersShown((String)newValue);
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
			case PLMPackage.VISUALIZATION_CONTAINER__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case PLMPackage.VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN:
				setVisualizersShown(VISUALIZERS_SHOWN_EDEFAULT);
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
			case PLMPackage.VISUALIZATION_CONTAINER__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case PLMPackage.VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN:
				return VISUALIZERS_SHOWN_EDEFAULT == null ? visualizersShown != null : !VISUALIZERS_SHOWN_EDEFAULT.equals(visualizersShown);
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
		result.append(" (origin: ");
		result.append(origin);
		result.append(", visualizersShown: ");
		result.append(visualizersShown);
		result.append(')');
		return result.toString();
	}

} //VisualizationContainerImpl
