/**
 */
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.LMLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.impl.AbstractVisualizerImpl;

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual DSL Visualizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.impl.TextualDSLVisualizerImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualDSLVisualizerImpl extends AbstractVisualizerImpl implements TextualDSLVisualizer {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<TextualVisualizationDescriptor> content;
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
	public EList<TextualVisualizationDescriptor> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<TextualVisualizationDescriptor>(TextualVisualizationDescriptor.class, this, TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER__CONTENT);
		}
		return content;
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
	 * The cached invocation delegate for the '{@link #getContainingPLMElement() <em>Get Containing PLM Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingPLMElement()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CONTAINING_PLM_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)TextualrepresentationPackage.Literals.TEXTUAL_DSL_VISUALIZER___GET_CONTAINING_PLM_ELEMENT).getInvocationDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getContainingPLMElement() {
		try {
			return (Element)GET_CONTAINING_PLM_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getContainingLMLVisualizer() <em>Get Containing LML Visualizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingLMLVisualizer()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CONTAINING_LML_VISUALIZER__EINVOCATION_DELEGATE = ((EOperation.Internal)TextualrepresentationPackage.Literals.TEXTUAL_DSL_VISUALIZER___GET_CONTAINING_LML_VISUALIZER).getInvocationDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LMLVisualizer getContainingLMLVisualizer() {
		try {
			return (LMLVisualizer)GET_CONTAINING_LML_VISUALIZER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER__CONTENT:
				return getContent();
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
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends TextualVisualizationDescriptor>)newValue);
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
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER__CONTENT:
				getContent().clear();
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
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER__CONTENT:
				return content != null && !content.isEmpty();
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
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER___GET_CONTAINING_PLM_ELEMENT:
				return getContainingPLMElement();
			case TextualrepresentationPackage.TEXTUAL_DSL_VISUALIZER___GET_CONTAINING_LML_VISUALIZER:
				return getContainingLMLVisualizer();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TextualDSLVisualizerImpl
