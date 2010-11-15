/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tut.models.requirements.requirements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getTitle <em>Title</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getType <em>Type</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getPriority <em>Priority</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getAuthor <em>Author</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getCretated <em>Cretated</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getId <em>Id</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getState <em>State</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getResolution <em>Resolution</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getChildren <em>Children</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getParent <em>Parent</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getVersion <em>Version</em>}</li>
 *   <li>{@link tut.models.requirements.requirements.Requirement#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link tut.models.requirements.requirements.Requirement#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tut.models.requirements.requirements.Requirement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tut.models.requirements.requirements.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tut.models.requirements.requirements.Type
	 * @see #setType(Type)
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link tut.models.requirements.requirements.Requirement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tut.models.requirements.requirements.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link tut.models.requirements.requirements.Priority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see tut.models.requirements.requirements.Priority
	 * @see #setPriority(Priority)
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Priority()
	 * @model
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link tut.models.requirements.requirements.Requirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see tut.models.requirements.requirements.Priority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link tut.models.requirements.requirements.Requirement#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Cretated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cretated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cretated</em>' attribute.
	 * @see #setCretated(String)
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Cretated()
	 * @model
	 * @generated
	 */
	String getCretated();

	/**
	 * Sets the value of the '{@link tut.models.requirements.requirements.Requirement#getCretated <em>Cretated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cretated</em>' attribute.
	 * @see #getCretated()
	 * @generated
	 */
	void setCretated(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link tut.models.requirements.requirements.Requirement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link tut.models.requirements.requirements.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see tut.models.requirements.requirements.State
	 * @see #setState(State)
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link tut.models.requirements.requirements.Requirement#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see tut.models.requirements.requirements.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * The literals are from the enumeration {@link tut.models.requirements.requirements.Resolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see tut.models.requirements.requirements.Resolution
	 * @see #setResolution(Resolution)
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Resolution()
	 * @model
	 * @generated
	 */
	Resolution getResolution();

	/**
	 * Sets the value of the '{@link tut.models.requirements.requirements.Requirement#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see tut.models.requirements.requirements.Resolution
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(Resolution value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link tut.models.requirements.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Requirement> getDependencies();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link tut.models.requirements.requirements.Requirement}.
	 * It is bidirectional and its opposite is '{@link tut.models.requirements.requirements.Requirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Children()
	 * @see tut.models.requirements.requirements.Requirement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Requirement> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tut.models.requirements.requirements.Requirement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Requirement)
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Parent()
	 * @see tut.models.requirements.requirements.Requirement#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	Requirement getParent();

	/**
	 * Sets the value of the '{@link tut.models.requirements.requirements.Requirement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Requirement value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(Version)
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Version()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link tut.models.requirements.requirements.Requirement#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link tut.models.requirements.requirements.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see tut.models.requirements.requirements.RequirementsPackage#getRequirement_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

} // Requirement
