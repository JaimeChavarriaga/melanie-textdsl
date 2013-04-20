/**
 */
package ebnfmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dummy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ebnfmm.Dummy#getRef <em>Ref</em>}</li>
 *   <li>{@link ebnfmm.Dummy#getContainment <em>Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ebnfmm.EbnfmmPackage#getDummy()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validDummy'"
 * @generated
 */
public interface Dummy extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(ReferenceableSymbol)
	 * @see ebnfmm.EbnfmmPackage#getDummy_Ref()
	 * @model
	 * @generated
	 */
	ReferenceableSymbol getRef();

	/**
	 * Sets the value of the '{@link ebnfmm.Dummy#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(ReferenceableSymbol value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' containment reference.
	 * @see #setContainment(NonReferenceableSymbol)
	 * @see ebnfmm.EbnfmmPackage#getDummy_Containment()
	 * @model containment="true"
	 * @generated
	 */
	NonReferenceableSymbol getContainment();

	/**
	 * Sets the value of the '{@link ebnfmm.Dummy#getContainment <em>Containment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' containment reference.
	 * @see #getContainment()
	 * @generated
	 */
	void setContainment(NonReferenceableSymbol value);

} // Dummy
