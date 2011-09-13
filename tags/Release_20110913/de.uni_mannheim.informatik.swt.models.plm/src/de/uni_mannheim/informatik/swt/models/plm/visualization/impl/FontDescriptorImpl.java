/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FontDescriptorImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FontDescriptorImpl#getSize <em>Size</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FontDescriptorImpl#getFontStyle <em>Font Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontDescriptorImpl extends EObjectImpl implements FontDescriptor {
	/**
	 * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected String fontName = FONT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected static final FontStyle FONT_STYLE_EDEFAULT = FontStyle.NORMAL;

	/**
	 * The cached value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected FontStyle fontStyle = FONT_STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.FONT_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontName() {
		return fontName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontName(String newFontName) {
		String oldFontName = fontName;
		fontName = newFontName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.FONT_DESCRIPTOR__FONT_NAME, oldFontName, fontName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.FONT_DESCRIPTOR__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle getFontStyle() {
		return fontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(FontStyle newFontStyle) {
		FontStyle oldFontStyle = fontStyle;
		fontStyle = newFontStyle == null ? FONT_STYLE_EDEFAULT : newFontStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.FONT_DESCRIPTOR__FONT_STYLE, oldFontStyle, fontStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.FONT_DESCRIPTOR__FONT_NAME:
				return getFontName();
			case VisualizationPackage.FONT_DESCRIPTOR__SIZE:
				return getSize();
			case VisualizationPackage.FONT_DESCRIPTOR__FONT_STYLE:
				return getFontStyle();
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
			case VisualizationPackage.FONT_DESCRIPTOR__FONT_NAME:
				setFontName((String)newValue);
				return;
			case VisualizationPackage.FONT_DESCRIPTOR__SIZE:
				setSize((Integer)newValue);
				return;
			case VisualizationPackage.FONT_DESCRIPTOR__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
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
			case VisualizationPackage.FONT_DESCRIPTOR__FONT_NAME:
				setFontName(FONT_NAME_EDEFAULT);
				return;
			case VisualizationPackage.FONT_DESCRIPTOR__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case VisualizationPackage.FONT_DESCRIPTOR__FONT_STYLE:
				setFontStyle(FONT_STYLE_EDEFAULT);
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
			case VisualizationPackage.FONT_DESCRIPTOR__FONT_NAME:
				return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
			case VisualizationPackage.FONT_DESCRIPTOR__SIZE:
				return size != SIZE_EDEFAULT;
			case VisualizationPackage.FONT_DESCRIPTOR__FONT_STYLE:
				return fontStyle != FONT_STYLE_EDEFAULT;
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
		result.append(" (fontName: ");
		result.append(fontName);
		result.append(", size: ");
		result.append(size);
		result.append(", fontStyle: ");
		result.append(fontStyle);
		result.append(')');
		return result.toString();
	}

} //FontDescriptorImpl
