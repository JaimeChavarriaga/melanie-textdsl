/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutDescriptorImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutDescriptorImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutDescriptorImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LayoutDescriptorImpl extends VisualizationDescriptorImpl implements LayoutDescriptor {
	/**
	 * The cached value of the '{@link #getMargin() <em>Margin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected SpacingDescriptor margin;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected SpacingDescriptor padding;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<LayoutContentDescriptor> content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.LAYOUT_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingDescriptor getMargin() {
		if (margin != null && margin.eIsProxy()) {
			InternalEObject oldMargin = (InternalEObject)margin;
			margin = (SpacingDescriptor)eResolveProxy(oldMargin);
			if (margin != oldMargin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.LAYOUT_DESCRIPTOR__MARGIN, oldMargin, margin));
			}
		}
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingDescriptor basicGetMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(SpacingDescriptor newMargin) {
		SpacingDescriptor oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.LAYOUT_DESCRIPTOR__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingDescriptor getPadding() {
		if (padding != null && padding.eIsProxy()) {
			InternalEObject oldPadding = (InternalEObject)padding;
			padding = (SpacingDescriptor)eResolveProxy(oldPadding);
			if (padding != oldPadding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationPackage.LAYOUT_DESCRIPTOR__PADDING, oldPadding, padding));
			}
		}
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingDescriptor basicGetPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadding(SpacingDescriptor newPadding) {
		SpacingDescriptor oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.LAYOUT_DESCRIPTOR__PADDING, oldPadding, padding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LayoutContentDescriptor> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<LayoutContentDescriptor>(LayoutContentDescriptor.class, this, VisualizationPackage.LAYOUT_DESCRIPTOR__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualizationPackage.LAYOUT_DESCRIPTOR__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case VisualizationPackage.LAYOUT_DESCRIPTOR__MARGIN:
				if (resolve) return getMargin();
				return basicGetMargin();
			case VisualizationPackage.LAYOUT_DESCRIPTOR__PADDING:
				if (resolve) return getPadding();
				return basicGetPadding();
			case VisualizationPackage.LAYOUT_DESCRIPTOR__CONTENT:
				return getContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisualizationPackage.LAYOUT_DESCRIPTOR__MARGIN:
				setMargin((SpacingDescriptor)newValue);
				return;
			case VisualizationPackage.LAYOUT_DESCRIPTOR__PADDING:
				setPadding((SpacingDescriptor)newValue);
				return;
			case VisualizationPackage.LAYOUT_DESCRIPTOR__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends LayoutContentDescriptor>)newValue);
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
			case VisualizationPackage.LAYOUT_DESCRIPTOR__MARGIN:
				setMargin((SpacingDescriptor)null);
				return;
			case VisualizationPackage.LAYOUT_DESCRIPTOR__PADDING:
				setPadding((SpacingDescriptor)null);
				return;
			case VisualizationPackage.LAYOUT_DESCRIPTOR__CONTENT:
				getContent().clear();
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
			case VisualizationPackage.LAYOUT_DESCRIPTOR__MARGIN:
				return margin != null;
			case VisualizationPackage.LAYOUT_DESCRIPTOR__PADDING:
				return padding != null;
			case VisualizationPackage.LAYOUT_DESCRIPTOR__CONTENT:
				return content != null && !content.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LayoutDescriptorImpl
