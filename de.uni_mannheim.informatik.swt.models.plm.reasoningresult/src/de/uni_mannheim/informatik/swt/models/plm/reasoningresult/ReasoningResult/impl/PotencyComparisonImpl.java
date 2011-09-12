/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.PotencyComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potency Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.PotencyComparisonImpl#getTargetPotency <em>Target Potency</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.PotencyComparisonImpl#getInstancePotency <em>Instance Potency</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.PotencyComparisonImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.PotencyComparisonImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PotencyComparisonImpl extends CheckImpl implements PotencyComparison {
	/**
	 * The default value of the '{@link #getTargetPotency() <em>Target Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPotency()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_POTENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetPotency() <em>Target Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPotency()
	 * @generated
	 * @ordered
	 */
	protected int targetPotency = TARGET_POTENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstancePotency() <em>Instance Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancePotency()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCE_POTENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstancePotency() <em>Instance Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancePotency()
	 * @generated
	 * @ordered
	 */
	protected int instancePotency = INSTANCE_POTENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Clabject source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Clabject target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PotencyComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.POTENCY_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetPotency() {
		return targetPotency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPotency(int newTargetPotency) {
		int oldTargetPotency = targetPotency;
		targetPotency = newTargetPotency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.POTENCY_COMPARISON__TARGET_POTENCY, oldTargetPotency, targetPotency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstancePotency() {
		return instancePotency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstancePotency(int newInstancePotency) {
		int oldInstancePotency = instancePotency;
		instancePotency = newInstancePotency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.POTENCY_COMPARISON__INSTANCE_POTENCY, oldInstancePotency, instancePotency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Clabject)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.POTENCY_COMPARISON__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Clabject newSource) {
		Clabject oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.POTENCY_COMPARISON__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Clabject)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.POTENCY_COMPARISON__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Clabject newTarget) {
		Clabject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.POTENCY_COMPARISON__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.POTENCY_COMPARISON__TARGET_POTENCY:
				return getTargetPotency();
			case ReasoningResultPackage.POTENCY_COMPARISON__INSTANCE_POTENCY:
				return getInstancePotency();
			case ReasoningResultPackage.POTENCY_COMPARISON__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ReasoningResultPackage.POTENCY_COMPARISON__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case ReasoningResultPackage.POTENCY_COMPARISON__TARGET_POTENCY:
				setTargetPotency((Integer)newValue);
				return;
			case ReasoningResultPackage.POTENCY_COMPARISON__INSTANCE_POTENCY:
				setInstancePotency((Integer)newValue);
				return;
			case ReasoningResultPackage.POTENCY_COMPARISON__SOURCE:
				setSource((Clabject)newValue);
				return;
			case ReasoningResultPackage.POTENCY_COMPARISON__TARGET:
				setTarget((Clabject)newValue);
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
			case ReasoningResultPackage.POTENCY_COMPARISON__TARGET_POTENCY:
				setTargetPotency(TARGET_POTENCY_EDEFAULT);
				return;
			case ReasoningResultPackage.POTENCY_COMPARISON__INSTANCE_POTENCY:
				setInstancePotency(INSTANCE_POTENCY_EDEFAULT);
				return;
			case ReasoningResultPackage.POTENCY_COMPARISON__SOURCE:
				setSource((Clabject)null);
				return;
			case ReasoningResultPackage.POTENCY_COMPARISON__TARGET:
				setTarget((Clabject)null);
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
			case ReasoningResultPackage.POTENCY_COMPARISON__TARGET_POTENCY:
				return targetPotency != TARGET_POTENCY_EDEFAULT;
			case ReasoningResultPackage.POTENCY_COMPARISON__INSTANCE_POTENCY:
				return instancePotency != INSTANCE_POTENCY_EDEFAULT;
			case ReasoningResultPackage.POTENCY_COMPARISON__SOURCE:
				return source != null;
			case ReasoningResultPackage.POTENCY_COMPARISON__TARGET:
				return target != null;
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
		result.append(" (targetPotency: ");
		result.append(targetPotency);
		result.append(", instancePotency: ");
		result.append(instancePotency);
		result.append(')');
		return result.toString();
	}

} //PotencyComparisonImpl
