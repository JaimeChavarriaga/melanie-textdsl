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
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingFactory;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingPackage;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModelContent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class M2TWeavingPackageImpl extends EPackageImpl implements M2TWeavingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weavingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weavingModelContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weavingLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchStrategyEEnum = null;

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
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private M2TWeavingPackageImpl() {
		super(eNS_URI, M2TWeavingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link M2TWeavingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static M2TWeavingPackage init() {
		if (isInited) return (M2TWeavingPackage)EPackage.Registry.INSTANCE.getEPackage(M2TWeavingPackage.eNS_URI);

		// Obtain or create and register package
		M2TWeavingPackageImpl theM2TWeavingPackage = (M2TWeavingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof M2TWeavingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new M2TWeavingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PLMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theM2TWeavingPackage.createPackageContents();

		// Initialize created meta-data
		theM2TWeavingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theM2TWeavingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(M2TWeavingPackage.eNS_URI, theM2TWeavingPackage);
		return theM2TWeavingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeavingModel() {
		return weavingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeavingModel_Links() {
		return (EReference)weavingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWeavingModel__FindLinkForPLMElement__Element() {
		return weavingModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWeavingModel__FindTextElementForOffset__int() {
		return weavingModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWeavingModel__FindTextElementForOffset__int_SearchStrategy() {
		return weavingModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeavingModelContent() {
		return weavingModelContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeavingLink() {
		return weavingLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeavingLink_ModelElement() {
		return (EReference)weavingLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeavingLink_Children() {
		return (EReference)weavingLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWeavingLink__CalculateOffset() {
		return weavingLinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWeavingLink__CalculateLength() {
		return weavingLinkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextElement() {
		return textElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextElement_Offset() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextElement_Length() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextElement_Text() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextElement__GetLengthTrimmed() {
		return textElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSearchStrategy() {
		return searchStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2TWeavingFactory getM2TWeavingFactory() {
		return (M2TWeavingFactory)getEFactoryInstance();
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
		weavingModelEClass = createEClass(WEAVING_MODEL);
		createEReference(weavingModelEClass, WEAVING_MODEL__LINKS);
		createEOperation(weavingModelEClass, WEAVING_MODEL___FIND_LINK_FOR_PLM_ELEMENT__ELEMENT);
		createEOperation(weavingModelEClass, WEAVING_MODEL___FIND_TEXT_ELEMENT_FOR_OFFSET__INT);
		createEOperation(weavingModelEClass, WEAVING_MODEL___FIND_TEXT_ELEMENT_FOR_OFFSET__INT_SEARCHSTRATEGY);

		weavingModelContentEClass = createEClass(WEAVING_MODEL_CONTENT);

		weavingLinkEClass = createEClass(WEAVING_LINK);
		createEReference(weavingLinkEClass, WEAVING_LINK__MODEL_ELEMENT);
		createEReference(weavingLinkEClass, WEAVING_LINK__CHILDREN);
		createEOperation(weavingLinkEClass, WEAVING_LINK___CALCULATE_OFFSET);
		createEOperation(weavingLinkEClass, WEAVING_LINK___CALCULATE_LENGTH);

		textElementEClass = createEClass(TEXT_ELEMENT);
		createEAttribute(textElementEClass, TEXT_ELEMENT__OFFSET);
		createEAttribute(textElementEClass, TEXT_ELEMENT__LENGTH);
		createEAttribute(textElementEClass, TEXT_ELEMENT__TEXT);
		createEOperation(textElementEClass, TEXT_ELEMENT___GET_LENGTH_TRIMMED);

		// Create enums
		searchStrategyEEnum = createEEnum(SEARCH_STRATEGY);
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
		weavingLinkEClass.getESuperTypes().add(this.getWeavingModelContent());
		textElementEClass.getESuperTypes().add(this.getWeavingModelContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(weavingModelEClass, WeavingModel.class, "WeavingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeavingModel_Links(), this.getWeavingLink(), null, "links", null, 0, -1, WeavingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getWeavingModel__FindLinkForPLMElement__Element(), this.getWeavingLink(), "findLinkForPLMElement", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePLMPackage.getElement(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWeavingModel__FindTextElementForOffset__int(), this.getTextElement(), "findTextElementForOffset", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWeavingModel__FindTextElementForOffset__int_SearchStrategy(), this.getTextElement(), "findTextElementForOffset", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "offset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSearchStrategy(), "strategy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(weavingModelContentEClass, WeavingModelContent.class, "WeavingModelContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(weavingLinkEClass, WeavingLink.class, "WeavingLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeavingLink_ModelElement(), thePLMPackage.getElement(), null, "modelElement", null, 0, 1, WeavingLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeavingLink_Children(), this.getWeavingModelContent(), null, "children", null, 0, -1, WeavingLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getWeavingLink__CalculateOffset(), ecorePackage.getEInt(), "calculateOffset", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWeavingLink__CalculateLength(), ecorePackage.getEInt(), "calculateLength", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(textElementEClass, TextElement.class, "TextElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextElement_Offset(), ecorePackage.getEInt(), "offset", null, 1, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextElement_Length(), ecorePackage.getEInt(), "length", null, 1, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextElement_Text(), ecorePackage.getEString(), "text", null, 1, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTextElement__GetLengthTrimmed(), ecorePackage.getEInt(), "getLengthTrimmed", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(searchStrategyEEnum, SearchStrategy.class, "SearchStrategy");
		addEEnumLiteral(searchStrategyEEnum, SearchStrategy.ATTRIBUTE_PREFFERED);
		addEEnumLiteral(searchStrategyEEnum, SearchStrategy.ENTITY_PREFFERED);

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
		  (getWeavingModel__FindLinkForPLMElement__Element(), 
		   source, 
		   new String[] {
			 "body", "WeavingLink.allInstances()->select(l | l.modelElement = element)->asOrderedSet()"
		   });			
		addAnnotation
		  (getWeavingModel__FindTextElementForOffset__int(), 
		   source, 
		   new String[] {
			 "body", "let allTextElements:Set(TextElement) =\r\n\tTextElement.allInstances()\r\nin\r\nlet closestDistance:Integer = \r\n\tallTextElements->collect(e | offset - e.offset)->select(n | n >= 0)->min()\r\nin\r\nallTextElements->select(e | \r\n\t\t(\t((offset - e.offset) = closestDistance)\r\n\t\t\t\tor\r\n\t\t\t(\r\n\t\t\t\t (closestDistance = 0)\r\n\t\t\t\t\t and \r\n\t\t\t\t( offset - (e.offset + e.length) ) = closestDistance)\r\n\t\t\t)\r\n\t\t)->asOrderedSet()->sortedBy(t | t.offset)"
		   });			
		addAnnotation
		  (getWeavingModel__FindTextElementForOffset__int_SearchStrategy(), 
		   source, 
		   new String[] {
			 "body", "let textElements:OrderedSet(TextElement) =\r\n\tself.findTextElementForOffset(offset)\r\nin\r\n-- If the closes distance is not 0 there is no decision to take\r\nif (textElements->size() <= 1) then\r\n\ttextElements\r\nelse\r\n\t--Hit an Attribute and want Attributes -> everything is fine\r\n\tif (self.findTextElementForOffset(offset)->select(t | t.oclAsType(ecore::EObject).eContainer().oclAsType(WeavingLink).modelElement.oclIsTypeOf(PLM::Attribute))->size() > 0 and strategy = SearchStrategy::AttributePreffered) then\r\n\t\tself.findTextElementForOffset(offset)->select(t | t.oclAsType(ecore::EObject).eContainer().oclAsType(WeavingLink).modelElement.oclIsTypeOf(PLM::Attribute))\r\n\telse\r\n\t\t--Hit an Entity and want an Entity -> everything is fine\r\n\t\tif (self.findTextElementForOffset(offset)->select(t | t.oclAsType(ecore::EObject).eContainer().oclAsType(WeavingLink).modelElement.oclIsTypeOf(PLM::Entity))->size() > 0 and strategy = SearchStrategy::EntityPreffered) then\r\n\t\t\tself.findTextElementForOffset(offset)->select(t | t.oclAsType(ecore::EObject).eContainer().oclAsType(WeavingLink).modelElement.oclIsTypeOf(PLM::Entity))\r\n\t\telse\r\n\t\t\t--Bad luck\r\n\t\t\ttextElements\r\n\t\tendif\r\n\tendif\r\nendif"
		   });			
		addAnnotation
		  (getWeavingLink__CalculateOffset(), 
		   source, 
		   new String[] {
			 "body", "let firstChild:WeavingModelContent = \r\n\tself.children->first()\r\nin\r\n\tif (firstChild.oclIsUndefined()) then\r\n\t\t-1\r\n\telse\r\n\t\tif (firstChild.oclIsTypeOf(TextElement)) then\r\n\t\t\tfirstChild.oclAsType(TextElement).offset\r\n\t\telse\r\n\t\t\tfirstChild.oclAsType(WeavingLink).calculateOffset()\r\n\t\tendif\r\n\tendif "
		   });			
		addAnnotation
		  (getWeavingLink__CalculateLength(), 
		   source, 
		   new String[] {
			 "body", "let lastChild:WeavingModelContent = \r\n\tself.children->last()\r\nin\r\n\tif (lastChild.oclIsUndefined()) then\r\n\t\t-1\r\n\telse\r\n\t\tif (lastChild.oclIsTypeOf(TextElement)) then\r\n\t\t\t(lastChild.oclAsType(TextElement).offset + lastChild.oclAsType(TextElement).length) - self.calculateOffset()\r\n\t\telse\r\n\t\t\tlastChild.oclAsType(WeavingLink).calculateLength()\r\n\t\tendif\r\n\tendif "
		   });			
		addAnnotation
		  (getTextElement__GetLengthTrimmed(), 
		   source, 
		   new String[] {
			 "body", "self.text.trim().size()"
		   });
	}

} //M2TWeavingPackageImpl
