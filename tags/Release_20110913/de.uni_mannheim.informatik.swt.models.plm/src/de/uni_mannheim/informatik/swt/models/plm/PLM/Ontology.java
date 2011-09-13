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
 * A representation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getOntology()
 * @model
 * @generated
 */
public interface Ontology extends Element, TopLevelVisualizationContainer {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getOntology_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getContent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" levelRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	Model getModelAtLevel(int level);

} // Ontology
