/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DatatypeComparisonImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DatatypeComparisonImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeComparisonImpl extends CheckImpl implements DatatypeComparison {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.DATATYPE_COMPARISON;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.DATATYPE_COMPARISON__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.DATATYPE_COMPARISON__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReasoningResultPackage.DATATYPE_COMPARISON__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.DATATYPE_COMPARISON__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.DATATYPE_COMPARISON__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ReasoningResultPackage.DATATYPE_COMPARISON__TARGET:
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
			case ReasoningResultPackage.DATATYPE_COMPARISON__SOURCE:
				setSource((Attribute)newValue);
				return;
			case ReasoningResultPackage.DATATYPE_COMPARISON__TARGET:
				setTarget((Attribute)newValue);
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
			case ReasoningResultPackage.DATATYPE_COMPARISON__SOURCE:
				setSource((Attribute)null);
				return;
			case ReasoningResultPackage.DATATYPE_COMPARISON__TARGET:
				setTarget((Attribute)null);
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
			case ReasoningResultPackage.DATATYPE_COMPARISON__SOURCE:
				return source != null;
			case ReasoningResultPackage.DATATYPE_COMPARISON__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //DatatypeComparisonImpl
