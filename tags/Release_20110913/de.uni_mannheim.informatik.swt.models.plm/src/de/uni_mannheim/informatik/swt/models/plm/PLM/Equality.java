/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Equality#getEqual <em>Equal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getEquality()
 * @model
 * @generated
 */
public interface Equality extends SetRelationship {
	/**
	 * Returns the value of the '<em><b>Equal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equal</em>' reference.
	 * @see #setEqual(Clabject)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getEquality_Equal()
	 * @model required="true"
	 * @generated
	 */
	Clabject getEqual();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Equality#getEqual <em>Equal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equal</em>' reference.
	 * @see #getEqual()
	 * @generated
	 */
	void setEqual(Clabject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.equal'"
	 * @generated
	 */
	Clabject getTarget();

} // Equality
