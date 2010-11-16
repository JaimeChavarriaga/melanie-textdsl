/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.nodels.plm.PLM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#isDual <em>Dual</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#isUnique <em>Unique</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#getValue <em>Value</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#getMultiplicityLower <em>Multiplicity Lower</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#getMultiplicityUpper <em>Multiplicity Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPField()
 * @model
 * @generated
 */
public interface PField extends PInstantiableElement {
	/**
	 * Returns the value of the '<em><b>Dual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dual</em>' attribute.
	 * @see #setDual(boolean)
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPField_Dual()
	 * @model required="true"
	 * @generated
	 */
	boolean isDual();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#isDual <em>Dual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dual</em>' attribute.
	 * @see #isDual()
	 * @generated
	 */
	void setDual(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPField_Unique()
	 * @model required="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(Class)
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPField_DataType()
	 * @model required="true"
	 * @generated
	 */
	Class<?> getDataType();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EObject)
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPField_Value()
	 * @model required="true"
	 * @generated
	 */
	EObject getValue();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EObject value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Lower</em>' attribute.
	 * @see #setMultiplicityLower(int)
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPField_MultiplicityLower()
	 * @model required="true"
	 * @generated
	 */
	int getMultiplicityLower();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#getMultiplicityLower <em>Multiplicity Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Lower</em>' attribute.
	 * @see #getMultiplicityLower()
	 * @generated
	 */
	void setMultiplicityLower(int value);

	/**
	 * Returns the value of the '<em><b>Multiplicity Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Upper</em>' attribute.
	 * @see #setMultiplicityUpper(int)
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPField_MultiplicityUpper()
	 * @model required="true"
	 * @generated
	 */
	int getMultiplicityUpper();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField#getMultiplicityUpper <em>Multiplicity Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Upper</em>' attribute.
	 * @see #getMultiplicityUpper()
	 * @generated
	 */
	void setMultiplicityUpper(int value);

} // PField
