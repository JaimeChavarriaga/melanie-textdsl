/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Search Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.FeatureSearchCheckImpl#getNoFeatures <em>No Features</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.FeatureSearchCheckImpl#getTypeFeature <em>Type Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureSearchCheckImpl extends CompositeCheckImpl implements FeatureSearchCheck {
	/**
	 * The default value of the '{@link #getNoFeatures() <em>No Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_FEATURES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoFeatures() <em>No Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoFeatures()
	 * @generated
	 * @ordered
	 */
	protected int noFeatures = NO_FEATURES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeFeature() <em>Type Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature typeFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureSearchCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.FEATURE_SEARCH_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoFeatures() {
		return noFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoFeatures(int newNoFeatures) {
		int oldNoFeatures = noFeatures;
		noFeatures = newNoFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.FEATURE_SEARCH_CHECK__NO_FEATURES, oldNoFeatures, noFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getTypeFeature() {
		if (typeFeature != null && typeFeature.eIsProxy()) {
			InternalEObject oldTypeFeature = (InternalEObject)typeFeature;
			typeFeature = (Feature)eResolveProxy(oldTypeFeature);
			if (typeFeature != oldTypeFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.FEATURE_SEARCH_CHECK__TYPE_FEATURE, oldTypeFeature, typeFeature));
			}
		}
		return typeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetTypeFeature() {
		return typeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeFeature(Feature newTypeFeature) {
		Feature oldTypeFeature = typeFeature;
		typeFeature = newTypeFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.FEATURE_SEARCH_CHECK__TYPE_FEATURE, oldTypeFeature, typeFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.FEATURE_SEARCH_CHECK__NO_FEATURES:
				return getNoFeatures();
			case ReasoningResultPackage.FEATURE_SEARCH_CHECK__TYPE_FEATURE:
				if (resolve) return getTypeFeature();
				return basicGetTypeFeature();
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
			case ReasoningResultPackage.FEATURE_SEARCH_CHECK__NO_FEATURES:
				setNoFeatures((Integer)newValue);
				return;
			case ReasoningResultPackage.FEATURE_SEARCH_CHECK__TYPE_FEATURE:
				setTypeFeature((Feature)newValue);
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
			case ReasoningResultPackage.FEATURE_SEARCH_CHECK__NO_FEATURES:
				setNoFeatures(NO_FEATURES_EDEFAULT);
				return;
			case ReasoningResultPackage.FEATURE_SEARCH_CHECK__TYPE_FEATURE:
				setTypeFeature((Feature)null);
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
			case ReasoningResultPackage.FEATURE_SEARCH_CHECK__NO_FEATURES:
				return noFeatures != NO_FEATURES_EDEFAULT;
			case ReasoningResultPackage.FEATURE_SEARCH_CHECK__TYPE_FEATURE:
				return typeFeature != null;
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
		result.append(" (NoFeatures: ");
		result.append(noFeatures);
		result.append(')');
		return result.toString();
	}

} //FeatureSearchCheckImpl
