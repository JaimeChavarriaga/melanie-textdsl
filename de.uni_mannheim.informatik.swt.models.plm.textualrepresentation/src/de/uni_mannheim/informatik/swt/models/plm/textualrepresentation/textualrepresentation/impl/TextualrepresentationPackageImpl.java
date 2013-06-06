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
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.AbstractColor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.ColorEnum;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.RGBColor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.StandardColor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationFactory;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.ValueChoice;

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.util.TextualrepresentationValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualrepresentationPackageImpl extends EPackageImpl implements TextualrepresentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualDSLVisualizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualVisualizationDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TextualrepresentationPackageImpl() {
		super(eNS_URI, TextualrepresentationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TextualrepresentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TextualrepresentationPackage init() {
		if (isInited) return (TextualrepresentationPackage)EPackage.Registry.INSTANCE.getEPackage(TextualrepresentationPackage.eNS_URI);

		// Obtain or create and register package
		TextualrepresentationPackageImpl theTextualrepresentationPackage = (TextualrepresentationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextualrepresentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextualrepresentationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PLMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTextualrepresentationPackage.createPackageContents();

		// Initialize created meta-data
		theTextualrepresentationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTextualrepresentationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TextualrepresentationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTextualrepresentationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TextualrepresentationPackage.eNS_URI, theTextualrepresentationPackage);
		return theTextualrepresentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualDSLVisualizer() {
		return textualDSLVisualizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextualDSLVisualizer_Content() {
		return (EReference)textualDSLVisualizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextualDSLVisualizer_Root() {
		return (EReference)textualDSLVisualizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextualDSLVisualizer__GetContainingPLMElement() {
		return textualDSLVisualizerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextualDSLVisualizer__GetContainingLMLVisualizer() {
		return textualDSLVisualizerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualVisualizationDescriptor() {
		return textualVisualizationDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualVisualizationDescriptor_Expression() {
		return (EAttribute)textualVisualizationDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextualVisualizationDescriptor__GetContainingPLMElement() {
		return textualVisualizationDescriptorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextualVisualizationDescriptor__GetContainingTextualVisualizer() {
		return textualVisualizationDescriptorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteral_Color() {
		return (EReference)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Lower() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Upper() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValue__IsAttribute() {
		return valueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueChoice() {
		return valueChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueChoice_Choices() {
		return (EReference)valueChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractColor() {
		return abstractColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardColor() {
		return standardColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardColor_Color() {
		return (EAttribute)standardColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRGBColor() {
		return rgbColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_R() {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_G() {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_B() {
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorEnum() {
		return colorEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualrepresentationFactory getTextualrepresentationFactory() {
		return (TextualrepresentationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		textualDSLVisualizerEClass = createEClass(TEXTUAL_DSL_VISUALIZER);
		createEReference(textualDSLVisualizerEClass, TEXTUAL_DSL_VISUALIZER__CONTENT);
		createEReference(textualDSLVisualizerEClass, TEXTUAL_DSL_VISUALIZER__ROOT);
		createEOperation(textualDSLVisualizerEClass, TEXTUAL_DSL_VISUALIZER___GET_CONTAINING_PLM_ELEMENT);
		createEOperation(textualDSLVisualizerEClass, TEXTUAL_DSL_VISUALIZER___GET_CONTAINING_LML_VISUALIZER);

		textualVisualizationDescriptorEClass = createEClass(TEXTUAL_VISUALIZATION_DESCRIPTOR);
		createEAttribute(textualVisualizationDescriptorEClass, TEXTUAL_VISUALIZATION_DESCRIPTOR__EXPRESSION);
		createEOperation(textualVisualizationDescriptorEClass, TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_PLM_ELEMENT);
		createEOperation(textualVisualizationDescriptorEClass, TEXTUAL_VISUALIZATION_DESCRIPTOR___GET_CONTAINING_TEXTUAL_VISUALIZER);

		literalEClass = createEClass(LITERAL);
		createEReference(literalEClass, LITERAL__COLOR);
		createEAttribute(literalEClass, LITERAL__LOWER);
		createEAttribute(literalEClass, LITERAL__UPPER);

		valueEClass = createEClass(VALUE);
		createEOperation(valueEClass, VALUE___IS_ATTRIBUTE);

		valueChoiceEClass = createEClass(VALUE_CHOICE);
		createEReference(valueChoiceEClass, VALUE_CHOICE__CHOICES);

		abstractColorEClass = createEClass(ABSTRACT_COLOR);

		standardColorEClass = createEClass(STANDARD_COLOR);
		createEAttribute(standardColorEClass, STANDARD_COLOR__COLOR);

		rgbColorEClass = createEClass(RGB_COLOR);
		createEAttribute(rgbColorEClass, RGB_COLOR__R);
		createEAttribute(rgbColorEClass, RGB_COLOR__G);
		createEAttribute(rgbColorEClass, RGB_COLOR__B);

		// Create enums
		colorEnumEEnum = createEEnum(COLOR_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PLMPackage thePLMPackage = (PLMPackage)EPackage.Registry.INSTANCE.getEPackage(PLMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textualDSLVisualizerEClass.getESuperTypes().add(thePLMPackage.getAbstractDSLVisualizer());
		literalEClass.getESuperTypes().add(this.getTextualVisualizationDescriptor());
		valueEClass.getESuperTypes().add(this.getTextualVisualizationDescriptor());
		valueChoiceEClass.getESuperTypes().add(this.getTextualVisualizationDescriptor());
		standardColorEClass.getESuperTypes().add(this.getAbstractColor());
		rgbColorEClass.getESuperTypes().add(this.getAbstractColor());

		// Initialize classes, features, and operations; add parameters
		initEClass(textualDSLVisualizerEClass, TextualDSLVisualizer.class, "TextualDSLVisualizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextualDSLVisualizer_Content(), this.getTextualVisualizationDescriptor(), null, "content", null, 0, -1, TextualDSLVisualizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextualDSLVisualizer_Root(), thePLMPackage.getClabject(), null, "root", null, 0, 1, TextualDSLVisualizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTextualDSLVisualizer__GetContainingPLMElement(), thePLMPackage.getElement(), "getContainingPLMElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTextualDSLVisualizer__GetContainingLMLVisualizer(), thePLMPackage.getLMLVisualizer(), "getContainingLMLVisualizer", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(textualVisualizationDescriptorEClass, TextualVisualizationDescriptor.class, "TextualVisualizationDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextualVisualizationDescriptor_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, TextualVisualizationDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTextualVisualizationDescriptor__GetContainingPLMElement(), thePLMPackage.getElement(), "getContainingPLMElement", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTextualVisualizationDescriptor__GetContainingTextualVisualizer(), this.getTextualDSLVisualizer(), "getContainingTextualVisualizer", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteral_Color(), this.getAbstractColor(), null, "color", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Lower(), ecorePackage.getEInt(), "lower", "0", 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Upper(), ecorePackage.getEInt(), "upper", "1", 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getValue__IsAttribute(), ecorePackage.getEBoolean(), "isAttribute", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueChoiceEClass, ValueChoice.class, "ValueChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueChoice_Choices(), this.getValue(), null, "choices", null, 0, -1, ValueChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractColorEClass, AbstractColor.class, "AbstractColor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardColorEClass, StandardColor.class, "StandardColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardColor_Color(), this.getColorEnum(), "color", null, 0, 1, StandardColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rgbColorEClass, RGBColor.class, "RGBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRGBColor_R(), ecorePackage.getEInt(), "R", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBColor_G(), ecorePackage.getEInt(), "G", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBColor_B(), ecorePackage.getEInt(), "B", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEnumEEnum, ColorEnum.class, "ColorEnum");
		addEEnumLiteral(colorEnumEEnum, ColorEnum.BLACK);
		addEEnumLiteral(colorEnumEEnum, ColorEnum.RED);
		addEEnumLiteral(colorEnumEEnum, ColorEnum.BLUE);
		addEEnumLiteral(colorEnumEEnum, ColorEnum.GREEN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });													
		addAnnotation
		  (rgbColorEClass, 
		   source, 
		   new String[] {
			 "constraints", "vaildR vaildG vaildB"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";				
		addAnnotation
		  (getTextualDSLVisualizer__GetContainingPLMElement(), 
		   source, 
		   new String[] {
			 "body", "self.getContainingLMLVisualizer().getContainingElement()"
		   });			
		addAnnotation
		  (getTextualDSLVisualizer__GetContainingLMLVisualizer(), 
		   source, 
		   new String[] {
			 "body", "self.oclAsType(ecore::EObject).eContainer().oclAsType(PLM::LMLVisualizer)"
		   });				
		addAnnotation
		  (getTextualVisualizationDescriptor__GetContainingPLMElement(), 
		   source, 
		   new String[] {
			 "body", "self.getContainingTextualVisualizer().getContainingPLMElement().oclAsType(PLM::Element)"
		   });			
		addAnnotation
		  (getTextualVisualizationDescriptor__GetContainingTextualVisualizer(), 
		   source, 
		   new String[] {
			 "body", "let container:OclAny = self.oclAsType(ecore::EObject).eContainer()\r\nin\r\nif (container.oclIsTypeOf(TextualDSLVisualizer)) then\r\n\tcontainer.oclAsType(TextualDSLVisualizer)\r\n-- This is the case if a descriptor is stored in a choice\r\nelse\r\n\tcontainer.oclAsType(TextualVisualizationDescriptor).getContainingTextualVisualizer()\r\nendif"
		   });			
		addAnnotation
		  (getValue__IsAttribute(), 
		   source, 
		   new String[] {
			 "body", "self.getContainingTextualVisualizer().getContainingPLMElement().oclAsType(PLM::Clabject).getAttributeByName(self.expression)->size() > 0"
		   });			
		addAnnotation
		  (rgbColorEClass, 
		   source, 
		   new String[] {
			 "vaildR", "self.R <= 255 and self.R >= 0",
			 "vaildR$message", "\'R must be between 0 and 255\'",
			 "vaildG", "self.G <= 255 and self.G >= 0",
			 "vaildG$message", "\'G must be between 0 and 255\'",
			 "vaildB", "self.B <= 255 and self.B >= 0",
			 "vaildB$message", "\'B must be between 0 and 255\'"
		   });
	}

} //TextualrepresentationPackageImpl
