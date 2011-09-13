/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment;
import de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Layout Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutInformationImpl#getRowSpan <em>Row Span</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutInformationImpl#getColumnSpan <em>Column Span</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutInformationImpl#isGrabHorizontalExcess <em>Grab Horizontal Excess</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutInformationImpl#isGrabVerticalExcess <em>Grab Vertical Excess</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutInformationImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutInformationImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableLayoutInformationImpl extends LayoutInformationDescriptorImpl implements TableLayoutInformation {
	/**
	 * The default value of the '{@link #getRowSpan() <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_SPAN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getRowSpan() <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowSpan()
	 * @generated
	 * @ordered
	 */
	protected int rowSpan = ROW_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnSpan() <em>Column Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_SPAN_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getColumnSpan() <em>Column Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSpan()
	 * @generated
	 * @ordered
	 */
	protected int columnSpan = COLUMN_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrabHorizontalExcess() <em>Grab Horizontal Excess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabHorizontalExcess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_HORIZONTAL_EXCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrabHorizontalExcess() <em>Grab Horizontal Excess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabHorizontalExcess()
	 * @generated
	 * @ordered
	 */
	protected boolean grabHorizontalExcess = GRAB_HORIZONTAL_EXCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isGrabVerticalExcess() <em>Grab Vertical Excess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabVerticalExcess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAB_VERTICAL_EXCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGrabVerticalExcess() <em>Grab Vertical Excess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrabVerticalExcess()
	 * @generated
	 * @ordered
	 */
	protected boolean grabVerticalExcess = GRAB_VERTICAL_EXCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment HORIZONTAL_ALIGNMENT_EDEFAULT = Alignment.BEGIN;

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
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Alignment VERTICAL_ALIGNMENT_EDEFAULT = Alignment.BEGIN;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableLayoutInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.TABLE_LAYOUT_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowSpan() {
		return rowSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowSpan(int newRowSpan) {
		int oldRowSpan = rowSpan;
		rowSpan = newRowSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.TABLE_LAYOUT_INFORMATION__ROW_SPAN, oldRowSpan, rowSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumnSpan() {
		return columnSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnSpan(int newColumnSpan) {
		int oldColumnSpan = columnSpan;
		columnSpan = newColumnSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.TABLE_LAYOUT_INFORMATION__COLUMN_SPAN, oldColumnSpan, columnSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrabHorizontalExcess() {
		return grabHorizontalExcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabHorizontalExcess(boolean newGrabHorizontalExcess) {
		boolean oldGrabHorizontalExcess = grabHorizontalExcess;
		grabHorizontalExcess = newGrabHorizontalExcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.TABLE_LAYOUT_INFORMATION__GRAB_HORIZONTAL_EXCESS, oldGrabHorizontalExcess, grabHorizontalExcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrabVerticalExcess() {
		return grabVerticalExcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabVerticalExcess(boolean newGrabVerticalExcess) {
		boolean oldGrabVerticalExcess = grabVerticalExcess;
		grabVerticalExcess = newGrabVerticalExcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.TABLE_LAYOUT_INFORMATION__GRAB_VERTICAL_EXCESS, oldGrabVerticalExcess, grabVerticalExcess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.TABLE_LAYOUT_INFORMATION__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationPackage.TABLE_LAYOUT_INFORMATION__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__ROW_SPAN:
				return getRowSpan();
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__COLUMN_SPAN:
				return getColumnSpan();
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__GRAB_HORIZONTAL_EXCESS:
				return isGrabHorizontalExcess();
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__GRAB_VERTICAL_EXCESS:
				return isGrabVerticalExcess();
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
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
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__ROW_SPAN:
				setRowSpan((Integer)newValue);
				return;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__COLUMN_SPAN:
				setColumnSpan((Integer)newValue);
				return;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__GRAB_HORIZONTAL_EXCESS:
				setGrabHorizontalExcess((Boolean)newValue);
				return;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__GRAB_VERTICAL_EXCESS:
				setGrabVerticalExcess((Boolean)newValue);
				return;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((Alignment)newValue);
				return;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__VERTICAL_ALIGNMENT:
				setVerticalAlignment((Alignment)newValue);
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
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__ROW_SPAN:
				setRowSpan(ROW_SPAN_EDEFAULT);
				return;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__COLUMN_SPAN:
				setColumnSpan(COLUMN_SPAN_EDEFAULT);
				return;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__GRAB_HORIZONTAL_EXCESS:
				setGrabHorizontalExcess(GRAB_HORIZONTAL_EXCESS_EDEFAULT);
				return;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__GRAB_VERTICAL_EXCESS:
				setGrabVerticalExcess(GRAB_VERTICAL_EXCESS_EDEFAULT);
				return;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
				return;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__VERTICAL_ALIGNMENT:
				setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
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
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__ROW_SPAN:
				return rowSpan != ROW_SPAN_EDEFAULT;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__COLUMN_SPAN:
				return columnSpan != COLUMN_SPAN_EDEFAULT;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__GRAB_HORIZONTAL_EXCESS:
				return grabHorizontalExcess != GRAB_HORIZONTAL_EXCESS_EDEFAULT;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__GRAB_VERTICAL_EXCESS:
				return grabVerticalExcess != GRAB_VERTICAL_EXCESS_EDEFAULT;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__HORIZONTAL_ALIGNMENT:
				return horizontalAlignment != HORIZONTAL_ALIGNMENT_EDEFAULT;
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION__VERTICAL_ALIGNMENT:
				return verticalAlignment != VERTICAL_ALIGNMENT_EDEFAULT;
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
		result.append(" (rowSpan: ");
		result.append(rowSpan);
		result.append(", columnSpan: ");
		result.append(columnSpan);
		result.append(", grabHorizontalExcess: ");
		result.append(grabHorizontalExcess);
		result.append(", grabVerticalExcess: ");
		result.append(grabVerticalExcess);
		result.append(", horizontalAlignment: ");
		result.append(horizontalAlignment);
		result.append(", verticalAlignment: ");
		result.append(verticalAlignment);
		result.append(')');
		return result.toString();
	}

} //TableLayoutInformationImpl
