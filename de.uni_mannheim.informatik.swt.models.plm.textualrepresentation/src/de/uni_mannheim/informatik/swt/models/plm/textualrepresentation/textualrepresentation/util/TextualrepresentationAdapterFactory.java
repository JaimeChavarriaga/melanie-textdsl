/**
 */
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.util;

import de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractVisualizer;

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage
 * @generated
 */
public class TextualrepresentationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TextualrepresentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualrepresentationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TextualrepresentationPackage.eINSTANCE;
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
	protected TextualrepresentationSwitch<Adapter> modelSwitch =
		new TextualrepresentationSwitch<Adapter>() {
			@Override
			public Adapter caseTextualDSLVisualizer(TextualDSLVisualizer object) {
				return createTextualDSLVisualizerAdapter();
			}
			@Override
			public Adapter caseTextualVisualizationDescriptor(TextualVisualizationDescriptor object) {
				return createTextualVisualizationDescriptorAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseAbstractVisualizer(AbstractVisualizer object) {
				return createAbstractVisualizerAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer <em>Textual DSL Visualizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer
	 * @generated
	 */
	public Adapter createTextualDSLVisualizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor <em>Textual Visualization Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor
	 * @generated
	 */
	public Adapter createTextualVisualizationDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractVisualizer <em>Abstract Visualizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractVisualizer
	 * @generated
	 */
	public Adapter createAbstractVisualizerAdapter() {
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

} //TextualrepresentationAdapterFactory
