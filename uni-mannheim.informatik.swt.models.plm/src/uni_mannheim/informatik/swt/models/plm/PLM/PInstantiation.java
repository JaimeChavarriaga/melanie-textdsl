/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PLM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PInstantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation#getTargetLevel <em>Target Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPInstantiation()
 * @model
 * @generated
 */
public interface PInstantiation extends PConnector {
	/**
	 * Returns the value of the '<em><b>Target Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Level</em>' attribute.
	 * @see #setTargetLevel(int)
	 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPInstantiation_TargetLevel()
	 * @model required="true"
	 * @generated
	 */
	int getTargetLevel();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation#getTargetLevel <em>Target Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Level</em>' attribute.
	 * @see #getTargetLevel()
	 * @generated
	 */
	void setTargetLevel(int value);

} // PInstantiation
