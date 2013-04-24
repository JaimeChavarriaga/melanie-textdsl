/**
 */
package ebnfmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ebnfmm.Terminal#getTerminalString <em>Terminal String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ebnfmm.EbnfmmPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends NonReferenceableSymbol {

	/**
	 * Returns the value of the '<em><b>Terminal String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal String</em>' attribute.
	 * @see #setTerminalString(String)
	 * @see ebnfmm.EbnfmmPackage#getTerminal_TerminalString()
	 * @model required="true"
	 * @generated
	 */
	String getTerminalString();

	/**
	 * Sets the value of the '{@link ebnfmm.Terminal#getTerminalString <em>Terminal String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal String</em>' attribute.
	 * @see #getTerminalString()
	 * @generated
	 */
	void setTerminalString(String value);
} // Terminal
