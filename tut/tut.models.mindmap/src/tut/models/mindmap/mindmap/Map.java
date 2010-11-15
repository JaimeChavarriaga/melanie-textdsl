/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tut.models.mindmap.mindmap;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tut.models.mindmap.mindmap.Map#getName <em>Name</em>}</li>
 *   <li>{@link tut.models.mindmap.mindmap.Map#getCreated <em>Created</em>}</li>
 *   <li>{@link tut.models.mindmap.mindmap.Map#getElements <em>Elements</em>}</li>
 *   <li>{@link tut.models.mindmap.mindmap.Map#getRootTopics <em>Root Topics</em>}</li>
 * </ul>
 * </p>
 *
 * @see tut.models.mindmap.mindmap.MindmapPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tut.models.mindmap.mindmap.MindmapPackage#getMap_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tut.models.mindmap.mindmap.Map#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see tut.models.mindmap.mindmap.MindmapPackage#getMap_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link tut.models.mindmap.mindmap.Map#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link tut.models.mindmap.mindmap.MapElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see tut.models.mindmap.mindmap.MindmapPackage#getMap_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MapElement> getElements();

	/**
	 * Returns the value of the '<em><b>Root Topics</b></em>' reference list.
	 * The list contents are of type {@link tut.models.mindmap.mindmap.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Topics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Topics</em>' reference list.
	 * @see tut.models.mindmap.mindmap.MindmapPackage#getMap_RootTopics()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Topic> getRootTopics();

} // Map
