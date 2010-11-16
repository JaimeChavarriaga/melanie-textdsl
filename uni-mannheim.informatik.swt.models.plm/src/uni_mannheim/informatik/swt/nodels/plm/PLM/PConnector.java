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
 * A representation of the model object '<em><b>PConnector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PConnector#getParticipants <em>Participants</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PConnector#getRoleNames <em>Role Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPConnector()
 * @model
 * @generated
 */
public interface PConnector extends PLevelSpecificElement {
	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link uni_mannheim.informatik.swt.nodels.plm.PLM.PClabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPConnector_Participants()
	 * @model lower="2"
	 * @generated
	 */
	EList<PClabject> getParticipants();

	/**
	 * Returns the value of the '<em><b>Role Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Names</em>' attribute list.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPConnector_RoleNames()
	 * @model lower="2"
	 * @generated
	 */
	EList<String> getRoleNames();

} // PConnector
