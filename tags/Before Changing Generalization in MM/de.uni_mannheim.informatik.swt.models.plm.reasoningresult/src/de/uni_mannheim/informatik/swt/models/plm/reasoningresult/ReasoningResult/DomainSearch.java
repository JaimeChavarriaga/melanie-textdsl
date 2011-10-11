/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DomainSearch#getSupertypeIsonyms <em>Supertype Isonyms</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DomainSearch#getSubtypeIsonyms <em>Subtype Isonyms</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DomainSearch#getInterestingInstances <em>Interesting Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getDomainSearch()
 * @model
 * @generated
 */
public interface DomainSearch extends CompositeCheck {
	/**
	 * Returns the value of the '<em><b>Supertype Isonyms</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype Isonyms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype Isonyms</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getDomainSearch_SupertypeIsonyms()
	 * @model
	 * @generated
	 */
	EList<Clabject> getSupertypeIsonyms();

	/**
	 * Returns the value of the '<em><b>Subtype Isonyms</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype Isonyms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype Isonyms</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getDomainSearch_SubtypeIsonyms()
	 * @model
	 * @generated
	 */
	EList<Clabject> getSubtypeIsonyms();

	/**
	 * Returns the value of the '<em><b>Interesting Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interesting Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interesting Instances</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getDomainSearch_InterestingInstances()
	 * @model
	 * @generated
	 */
	EList<Clabject> getInterestingInstances();

} // DomainSearch
