/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.nodels.plm.PLM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uni_mannheim.informatik.swt.nodels.plm.PLM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage
 * @generated
 */
public class PLMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PLMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PLMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLMSwitch<Adapter> modelSwitch =
		new PLMSwitch<Adapter>() {
			@Override
			public Adapter casePElement(PElement object) {
				return createPElementAdapter();
			}
			@Override
			public Adapter casePLevelSpecificElement(PLevelSpecificElement object) {
				return createPLevelSpecificElementAdapter();
			}
			@Override
			public Adapter casePModule(PModule object) {
				return createPModuleAdapter();
			}
			@Override
			public Adapter casePInstantiableElement(PInstantiableElement object) {
				return createPInstantiableElementAdapter();
			}
			@Override
			public Adapter casePPackage(PPackage object) {
				return createPPackageAdapter();
			}
			@Override
			public Adapter casePConnector(PConnector object) {
				return createPConnectorAdapter();
			}
			@Override
			public Adapter casePField(PField object) {
				return createPFieldAdapter();
			}
			@Override
			public Adapter casePClabject(PClabject object) {
				return createPClabjectAdapter();
			}
			@Override
			public Adapter casePMethod(PMethod object) {
				return createPMethodAdapter();
			}
			@Override
			public Adapter casePNode(PNode object) {
				return createPNodeAdapter();
			}
			@Override
			public Adapter casePRelationship(PRelationship object) {
				return createPRelationshipAdapter();
			}
			@Override
			public Adapter casePGeneralization(PGeneralization object) {
				return createPGeneralizationAdapter();
			}
			@Override
			public Adapter casePInstantiation(PInstantiation object) {
				return createPInstantiationAdapter();
			}
			@Override
			public Adapter casePanLevelModel(PanLevelModel object) {
				return createPanLevelModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PElement <em>PElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PElement
	 * @generated
	 */
	public Adapter createPElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PLevelSpecificElement <em>PLevel Specific Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLevelSpecificElement
	 * @generated
	 */
	public Adapter createPLevelSpecificElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PModule <em>PModule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PModule
	 * @generated
	 */
	public Adapter createPModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PInstantiableElement <em>PInstantiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PInstantiableElement
	 * @generated
	 */
	public Adapter createPInstantiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PPackage <em>PPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PPackage
	 * @generated
	 */
	public Adapter createPPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PConnector <em>PConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PConnector
	 * @generated
	 */
	public Adapter createPConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PField <em>PField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PField
	 * @generated
	 */
	public Adapter createPFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PClabject <em>PClabject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PClabject
	 * @generated
	 */
	public Adapter createPClabjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PMethod <em>PMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PMethod
	 * @generated
	 */
	public Adapter createPMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PNode <em>PNode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PNode
	 * @generated
	 */
	public Adapter createPNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PRelationship <em>PRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PRelationship
	 * @generated
	 */
	public Adapter createPRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PGeneralization <em>PGeneralization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PGeneralization
	 * @generated
	 */
	public Adapter createPGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PInstantiation <em>PInstantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PInstantiation
	 * @generated
	 */
	public Adapter createPInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PanLevelModel <em>Pan Level Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PanLevelModel
	 * @generated
	 */
	public Adapter createPanLevelModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PLMAdapterFactory
