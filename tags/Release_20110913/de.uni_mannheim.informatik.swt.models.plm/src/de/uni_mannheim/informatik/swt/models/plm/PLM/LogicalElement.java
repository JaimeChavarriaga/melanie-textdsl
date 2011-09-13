/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getLogicalElement()
 * @model abstract="true"
 * @generated
 */
public interface LogicalElement extends OwnedElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.oclAsType(ecore::EObject).eContainer().oclAsType(Model)'"
	 * @generated
	 */
	Model getModel();
} // LogicalElement
