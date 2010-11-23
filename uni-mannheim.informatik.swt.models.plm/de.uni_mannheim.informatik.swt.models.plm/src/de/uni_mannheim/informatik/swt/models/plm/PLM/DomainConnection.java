/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getParticipant <em>Participant</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getLower <em>Lower</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getUpper <em>Upper</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#isTransitive <em>Transitive</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getDomainConnection()
 * @model
 * @generated
 */
public interface DomainConnection extends Clabject {
	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getDomainConnection_Participant()
	 * @model lower="2"
	 * @generated
	 */
	EList<Clabject> getParticipant();

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getDomainConnection_RoleName()
	 * @model lower="2"
	 * @generated
	 */
	EList<String> getRoleName();

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getDomainConnection_Lower()
	 * @model lower="2"
	 * @generated
	 */
	EList<Integer> getLower();

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getDomainConnection_Upper()
	 * @model lower="2"
	 * @generated
	 */
	EList<Integer> getUpper();

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
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getDomainConnection_IsNavigable()
	 * @model lower="2"
	 * @generated
	 */
	EList<Boolean> getIsNavigable();

	/**
	 * Returns the value of the '<em><b>Transitive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitive</em>' attribute.
	 * @see #setTransitive(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getDomainConnection_Transitive()
	 * @model default="false"
	 * @generated
	 */
	boolean isTransitive();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#isTransitive <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitive</em>' attribute.
	 * @see #isTransitive()
	 * @generated
	 */
	void setTransitive(boolean value);

} // DomainConnection
