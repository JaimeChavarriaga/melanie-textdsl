/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Durability Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DurabilityComparisonImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DurabilityComparisonImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DurabilityComparisonImpl#getTypeDurability <em>Type Durability</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DurabilityComparisonImpl#getInstanceDurability <em>Instance Durability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurabilityComparisonImpl extends CheckImpl implements DurabilityComparison {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Feature source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Feature target;

	/**
	 * The default value of the '{@link #getTypeDurability() <em>Type Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDurability()
	 * @generated
	 * @ordered
	 */
	protected static final int TYPE_DURABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTypeDurability() <em>Type Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDurability()
	 * @generated
	 * @ordered
	 */
	protected int typeDurability = TYPE_DURABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceDurability() <em>Instance Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceDurability()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCE_DURABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstanceDurability() <em>Instance Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceDurability()
	 * @generated
	 * @ordered
	 */
	protected int instanceDurability = INSTANCE_DURABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurabilityComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.DURABILITY_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Feature)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.DURABILITY_COMPARISON__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Feature newSource) {
		Feature oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.DURABILITY_COMPARISON__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Feature)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.DURABILITY_COMPARISON__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Feature newTarget) {
		Feature oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.DURABILITY_COMPARISON__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTypeDurability() {
		return typeDurability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDurability(int newTypeDurability) {
		int oldTypeDurability = typeDurability;
		typeDurability = newTypeDurability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.DURABILITY_COMPARISON__TYPE_DURABILITY, oldTypeDurability, typeDurability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstanceDurability() {
		return instanceDurability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceDurability(int newInstanceDurability) {
		int oldInstanceDurability = instanceDurability;
		instanceDurability = newInstanceDurability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.DURABILITY_COMPARISON__INSTANCE_DURABILITY, oldInstanceDurability, instanceDurability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.DURABILITY_COMPARISON__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ReasoningResultPackage.DURABILITY_COMPARISON__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ReasoningResultPackage.DURABILITY_COMPARISON__TYPE_DURABILITY:
				return getTypeDurability();
			case ReasoningResultPackage.DURABILITY_COMPARISON__INSTANCE_DURABILITY:
				return getInstanceDurability();
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
			case ReasoningResultPackage.DURABILITY_COMPARISON__SOURCE:
				setSource((Feature)newValue);
				return;
			case ReasoningResultPackage.DURABILITY_COMPARISON__TARGET:
				setTarget((Feature)newValue);
				return;
			case ReasoningResultPackage.DURABILITY_COMPARISON__TYPE_DURABILITY:
				setTypeDurability((Integer)newValue);
				return;
			case ReasoningResultPackage.DURABILITY_COMPARISON__INSTANCE_DURABILITY:
				setInstanceDurability((Integer)newValue);
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
			case ReasoningResultPackage.DURABILITY_COMPARISON__SOURCE:
				setSource((Feature)null);
				return;
			case ReasoningResultPackage.DURABILITY_COMPARISON__TARGET:
				setTarget((Feature)null);
				return;
			case ReasoningResultPackage.DURABILITY_COMPARISON__TYPE_DURABILITY:
				setTypeDurability(TYPE_DURABILITY_EDEFAULT);
				return;
			case ReasoningResultPackage.DURABILITY_COMPARISON__INSTANCE_DURABILITY:
				setInstanceDurability(INSTANCE_DURABILITY_EDEFAULT);
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
			case ReasoningResultPackage.DURABILITY_COMPARISON__SOURCE:
				return source != null;
			case ReasoningResultPackage.DURABILITY_COMPARISON__TARGET:
				return target != null;
			case ReasoningResultPackage.DURABILITY_COMPARISON__TYPE_DURABILITY:
				return typeDurability != TYPE_DURABILITY_EDEFAULT;
			case ReasoningResultPackage.DURABILITY_COMPARISON__INSTANCE_DURABILITY:
				return instanceDurability != INSTANCE_DURABILITY_EDEFAULT;
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
		result.append(" (typeDurability: ");
		result.append(typeDurability);
		result.append(", instanceDurability: ");
		result.append(instanceDurability);
		result.append(')');
		return result.toString();
	}

} //DurabilityComparisonImpl
