/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Connections Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck#getNoTypeConnection <em>No Type Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getAllConnectionsCheck()
 * @model
 * @generated
 */
public interface AllConnectionsCheck extends CompositeCheck {
	/**
	 * Returns the value of the '<em><b>No Type Connection</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Type Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Type Connection</em>' attribute.
	 * @see #setNoTypeConnection(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getAllConnectionsCheck_NoTypeConnection()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getNoTypeConnection();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck#getNoTypeConnection <em>No Type Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Type Connection</em>' attribute.
	 * @see #getNoTypeConnection()
	 * @generated
	 */
	void setNoTypeConnection(int value);

} // AllConnectionsCheck
