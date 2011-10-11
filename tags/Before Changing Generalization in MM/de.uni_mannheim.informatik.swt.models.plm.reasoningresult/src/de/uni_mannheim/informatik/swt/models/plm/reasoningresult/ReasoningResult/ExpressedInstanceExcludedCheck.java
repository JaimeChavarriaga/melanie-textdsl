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
 * A representation of the model object '<em><b>Expressed Instance Excluded Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getExpressedTypes <em>Expressed Types</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getAffectedTypes <em>Affected Types</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getDisjointSiblings <em>Disjoint Siblings</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck#getAffectedDisjointIntersection <em>Affected Disjoint Intersection</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getExpressedInstanceExcludedCheck()
 * @model
 * @generated
 */
public interface ExpressedInstanceExcludedCheck extends CompositeCheck {
	/**
	 * Returns the value of the '<em><b>Expressed Types</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressed Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressed Types</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getExpressedInstanceExcludedCheck_ExpressedTypes()
	 * @model
	 * @generated
	 */
	EList<Clabject> getExpressedTypes();

	/**
	 * Returns the value of the '<em><b>Affected Types</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Types</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getExpressedInstanceExcludedCheck_AffectedTypes()
	 * @model
	 * @generated
	 */
	EList<Clabject> getAffectedTypes();

	/**
	 * Returns the value of the '<em><b>Disjoint Siblings</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Siblings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Siblings</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getExpressedInstanceExcludedCheck_DisjointSiblings()
	 * @model
	 * @generated
	 */
	EList<Clabject> getDisjointSiblings();

	/**
	 * Returns the value of the '<em><b>Affected Disjoint Intersection</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected Disjoint Intersection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Disjoint Intersection</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getExpressedInstanceExcludedCheck_AffectedDisjointIntersection()
	 * @model
	 * @generated
	 */
	EList<Clabject> getAffectedDisjointIntersection();

} // ExpressedInstanceExcludedCheck
