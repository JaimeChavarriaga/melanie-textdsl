/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Link#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Link#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends ShapeDescriptor {
	/**
	 * Returns the value of the '<em><b>Decoration</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLink_Decoration()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkDecoration> getDecoration();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.visualization.LabelDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLink_Label()
	 * @model containment="true"
	 * @generated
	 */
	EList<LabelDescriptor> getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roleNameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.decoration->select(d | d.targetRoleName = roleName)->asOrderedSet()->first()'"
	 * @generated
	 */
	LinkDecoration getLinkDecorationForRoleName(String roleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roleNameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.label->select(l | l.targetRoleName = roleName)->asOrderedSet()->first()'"
	 * @generated
	 */
	LabelDescriptor getLabelDescriptorForRoleName(String roleName);

} // Link
