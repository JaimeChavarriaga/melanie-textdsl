/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Additional Properties Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.HasAdditionalPropertiesCheck#getCommonProperties <em>Common Properties</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.HasAdditionalPropertiesCheck#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getHasAdditionalPropertiesCheck()
 * @model
 * @generated
 */
public interface HasAdditionalPropertiesCheck extends CompositeCheck {
	/**
	 * Returns the value of the '<em><b>Common Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Properties</em>' reference.
	 * @see #setCommonProperties(Element)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getHasAdditionalPropertiesCheck_CommonProperties()
	 * @model ordered="false"
	 * @generated
	 */
	Element getCommonProperties();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.HasAdditionalPropertiesCheck#getCommonProperties <em>Common Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Properties</em>' reference.
	 * @see #getCommonProperties()
	 * @generated
	 */
	void setCommonProperties(Element value);

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' reference.
	 * @see #setAdditionalProperties(Element)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getHasAdditionalPropertiesCheck_AdditionalProperties()
	 * @model ordered="false"
	 * @generated
	 */
	Element getAdditionalProperties();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.HasAdditionalPropertiesCheck#getAdditionalProperties <em>Additional Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' reference.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(Element value);

} // HasAdditionalPropertiesCheck
