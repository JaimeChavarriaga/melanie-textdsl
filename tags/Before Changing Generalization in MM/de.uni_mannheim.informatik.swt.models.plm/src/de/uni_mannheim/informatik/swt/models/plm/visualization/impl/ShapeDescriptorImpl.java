/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ShapeDescriptorImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ShapeDescriptorImpl#isOutline <em>Outline</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ShapeDescriptorImpl#isFill <em>Fill</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ShapeDescriptorImpl#getOutlineWidth <em>Outline Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ShapeDescriptorImpl extends LayoutContentDescriptorImpl implements ShapeDescriptor {
	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected LayoutDescriptor layout;

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
	protected ShapeDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.SHAPE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutDescriptor getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(LayoutDescriptor newLayout, NotificationChain msgs) {
		LayoutDescriptor oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizationPackage.SHAPE_DESCRIPTOR__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(LayoutDescriptor newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizationPackage.SHAPE_DESCRIPTOR__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizationPackage.SHAPE_DESCRIPTOR__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.SHAPE_DESCRIPTOR__LAYOUT, newLayout, newLayout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.SHAPE_DESCRIPTOR__OUTLINE, oldOutline, outline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.SHAPE_DESCRIPTOR__FILL, oldFill, fill));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.SHAPE_DESCRIPTOR__OUTLINE_WIDTH, oldOutlineWidth, outlineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualizationPackage.SHAPE_DESCRIPTOR__LAYOUT:
				return basicSetLayout(null, msgs);
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
			case VisualizationPackage.SHAPE_DESCRIPTOR__LAYOUT:
				return getLayout();
			case VisualizationPackage.SHAPE_DESCRIPTOR__OUTLINE:
				return isOutline();
			case VisualizationPackage.SHAPE_DESCRIPTOR__FILL:
				return isFill();
			case VisualizationPackage.SHAPE_DESCRIPTOR__OUTLINE_WIDTH:
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
			case VisualizationPackage.SHAPE_DESCRIPTOR__LAYOUT:
				setLayout((LayoutDescriptor)newValue);
				return;
			case VisualizationPackage.SHAPE_DESCRIPTOR__OUTLINE:
				setOutline((Boolean)newValue);
				return;
			case VisualizationPackage.SHAPE_DESCRIPTOR__FILL:
				setFill((Boolean)newValue);
				return;
			case VisualizationPackage.SHAPE_DESCRIPTOR__OUTLINE_WIDTH:
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
			case VisualizationPackage.SHAPE_DESCRIPTOR__LAYOUT:
				setLayout((LayoutDescriptor)null);
				return;
			case VisualizationPackage.SHAPE_DESCRIPTOR__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case VisualizationPackage.SHAPE_DESCRIPTOR__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case VisualizationPackage.SHAPE_DESCRIPTOR__OUTLINE_WIDTH:
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
			case VisualizationPackage.SHAPE_DESCRIPTOR__LAYOUT:
				return layout != null;
			case VisualizationPackage.SHAPE_DESCRIPTOR__OUTLINE:
				return outline != OUTLINE_EDEFAULT;
			case VisualizationPackage.SHAPE_DESCRIPTOR__FILL:
				return fill != FILL_EDEFAULT;
			case VisualizationPackage.SHAPE_DESCRIPTOR__OUTLINE_WIDTH:
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
		result.append(" (outline: ");
		result.append(outline);
		result.append(", fill: ");
		result.append(fill);
		result.append(", outlineWidth: ");
		result.append(outlineWidth);
		result.append(')');
		return result.toString();
	}

} //ShapeDescriptorImpl
