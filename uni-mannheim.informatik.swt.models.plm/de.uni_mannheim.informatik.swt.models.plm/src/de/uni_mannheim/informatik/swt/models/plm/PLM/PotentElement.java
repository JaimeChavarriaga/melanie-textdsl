/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potent Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.PotentElement#getPotency <em>Potency</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPotentElement()
 * @model
 * @generated
 */
public interface PotentElement extends OwnedElement {
	/**
	 * Returns the value of the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potency</em>' attribute.
	 * @see #setPotency(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPotentElement_Potency()
	 * @model
	 * @generated
	 */
	int getPotency();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.PotentElement#getPotency <em>Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potency</em>' attribute.
	 * @see #getPotency()
	 * @generated
	 */
	void setPotency(int value);

} // PotentElement
