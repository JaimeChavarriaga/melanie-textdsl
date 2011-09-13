/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkDecorationImpl#isFill <em>Fill</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkDecorationImpl#isOutline <em>Outline</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkDecorationImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkDecorationImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkDecorationImpl#getOutlineWidth <em>Outline Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LinkDecorationImpl extends EObjectImpl implements LinkDecoration {
	/**
	 * The default value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill()
	 * @generated
	 * @ordered
	 */
	protected boolean fill = FILL_EDEFAULT;
	/**
	 * The default value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTLINE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected boolean outline = OUTLINE_EDEFAULT;
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
	 * The default value of the '{@link #getOutlineWidth() <em>Outline Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTLINE_WIDTH_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getOutlineWidth() <em>Outline Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineWidth()
	 * @generated
	 * @ordered
	 */
	protected int outlineWidth = OUTLINE_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkDecorationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.LINK_DECORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(boolean newFill) {
		boolean oldFill = fill;
		fill = newFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.LINK_DECORATION__FILL, oldFill, fill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutline() {
		return outline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutline(boolean newOutline) {
		boolean oldOutline = outline;
		outline = newOutline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.LINK_DECORATION__OUTLINE, oldOutline, outline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.LINK_DECORATION__FOREGROUND_COLOR, oldForegroundColor, foregroundColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.LINK_DECORATION__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutlineWidth() {
		return outlineWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineWidth(int newOutlineWidth) {
		int oldOutlineWidth = outlineWidth;
		outlineWidth = newOutlineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.LINK_DECORATION__OUTLINE_WIDTH, oldOutlineWidth, outlineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.LINK_DECORATION__FILL:
				return isFill();
			case VisualizationPackage.LINK_DECORATION__OUTLINE:
				return isOutline();
			case VisualizationPackage.LINK_DECORATION__FOREGROUND_COLOR:
				return getForegroundColor();
			case VisualizationPackage.LINK_DECORATION__BACKGROUND_COLOR:
				return getBackgroundColor();
			case VisualizationPackage.LINK_DECORATION__OUTLINE_WIDTH:
				return getOutlineWidth();
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
			case VisualizationPackage.LINK_DECORATION__FILL:
				setFill((Boolean)newValue);
				return;
			case VisualizationPackage.LINK_DECORATION__OUTLINE:
				setOutline((Boolean)newValue);
				return;
			case VisualizationPackage.LINK_DECORATION__FOREGROUND_COLOR:
				setForegroundColor((ColorConstant)newValue);
				return;
			case VisualizationPackage.LINK_DECORATION__BACKGROUND_COLOR:
				setBackgroundColor((ColorConstant)newValue);
				return;
			case VisualizationPackage.LINK_DECORATION__OUTLINE_WIDTH:
				setOutlineWidth((Integer)newValue);
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
			case VisualizationPackage.LINK_DECORATION__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case VisualizationPackage.LINK_DECORATION__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case VisualizationPackage.LINK_DECORATION__FOREGROUND_COLOR:
				setForegroundColor(FOREGROUND_COLOR_EDEFAULT);
				return;
			case VisualizationPackage.LINK_DECORATION__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case VisualizationPackage.LINK_DECORATION__OUTLINE_WIDTH:
				setOutlineWidth(OUTLINE_WIDTH_EDEFAULT);
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
			case VisualizationPackage.LINK_DECORATION__FILL:
				return fill != FILL_EDEFAULT;
			case VisualizationPackage.LINK_DECORATION__OUTLINE:
				return outline != OUTLINE_EDEFAULT;
			case VisualizationPackage.LINK_DECORATION__FOREGROUND_COLOR:
				return foregroundColor != FOREGROUND_COLOR_EDEFAULT;
			case VisualizationPackage.LINK_DECORATION__BACKGROUND_COLOR:
				return backgroundColor != BACKGROUND_COLOR_EDEFAULT;
			case VisualizationPackage.LINK_DECORATION__OUTLINE_WIDTH:
				return outlineWidth != OUTLINE_WIDTH_EDEFAULT;
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
		result.append(" (fill: ");
		result.append(fill);
		result.append(", outline: ");
		result.append(outline);
		result.append(", foregroundColor: ");
		result.append(foregroundColor);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", outlineWidth: ");
		result.append(outlineWidth);
		result.append(')');
		return result.toString();
	}

} //LinkDecorationImpl
