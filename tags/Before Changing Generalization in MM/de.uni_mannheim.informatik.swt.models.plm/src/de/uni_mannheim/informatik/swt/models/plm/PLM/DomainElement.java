/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement#isElided <em>Elided</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getDomainElement()
 * @model abstract="true"
 * @generated
 */
public interface DomainElement extends OwnedElement {
	/**
	 * Returns the value of the '<em><b>Elided</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elided</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elided</em>' attribute.
	 * @see #setElided(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getDomainElement_Elided()
	 * @model default="false"
	 * @generated
	 */
	boolean isElided();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement#isElided <em>Elided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elided</em>' attribute.
	 * @see #isElided()
	 * @generated
	 */
	void setElided(boolean value);

} // DomainElement
