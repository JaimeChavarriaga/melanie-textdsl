/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PLM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.PMethod#getBody <em>Body</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.PMethod#getInput <em>Input</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.PMethod#getOutPut <em>Out Put</em>}</li>
 * </ul>
 * </p>
 *
 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPMethod()
 * @model
 * @generated
 */
public interface PMethod extends PInstantiableElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPMethod_Body()
	 * @model required="true"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link uni_mannheim.informatik.swt.models.plm.PLM.PMethod#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link uni_mannheim.informatik.swt.models.plm.PLM.PElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPMethod_Input()
	 * @model
	 * @generated
	 */
	EList<PElement> getInput();

	/**
	 * Returns the value of the '<em><b>Out Put</b></em>' reference list.
	 * The list contents are of type {@link uni_mannheim.informatik.swt.models.plm.PLM.PElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Put</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Put</em>' reference list.
	 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPMethod_OutPut()
	 * @model
	 * @generated
	 */
	EList<PElement> getOutPut();

} // PMethod
