/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PLM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLevel Specific Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.PLevelSpecificElement#getLevel <em>Level</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.PLevelSpecificElement#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPLevelSpecificElement()
 * @model
 * @generated
 */
public interface PLevelSpecificElement extends PElement {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPLevelSpecificElement_Level()
	 * @model required="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.models.plm.PLM.PLevelSpecificElement#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(PElement)
	 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPLevelSpecificElement_Owner()
	 * @model required="true"
	 * @generated
	 */
	PElement getOwner();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.models.plm.PLM.PLevelSpecificElement#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(PElement value);

} // PLevelSpecificElement
