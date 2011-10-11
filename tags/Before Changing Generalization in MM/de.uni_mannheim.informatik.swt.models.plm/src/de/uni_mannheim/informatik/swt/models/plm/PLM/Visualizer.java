/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;

import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationDescriptor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getDurability <em>Durability</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getTemplate <em>Template</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getVisualizer()
 * @model
 * @generated
 */
public interface Visualizer extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getVisualizer_Attributes()
	 * @model
	 * @generated
	 */
	EList<String> getAttributes();

	/**
	 * Returns the value of the '<em><b>Durability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durability</em>' attribute.
	 * @see #setDurability(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getVisualizer_Durability()
	 * @model required="true"
	 * @generated
	 */
	int getDurability();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getDurability <em>Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durability</em>' attribute.
	 * @see #getDurability()
	 * @generated
	 */
	void setDurability(int value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(Visualizer)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getVisualizer_Template()
	 * @model
	 * @generated
	 */
	Visualizer getTemplate();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Visualizer value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getVisualizer_Child()
	 * @model containment="true"
	 * @generated
	 */
	EList<VisualizationDescriptor> getChild();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" keyRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let keyValueList : Sequence(String) =\r\n\tself.attributes->select(a | a.size() > key.size())->select(a | a.substring(1, key.size()) = key)->asSequence()\r\nin\r\nlet keyValue : String =\r\n\tif (keyValueList->size() > 0) then\r\n\t\tkeyValueList->first()\r\n\telse\r\n\t\t\'\'\r\n\tendif\r\nin\r\nlet indexOfEquals:Integer =\r\n\t--Key not found?\r\n\tif (keyValue <> \'\') then\r\n\t\tSequence{1 .. keyValue.size()}->iterate(i:Integer; index:Integer = -1 | \r\n\t\t\tif (index = -1 and keyValue.substring(i,i) = \'=\') then i else index endif)\r\n\telse\r\n\t\t-1\r\n\tendif\r\nin\r\nlet value:String =\r\n\t--No Equals found in keyValue\r\n\tif(indexOfEquals <> -1) then\r\n\t\tkeyValue.substring(indexOfEquals + 1, keyValue.size())\r\n\telse\r\n\t\t\'\'\r\n\tendif\r\nin\r\nlet valueWithoutLeadingSpace:String = \r\n\t--No value found\r\n\tif (value <> \'\') then\r\n\t\tif (value.substring(1,1) = \' \' and value.size() > 1) then\r\n\t\t\tvalue.substring(2, value.size())\r\n\t\telse\r\n\t\t\tvalue\r\n\t\tendif\r\n\telse\r\n\t\t\'\'\r\n\tendif\r\nin\r\n\tvalueWithoutLeadingSpace'"
	 * @generated
	 */
	String getValueForKey(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.oclAsType(ecore::EObject).eContainer().oclAsType(Element)'"
	 * @generated
	 */
	Element getElement();

} // Visualizer
