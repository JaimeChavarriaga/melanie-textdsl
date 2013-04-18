/**
 */
package ebnfmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ebnfmm.Rule#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link ebnfmm.Rule#getLhs <em>Lhs</em>}</li>
 *   <li>{@link ebnfmm.Rule#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see ebnfmm.EbnfmmPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(NonTerminal)
	 * @see ebnfmm.EbnfmmPackage#getRule_EReference0()
	 * @model
	 * @generated
	 */
	NonTerminal getEReference0();

	/**
	 * Sets the value of the '{@link ebnfmm.Rule#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(NonTerminal value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(NonTerminal)
	 * @see ebnfmm.EbnfmmPackage#getRule_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NonTerminal getLhs();

	/**
	 * Sets the value of the '{@link ebnfmm.Rule#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(NonTerminal value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' reference list.
	 * The list contents are of type {@link ebnfmm.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' reference list.
	 * @see ebnfmm.EbnfmmPackage#getRule_Rhs()
	 * @model required="true"
	 * @generated
	 */
	EList<Symbol> getRhs();

} // Rule
