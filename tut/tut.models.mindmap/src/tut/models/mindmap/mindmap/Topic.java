/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tut.models.mindmap.mindmap;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tut.models.mindmap.mindmap.Topic#getDescription <em>Description</em>}</li>
 *   <li>{@link tut.models.mindmap.mindmap.Topic#getStart <em>Start</em>}</li>
 *   <li>{@link tut.models.mindmap.mindmap.Topic#getEnd <em>End</em>}</li>
 *   <li>{@link tut.models.mindmap.mindmap.Topic#getPriority <em>Priority</em>}</li>
 *   <li>{@link tut.models.mindmap.mindmap.Topic#getSubTopics <em>Sub Topics</em>}</li>
 *   <li>{@link tut.models.mindmap.mindmap.Topic#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see tut.models.mindmap.mindmap.MindmapPackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends MapElement {
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
	 * @see tut.models.mindmap.mindmap.MindmapPackage#getTopic_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tut.models.mindmap.mindmap.Topic#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see tut.models.mindmap.mindmap.MindmapPackage#getTopic_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link tut.models.mindmap.mindmap.Topic#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see tut.models.mindmap.mindmap.MindmapPackage#getTopic_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link tut.models.mindmap.mindmap.Topic#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link tut.models.mindmap.mindmap.Priority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see tut.models.mindmap.mindmap.Priority
	 * @see #setPriority(Priority)
	 * @see tut.models.mindmap.mindmap.MindmapPackage#getTopic_Priority()
	 * @model
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link tut.models.mindmap.mindmap.Topic#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see tut.models.mindmap.mindmap.Priority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

	/**
	 * Returns the value of the '<em><b>Sub Topics</b></em>' reference list.
	 * The list contents are of type {@link tut.models.mindmap.mindmap.Topic}.
	 * It is bidirectional and its opposite is '{@link tut.models.mindmap.mindmap.Topic#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Topics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Topics</em>' reference list.
	 * @see tut.models.mindmap.mindmap.MindmapPackage#getTopic_SubTopics()
	 * @see tut.models.mindmap.mindmap.Topic#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Topic> getSubTopics();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tut.models.mindmap.mindmap.Topic#getSubTopics <em>Sub Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Topic)
	 * @see tut.models.mindmap.mindmap.MindmapPackage#getTopic_Parent()
	 * @see tut.models.mindmap.mindmap.Topic#getSubTopics
	 * @model opposite="subTopics"
	 * @generated
	 */
	Topic getParent();

	/**
	 * Sets the value of the '{@link tut.models.mindmap.mindmap.Topic#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Topic value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Topic allSubtopics();

} // Topic
