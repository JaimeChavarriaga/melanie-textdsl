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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Except</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Except#getExcept <em>Except</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage#getExcept()
 * @model
 * @generated
 */
public interface Except extends Control {
	/**
	 * Returns the value of the '<em><b>Except</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Except</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Except</em>' containment reference.
	 * @see #setExcept(Symbol)
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage#getExcept_Except()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Symbol getExcept();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Except#getExcept <em>Except</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Except</em>' containment reference.
	 * @see #getExcept()
	 * @generated
	 */
	void setExcept(Symbol value);

} // Except
