/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReasoningResultPackageImpl extends EPackageImpl implements ReasoningResultPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasoningResultModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durabilityComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutabilityComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeComparisonEClass = null;

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
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReasoningResultPackageImpl() {
		super(eNS_URI, ReasoningResultFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReasoningResultPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReasoningResultPackage init() {
		if (isInited) return (ReasoningResultPackage)EPackage.Registry.INSTANCE.getEPackage(ReasoningResultPackage.eNS_URI);

		// Obtain or create and register package
		ReasoningResultPackageImpl theReasoningResultPackage = (ReasoningResultPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReasoningResultPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReasoningResultPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PLMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReasoningResultPackage.createPackageContents();

		// Initialize created meta-data
		theReasoningResultPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReasoningResultPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReasoningResultPackage.eNS_URI, theReasoningResultPackage);
		return theReasoningResultPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasoningResultModel() {
		return reasoningResultModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReasoningResultModel_Check() {
		return (EReference)reasoningResultModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheck() {
		return checkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_Result() {
		return (EAttribute)checkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_Expression() {
		return (EAttribute)checkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCheck() {
		return compositeCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCheck_Check() {
		return (EReference)compositeCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeCheck_Name() {
		return (EAttribute)compositeCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCheck_Source() {
		return (EReference)compositeCheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCheck_Target() {
		return (EReference)compositeCheckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameComparison() {
		return nameComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameComparison_Source() {
		return (EReference)nameComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameComparison_Target() {
		return (EReference)nameComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurabilityComparison() {
		return durabilityComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurabilityComparison_Source() {
		return (EReference)durabilityComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurabilityComparison_Target() {
		return (EReference)durabilityComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutabilityComparison() {
		return mutabilityComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutabilityComparison_Source() {
		return (EReference)mutabilityComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutabilityComparison_Target() {
		return (EReference)mutabilityComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeComparison() {
		return datatypeComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeComparison_Source() {
		return (EReference)datatypeComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeComparison_Target() {
		return (EReference)datatypeComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningResultFactory getReasoningResultFactory() {
		return (ReasoningResultFactory)getEFactoryInstance();
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
		reasoningResultModelEClass = createEClass(REASONING_RESULT_MODEL);
		createEReference(reasoningResultModelEClass, REASONING_RESULT_MODEL__CHECK);

		checkEClass = createEClass(CHECK);
		createEAttribute(checkEClass, CHECK__RESULT);
		createEAttribute(checkEClass, CHECK__EXPRESSION);

		compositeCheckEClass = createEClass(COMPOSITE_CHECK);
		createEReference(compositeCheckEClass, COMPOSITE_CHECK__CHECK);
		createEAttribute(compositeCheckEClass, COMPOSITE_CHECK__NAME);
		createEReference(compositeCheckEClass, COMPOSITE_CHECK__SOURCE);
		createEReference(compositeCheckEClass, COMPOSITE_CHECK__TARGET);

		nameComparisonEClass = createEClass(NAME_COMPARISON);
		createEReference(nameComparisonEClass, NAME_COMPARISON__SOURCE);
		createEReference(nameComparisonEClass, NAME_COMPARISON__TARGET);

		durabilityComparisonEClass = createEClass(DURABILITY_COMPARISON);
		createEReference(durabilityComparisonEClass, DURABILITY_COMPARISON__SOURCE);
		createEReference(durabilityComparisonEClass, DURABILITY_COMPARISON__TARGET);

		mutabilityComparisonEClass = createEClass(MUTABILITY_COMPARISON);
		createEReference(mutabilityComparisonEClass, MUTABILITY_COMPARISON__SOURCE);
		createEReference(mutabilityComparisonEClass, MUTABILITY_COMPARISON__TARGET);

		datatypeComparisonEClass = createEClass(DATATYPE_COMPARISON);
		createEReference(datatypeComparisonEClass, DATATYPE_COMPARISON__SOURCE);
		createEReference(datatypeComparisonEClass, DATATYPE_COMPARISON__TARGET);
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
		compositeCheckEClass.getESuperTypes().add(this.getCheck());
		nameComparisonEClass.getESuperTypes().add(this.getCheck());
		durabilityComparisonEClass.getESuperTypes().add(this.getCheck());
		mutabilityComparisonEClass.getESuperTypes().add(this.getCheck());
		datatypeComparisonEClass.getESuperTypes().add(this.getCheck());

		// Initialize classes and features; add operations and parameters
		initEClass(reasoningResultModelEClass, ReasoningResultModel.class, "ReasoningResultModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReasoningResultModel_Check(), this.getCheck(), null, "check", null, 0, -1, ReasoningResultModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkEClass, Check.class, "Check", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheck_Result(), ecorePackage.getEBoolean(), "result", null, 1, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheck_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeCheckEClass, CompositeCheck.class, "CompositeCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeCheck_Check(), this.getCheck(), null, "check", null, 0, -1, CompositeCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeCheck_Name(), ecorePackage.getEString(), "name", null, 1, 1, CompositeCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeCheck_Source(), thePLMPackage.getElement(), null, "source", null, 1, 1, CompositeCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeCheck_Target(), thePLMPackage.getElement(), null, "target", null, 0, 1, CompositeCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameComparisonEClass, NameComparison.class, "NameComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameComparison_Source(), thePLMPackage.getElement(), null, "source", null, 1, 1, NameComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameComparison_Target(), thePLMPackage.getElement(), null, "target", null, 1, 1, NameComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durabilityComparisonEClass, DurabilityComparison.class, "DurabilityComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDurabilityComparison_Source(), thePLMPackage.getFeature(), null, "source", null, 1, 1, DurabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDurabilityComparison_Target(), thePLMPackage.getFeature(), null, "target", null, 1, 1, DurabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mutabilityComparisonEClass, MutabilityComparison.class, "MutabilityComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMutabilityComparison_Source(), thePLMPackage.getAttribute(), null, "source", null, 1, 1, MutabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutabilityComparison_Target(), thePLMPackage.getAttribute(), null, "target", null, 1, 1, MutabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeComparisonEClass, DatatypeComparison.class, "DatatypeComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeComparison_Source(), thePLMPackage.getAttribute(), null, "source", null, 1, 1, DatatypeComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatatypeComparison_Target(), thePLMPackage.getAttribute(), null, "target", null, 1, 1, DatatypeComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ReasoningResultPackageImpl
