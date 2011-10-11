/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecoration;
import de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecorationTypes;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Link Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.DefaultLinkDecorationImpl#getDecorationType <em>Decoration Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultLinkDecorationImpl extends LinkDecorationImpl implements DefaultLinkDecoration {
	/**
	 * The default value of the '{@link #getDecorationType() <em>Decoration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationType()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultLinkDecorationTypes DECORATION_TYPE_EDEFAULT = DefaultLinkDecorationTypes.POLYGONE_LINE_DECORATION;

	/**
	 * The cached value of the '{@link #getDecorationType() <em>Decoration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationType()
	 * @generated
	 * @ordered
	 */
	protected DefaultLinkDecorationTypes decorationType = DECORATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultLinkDecorationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.DEFAULT_LINK_DECORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultLinkDecorationTypes getDecorationType() {
		return decorationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecorationType(DefaultLinkDecorationTypes newDecorationType) {
		DefaultLinkDecorationTypes oldDecorationType = decorationType;
		decorationType = newDecorationType == null ? DECORATION_TYPE_EDEFAULT : newDecorationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.DEFAULT_LINK_DECORATION__DECORATION_TYPE, oldDecorationType, decorationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.DEFAULT_LINK_DECORATION__DECORATION_TYPE:
				return getDecorationType();
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
			case VisualizationPackage.DEFAULT_LINK_DECORATION__DECORATION_TYPE:
				setDecorationType((DefaultLinkDecorationTypes)newValue);
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
			case VisualizationPackage.DEFAULT_LINK_DECORATION__DECORATION_TYPE:
				setDecorationType(DECORATION_TYPE_EDEFAULT);
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
			case VisualizationPackage.DEFAULT_LINK_DECORATION__DECORATION_TYPE:
				return decorationType != DECORATION_TYPE_EDEFAULT;
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
		result.append(" (decorationType: ");
		result.append(decorationType);
		result.append(')');
		return result.toString();
	}

} //DefaultLinkDecorationImpl
