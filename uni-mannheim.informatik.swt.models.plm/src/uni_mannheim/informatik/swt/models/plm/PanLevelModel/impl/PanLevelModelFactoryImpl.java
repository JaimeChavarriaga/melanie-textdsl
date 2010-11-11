/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uni_mannheim.informatik.swt.models.plm.PanLevelModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PanLevelModelFactoryImpl extends EFactoryImpl implements PanLevelModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PanLevelModelFactory init() {
		try {
			PanLevelModelFactory thePanLevelModelFactory = (PanLevelModelFactory)EPackage.Registry.INSTANCE.getEFactory("uni-mannheim.informatik.swt.models/plm"); 
			if (thePanLevelModelFactory != null) {
				return thePanLevelModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PanLevelModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanLevelModelFactoryImpl() {
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
			case PanLevelModelPackage.PELEMENT: return createPElement();
			case PanLevelModelPackage.PLEVEL_SPECIFIC_ELEMENT: return createPLevelSpecificElement();
			case PanLevelModelPackage.PMODULE: return createPModule();
			case PanLevelModelPackage.PINSTANTIABLE_ELEMENT: return createPInstantiableElement();
			case PanLevelModelPackage.PPACKAGE: return createPPackage();
			case PanLevelModelPackage.PCONNECTOR: return createPConnector();
			case PanLevelModelPackage.PFIELD: return createPField();
			case PanLevelModelPackage.PCLABJECT: return createPClabject();
			case PanLevelModelPackage.PMETHOD: return createPMethod();
			case PanLevelModelPackage.PNODE: return createPNode();
			case PanLevelModelPackage.PRELATIONSHIP: return createPRelationship();
			case PanLevelModelPackage.PGENERALIZATION: return createPGeneralization();
			case PanLevelModelPackage.PINSTANTIATION: return createPInstantiation();
			case PanLevelModelPackage.PAN_LEVEL_MODEL: return createPanLevelModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PElement createPElement() {
		PElementImpl pElement = new PElementImpl();
		return pElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLevelSpecificElement createPLevelSpecificElement() {
		PLevelSpecificElementImpl pLevelSpecificElement = new PLevelSpecificElementImpl();
		return pLevelSpecificElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PModule createPModule() {
		PModuleImpl pModule = new PModuleImpl();
		return pModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PInstantiableElement createPInstantiableElement() {
		PInstantiableElementImpl pInstantiableElement = new PInstantiableElementImpl();
		return pInstantiableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPackage createPPackage() {
		PPackageImpl pPackage = new PPackageImpl();
		return pPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PConnector createPConnector() {
		PConnectorImpl pConnector = new PConnectorImpl();
		return pConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PField createPField() {
		PFieldImpl pField = new PFieldImpl();
		return pField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PClabject createPClabject() {
		PClabjectImpl pClabject = new PClabjectImpl();
		return pClabject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PMethod createPMethod() {
		PMethodImpl pMethod = new PMethodImpl();
		return pMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PNode createPNode() {
		PNodeImpl pNode = new PNodeImpl();
		return pNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRelationship createPRelationship() {
		PRelationshipImpl pRelationship = new PRelationshipImpl();
		return pRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGeneralization createPGeneralization() {
		PGeneralizationImpl pGeneralization = new PGeneralizationImpl();
		return pGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PInstantiation createPInstantiation() {
		PInstantiationImpl pInstantiation = new PInstantiationImpl();
		return pInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanLevelModel createPanLevelModel() {
		PanLevelModelImpl panLevelModel = new PanLevelModelImpl();
		return panLevelModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PanLevelModelPackage getPanLevelModelPackage() {
		return (PanLevelModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PanLevelModelPackage getPackage() {
		return PanLevelModelPackage.eINSTANCE;
	}

} //PanLevelModelFactoryImpl
