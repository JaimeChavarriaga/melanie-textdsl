/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.util;

import de.uni_mannheim.informatik.swt.models.plm.PLM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage
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
			public Adapter caseLMLModel(LMLModel object) {
				return createLMLModelAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseDomainElement(DomainElement object) {
				return createDomainElementAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseOntology(Ontology object) {
				return createOntologyAdapter();
			}
			@Override
			public Adapter caseOwnedElement(OwnedElement object) {
				return createOwnedElementAdapter();
			}
			@Override
			public Adapter caseLogicalElement(LogicalElement object) {
				return createLogicalElementAdapter();
			}
			@Override
			public Adapter caseSetRelationship(SetRelationship object) {
				return createSetRelationshipAdapter();
			}
			@Override
			public Adapter caseEquality(Equality object) {
				return createEqualityAdapter();
			}
			@Override
			public Adapter caseInversion(Inversion object) {
				return createInversionAdapter();
			}
			@Override
			public Adapter caseComplement(Complement object) {
				return createComplementAdapter();
			}
			@Override
			public Adapter caseGeneralization(Generalization object) {
				return createGeneralizationAdapter();
			}
			@Override
			public Adapter caseBinaryGeneralization(BinaryGeneralization object) {
				return createBinaryGeneralizationAdapter();
			}
			@Override
			public Adapter caseMultipleSpecialization(MultipleSpecialization object) {
				return createMultipleSpecializationAdapter();
			}
			@Override
			public Adapter caseMultipleGeneralization(MultipleGeneralization object) {
				return createMultipleGeneralizationAdapter();
			}
			@Override
			public Adapter caseInstantiation(Instantiation object) {
				return createInstantiationAdapter();
			}
			@Override
			public Adapter caseClabject(Clabject object) {
				return createClabjectAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseVisualizer(Visualizer object) {
				return createVisualizerAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseVisualizationContainer(VisualizationContainer object) {
				return createVisualizationContainerAdapter();
			}
			@Override
			public Adapter caseTopLevelVisualizationContainer(TopLevelVisualizationContainer object) {
				return createTopLevelVisualizationContainerAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel <em>LML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel
	 * @generated
	 */
	public Adapter createLMLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement
	 * @generated
	 */
	public Adapter createDomainElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology
	 * @generated
	 */
	public Adapter createOntologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.OwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.OwnedElement
	 * @generated
	 */
	public Adapter createOwnedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.LogicalElement <em>Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.LogicalElement
	 * @generated
	 */
	public Adapter createLogicalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.SetRelationship <em>Set Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.SetRelationship
	 * @generated
	 */
	public Adapter createSetRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Equality
	 * @generated
	 */
	public Adapter createEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion <em>Inversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Inversion
	 * @generated
	 */
	public Adapter createInversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Complement <em>Complement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Complement
	 * @generated
	 */
	public Adapter createComplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization <em>Binary Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization
	 * @generated
	 */
	public Adapter createBinaryGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization <em>Multiple Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization
	 * @generated
	 */
	public Adapter createMultipleSpecializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization <em>Multiple Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization
	 * @generated
	 */
	public Adapter createMultipleGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation <em>Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation
	 * @generated
	 */
	public Adapter createInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject <em>Clabject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject
	 * @generated
	 */
	public Adapter createClabjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer <em>Visualizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer
	 * @generated
	 */
	public Adapter createVisualizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer <em>Visualization Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer
	 * @generated
	 */
	public Adapter createVisualizationContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer <em>Top Level Visualization Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer
	 * @generated
	 */
	public Adapter createTopLevelVisualizationContainerAdapter() {
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
