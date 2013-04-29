/**
 */
package ebnfmm.impl;

import ebnfmm.Control;
import ebnfmm.EbnfmmPackage;
import ebnfmm.Symbol;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ebnfmm.impl.ControlImpl#getDefinitionList <em>Definition List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ControlImpl extends SymbolImpl implements Control {
	/**
	 * The cached value of the '{@link #getDefinitionList() <em>Definition List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionList()
	 * @generated
	 * @ordered
	 */
	protected EList<Symbol> definitionList;

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
	public EList<Symbol> getDefinitionList() {
		if (definitionList == null) {
			definitionList = new EObjectContainmentEList<Symbol>(Symbol.class, this, EbnfmmPackage.CONTROL__DEFINITION_LIST);
		}
		return definitionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EbnfmmPackage.CONTROL__DEFINITION_LIST:
				return ((InternalEList<?>)getDefinitionList()).basicRemove(otherEnd, msgs);
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
				getDefinitionList().addAll((Collection<? extends Symbol>)newValue);
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
		}
		return super.eIsSet(featureID);
	}

} //ControlImpl
