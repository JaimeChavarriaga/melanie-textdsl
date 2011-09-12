/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Durability Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getTypeDurability <em>Type Durability</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getInstanceDurability <em>Instance Durability</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getDurabilityComparison()
 * @model
 * @generated
 */
public interface DurabilityComparison extends Check {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Feature)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getDurabilityComparison_Source()
	 * @model required="true"
	 * @generated
	 */
	Feature getSource();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Feature value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Feature)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getDurabilityComparison_Target()
	 * @model required="true"
	 * @generated
	 */
	Feature getTarget();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Feature value);

	/**
	 * Returns the value of the '<em><b>Type Durability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Durability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Durability</em>' attribute.
	 * @see #setTypeDurability(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getDurabilityComparison_TypeDurability()
	 * @model required="true"
	 * @generated
	 */
	int getTypeDurability();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getTypeDurability <em>Type Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Durability</em>' attribute.
	 * @see #getTypeDurability()
	 * @generated
	 */
	void setTypeDurability(int value);

	/**
	 * Returns the value of the '<em><b>Instance Durability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Durability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Durability</em>' attribute.
	 * @see #setInstanceDurability(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getDurabilityComparison_InstanceDurability()
	 * @model required="true"
	 * @generated
	 */
	int getInstanceDurability();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison#getInstanceDurability <em>Instance Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Durability</em>' attribute.
	 * @see #getInstanceDurability()
	 * @generated
	 */
	void setInstanceDurability(int value);

} // DurabilityComparison
