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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getFactor <em>Factor</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingNonTerminal <em>Containing Non Terminal</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingControl <em>Containing Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage#getSymbol()
 * @model abstract="true"
 * @generated
 */
public interface Symbol extends EObject {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(int)
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage#getSymbol_Factor()
	 * @model
	 * @generated
	 */
	int getFactor();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(int value);

	/**
	 * Returns the value of the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal#getDefinitionList <em>Definition List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Non Terminal</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Non Terminal</em>' container reference.
	 * @see #setContainingNonTerminal(NonTerminal)
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage#getSymbol_ContainingNonTerminal()
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal#getDefinitionList
	 * @model opposite="definitionList" transient="false"
	 * @generated
	 */
	NonTerminal getContainingNonTerminal();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingNonTerminal <em>Containing Non Terminal</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Non Terminal</em>' container reference.
	 * @see #getContainingNonTerminal()
	 * @generated
	 */
	void setContainingNonTerminal(NonTerminal value);

	/**
	 * Returns the value of the '<em><b>Containing Control</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Control#getDefinitionList <em>Definition List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Control</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Control</em>' container reference.
	 * @see #setContainingControl(Control)
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage#getSymbol_ContainingControl()
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Control#getDefinitionList
	 * @model opposite="definitionList" transient="false"
	 * @generated
	 */
	Control getContainingControl();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingControl <em>Containing Control</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Control</em>' container reference.
	 * @see #getContainingControl()
	 * @generated
	 */
	void setContainingControl(Control value);

} // Symbol
