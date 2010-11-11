/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PClabject;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PConnector;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PElement;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PGeneralization;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiableElement;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiation;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PLevelSpecificElement;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PMethod;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PModule;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PNode;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PPackage;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PRelationship;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModel;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModelFactory;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PanLevelModelPackageImpl extends EPackageImpl implements PanLevelModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pLevelSpecificElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pInstantiableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pClabjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panLevelModelEClass = null;

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
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PanLevelModelPackageImpl() {
		super(eNS_URI, PanLevelModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PanLevelModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PanLevelModelPackage init() {
		if (isInited) return (PanLevelModelPackage)EPackage.Registry.INSTANCE.getEPackage(PanLevelModelPackage.eNS_URI);

		// Obtain or create and register package
		PanLevelModelPackageImpl thePanLevelModelPackage = (PanLevelModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PanLevelModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PanLevelModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePanLevelModelPackage.createPackageContents();

		// Initialize created meta-data
		thePanLevelModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePanLevelModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PanLevelModelPackage.eNS_URI, thePanLevelModelPackage);
		return thePanLevelModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPElement() {
		return pElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPElement_Name() {
		return (EAttribute)pElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPLevelSpecificElement() {
		return pLevelSpecificElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPLevelSpecificElement_Level() {
		return (EAttribute)pLevelSpecificElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPLevelSpecificElement_Owner() {
		return (EReference)pLevelSpecificElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPModule() {
		return pModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPInstantiableElement() {
		return pInstantiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPInstantiableElement_Potency() {
		return (EAttribute)pInstantiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPPackage() {
		return pPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPConnector() {
		return pConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPConnector_Participants() {
		return (EReference)pConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPConnector_RoleNames() {
		return (EAttribute)pConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPField() {
		return pFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPField_Dual() {
		return (EAttribute)pFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPField_Unique() {
		return (EAttribute)pFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPField_DataType() {
		return (EAttribute)pFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPField_Value() {
		return (EReference)pFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPField_MultiplicityLower() {
		return (EAttribute)pFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPField_MultiplicityUpper() {
		return (EAttribute)pFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPClabject() {
		return pClabjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPClabject_Type() {
		return (EReference)pClabjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPClabject_SuperType() {
		return (EReference)pClabjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPMethod() {
		return pMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPMethod_Body() {
		return (EAttribute)pMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMethod_Input() {
		return (EReference)pMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPMethod_OutPut() {
		return (EReference)pMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPNode() {
		return pNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRelationship() {
		return pRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPRelationship_MultiplicityLower() {
		return (EAttribute)pRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPRelationship_MultiplicityUpper() {
		return (EAttribute)pRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPRelationship_IsNavigable() {
		return (EAttribute)pRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPRelationship_IsOrdered() {
		return (EAttribute)pRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPGeneralization() {
		return pGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPInstantiation() {
		return pInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPInstantiation_TargetLevel() {
		return (EAttribute)pInstantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPanLevelModel() {
		return panLevelModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPanLevelModel_ModelElements() {
		return (EReference)panLevelModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanLevelModelFactory getPanLevelModelFactory() {
		return (PanLevelModelFactory)getEFactoryInstance();
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
		pElementEClass = createEClass(PELEMENT);
		createEAttribute(pElementEClass, PELEMENT__NAME);

		pLevelSpecificElementEClass = createEClass(PLEVEL_SPECIFIC_ELEMENT);
		createEAttribute(pLevelSpecificElementEClass, PLEVEL_SPECIFIC_ELEMENT__LEVEL);
		createEReference(pLevelSpecificElementEClass, PLEVEL_SPECIFIC_ELEMENT__OWNER);

		pModuleEClass = createEClass(PMODULE);

		pInstantiableElementEClass = createEClass(PINSTANTIABLE_ELEMENT);
		createEAttribute(pInstantiableElementEClass, PINSTANTIABLE_ELEMENT__POTENCY);

		pPackageEClass = createEClass(PPACKAGE);

		pConnectorEClass = createEClass(PCONNECTOR);
		createEReference(pConnectorEClass, PCONNECTOR__PARTICIPANTS);
		createEAttribute(pConnectorEClass, PCONNECTOR__ROLE_NAMES);

		pFieldEClass = createEClass(PFIELD);
		createEAttribute(pFieldEClass, PFIELD__DUAL);
		createEAttribute(pFieldEClass, PFIELD__UNIQUE);
		createEAttribute(pFieldEClass, PFIELD__DATA_TYPE);
		createEReference(pFieldEClass, PFIELD__VALUE);
		createEAttribute(pFieldEClass, PFIELD__MULTIPLICITY_LOWER);
		createEAttribute(pFieldEClass, PFIELD__MULTIPLICITY_UPPER);

		pClabjectEClass = createEClass(PCLABJECT);
		createEReference(pClabjectEClass, PCLABJECT__TYPE);
		createEReference(pClabjectEClass, PCLABJECT__SUPER_TYPE);

		pMethodEClass = createEClass(PMETHOD);
		createEAttribute(pMethodEClass, PMETHOD__BODY);
		createEReference(pMethodEClass, PMETHOD__INPUT);
		createEReference(pMethodEClass, PMETHOD__OUT_PUT);

		pNodeEClass = createEClass(PNODE);

		pRelationshipEClass = createEClass(PRELATIONSHIP);
		createEAttribute(pRelationshipEClass, PRELATIONSHIP__MULTIPLICITY_LOWER);
		createEAttribute(pRelationshipEClass, PRELATIONSHIP__MULTIPLICITY_UPPER);
		createEAttribute(pRelationshipEClass, PRELATIONSHIP__IS_NAVIGABLE);
		createEAttribute(pRelationshipEClass, PRELATIONSHIP__IS_ORDERED);

		pGeneralizationEClass = createEClass(PGENERALIZATION);

		pInstantiationEClass = createEClass(PINSTANTIATION);
		createEAttribute(pInstantiationEClass, PINSTANTIATION__TARGET_LEVEL);

		panLevelModelEClass = createEClass(PAN_LEVEL_MODEL);
		createEReference(panLevelModelEClass, PAN_LEVEL_MODEL__MODEL_ELEMENTS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pLevelSpecificElementEClass.getESuperTypes().add(this.getPElement());
		pModuleEClass.getESuperTypes().add(this.getPElement());
		pInstantiableElementEClass.getESuperTypes().add(this.getPLevelSpecificElement());
		pPackageEClass.getESuperTypes().add(this.getPLevelSpecificElement());
		pConnectorEClass.getESuperTypes().add(this.getPLevelSpecificElement());
		pFieldEClass.getESuperTypes().add(this.getPInstantiableElement());
		pClabjectEClass.getESuperTypes().add(this.getPInstantiableElement());
		pMethodEClass.getESuperTypes().add(this.getPInstantiableElement());
		pNodeEClass.getESuperTypes().add(this.getPClabject());
		pRelationshipEClass.getESuperTypes().add(this.getPClabject());
		pRelationshipEClass.getESuperTypes().add(this.getPConnector());
		pGeneralizationEClass.getESuperTypes().add(this.getPConnector());
		pInstantiationEClass.getESuperTypes().add(this.getPConnector());

		// Initialize classes and features; add operations and parameters
		initEClass(pElementEClass, PElement.class, "PElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, PElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pLevelSpecificElementEClass, PLevelSpecificElement.class, "PLevelSpecificElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPLevelSpecificElement_Level(), ecorePackage.getEInt(), "level", null, 1, 1, PLevelSpecificElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPLevelSpecificElement_Owner(), this.getPElement(), null, "owner", null, 1, 1, PLevelSpecificElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pModuleEClass, PModule.class, "PModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pInstantiableElementEClass, PInstantiableElement.class, "PInstantiableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPInstantiableElement_Potency(), ecorePackage.getEInt(), "potency", null, 1, 1, PInstantiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pPackageEClass, PPackage.class, "PPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pConnectorEClass, PConnector.class, "PConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPConnector_Participants(), this.getPClabject(), null, "participants", null, 2, -1, PConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPConnector_RoleNames(), ecorePackage.getEString(), "roleNames", null, 2, -1, PConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pFieldEClass, PField.class, "PField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPField_Dual(), ecorePackage.getEBoolean(), "dual", null, 1, 1, PField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPField_Unique(), ecorePackage.getEBoolean(), "unique", null, 1, 1, PField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getPField_DataType(), g1, "dataType", null, 1, 1, PField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPField_Value(), ecorePackage.getEObject(), null, "value", null, 1, 1, PField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPField_MultiplicityLower(), ecorePackage.getEInt(), "multiplicityLower", null, 1, 1, PField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPField_MultiplicityUpper(), ecorePackage.getEInt(), "multiplicityUpper", null, 1, 1, PField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pClabjectEClass, PClabject.class, "PClabject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPClabject_Type(), this.getPClabject(), null, "type", null, 0, 1, PClabject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPClabject_SuperType(), this.getPClabject(), null, "superType", null, 0, -1, PClabject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pMethodEClass, PMethod.class, "PMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPMethod_Body(), ecorePackage.getEString(), "body", null, 1, 1, PMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMethod_Input(), this.getPElement(), null, "input", null, 0, -1, PMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPMethod_OutPut(), this.getPElement(), null, "outPut", null, 0, -1, PMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pNodeEClass, PNode.class, "PNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pRelationshipEClass, PRelationship.class, "PRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRelationship_MultiplicityLower(), ecorePackage.getEInt(), "multiplicityLower", null, 2, -1, PRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRelationship_MultiplicityUpper(), ecorePackage.getEInt(), "multiplicityUpper", null, 2, -1, PRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRelationship_IsNavigable(), ecorePackage.getEBoolean(), "isNavigable", null, 2, -1, PRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPRelationship_IsOrdered(), ecorePackage.getEBoolean(), "isOrdered", null, 2, -1, PRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pGeneralizationEClass, PGeneralization.class, "PGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pInstantiationEClass, PInstantiation.class, "PInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPInstantiation_TargetLevel(), ecorePackage.getEInt(), "targetLevel", null, 1, 1, PInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panLevelModelEClass, PanLevelModel.class, "PanLevelModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPanLevelModel_ModelElements(), this.getPElement(), null, "modelElements", null, 0, -1, PanLevelModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PanLevelModelPackageImpl
