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
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.util;

import de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractDSLVisualizer;

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage
 * @generated
 */
public class TextualrepresentationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TextualrepresentationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualrepresentationSwitch() {
		if (modelPackage == null) {
			modelPackage = TextualrepresentationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER: {
				TextualDSLVisualizer textualDSLVisualizer = (TextualDSLVisualizer)theEObject;
				T result = caseTextualDSLVisualizer(textualDSLVisualizer);
				if (result == null) result = caseAbstractDSLVisualizer(textualDSLVisualizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextualrepresentationPackage.TEXTUAL_VISUALIZATION_DESCRIPTOR: {
				TextualVisualizationDescriptor textualVisualizationDescriptor = (TextualVisualizationDescriptor)theEObject;
				T result = caseTextualVisualizationDescriptor(textualVisualizationDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextualrepresentationPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseTextualVisualizationDescriptor(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextualrepresentationPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseTextualVisualizationDescriptor(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextualrepresentationPackage.LITERAL_CHOICE: {
				LiteralChoice literalChoice = (LiteralChoice)theEObject;
				T result = caseLiteralChoice(literalChoice);
				if (result == null) result = caseTextualVisualizationDescriptor(literalChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextualrepresentationPackage.ABSTRACT_COLOR: {
				AbstractColor abstractColor = (AbstractColor)theEObject;
				T result = caseAbstractColor(abstractColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextualrepresentationPackage.STANDARD_COLOR: {
				StandardColor standardColor = (StandardColor)theEObject;
				T result = caseStandardColor(standardColor);
				if (result == null) result = caseAbstractColor(standardColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TextualrepresentationPackage.RGB_COLOR: {
				RGBColor rgbColor = (RGBColor)theEObject;
				T result = caseRGBColor(rgbColor);
				if (result == null) result = caseAbstractColor(rgbColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual DSL Visualizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual DSL Visualizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualDSLVisualizer(TextualDSLVisualizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Visualization Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Visualization Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualVisualizationDescriptor(TextualVisualizationDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralChoice(LiteralChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractColor(AbstractColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardColor(StandardColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RGB Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRGBColor(RGBColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract DSL Visualizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract DSL Visualizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDSLVisualizer(AbstractDSLVisualizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TextualrepresentationSwitch
