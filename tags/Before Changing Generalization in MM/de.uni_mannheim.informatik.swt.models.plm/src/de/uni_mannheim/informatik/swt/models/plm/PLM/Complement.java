/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Complement#getComplement <em>Complement</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getComplement()
 * @model
 * @generated
 */
public interface Complement extends SetRelationship {
	/**
	 * Returns the value of the '<em><b>Complement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement</em>' reference.
	 * @see #setComplement(Clabject)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getComplement_Complement()
	 * @model required="true"
	 * @generated
	 */
	Clabject getComplement();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Complement#getComplement <em>Complement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement</em>' reference.
	 * @see #getComplement()
	 * @generated
	 */
	void setComplement(Clabject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.complement'"
	 * @generated
	 */
	Clabject getTarget();

} // Complement
