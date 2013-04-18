/**
 */
package ebnfmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBNF Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ebnfmm.EBNFDescription#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link ebnfmm.EBNFDescription#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see ebnfmm.EbnfmmPackage#getEBNFDescription()
 * @model
 * @generated
 */
public interface EBNFDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(EBNFDescription)
	 * @see ebnfmm.EbnfmmPackage#getEBNFDescription_EReference0()
	 * @model
	 * @generated
	 */
	EBNFDescription getEReference0();

	/**
	 * Sets the value of the '{@link ebnfmm.EBNFDescription#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(EBNFDescription value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ebnfmm.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ebnfmm.EbnfmmPackage#getEBNFDescription_Rules()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Rule> getRules();

} // EBNFDescription
