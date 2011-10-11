/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment;
import de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Border Layout Information Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.BorderLayoutInformationDescriptorImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.BorderLayoutInformationDescriptorImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.BorderLayoutInformationDescriptorImpl#getVerticalOffset <em>Vertical Offset</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.BorderLayoutInformationDescriptorImpl#getHorizontalOffset <em>Horizontal Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BorderLayoutInformationDescriptorImpl extends LayoutInformationDescriptorImpl implements BorderLayoutInformationDescriptor {
	/**
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment VERTICAL_ALIGNMENT_EDEFAULT = Alignment.END;

	/**
	 * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment HORIZONTAL_ALIGNMENT_EDEFAULT = Alignment.CENTER;

	/**
	 * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalOffset() <em>Vertical Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVerticalOffset() <em>Vertical Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalOffset()
	 * @generated
	 * @ordered
	 */
	protected int verticalOffset = VERTICAL_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalOffset() <em>Horizontal Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHorizontalOffset() <em>Horizontal Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalOffset()
	 * @generated
	 * @ordered
	 */
	protected int horizontalOffset = HORIZONTAL_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BorderLayoutInformationDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.BORDER_LAYOUT_INFORMATION_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getVerticalAlignment() {
		return verticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlignment(Alignment newVerticalAlignment) {
		Alignment oldVerticalAlignment = verticalAlignment;
		verticalAlignment = newVerticalAlignment == null ? VERTICAL_ALIGNMENT_EDEFAULT : newVerticalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getHorizontalAlignment() {
		return horizontalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalAlignment(Alignment newHorizontalAlignment) {
		Alignment oldHorizontalAlignment = horizontalAlignment;
		horizontalAlignment = newHorizontalAlignment == null ? HORIZONTAL_ALIGNMENT_EDEFAULT : newHorizontalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalOffset() {
		return verticalOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalOffset(int newVerticalOffset) {
		int oldVerticalOffset = verticalOffset;
		verticalOffset = newVerticalOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_OFFSET, oldVerticalOffset, verticalOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalOffset() {
		return horizontalOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalOffset(int newHorizontalOffset) {
		int oldHorizontalOffset = horizontalOffset;
		horizontalOffset = newHorizontalOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_OFFSET, oldHorizontalOffset, horizontalOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_OFFSET:
				return getVerticalOffset();
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_OFFSET:
				return getHorizontalOffset();
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
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_ALIGNMENT:
				setVerticalAlignment((Alignment)newValue);
				return;
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((Alignment)newValue);
				return;
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_OFFSET:
				setVerticalOffset((Integer)newValue);
				return;
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_OFFSET:
				setHorizontalOffset((Integer)newValue);
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
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_ALIGNMENT:
				setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
				return;
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
				return;
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_OFFSET:
				setVerticalOffset(VERTICAL_OFFSET_EDEFAULT);
				return;
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_OFFSET:
				setHorizontalOffset(HORIZONTAL_OFFSET_EDEFAULT);
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
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_ALIGNMENT:
				return verticalAlignment != VERTICAL_ALIGNMENT_EDEFAULT;
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_ALIGNMENT:
				return horizontalAlignment != HORIZONTAL_ALIGNMENT_EDEFAULT;
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_OFFSET:
				return verticalOffset != VERTICAL_OFFSET_EDEFAULT;
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_OFFSET:
				return horizontalOffset != HORIZONTAL_OFFSET_EDEFAULT;
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
		result.append(" (verticalAlignment: ");
		result.append(verticalAlignment);
		result.append(", horizontalAlignment: ");
		result.append(horizontalAlignment);
		result.append(", verticalOffset: ");
		result.append(verticalOffset);
		result.append(", horizontalOffset: ");
		result.append(horizontalOffset);
		result.append(')');
		return result.toString();
	}

} //BorderLayoutInformationDescriptorImpl
