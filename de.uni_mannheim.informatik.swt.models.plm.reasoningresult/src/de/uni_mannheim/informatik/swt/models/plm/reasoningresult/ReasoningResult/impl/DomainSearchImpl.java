/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DomainSearch;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DomainSearchImpl#getSupertypeIsonyms <em>Supertype Isonyms</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DomainSearchImpl#getSubtypeIsonyms <em>Subtype Isonyms</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.DomainSearchImpl#getInterestingInstances <em>Interesting Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainSearchImpl extends CompositeCheckImpl implements DomainSearch {
	/**
	 * The cached value of the '{@link #getSupertypeIsonyms() <em>Supertype Isonyms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertypeIsonyms()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> supertypeIsonyms;

	/**
	 * The cached value of the '{@link #getSubtypeIsonyms() <em>Subtype Isonyms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypeIsonyms()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> subtypeIsonyms;

	/**
	 * The cached value of the '{@link #getInterestingInstances() <em>Interesting Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterestingInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> interestingInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.DOMAIN_SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clabject> getSupertypeIsonyms() {
		if (supertypeIsonyms == null) {
			supertypeIsonyms = new EObjectResolvingEList<Clabject>(Clabject.class, this, ReasoningResultPackage.DOMAIN_SEARCH__SUPERTYPE_ISONYMS);
		}
		return supertypeIsonyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clabject> getSubtypeIsonyms() {
		if (subtypeIsonyms == null) {
			subtypeIsonyms = new EObjectResolvingEList<Clabject>(Clabject.class, this, ReasoningResultPackage.DOMAIN_SEARCH__SUBTYPE_ISONYMS);
		}
		return subtypeIsonyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clabject> getInterestingInstances() {
		if (interestingInstances == null) {
			interestingInstances = new EObjectResolvingEList<Clabject>(Clabject.class, this, ReasoningResultPackage.DOMAIN_SEARCH__INTERESTING_INSTANCES);
		}
		return interestingInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.DOMAIN_SEARCH__SUPERTYPE_ISONYMS:
				return getSupertypeIsonyms();
			case ReasoningResultPackage.DOMAIN_SEARCH__SUBTYPE_ISONYMS:
				return getSubtypeIsonyms();
			case ReasoningResultPackage.DOMAIN_SEARCH__INTERESTING_INSTANCES:
				return getInterestingInstances();
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
			case ReasoningResultPackage.DOMAIN_SEARCH__SUPERTYPE_ISONYMS:
				getSupertypeIsonyms().clear();
				getSupertypeIsonyms().addAll((Collection<? extends Clabject>)newValue);
				return;
			case ReasoningResultPackage.DOMAIN_SEARCH__SUBTYPE_ISONYMS:
				getSubtypeIsonyms().clear();
				getSubtypeIsonyms().addAll((Collection<? extends Clabject>)newValue);
				return;
			case ReasoningResultPackage.DOMAIN_SEARCH__INTERESTING_INSTANCES:
				getInterestingInstances().clear();
				getInterestingInstances().addAll((Collection<? extends Clabject>)newValue);
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
			case ReasoningResultPackage.DOMAIN_SEARCH__SUPERTYPE_ISONYMS:
				getSupertypeIsonyms().clear();
				return;
			case ReasoningResultPackage.DOMAIN_SEARCH__SUBTYPE_ISONYMS:
				getSubtypeIsonyms().clear();
				return;
			case ReasoningResultPackage.DOMAIN_SEARCH__INTERESTING_INSTANCES:
				getInterestingInstances().clear();
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
			case ReasoningResultPackage.DOMAIN_SEARCH__SUPERTYPE_ISONYMS:
				return supertypeIsonyms != null && !supertypeIsonyms.isEmpty();
			case ReasoningResultPackage.DOMAIN_SEARCH__SUBTYPE_ISONYMS:
				return subtypeIsonyms != null && !subtypeIsonyms.isEmpty();
			case ReasoningResultPackage.DOMAIN_SEARCH__INTERESTING_INSTANCES:
				return interestingInstances != null && !interestingInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainSearchImpl
