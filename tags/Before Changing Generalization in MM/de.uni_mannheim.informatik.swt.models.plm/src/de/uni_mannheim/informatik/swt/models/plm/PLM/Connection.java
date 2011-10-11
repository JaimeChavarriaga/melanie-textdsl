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
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#isTransitive <em>Transitive</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getLower <em>Lower</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getUpper <em>Upper</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getParticipant <em>Participant</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getRoleName <em>Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getConnection()
 * @model annotation="Comment Unique\040Workaround='if (this.participant == null) {\r\n\t\t    this.participant = new EObjectResolvingEList<Clabject>(Clabject.class, this,\r\n\t\t    \t\tPLMPackage.DOMAIN_CONNECTION__PARTICIPANT) {\r\n\t\t      @Override\r\n\t\t      protected boolean isUnique() {\r\n\t\t        return false;\r\n\t\t      }\r\n\t\t    };\r\n\t\t  }\r\n\t\t  return this.participant;'"
 * @generated
 */
public interface Connection extends Clabject {
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
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getConnection_Transitive()
	 * @model default="false"
	 * @generated
	 */
	boolean isTransitive();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#isTransitive <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitive</em>' attribute.
	 * @see #isTransitive()
	 * @generated
	 */
	void setTransitive(boolean value);

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
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getConnection_Lower()
	 * @model default="0" unique="false"
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
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getConnection_Upper()
	 * @model default="-1" unique="false"
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
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getConnection_IsNavigable()
	 * @model unique="false"
	 * @generated
	 */
	EList<Boolean> getIsNavigable();

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
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getConnection_Participant()
	 * @model
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
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getConnection_RoleName()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getRoleName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roleNameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.participant->at(self.roleName->indexOf(roleName))'"
	 * @generated
	 */
	Clabject getParticipantForRoleName(String roleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" participantRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='--We found a direct participant of the connection\r\nlet foundParticipants:OrderedSet(Clabject) =\r\n\tself.participant->select(p | p.getModelSubtypes()->including(p)->includes(participant))->asOrderedSet()\r\nin\r\n--something found? -> take the first found\r\nif (foundParticipants->size() > 0) then\r\n\tself.roleName->at(self.participant->indexOf(foundParticipants->first()))->asOrderedSet()\r\nelse\r\n\t\'\'->asSet()\r\nendif'"
	 * @generated
	 */
	EList<String> getRoleNameForParticipant(Clabject participant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roleNameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.isNavigable->at(self.roleName->indexOf(roleName))'"
	 * @generated
	 */
	boolean isNavigableForRoleName(String roleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roleNameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.lower->at(self.roleName->indexOf(roleName))'"
	 * @generated
	 */
	int getLowerForRoleName(String roleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roleNameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.upper->at(self.roleName->indexOf(roleName))'"
	 * @generated
	 */
	int getUpperForRoleName(String roleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.roleName->select(rN | self.isNavigableForRoleName(rN))->collect(rN | self.getParticipantForRoleName(rN))->asSet()'"
	 * @generated
	 */
	EList<Clabject> getDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.roleName->select(rN | not self.isNavigableForRoleName(rN))->collect(rN | self.getParticipantForRoleName(rN))->asSet()'"
	 * @generated
	 */
	EList<Clabject> getNotDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='--Works only on connections with two or more participants\r\nif (not (self.participant->size() > 1)) then\r\n\t\'\'\r\nelse\r\n\tif (not self.name.oclIsUndefined() and self.name.size() <> 0) then\r\n\t\tself.name\r\n\telse\r\n\t\tlet domain:OrderedSet(Clabject) =\r\n\t\t\tself.getDomain()->asOrderedSet()\r\n\t\tin\r\n\t\tif (domain->size() = 1) then\r\n\t\t\tlet domainRoleName:String = \r\n\t\t\t\tself.getRoleNameForParticipant(domain->first())->asOrderedSet()->first()\r\n\t\t\tin\r\n\t\t\tlet notNavigableParticipant:Clabject=\t\r\n\t\t\t\tself.getNotDomain()->asOrderedSet()->at(1)\r\n\t\t\tin\r\n\t\t\tif (notNavigableParticipant->size() = 0) then\r\n\t\t\t\tdomain->at(0).name.concat(\'.\').concat(domainRoleName)\r\n\t\t\telse\r\n\t\t\t\tnotNavigableParticipant.name.concat(\'.\').concat(domainRoleName)\r\n\t\t\tendif\r\n\t\telse\r\n\t\t\tif (domain->size() > 0) then\r\n\t\t\t\tlet connectionName:String = \r\n\t\t\t\t\tdomain->iterate(p:Clabject; name:String = \'\' |\r\n\t\t\t\t\t\tlet roleName:String = \r\n\t\t\t\t\t\t\tself.getRoleNameForParticipant(p)->asOrderedSet()->first()\r\n\t\t\t\t\t\tin\r\n\t\t\t\t\t\tif (p = domain->last()) then\r\n\t\t\t\t\t\t\tname.concat(roleName.substring(1,1).toUpper().concat(roleName.substring(2, roleName.size())))\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tname.concat(roleName.substring(1,1).toUpper().concat(roleName.substring(2, roleName.size()))).concat(\'And\')\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t)\r\n\t\t\t\tin\r\n\t\t\t\t\t\'Between\'.concat(connectionName)\r\n\t\t\telse\r\n\t\t\t\t\'\'\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	String getHumanReadableName();

} // Connection
