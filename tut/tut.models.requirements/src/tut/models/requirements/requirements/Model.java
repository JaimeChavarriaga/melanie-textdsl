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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tut.models.requirements.requirements.Model#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see tut.models.requirements.requirements.RequirementsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link tut.models.requirements.requirements.RequirementGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see tut.models.requirements.requirements.RequirementsPackage#getModel_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementGroup> getGroups();

} // Model
