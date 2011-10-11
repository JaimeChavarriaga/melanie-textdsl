/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.LabelDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.Link;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkImpl#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends ShapeDescriptorImpl implements Link {
	/**
	 * The cached value of the '{@link #getDecoration() <em>Decoration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoration()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkDecoration> decoration;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<LabelDescriptor> label;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkDecoration> getDecoration() {
		if (decoration == null) {
			decoration = new EObjectContainmentEList<LinkDecoration>(LinkDecoration.class, this, VisualizationPackage.LINK__DECORATION);
		}
		return decoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelDescriptor> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<LabelDescriptor>(LabelDescriptor.class, this, VisualizationPackage.LINK__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkDecoration getLinkDecorationForRoleName(String roleName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelDescriptor getLabelDescriptorForRoleName(String roleName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualizationPackage.LINK__DECORATION:
				return ((InternalEList<?>)getDecoration()).basicRemove(otherEnd, msgs);
			case VisualizationPackage.LINK__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
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
			case VisualizationPackage.LINK__DECORATION:
				return getDecoration();
			case VisualizationPackage.LINK__LABEL:
				return getLabel();
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
			case VisualizationPackage.LINK__DECORATION:
				getDecoration().clear();
				getDecoration().addAll((Collection<? extends LinkDecoration>)newValue);
				return;
			case VisualizationPackage.LINK__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelDescriptor>)newValue);
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
			case VisualizationPackage.LINK__DECORATION:
				getDecoration().clear();
				return;
			case VisualizationPackage.LINK__LABEL:
				getLabel().clear();
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
			case VisualizationPackage.LINK__DECORATION:
				return decoration != null && !decoration.isEmpty();
			case VisualizationPackage.LINK__LABEL:
				return label != null && !label.isEmpty();
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
			case VisualizationPackage.LINK___GET_LINK_DECORATION_FOR_ROLE_NAME__STRING:
				return getLinkDecorationForRoleName((String)arguments.get(0));
			case VisualizationPackage.LINK___GET_LABEL_DESCRIPTOR_FOR_ROLE_NAME__STRING:
				return getLabelDescriptorForRoleName((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LinkImpl
