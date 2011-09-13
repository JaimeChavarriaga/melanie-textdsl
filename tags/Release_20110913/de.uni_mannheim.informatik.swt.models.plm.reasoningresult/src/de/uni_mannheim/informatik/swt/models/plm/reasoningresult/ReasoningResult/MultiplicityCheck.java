/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck#getNoOfDomainConnection <em>No Of Domain Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getMultiplicityCheck()
 * @model
 * @generated
 */
public interface MultiplicityCheck extends CompositeCheck {
	/**
	 * Returns the value of the '<em><b>No Of Domain Connection</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Of Domain Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Of Domain Connection</em>' attribute.
	 * @see #setNoOfDomainConnection(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getMultiplicityCheck_NoOfDomainConnection()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getNoOfDomainConnection();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck#getNoOfDomainConnection <em>No Of Domain Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Of Domain Connection</em>' attribute.
	 * @see #getNoOfDomainConnection()
	 * @generated
	 */
	void setNoOfDomainConnection(int value);

} // MultiplicityCheck
