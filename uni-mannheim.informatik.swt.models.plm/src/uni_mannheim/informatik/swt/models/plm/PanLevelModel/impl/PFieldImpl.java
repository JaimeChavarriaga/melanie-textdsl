/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PField</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PFieldImpl#isDual <em>Dual</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PFieldImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PFieldImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PFieldImpl#getValue <em>Value</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PFieldImpl#getMultiplicityLower <em>Multiplicity Lower</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PFieldImpl#getMultiplicityUpper <em>Multiplicity Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PFieldImpl extends PInstantiableElementImpl implements PField {
	/**
	 * The default value of the '{@link #isDual() <em>Dual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDual() <em>Dual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDual()
	 * @generated
	 * @ordered
	 */
	protected boolean dual = DUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> dataType;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EObject value;

	/**
	 * The default value of the '{@link #getMultiplicityLower() <em>Multiplicity Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityLower()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICITY_LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultiplicityLower() <em>Multiplicity Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityLower()
	 * @generated
	 * @ordered
	 */
	protected int multiplicityLower = MULTIPLICITY_LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicityUpper() <em>Multiplicity Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICITY_UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultiplicityUpper() <em>Multiplicity Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityUpper()
	 * @generated
	 * @ordered
	 */
	protected int multiplicityUpper = MULTIPLICITY_UPPER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PanLevelModelPackage.Literals.PFIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDual() {
		return dual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDual(boolean newDual) {
		boolean oldDual = dual;
		dual = newDual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PanLevelModelPackage.PFIELD__DUAL, oldDual, dual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PanLevelModelPackage.PFIELD__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(Class<?> newDataType) {
		Class<?> oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PanLevelModelPackage.PFIELD__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PanLevelModelPackage.PFIELD__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(EObject newValue) {
		EObject oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PanLevelModelPackage.PFIELD__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplicityLower() {
		return multiplicityLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityLower(int newMultiplicityLower) {
		int oldMultiplicityLower = multiplicityLower;
		multiplicityLower = newMultiplicityLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PanLevelModelPackage.PFIELD__MULTIPLICITY_LOWER, oldMultiplicityLower, multiplicityLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplicityUpper() {
		return multiplicityUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityUpper(int newMultiplicityUpper) {
		int oldMultiplicityUpper = multiplicityUpper;
		multiplicityUpper = newMultiplicityUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PanLevelModelPackage.PFIELD__MULTIPLICITY_UPPER, oldMultiplicityUpper, multiplicityUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PanLevelModelPackage.PFIELD__DUAL:
				return isDual();
			case PanLevelModelPackage.PFIELD__UNIQUE:
				return isUnique();
			case PanLevelModelPackage.PFIELD__DATA_TYPE:
				return getDataType();
			case PanLevelModelPackage.PFIELD__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case PanLevelModelPackage.PFIELD__MULTIPLICITY_LOWER:
				return getMultiplicityLower();
			case PanLevelModelPackage.PFIELD__MULTIPLICITY_UPPER:
				return getMultiplicityUpper();
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
			case PanLevelModelPackage.PFIELD__DUAL:
				setDual((Boolean)newValue);
				return;
			case PanLevelModelPackage.PFIELD__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case PanLevelModelPackage.PFIELD__DATA_TYPE:
				setDataType((Class<?>)newValue);
				return;
			case PanLevelModelPackage.PFIELD__VALUE:
				setValue((EObject)newValue);
				return;
			case PanLevelModelPackage.PFIELD__MULTIPLICITY_LOWER:
				setMultiplicityLower((Integer)newValue);
				return;
			case PanLevelModelPackage.PFIELD__MULTIPLICITY_UPPER:
				setMultiplicityUpper((Integer)newValue);
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
			case PanLevelModelPackage.PFIELD__DUAL:
				setDual(DUAL_EDEFAULT);
				return;
			case PanLevelModelPackage.PFIELD__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case PanLevelModelPackage.PFIELD__DATA_TYPE:
				setDataType((Class<?>)null);
				return;
			case PanLevelModelPackage.PFIELD__VALUE:
				setValue((EObject)null);
				return;
			case PanLevelModelPackage.PFIELD__MULTIPLICITY_LOWER:
				setMultiplicityLower(MULTIPLICITY_LOWER_EDEFAULT);
				return;
			case PanLevelModelPackage.PFIELD__MULTIPLICITY_UPPER:
				setMultiplicityUpper(MULTIPLICITY_UPPER_EDEFAULT);
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
			case PanLevelModelPackage.PFIELD__DUAL:
				return dual != DUAL_EDEFAULT;
			case PanLevelModelPackage.PFIELD__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case PanLevelModelPackage.PFIELD__DATA_TYPE:
				return dataType != null;
			case PanLevelModelPackage.PFIELD__VALUE:
				return value != null;
			case PanLevelModelPackage.PFIELD__MULTIPLICITY_LOWER:
				return multiplicityLower != MULTIPLICITY_LOWER_EDEFAULT;
			case PanLevelModelPackage.PFIELD__MULTIPLICITY_UPPER:
				return multiplicityUpper != MULTIPLICITY_UPPER_EDEFAULT;
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
		result.append(" (dual: ");
		result.append(dual);
		result.append(", unique: ");
		result.append(unique);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", multiplicityLower: ");
		result.append(multiplicityLower);
		result.append(", multiplicityUpper: ");
		result.append(multiplicityUpper);
		result.append(')');
		return result.toString();
	}

} //PFieldImpl
