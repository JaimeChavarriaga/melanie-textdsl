/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expressed Instance Excluded Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ExpressedInstanceExcludedCheckImpl#getExpressedTypes <em>Expressed Types</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ExpressedInstanceExcludedCheckImpl#getAffectedTypes <em>Affected Types</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ExpressedInstanceExcludedCheckImpl#getDisjointSiblings <em>Disjoint Siblings</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ExpressedInstanceExcludedCheckImpl#getAffectedDisjointIntersection <em>Affected Disjoint Intersection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressedInstanceExcludedCheckImpl extends CompositeCheckImpl implements ExpressedInstanceExcludedCheck {
	/**
	 * The cached value of the '{@link #getExpressedTypes() <em>Expressed Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> expressedTypes;

	/**
	 * The cached value of the '{@link #getAffectedTypes() <em>Affected Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> affectedTypes;

	/**
	 * The cached value of the '{@link #getDisjointSiblings() <em>Disjoint Siblings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointSiblings()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> disjointSiblings;

	/**
	 * The cached value of the '{@link #getAffectedDisjointIntersection() <em>Affected Disjoint Intersection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedDisjointIntersection()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> affectedDisjointIntersection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressedInstanceExcludedCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.EXPRESSED_INSTANCE_EXCLUDED_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clabject> getExpressedTypes() {
		if (expressedTypes == null) {
			expressedTypes = new EObjectResolvingEList<Clabject>(Clabject.class, this, ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__EXPRESSED_TYPES);
		}
		return expressedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clabject> getAffectedTypes() {
		if (affectedTypes == null) {
			affectedTypes = new EObjectResolvingEList<Clabject>(Clabject.class, this, ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_TYPES);
		}
		return affectedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clabject> getDisjointSiblings() {
		if (disjointSiblings == null) {
			disjointSiblings = new EObjectResolvingEList<Clabject>(Clabject.class, this, ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__DISJOINT_SIBLINGS);
		}
		return disjointSiblings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clabject> getAffectedDisjointIntersection() {
		if (affectedDisjointIntersection == null) {
			affectedDisjointIntersection = new EObjectResolvingEList<Clabject>(Clabject.class, this, ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_DISJOINT_INTERSECTION);
		}
		return affectedDisjointIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__EXPRESSED_TYPES:
				return getExpressedTypes();
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_TYPES:
				return getAffectedTypes();
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__DISJOINT_SIBLINGS:
				return getDisjointSiblings();
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_DISJOINT_INTERSECTION:
				return getAffectedDisjointIntersection();
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
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__EXPRESSED_TYPES:
				getExpressedTypes().clear();
				getExpressedTypes().addAll((Collection<? extends Clabject>)newValue);
				return;
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_TYPES:
				getAffectedTypes().clear();
				getAffectedTypes().addAll((Collection<? extends Clabject>)newValue);
				return;
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__DISJOINT_SIBLINGS:
				getDisjointSiblings().clear();
				getDisjointSiblings().addAll((Collection<? extends Clabject>)newValue);
				return;
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_DISJOINT_INTERSECTION:
				getAffectedDisjointIntersection().clear();
				getAffectedDisjointIntersection().addAll((Collection<? extends Clabject>)newValue);
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
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__EXPRESSED_TYPES:
				getExpressedTypes().clear();
				return;
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_TYPES:
				getAffectedTypes().clear();
				return;
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__DISJOINT_SIBLINGS:
				getDisjointSiblings().clear();
				return;
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_DISJOINT_INTERSECTION:
				getAffectedDisjointIntersection().clear();
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
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__EXPRESSED_TYPES:
				return expressedTypes != null && !expressedTypes.isEmpty();
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_TYPES:
				return affectedTypes != null && !affectedTypes.isEmpty();
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__DISJOINT_SIBLINGS:
				return disjointSiblings != null && !disjointSiblings.isEmpty();
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_DISJOINT_INTERSECTION:
				return affectedDisjointIntersection != null && !affectedDisjointIntersection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExpressedInstanceExcludedCheckImpl
