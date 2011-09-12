/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.HasAdditionalPropertiesCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Additional Properties Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.HasAdditionalPropertiesCheckImpl#getCommonProperties <em>Common Properties</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.HasAdditionalPropertiesCheckImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasAdditionalPropertiesCheckImpl extends CompositeCheckImpl implements HasAdditionalPropertiesCheck {
	/**
	 * The cached value of the '{@link #getCommonProperties() <em>Common Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonProperties()
	 * @generated
	 * @ordered
	 */
	protected Element commonProperties;

	/**
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected Element additionalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasAdditionalPropertiesCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.HAS_ADDITIONAL_PROPERTIES_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getCommonProperties() {
		if (commonProperties != null && commonProperties.eIsProxy()) {
			InternalEObject oldCommonProperties = (InternalEObject)commonProperties;
			commonProperties = (Element)eResolveProxy(oldCommonProperties);
			if (commonProperties != oldCommonProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__COMMON_PROPERTIES, oldCommonProperties, commonProperties));
			}
		}
		return commonProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetCommonProperties() {
		return commonProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommonProperties(Element newCommonProperties) {
		Element oldCommonProperties = commonProperties;
		commonProperties = newCommonProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__COMMON_PROPERTIES, oldCommonProperties, commonProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getAdditionalProperties() {
		if (additionalProperties != null && additionalProperties.eIsProxy()) {
			InternalEObject oldAdditionalProperties = (InternalEObject)additionalProperties;
			additionalProperties = (Element)eResolveProxy(oldAdditionalProperties);
			if (additionalProperties != oldAdditionalProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__ADDITIONAL_PROPERTIES, oldAdditionalProperties, additionalProperties));
			}
		}
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetAdditionalProperties() {
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalProperties(Element newAdditionalProperties) {
		Element oldAdditionalProperties = additionalProperties;
		additionalProperties = newAdditionalProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__ADDITIONAL_PROPERTIES, oldAdditionalProperties, additionalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__COMMON_PROPERTIES:
				if (resolve) return getCommonProperties();
				return basicGetCommonProperties();
			case ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__ADDITIONAL_PROPERTIES:
				if (resolve) return getAdditionalProperties();
				return basicGetAdditionalProperties();
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
			case ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__COMMON_PROPERTIES:
				setCommonProperties((Element)newValue);
				return;
			case ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((Element)newValue);
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
			case ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__COMMON_PROPERTIES:
				setCommonProperties((Element)null);
				return;
			case ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((Element)null);
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
			case ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__COMMON_PROPERTIES:
				return commonProperties != null;
			case ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK__ADDITIONAL_PROPERTIES:
				return additionalProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //HasAdditionalPropertiesCheckImpl
