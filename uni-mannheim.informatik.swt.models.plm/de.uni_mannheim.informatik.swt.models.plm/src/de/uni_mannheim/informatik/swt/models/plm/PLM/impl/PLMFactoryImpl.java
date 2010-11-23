/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PLMFactoryImpl extends EFactoryImpl implements PLMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PLMFactory init() {
		try {
			PLMFactory thePLMFactory = (PLMFactory)EPackage.Registry.INSTANCE.getEFactory("http://swt.informatik.uni-mannheim.de/PLM"); 
			if (thePLMFactory != null) {
				return thePLMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PLMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PLMPackage.ELEMENT: return createElement();
			case PLMPackage.ONTOLOGY: return createOntology();
			case PLMPackage.OWNED_ELEMENT: return createOwnedElement();
			case PLMPackage.LOGICAL_ELEMENT: return createLogicalElement();
			case PLMPackage.MODEL: return createModel();
			case PLMPackage.POTENT_ELEMENT: return createPotentElement();
			case PLMPackage.SET_RELATIONSHIP: return createSetRelationship();
			case PLMPackage.GENERALIZATION: return createGeneralization();
			case PLMPackage.INSTANTIATION: return createInstantiation();
			case PLMPackage.COMPLEMENT: return createComplement();
			case PLMPackage.EQUALS: return createEquals();
			case PLMPackage.INVERSION: return createInversion();
			case PLMPackage.BINARY_GENERALIZATION: return createBinaryGeneralization();
			case PLMPackage.MULTIPLE_GENERALIZATION: return createMultipleGeneralization();
			case PLMPackage.MULTIPLE_SPECIALIZATION: return createMultipleSpecialization();
			case PLMPackage.CLABJECT: return createClabject();
			case PLMPackage.FEATURE: return createFeature();
			case PLMPackage.DOMAIN_ENTITY: return createDomainEntity();
			case PLMPackage.DOMAIN_CONNECTION: return createDomainConnection();
			case PLMPackage.FIELD: return createField();
			case PLMPackage.METHOD: return createMethod();
			case PLMPackage.ONTOLOGY_LEVEL: return createOntologyLevel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology createOntology() {
		OntologyImpl ontology = new OntologyImpl();
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnedElement createOwnedElement() {
		OwnedElementImpl ownedElement = new OwnedElementImpl();
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalElement createLogicalElement() {
		LogicalElementImpl logicalElement = new LogicalElementImpl();
		return logicalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentElement createPotentElement() {
		PotentElementImpl potentElement = new PotentElementImpl();
		return potentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetRelationship createSetRelationship() {
		SetRelationshipImpl setRelationship = new SetRelationshipImpl();
		return setRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instantiation createInstantiation() {
		InstantiationImpl instantiation = new InstantiationImpl();
		return instantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complement createComplement() {
		ComplementImpl complement = new ComplementImpl();
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equals createEquals() {
		EqualsImpl equals = new EqualsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inversion createInversion() {
		InversionImpl inversion = new InversionImpl();
		return inversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryGeneralization createBinaryGeneralization() {
		BinaryGeneralizationImpl binaryGeneralization = new BinaryGeneralizationImpl();
		return binaryGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleGeneralization createMultipleGeneralization() {
		MultipleGeneralizationImpl multipleGeneralization = new MultipleGeneralizationImpl();
		return multipleGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSpecialization createMultipleSpecialization() {
		MultipleSpecializationImpl multipleSpecialization = new MultipleSpecializationImpl();
		return multipleSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject createClabject() {
		ClabjectImpl clabject = new ClabjectImpl();
		return clabject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainEntity createDomainEntity() {
		DomainEntityImpl domainEntity = new DomainEntityImpl();
		return domainEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainConnection createDomainConnection() {
		DomainConnectionImpl domainConnection = new DomainConnectionImpl();
		return domainConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyLevel createOntologyLevel() {
		OntologyLevelImpl ontologyLevel = new OntologyLevelImpl();
		return ontologyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLMPackage getPLMPackage() {
		return (PLMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PLMPackage getPackage() {
		return PLMPackage.eINSTANCE;
	}

} //PLMFactoryImpl
