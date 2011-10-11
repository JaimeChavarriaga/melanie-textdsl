/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutInformationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Content Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutContentDescriptorImpl#getLayoutInformation <em>Layout Information</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutContentDescriptorImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutContentDescriptorImpl#getForegroundColor <em>Foreground Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LayoutContentDescriptorImpl extends VisualizationDescriptorImpl implements LayoutContentDescriptor {
	/**
	 * The cached value of the '{@link #getLayoutInformation() <em>Layout Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutInformation()
	 * @generated
	 * @ordered
	 */
	protected LayoutInformationDescriptor layoutInformation;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final ColorConstant BACKGROUND_COLOR_EDEFAULT = ColorConstant.WHITE;
	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected ColorConstant backgroundColor = BACKGROUND_COLOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final ColorConstant FOREGROUND_COLOR_EDEFAULT = ColorConstant.BLACK;
	/**
	 * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected ColorConstant foregroundColor = FOREGROUND_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutContentDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.LAYOUT_CONTENT_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutInformationDescriptor getLayoutInformation() {
		return layoutInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutInformation(LayoutInformationDescriptor newLayoutInformation, NotificationChain msgs) {
		LayoutInformationDescriptor oldLayoutInformation = layoutInformation;
		layoutInformation = newLayoutInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION, oldLayoutInformation, newLayoutInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutInformation(LayoutInformationDescriptor newLayoutInformation) {
		if (newLayoutInformation != layoutInformation) {
			NotificationChain msgs = null;
			if (layoutInformation != null)
				msgs = ((InternalEObject)layoutInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION, null, msgs);
			if (newLayoutInformation != null)
				msgs = ((InternalEObject)newLayoutInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION, null, msgs);
			msgs = basicSetLayoutInformation(newLayoutInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION, newLayoutInformation, newLayoutInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorConstant getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(ColorConstant newBackgroundColor) {
		ColorConstant oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor == null ? BACKGROUND_COLOR_EDEFAULT : newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorConstant getForegroundColor() {
		return foregroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForegroundColor(ColorConstant newForegroundColor) {
		ColorConstant oldForegroundColor = foregroundColor;
		foregroundColor = newForegroundColor == null ? FOREGROUND_COLOR_EDEFAULT : newForegroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__FOREGROUND_COLOR, oldForegroundColor, foregroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION:
				return basicSetLayoutInformation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION:
				return getLayoutInformation();
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__BACKGROUND_COLOR:
				return getBackgroundColor();
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__FOREGROUND_COLOR:
				return getForegroundColor();
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
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION:
				setLayoutInformation((LayoutInformationDescriptor)newValue);
				return;
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__BACKGROUND_COLOR:
				setBackgroundColor((ColorConstant)newValue);
				return;
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__FOREGROUND_COLOR:
				setForegroundColor((ColorConstant)newValue);
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
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION:
				setLayoutInformation((LayoutInformationDescriptor)null);
				return;
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__FOREGROUND_COLOR:
				setForegroundColor(FOREGROUND_COLOR_EDEFAULT);
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
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION:
				return layoutInformation != null;
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__BACKGROUND_COLOR:
				return backgroundColor != BACKGROUND_COLOR_EDEFAULT;
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR__FOREGROUND_COLOR:
				return foregroundColor != FOREGROUND_COLOR_EDEFAULT;
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
		result.append(" (backgroundColor: ");
		result.append(backgroundColor);
		result.append(", foregroundColor: ");
		result.append(foregroundColor);
		result.append(')');
		return result.toString();
	}

} //LayoutContentDescriptorImpl
