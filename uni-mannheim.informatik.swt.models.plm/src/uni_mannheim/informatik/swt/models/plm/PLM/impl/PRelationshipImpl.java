/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PLM.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uni_mannheim.informatik.swt.models.plm.PLM.PClabject;
import uni_mannheim.informatik.swt.models.plm.PLM.PConnector;
import uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import uni_mannheim.informatik.swt.models.plm.PLM.PRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRelationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.impl.PRelationshipImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.impl.PRelationshipImpl#getRoleNames <em>Role Names</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.impl.PRelationshipImpl#getMultiplicityLower <em>Multiplicity Lower</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.impl.PRelationshipImpl#getMultiplicityUpper <em>Multiplicity Upper</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.impl.PRelationshipImpl#getIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.impl.PRelationshipImpl#getIsOrdered <em>Is Ordered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PRelationshipImpl extends PClabjectImpl implements PRelationship {
	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<PClabject> participants;

	/**
	 * The cached value of the '{@link #getRoleNames() <em>Role Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> roleNames;

	/**
	 * The cached value of the '{@link #getMultiplicityLower() <em>Multiplicity Lower</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityLower()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> multiplicityLower;

	/**
	 * The cached value of the '{@link #getMultiplicityUpper() <em>Multiplicity Upper</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityUpper()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> multiplicityUpper;

	/**
	 * The cached value of the '{@link #getIsNavigable() <em>Is Navigable</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> isNavigable;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> isOrdered;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.PRELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PClabject> getParticipants() {
		if (participants == null) {
			participants = new EObjectResolvingEList<PClabject>(PClabject.class, this, PLMPackage.PRELATIONSHIP__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoleNames() {
		if (roleNames == null) {
			roleNames = new EDataTypeUniqueEList<String>(String.class, this, PLMPackage.PRELATIONSHIP__ROLE_NAMES);
		}
		return roleNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getMultiplicityLower() {
		if (multiplicityLower == null) {
			multiplicityLower = new EDataTypeUniqueEList<Integer>(Integer.class, this, PLMPackage.PRELATIONSHIP__MULTIPLICITY_LOWER);
		}
		return multiplicityLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getMultiplicityUpper() {
		if (multiplicityUpper == null) {
			multiplicityUpper = new EDataTypeUniqueEList<Integer>(Integer.class, this, PLMPackage.PRELATIONSHIP__MULTIPLICITY_UPPER);
		}
		return multiplicityUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getIsNavigable() {
		if (isNavigable == null) {
			isNavigable = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, PLMPackage.PRELATIONSHIP__IS_NAVIGABLE);
		}
		return isNavigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getIsOrdered() {
		if (isOrdered == null) {
			isOrdered = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, PLMPackage.PRELATIONSHIP__IS_ORDERED);
		}
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PLMPackage.PRELATIONSHIP__PARTICIPANTS:
				return getParticipants();
			case PLMPackage.PRELATIONSHIP__ROLE_NAMES:
				return getRoleNames();
			case PLMPackage.PRELATIONSHIP__MULTIPLICITY_LOWER:
				return getMultiplicityLower();
			case PLMPackage.PRELATIONSHIP__MULTIPLICITY_UPPER:
				return getMultiplicityUpper();
			case PLMPackage.PRELATIONSHIP__IS_NAVIGABLE:
				return getIsNavigable();
			case PLMPackage.PRELATIONSHIP__IS_ORDERED:
				return getIsOrdered();
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
			case PLMPackage.PRELATIONSHIP__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends PClabject>)newValue);
				return;
			case PLMPackage.PRELATIONSHIP__ROLE_NAMES:
				getRoleNames().clear();
				getRoleNames().addAll((Collection<? extends String>)newValue);
				return;
			case PLMPackage.PRELATIONSHIP__MULTIPLICITY_LOWER:
				getMultiplicityLower().clear();
				getMultiplicityLower().addAll((Collection<? extends Integer>)newValue);
				return;
			case PLMPackage.PRELATIONSHIP__MULTIPLICITY_UPPER:
				getMultiplicityUpper().clear();
				getMultiplicityUpper().addAll((Collection<? extends Integer>)newValue);
				return;
			case PLMPackage.PRELATIONSHIP__IS_NAVIGABLE:
				getIsNavigable().clear();
				getIsNavigable().addAll((Collection<? extends Boolean>)newValue);
				return;
			case PLMPackage.PRELATIONSHIP__IS_ORDERED:
				getIsOrdered().clear();
				getIsOrdered().addAll((Collection<? extends Boolean>)newValue);
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
			case PLMPackage.PRELATIONSHIP__PARTICIPANTS:
				getParticipants().clear();
				return;
			case PLMPackage.PRELATIONSHIP__ROLE_NAMES:
				getRoleNames().clear();
				return;
			case PLMPackage.PRELATIONSHIP__MULTIPLICITY_LOWER:
				getMultiplicityLower().clear();
				return;
			case PLMPackage.PRELATIONSHIP__MULTIPLICITY_UPPER:
				getMultiplicityUpper().clear();
				return;
			case PLMPackage.PRELATIONSHIP__IS_NAVIGABLE:
				getIsNavigable().clear();
				return;
			case PLMPackage.PRELATIONSHIP__IS_ORDERED:
				getIsOrdered().clear();
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
			case PLMPackage.PRELATIONSHIP__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case PLMPackage.PRELATIONSHIP__ROLE_NAMES:
				return roleNames != null && !roleNames.isEmpty();
			case PLMPackage.PRELATIONSHIP__MULTIPLICITY_LOWER:
				return multiplicityLower != null && !multiplicityLower.isEmpty();
			case PLMPackage.PRELATIONSHIP__MULTIPLICITY_UPPER:
				return multiplicityUpper != null && !multiplicityUpper.isEmpty();
			case PLMPackage.PRELATIONSHIP__IS_NAVIGABLE:
				return isNavigable != null && !isNavigable.isEmpty();
			case PLMPackage.PRELATIONSHIP__IS_ORDERED:
				return isOrdered != null && !isOrdered.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PConnector.class) {
			switch (derivedFeatureID) {
				case PLMPackage.PRELATIONSHIP__PARTICIPANTS: return PLMPackage.PCONNECTOR__PARTICIPANTS;
				case PLMPackage.PRELATIONSHIP__ROLE_NAMES: return PLMPackage.PCONNECTOR__ROLE_NAMES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PConnector.class) {
			switch (baseFeatureID) {
				case PLMPackage.PCONNECTOR__PARTICIPANTS: return PLMPackage.PRELATIONSHIP__PARTICIPANTS;
				case PLMPackage.PCONNECTOR__ROLE_NAMES: return PLMPackage.PRELATIONSHIP__ROLE_NAMES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (roleNames: ");
		result.append(roleNames);
		result.append(", multiplicityLower: ");
		result.append(multiplicityLower);
		result.append(", multiplicityUpper: ");
		result.append(multiplicityUpper);
		result.append(", isNavigable: ");
		result.append(isNavigable);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(')');
		return result.toString();
	}

} //PRelationshipImpl
