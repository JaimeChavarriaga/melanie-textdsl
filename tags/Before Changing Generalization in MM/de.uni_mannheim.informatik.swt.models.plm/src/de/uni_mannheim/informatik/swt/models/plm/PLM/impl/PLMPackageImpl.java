/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Complement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Equality;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion;
import de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel;
import de.uni_mannheim.informatik.swt.models.plm.PLM.LogicalElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Method;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.PLM.OwnedElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.SetRelationship;
import de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer;

import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl;

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
public class PLMPackageImpl extends EPackageImpl implements PLMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lmlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleSpecializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clabjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topLevelVisualizationContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classificationKindEEnum = null;

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
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PLMPackageImpl() {
		super(eNS_URI, PLMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PLMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PLMPackage init() {
		if (isInited) return (PLMPackage)EPackage.Registry.INSTANCE.getEPackage(PLMPackage.eNS_URI);

		// Obtain or create and register package
		PLMPackageImpl thePLMPackage = (PLMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PLMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PLMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VisualizationPackageImpl theVisualizationPackage = (VisualizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) instanceof VisualizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI) : VisualizationPackage.eINSTANCE);

		// Create package meta-data objects
		thePLMPackage.createPackageContents();
		theVisualizationPackage.createPackageContents();

		// Initialize created meta-data
		thePLMPackage.initializePackageContents();
		theVisualizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePLMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PLMPackage.eNS_URI, thePLMPackage);
		return thePLMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLMLModel() {
		return lmlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLMLModel_Name() {
		return (EAttribute)lmlModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLMLModel_Elements() {
		return (EReference)lmlModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Expressed() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Relevant() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Visualizer() {
		return (EReference)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainElement() {
		return domainElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainElement_Elided() {
		return (EAttribute)domainElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Content() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetAllGeneralizations() {
		return modelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetAllSetRelationships() {
		return modelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetAllClabjects() {
		return modelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetAllEntities() {
		return modelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetAllConnections() {
		return modelEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetAllClassifications() {
		return modelEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetOntology() {
		return modelEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetClassifiedModel() {
		return modelEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetClassifyingModel() {
		return modelEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__GetLevel() {
		return modelEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__IsRootModel() {
		return modelEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__IsLeafModel() {
		return modelEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOntology() {
		return ontologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOntology_Content() {
		return (EReference)ontologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOntology__GetModelAtLevel__int() {
		return ontologyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwnedElement() {
		return ownedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalElement() {
		return logicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogicalElement__GetModel() {
		return logicalElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetRelationship() {
		return setRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetRelationship_Base() {
		return (EReference)setRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSetRelationship__GetTarget() {
		return setRelationshipEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquality() {
		return equalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquality_Equal() {
		return (EReference)equalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEquality__GetTarget() {
		return equalityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInversion() {
		return inversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInversion_Inverse() {
		return (EReference)inversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInversion__GetTarget() {
		return inversionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplement() {
		return complementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplement_Complement() {
		return (EReference)complementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplement__GetTarget() {
		return complementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_Discriminant() {
		return (EAttribute)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneralization__GetSupertypes() {
		return generalizationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneralization__GetSubtypes() {
		return generalizationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryGeneralization() {
		return binaryGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryGeneralization_Subtype() {
		return (EReference)binaryGeneralizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryGeneralization_Supertype() {
		return (EReference)binaryGeneralizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleSpecialization() {
		return multipleSpecializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleSpecialization_Complete() {
		return (EAttribute)multipleSpecializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleSpecialization_Disjoint() {
		return (EAttribute)multipleSpecializationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleSpecialization_Subtype() {
		return (EReference)multipleSpecializationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleSpecialization_Supertype() {
		return (EReference)multipleSpecializationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleGeneralization() {
		return multipleGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleGeneralization_Intersection() {
		return (EAttribute)multipleGeneralizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleGeneralization_Subtype() {
		return (EReference)multipleGeneralizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleGeneralization_Supertype() {
		return (EReference)multipleGeneralizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassification() {
		return classificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassification_Instance() {
		return (EReference)classificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassification_Type() {
		return (EReference)classificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassification_Kind() {
		return (EAttribute)classificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClabject() {
		return clabjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClabject_Instantiable() {
		return (EAttribute)clabjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClabject_Potency() {
		return (EAttribute)clabjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClabject_Level() {
		return (EAttribute)clabjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClabject_Content() {
		return (EReference)clabjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClabject_Feature() {
		return (EReference)clabjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__AllInstancesFrom__String() {
		return clabjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModel() {
		return clabjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModelSupertypes() {
		return clabjectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModelSubtypes() {
		return clabjectEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModelClassificationsAsInstance() {
		return clabjectEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModelClassificationsAsType() {
		return clabjectEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModelInstances() {
		return clabjectEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModelTypes() {
		return clabjectEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetAllFeatures() {
		return clabjectEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetAllAttributes() {
		return clabjectEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetAllMethods() {
		return clabjectEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__IsModelInstanceOf__Clabject() {
		return clabjectEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__IsModelTypeOf__Clabject() {
		return clabjectEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetEigenConnections() {
		return clabjectEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetAllConnections() {
		return clabjectEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetInheritedConnections() {
		return clabjectEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetEigenAssociates() {
		return clabjectEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetInheritedAssociates() {
		return clabjectEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetAllAssociates() {
		return clabjectEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetEigenAssociateRoleNames() {
		return clabjectEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetAllAssociateRoleNames() {
		return clabjectEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetInheritedAssociateRoleNames() {
		return clabjectEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetEigenAssociatesForRoleName__String() {
		return clabjectEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetInheritedAssociatesForRoleName__String() {
		return clabjectEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetAllAssociatesForRoleName__String() {
		return clabjectEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModelCompleteTypes() {
		return clabjectEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModelIncompleteTypes() {
		return clabjectEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetBlueprint() {
		return clabjectEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModelOffspring() {
		return clabjectEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModelIsonyms() {
		return clabjectEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetModelHyponyms() {
		return clabjectEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetDomainForConnection__Connection() {
		return clabjectEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClabject__GetPossibleDomainSpecificVisualizers() {
		return clabjectEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Durability() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeature__GetClabject() {
		return featureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Transitive() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Lower() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Upper() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_IsNavigable() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Participant() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_RoleName() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnection__GetParticipantForRoleName__String() {
		return connectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnection__GetRoleNameForParticipant__Clabject() {
		return connectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnection__IsNavigableForRoleName__String() {
		return connectionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnection__GetLowerForRoleName__String() {
		return connectionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnection__GetUpperForRoleName__String() {
		return connectionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnection__GetDomain() {
		return connectionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnection__GetNotDomain() {
		return connectionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnection__GetHumanReadableName() {
		return connectionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualizer() {
		return visualizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualizer_Attributes() {
		return (EAttribute)visualizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualizer_Durability() {
		return (EAttribute)visualizerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualizer_Template() {
		return (EReference)visualizerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualizer_Child() {
		return (EReference)visualizerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisualizer__GetValueForKey__String() {
		return visualizerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisualizer__GetElement() {
		return visualizerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Datatype() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Mutability() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Body() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Input() {
		return (EReference)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Output() {
		return (EReference)methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualizationContainer() {
		return visualizationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualizationContainer_Origin() {
		return (EAttribute)visualizationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualizationContainer_VisualizersShown() {
		return (EAttribute)visualizationContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopLevelVisualizationContainer() {
		return topLevelVisualizationContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopLevelVisualizationContainer_Completness() {
		return (EAttribute)topLevelVisualizationContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassificationKind() {
		return classificationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLMFactory getPLMFactory() {
		return (PLMFactory)getEFactoryInstance();
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
		lmlModelEClass = createEClass(LML_MODEL);
		createEAttribute(lmlModelEClass, LML_MODEL__NAME);
		createEReference(lmlModelEClass, LML_MODEL__ELEMENTS);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__EXPRESSED);
		createEAttribute(elementEClass, ELEMENT__RELEVANT);
		createEReference(elementEClass, ELEMENT__VISUALIZER);

		domainElementEClass = createEClass(DOMAIN_ELEMENT);
		createEAttribute(domainElementEClass, DOMAIN_ELEMENT__ELIDED);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__CONTENT);
		createEOperation(modelEClass, MODEL___GET_ALL_GENERALIZATIONS);
		createEOperation(modelEClass, MODEL___GET_ALL_SET_RELATIONSHIPS);
		createEOperation(modelEClass, MODEL___GET_ALL_CLABJECTS);
		createEOperation(modelEClass, MODEL___GET_ALL_ENTITIES);
		createEOperation(modelEClass, MODEL___GET_ALL_CONNECTIONS);
		createEOperation(modelEClass, MODEL___GET_ALL_CLASSIFICATIONS);
		createEOperation(modelEClass, MODEL___GET_ONTOLOGY);
		createEOperation(modelEClass, MODEL___GET_CLASSIFIED_MODEL);
		createEOperation(modelEClass, MODEL___GET_CLASSIFYING_MODEL);
		createEOperation(modelEClass, MODEL___GET_LEVEL);
		createEOperation(modelEClass, MODEL___IS_ROOT_MODEL);
		createEOperation(modelEClass, MODEL___IS_LEAF_MODEL);

		ontologyEClass = createEClass(ONTOLOGY);
		createEReference(ontologyEClass, ONTOLOGY__CONTENT);
		createEOperation(ontologyEClass, ONTOLOGY___GET_MODEL_AT_LEVEL__INT);

		ownedElementEClass = createEClass(OWNED_ELEMENT);

		logicalElementEClass = createEClass(LOGICAL_ELEMENT);
		createEOperation(logicalElementEClass, LOGICAL_ELEMENT___GET_MODEL);

		setRelationshipEClass = createEClass(SET_RELATIONSHIP);
		createEReference(setRelationshipEClass, SET_RELATIONSHIP__BASE);
		createEOperation(setRelationshipEClass, SET_RELATIONSHIP___GET_TARGET);

		equalityEClass = createEClass(EQUALITY);
		createEReference(equalityEClass, EQUALITY__EQUAL);
		createEOperation(equalityEClass, EQUALITY___GET_TARGET);

		inversionEClass = createEClass(INVERSION);
		createEReference(inversionEClass, INVERSION__INVERSE);
		createEOperation(inversionEClass, INVERSION___GET_TARGET);

		complementEClass = createEClass(COMPLEMENT);
		createEReference(complementEClass, COMPLEMENT__COMPLEMENT);
		createEOperation(complementEClass, COMPLEMENT___GET_TARGET);

		generalizationEClass = createEClass(GENERALIZATION);
		createEAttribute(generalizationEClass, GENERALIZATION__DISCRIMINANT);
		createEOperation(generalizationEClass, GENERALIZATION___GET_SUPERTYPES);
		createEOperation(generalizationEClass, GENERALIZATION___GET_SUBTYPES);

		binaryGeneralizationEClass = createEClass(BINARY_GENERALIZATION);
		createEReference(binaryGeneralizationEClass, BINARY_GENERALIZATION__SUBTYPE);
		createEReference(binaryGeneralizationEClass, BINARY_GENERALIZATION__SUPERTYPE);

		multipleSpecializationEClass = createEClass(MULTIPLE_SPECIALIZATION);
		createEAttribute(multipleSpecializationEClass, MULTIPLE_SPECIALIZATION__COMPLETE);
		createEAttribute(multipleSpecializationEClass, MULTIPLE_SPECIALIZATION__DISJOINT);
		createEReference(multipleSpecializationEClass, MULTIPLE_SPECIALIZATION__SUBTYPE);
		createEReference(multipleSpecializationEClass, MULTIPLE_SPECIALIZATION__SUPERTYPE);

		multipleGeneralizationEClass = createEClass(MULTIPLE_GENERALIZATION);
		createEAttribute(multipleGeneralizationEClass, MULTIPLE_GENERALIZATION__INTERSECTION);
		createEReference(multipleGeneralizationEClass, MULTIPLE_GENERALIZATION__SUBTYPE);
		createEReference(multipleGeneralizationEClass, MULTIPLE_GENERALIZATION__SUPERTYPE);

		classificationEClass = createEClass(CLASSIFICATION);
		createEReference(classificationEClass, CLASSIFICATION__INSTANCE);
		createEReference(classificationEClass, CLASSIFICATION__TYPE);
		createEAttribute(classificationEClass, CLASSIFICATION__KIND);

		clabjectEClass = createEClass(CLABJECT);
		createEAttribute(clabjectEClass, CLABJECT__INSTANTIABLE);
		createEAttribute(clabjectEClass, CLABJECT__POTENCY);
		createEAttribute(clabjectEClass, CLABJECT__LEVEL);
		createEReference(clabjectEClass, CLABJECT__CONTENT);
		createEReference(clabjectEClass, CLABJECT__FEATURE);
		createEOperation(clabjectEClass, CLABJECT___ALL_INSTANCES_FROM__STRING);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL_SUPERTYPES);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL_SUBTYPES);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_INSTANCE);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_TYPE);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL_INSTANCES);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL_TYPES);
		createEOperation(clabjectEClass, CLABJECT___GET_ALL_FEATURES);
		createEOperation(clabjectEClass, CLABJECT___GET_ALL_ATTRIBUTES);
		createEOperation(clabjectEClass, CLABJECT___GET_ALL_METHODS);
		createEOperation(clabjectEClass, CLABJECT___IS_MODEL_INSTANCE_OF__CLABJECT);
		createEOperation(clabjectEClass, CLABJECT___IS_MODEL_TYPE_OF__CLABJECT);
		createEOperation(clabjectEClass, CLABJECT___GET_EIGEN_CONNECTIONS);
		createEOperation(clabjectEClass, CLABJECT___GET_ALL_CONNECTIONS);
		createEOperation(clabjectEClass, CLABJECT___GET_INHERITED_CONNECTIONS);
		createEOperation(clabjectEClass, CLABJECT___GET_EIGEN_ASSOCIATES);
		createEOperation(clabjectEClass, CLABJECT___GET_INHERITED_ASSOCIATES);
		createEOperation(clabjectEClass, CLABJECT___GET_ALL_ASSOCIATES);
		createEOperation(clabjectEClass, CLABJECT___GET_EIGEN_ASSOCIATE_ROLE_NAMES);
		createEOperation(clabjectEClass, CLABJECT___GET_ALL_ASSOCIATE_ROLE_NAMES);
		createEOperation(clabjectEClass, CLABJECT___GET_INHERITED_ASSOCIATE_ROLE_NAMES);
		createEOperation(clabjectEClass, CLABJECT___GET_EIGEN_ASSOCIATES_FOR_ROLE_NAME__STRING);
		createEOperation(clabjectEClass, CLABJECT___GET_INHERITED_ASSOCIATES_FOR_ROLE_NAME__STRING);
		createEOperation(clabjectEClass, CLABJECT___GET_ALL_ASSOCIATES_FOR_ROLE_NAME__STRING);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL_COMPLETE_TYPES);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL_INCOMPLETE_TYPES);
		createEOperation(clabjectEClass, CLABJECT___GET_BLUEPRINT);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL_OFFSPRING);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL_ISONYMS);
		createEOperation(clabjectEClass, CLABJECT___GET_MODEL_HYPONYMS);
		createEOperation(clabjectEClass, CLABJECT___GET_DOMAIN_FOR_CONNECTION__CONNECTION);
		createEOperation(clabjectEClass, CLABJECT___GET_POSSIBLE_DOMAIN_SPECIFIC_VISUALIZERS);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__DURABILITY);
		createEOperation(featureEClass, FEATURE___GET_CLABJECT);

		entityEClass = createEClass(ENTITY);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__TRANSITIVE);
		createEAttribute(connectionEClass, CONNECTION__LOWER);
		createEAttribute(connectionEClass, CONNECTION__UPPER);
		createEAttribute(connectionEClass, CONNECTION__IS_NAVIGABLE);
		createEReference(connectionEClass, CONNECTION__PARTICIPANT);
		createEAttribute(connectionEClass, CONNECTION__ROLE_NAME);
		createEOperation(connectionEClass, CONNECTION___GET_PARTICIPANT_FOR_ROLE_NAME__STRING);
		createEOperation(connectionEClass, CONNECTION___GET_ROLE_NAME_FOR_PARTICIPANT__CLABJECT);
		createEOperation(connectionEClass, CONNECTION___IS_NAVIGABLE_FOR_ROLE_NAME__STRING);
		createEOperation(connectionEClass, CONNECTION___GET_LOWER_FOR_ROLE_NAME__STRING);
		createEOperation(connectionEClass, CONNECTION___GET_UPPER_FOR_ROLE_NAME__STRING);
		createEOperation(connectionEClass, CONNECTION___GET_DOMAIN);
		createEOperation(connectionEClass, CONNECTION___GET_NOT_DOMAIN);
		createEOperation(connectionEClass, CONNECTION___GET_HUMAN_READABLE_NAME);

		visualizerEClass = createEClass(VISUALIZER);
		createEAttribute(visualizerEClass, VISUALIZER__ATTRIBUTES);
		createEAttribute(visualizerEClass, VISUALIZER__DURABILITY);
		createEReference(visualizerEClass, VISUALIZER__TEMPLATE);
		createEReference(visualizerEClass, VISUALIZER__CHILD);
		createEOperation(visualizerEClass, VISUALIZER___GET_VALUE_FOR_KEY__STRING);
		createEOperation(visualizerEClass, VISUALIZER___GET_ELEMENT);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__DATATYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
		createEAttribute(attributeEClass, ATTRIBUTE__MUTABILITY);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__BODY);
		createEReference(methodEClass, METHOD__INPUT);
		createEReference(methodEClass, METHOD__OUTPUT);

		visualizationContainerEClass = createEClass(VISUALIZATION_CONTAINER);
		createEAttribute(visualizationContainerEClass, VISUALIZATION_CONTAINER__ORIGIN);
		createEAttribute(visualizationContainerEClass, VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN);

		topLevelVisualizationContainerEClass = createEClass(TOP_LEVEL_VISUALIZATION_CONTAINER);
		createEAttribute(topLevelVisualizationContainerEClass, TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS);

		// Create enums
		classificationKindEEnum = createEEnum(CLASSIFICATION_KIND);
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
		VisualizationPackage theVisualizationPackage = (VisualizationPackage)EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theVisualizationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		domainElementEClass.getESuperTypes().add(this.getOwnedElement());
		modelEClass.getESuperTypes().add(this.getElement());
		modelEClass.getESuperTypes().add(this.getTopLevelVisualizationContainer());
		ontologyEClass.getESuperTypes().add(this.getElement());
		ontologyEClass.getESuperTypes().add(this.getTopLevelVisualizationContainer());
		ownedElementEClass.getESuperTypes().add(this.getElement());
		logicalElementEClass.getESuperTypes().add(this.getOwnedElement());
		setRelationshipEClass.getESuperTypes().add(this.getLogicalElement());
		equalityEClass.getESuperTypes().add(this.getSetRelationship());
		inversionEClass.getESuperTypes().add(this.getSetRelationship());
		complementEClass.getESuperTypes().add(this.getSetRelationship());
		generalizationEClass.getESuperTypes().add(this.getLogicalElement());
		binaryGeneralizationEClass.getESuperTypes().add(this.getGeneralization());
		multipleSpecializationEClass.getESuperTypes().add(this.getGeneralization());
		multipleGeneralizationEClass.getESuperTypes().add(this.getGeneralization());
		classificationEClass.getESuperTypes().add(this.getLogicalElement());
		clabjectEClass.getESuperTypes().add(this.getDomainElement());
		clabjectEClass.getESuperTypes().add(this.getVisualizationContainer());
		featureEClass.getESuperTypes().add(this.getDomainElement());
		entityEClass.getESuperTypes().add(this.getClabject());
		connectionEClass.getESuperTypes().add(this.getClabject());
		attributeEClass.getESuperTypes().add(this.getFeature());
		methodEClass.getESuperTypes().add(this.getFeature());
		topLevelVisualizationContainerEClass.getESuperTypes().add(this.getVisualizationContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(lmlModelEClass, LMLModel.class, "LMLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLMLModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, LMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLMLModel_Elements(), this.getElement(), null, "elements", null, 0, -1, LMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Expressed(), ecorePackage.getEBoolean(), "expressed", "true", 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Relevant(), ecorePackage.getEBoolean(), "relevant", "true", 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Visualizer(), this.getVisualizer(), null, "visualizer", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainElementEClass, DomainElement.class, "DomainElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainElement_Elided(), ecorePackage.getEBoolean(), "elided", "false", 0, 1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Content(), this.getOwnedElement(), null, "content", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModel__GetAllGeneralizations(), this.getGeneralization(), "getAllGeneralizations", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModel__GetAllSetRelationships(), this.getSetRelationship(), "getAllSetRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModel__GetAllClabjects(), this.getClabject(), "getAllClabjects", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModel__GetAllEntities(), this.getEntity(), "getAllEntities", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModel__GetAllConnections(), this.getConnection(), "getAllConnections", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModel__GetAllClassifications(), this.getClassification(), "getAllClassifications", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModel__GetOntology(), this.getOntology(), "getOntology", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModel__GetClassifiedModel(), this.getModel(), "getClassifiedModel", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModel__GetClassifyingModel(), this.getModel(), "getClassifyingModel", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModel__GetLevel(), ecorePackage.getEInt(), "getLevel", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModel__IsRootModel(), ecorePackage.getEBoolean(), "isRootModel", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModel__IsLeafModel(), ecorePackage.getEBoolean(), "isLeafModel", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOntology_Content(), this.getModel(), null, "content", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getOntology__GetModelAtLevel__int(), this.getModel(), "getModelAtLevel", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "level", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ownedElementEClass, OwnedElement.class, "OwnedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalElementEClass, LogicalElement.class, "LogicalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLogicalElement__GetModel(), this.getModel(), "getModel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(setRelationshipEClass, SetRelationship.class, "SetRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetRelationship_Base(), this.getClabject(), null, "base", null, 1, 1, SetRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSetRelationship__GetTarget(), this.getClabject(), "getTarget", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(equalityEClass, Equality.class, "Equality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquality_Equal(), this.getClabject(), null, "equal", null, 1, 1, Equality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEquality__GetTarget(), this.getClabject(), "getTarget", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(inversionEClass, Inversion.class, "Inversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInversion_Inverse(), this.getClabject(), null, "inverse", null, 1, 1, Inversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInversion__GetTarget(), this.getClabject(), "getTarget", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(complementEClass, Complement.class, "Complement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplement_Complement(), this.getClabject(), null, "complement", null, 1, 1, Complement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComplement__GetTarget(), this.getClabject(), "getTarget", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralization_Discriminant(), ecorePackage.getEString(), "discriminant", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGeneralization__GetSupertypes(), this.getClabject(), "getSupertypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGeneralization__GetSubtypes(), this.getClabject(), "getSubtypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(binaryGeneralizationEClass, BinaryGeneralization.class, "BinaryGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryGeneralization_Subtype(), this.getClabject(), null, "subtype", null, 1, 1, BinaryGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryGeneralization_Supertype(), this.getClabject(), null, "supertype", null, 1, 1, BinaryGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleSpecializationEClass, MultipleSpecialization.class, "MultipleSpecialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleSpecialization_Complete(), ecorePackage.getEBoolean(), "complete", "false", 0, 1, MultipleSpecialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleSpecialization_Disjoint(), ecorePackage.getEBoolean(), "disjoint", "false", 0, 1, MultipleSpecialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleSpecialization_Subtype(), this.getClabject(), null, "subtype", null, 2, -1, MultipleSpecialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleSpecialization_Supertype(), this.getClabject(), null, "supertype", null, 0, 1, MultipleSpecialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleGeneralizationEClass, MultipleGeneralization.class, "MultipleGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleGeneralization_Intersection(), ecorePackage.getEBoolean(), "intersection", "false", 0, 1, MultipleGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleGeneralization_Subtype(), this.getClabject(), null, "subtype", null, 0, 1, MultipleGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleGeneralization_Supertype(), this.getClabject(), null, "supertype", null, 2, -1, MultipleGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationEClass, Classification.class, "Classification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassification_Instance(), this.getClabject(), null, "instance", null, 1, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassification_Type(), this.getClabject(), null, "type", null, 1, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassification_Kind(), this.getClassificationKind(), "kind", "classification", 1, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clabjectEClass, Clabject.class, "Clabject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClabject_Instantiable(), ecorePackage.getEBoolean(), "instantiable", "true", 0, 1, Clabject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClabject_Potency(), ecorePackage.getEInt(), "potency", "1", 0, 1, Clabject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClabject_Level(), ecorePackage.getEInt(), "level", null, 0, 1, Clabject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClabject_Content(), this.getClabject(), null, "content", null, 0, -1, Clabject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClabject_Feature(), this.getFeature(), null, "feature", null, 0, -1, Clabject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getClabject__AllInstancesFrom__String(), this.getClabject(), "allInstancesFrom", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClabject__GetModel(), this.getModel(), "getModel", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetModelSupertypes(), this.getClabject(), "getModelSupertypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetModelSubtypes(), this.getClabject(), "getModelSubtypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetModelClassificationsAsInstance(), this.getClassification(), "getModelClassificationsAsInstance", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetModelClassificationsAsType(), this.getClassification(), "getModelClassificationsAsType", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetModelInstances(), this.getClabject(), "getModelInstances", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetModelTypes(), this.getClabject(), "getModelTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetAllFeatures(), this.getFeature(), "getAllFeatures", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetAllAttributes(), this.getAttribute(), "getAllAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetAllMethods(), this.getMethod(), "getAllMethods", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClabject__IsModelInstanceOf__Clabject(), ecorePackage.getEBoolean(), "isModelInstanceOf", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClabject(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClabject__IsModelTypeOf__Clabject(), ecorePackage.getEBoolean(), "isModelTypeOf", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClabject(), "instance", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClabject__GetEigenConnections(), this.getConnection(), "getEigenConnections", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetAllConnections(), this.getConnection(), "getAllConnections", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetInheritedConnections(), this.getConnection(), "getInheritedConnections", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetEigenAssociates(), this.getClabject(), "getEigenAssociates", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetInheritedAssociates(), this.getClabject(), "getInheritedAssociates", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetAllAssociates(), this.getClabject(), "getAllAssociates", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetEigenAssociateRoleNames(), ecorePackage.getEString(), "getEigenAssociateRoleNames", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetAllAssociateRoleNames(), ecorePackage.getEString(), "getAllAssociateRoleNames", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetInheritedAssociateRoleNames(), ecorePackage.getEString(), "getInheritedAssociateRoleNames", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClabject__GetEigenAssociatesForRoleName__String(), this.getClabject(), "getEigenAssociatesForRoleName", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClabject__GetInheritedAssociatesForRoleName__String(), this.getClabject(), "getInheritedAssociatesForRoleName", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClabject__GetAllAssociatesForRoleName__String(), this.getClabject(), "getAllAssociatesForRoleName", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClabject__GetModelCompleteTypes(), this.getClabject(), "getModelCompleteTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetModelIncompleteTypes(), this.getClabject(), "getModelIncompleteTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetBlueprint(), this.getClabject(), "getBlueprint", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetModelOffspring(), this.getClabject(), "getModelOffspring", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetModelIsonyms(), this.getClabject(), "getModelIsonyms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClabject__GetModelHyponyms(), this.getClabject(), "getModelHyponyms", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClabject__GetDomainForConnection__Connection(), this.getClabject(), "getDomainForConnection", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getConnection(), "connection", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClabject__GetPossibleDomainSpecificVisualizers(), theVisualizationPackage.getVisualizationDescriptor(), "getPossibleDomainSpecificVisualizers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Durability(), ecorePackage.getEInt(), "durability", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFeature__GetClabject(), this.getClabject(), "getClabject", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Transitive(), ecorePackage.getEBoolean(), "transitive", "false", 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Lower(), ecorePackage.getEInt(), "lower", "0", 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Upper(), ecorePackage.getEInt(), "upper", "-1", 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_IsNavigable(), ecorePackage.getEBoolean(), "isNavigable", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Participant(), this.getClabject(), null, "participant", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_RoleName(), ecorePackage.getEString(), "roleName", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getConnection__GetParticipantForRoleName__String(), this.getClabject(), "getParticipantForRoleName", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnection__GetRoleNameForParticipant__Clabject(), ecorePackage.getEString(), "getRoleNameForParticipant", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClabject(), "participant", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnection__IsNavigableForRoleName__String(), ecorePackage.getEBoolean(), "isNavigableForRoleName", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnection__GetLowerForRoleName__String(), ecorePackage.getEInt(), "getLowerForRoleName", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnection__GetUpperForRoleName__String(), ecorePackage.getEInt(), "getUpperForRoleName", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConnection__GetDomain(), this.getClabject(), "getDomain", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getConnection__GetNotDomain(), this.getClabject(), "getNotDomain", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getConnection__GetHumanReadableName(), ecorePackage.getEString(), "getHumanReadableName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(visualizerEClass, Visualizer.class, "Visualizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualizer_Attributes(), ecorePackage.getEString(), "attributes", null, 0, -1, Visualizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisualizer_Durability(), ecorePackage.getEInt(), "durability", null, 1, 1, Visualizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualizer_Template(), this.getVisualizer(), null, "template", null, 0, 1, Visualizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualizer_Child(), theVisualizationPackage.getVisualizationDescriptor(), null, "child", null, 0, -1, Visualizer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVisualizer__GetValueForKey__String(), ecorePackage.getEString(), "getValueForKey", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVisualizer__GetElement(), this.getElement(), "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Datatype(), this.getClabject(), null, "datatype", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Mutability(), ecorePackage.getEInt(), "mutability", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Body(), ecorePackage.getEString(), "body", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Input(), this.getElement(), null, "input", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Output(), this.getElement(), null, "output", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualizationContainerEClass, VisualizationContainer.class, "VisualizationContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualizationContainer_Origin(), ecorePackage.getEString(), "origin", "all", 0, 1, VisualizationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisualizationContainer_VisualizersShown(), ecorePackage.getEString(), "visualizersShown", "none", 0, 1, VisualizationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topLevelVisualizationContainerEClass, TopLevelVisualizationContainer.class, "TopLevelVisualizationContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopLevelVisualizationContainer_Completness(), ecorePackage.getEString(), "completness", "elision", 0, 1, TopLevelVisualizationContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classificationKindEEnum, ClassificationKind.class, "ClassificationKind");
		addEEnumLiteral(classificationKindEEnum, ClassificationKind.INSTANCE);
		addEEnumLiteral(classificationKindEEnum, ClassificationKind.ISONYM);
		addEEnumLiteral(classificationKindEEnum, ClassificationKind.HYPONYM);
		addEEnumLiteral(classificationKindEEnum, ClassificationKind.CLASSIFICATION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// Comment
		createCommentAnnotations();
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
	 * Initializes the annotations for <b>Comment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCommentAnnotations() {
		String source = "Comment";																							
		addAnnotation
		  (clabjectEClass, 
		   source, 
		   new String[] {
			 "level derrived", "Element container = (this.eContainer() instanceof Element) ? (Element)this.eContainer() : null;\r\n\t\t\r\n\t\twhile ( (container != null) && !(container instanceof Model) )\r\n\t\t\tcontainer = (container.eContainer() instanceof Element) ? (Element)container.eContainer() : null;\r\n\t\tif (container == null)\r\n\t\t\treturn -1;\r\n\t\treturn (container.eContainer() instanceof Ontology) ? ((Ontology)container.eContainer()).getModels().indexOf(container) : -1;"
		   });																																				
		addAnnotation
		  (connectionEClass, 
		   source, 
		   new String[] {
			 "Unique Workaround", "if (this.participant == null) {\r\n\t\t    this.participant = new EObjectResolvingEList<Clabject>(Clabject.class, this,\r\n\t\t    \t\tPLMPackage.DOMAIN_CONNECTION__PARTICIPANT) {\r\n\t\t      @Override\r\n\t\t      protected boolean isUnique() {\r\n\t\t        return false;\r\n\t\t      }\r\n\t\t    };\r\n\t\t  }\r\n\t\t  return this.participant;"
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
		  (getModel__GetAllGeneralizations(), 
		   source, 
		   new String[] {
			 "body", "self.content->select(e|e.oclIsKindOf(Generalization))->collect(g | g.oclAsType(Generalization))->asSet()"
		   });		
		addAnnotation
		  (getModel__GetAllSetRelationships(), 
		   source, 
		   new String[] {
			 "body", "self.content->select(e|e.oclIsKindOf(SetRelationship))->collect(g | g.oclAsType(SetRelationship))->asSet()"
		   });		
		addAnnotation
		  (getModel__GetAllClabjects(), 
		   source, 
		   new String[] {
			 "body", "self.content->select(e|e.oclIsKindOf(Clabject))->collect(g | g.oclAsType(Clabject))->asSet()"
		   });		
		addAnnotation
		  (getModel__GetAllEntities(), 
		   source, 
		   new String[] {
			 "body", "self.content->select(e|e.oclIsKindOf(Entity))->collect(g | g.oclAsType(Entity))->asSet()"
		   });		
		addAnnotation
		  (getModel__GetAllConnections(), 
		   source, 
		   new String[] {
			 "body", "self.content->select(e|e.oclIsKindOf(Connection))->collect(g | g.oclAsType(Connection))->asSet()"
		   });		
		addAnnotation
		  (getModel__GetAllClassifications(), 
		   source, 
		   new String[] {
			 "body", "self.content->select(e|e.oclIsKindOf(Classification))->collect(g | g.oclAsType(Classification))->asSet()"
		   });		
		addAnnotation
		  (getModel__GetOntology(), 
		   source, 
		   new String[] {
			 "body", "self.oclAsType(ecore::EObject).eContainer().oclAsType(Ontology)"
		   });		
		addAnnotation
		  (getModel__GetClassifiedModel(), 
		   source, 
		   new String[] {
			 "body", "if (self.getOntology().content->indexOf(self) = self.getOntology().content->size()) then\nnull\nelse\nself.getOntology().content->at(self.getOntology().content->indexOf(self) + 1)\nendif"
		   });		
		addAnnotation
		  (getModel__GetClassifyingModel(), 
		   source, 
		   new String[] {
			 "body", "if (self.getOntology().content->indexOf(self) = 1) then\nnull\nelse\nself.getOntology().content->at(self.getOntology().content->indexOf(self) - 1)\nendif"
		   });		
		addAnnotation
		  (getModel__GetLevel(), 
		   source, 
		   new String[] {
			 "body", "self.getOntology().content->indexOf(self)-1"
		   });		
		addAnnotation
		  (getModel__IsRootModel(), 
		   source, 
		   new String[] {
			 "body", "OclInvalid"
		   });		
		addAnnotation
		  (getModel__IsLeafModel(), 
		   source, 
		   new String[] {
			 "body", "OclInvalid"
		   });		
		addAnnotation
		  (getOntology__GetModelAtLevel__int(), 
		   source, 
		   new String[] {
			 "body", "OclInvalid"
		   });		
		addAnnotation
		  (getLogicalElement__GetModel(), 
		   source, 
		   new String[] {
			 "body", "self.oclAsType(ecore::EObject).eContainer().oclAsType(Model)"
		   });		
		addAnnotation
		  (getSetRelationship__GetTarget(), 
		   source, 
		   new String[] {
			 "body", "OclInvalid"
		   });		
		addAnnotation
		  (getEquality__GetTarget(), 
		   source, 
		   new String[] {
			 "body", "self.equal"
		   });		
		addAnnotation
		  (getInversion__GetTarget(), 
		   source, 
		   new String[] {
			 "body", "self.inverse"
		   });		
		addAnnotation
		  (getComplement__GetTarget(), 
		   source, 
		   new String[] {
			 "body", "self.complement"
		   });		
		addAnnotation
		  (getGeneralization__GetSupertypes(), 
		   source, 
		   new String[] {
			 "body", "if (self.oclIsTypeOf(MultipleGeneralization)) then\r\n\tself.oclAsType(MultipleGeneralization).supertype->asSet()\r\nelse\r\n\tif (self.oclIsTypeOf(MultipleSpecialization)) then\r\n\t\tself.oclAsType(MultipleSpecialization).supertype->asSet()\r\n\telse\r\n\t\tif (self.oclIsTypeOf(BinaryGeneralization)) then\r\n\t\t\tself.oclAsType(BinaryGeneralization).supertype->asSet()\r\n\t\telse\r\n\t\t\tSet(Clabject){}\r\n\t\tendif\r\n\tendif\r\nendif"
		   });		
		addAnnotation
		  (getGeneralization__GetSubtypes(), 
		   source, 
		   new String[] {
			 "body", "if (self.oclIsTypeOf(MultipleGeneralization)) then\r\n\tself.oclAsType(MultipleGeneralization).subtype->asSet()\r\nelse\r\n\tif (self.oclIsTypeOf(MultipleSpecialization)) then\r\n\t\tself.oclAsType(MultipleSpecialization).subtype->asSet()\r\n\telse\r\n\t\tif (self.oclIsTypeOf(BinaryGeneralization)) then\r\n\t\t\tself.oclAsType(BinaryGeneralization).subtype->asSet()\r\n\t\telse\r\n\t\t\tSet(Clabject){}\r\n\t\tendif\r\n\tendif\r\nendif"
		   });			
		addAnnotation
		  (getClabject__AllInstancesFrom__String(), 
		   source, 
		   new String[] {
			 "body", "Classification.allInstances()->select(i | i.type = self).instance"
		   });		
		addAnnotation
		  (getClabject__GetModel(), 
		   source, 
		   new String[] {
			 "body", "let parent:ecore::EObject = \r\n\tself.oclAsType(ecore::EObject).eContainer()\r\nin\r\n\tif (parent.oclIsTypeOf(Model)) then\r\n\t\tparent.oclAsType(Model)\r\n\telse\r\n\t\tif (parent.oclIsTypeOf(Clabject)) then\r\n\t\t\tparent.oclAsType(Clabject).getModel()\r\n\t\telse\r\n\t\t\tnull\r\n\t\tendif\r\n\tendif"
		   });		
		addAnnotation
		  (getClabject__GetModelSupertypes(), 
		   source, 
		   new String[] {
			 "body", "let containingModel:Model = \r\n\tself.getModel()\r\nin\r\nlet directResult:Set(Clabject) =\r\n\t--Check all direct BinaryGeneralizations\r\n\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(BinaryGeneralization) and g.oclAsType(BinaryGeneralization).subtype = self)\r\n\t->collect(g | g.oclAsType(BinaryGeneralization).supertype)\r\n\t\r\n\t--Check all direct MultipleSpecializations\r\n\t->union(\r\n\t\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(MultipleSpecialization) and g.oclAsType(MultipleSpecialization).subtype->includes(self))\r\n\t\t->collect(g | g.oclAsType(MultipleSpecialization).supertype)\r\n\t)\r\n\t--Check all direct MultipleGeneralizations\r\n\t->union(\r\n\t\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(MultipleGeneralization) and g.oclAsType(MultipleGeneralization).subtype = self)\r\n\t\t->collect(g | g.oclAsType(MultipleGeneralization).supertype)->flatten()\r\n\t)->asSet()\r\nin\r\n--Start recursion\r\ndirectResult->iterate(c:Clabject; type:Set(Clabject) = directResult|\r\n\ttype->union(c.getModelSupertypes())\r\n)"
		   });		
		addAnnotation
		  (getClabject__GetModelSubtypes(), 
		   source, 
		   new String[] {
			 "body", "let containingModel:Model = \r\n\tself.getModel()\r\nin\r\nlet directResult:OrderedSet(Clabject) =\r\n\t--Check all direct BinaryGeneralizations\r\n\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(BinaryGeneralization) and g.oclAsType(BinaryGeneralization).supertype = self)\r\n\t->collect(g | g.oclAsType(BinaryGeneralization).subtype)\r\n\t\r\n\t--Check all direct MultipleSpecializations\r\n\t->union(\r\n\t\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(MultipleGeneralization) and g.oclAsType(MultipleGeneralization).supertype->includes(self))\r\n\t\t->collect(g | g.oclAsType(MultipleGeneralization).subtype)\r\n\t)\r\n\t\r\n\t--Check all direct MultipleGeneralizations\r\n\t->union(\r\n\t\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(MultipleSpecialization) and g.oclAsType(MultipleSpecialization).supertype = self)\r\n\t\t->collect(g | g.oclAsType(MultipleSpecialization).subtype)->flatten()\r\n\t)\r\n\t->asOrderedSet()\r\nin\r\n--Start recursion\r\ndirectResult->iterate(c:Clabject; type:OrderedSet(Clabject) = directResult|\r\n\ttype->union(c.getModelSubtypes())->asOrderedSet()\r\n)"
		   });		
		addAnnotation
		  (getClabject__GetModelClassificationsAsInstance(), 
		   source, 
		   new String[] {
			 "body", "Classification.allInstances()->select(i|i.instance = self)"
		   });		
		addAnnotation
		  (getClabject__GetModelClassificationsAsType(), 
		   source, 
		   new String[] {
			 "body", "Classification.allInstances()->select(i|i.type = self)"
		   });		
		addAnnotation
		  (getClabject__GetModelInstances(), 
		   source, 
		   new String[] {
			 "body", "let allTypes:Set(Clabject) = \r\n\tself.getModelSubtypes()->append(self)\r\nin\r\n\tallTypes->iterate(type:Clabject; instances:Set(Clabject) = Set(Clabject){}|\r\n\t\t--Take all instances\r\n\t\tinstances->union(type.getModelClassificationsAsType().instance)\r\n\t\t--Union with subtypes of instances\r\n\t\t->union(type.getModelClassificationsAsType().instance.getModelSubtypes())\r\n\t)"
		   });		
		addAnnotation
		  (getClabject__GetModelTypes(), 
		   source, 
		   new String[] {
			 "body", "let allTypes:Set(Clabject) = \r\n\tself.getModelSupertypes()->including(self)\r\nin\r\n\tallTypes->iterate(type:Clabject; instances:Set(Clabject) =Set(Clabject){}|\r\n\t\t--Take all types\r\n\t\tinstances->union(type.getModelClassificationsAsInstance().type)\r\n\t\t--Union with supertypes of types\r\n\t\t->union(type.getModelClassificationsAsInstance().type.getModelSupertypes())->asSet()\r\n\t)"
		   });		
		addAnnotation
		  (getClabject__GetAllFeatures(), 
		   source, 
		   new String[] {
			 "body", "self.getModelSupertypes()->including(self).feature->asSet()"
		   });		
		addAnnotation
		  (getClabject__GetAllAttributes(), 
		   source, 
		   new String[] {
			 "body", "self.getAllFeatures()->select(f | f.oclIsTypeOf(Attribute)).oclAsType(Attribute)"
		   });		
		addAnnotation
		  (getClabject__GetAllMethods(), 
		   source, 
		   new String[] {
			 "body", "self.getAllFeatures()->select(f | f.oclIsTypeOf(Method)).oclAsType(Method)"
		   });		
		addAnnotation
		  (getClabject__IsModelInstanceOf__Clabject(), 
		   source, 
		   new String[] {
			 "body", "type.getModelInstances()->includes(self)"
		   });		
		addAnnotation
		  (getClabject__IsModelTypeOf__Clabject(), 
		   source, 
		   new String[] {
			 "body", "instance.getModelTypes()->includes(self)"
		   });		
		addAnnotation
		  (getClabject__GetEigenConnections(), 
		   source, 
		   new String[] {
			 "body", "Connection.allInstances()->select(c|c.participant->includes(self))"
		   });		
		addAnnotation
		  (getClabject__GetAllConnections(), 
		   source, 
		   new String[] {
			 "body", "self.getInheritedConnections()->union(self.getEigenConnections())"
		   });		
		addAnnotation
		  (getClabject__GetInheritedConnections(), 
		   source, 
		   new String[] {
			 "body", "self.getModelSupertypes().getEigenConnections()->asSet()"
		   });		
		addAnnotation
		  (getClabject__GetEigenAssociates(), 
		   source, 
		   new String[] {
			 "body", "self.getEigenConnections()->iterate(c:Connection; associates:Set(Clabject)=Set(Clabject){}|\r\n\tassociates->union(\r\n\t\tc.participant->select(p | c.isNavigableForParticipant(p) and p <> self)\r\n\t)\r\n)"
		   });		
		addAnnotation
		  (getClabject__GetInheritedAssociates(), 
		   source, 
		   new String[] {
			 "body", "OclInvalid"
		   });		
		addAnnotation
		  (getClabject__GetAllAssociates(), 
		   source, 
		   new String[] {
			 "body", "OclInvalid"
		   });		
		addAnnotation
		  (getClabject__GetEigenAssociateRoleNames(), 
		   source, 
		   new String[] {
			 "body", "self.getEigenConnections()->iterate(c:Connection; associates:Set(String)=Set(String){}|\r\n\tassociates->union(\r\n\t\tc.roleName->select(rN| c.getParticipantForRoleName(rN) <> self)->asSet()\r\n\t)\r\n)"
		   });		
		addAnnotation
		  (getClabject__GetAllAssociateRoleNames(), 
		   source, 
		   new String[] {
			 "body", "self.getInheritedAssociateRoleNames()->union(self.getEigenAssociateRoleNames())"
		   });		
		addAnnotation
		  (getClabject__GetInheritedAssociateRoleNames(), 
		   source, 
		   new String[] {
			 "body", "self.getModelSupertypes()->iterate(sup:Clabject; associates:Set(String)=Set(String){}|\r\n\tassociates->union( sup.getEigenAssociateRoleNames())\r\n\t)"
		   });		
		addAnnotation
		  (getClabject__GetEigenAssociatesForRoleName__String(), 
		   source, 
		   new String[] {
			 "body", "self.getEigenConnections()->select(c | c.roleName->includes(roleName) and c.isNavigableForRoleName(roleName)).getParticipantForRoleName(roleName)->asSet()"
		   });		
		addAnnotation
		  (getClabject__GetInheritedAssociatesForRoleName__String(), 
		   source, 
		   new String[] {
			 "body", "self.getInheritedConnections()->select(c | c.roleName->includes(roleName) and c.isNavigableForRoleName(roleName)).getParticipantForRoleName(roleName)->asSet()"
		   });		
		addAnnotation
		  (getClabject__GetAllAssociatesForRoleName__String(), 
		   source, 
		   new String[] {
			 "body", "self.getInheritedAssociatesForRoleName(roleName)->union(self.getEigenAssociatesForRoleName(roleName))"
		   });		
		addAnnotation
		  (getClabject__GetModelCompleteTypes(), 
		   source, 
		   new String[] {
			 "body", "self.getModelClassificationsAsInstance()->select(kind= ClassificationKind::isonym).type->asSet()"
		   });		
		addAnnotation
		  (getClabject__GetModelIncompleteTypes(), 
		   source, 
		   new String[] {
			 "body", "OclInvalid"
		   });		
		addAnnotation
		  (getClabject__GetBlueprint(), 
		   source, 
		   new String[] {
			 "body", "let bps:Sequence(Clabject) = \n\tself.getModelClassificationsAsInstance()->select(kind= ClassificationKind::classification).type->asSequence()\nin\n\tif bps->size() > 0 then bps->at(1) else null endif"
		   });		
		addAnnotation
		  (getClabject__GetModelOffspring(), 
		   source, 
		   new String[] {
			 "body", "OclInvalid"
		   });		
		addAnnotation
		  (getClabject__GetModelIsonyms(), 
		   source, 
		   new String[] {
			 "body", "OclInvalid"
		   });		
		addAnnotation
		  (getClabject__GetModelHyponyms(), 
		   source, 
		   new String[] {
			 "body", "OclInvalid"
		   });		
		addAnnotation
		  (getClabject__GetDomainForConnection__Connection(), 
		   source, 
		   new String[] {
			 "body", "OclInvalid"
		   });		
		addAnnotation
		  (getClabject__GetPossibleDomainSpecificVisualizers(), 
		   source, 
		   new String[] {
			 "body", "--At first we look if a visualization descriptor is directly attached\r\nlet possibleVisualization:Set(visualization::VisualizationDescriptor) = \r\n\tself.visualizer.child->asSet()\r\nin\r\n--Now look at the superTypes if nothing is directly found\r\nlet possibleVisualizationOfModelSupertypes:Set(visualization::VisualizationDescriptor) =\r\n\tif (possibleVisualization->size() = 0) then\r\n\t\tself.getModelSupertypes().visualizer.child->asSet()\r\n\telse\r\n\t\tpossibleVisualization\r\n\tendif\r\nin\r\n--Look at the model types if nothing is found\r\nif (possibleVisualizationOfModelSupertypes->size() = 0) then\r\n\tself.getModelTypes().getPossibleDomainSpecificVisualizers()->asSet()\r\nelse\r\n\tpossibleVisualizationOfModelSupertypes\r\nendif"
		   });		
		addAnnotation
		  (getFeature__GetClabject(), 
		   source, 
		   new String[] {
			 "body", "self.oclAsType(ecore::EObject).eContainer().oclAsType(Clabject)"
		   });			
		addAnnotation
		  (getConnection__GetParticipantForRoleName__String(), 
		   source, 
		   new String[] {
			 "body", "self.participant->at(self.roleName->indexOf(roleName))"
		   });		
		addAnnotation
		  (getConnection__GetRoleNameForParticipant__Clabject(), 
		   source, 
		   new String[] {
			 "body", "--We found a direct participant of the connection\r\nlet foundParticipants:OrderedSet(Clabject) =\r\n\tself.participant->select(p | p.getModelSubtypes()->including(p)->includes(participant))->asOrderedSet()\r\nin\r\n--something found? -> take the first found\r\nif (foundParticipants->size() > 0) then\r\n\tself.roleName->at(self.participant->indexOf(foundParticipants->first()))->asOrderedSet()\r\nelse\r\n\t\'\'->asSet()\r\nendif"
		   });		
		addAnnotation
		  (getConnection__IsNavigableForRoleName__String(), 
		   source, 
		   new String[] {
			 "body", "self.isNavigable->at(self.roleName->indexOf(roleName))"
		   });		
		addAnnotation
		  (getConnection__GetLowerForRoleName__String(), 
		   source, 
		   new String[] {
			 "body", "self.lower->at(self.roleName->indexOf(roleName))"
		   });		
		addAnnotation
		  (getConnection__GetUpperForRoleName__String(), 
		   source, 
		   new String[] {
			 "body", "self.upper->at(self.roleName->indexOf(roleName))"
		   });		
		addAnnotation
		  (getConnection__GetDomain(), 
		   source, 
		   new String[] {
			 "body", "self.roleName->select(rN | self.isNavigableForRoleName(rN))->collect(rN | self.getParticipantForRoleName(rN))->asSet()"
		   });		
		addAnnotation
		  (getConnection__GetNotDomain(), 
		   source, 
		   new String[] {
			 "body", "self.roleName->select(rN | not self.isNavigableForRoleName(rN))->collect(rN | self.getParticipantForRoleName(rN))->asSet()"
		   });		
		addAnnotation
		  (getConnection__GetHumanReadableName(), 
		   source, 
		   new String[] {
			 "body", "--Works only on connections with two or more participants\r\nif (not (self.participant->size() > 1)) then\r\n\t\'\'\r\nelse\r\n\tif (not self.name.oclIsUndefined() and self.name.size() <> 0) then\r\n\t\tself.name\r\n\telse\r\n\t\tlet domain:OrderedSet(Clabject) =\r\n\t\t\tself.getDomain()->asOrderedSet()\r\n\t\tin\r\n\t\tif (domain->size() = 1) then\r\n\t\t\tlet domainRoleName:String = \r\n\t\t\t\tself.getRoleNameForParticipant(domain->first())->asOrderedSet()->first()\r\n\t\t\tin\r\n\t\t\tlet notNavigableParticipant:Clabject=\t\r\n\t\t\t\tself.getNotDomain()->asOrderedSet()->at(1)\r\n\t\t\tin\r\n\t\t\tif (notNavigableParticipant->size() = 0) then\r\n\t\t\t\tdomain->at(0).name.concat(\'.\').concat(domainRoleName)\r\n\t\t\telse\r\n\t\t\t\tnotNavigableParticipant.name.concat(\'.\').concat(domainRoleName)\r\n\t\t\tendif\r\n\t\telse\r\n\t\t\tif (domain->size() > 0) then\r\n\t\t\t\tlet connectionName:String = \r\n\t\t\t\t\tdomain->iterate(p:Clabject; name:String = \'\' |\r\n\t\t\t\t\t\tlet roleName:String = \r\n\t\t\t\t\t\t\tself.getRoleNameForParticipant(p)->asOrderedSet()->first()\r\n\t\t\t\t\t\tin\r\n\t\t\t\t\t\tif (p = domain->last()) then\r\n\t\t\t\t\t\t\tname.concat(roleName.substring(1,1).toUpper().concat(roleName.substring(2, roleName.size())))\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tname.concat(roleName.substring(1,1).toUpper().concat(roleName.substring(2, roleName.size()))).concat(\'And\')\r\n\t\t\t\t\t\tendif\r\n\t\t\t\t\t)\r\n\t\t\t\tin\r\n\t\t\t\t\t\'Between\'.concat(connectionName)\r\n\t\t\telse\r\n\t\t\t\t\'\'\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nendif"
		   });		
		addAnnotation
		  (getVisualizer__GetValueForKey__String(), 
		   source, 
		   new String[] {
			 "body", "let keyValueList : Sequence(String) =\r\n\tself.attributes->select(a | a.size() > key.size())->select(a | a.substring(1, key.size()) = key)->asSequence()\r\nin\r\nlet keyValue : String =\r\n\tif (keyValueList->size() > 0) then\r\n\t\tkeyValueList->first()\r\n\telse\r\n\t\t\'\'\r\n\tendif\r\nin\r\nlet indexOfEquals:Integer =\r\n\t--Key not found?\r\n\tif (keyValue <> \'\') then\r\n\t\tSequence{1 .. keyValue.size()}->iterate(i:Integer; index:Integer = -1 | \r\n\t\t\tif (index = -1 and keyValue.substring(i,i) = \'=\') then i else index endif)\r\n\telse\r\n\t\t-1\r\n\tendif\r\nin\r\nlet value:String =\r\n\t--No Equals found in keyValue\r\n\tif(indexOfEquals <> -1) then\r\n\t\tkeyValue.substring(indexOfEquals + 1, keyValue.size())\r\n\telse\r\n\t\t\'\'\r\n\tendif\r\nin\r\nlet valueWithoutLeadingSpace:String = \r\n\t--No value found\r\n\tif (value <> \'\') then\r\n\t\tif (value.substring(1,1) = \' \' and value.size() > 1) then\r\n\t\t\tvalue.substring(2, value.size())\r\n\t\telse\r\n\t\t\tvalue\r\n\t\tendif\r\n\telse\r\n\t\t\'\'\r\n\tendif\r\nin\r\n\tvalueWithoutLeadingSpace"
		   });		
		addAnnotation
		  (getVisualizer__GetElement(), 
		   source, 
		   new String[] {
			 "body", "self.oclAsType(ecore::EObject).eContainer().oclAsType(Element)"
		   });	
	}

} //PLMPackageImpl
