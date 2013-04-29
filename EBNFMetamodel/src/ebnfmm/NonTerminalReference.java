/**
 */
package ebnfmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Terminal Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ebnfmm.NonTerminalReference#getNonTerminal <em>Non Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see ebnfmm.EbnfmmPackage#getNonTerminalReference()
 * @model
 * @generated
 */
public interface NonTerminalReference extends Symbol {
	/**
	 * Returns the value of the '<em><b>Non Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Terminal</em>' reference.
	 * @see #setNonTerminal(NonTerminal)
	 * @see ebnfmm.EbnfmmPackage#getNonTerminalReference_NonTerminal()
	 * @model required="true"
	 * @generated
	 */
	NonTerminal getNonTerminal();

	/**
	 * Sets the value of the '{@link ebnfmm.NonTerminalReference#getNonTerminal <em>Non Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Terminal</em>' reference.
	 * @see #getNonTerminal()
	 * @generated
	 */
	void setNonTerminal(NonTerminal value);

} // NonTerminalReference
