/*******************************************************************************
 * Copyright (c) 2011-2013 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Visualization Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage#getTextualVisualizationDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface TextualVisualizationDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage#getTextualVisualizationDescriptor_Expression()
	 * @model required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the textual visualization of the containing model element
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getContainingTextualVisualizer().getContainingPLMElement().oclAsType(PLM::Element)'"
	 * @generated
	 */
	Element getContainingPLMElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the textual visualization of the containing model element
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let container:OclAny = self.oclAsType(ecore::EObject).eContainer()\r\nin\r\nif (container.oclIsTypeOf(TextualDSLVisualizer)) then\r\n\tcontainer.oclAsType(TextualDSLVisualizer)\r\n-- This is the case if a descriptor is stored in a choice\r\nelse\r\n\tcontainer.oclAsType(TextualVisualizationDescriptor).getContainingTextualVisualizer()\r\nendif'"
	 * @generated
	 */
	TextualDSLVisualizer getContainingTextualVisualizer();

} // TextualVisualizationDescriptor
