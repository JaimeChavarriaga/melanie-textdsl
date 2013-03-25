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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.ValueChoice#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage#getValueChoice()
 * @model
 * @generated
 */
public interface ValueChoice extends TextualVisualizationDescriptor {
	/**
	 * Returns the value of the '<em><b>Choices</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage#getValueChoice_Choices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getChoices();

} // ValueChoice
