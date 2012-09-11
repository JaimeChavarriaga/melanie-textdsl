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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let attributeValue:String =\r\n\tlet attributes:OrderedSet(PLM::Attribute) = \r\n\t\tself.getContainingPLMElement().oclAsType(PLM::Clabject).feature->select(f | f.oclIsKindOf(PLM::Attribute))->select(a | a.name = expression).oclAsType(PLM::Attribute)->asOrderedSet()\r\n\tin\r\n\tif (attributes->size() > 0) then\r\n\t\tif (attributes.value->asOrderedSet()->first().oclIsUndefined()) then\r\n\t\t\t\'\'\r\n\t\telse\r\n\t\t\tattributes.value->asOrderedSet()->first()\r\n\t\tendif\r\n\telse \r\n\t\tnull\r\n\tendif\r\nin\r\nif (not attributeValue.oclIsUndefined()) then\r\n\tattributeValue\r\nelse\r\n\tself.getContainingPLMElement().oclAsType(PLM::Clabject).getDomainForRoleName(expression).visualizer.dslVisualizer->select(v | v.oclIsTypeOf(TextualDSLVisualizer)).oclAsType(TextualDSLVisualizer).createTextualVisualization()->first()\r\nendif'"
	 * @generated
	 */
	String getValue();
} // Value
