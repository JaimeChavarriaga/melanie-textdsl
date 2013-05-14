/*******************************************************************************
 * Copyright (c) 2011-2013 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nikolai Hellwig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal#getId <em>Id</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal#getDefinitionList <em>Definition List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage#getNonTerminal()
 * @model
 * @generated
 */
public interface NonTerminal extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage#getNonTerminal_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Definition List</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition List</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage#getNonTerminal_DefinitionList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Symbol> getDefinitionList();

} // NonTerminal
