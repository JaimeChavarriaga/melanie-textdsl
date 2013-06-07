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

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage
 * @generated
 */
public class TextualrepresentationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TextualrepresentationValidator INSTANCE = new TextualrepresentationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualrepresentationValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TextualrepresentationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER:
				return validateTextualDSLVisualizer((TextualDSLVisualizer)value, diagnostics, context);
			case TextualrepresentationPackage.TEXTUAL_VISUALIZATION_DESCRIPTOR:
				return validateTextualVisualizationDescriptor((TextualVisualizationDescriptor)value, diagnostics, context);
			case TextualrepresentationPackage.LITERAL:
				return validateLiteral((Literal)value, diagnostics, context);
			case TextualrepresentationPackage.VALUE:
				return validateValue((Value)value, diagnostics, context);
			case TextualrepresentationPackage.LITERAL_CHOICE:
				return validateLiteralChoice((LiteralChoice)value, diagnostics, context);
			case TextualrepresentationPackage.ABSTRACT_COLOR:
				return validateAbstractColor((AbstractColor)value, diagnostics, context);
			case TextualrepresentationPackage.STANDARD_COLOR:
				return validateStandardColor((StandardColor)value, diagnostics, context);
			case TextualrepresentationPackage.RGB_COLOR:
				return validateRGBColor((RGBColor)value, diagnostics, context);
			case TextualrepresentationPackage.COLOR_ENUM:
				return validateColorEnum((ColorEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextualDSLVisualizer(TextualDSLVisualizer textualDSLVisualizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textualDSLVisualizer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextualVisualizationDescriptor(TextualVisualizationDescriptor textualVisualizationDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textualVisualizationDescriptor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteral(Literal literal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(value, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralChoice(LiteralChoice literalChoice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalChoice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractColor(AbstractColor abstractColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractColor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardColor(StandardColor standardColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standardColor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRGBColor(RGBColor rgbColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rgbColor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validateRGBColor_vaildR(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validateRGBColor_vaildG(rgbColor, diagnostics, context);
		if (result || diagnostics != null) result &= validateRGBColor_vaildB(rgbColor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the vaildR constraint of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RGB_COLOR__VAILD_R__EEXPRESSION = "self.R <= 255 and self.R >= 0";

	/**
	 * Validates the vaildR constraint of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRGBColor_vaildR(RGBColor rgbColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TextualrepresentationPackage.Literals.RGB_COLOR,
				 rgbColor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "vaildR",
				 RGB_COLOR__VAILD_R__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the vaildG constraint of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RGB_COLOR__VAILD_G__EEXPRESSION = "self.G <= 255 and self.G >= 0";

	/**
	 * Validates the vaildG constraint of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRGBColor_vaildG(RGBColor rgbColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TextualrepresentationPackage.Literals.RGB_COLOR,
				 rgbColor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "vaildG",
				 RGB_COLOR__VAILD_G__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the vaildB constraint of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RGB_COLOR__VAILD_B__EEXPRESSION = "self.B <= 255 and self.B >= 0";

	/**
	 * Validates the vaildB constraint of '<em>RGB Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRGBColor_vaildB(RGBColor rgbColor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TextualrepresentationPackage.Literals.RGB_COLOR,
				 rgbColor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "vaildB",
				 RGB_COLOR__VAILD_B__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorEnum(ColorEnum colorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TextualrepresentationValidator
