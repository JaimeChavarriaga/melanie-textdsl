/*******************************************************************************
 * Copyright (c) 2012, 2013 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weaving Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingPackage#getWeavingLink()
 * @model
 * @generated
 */
public interface WeavingLink extends WeavingModelContent {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(Element)
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingPackage#getWeavingLink_ModelElement()
	 * @model
	 * @generated
	 */
	Element getModelElement();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(Element value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModelContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingPackage#getWeavingLink_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<WeavingModelContent> getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calculates the offset for this model element by taking the contained weaving links and text elements into account.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let firstChild:WeavingModelContent = \r\n\tself.children->first()\r\nin\r\n\tif (firstChild.oclIsUndefined()) then\r\n\t\t-1\r\n\telse\r\n\t\tif (firstChild.oclIsTypeOf(TextElement)) then\r\n\t\t\tfirstChild.oclAsType(TextElement).offset\r\n\t\telse\r\n\t\t\tfirstChild.oclAsType(WeavingLink).calculateOffset()\r\n\t\tendif\r\n\tendif '"
	 * @generated
	 */
	int calculateOffset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calculates the length for this model element by taking the contained weaving links and text elements into account.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let lastChild:WeavingModelContent = \r\n\tself.children->last()\r\nin\r\n\tif (lastChild.oclIsUndefined()) then\r\n\t\t-1\r\n\telse\r\n\t\tif (lastChild.oclIsTypeOf(TextElement)) then\r\n\t\t\t(lastChild.oclAsType(TextElement).offset + lastChild.oclAsType(TextElement).length) - self.calculateOffset()\r\n\t\telse\r\n\t\t\tlastChild.oclAsType(WeavingLink).calculateLength()\r\n\t\tendif\r\n\tendif '"
	 * @generated
	 */
	int calculateLength();

} // WeavingLink
