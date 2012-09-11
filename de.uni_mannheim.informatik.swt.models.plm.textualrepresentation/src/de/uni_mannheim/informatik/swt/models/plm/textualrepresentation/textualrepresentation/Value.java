/**
 */
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends TextualVisualizationDescriptor {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the textual visualization of the containing model element
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getContainingPLMElement().oclAsType(PLM::Clabject).feature->select(f | f.oclIsKindOf(PLM::Attribute))->select(a | a.name = \'name\').oclAsType(PLM::Attribute).value->asOrderedSet()->first()'"
	 * @generated
	 */
	String getValue();
} // Value
