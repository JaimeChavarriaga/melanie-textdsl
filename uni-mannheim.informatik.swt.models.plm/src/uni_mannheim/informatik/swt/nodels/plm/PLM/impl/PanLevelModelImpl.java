/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.nodels.plm.PLM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uni_mannheim.informatik.swt.nodels.plm.PLM.PElement;
import uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage;
import uni_mannheim.informatik.swt.nodels.plm.PLM.PanLevelModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pan Level Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.impl.PanLevelModelImpl#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PanLevelModelImpl extends EObjectImpl implements PanLevelModel {
	/**
	 * The cached value of the '{@link #getModelElements() <em>Model Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<PElement> modelElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PanLevelModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.PAN_LEVEL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PElement> getModelElements() {
		if (modelElements == null) {
			modelElements = new EObjectContainmentEList<PElement>(PElement.class, this, PLMPackage.PAN_LEVEL_MODEL__MODEL_ELEMENTS);
		}
		return modelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PLMPackage.PAN_LEVEL_MODEL__MODEL_ELEMENTS:
				return ((InternalEList<?>)getModelElements()).basicRemove(otherEnd, msgs);
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
			case PLMPackage.PAN_LEVEL_MODEL__MODEL_ELEMENTS:
				return getModelElements();
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
			case PLMPackage.PAN_LEVEL_MODEL__MODEL_ELEMENTS:
				getModelElements().clear();
				getModelElements().addAll((Collection<? extends PElement>)newValue);
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
			case PLMPackage.PAN_LEVEL_MODEL__MODEL_ELEMENTS:
				getModelElements().clear();
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
			case PLMPackage.PAN_LEVEL_MODEL__MODEL_ELEMENTS:
				return modelElements != null && !modelElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PanLevelModelImpl
