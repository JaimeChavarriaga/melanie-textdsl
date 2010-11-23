/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory
 * @model kind="package"
 * @generated
 */
public interface PLMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PLM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://swt.informatik.uni-mannheim.de/PLM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PLM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PLMPackage eINSTANCE = de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ElementImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EXPRESSED = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__EXPRESSED = ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Ontology Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__ONTOLOGY_LEVELS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OwnedElementImpl <em>Owned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OwnedElementImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getOwnedElement()
	 * @generated
	 */
	int OWNED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ELEMENT__EXPRESSED = ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ELEMENT__OWNER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Owned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LogicalElementImpl <em>Logical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LogicalElementImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getLogicalElement()
	 * @generated
	 */
	int LOGICAL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__NAME = OWNED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__EXPRESSED = OWNED_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__OWNER = OWNED_ELEMENT__OWNER;

	/**
	 * The number of structural features of the '<em>Logical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT_FEATURE_COUNT = OWNED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ModelImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PotentElementImpl <em>Potent Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PotentElementImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getPotentElement()
	 * @generated
	 */
	int POTENT_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENT_ELEMENT__NAME = OWNED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENT_ELEMENT__EXPRESSED = OWNED_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENT_ELEMENT__OWNER = OWNED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENT_ELEMENT__POTENCY = OWNED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Potent Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENT_ELEMENT_FEATURE_COUNT = OWNED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.SetRelationshipImpl <em>Set Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.SetRelationshipImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getSetRelationship()
	 * @generated
	 */
	int SET_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_RELATIONSHIP__NAME = LOGICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_RELATIONSHIP__EXPRESSED = LOGICAL_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_RELATIONSHIP__OWNER = LOGICAL_ELEMENT__OWNER;

	/**
	 * The number of structural features of the '<em>Set Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_RELATIONSHIP_FEATURE_COUNT = LOGICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.GeneralizationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = LOGICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__EXPRESSED = LOGICAL_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNER = LOGICAL_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Mediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__MEDIATE = LOGICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = LOGICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.InstantiationImpl <em>Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.InstantiationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getInstantiation()
	 * @generated
	 */
	int INSTANTIATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__NAME = LOGICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__EXPRESSED = LOGICAL_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__OWNER = LOGICAL_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Indirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__INDIRECT = LOGICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__TARGET_LEVEL = LOGICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__INSTANCE = LOGICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__TYPE = LOGICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_FEATURE_COUNT = LOGICAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ComplementImpl <em>Complement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ComplementImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getComplement()
	 * @generated
	 */
	int COMPLEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__NAME = SET_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__EXPRESSED = SET_RELATIONSHIP__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__OWNER = SET_RELATIONSHIP__OWNER;

	/**
	 * The number of structural features of the '<em>Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_FEATURE_COUNT = SET_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EqualsImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__NAME = SET_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__EXPRESSED = SET_RELATIONSHIP__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__OWNER = SET_RELATIONSHIP__OWNER;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = SET_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.InversionImpl <em>Inversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.InversionImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getInversion()
	 * @generated
	 */
	int INVERSION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION__NAME = SET_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION__EXPRESSED = SET_RELATIONSHIP__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION__OWNER = SET_RELATIONSHIP__OWNER;

	/**
	 * The number of structural features of the '<em>Inversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION_FEATURE_COUNT = SET_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.BinaryGeneralizationImpl <em>Binary Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.BinaryGeneralizationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getBinaryGeneralization()
	 * @generated
	 */
	int BINARY_GENERALIZATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION__NAME = GENERALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION__EXPRESSED = GENERALIZATION__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION__OWNER = GENERALIZATION__OWNER;

	/**
	 * The feature id for the '<em><b>Mediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION__MEDIATE = GENERALIZATION__MEDIATE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION__SUBTYPE = GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION__SUPERTYPE = GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION_FEATURE_COUNT = GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl <em>Multiple Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getMultipleGeneralization()
	 * @generated
	 */
	int MULTIPLE_GENERALIZATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__NAME = GENERALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__EXPRESSED = GENERALIZATION__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__OWNER = GENERALIZATION__OWNER;

	/**
	 * The feature id for the '<em><b>Mediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__MEDIATE = GENERALIZATION__MEDIATE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__SUBTYPE = GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__SUPERTYPE = GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Intersection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__INTERSECTION = GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__UNION = GENERALIZATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multiple Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION_FEATURE_COUNT = GENERALIZATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl <em>Multiple Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getMultipleSpecialization()
	 * @generated
	 */
	int MULTIPLE_SPECIALIZATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__NAME = GENERALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__EXPRESSED = GENERALIZATION__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__OWNER = GENERALIZATION__OWNER;

	/**
	 * The feature id for the '<em><b>Mediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__MEDIATE = GENERALIZATION__MEDIATE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__SUBTYPE = GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__SUPERTYPE = GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__COMPLETE = GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__DISJOINT = GENERALIZATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multiple Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION_FEATURE_COUNT = GENERALIZATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl <em>Clabject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getClabject()
	 * @generated
	 */
	int CLABJECT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__NAME = POTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__EXPRESSED = POTENT_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__OWNER = POTENT_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__POTENCY = POTENT_ELEMENT__POTENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__TYPE = POTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__SUPERTYPE = POTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__ABSTRACT = POTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__LEVEL = POTENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Clabject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT_FEATURE_COUNT = POTENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.FeatureImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = POTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__EXPRESSED = POTENT_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNER = POTENT_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__POTENCY = POTENT_ELEMENT__POTENCY;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = POTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainEntityImpl <em>Domain Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainEntityImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getDomainEntity()
	 * @generated
	 */
	int DOMAIN_ENTITY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__NAME = CLABJECT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__EXPRESSED = CLABJECT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__OWNER = CLABJECT__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__POTENCY = CLABJECT__POTENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__TYPE = CLABJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__SUPERTYPE = CLABJECT__SUPERTYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__ABSTRACT = CLABJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY__LEVEL = CLABJECT__LEVEL;

	/**
	 * The number of structural features of the '<em>Domain Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ENTITY_FEATURE_COUNT = CLABJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainConnectionImpl <em>Domain Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainConnectionImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getDomainConnection()
	 * @generated
	 */
	int DOMAIN_CONNECTION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__NAME = CLABJECT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__EXPRESSED = CLABJECT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__OWNER = CLABJECT__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__POTENCY = CLABJECT__POTENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__TYPE = CLABJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__SUPERTYPE = CLABJECT__SUPERTYPE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__ABSTRACT = CLABJECT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__LEVEL = CLABJECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__PARTICIPANT = CLABJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__ROLE_NAME = CLABJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__LOWER = CLABJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__UPPER = CLABJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Navigable</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__IS_NAVIGABLE = CLABJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION__TRANSITIVE = CLABJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Domain Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONNECTION_FEATURE_COUNT = CLABJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.FieldImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__EXPRESSED = FEATURE__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__POTENCY = FEATURE__POTENCY;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DATATYPE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MethodImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__EXPRESSED = FEATURE__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__POTENCY = FEATURE__POTENCY;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BODY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__INPUT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OUTPUT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyLevelImpl <em>Ontology Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyLevelImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getOntologyLevel()
	 * @generated
	 */
	int ONTOLOGY_LEVEL = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LEVEL__NAME = OWNED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LEVEL__EXPRESSED = OWNED_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LEVEL__OWNER = OWNED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LEVEL__ELEMENTS = OWNED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ontology Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LEVEL_FEATURE_COUNT = OWNED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element#isExpressed <em>Expressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expressed</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Element#isExpressed()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Expressed();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology
	 * @generated
	 */
	EClass getOntology();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology#getOntologyLevels <em>Ontology Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontology Levels</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology#getOntologyLevels()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_OntologyLevels();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.OwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owned Element</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.OwnedElement
	 * @generated
	 */
	EClass getOwnedElement();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.OwnedElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.OwnedElement#getOwner()
	 * @see #getOwnedElement()
	 * @generated
	 */
	EReference getOwnedElement_Owner();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.LogicalElement <em>Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Element</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.LogicalElement
	 * @generated
	 */
	EClass getLogicalElement();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elements</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.PotentElement <em>Potent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potent Element</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PotentElement
	 * @generated
	 */
	EClass getPotentElement();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.PotentElement#getPotency <em>Potency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Potency</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PotentElement#getPotency()
	 * @see #getPotentElement()
	 * @generated
	 */
	EAttribute getPotentElement_Potency();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.SetRelationship <em>Set Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Relationship</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.SetRelationship
	 * @generated
	 */
	EClass getSetRelationship();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#isMediate <em>Mediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mediate</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#isMediate()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_Mediate();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation <em>Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation
	 * @generated
	 */
	EClass getInstantiation();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation#isIndirect <em>Indirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indirect</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation#isIndirect()
	 * @see #getInstantiation()
	 * @generated
	 */
	EAttribute getInstantiation_Indirect();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation#getTargetLevel <em>Target Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Level</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation#getTargetLevel()
	 * @see #getInstantiation()
	 * @generated
	 */
	EAttribute getInstantiation_TargetLevel();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation#getInstance()
	 * @see #getInstantiation()
	 * @generated
	 */
	EReference getInstantiation_Instance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation#getType()
	 * @see #getInstantiation()
	 * @generated
	 */
	EReference getInstantiation_Type();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Complement <em>Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complement</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Complement
	 * @generated
	 */
	EClass getComplement();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion <em>Inversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inversion</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion
	 * @generated
	 */
	EClass getInversion();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization <em>Binary Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Generalization</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization
	 * @generated
	 */
	EClass getBinaryGeneralization();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subtype</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization#getSubtype()
	 * @see #getBinaryGeneralization()
	 * @generated
	 */
	EReference getBinaryGeneralization_Subtype();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supertype</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization#getSupertype()
	 * @see #getBinaryGeneralization()
	 * @generated
	 */
	EReference getBinaryGeneralization_Supertype();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization <em>Multiple Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Generalization</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization
	 * @generated
	 */
	EClass getMultipleGeneralization();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subtype</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#getSubtype()
	 * @see #getMultipleGeneralization()
	 * @generated
	 */
	EReference getMultipleGeneralization_Subtype();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supertype</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#getSupertype()
	 * @see #getMultipleGeneralization()
	 * @generated
	 */
	EReference getMultipleGeneralization_Supertype();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#isIntersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intersection</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#isIntersection()
	 * @see #getMultipleGeneralization()
	 * @generated
	 */
	EAttribute getMultipleGeneralization_Intersection();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#isUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Union</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#isUnion()
	 * @see #getMultipleGeneralization()
	 * @generated
	 */
	EAttribute getMultipleGeneralization_Union();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization <em>Multiple Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Specialization</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization
	 * @generated
	 */
	EClass getMultipleSpecialization();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtype</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#getSubtype()
	 * @see #getMultipleSpecialization()
	 * @generated
	 */
	EReference getMultipleSpecialization_Subtype();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supertype</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#getSupertype()
	 * @see #getMultipleSpecialization()
	 * @generated
	 */
	EReference getMultipleSpecialization_Supertype();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#isComplete <em>Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#isComplete()
	 * @see #getMultipleSpecialization()
	 * @generated
	 */
	EAttribute getMultipleSpecialization_Complete();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#isDisjoint <em>Disjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disjoint</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#isDisjoint()
	 * @see #getMultipleSpecialization()
	 * @generated
	 */
	EAttribute getMultipleSpecialization_Disjoint();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject <em>Clabject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clabject</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject
	 * @generated
	 */
	EClass getClabject();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getType()
	 * @see #getClabject()
	 * @generated
	 */
	EReference getClabject_Type();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supertype</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getSupertype()
	 * @see #getClabject()
	 * @generated
	 */
	EReference getClabject_Supertype();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isAbstract()
	 * @see #getClabject()
	 * @generated
	 */
	EAttribute getClabject_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getLevel()
	 * @see #getClabject()
	 * @generated
	 */
	EAttribute getClabject_Level();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity <em>Domain Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Entity</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity
	 * @generated
	 */
	EClass getDomainEntity();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection <em>Domain Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Connection</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection
	 * @generated
	 */
	EClass getDomainConnection();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getParticipant()
	 * @see #getDomainConnection()
	 * @generated
	 */
	EReference getDomainConnection_Participant();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role Name</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getRoleName()
	 * @see #getDomainConnection()
	 * @generated
	 */
	EAttribute getDomainConnection_RoleName();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lower</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getLower()
	 * @see #getDomainConnection()
	 * @generated
	 */
	EAttribute getDomainConnection_Lower();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Upper</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getUpper()
	 * @see #getDomainConnection()
	 * @generated
	 */
	EAttribute getDomainConnection_Upper();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getIsNavigable <em>Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Is Navigable</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#getIsNavigable()
	 * @see #getDomainConnection()
	 * @generated
	 */
	EAttribute getDomainConnection_IsNavigable();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#isTransitive <em>Transitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitive</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection#isTransitive()
	 * @see #getDomainConnection()
	 * @generated
	 */
	EAttribute getDomainConnection_Transitive();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Field#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Field#getDatatype()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Datatype();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Field#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Field#getValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Value();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Method#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Method#getBody()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Body();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Method#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Method#getInput()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Input();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Method#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Method#getOutput()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Output();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.OntologyLevel <em>Ontology Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology Level</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.OntologyLevel
	 * @generated
	 */
	EClass getOntologyLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.OntologyLevel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.OntologyLevel#getElements()
	 * @see #getOntologyLevel()
	 * @generated
	 */
	EReference getOntologyLevel_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PLMFactory getPLMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ElementImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Expressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__EXPRESSED = eINSTANCE.getElement_Expressed();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyImpl <em>Ontology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getOntology()
		 * @generated
		 */
		EClass ONTOLOGY = eINSTANCE.getOntology();

		/**
		 * The meta object literal for the '<em><b>Ontology Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__ONTOLOGY_LEVELS = eINSTANCE.getOntology_OntologyLevels();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OwnedElementImpl <em>Owned Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OwnedElementImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getOwnedElement()
		 * @generated
		 */
		EClass OWNED_ELEMENT = eINSTANCE.getOwnedElement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNED_ELEMENT__OWNER = eINSTANCE.getOwnedElement_Owner();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LogicalElementImpl <em>Logical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LogicalElementImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getLogicalElement()
		 * @generated
		 */
		EClass LOGICAL_ELEMENT = eINSTANCE.getLogicalElement();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ModelImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PotentElementImpl <em>Potent Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PotentElementImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getPotentElement()
		 * @generated
		 */
		EClass POTENT_ELEMENT = eINSTANCE.getPotentElement();

		/**
		 * The meta object literal for the '<em><b>Potency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POTENT_ELEMENT__POTENCY = eINSTANCE.getPotentElement_Potency();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.SetRelationshipImpl <em>Set Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.SetRelationshipImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getSetRelationship()
		 * @generated
		 */
		EClass SET_RELATIONSHIP = eINSTANCE.getSetRelationship();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.GeneralizationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Mediate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__MEDIATE = eINSTANCE.getGeneralization_Mediate();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.InstantiationImpl <em>Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.InstantiationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getInstantiation()
		 * @generated
		 */
		EClass INSTANTIATION = eINSTANCE.getInstantiation();

		/**
		 * The meta object literal for the '<em><b>Indirect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANTIATION__INDIRECT = eINSTANCE.getInstantiation_Indirect();

		/**
		 * The meta object literal for the '<em><b>Target Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANTIATION__TARGET_LEVEL = eINSTANCE.getInstantiation_TargetLevel();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION__INSTANCE = eINSTANCE.getInstantiation_Instance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION__TYPE = eINSTANCE.getInstantiation_Type();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ComplementImpl <em>Complement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ComplementImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getComplement()
		 * @generated
		 */
		EClass COMPLEMENT = eINSTANCE.getComplement();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EqualsImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.InversionImpl <em>Inversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.InversionImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getInversion()
		 * @generated
		 */
		EClass INVERSION = eINSTANCE.getInversion();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.BinaryGeneralizationImpl <em>Binary Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.BinaryGeneralizationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getBinaryGeneralization()
		 * @generated
		 */
		EClass BINARY_GENERALIZATION = eINSTANCE.getBinaryGeneralization();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_GENERALIZATION__SUBTYPE = eINSTANCE.getBinaryGeneralization_Subtype();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_GENERALIZATION__SUPERTYPE = eINSTANCE.getBinaryGeneralization_Supertype();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl <em>Multiple Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getMultipleGeneralization()
		 * @generated
		 */
		EClass MULTIPLE_GENERALIZATION = eINSTANCE.getMultipleGeneralization();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_GENERALIZATION__SUBTYPE = eINSTANCE.getMultipleGeneralization_Subtype();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_GENERALIZATION__SUPERTYPE = eINSTANCE.getMultipleGeneralization_Supertype();

		/**
		 * The meta object literal for the '<em><b>Intersection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_GENERALIZATION__INTERSECTION = eINSTANCE.getMultipleGeneralization_Intersection();

		/**
		 * The meta object literal for the '<em><b>Union</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_GENERALIZATION__UNION = eINSTANCE.getMultipleGeneralization_Union();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl <em>Multiple Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getMultipleSpecialization()
		 * @generated
		 */
		EClass MULTIPLE_SPECIALIZATION = eINSTANCE.getMultipleSpecialization();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_SPECIALIZATION__SUBTYPE = eINSTANCE.getMultipleSpecialization_Subtype();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_SPECIALIZATION__SUPERTYPE = eINSTANCE.getMultipleSpecialization_Supertype();

		/**
		 * The meta object literal for the '<em><b>Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_SPECIALIZATION__COMPLETE = eINSTANCE.getMultipleSpecialization_Complete();

		/**
		 * The meta object literal for the '<em><b>Disjoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_SPECIALIZATION__DISJOINT = eINSTANCE.getMultipleSpecialization_Disjoint();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl <em>Clabject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getClabject()
		 * @generated
		 */
		EClass CLABJECT = eINSTANCE.getClabject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLABJECT__TYPE = eINSTANCE.getClabject_Type();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLABJECT__SUPERTYPE = eINSTANCE.getClabject_Supertype();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLABJECT__ABSTRACT = eINSTANCE.getClabject_Abstract();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLABJECT__LEVEL = eINSTANCE.getClabject_Level();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.FeatureImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainEntityImpl <em>Domain Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainEntityImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getDomainEntity()
		 * @generated
		 */
		EClass DOMAIN_ENTITY = eINSTANCE.getDomainEntity();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainConnectionImpl <em>Domain Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainConnectionImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getDomainConnection()
		 * @generated
		 */
		EClass DOMAIN_CONNECTION = eINSTANCE.getDomainConnection();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONNECTION__PARTICIPANT = eINSTANCE.getDomainConnection_Participant();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_CONNECTION__ROLE_NAME = eINSTANCE.getDomainConnection_RoleName();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_CONNECTION__LOWER = eINSTANCE.getDomainConnection_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_CONNECTION__UPPER = eINSTANCE.getDomainConnection_Upper();

		/**
		 * The meta object literal for the '<em><b>Is Navigable</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_CONNECTION__IS_NAVIGABLE = eINSTANCE.getDomainConnection_IsNavigable();

		/**
		 * The meta object literal for the '<em><b>Transitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_CONNECTION__TRANSITIVE = eINSTANCE.getDomainConnection_Transitive();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.FieldImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__DATATYPE = eINSTANCE.getField_Datatype();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__VALUE = eINSTANCE.getField_Value();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MethodImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__BODY = eINSTANCE.getMethod_Body();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__INPUT = eINSTANCE.getMethod_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__OUTPUT = eINSTANCE.getMethod_Output();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyLevelImpl <em>Ontology Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyLevelImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getOntologyLevel()
		 * @generated
		 */
		EClass ONTOLOGY_LEVEL = eINSTANCE.getOntologyLevel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY_LEVEL__ELEMENTS = eINSTANCE.getOntologyLevel_Elements();

	}

} //PLMPackage
