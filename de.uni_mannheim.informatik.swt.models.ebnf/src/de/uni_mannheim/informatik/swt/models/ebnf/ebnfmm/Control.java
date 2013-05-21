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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Control#getDefinitionList <em>Definition List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage#getControl()
 * @model abstract="true"
 * @generated
 */
public interface Control extends FactorableSymbol {
	/**
	 * Returns the value of the '<em><b>Definition List</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol}.
	 * It is bidirectional and its opposite is '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingControl <em>Containing Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition List</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage#getControl_DefinitionList()
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingControl
	 * @model opposite="containingControl" containment="true"
	 * @generated
	 */
	EList<Symbol> getDefinitionList();

} // Control
