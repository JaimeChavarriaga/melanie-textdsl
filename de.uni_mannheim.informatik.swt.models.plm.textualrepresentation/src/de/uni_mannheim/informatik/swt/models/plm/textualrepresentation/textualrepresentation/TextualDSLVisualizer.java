/**
 */
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation;

import de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractVisualizer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual DSL Visualizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer#getTextualVisualization <em>Textual Visualization</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage#getTextualDSLVisualizer()
 * @model
 * @generated
 */
public interface TextualDSLVisualizer extends AbstractVisualizer {
	/**
	 * Returns the value of the '<em><b>Textual Visualization</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textual Visualization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textual Visualization</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage#getTextualDSLVisualizer_TextualVisualization()
	 * @model
	 * @generated
	 */
	EList<TextualVisualizationDescriptor> getTextualVisualization();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the textual visualization of the containing model element
	 * <!-- end-model-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='null'"
	 * @generated
	 */
	String createTextualVisualization();

} // TextualDSLVisualizer
