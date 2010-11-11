/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PanLevelModel;

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
 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModelFactory
 * @model kind="package"
 * @generated
 */
public interface PanLevelModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PanLevelModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uni-mannheim.informatik.swt.models/plm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uni-mannheim.informatik.swt.models";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PanLevelModelPackage eINSTANCE = uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PElementImpl <em>PElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PElementImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPElement()
	 * @generated
	 */
	int PELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>PElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PLevelSpecificElementImpl <em>PLevel Specific Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PLevelSpecificElementImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPLevelSpecificElement()
	 * @generated
	 */
	int PLEVEL_SPECIFIC_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLEVEL_SPECIFIC_ELEMENT__NAME = PELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLEVEL_SPECIFIC_ELEMENT__LEVEL = PELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLEVEL_SPECIFIC_ELEMENT__OWNER = PELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PLevel Specific Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLEVEL_SPECIFIC_ELEMENT_FEATURE_COUNT = PELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PModuleImpl <em>PModule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PModuleImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPModule()
	 * @generated
	 */
	int PMODULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMODULE__NAME = PELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>PModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMODULE_FEATURE_COUNT = PELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PInstantiableElementImpl <em>PInstantiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PInstantiableElementImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPInstantiableElement()
	 * @generated
	 */
	int PINSTANTIABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIABLE_ELEMENT__NAME = PLEVEL_SPECIFIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIABLE_ELEMENT__LEVEL = PLEVEL_SPECIFIC_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIABLE_ELEMENT__OWNER = PLEVEL_SPECIFIC_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIABLE_ELEMENT__POTENCY = PLEVEL_SPECIFIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PInstantiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIABLE_ELEMENT_FEATURE_COUNT = PLEVEL_SPECIFIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PPackageImpl <em>PPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PPackageImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPPackage()
	 * @generated
	 */
	int PPACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPACKAGE__NAME = PLEVEL_SPECIFIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPACKAGE__LEVEL = PLEVEL_SPECIFIC_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPACKAGE__OWNER = PLEVEL_SPECIFIC_ELEMENT__OWNER;

	/**
	 * The number of structural features of the '<em>PPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPACKAGE_FEATURE_COUNT = PLEVEL_SPECIFIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PConnectorImpl <em>PConnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PConnectorImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPConnector()
	 * @generated
	 */
	int PCONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECTOR__NAME = PLEVEL_SPECIFIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECTOR__LEVEL = PLEVEL_SPECIFIC_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECTOR__OWNER = PLEVEL_SPECIFIC_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECTOR__PARTICIPANTS = PLEVEL_SPECIFIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECTOR__ROLE_NAMES = PLEVEL_SPECIFIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PConnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCONNECTOR_FEATURE_COUNT = PLEVEL_SPECIFIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PFieldImpl <em>PField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PFieldImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPField()
	 * @generated
	 */
	int PFIELD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFIELD__NAME = PINSTANTIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFIELD__LEVEL = PINSTANTIABLE_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFIELD__OWNER = PINSTANTIABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFIELD__POTENCY = PINSTANTIABLE_ELEMENT__POTENCY;

	/**
	 * The feature id for the '<em><b>Dual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFIELD__DUAL = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFIELD__UNIQUE = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFIELD__DATA_TYPE = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFIELD__VALUE = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multiplicity Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFIELD__MULTIPLICITY_LOWER = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Multiplicity Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFIELD__MULTIPLICITY_UPPER = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFIELD_FEATURE_COUNT = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PClabjectImpl <em>PClabject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PClabjectImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPClabject()
	 * @generated
	 */
	int PCLABJECT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCLABJECT__NAME = PINSTANTIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCLABJECT__LEVEL = PINSTANTIABLE_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCLABJECT__OWNER = PINSTANTIABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCLABJECT__POTENCY = PINSTANTIABLE_ELEMENT__POTENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCLABJECT__TYPE = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCLABJECT__SUPER_TYPE = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PClabject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCLABJECT_FEATURE_COUNT = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PMethodImpl <em>PMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PMethodImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPMethod()
	 * @generated
	 */
	int PMETHOD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMETHOD__NAME = PINSTANTIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMETHOD__LEVEL = PINSTANTIABLE_ELEMENT__LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMETHOD__OWNER = PINSTANTIABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMETHOD__POTENCY = PINSTANTIABLE_ELEMENT__POTENCY;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMETHOD__BODY = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMETHOD__INPUT = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Put</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMETHOD__OUT_PUT = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PMETHOD_FEATURE_COUNT = PINSTANTIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PNodeImpl <em>PNode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PNodeImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPNode()
	 * @generated
	 */
	int PNODE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__NAME = PCLABJECT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__LEVEL = PCLABJECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__OWNER = PCLABJECT__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__POTENCY = PCLABJECT__POTENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__TYPE = PCLABJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE__SUPER_TYPE = PCLABJECT__SUPER_TYPE;

	/**
	 * The number of structural features of the '<em>PNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PNODE_FEATURE_COUNT = PCLABJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PRelationshipImpl <em>PRelationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PRelationshipImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPRelationship()
	 * @generated
	 */
	int PRELATIONSHIP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__NAME = PCLABJECT__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__LEVEL = PCLABJECT__LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__OWNER = PCLABJECT__OWNER;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__POTENCY = PCLABJECT__POTENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__TYPE = PCLABJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__SUPER_TYPE = PCLABJECT__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__PARTICIPANTS = PCLABJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__ROLE_NAMES = PCLABJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity Lower</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__MULTIPLICITY_LOWER = PCLABJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicity Upper</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__MULTIPLICITY_UPPER = PCLABJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Navigable</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__IS_NAVIGABLE = PCLABJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP__IS_ORDERED = PCLABJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>PRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELATIONSHIP_FEATURE_COUNT = PCLABJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PGeneralizationImpl <em>PGeneralization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PGeneralizationImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPGeneralization()
	 * @generated
	 */
	int PGENERALIZATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGENERALIZATION__NAME = PCONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGENERALIZATION__LEVEL = PCONNECTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGENERALIZATION__OWNER = PCONNECTOR__OWNER;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGENERALIZATION__PARTICIPANTS = PCONNECTOR__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Role Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGENERALIZATION__ROLE_NAMES = PCONNECTOR__ROLE_NAMES;

	/**
	 * The number of structural features of the '<em>PGeneralization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PGENERALIZATION_FEATURE_COUNT = PCONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PInstantiationImpl <em>PInstantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PInstantiationImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPInstantiation()
	 * @generated
	 */
	int PINSTANTIATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIATION__NAME = PCONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIATION__LEVEL = PCONNECTOR__LEVEL;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIATION__OWNER = PCONNECTOR__OWNER;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIATION__PARTICIPANTS = PCONNECTOR__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Role Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIATION__ROLE_NAMES = PCONNECTOR__ROLE_NAMES;

	/**
	 * The feature id for the '<em><b>Target Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIATION__TARGET_LEVEL = PCONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PInstantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINSTANTIATION_FEATURE_COUNT = PCONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelImpl <em>Pan Level Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelImpl
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPanLevelModel()
	 * @generated
	 */
	int PAN_LEVEL_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_LEVEL_MODEL__MODEL_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Pan Level Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_LEVEL_MODEL_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PElement <em>PElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PElement</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PElement
	 * @generated
	 */
	EClass getPElement();

	/**
	 * Returns the meta object for the attribute '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PElement#getName()
	 * @see #getPElement()
	 * @generated
	 */
	EAttribute getPElement_Name();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PLevelSpecificElement <em>PLevel Specific Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PLevel Specific Element</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PLevelSpecificElement
	 * @generated
	 */
	EClass getPLevelSpecificElement();

	/**
	 * Returns the meta object for the attribute '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PLevelSpecificElement#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PLevelSpecificElement#getLevel()
	 * @see #getPLevelSpecificElement()
	 * @generated
	 */
	EAttribute getPLevelSpecificElement_Level();

	/**
	 * Returns the meta object for the reference '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PLevelSpecificElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PLevelSpecificElement#getOwner()
	 * @see #getPLevelSpecificElement()
	 * @generated
	 */
	EReference getPLevelSpecificElement_Owner();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PModule <em>PModule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PModule</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PModule
	 * @generated
	 */
	EClass getPModule();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiableElement <em>PInstantiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PInstantiable Element</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiableElement
	 * @generated
	 */
	EClass getPInstantiableElement();

	/**
	 * Returns the meta object for the attribute '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiableElement#getPotency <em>Potency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Potency</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiableElement#getPotency()
	 * @see #getPInstantiableElement()
	 * @generated
	 */
	EAttribute getPInstantiableElement_Potency();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PPackage <em>PPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PPackage</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PPackage
	 * @generated
	 */
	EClass getPPackage();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PConnector <em>PConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PConnector</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PConnector
	 * @generated
	 */
	EClass getPConnector();

	/**
	 * Returns the meta object for the reference list '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PConnector#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PConnector#getParticipants()
	 * @see #getPConnector()
	 * @generated
	 */
	EReference getPConnector_Participants();

	/**
	 * Returns the meta object for the attribute list '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PConnector#getRoleNames <em>Role Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role Names</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PConnector#getRoleNames()
	 * @see #getPConnector()
	 * @generated
	 */
	EAttribute getPConnector_RoleNames();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField <em>PField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PField</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField
	 * @generated
	 */
	EClass getPField();

	/**
	 * Returns the meta object for the attribute '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#isDual <em>Dual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dual</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#isDual()
	 * @see #getPField()
	 * @generated
	 */
	EAttribute getPField_Dual();

	/**
	 * Returns the meta object for the attribute '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#isUnique()
	 * @see #getPField()
	 * @generated
	 */
	EAttribute getPField_Unique();

	/**
	 * Returns the meta object for the attribute '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#getDataType()
	 * @see #getPField()
	 * @generated
	 */
	EAttribute getPField_DataType();

	/**
	 * Returns the meta object for the reference '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#getValue()
	 * @see #getPField()
	 * @generated
	 */
	EReference getPField_Value();

	/**
	 * Returns the meta object for the attribute '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#getMultiplicityLower <em>Multiplicity Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Lower</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#getMultiplicityLower()
	 * @see #getPField()
	 * @generated
	 */
	EAttribute getPField_MultiplicityLower();

	/**
	 * Returns the meta object for the attribute '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#getMultiplicityUpper <em>Multiplicity Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Upper</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PField#getMultiplicityUpper()
	 * @see #getPField()
	 * @generated
	 */
	EAttribute getPField_MultiplicityUpper();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PClabject <em>PClabject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PClabject</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PClabject
	 * @generated
	 */
	EClass getPClabject();

	/**
	 * Returns the meta object for the reference '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PClabject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PClabject#getType()
	 * @see #getPClabject()
	 * @generated
	 */
	EReference getPClabject_Type();

	/**
	 * Returns the meta object for the reference list '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PClabject#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Type</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PClabject#getSuperType()
	 * @see #getPClabject()
	 * @generated
	 */
	EReference getPClabject_SuperType();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PMethod <em>PMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PMethod</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PMethod
	 * @generated
	 */
	EClass getPMethod();

	/**
	 * Returns the meta object for the attribute '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PMethod#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PMethod#getBody()
	 * @see #getPMethod()
	 * @generated
	 */
	EAttribute getPMethod_Body();

	/**
	 * Returns the meta object for the reference list '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PMethod#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PMethod#getInput()
	 * @see #getPMethod()
	 * @generated
	 */
	EReference getPMethod_Input();

	/**
	 * Returns the meta object for the reference list '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PMethod#getOutPut <em>Out Put</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Put</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PMethod#getOutPut()
	 * @see #getPMethod()
	 * @generated
	 */
	EReference getPMethod_OutPut();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PNode <em>PNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PNode</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PNode
	 * @generated
	 */
	EClass getPNode();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PRelationship <em>PRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PRelationship</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PRelationship
	 * @generated
	 */
	EClass getPRelationship();

	/**
	 * Returns the meta object for the attribute list '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PRelationship#getMultiplicityLower <em>Multiplicity Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multiplicity Lower</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PRelationship#getMultiplicityLower()
	 * @see #getPRelationship()
	 * @generated
	 */
	EAttribute getPRelationship_MultiplicityLower();

	/**
	 * Returns the meta object for the attribute list '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PRelationship#getMultiplicityUpper <em>Multiplicity Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multiplicity Upper</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PRelationship#getMultiplicityUpper()
	 * @see #getPRelationship()
	 * @generated
	 */
	EAttribute getPRelationship_MultiplicityUpper();

	/**
	 * Returns the meta object for the attribute list '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PRelationship#getIsNavigable <em>Is Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Is Navigable</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PRelationship#getIsNavigable()
	 * @see #getPRelationship()
	 * @generated
	 */
	EAttribute getPRelationship_IsNavigable();

	/**
	 * Returns the meta object for the attribute list '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PRelationship#getIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Is Ordered</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PRelationship#getIsOrdered()
	 * @see #getPRelationship()
	 * @generated
	 */
	EAttribute getPRelationship_IsOrdered();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PGeneralization <em>PGeneralization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PGeneralization</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PGeneralization
	 * @generated
	 */
	EClass getPGeneralization();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiation <em>PInstantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PInstantiation</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiation
	 * @generated
	 */
	EClass getPInstantiation();

	/**
	 * Returns the meta object for the attribute '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiation#getTargetLevel <em>Target Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Level</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PInstantiation#getTargetLevel()
	 * @see #getPInstantiation()
	 * @generated
	 */
	EAttribute getPInstantiation_TargetLevel();

	/**
	 * Returns the meta object for class '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModel <em>Pan Level Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pan Level Model</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModel
	 * @generated
	 */
	EClass getPanLevelModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModel#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Elements</em>'.
	 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModel#getModelElements()
	 * @see #getPanLevelModel()
	 * @generated
	 */
	EReference getPanLevelModel_ModelElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PanLevelModelFactory getPanLevelModelFactory();

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
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PElementImpl <em>PElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PElementImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPElement()
		 * @generated
		 */
		EClass PELEMENT = eINSTANCE.getPElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PELEMENT__NAME = eINSTANCE.getPElement_Name();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PLevelSpecificElementImpl <em>PLevel Specific Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PLevelSpecificElementImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPLevelSpecificElement()
		 * @generated
		 */
		EClass PLEVEL_SPECIFIC_ELEMENT = eINSTANCE.getPLevelSpecificElement();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLEVEL_SPECIFIC_ELEMENT__LEVEL = eINSTANCE.getPLevelSpecificElement_Level();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLEVEL_SPECIFIC_ELEMENT__OWNER = eINSTANCE.getPLevelSpecificElement_Owner();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PModuleImpl <em>PModule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PModuleImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPModule()
		 * @generated
		 */
		EClass PMODULE = eINSTANCE.getPModule();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PInstantiableElementImpl <em>PInstantiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PInstantiableElementImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPInstantiableElement()
		 * @generated
		 */
		EClass PINSTANTIABLE_ELEMENT = eINSTANCE.getPInstantiableElement();

		/**
		 * The meta object literal for the '<em><b>Potency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINSTANTIABLE_ELEMENT__POTENCY = eINSTANCE.getPInstantiableElement_Potency();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PPackageImpl <em>PPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PPackageImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPPackage()
		 * @generated
		 */
		EClass PPACKAGE = eINSTANCE.getPPackage();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PConnectorImpl <em>PConnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PConnectorImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPConnector()
		 * @generated
		 */
		EClass PCONNECTOR = eINSTANCE.getPConnector();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCONNECTOR__PARTICIPANTS = eINSTANCE.getPConnector_Participants();

		/**
		 * The meta object literal for the '<em><b>Role Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCONNECTOR__ROLE_NAMES = eINSTANCE.getPConnector_RoleNames();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PFieldImpl <em>PField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PFieldImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPField()
		 * @generated
		 */
		EClass PFIELD = eINSTANCE.getPField();

		/**
		 * The meta object literal for the '<em><b>Dual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFIELD__DUAL = eINSTANCE.getPField_Dual();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFIELD__UNIQUE = eINSTANCE.getPField_Unique();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFIELD__DATA_TYPE = eINSTANCE.getPField_DataType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFIELD__VALUE = eINSTANCE.getPField_Value();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFIELD__MULTIPLICITY_LOWER = eINSTANCE.getPField_MultiplicityLower();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFIELD__MULTIPLICITY_UPPER = eINSTANCE.getPField_MultiplicityUpper();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PClabjectImpl <em>PClabject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PClabjectImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPClabject()
		 * @generated
		 */
		EClass PCLABJECT = eINSTANCE.getPClabject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCLABJECT__TYPE = eINSTANCE.getPClabject_Type();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCLABJECT__SUPER_TYPE = eINSTANCE.getPClabject_SuperType();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PMethodImpl <em>PMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PMethodImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPMethod()
		 * @generated
		 */
		EClass PMETHOD = eINSTANCE.getPMethod();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PMETHOD__BODY = eINSTANCE.getPMethod_Body();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMETHOD__INPUT = eINSTANCE.getPMethod_Input();

		/**
		 * The meta object literal for the '<em><b>Out Put</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PMETHOD__OUT_PUT = eINSTANCE.getPMethod_OutPut();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PNodeImpl <em>PNode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PNodeImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPNode()
		 * @generated
		 */
		EClass PNODE = eINSTANCE.getPNode();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PRelationshipImpl <em>PRelationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PRelationshipImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPRelationship()
		 * @generated
		 */
		EClass PRELATIONSHIP = eINSTANCE.getPRelationship();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Lower</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELATIONSHIP__MULTIPLICITY_LOWER = eINSTANCE.getPRelationship_MultiplicityLower();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Upper</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELATIONSHIP__MULTIPLICITY_UPPER = eINSTANCE.getPRelationship_MultiplicityUpper();

		/**
		 * The meta object literal for the '<em><b>Is Navigable</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELATIONSHIP__IS_NAVIGABLE = eINSTANCE.getPRelationship_IsNavigable();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRELATIONSHIP__IS_ORDERED = eINSTANCE.getPRelationship_IsOrdered();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PGeneralizationImpl <em>PGeneralization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PGeneralizationImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPGeneralization()
		 * @generated
		 */
		EClass PGENERALIZATION = eINSTANCE.getPGeneralization();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PInstantiationImpl <em>PInstantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PInstantiationImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPInstantiation()
		 * @generated
		 */
		EClass PINSTANTIATION = eINSTANCE.getPInstantiation();

		/**
		 * The meta object literal for the '<em><b>Target Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINSTANTIATION__TARGET_LEVEL = eINSTANCE.getPInstantiation_TargetLevel();

		/**
		 * The meta object literal for the '{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelImpl <em>Pan Level Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelImpl
		 * @see uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PanLevelModelPackageImpl#getPanLevelModel()
		 * @generated
		 */
		EClass PAN_LEVEL_MODEL = eINSTANCE.getPanLevelModel();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAN_LEVEL_MODEL__MODEL_ELEMENTS = eINSTANCE.getPanLevelModel_ModelElements();

	}

} //PanLevelModelPackage
