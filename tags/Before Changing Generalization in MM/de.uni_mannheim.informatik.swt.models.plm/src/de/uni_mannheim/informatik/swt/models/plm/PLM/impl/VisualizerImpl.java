/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer;

import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationDescriptor;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizerImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizerImpl#getDurability <em>Durability</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizerImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.VisualizerImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisualizerImpl extends EObjectImpl implements Visualizer {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attributes;

	/**
	 * The default value of the '{@link #getDurability() <em>Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurability()
	 * @generated
	 * @ordered
	 */
	protected static final int DURABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDurability() <em>Durability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurability()
	 * @generated
	 * @ordered
	 */
	protected int durability = DURABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected Visualizer template;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<VisualizationDescriptor> child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.VISUALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAttributes() {
		if (attributes == null) {
			attributes = new EDataTypeUniqueEList<String>(String.class, this, PLMPackage.VISUALIZER__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurability() {
		return durability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurability(int newDurability) {
		int oldDurability = durability;
		durability = newDurability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.VISUALIZER__DURABILITY, oldDurability, durability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualizer getTemplate() {
		if (template != null && template.eIsProxy()) {
			InternalEObject oldTemplate = (InternalEObject)template;
			template = (Visualizer)eResolveProxy(oldTemplate);
			if (template != oldTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PLMPackage.VISUALIZER__TEMPLATE, oldTemplate, template));
			}
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualizer basicGetTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Visualizer newTemplate) {
		Visualizer oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.VISUALIZER__TEMPLATE, oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisualizationDescriptor> getChild() {
		if (child == null) {
			child = new EObjectContainmentEList<VisualizationDescriptor>(VisualizationDescriptor.class, this, PLMPackage.VISUALIZER__CHILD);
		}
		return child;
	}

	/**
	 * The cached invocation delegate for the '{@link #getValueForKey(java.lang.String) <em>Get Value For Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueForKey(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_VALUE_FOR_KEY_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.VISUALIZER___GET_VALUE_FOR_KEY__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueForKey(String key) {
		try {
			return (String)GET_VALUE_FOR_KEY_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{key}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getElement() <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.VISUALIZER___GET_ELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		try {
			return (Element)GET_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case PLMPackage.VISUALIZER__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
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
			case PLMPackage.VISUALIZER__ATTRIBUTES:
				return getAttributes();
			case PLMPackage.VISUALIZER__DURABILITY:
				return getDurability();
			case PLMPackage.VISUALIZER__TEMPLATE:
				if (resolve) return getTemplate();
				return basicGetTemplate();
			case PLMPackage.VISUALIZER__CHILD:
				return getChild();
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
			case PLMPackage.VISUALIZER__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case PLMPackage.VISUALIZER__DURABILITY:
				setDurability((Integer)newValue);
				return;
			case PLMPackage.VISUALIZER__TEMPLATE:
				setTemplate((Visualizer)newValue);
				return;
			case PLMPackage.VISUALIZER__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends VisualizationDescriptor>)newValue);
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
			case PLMPackage.VISUALIZER__ATTRIBUTES:
				getAttributes().clear();
				return;
			case PLMPackage.VISUALIZER__DURABILITY:
				setDurability(DURABILITY_EDEFAULT);
				return;
			case PLMPackage.VISUALIZER__TEMPLATE:
				setTemplate((Visualizer)null);
				return;
			case PLMPackage.VISUALIZER__CHILD:
				getChild().clear();
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
			case PLMPackage.VISUALIZER__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case PLMPackage.VISUALIZER__DURABILITY:
				return durability != DURABILITY_EDEFAULT;
			case PLMPackage.VISUALIZER__TEMPLATE:
				return template != null;
			case PLMPackage.VISUALIZER__CHILD:
				return child != null && !child.isEmpty();
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
			case PLMPackage.VISUALIZER___GET_VALUE_FOR_KEY__STRING:
				return getValueForKey((String)arguments.get(0));
			case PLMPackage.VISUALIZER___GET_ELEMENT:
				return getElement();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (attributes: ");
		result.append(attributes);
		result.append(", durability: ");
		result.append(durability);
		result.append(')');
		return result.toString();
	}

} //VisualizerImpl
