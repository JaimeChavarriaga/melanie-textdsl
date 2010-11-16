/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.nodels.plm.PLM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PClabject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PClabject#getType <em>Type</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PClabject#getSuperType <em>Super Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPClabject()
 * @model
 * @generated
 */
public interface PClabject extends PInstantiableElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(PClabject)
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPClabject_Type()
	 * @model
	 * @generated
	 */
	PClabject getType();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PClabject#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PClabject value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference list.
	 * The list contents are of type {@link uni_mannheim.informatik.swt.nodels.plm.PLM.PClabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference list.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPClabject_SuperType()
	 * @model
	 * @generated
	 */
	EList<PClabject> getSuperType();

} // PClabject
