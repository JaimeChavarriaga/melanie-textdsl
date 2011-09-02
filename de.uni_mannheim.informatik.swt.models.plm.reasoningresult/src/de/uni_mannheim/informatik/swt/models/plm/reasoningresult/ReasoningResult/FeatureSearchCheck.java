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
 * A representation of the model object '<em><b>Feature Search Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck#getNoFeatures <em>No Features</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck#getTypeFeature <em>Type Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getFeatureSearchCheck()
 * @model
 * @generated
 */
public interface FeatureSearchCheck extends CompositeCheck {
	/**
	 * Returns the value of the '<em><b>No Features</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Features</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Features</em>' attribute.
	 * @see #setNoFeatures(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getFeatureSearchCheck_NoFeatures()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getNoFeatures();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck#getNoFeatures <em>No Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Features</em>' attribute.
	 * @see #getNoFeatures()
	 * @generated
	 */
	void setNoFeatures(int value);

	/**
	 * Returns the value of the '<em><b>Type Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Feature</em>' reference.
	 * @see #setTypeFeature(Feature)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getFeatureSearchCheck_TypeFeature()
	 * @model required="true"
	 * @generated
	 */
	Feature getTypeFeature();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck#getTypeFeature <em>Type Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Feature</em>' reference.
	 * @see #getTypeFeature()
	 * @generated
	 */
	void setTypeFeature(Feature value);

} // FeatureSearchCheck
