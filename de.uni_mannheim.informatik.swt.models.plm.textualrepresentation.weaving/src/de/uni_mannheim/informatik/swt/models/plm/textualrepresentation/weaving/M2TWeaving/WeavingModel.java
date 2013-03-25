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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weaving Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingPackage#getWeavingModel()
 * @model
 * @generated
 */
public interface WeavingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingPackage#getWeavingModel_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<WeavingLink> getLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search the weaving link of a given model element
	 * <!-- end-model-doc -->
	 * @model elementRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='WeavingLink.allInstances()->select(l | l.modelElement = element)->asOrderedSet()'"
	 * @generated
	 */
	EList<WeavingLink> findLinkForPLMElement(Element element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Finds the weving linkt that starts closest before the given offset
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let allTextElements:Set(TextElement) =\r\n\tTextElement.allInstances()\r\nin\r\nlet closestDistance:Integer = \r\n\tallTextElements->collect(e | offset - e.offset)->select(n | n >= 0)->min()\r\nin\r\nallTextElements->select(e | \r\n\t\t(\t((offset - e.offset) = closestDistance)\r\n\t\t\t\tor\r\n\t\t\t(\r\n\t\t\t\t (closestDistance = 0)\r\n\t\t\t\t\t and \r\n\t\t\t\t( offset - (e.offset + e.length) ) = closestDistance)\r\n\t\t\t)\r\n\t\t)->asOrderedSet()->sortedBy(t | t.offset)'"
	 * @generated
	 */
	EList<TextElement> findTextElementForOffset(int offset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Finds the weving linkt that starts closest before the given offset. The search strategy specifies how the algorith behaves in case a model element with distance 0 is found. For example it can be configured to always return an editable elemen, e.g. attribute.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let textElements:OrderedSet(TextElement) =\r\n\tself.findTextElementForOffset(offset)\r\nin\r\n-- If the closes distance is not 0 there is no decision to take\r\nif (textElements->size() <= 1) then\r\n\ttextElements\r\nelse\r\n\t--Hit an Attribute and want Attributes -> everything is fine\r\n\tif (self.findTextElementForOffset(offset)->select(t | t.oclAsType(ecore::EObject).eContainer().oclAsType(WeavingLink).modelElement.oclIsTypeOf(PLM::Attribute))->size() > 0 and strategy = SearchStrategy::AttributePreffered) then\r\n\t\tself.findTextElementForOffset(offset)->select(t | t.oclAsType(ecore::EObject).eContainer().oclAsType(WeavingLink).modelElement.oclIsTypeOf(PLM::Attribute))\r\n\telse\r\n\t\t--Hit an Entity and want an Entity -> everything is fine\r\n\t\tif (self.findTextElementForOffset(offset)->select(t | t.oclAsType(ecore::EObject).eContainer().oclAsType(WeavingLink).modelElement.oclIsTypeOf(PLM::Entity))->size() > 0 and strategy = SearchStrategy::EntityPreffered) then\r\n\t\t\tself.findTextElementForOffset(offset)->select(t | t.oclAsType(ecore::EObject).eContainer().oclAsType(WeavingLink).modelElement.oclIsTypeOf(PLM::Entity))\r\n\t\telse\r\n\t\t\t--Bad luck\r\n\t\t\ttextElements\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	EList<TextElement> findTextElementForOffset(int offset, SearchStrategy strategy);

} // WeavingModel
