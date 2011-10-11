/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Connection Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch#getTypeConnection <em>Type Connection</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch#getNoSearchedConnections <em>No Searched Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getTypeConnectionSearch()
 * @model
 * @generated
 */
public interface TypeConnectionSearch extends CompositeCheck {
	/**
	 * Returns the value of the '<em><b>Type Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Connection</em>' reference.
	 * @see #setTypeConnection(Connection)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getTypeConnectionSearch_TypeConnection()
	 * @model required="true"
	 * @generated
	 */
	Connection getTypeConnection();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch#getTypeConnection <em>Type Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Connection</em>' reference.
	 * @see #getTypeConnection()
	 * @generated
	 */
	void setTypeConnection(Connection value);

	/**
	 * Returns the value of the '<em><b>No Searched Connections</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Searched Connections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Searched Connections</em>' attribute.
	 * @see #setNoSearchedConnections(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getTypeConnectionSearch_NoSearchedConnections()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getNoSearchedConnections();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch#getNoSearchedConnections <em>No Searched Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Searched Connections</em>' attribute.
	 * @see #getNoSearchedConnections()
	 * @generated
	 */
	void setNoSearchedConnections(int value);

} // TypeConnectionSearch
