/**
 */
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.impl.AbstractVisualizerImpl;

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual DSL Visualizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualDSLVisualizerImpl#getTextualVisualization <em>Textual Visualization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualDSLVisualizerImpl extends AbstractVisualizerImpl implements TextualDSLVisualizer {
	/**
	 * The cached value of the '{@link #getTextualVisualization() <em>Textual Visualization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextualVisualization()
	 * @generated
	 * @ordered
	 */
	protected EList<TextualVisualizationDescriptor> textualVisualization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualDSLVisualizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextualrepresentationPackage.Literals.TEXTUAL_DSL_VISUALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextualVisualizationDescriptor> getTextualVisualization() {
		if (textualVisualization == null) {
			textualVisualization = new EObjectResolvingEList<TextualVisualizationDescriptor>(TextualVisualizationDescriptor.class, this, TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER__TEXTUAL_VISUALIZATION);
		}
		return textualVisualization;
	}

	/**
	 * The cached invocation delegate for the '{@link #createTextualVisualization() <em>Create Textual Visualization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #createTextualVisualization()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CREATE_TEXTUAL_VISUALIZATION__EINVOCATION_DELEGATE = ((EOperation.Internal)TextualrepresentationPackage.Literals.TEXTUAL_DSL_VISUALIZER___CREATE_TEXTUAL_VISUALIZATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextualVisualization() {
		try {
			return (String)CREATE_TEXTUAL_VISUALIZATION__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER__TEXTUAL_VISUALIZATION:
				return getTextualVisualization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER__TEXTUAL_VISUALIZATION:
				getTextualVisualization().clear();
				getTextualVisualization().addAll((Collection<? extends TextualVisualizationDescriptor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER__TEXTUAL_VISUALIZATION:
				getTextualVisualization().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER__TEXTUAL_VISUALIZATION:
				return textualVisualization != null && !textualVisualization.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER___CREATE_TEXTUAL_VISUALIZATION:
				return createTextualVisualization();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TextualDSLVisualizerImpl
