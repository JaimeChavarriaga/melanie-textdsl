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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Element, TopLevelVisualizationContainer {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.OwnedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getModel_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<OwnedElement> getContent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.content->select(e|e.oclIsKindOf(Generalization))->collect(g | g.oclAsType(Generalization))->asSet()'"
	 * @generated
	 */
	EList<Generalization> getAllGeneralizations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.content->select(e|e.oclIsKindOf(SetRelationship))->collect(g | g.oclAsType(SetRelationship))->asSet()'"
	 * @generated
	 */
	EList<SetRelationship> getAllSetRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.content->select(e|e.oclIsKindOf(Clabject))->collect(g | g.oclAsType(Clabject))->asSet()'"
	 * @generated
	 */
	EList<Clabject> getAllClabjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.content->select(e|e.oclIsKindOf(Entity))->collect(g | g.oclAsType(Entity))->asSet()'"
	 * @generated
	 */
	EList<Entity> getAllEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.content->select(e|e.oclIsKindOf(Connection))->collect(g | g.oclAsType(Connection))->asSet()'"
	 * @generated
	 */
	EList<Connection> getAllConnections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.content->select(e|e.oclIsKindOf(Classification))->collect(g | g.oclAsType(Classification))->asSet()'"
	 * @generated
	 */
	EList<Classification> getAllClassifications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.oclAsType(ecore::EObject).eContainer().oclAsType(Ontology)'"
	 * @generated
	 */
	Ontology getOntology();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (self.getOntology().content->indexOf(self) = self.getOntology().content->size()) then\nnull\nelse\nself.getOntology().content->at(self.getOntology().content->indexOf(self) + 1)\nendif'"
	 * @generated
	 */
	Model getClassifiedModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (self.getOntology().content->indexOf(self) = 1) then\nnull\nelse\nself.getOntology().content->at(self.getOntology().content->indexOf(self) - 1)\nendif'"
	 * @generated
	 */
	Model getClassifyingModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getOntology().content->indexOf(self)-1'"
	 * @generated
	 */
	int getLevel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	boolean isRootModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	boolean isLeafModel();

} // Model
