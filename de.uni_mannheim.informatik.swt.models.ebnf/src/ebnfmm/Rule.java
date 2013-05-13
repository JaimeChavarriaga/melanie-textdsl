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
 *   <li>{@link ebnfmm.Rule#getMetaIdentifier <em>Meta Identifier</em>}</li>
 *   <li>{@link ebnfmm.Rule#getDefinitionList <em>Definition List</em>}</li>
 * </ul>
 * </p>
 *
 * @see ebnfmm.EbnfmmPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Identifier</em>' containment reference.
	 * @see #setMetaIdentifier(NonTerminal)
	 * @see ebnfmm.EbnfmmPackage#getRule_MetaIdentifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NonTerminal getMetaIdentifier();

	/**
	 * Sets the value of the '{@link ebnfmm.Rule#getMetaIdentifier <em>Meta Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Identifier</em>' containment reference.
	 * @see #getMetaIdentifier()
	 * @generated
	 */
	void setMetaIdentifier(NonTerminal value);

	/**
	 * Returns the value of the '<em><b>Definition List</b></em>' containment reference list.
	 * The list contents are of type {@link ebnfmm.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition List</em>' containment reference list.
	 * @see ebnfmm.EbnfmmPackage#getRule_DefinitionList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Symbol> getDefinitionList();

} // Rule
