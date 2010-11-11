/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PanLevelModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PInstantiable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiableElement#getPotency <em>Potency</em>}</li>
 * </ul>
 * </p>
 *
 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModelPackage#getPInstantiableElement()
 * @model
 * @generated
 */
public interface PInstantiableElement extends PLevelSpecificElement {
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
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModelPackage#getPInstantiableElement_Potency()
	 * @model required="true"
	 * @generated
	 */
	int getPotency();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiableElement#getPotency <em>Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potency</em>' attribute.
	 * @see #getPotency()
	 * @generated
	 */
	void setPotency(int value);

} // PInstantiableElement
