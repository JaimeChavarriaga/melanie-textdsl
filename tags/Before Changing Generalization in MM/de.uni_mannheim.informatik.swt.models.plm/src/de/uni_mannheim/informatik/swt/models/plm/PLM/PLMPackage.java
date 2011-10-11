/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
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
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LMLModelImpl <em>LML Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LMLModelImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getLMLModel()
	 * @generated
	 */
	int LML_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LML_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LML_MODEL__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>LML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LML_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>LML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LML_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ElementImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RELEVANT = 2;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VISUALIZER = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OwnedElementImpl <em>Owned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OwnedElementImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getOwnedElement()
	 * @generated
	 */
	int OWNED_ELEMENT = 5;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ELEMENT__RELEVANT = ELEMENT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ELEMENT__VISUALIZER = ELEMENT__VISUALIZER;

	/**
	 * The number of structural features of the '<em>Owned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Owned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainElementImpl <em>Domain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainElementImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getDomainElement()
	 * @generated
	 */
	int DOMAIN_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__NAME = OWNED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__EXPRESSED = OWNED_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__RELEVANT = OWNED_ELEMENT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__VISUALIZER = OWNED_ELEMENT__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Elided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__ELIDED = OWNED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_FEATURE_COUNT = OWNED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_OPERATION_COUNT = OWNED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ModelImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EXPRESSED = ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RELEVANT = ELEMENT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VISUALIZER = ELEMENT__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ORIGIN = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visualizers Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VISUALIZERS_SHOWN = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Completness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMPLETNESS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTENT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get All Generalizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_ALL_GENERALIZATIONS = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Set Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_ALL_SET_RELATIONSHIPS = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Clabjects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_ALL_CLABJECTS = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_ALL_ENTITIES = ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_ALL_CONNECTIONS = ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get All Classifications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_ALL_CLASSIFICATIONS = ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Ontology</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_ONTOLOGY = ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Classified Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_CLASSIFIED_MODEL = ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Classifying Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_CLASSIFYING_MODEL = ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_LEVEL = ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Root Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___IS_ROOT_MODEL = ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Leaf Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___IS_LEAF_MODEL = ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyImpl <em>Ontology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getOntology()
	 * @generated
	 */
	int ONTOLOGY = 4;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__RELEVANT = ELEMENT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__VISUALIZER = ELEMENT__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__ORIGIN = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visualizers Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__VISUALIZERS_SHOWN = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Completness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__COMPLETNESS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY__CONTENT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Model At Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY___GET_MODEL_AT_LEVEL__INT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ontology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LogicalElementImpl <em>Logical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LogicalElementImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getLogicalElement()
	 * @generated
	 */
	int LOGICAL_ELEMENT = 6;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__RELEVANT = OWNED_ELEMENT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__VISUALIZER = OWNED_ELEMENT__VISUALIZER;

	/**
	 * The number of structural features of the '<em>Logical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT_FEATURE_COUNT = OWNED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT___GET_MODEL = OWNED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT_OPERATION_COUNT = OWNED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.SetRelationshipImpl <em>Set Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.SetRelationshipImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getSetRelationship()
	 * @generated
	 */
	int SET_RELATIONSHIP = 7;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_RELATIONSHIP__RELEVANT = LOGICAL_ELEMENT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_RELATIONSHIP__VISUALIZER = LOGICAL_ELEMENT__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_RELATIONSHIP__BASE = LOGICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_RELATIONSHIP_FEATURE_COUNT = LOGICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_RELATIONSHIP___GET_MODEL = LOGICAL_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_RELATIONSHIP___GET_TARGET = LOGICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_RELATIONSHIP_OPERATION_COUNT = LOGICAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EqualityImpl <em>Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EqualityImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getEquality()
	 * @generated
	 */
	int EQUALITY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__NAME = SET_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__EXPRESSED = SET_RELATIONSHIP__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__RELEVANT = SET_RELATIONSHIP__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__VISUALIZER = SET_RELATIONSHIP__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__BASE = SET_RELATIONSHIP__BASE;

	/**
	 * The feature id for the '<em><b>Equal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__EQUAL = SET_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FEATURE_COUNT = SET_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY___GET_MODEL = SET_RELATIONSHIP___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY___GET_TARGET = SET_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATION_COUNT = SET_RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.InversionImpl <em>Inversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.InversionImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getInversion()
	 * @generated
	 */
	int INVERSION = 9;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION__RELEVANT = SET_RELATIONSHIP__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION__VISUALIZER = SET_RELATIONSHIP__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION__BASE = SET_RELATIONSHIP__BASE;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION__INVERSE = SET_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION_FEATURE_COUNT = SET_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION___GET_MODEL = SET_RELATIONSHIP___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION___GET_TARGET = SET_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSION_OPERATION_COUNT = SET_RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ComplementImpl <em>Complement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ComplementImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getComplement()
	 * @generated
	 */
	int COMPLEMENT = 10;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__RELEVANT = SET_RELATIONSHIP__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__VISUALIZER = SET_RELATIONSHIP__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__BASE = SET_RELATIONSHIP__BASE;

	/**
	 * The feature id for the '<em><b>Complement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT__COMPLEMENT = SET_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_FEATURE_COUNT = SET_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_MODEL = SET_RELATIONSHIP___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT___GET_TARGET = SET_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENT_OPERATION_COUNT = SET_RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.GeneralizationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 11;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__RELEVANT = LOGICAL_ELEMENT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__VISUALIZER = LOGICAL_ELEMENT__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Discriminant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__DISCRIMINANT = LOGICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = LOGICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___GET_MODEL = LOGICAL_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Supertypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___GET_SUPERTYPES = LOGICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Subtypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___GET_SUBTYPES = LOGICAL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = LOGICAL_ELEMENT_OPERATION_COUNT + 2;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION__RELEVANT = GENERALIZATION__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION__VISUALIZER = GENERALIZATION__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Discriminant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION__DISCRIMINANT = GENERALIZATION__DISCRIMINANT;

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
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION___GET_MODEL = GENERALIZATION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Supertypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION___GET_SUPERTYPES = GENERALIZATION___GET_SUPERTYPES;

	/**
	 * The operation id for the '<em>Get Subtypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION___GET_SUBTYPES = GENERALIZATION___GET_SUBTYPES;

	/**
	 * The number of operations of the '<em>Binary Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_GENERALIZATION_OPERATION_COUNT = GENERALIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl <em>Multiple Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getMultipleSpecialization()
	 * @generated
	 */
	int MULTIPLE_SPECIALIZATION = 13;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__RELEVANT = GENERALIZATION__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__VISUALIZER = GENERALIZATION__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Discriminant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__DISCRIMINANT = GENERALIZATION__DISCRIMINANT;

	/**
	 * The feature id for the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__COMPLETE = GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__DISJOINT = GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__SUBTYPE = GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION__SUPERTYPE = GENERALIZATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multiple Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION_FEATURE_COUNT = GENERALIZATION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION___GET_MODEL = GENERALIZATION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Supertypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION___GET_SUPERTYPES = GENERALIZATION___GET_SUPERTYPES;

	/**
	 * The operation id for the '<em>Get Subtypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION___GET_SUBTYPES = GENERALIZATION___GET_SUBTYPES;

	/**
	 * The number of operations of the '<em>Multiple Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SPECIALIZATION_OPERATION_COUNT = GENERALIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl <em>Multiple Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getMultipleGeneralization()
	 * @generated
	 */
	int MULTIPLE_GENERALIZATION = 14;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__RELEVANT = GENERALIZATION__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__VISUALIZER = GENERALIZATION__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Discriminant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__DISCRIMINANT = GENERALIZATION__DISCRIMINANT;

	/**
	 * The feature id for the '<em><b>Intersection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__INTERSECTION = GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__SUBTYPE = GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION__SUPERTYPE = GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiple Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION_FEATURE_COUNT = GENERALIZATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION___GET_MODEL = GENERALIZATION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Supertypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION___GET_SUPERTYPES = GENERALIZATION___GET_SUPERTYPES;

	/**
	 * The operation id for the '<em>Get Subtypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION___GET_SUBTYPES = GENERALIZATION___GET_SUBTYPES;

	/**
	 * The number of operations of the '<em>Multiple Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GENERALIZATION_OPERATION_COUNT = GENERALIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClassificationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__NAME = LOGICAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__EXPRESSED = LOGICAL_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__RELEVANT = LOGICAL_ELEMENT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__VISUALIZER = LOGICAL_ELEMENT__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__INSTANCE = LOGICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__TYPE = LOGICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__KIND = LOGICAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = LOGICAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_MODEL = LOGICAL_ELEMENT___GET_MODEL;

	/**
	 * The number of operations of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_OPERATION_COUNT = LOGICAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl <em>Clabject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getClabject()
	 * @generated
	 */
	int CLABJECT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__EXPRESSED = DOMAIN_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__RELEVANT = DOMAIN_ELEMENT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__VISUALIZER = DOMAIN_ELEMENT__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Elided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__ELIDED = DOMAIN_ELEMENT__ELIDED;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__ORIGIN = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visualizers Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__VISUALIZERS_SHOWN = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instantiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__INSTANTIABLE = DOMAIN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__POTENCY = DOMAIN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__LEVEL = DOMAIN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__CONTENT = DOMAIN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT__FEATURE = DOMAIN_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Clabject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>All Instances From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___ALL_INSTANCES_FROM__STRING = DOMAIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL = DOMAIN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Model Supertypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL_SUPERTYPES = DOMAIN_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Model Subtypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL_SUBTYPES = DOMAIN_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Model Classifications As Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_INSTANCE = DOMAIN_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Model Classifications As Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_TYPE = DOMAIN_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Model Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL_INSTANCES = DOMAIN_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Model Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL_TYPES = DOMAIN_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_ALL_FEATURES = DOMAIN_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_ALL_ATTRIBUTES = DOMAIN_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get All Methods</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_ALL_METHODS = DOMAIN_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Model Instance Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___IS_MODEL_INSTANCE_OF__CLABJECT = DOMAIN_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Model Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___IS_MODEL_TYPE_OF__CLABJECT = DOMAIN_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Eigen Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_EIGEN_CONNECTIONS = DOMAIN_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get All Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_ALL_CONNECTIONS = DOMAIN_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Inherited Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_INHERITED_CONNECTIONS = DOMAIN_ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Eigen Associates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_EIGEN_ASSOCIATES = DOMAIN_ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Inherited Associates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_INHERITED_ASSOCIATES = DOMAIN_ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get All Associates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_ALL_ASSOCIATES = DOMAIN_ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Eigen Associate Role Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_EIGEN_ASSOCIATE_ROLE_NAMES = DOMAIN_ELEMENT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get All Associate Role Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_ALL_ASSOCIATE_ROLE_NAMES = DOMAIN_ELEMENT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Inherited Associate Role Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_INHERITED_ASSOCIATE_ROLE_NAMES = DOMAIN_ELEMENT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Eigen Associates For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_EIGEN_ASSOCIATES_FOR_ROLE_NAME__STRING = DOMAIN_ELEMENT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Inherited Associates For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_INHERITED_ASSOCIATES_FOR_ROLE_NAME__STRING = DOMAIN_ELEMENT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get All Associates For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_ALL_ASSOCIATES_FOR_ROLE_NAME__STRING = DOMAIN_ELEMENT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Model Complete Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL_COMPLETE_TYPES = DOMAIN_ELEMENT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Model Incomplete Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL_INCOMPLETE_TYPES = DOMAIN_ELEMENT_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Blueprint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_BLUEPRINT = DOMAIN_ELEMENT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Model Offspring</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL_OFFSPRING = DOMAIN_ELEMENT_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Model Isonyms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL_ISONYMS = DOMAIN_ELEMENT_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Model Hyponyms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_MODEL_HYPONYMS = DOMAIN_ELEMENT_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Get Domain For Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_DOMAIN_FOR_CONNECTION__CONNECTION = DOMAIN_ELEMENT_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Get Possible Domain Specific Visualizers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT___GET_POSSIBLE_DOMAIN_SPECIFIC_VISUALIZERS = DOMAIN_ELEMENT_OPERATION_COUNT + 32;

	/**
	 * The number of operations of the '<em>Clabject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLABJECT_OPERATION_COUNT = DOMAIN_ELEMENT_OPERATION_COUNT + 33;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.FeatureImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__EXPRESSED = DOMAIN_ELEMENT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__RELEVANT = DOMAIN_ELEMENT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VISUALIZER = DOMAIN_ELEMENT__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Elided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ELIDED = DOMAIN_ELEMENT__ELIDED;

	/**
	 * The feature id for the '<em><b>Durability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DURABILITY = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Clabject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___GET_CLABJECT = DOMAIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = DOMAIN_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EntityImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = CLABJECT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXPRESSED = CLABJECT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELEVANT = CLABJECT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VISUALIZER = CLABJECT__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Elided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ELIDED = CLABJECT__ELIDED;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ORIGIN = CLABJECT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Visualizers Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VISUALIZERS_SHOWN = CLABJECT__VISUALIZERS_SHOWN;

	/**
	 * The feature id for the '<em><b>Instantiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INSTANTIABLE = CLABJECT__INSTANTIABLE;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POTENCY = CLABJECT__POTENCY;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LEVEL = CLABJECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONTENT = CLABJECT__CONTENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FEATURE = CLABJECT__FEATURE;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = CLABJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Instances From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ALL_INSTANCES_FROM__STRING = CLABJECT___ALL_INSTANCES_FROM__STRING;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL = CLABJECT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Model Supertypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL_SUPERTYPES = CLABJECT___GET_MODEL_SUPERTYPES;

	/**
	 * The operation id for the '<em>Get Model Subtypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL_SUBTYPES = CLABJECT___GET_MODEL_SUBTYPES;

	/**
	 * The operation id for the '<em>Get Model Classifications As Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL_CLASSIFICATIONS_AS_INSTANCE = CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_INSTANCE;

	/**
	 * The operation id for the '<em>Get Model Classifications As Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL_CLASSIFICATIONS_AS_TYPE = CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_TYPE;

	/**
	 * The operation id for the '<em>Get Model Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL_INSTANCES = CLABJECT___GET_MODEL_INSTANCES;

	/**
	 * The operation id for the '<em>Get Model Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL_TYPES = CLABJECT___GET_MODEL_TYPES;

	/**
	 * The operation id for the '<em>Get All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_ALL_FEATURES = CLABJECT___GET_ALL_FEATURES;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_ALL_ATTRIBUTES = CLABJECT___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Methods</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_ALL_METHODS = CLABJECT___GET_ALL_METHODS;

	/**
	 * The operation id for the '<em>Is Model Instance Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___IS_MODEL_INSTANCE_OF__CLABJECT = CLABJECT___IS_MODEL_INSTANCE_OF__CLABJECT;

	/**
	 * The operation id for the '<em>Is Model Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___IS_MODEL_TYPE_OF__CLABJECT = CLABJECT___IS_MODEL_TYPE_OF__CLABJECT;

	/**
	 * The operation id for the '<em>Get Eigen Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_EIGEN_CONNECTIONS = CLABJECT___GET_EIGEN_CONNECTIONS;

	/**
	 * The operation id for the '<em>Get All Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_ALL_CONNECTIONS = CLABJECT___GET_ALL_CONNECTIONS;

	/**
	 * The operation id for the '<em>Get Inherited Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_INHERITED_CONNECTIONS = CLABJECT___GET_INHERITED_CONNECTIONS;

	/**
	 * The operation id for the '<em>Get Eigen Associates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_EIGEN_ASSOCIATES = CLABJECT___GET_EIGEN_ASSOCIATES;

	/**
	 * The operation id for the '<em>Get Inherited Associates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_INHERITED_ASSOCIATES = CLABJECT___GET_INHERITED_ASSOCIATES;

	/**
	 * The operation id for the '<em>Get All Associates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_ALL_ASSOCIATES = CLABJECT___GET_ALL_ASSOCIATES;

	/**
	 * The operation id for the '<em>Get Eigen Associate Role Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_EIGEN_ASSOCIATE_ROLE_NAMES = CLABJECT___GET_EIGEN_ASSOCIATE_ROLE_NAMES;

	/**
	 * The operation id for the '<em>Get All Associate Role Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_ALL_ASSOCIATE_ROLE_NAMES = CLABJECT___GET_ALL_ASSOCIATE_ROLE_NAMES;

	/**
	 * The operation id for the '<em>Get Inherited Associate Role Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_INHERITED_ASSOCIATE_ROLE_NAMES = CLABJECT___GET_INHERITED_ASSOCIATE_ROLE_NAMES;

	/**
	 * The operation id for the '<em>Get Eigen Associates For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_EIGEN_ASSOCIATES_FOR_ROLE_NAME__STRING = CLABJECT___GET_EIGEN_ASSOCIATES_FOR_ROLE_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Inherited Associates For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_INHERITED_ASSOCIATES_FOR_ROLE_NAME__STRING = CLABJECT___GET_INHERITED_ASSOCIATES_FOR_ROLE_NAME__STRING;

	/**
	 * The operation id for the '<em>Get All Associates For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_ALL_ASSOCIATES_FOR_ROLE_NAME__STRING = CLABJECT___GET_ALL_ASSOCIATES_FOR_ROLE_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Model Complete Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL_COMPLETE_TYPES = CLABJECT___GET_MODEL_COMPLETE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Incomplete Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL_INCOMPLETE_TYPES = CLABJECT___GET_MODEL_INCOMPLETE_TYPES;

	/**
	 * The operation id for the '<em>Get Blueprint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_BLUEPRINT = CLABJECT___GET_BLUEPRINT;

	/**
	 * The operation id for the '<em>Get Model Offspring</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL_OFFSPRING = CLABJECT___GET_MODEL_OFFSPRING;

	/**
	 * The operation id for the '<em>Get Model Isonyms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL_ISONYMS = CLABJECT___GET_MODEL_ISONYMS;

	/**
	 * The operation id for the '<em>Get Model Hyponyms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_MODEL_HYPONYMS = CLABJECT___GET_MODEL_HYPONYMS;

	/**
	 * The operation id for the '<em>Get Domain For Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_DOMAIN_FOR_CONNECTION__CONNECTION = CLABJECT___GET_DOMAIN_FOR_CONNECTION__CONNECTION;

	/**
	 * The operation id for the '<em>Get Possible Domain Specific Visualizers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___GET_POSSIBLE_DOMAIN_SPECIFIC_VISUALIZERS = CLABJECT___GET_POSSIBLE_DOMAIN_SPECIFIC_VISUALIZERS;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = CLABJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ConnectionImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = CLABJECT__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__EXPRESSED = CLABJECT__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__RELEVANT = CLABJECT__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__VISUALIZER = CLABJECT__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Elided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ELIDED = CLABJECT__ELIDED;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ORIGIN = CLABJECT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Visualizers Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__VISUALIZERS_SHOWN = CLABJECT__VISUALIZERS_SHOWN;

	/**
	 * The feature id for the '<em><b>Instantiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__INSTANTIABLE = CLABJECT__INSTANTIABLE;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__POTENCY = CLABJECT__POTENCY;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LEVEL = CLABJECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONTENT = CLABJECT__CONTENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FEATURE = CLABJECT__FEATURE;

	/**
	 * The feature id for the '<em><b>Transitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TRANSITIVE = CLABJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LOWER = CLABJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__UPPER = CLABJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Navigable</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IS_NAVIGABLE = CLABJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PARTICIPANT = CLABJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ROLE_NAME = CLABJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = CLABJECT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>All Instances From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___ALL_INSTANCES_FROM__STRING = CLABJECT___ALL_INSTANCES_FROM__STRING;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL = CLABJECT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Model Supertypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL_SUPERTYPES = CLABJECT___GET_MODEL_SUPERTYPES;

	/**
	 * The operation id for the '<em>Get Model Subtypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL_SUBTYPES = CLABJECT___GET_MODEL_SUBTYPES;

	/**
	 * The operation id for the '<em>Get Model Classifications As Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL_CLASSIFICATIONS_AS_INSTANCE = CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_INSTANCE;

	/**
	 * The operation id for the '<em>Get Model Classifications As Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL_CLASSIFICATIONS_AS_TYPE = CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_TYPE;

	/**
	 * The operation id for the '<em>Get Model Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL_INSTANCES = CLABJECT___GET_MODEL_INSTANCES;

	/**
	 * The operation id for the '<em>Get Model Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL_TYPES = CLABJECT___GET_MODEL_TYPES;

	/**
	 * The operation id for the '<em>Get All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_ALL_FEATURES = CLABJECT___GET_ALL_FEATURES;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_ALL_ATTRIBUTES = CLABJECT___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Methods</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_ALL_METHODS = CLABJECT___GET_ALL_METHODS;

	/**
	 * The operation id for the '<em>Is Model Instance Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___IS_MODEL_INSTANCE_OF__CLABJECT = CLABJECT___IS_MODEL_INSTANCE_OF__CLABJECT;

	/**
	 * The operation id for the '<em>Is Model Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___IS_MODEL_TYPE_OF__CLABJECT = CLABJECT___IS_MODEL_TYPE_OF__CLABJECT;

	/**
	 * The operation id for the '<em>Get Eigen Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_EIGEN_CONNECTIONS = CLABJECT___GET_EIGEN_CONNECTIONS;

	/**
	 * The operation id for the '<em>Get All Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_ALL_CONNECTIONS = CLABJECT___GET_ALL_CONNECTIONS;

	/**
	 * The operation id for the '<em>Get Inherited Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_INHERITED_CONNECTIONS = CLABJECT___GET_INHERITED_CONNECTIONS;

	/**
	 * The operation id for the '<em>Get Eigen Associates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_EIGEN_ASSOCIATES = CLABJECT___GET_EIGEN_ASSOCIATES;

	/**
	 * The operation id for the '<em>Get Inherited Associates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_INHERITED_ASSOCIATES = CLABJECT___GET_INHERITED_ASSOCIATES;

	/**
	 * The operation id for the '<em>Get All Associates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_ALL_ASSOCIATES = CLABJECT___GET_ALL_ASSOCIATES;

	/**
	 * The operation id for the '<em>Get Eigen Associate Role Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_EIGEN_ASSOCIATE_ROLE_NAMES = CLABJECT___GET_EIGEN_ASSOCIATE_ROLE_NAMES;

	/**
	 * The operation id for the '<em>Get All Associate Role Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_ALL_ASSOCIATE_ROLE_NAMES = CLABJECT___GET_ALL_ASSOCIATE_ROLE_NAMES;

	/**
	 * The operation id for the '<em>Get Inherited Associate Role Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_INHERITED_ASSOCIATE_ROLE_NAMES = CLABJECT___GET_INHERITED_ASSOCIATE_ROLE_NAMES;

	/**
	 * The operation id for the '<em>Get Eigen Associates For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_EIGEN_ASSOCIATES_FOR_ROLE_NAME__STRING = CLABJECT___GET_EIGEN_ASSOCIATES_FOR_ROLE_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Inherited Associates For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_INHERITED_ASSOCIATES_FOR_ROLE_NAME__STRING = CLABJECT___GET_INHERITED_ASSOCIATES_FOR_ROLE_NAME__STRING;

	/**
	 * The operation id for the '<em>Get All Associates For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_ALL_ASSOCIATES_FOR_ROLE_NAME__STRING = CLABJECT___GET_ALL_ASSOCIATES_FOR_ROLE_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Model Complete Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL_COMPLETE_TYPES = CLABJECT___GET_MODEL_COMPLETE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Incomplete Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL_INCOMPLETE_TYPES = CLABJECT___GET_MODEL_INCOMPLETE_TYPES;

	/**
	 * The operation id for the '<em>Get Blueprint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_BLUEPRINT = CLABJECT___GET_BLUEPRINT;

	/**
	 * The operation id for the '<em>Get Model Offspring</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL_OFFSPRING = CLABJECT___GET_MODEL_OFFSPRING;

	/**
	 * The operation id for the '<em>Get Model Isonyms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL_ISONYMS = CLABJECT___GET_MODEL_ISONYMS;

	/**
	 * The operation id for the '<em>Get Model Hyponyms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_MODEL_HYPONYMS = CLABJECT___GET_MODEL_HYPONYMS;

	/**
	 * The operation id for the '<em>Get Domain For Connection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_DOMAIN_FOR_CONNECTION__CONNECTION = CLABJECT___GET_DOMAIN_FOR_CONNECTION__CONNECTION;

	/**
	 * The operation id for the '<em>Get Possible Domain Specific Visualizers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_POSSIBLE_DOMAIN_SPECIFIC_VISUALIZERS = CLABJECT___GET_POSSIBLE_DOMAIN_SPECIFIC_VISUALIZERS;

	/**
	 * The operation id for the '<em>Get Participant For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_PARTICIPANT_FOR_ROLE_NAME__STRING = CLABJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Role Name For Participant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_ROLE_NAME_FOR_PARTICIPANT__CLABJECT = CLABJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Navigable For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___IS_NAVIGABLE_FOR_ROLE_NAME__STRING = CLABJECT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Lower For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_LOWER_FOR_ROLE_NAME__STRING = CLABJECT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Upper For Role Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_UPPER_FOR_ROLE_NAME__STRING = CLABJECT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_DOMAIN = CLABJECT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Not Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_NOT_DOMAIN = CLABJECT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Human Readable Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_HUMAN_READABLE_NAME = CLABJECT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = CLABJECT_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizerImpl <em>Visualizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizerImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getVisualizer()
	 * @generated
	 */
	int VISUALIZER = 20;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Durability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER__DURABILITY = 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER__TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER__CHILD = 3;

	/**
	 * The number of structural features of the '<em>Visualizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Value For Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER___GET_VALUE_FOR_KEY__STRING = 0;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER___GET_ELEMENT = 1;

	/**
	 * The number of operations of the '<em>Visualizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.AttributeImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Expressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__EXPRESSED = FEATURE__EXPRESSED;

	/**
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__RELEVANT = FEATURE__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISUALIZER = FEATURE__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Elided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ELIDED = FEATURE__ELIDED;

	/**
	 * The feature id for the '<em><b>Durability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DURABILITY = FEATURE__DURABILITY;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATATYPE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mutability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MUTABILITY = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Clabject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___GET_CLABJECT = FEATURE___GET_CLABJECT;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MethodImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 22;

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
	 * The feature id for the '<em><b>Relevant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RELEVANT = FEATURE__RELEVANT;

	/**
	 * The feature id for the '<em><b>Visualizer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISUALIZER = FEATURE__VISUALIZER;

	/**
	 * The feature id for the '<em><b>Elided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ELIDED = FEATURE__ELIDED;

	/**
	 * The feature id for the '<em><b>Durability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DURABILITY = FEATURE__DURABILITY;

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
	 * The operation id for the '<em>Get Clabject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___GET_CLABJECT = FEATURE___GET_CLABJECT;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizationContainerImpl <em>Visualization Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizationContainerImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getVisualizationContainer()
	 * @generated
	 */
	int VISUALIZATION_CONTAINER = 23;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_CONTAINER__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Visualizers Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN = 1;

	/**
	 * The number of structural features of the '<em>Visualization Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Visualization Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.TopLevelVisualizationContainerImpl <em>Top Level Visualization Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.TopLevelVisualizationContainerImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getTopLevelVisualizationContainer()
	 * @generated
	 */
	int TOP_LEVEL_VISUALIZATION_CONTAINER = 24;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_VISUALIZATION_CONTAINER__ORIGIN = VISUALIZATION_CONTAINER__ORIGIN;

	/**
	 * The feature id for the '<em><b>Visualizers Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN = VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN;

	/**
	 * The feature id for the '<em><b>Completness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS = VISUALIZATION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Top Level Visualization Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_VISUALIZATION_CONTAINER_FEATURE_COUNT = VISUALIZATION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Top Level Visualization Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_VISUALIZATION_CONTAINER_OPERATION_COUNT = VISUALIZATION_CONTAINER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind <em>Classification Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getClassificationKind()
	 * @generated
	 */
	int CLASSIFICATION_KIND = 25;


	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel <em>LML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LML Model</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel
	 * @generated
	 */
	EClass getLMLModel();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel#getName()
	 * @see #getLMLModel()
	 * @generated
	 */
	EAttribute getLMLModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel#getElements()
	 * @see #getLMLModel()
	 * @generated
	 */
	EReference getLMLModel_Elements();

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
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element#isRelevant <em>Relevant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relevant</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Element#isRelevant()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Relevant();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element#getVisualizer <em>Visualizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visualizer</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Element#getVisualizer()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Visualizer();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Element</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement
	 * @generated
	 */
	EClass getDomainElement();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement#isElided <em>Elided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elided</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement#isElided()
	 * @see #getDomainElement()
	 * @generated
	 */
	EAttribute getDomainElement_Elided();

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
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getContent()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Content();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllGeneralizations() <em>Get All Generalizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Generalizations</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllGeneralizations()
	 * @generated
	 */
	EOperation getModel__GetAllGeneralizations();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllSetRelationships() <em>Get All Set Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Set Relationships</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllSetRelationships()
	 * @generated
	 */
	EOperation getModel__GetAllSetRelationships();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllClabjects() <em>Get All Clabjects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Clabjects</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllClabjects()
	 * @generated
	 */
	EOperation getModel__GetAllClabjects();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllEntities() <em>Get All Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Entities</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllEntities()
	 * @generated
	 */
	EOperation getModel__GetAllEntities();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllConnections() <em>Get All Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Connections</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllConnections()
	 * @generated
	 */
	EOperation getModel__GetAllConnections();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllClassifications() <em>Get All Classifications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Classifications</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getAllClassifications()
	 * @generated
	 */
	EOperation getModel__GetAllClassifications();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getOntology() <em>Get Ontology</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ontology</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getOntology()
	 * @generated
	 */
	EOperation getModel__GetOntology();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getClassifiedModel() <em>Get Classified Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Classified Model</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getClassifiedModel()
	 * @generated
	 */
	EOperation getModel__GetClassifiedModel();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getClassifyingModel() <em>Get Classifying Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Classifying Model</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getClassifyingModel()
	 * @generated
	 */
	EOperation getModel__GetClassifyingModel();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getLevel() <em>Get Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Level</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#getLevel()
	 * @generated
	 */
	EOperation getModel__GetLevel();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#isRootModel() <em>Is Root Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Root Model</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#isRootModel()
	 * @generated
	 */
	EOperation getModel__IsRootModel();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model#isLeafModel() <em>Is Leaf Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Leaf Model</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model#isLeafModel()
	 * @generated
	 */
	EOperation getModel__IsLeafModel();

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
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology#getContent()
	 * @see #getOntology()
	 * @generated
	 */
	EReference getOntology_Content();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology#getModelAtLevel(int) <em>Get Model At Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model At Level</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology#getModelAtLevel(int)
	 * @generated
	 */
	EOperation getOntology__GetModelAtLevel__int();

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
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.LogicalElement <em>Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Element</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.LogicalElement
	 * @generated
	 */
	EClass getLogicalElement();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.LogicalElement#getModel() <em>Get Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.LogicalElement#getModel()
	 * @generated
	 */
	EOperation getLogicalElement__GetModel();

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
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.SetRelationship#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.SetRelationship#getBase()
	 * @see #getSetRelationship()
	 * @generated
	 */
	EReference getSetRelationship_Base();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.SetRelationship#getTarget() <em>Get Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.SetRelationship#getTarget()
	 * @generated
	 */
	EOperation getSetRelationship__GetTarget();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Equality
	 * @generated
	 */
	EClass getEquality();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Equality#getEqual <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equal</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Equality#getEqual()
	 * @see #getEquality()
	 * @generated
	 */
	EReference getEquality_Equal();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Equality#getTarget() <em>Get Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Equality#getTarget()
	 * @generated
	 */
	EOperation getEquality__GetTarget();

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
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion#getInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion#getInverse()
	 * @see #getInversion()
	 * @generated
	 */
	EReference getInversion_Inverse();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion#getTarget() <em>Get Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion#getTarget()
	 * @generated
	 */
	EOperation getInversion__GetTarget();

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
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Complement#getComplement <em>Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complement</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Complement#getComplement()
	 * @see #getComplement()
	 * @generated
	 */
	EReference getComplement_Complement();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Complement#getTarget() <em>Get Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Complement#getTarget()
	 * @generated
	 */
	EOperation getComplement__GetTarget();

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
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#getDiscriminant <em>Discriminant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminant</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#getDiscriminant()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_Discriminant();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#getSupertypes() <em>Get Supertypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Supertypes</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#getSupertypes()
	 * @generated
	 */
	EOperation getGeneralization__GetSupertypes();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#getSubtypes() <em>Get Subtypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Subtypes</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#getSubtypes()
	 * @generated
	 */
	EOperation getGeneralization__GetSubtypes();

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
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization <em>Multiple Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Specialization</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization
	 * @generated
	 */
	EClass getMultipleSpecialization();

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
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization <em>Multiple Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Generalization</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization
	 * @generated
	 */
	EClass getMultipleGeneralization();

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
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getInstance()
	 * @see #getClassification()
	 * @generated
	 */
	EReference getClassification_Instance();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getType()
	 * @see #getClassification()
	 * @generated
	 */
	EReference getClassification_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getKind()
	 * @see #getClassification()
	 * @generated
	 */
	EAttribute getClassification_Kind();

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
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isInstantiable <em>Instantiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiable</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isInstantiable()
	 * @see #getClabject()
	 * @generated
	 */
	EAttribute getClabject_Instantiable();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getPotency <em>Potency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Potency</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getPotency()
	 * @see #getClabject()
	 * @generated
	 */
	EAttribute getClabject_Potency();

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
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getContent()
	 * @see #getClabject()
	 * @generated
	 */
	EReference getClabject_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getFeature()
	 * @see #getClabject()
	 * @generated
	 */
	EReference getClabject_Feature();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#allInstancesFrom(java.lang.String) <em>All Instances From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Instances From</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#allInstancesFrom(java.lang.String)
	 * @generated
	 */
	EOperation getClabject__AllInstancesFrom__String();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModel() <em>Get Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModel()
	 * @generated
	 */
	EOperation getClabject__GetModel();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelSupertypes() <em>Get Model Supertypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Supertypes</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelSupertypes()
	 * @generated
	 */
	EOperation getClabject__GetModelSupertypes();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelSubtypes() <em>Get Model Subtypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Subtypes</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelSubtypes()
	 * @generated
	 */
	EOperation getClabject__GetModelSubtypes();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationsAsInstance() <em>Get Model Classifications As Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Classifications As Instance</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationsAsInstance()
	 * @generated
	 */
	EOperation getClabject__GetModelClassificationsAsInstance();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationsAsType() <em>Get Model Classifications As Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Classifications As Type</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelClassificationsAsType()
	 * @generated
	 */
	EOperation getClabject__GetModelClassificationsAsType();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelInstances() <em>Get Model Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Instances</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelInstances()
	 * @generated
	 */
	EOperation getClabject__GetModelInstances();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelTypes() <em>Get Model Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Types</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelTypes()
	 * @generated
	 */
	EOperation getClabject__GetModelTypes();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllFeatures() <em>Get All Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Features</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllFeatures()
	 * @generated
	 */
	EOperation getClabject__GetAllFeatures();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllAttributes() <em>Get All Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Attributes</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllAttributes()
	 * @generated
	 */
	EOperation getClabject__GetAllAttributes();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllMethods() <em>Get All Methods</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Methods</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllMethods()
	 * @generated
	 */
	EOperation getClabject__GetAllMethods();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isModelInstanceOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) <em>Is Model Instance Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Model Instance Of</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isModelInstanceOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 * @generated
	 */
	EOperation getClabject__IsModelInstanceOf__Clabject();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isModelTypeOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) <em>Is Model Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Model Type Of</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isModelTypeOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 * @generated
	 */
	EOperation getClabject__IsModelTypeOf__Clabject();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenConnections() <em>Get Eigen Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Eigen Connections</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenConnections()
	 * @generated
	 */
	EOperation getClabject__GetEigenConnections();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllConnections() <em>Get All Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Connections</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllConnections()
	 * @generated
	 */
	EOperation getClabject__GetAllConnections();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedConnections() <em>Get Inherited Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inherited Connections</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedConnections()
	 * @generated
	 */
	EOperation getClabject__GetInheritedConnections();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenAssociates() <em>Get Eigen Associates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Eigen Associates</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenAssociates()
	 * @generated
	 */
	EOperation getClabject__GetEigenAssociates();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedAssociates() <em>Get Inherited Associates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inherited Associates</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedAssociates()
	 * @generated
	 */
	EOperation getClabject__GetInheritedAssociates();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllAssociates() <em>Get All Associates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Associates</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllAssociates()
	 * @generated
	 */
	EOperation getClabject__GetAllAssociates();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenAssociateRoleNames() <em>Get Eigen Associate Role Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Eigen Associate Role Names</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenAssociateRoleNames()
	 * @generated
	 */
	EOperation getClabject__GetEigenAssociateRoleNames();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllAssociateRoleNames() <em>Get All Associate Role Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Associate Role Names</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllAssociateRoleNames()
	 * @generated
	 */
	EOperation getClabject__GetAllAssociateRoleNames();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedAssociateRoleNames() <em>Get Inherited Associate Role Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inherited Associate Role Names</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedAssociateRoleNames()
	 * @generated
	 */
	EOperation getClabject__GetInheritedAssociateRoleNames();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenAssociatesForRoleName(java.lang.String) <em>Get Eigen Associates For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Eigen Associates For Role Name</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getEigenAssociatesForRoleName(java.lang.String)
	 * @generated
	 */
	EOperation getClabject__GetEigenAssociatesForRoleName__String();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedAssociatesForRoleName(java.lang.String) <em>Get Inherited Associates For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inherited Associates For Role Name</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getInheritedAssociatesForRoleName(java.lang.String)
	 * @generated
	 */
	EOperation getClabject__GetInheritedAssociatesForRoleName__String();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllAssociatesForRoleName(java.lang.String) <em>Get All Associates For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Associates For Role Name</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getAllAssociatesForRoleName(java.lang.String)
	 * @generated
	 */
	EOperation getClabject__GetAllAssociatesForRoleName__String();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelCompleteTypes() <em>Get Model Complete Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Complete Types</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelCompleteTypes()
	 * @generated
	 */
	EOperation getClabject__GetModelCompleteTypes();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelIncompleteTypes() <em>Get Model Incomplete Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Incomplete Types</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelIncompleteTypes()
	 * @generated
	 */
	EOperation getClabject__GetModelIncompleteTypes();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getBlueprint() <em>Get Blueprint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Blueprint</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getBlueprint()
	 * @generated
	 */
	EOperation getClabject__GetBlueprint();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelOffspring() <em>Get Model Offspring</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Offspring</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelOffspring()
	 * @generated
	 */
	EOperation getClabject__GetModelOffspring();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelIsonyms() <em>Get Model Isonyms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Isonyms</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelIsonyms()
	 * @generated
	 */
	EOperation getClabject__GetModelIsonyms();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelHyponyms() <em>Get Model Hyponyms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model Hyponyms</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getModelHyponyms()
	 * @generated
	 */
	EOperation getClabject__GetModelHyponyms();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getDomainForConnection(de.uni_mannheim.informatik.swt.models.plm.PLM.Connection) <em>Get Domain For Connection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Domain For Connection</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getDomainForConnection(de.uni_mannheim.informatik.swt.models.plm.PLM.Connection)
	 * @generated
	 */
	EOperation getClabject__GetDomainForConnection__Connection();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getPossibleDomainSpecificVisualizers() <em>Get Possible Domain Specific Visualizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Possible Domain Specific Visualizers</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getPossibleDomainSpecificVisualizers()
	 * @generated
	 */
	EOperation getClabject__GetPossibleDomainSpecificVisualizers();

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
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Feature#getDurability <em>Durability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durability</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Feature#getDurability()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Durability();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Feature#getClabject() <em>Get Clabject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Clabject</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Feature#getClabject()
	 * @generated
	 */
	EOperation getFeature__GetClabject();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#isTransitive <em>Transitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitive</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#isTransitive()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Transitive();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lower</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getLower()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Lower();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Upper</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getUpper()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Upper();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getIsNavigable <em>Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Is Navigable</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getIsNavigable()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_IsNavigable();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getParticipant()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Participant();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role Name</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getRoleName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_RoleName();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getParticipantForRoleName(java.lang.String) <em>Get Participant For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Participant For Role Name</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getParticipantForRoleName(java.lang.String)
	 * @generated
	 */
	EOperation getConnection__GetParticipantForRoleName__String();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getRoleNameForParticipant(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) <em>Get Role Name For Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Role Name For Participant</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getRoleNameForParticipant(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 * @generated
	 */
	EOperation getConnection__GetRoleNameForParticipant__Clabject();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#isNavigableForRoleName(java.lang.String) <em>Is Navigable For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Navigable For Role Name</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#isNavigableForRoleName(java.lang.String)
	 * @generated
	 */
	EOperation getConnection__IsNavigableForRoleName__String();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getLowerForRoleName(java.lang.String) <em>Get Lower For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Lower For Role Name</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getLowerForRoleName(java.lang.String)
	 * @generated
	 */
	EOperation getConnection__GetLowerForRoleName__String();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getUpperForRoleName(java.lang.String) <em>Get Upper For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Upper For Role Name</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getUpperForRoleName(java.lang.String)
	 * @generated
	 */
	EOperation getConnection__GetUpperForRoleName__String();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getDomain() <em>Get Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Domain</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getDomain()
	 * @generated
	 */
	EOperation getConnection__GetDomain();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getNotDomain() <em>Get Not Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Not Domain</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getNotDomain()
	 * @generated
	 */
	EOperation getConnection__GetNotDomain();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getHumanReadableName() <em>Get Human Readable Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Human Readable Name</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection#getHumanReadableName()
	 * @generated
	 */
	EOperation getConnection__GetHumanReadableName();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer <em>Visualizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualizer</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer
	 * @generated
	 */
	EClass getVisualizer();

	/**
	 * Returns the meta object for the attribute list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attributes</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getAttributes()
	 * @see #getVisualizer()
	 * @generated
	 */
	EAttribute getVisualizer_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getDurability <em>Durability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durability</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getDurability()
	 * @see #getVisualizer()
	 * @generated
	 */
	EAttribute getVisualizer_Durability();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getTemplate()
	 * @see #getVisualizer()
	 * @generated
	 */
	EReference getVisualizer_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getChild()
	 * @see #getVisualizer()
	 * @generated
	 */
	EReference getVisualizer_Child();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getValueForKey(java.lang.String) <em>Get Value For Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value For Key</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getValueForKey(java.lang.String)
	 * @generated
	 */
	EOperation getVisualizer__GetValueForKey__String();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getElement() <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer#getElement()
	 * @generated
	 */
	EOperation getVisualizer__GetElement();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute#getDatatype()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute#getMutability <em>Mutability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutability</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute#getMutability()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Mutability();

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
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer <em>Visualization Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Container</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer
	 * @generated
	 */
	EClass getVisualizationContainer();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer#getOrigin()
	 * @see #getVisualizationContainer()
	 * @generated
	 */
	EAttribute getVisualizationContainer_Origin();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer#getVisualizersShown <em>Visualizers Shown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visualizers Shown</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer#getVisualizersShown()
	 * @see #getVisualizationContainer()
	 * @generated
	 */
	EAttribute getVisualizationContainer_VisualizersShown();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer <em>Top Level Visualization Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Visualization Container</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer
	 * @generated
	 */
	EClass getTopLevelVisualizationContainer();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer#getCompletness <em>Completness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completness</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer#getCompletness()
	 * @see #getTopLevelVisualizationContainer()
	 * @generated
	 */
	EAttribute getTopLevelVisualizationContainer_Completness();

	/**
	 * Returns the meta object for enum '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind <em>Classification Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classification Kind</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind
	 * @generated
	 */
	EEnum getClassificationKind();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LMLModelImpl <em>LML Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LMLModelImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getLMLModel()
		 * @generated
		 */
		EClass LML_MODEL = eINSTANCE.getLMLModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LML_MODEL__NAME = eINSTANCE.getLMLModel_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LML_MODEL__ELEMENTS = eINSTANCE.getLMLModel_Elements();

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
		 * The meta object literal for the '<em><b>Relevant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__RELEVANT = eINSTANCE.getElement_Relevant();

		/**
		 * The meta object literal for the '<em><b>Visualizer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__VISUALIZER = eINSTANCE.getElement_Visualizer();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainElementImpl <em>Domain Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.DomainElementImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getDomainElement()
		 * @generated
		 */
		EClass DOMAIN_ELEMENT = eINSTANCE.getDomainElement();

		/**
		 * The meta object literal for the '<em><b>Elided</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ELEMENT__ELIDED = eINSTANCE.getDomainElement_Elided();

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
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTENT = eINSTANCE.getModel_Content();

		/**
		 * The meta object literal for the '<em><b>Get All Generalizations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_ALL_GENERALIZATIONS = eINSTANCE.getModel__GetAllGeneralizations();

		/**
		 * The meta object literal for the '<em><b>Get All Set Relationships</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_ALL_SET_RELATIONSHIPS = eINSTANCE.getModel__GetAllSetRelationships();

		/**
		 * The meta object literal for the '<em><b>Get All Clabjects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_ALL_CLABJECTS = eINSTANCE.getModel__GetAllClabjects();

		/**
		 * The meta object literal for the '<em><b>Get All Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_ALL_ENTITIES = eINSTANCE.getModel__GetAllEntities();

		/**
		 * The meta object literal for the '<em><b>Get All Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_ALL_CONNECTIONS = eINSTANCE.getModel__GetAllConnections();

		/**
		 * The meta object literal for the '<em><b>Get All Classifications</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_ALL_CLASSIFICATIONS = eINSTANCE.getModel__GetAllClassifications();

		/**
		 * The meta object literal for the '<em><b>Get Ontology</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_ONTOLOGY = eINSTANCE.getModel__GetOntology();

		/**
		 * The meta object literal for the '<em><b>Get Classified Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_CLASSIFIED_MODEL = eINSTANCE.getModel__GetClassifiedModel();

		/**
		 * The meta object literal for the '<em><b>Get Classifying Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_CLASSIFYING_MODEL = eINSTANCE.getModel__GetClassifyingModel();

		/**
		 * The meta object literal for the '<em><b>Get Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___GET_LEVEL = eINSTANCE.getModel__GetLevel();

		/**
		 * The meta object literal for the '<em><b>Is Root Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___IS_ROOT_MODEL = eINSTANCE.getModel__IsRootModel();

		/**
		 * The meta object literal for the '<em><b>Is Leaf Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___IS_LEAF_MODEL = eINSTANCE.getModel__IsLeafModel();

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
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONTOLOGY__CONTENT = eINSTANCE.getOntology_Content();

		/**
		 * The meta object literal for the '<em><b>Get Model At Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ONTOLOGY___GET_MODEL_AT_LEVEL__INT = eINSTANCE.getOntology__GetModelAtLevel__int();

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
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LogicalElementImpl <em>Logical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.LogicalElementImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getLogicalElement()
		 * @generated
		 */
		EClass LOGICAL_ELEMENT = eINSTANCE.getLogicalElement();

		/**
		 * The meta object literal for the '<em><b>Get Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGICAL_ELEMENT___GET_MODEL = eINSTANCE.getLogicalElement__GetModel();

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
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_RELATIONSHIP__BASE = eINSTANCE.getSetRelationship_Base();

		/**
		 * The meta object literal for the '<em><b>Get Target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SET_RELATIONSHIP___GET_TARGET = eINSTANCE.getSetRelationship__GetTarget();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EqualityImpl <em>Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EqualityImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getEquality()
		 * @generated
		 */
		EClass EQUALITY = eINSTANCE.getEquality();

		/**
		 * The meta object literal for the '<em><b>Equal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY__EQUAL = eINSTANCE.getEquality_Equal();

		/**
		 * The meta object literal for the '<em><b>Get Target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQUALITY___GET_TARGET = eINSTANCE.getEquality__GetTarget();

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
		 * The meta object literal for the '<em><b>Inverse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERSION__INVERSE = eINSTANCE.getInversion_Inverse();

		/**
		 * The meta object literal for the '<em><b>Get Target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVERSION___GET_TARGET = eINSTANCE.getInversion__GetTarget();

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
		 * The meta object literal for the '<em><b>Complement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEMENT__COMPLEMENT = eINSTANCE.getComplement_Complement();

		/**
		 * The meta object literal for the '<em><b>Get Target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLEMENT___GET_TARGET = eINSTANCE.getComplement__GetTarget();

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
		 * The meta object literal for the '<em><b>Discriminant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__DISCRIMINANT = eINSTANCE.getGeneralization_Discriminant();

		/**
		 * The meta object literal for the '<em><b>Get Supertypes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERALIZATION___GET_SUPERTYPES = eINSTANCE.getGeneralization__GetSupertypes();

		/**
		 * The meta object literal for the '<em><b>Get Subtypes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERALIZATION___GET_SUBTYPES = eINSTANCE.getGeneralization__GetSubtypes();

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
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl <em>Multiple Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleSpecializationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getMultipleSpecialization()
		 * @generated
		 */
		EClass MULTIPLE_SPECIALIZATION = eINSTANCE.getMultipleSpecialization();

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
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl <em>Multiple Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.MultipleGeneralizationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getMultipleGeneralization()
		 * @generated
		 */
		EClass MULTIPLE_GENERALIZATION = eINSTANCE.getMultipleGeneralization();

		/**
		 * The meta object literal for the '<em><b>Intersection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_GENERALIZATION__INTERSECTION = eINSTANCE.getMultipleGeneralization_Intersection();

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
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClassificationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getClassification()
		 * @generated
		 */
		EClass CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION__INSTANCE = eINSTANCE.getClassification_Instance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION__TYPE = eINSTANCE.getClassification_Type();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION__KIND = eINSTANCE.getClassification_Kind();

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
		 * The meta object literal for the '<em><b>Instantiable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLABJECT__INSTANTIABLE = eINSTANCE.getClabject_Instantiable();

		/**
		 * The meta object literal for the '<em><b>Potency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLABJECT__POTENCY = eINSTANCE.getClabject_Potency();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLABJECT__LEVEL = eINSTANCE.getClabject_Level();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLABJECT__CONTENT = eINSTANCE.getClabject_Content();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLABJECT__FEATURE = eINSTANCE.getClabject_Feature();

		/**
		 * The meta object literal for the '<em><b>All Instances From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___ALL_INSTANCES_FROM__STRING = eINSTANCE.getClabject__AllInstancesFrom__String();

		/**
		 * The meta object literal for the '<em><b>Get Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL = eINSTANCE.getClabject__GetModel();

		/**
		 * The meta object literal for the '<em><b>Get Model Supertypes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL_SUPERTYPES = eINSTANCE.getClabject__GetModelSupertypes();

		/**
		 * The meta object literal for the '<em><b>Get Model Subtypes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL_SUBTYPES = eINSTANCE.getClabject__GetModelSubtypes();

		/**
		 * The meta object literal for the '<em><b>Get Model Classifications As Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_INSTANCE = eINSTANCE.getClabject__GetModelClassificationsAsInstance();

		/**
		 * The meta object literal for the '<em><b>Get Model Classifications As Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_TYPE = eINSTANCE.getClabject__GetModelClassificationsAsType();

		/**
		 * The meta object literal for the '<em><b>Get Model Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL_INSTANCES = eINSTANCE.getClabject__GetModelInstances();

		/**
		 * The meta object literal for the '<em><b>Get Model Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL_TYPES = eINSTANCE.getClabject__GetModelTypes();

		/**
		 * The meta object literal for the '<em><b>Get All Features</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_ALL_FEATURES = eINSTANCE.getClabject__GetAllFeatures();

		/**
		 * The meta object literal for the '<em><b>Get All Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_ALL_ATTRIBUTES = eINSTANCE.getClabject__GetAllAttributes();

		/**
		 * The meta object literal for the '<em><b>Get All Methods</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_ALL_METHODS = eINSTANCE.getClabject__GetAllMethods();

		/**
		 * The meta object literal for the '<em><b>Is Model Instance Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___IS_MODEL_INSTANCE_OF__CLABJECT = eINSTANCE.getClabject__IsModelInstanceOf__Clabject();

		/**
		 * The meta object literal for the '<em><b>Is Model Type Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___IS_MODEL_TYPE_OF__CLABJECT = eINSTANCE.getClabject__IsModelTypeOf__Clabject();

		/**
		 * The meta object literal for the '<em><b>Get Eigen Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_EIGEN_CONNECTIONS = eINSTANCE.getClabject__GetEigenConnections();

		/**
		 * The meta object literal for the '<em><b>Get All Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_ALL_CONNECTIONS = eINSTANCE.getClabject__GetAllConnections();

		/**
		 * The meta object literal for the '<em><b>Get Inherited Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_INHERITED_CONNECTIONS = eINSTANCE.getClabject__GetInheritedConnections();

		/**
		 * The meta object literal for the '<em><b>Get Eigen Associates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_EIGEN_ASSOCIATES = eINSTANCE.getClabject__GetEigenAssociates();

		/**
		 * The meta object literal for the '<em><b>Get Inherited Associates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_INHERITED_ASSOCIATES = eINSTANCE.getClabject__GetInheritedAssociates();

		/**
		 * The meta object literal for the '<em><b>Get All Associates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_ALL_ASSOCIATES = eINSTANCE.getClabject__GetAllAssociates();

		/**
		 * The meta object literal for the '<em><b>Get Eigen Associate Role Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_EIGEN_ASSOCIATE_ROLE_NAMES = eINSTANCE.getClabject__GetEigenAssociateRoleNames();

		/**
		 * The meta object literal for the '<em><b>Get All Associate Role Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_ALL_ASSOCIATE_ROLE_NAMES = eINSTANCE.getClabject__GetAllAssociateRoleNames();

		/**
		 * The meta object literal for the '<em><b>Get Inherited Associate Role Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_INHERITED_ASSOCIATE_ROLE_NAMES = eINSTANCE.getClabject__GetInheritedAssociateRoleNames();

		/**
		 * The meta object literal for the '<em><b>Get Eigen Associates For Role Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_EIGEN_ASSOCIATES_FOR_ROLE_NAME__STRING = eINSTANCE.getClabject__GetEigenAssociatesForRoleName__String();

		/**
		 * The meta object literal for the '<em><b>Get Inherited Associates For Role Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_INHERITED_ASSOCIATES_FOR_ROLE_NAME__STRING = eINSTANCE.getClabject__GetInheritedAssociatesForRoleName__String();

		/**
		 * The meta object literal for the '<em><b>Get All Associates For Role Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_ALL_ASSOCIATES_FOR_ROLE_NAME__STRING = eINSTANCE.getClabject__GetAllAssociatesForRoleName__String();

		/**
		 * The meta object literal for the '<em><b>Get Model Complete Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL_COMPLETE_TYPES = eINSTANCE.getClabject__GetModelCompleteTypes();

		/**
		 * The meta object literal for the '<em><b>Get Model Incomplete Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL_INCOMPLETE_TYPES = eINSTANCE.getClabject__GetModelIncompleteTypes();

		/**
		 * The meta object literal for the '<em><b>Get Blueprint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_BLUEPRINT = eINSTANCE.getClabject__GetBlueprint();

		/**
		 * The meta object literal for the '<em><b>Get Model Offspring</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL_OFFSPRING = eINSTANCE.getClabject__GetModelOffspring();

		/**
		 * The meta object literal for the '<em><b>Get Model Isonyms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL_ISONYMS = eINSTANCE.getClabject__GetModelIsonyms();

		/**
		 * The meta object literal for the '<em><b>Get Model Hyponyms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_MODEL_HYPONYMS = eINSTANCE.getClabject__GetModelHyponyms();

		/**
		 * The meta object literal for the '<em><b>Get Domain For Connection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_DOMAIN_FOR_CONNECTION__CONNECTION = eINSTANCE.getClabject__GetDomainForConnection__Connection();

		/**
		 * The meta object literal for the '<em><b>Get Possible Domain Specific Visualizers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLABJECT___GET_POSSIBLE_DOMAIN_SPECIFIC_VISUALIZERS = eINSTANCE.getClabject__GetPossibleDomainSpecificVisualizers();

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
		 * The meta object literal for the '<em><b>Durability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DURABILITY = eINSTANCE.getFeature_Durability();

		/**
		 * The meta object literal for the '<em><b>Get Clabject</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FEATURE___GET_CLABJECT = eINSTANCE.getFeature__GetClabject();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.EntityImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ConnectionImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Transitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__TRANSITIVE = eINSTANCE.getConnection_Transitive();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__LOWER = eINSTANCE.getConnection_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__UPPER = eINSTANCE.getConnection_Upper();

		/**
		 * The meta object literal for the '<em><b>Is Navigable</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__IS_NAVIGABLE = eINSTANCE.getConnection_IsNavigable();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PARTICIPANT = eINSTANCE.getConnection_Participant();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__ROLE_NAME = eINSTANCE.getConnection_RoleName();

		/**
		 * The meta object literal for the '<em><b>Get Participant For Role Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION___GET_PARTICIPANT_FOR_ROLE_NAME__STRING = eINSTANCE.getConnection__GetParticipantForRoleName__String();

		/**
		 * The meta object literal for the '<em><b>Get Role Name For Participant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION___GET_ROLE_NAME_FOR_PARTICIPANT__CLABJECT = eINSTANCE.getConnection__GetRoleNameForParticipant__Clabject();

		/**
		 * The meta object literal for the '<em><b>Is Navigable For Role Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION___IS_NAVIGABLE_FOR_ROLE_NAME__STRING = eINSTANCE.getConnection__IsNavigableForRoleName__String();

		/**
		 * The meta object literal for the '<em><b>Get Lower For Role Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION___GET_LOWER_FOR_ROLE_NAME__STRING = eINSTANCE.getConnection__GetLowerForRoleName__String();

		/**
		 * The meta object literal for the '<em><b>Get Upper For Role Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION___GET_UPPER_FOR_ROLE_NAME__STRING = eINSTANCE.getConnection__GetUpperForRoleName__String();

		/**
		 * The meta object literal for the '<em><b>Get Domain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION___GET_DOMAIN = eINSTANCE.getConnection__GetDomain();

		/**
		 * The meta object literal for the '<em><b>Get Not Domain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION___GET_NOT_DOMAIN = eINSTANCE.getConnection__GetNotDomain();

		/**
		 * The meta object literal for the '<em><b>Get Human Readable Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION___GET_HUMAN_READABLE_NAME = eINSTANCE.getConnection__GetHumanReadableName();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizerImpl <em>Visualizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizerImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getVisualizer()
		 * @generated
		 */
		EClass VISUALIZER = eINSTANCE.getVisualizer();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZER__ATTRIBUTES = eINSTANCE.getVisualizer_Attributes();

		/**
		 * The meta object literal for the '<em><b>Durability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZER__DURABILITY = eINSTANCE.getVisualizer_Durability();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZER__TEMPLATE = eINSTANCE.getVisualizer_Template();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZER__CHILD = eINSTANCE.getVisualizer_Child();

		/**
		 * The meta object literal for the '<em><b>Get Value For Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISUALIZER___GET_VALUE_FOR_KEY__STRING = eINSTANCE.getVisualizer__GetValueForKey__String();

		/**
		 * The meta object literal for the '<em><b>Get Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISUALIZER___GET_ELEMENT = eINSTANCE.getVisualizer__GetElement();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.AttributeImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DATATYPE = eINSTANCE.getAttribute_Datatype();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Mutability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MUTABILITY = eINSTANCE.getAttribute_Mutability();

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
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizationContainerImpl <em>Visualization Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizationContainerImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getVisualizationContainer()
		 * @generated
		 */
		EClass VISUALIZATION_CONTAINER = eINSTANCE.getVisualizationContainer();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION_CONTAINER__ORIGIN = eINSTANCE.getVisualizationContainer_Origin();

		/**
		 * The meta object literal for the '<em><b>Visualizers Shown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN = eINSTANCE.getVisualizationContainer_VisualizersShown();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.TopLevelVisualizationContainerImpl <em>Top Level Visualization Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.TopLevelVisualizationContainerImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getTopLevelVisualizationContainer()
		 * @generated
		 */
		EClass TOP_LEVEL_VISUALIZATION_CONTAINER = eINSTANCE.getTopLevelVisualizationContainer();

		/**
		 * The meta object literal for the '<em><b>Completness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS = eINSTANCE.getTopLevelVisualizationContainer_Completness();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind <em>Classification Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind
		 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl#getClassificationKind()
		 * @generated
		 */
		EEnum CLASSIFICATION_KIND = eINSTANCE.getClassificationKind();

	}

} //PLMPackage
