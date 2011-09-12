/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LevelComparisonImpl#getTargetLevel <em>Target Level</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LevelComparisonImpl#getInstanceLevel <em>Instance Level</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LevelComparisonImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.LevelComparisonImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LevelComparisonImpl extends CheckImpl implements LevelComparison {
	/**
	 * The default value of the '{@link #getTargetLevel() <em>Target Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetLevel() <em>Target Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLevel()
	 * @generated
	 * @ordered
	 */
	protected int targetLevel = TARGET_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceLevel() <em>Instance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCE_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstanceLevel() <em>Instance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceLevel()
	 * @generated
	 * @ordered
	 */
	protected int instanceLevel = INSTANCE_LEVEL_EDEFAULT;

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
	protected LevelComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.LEVEL_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetLevel() {
		return targetLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLevel(int newTargetLevel) {
		int oldTargetLevel = targetLevel;
		targetLevel = newTargetLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.LEVEL_COMPARISON__TARGET_LEVEL, oldTargetLevel, targetLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstanceLevel() {
		return instanceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceLevel(int newInstanceLevel) {
		int oldInstanceLevel = instanceLevel;
		instanceLevel = newInstanceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.LEVEL_COMPARISON__INSTANCE_LEVEL, oldInstanceLevel, instanceLevel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.LEVEL_COMPARISON__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.LEVEL_COMPARISON__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.LEVEL_COMPARISON__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.LEVEL_COMPARISON__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.LEVEL_COMPARISON__TARGET_LEVEL:
				return getTargetLevel();
			case ReasoningResultPackage.LEVEL_COMPARISON__INSTANCE_LEVEL:
				return getInstanceLevel();
			case ReasoningResultPackage.LEVEL_COMPARISON__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ReasoningResultPackage.LEVEL_COMPARISON__TARGET:
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
			case ReasoningResultPackage.LEVEL_COMPARISON__TARGET_LEVEL:
				setTargetLevel((Integer)newValue);
				return;
			case ReasoningResultPackage.LEVEL_COMPARISON__INSTANCE_LEVEL:
				setInstanceLevel((Integer)newValue);
				return;
			case ReasoningResultPackage.LEVEL_COMPARISON__SOURCE:
				setSource((Clabject)newValue);
				return;
			case ReasoningResultPackage.LEVEL_COMPARISON__TARGET:
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
			case ReasoningResultPackage.LEVEL_COMPARISON__TARGET_LEVEL:
				setTargetLevel(TARGET_LEVEL_EDEFAULT);
				return;
			case ReasoningResultPackage.LEVEL_COMPARISON__INSTANCE_LEVEL:
				setInstanceLevel(INSTANCE_LEVEL_EDEFAULT);
				return;
			case ReasoningResultPackage.LEVEL_COMPARISON__SOURCE:
				setSource((Clabject)null);
				return;
			case ReasoningResultPackage.LEVEL_COMPARISON__TARGET:
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
			case ReasoningResultPackage.LEVEL_COMPARISON__TARGET_LEVEL:
				return targetLevel != TARGET_LEVEL_EDEFAULT;
			case ReasoningResultPackage.LEVEL_COMPARISON__INSTANCE_LEVEL:
				return instanceLevel != INSTANCE_LEVEL_EDEFAULT;
			case ReasoningResultPackage.LEVEL_COMPARISON__SOURCE:
				return source != null;
			case ReasoningResultPackage.LEVEL_COMPARISON__TARGET:
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
		result.append(" (targetLevel: ");
		result.append(targetLevel);
		result.append(", instanceLevel: ");
		result.append(instanceLevel);
		result.append(')');
		return result.toString();
	}

} //LevelComparisonImpl
