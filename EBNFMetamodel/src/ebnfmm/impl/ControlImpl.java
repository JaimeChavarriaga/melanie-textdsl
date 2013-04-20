/**
 */
package ebnfmm.impl;

import ebnfmm.Control;
import ebnfmm.Dummy;
import ebnfmm.EbnfmmPackage;

import ebnfmm.NonReferenceableSymbol;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ebnfmm.impl.ControlImpl#getDefinitionList <em>Definition List</em>}</li>
 *   <li>{@link ebnfmm.impl.ControlImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlImpl extends NonReferenceableSymbolImpl implements Control {
	/**
	 * The cached value of the '{@link #getDefinitionList() <em>Definition List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionList()
	 * @generated
	 * @ordered
	 */
	protected EList<NonReferenceableSymbol> definitionList;
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Dummy> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EbnfmmPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonReferenceableSymbol> getDefinitionList() {
		if (definitionList == null) {
			definitionList = new EObjectResolvingEList<NonReferenceableSymbol>(NonReferenceableSymbol.class, this, EbnfmmPackage.CONTROL__DEFINITION_LIST);
		}
		return definitionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dummy> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Dummy>(Dummy.class, this, EbnfmmPackage.CONTROL__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EbnfmmPackage.CONTROL__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case EbnfmmPackage.CONTROL__DEFINITION_LIST:
				return getDefinitionList();
			case EbnfmmPackage.CONTROL__ITEMS:
				return getItems();
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
			case EbnfmmPackage.CONTROL__DEFINITION_LIST:
				getDefinitionList().clear();
				getDefinitionList().addAll((Collection<? extends NonReferenceableSymbol>)newValue);
				return;
			case EbnfmmPackage.CONTROL__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Dummy>)newValue);
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
			case EbnfmmPackage.CONTROL__DEFINITION_LIST:
				getDefinitionList().clear();
				return;
			case EbnfmmPackage.CONTROL__ITEMS:
				getItems().clear();
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
			case EbnfmmPackage.CONTROL__DEFINITION_LIST:
				return definitionList != null && !definitionList.isEmpty();
			case EbnfmmPackage.CONTROL__ITEMS:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlImpl
