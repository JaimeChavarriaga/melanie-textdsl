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
 * A representation of the model object '<em><b>PRelationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.PRelationship#getMultiplicityLower <em>Multiplicity Lower</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.PRelationship#getMultiplicityUpper <em>Multiplicity Upper</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.PRelationship#getIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PLM.PRelationship#getIsOrdered <em>Is Ordered</em>}</li>
 * </ul>
 * </p>
 *
 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPRelationship()
 * @model
 * @generated
 */
public interface PRelationship extends PClabject, PConnector {
	/**
	 * Returns the value of the '<em><b>Multiplicity Lower</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Lower</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Lower</em>' attribute list.
	 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPRelationship_MultiplicityLower()
	 * @model lower="2"
	 * @generated
	 */
	EList<Integer> getMultiplicityLower();

	/**
	 * Returns the value of the '<em><b>Multiplicity Upper</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Upper</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Upper</em>' attribute list.
	 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPRelationship_MultiplicityUpper()
	 * @model lower="2"
	 * @generated
	 */
	EList<Integer> getMultiplicityUpper();

	/**
	 * Returns the value of the '<em><b>Is Navigable</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Navigable</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Navigable</em>' attribute list.
	 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPRelationship_IsNavigable()
	 * @model lower="2"
	 * @generated
	 */
	EList<Boolean> getIsNavigable();

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute list.
	 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getPRelationship_IsOrdered()
	 * @model lower="2"
	 * @generated
	 */
	EList<Boolean> getIsOrdered();

} // PRelationship
