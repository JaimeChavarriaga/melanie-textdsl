/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connections Local Conformance Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck#getNoTypeConnections <em>No Type Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getConnectionsLocalConformanceCheck()
 * @model
 * @generated
 */
public interface ConnectionsLocalConformanceCheck extends CompositeCheck {
	/**
	 * Returns the value of the '<em><b>No Type Connections</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Type Connections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Type Connections</em>' attribute.
	 * @see #setNoTypeConnections(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getConnectionsLocalConformanceCheck_NoTypeConnections()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getNoTypeConnections();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck#getNoTypeConnections <em>No Type Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Type Connections</em>' attribute.
	 * @see #getNoTypeConnections()
	 * @generated
	 */
	void setNoTypeConnections(int value);

} // ConnectionsLocalConformanceCheck
