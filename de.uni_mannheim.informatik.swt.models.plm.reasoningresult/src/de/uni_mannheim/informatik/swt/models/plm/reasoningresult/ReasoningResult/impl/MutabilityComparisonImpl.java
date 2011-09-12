/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mutability Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MutabilityComparisonImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MutabilityComparisonImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MutabilityComparisonImpl#getTypeMutability <em>Type Mutability</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.MutabilityComparisonImpl#getInstanceMutability <em>Instance Mutability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MutabilityComparisonImpl extends CheckImpl implements MutabilityComparison {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Attribute source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Attribute target;

	/**
	 * The default value of the '{@link #getTypeMutability() <em>Type Mutability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMutability()
	 * @generated
	 * @ordered
	 */
	protected static final int TYPE_MUTABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTypeMutability() <em>Type Mutability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMutability()
	 * @generated
	 * @ordered
	 */
	protected int typeMutability = TYPE_MUTABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceMutability() <em>Instance Mutability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceMutability()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCE_MUTABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstanceMutability() <em>Instance Mutability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceMutability()
	 * @generated
	 * @ordered
	 */
	protected int instanceMutability = INSTANCE_MUTABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutabilityComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.MUTABILITY_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Attribute)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.MUTABILITY_COMPARISON__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Attribute newSource) {
		Attribute oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.MUTABILITY_COMPARISON__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Attribute)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.MUTABILITY_COMPARISON__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Attribute newTarget) {
		Attribute oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.MUTABILITY_COMPARISON__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTypeMutability() {
		return typeMutability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMutability(int newTypeMutability) {
		int oldTypeMutability = typeMutability;
		typeMutability = newTypeMutability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.MUTABILITY_COMPARISON__TYPE_MUTABILITY, oldTypeMutability, typeMutability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstanceMutability() {
		return instanceMutability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceMutability(int newInstanceMutability) {
		int oldInstanceMutability = instanceMutability;
		instanceMutability = newInstanceMutability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.MUTABILITY_COMPARISON__INSTANCE_MUTABILITY, oldInstanceMutability, instanceMutability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.MUTABILITY_COMPARISON__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ReasoningResultPackage.MUTABILITY_COMPARISON__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ReasoningResultPackage.MUTABILITY_COMPARISON__TYPE_MUTABILITY:
				return getTypeMutability();
			case ReasoningResultPackage.MUTABILITY_COMPARISON__INSTANCE_MUTABILITY:
				return getInstanceMutability();
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
			case ReasoningResultPackage.MUTABILITY_COMPARISON__SOURCE:
				setSource((Attribute)newValue);
				return;
			case ReasoningResultPackage.MUTABILITY_COMPARISON__TARGET:
				setTarget((Attribute)newValue);
				return;
			case ReasoningResultPackage.MUTABILITY_COMPARISON__TYPE_MUTABILITY:
				setTypeMutability((Integer)newValue);
				return;
			case ReasoningResultPackage.MUTABILITY_COMPARISON__INSTANCE_MUTABILITY:
				setInstanceMutability((Integer)newValue);
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
			case ReasoningResultPackage.MUTABILITY_COMPARISON__SOURCE:
				setSource((Attribute)null);
				return;
			case ReasoningResultPackage.MUTABILITY_COMPARISON__TARGET:
				setTarget((Attribute)null);
				return;
			case ReasoningResultPackage.MUTABILITY_COMPARISON__TYPE_MUTABILITY:
				setTypeMutability(TYPE_MUTABILITY_EDEFAULT);
				return;
			case ReasoningResultPackage.MUTABILITY_COMPARISON__INSTANCE_MUTABILITY:
				setInstanceMutability(INSTANCE_MUTABILITY_EDEFAULT);
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
			case ReasoningResultPackage.MUTABILITY_COMPARISON__SOURCE:
				return source != null;
			case ReasoningResultPackage.MUTABILITY_COMPARISON__TARGET:
				return target != null;
			case ReasoningResultPackage.MUTABILITY_COMPARISON__TYPE_MUTABILITY:
				return typeMutability != TYPE_MUTABILITY_EDEFAULT;
			case ReasoningResultPackage.MUTABILITY_COMPARISON__INSTANCE_MUTABILITY:
				return instanceMutability != INSTANCE_MUTABILITY_EDEFAULT;
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
		result.append(" (typeMutability: ");
		result.append(typeMutability);
		result.append(", instanceMutability: ");
		result.append(instanceMutability);
		result.append(')');
		return result.toString();
	}

} //MutabilityComparisonImpl
