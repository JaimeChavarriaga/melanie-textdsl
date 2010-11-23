/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#isMediate <em>Mediate</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Mediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediate</em>' attribute.
	 * @see #setMediate(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getGeneralization_Mediate()
	 * @model
	 * @generated
	 */
	boolean isMediate();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#isMediate <em>Mediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediate</em>' attribute.
	 * @see #isMediate()
	 * @generated
	 */
	void setMediate(boolean value);

} // Generalization
