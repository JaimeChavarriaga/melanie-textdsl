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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ElementImpl#isExpressed <em>Expressed</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ElementImpl#isRelevant <em>Relevant</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ElementImpl#getVisualizer <em>Visualizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementImpl extends EObjectImpl implements Element {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isExpressed() <em>Expressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpressed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPRESSED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isExpressed() <em>Expressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpressed()
	 * @generated
	 * @ordered
	 */
	protected boolean expressed = EXPRESSED_EDEFAULT;

	/**
	 * The default value of the '{@link #isRelevant() <em>Relevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelevant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELEVANT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRelevant() <em>Relevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelevant()
	 * @generated
	 * @ordered
	 */
	protected boolean relevant = RELEVANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisualizer() <em>Visualizer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizer()
	 * @generated
	 * @ordered
	 */
	protected EList<Visualizer> visualizer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExpressed() {
		return expressed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressed(boolean newExpressed) {
		boolean oldExpressed = expressed;
		expressed = newExpressed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.ELEMENT__EXPRESSED, oldExpressed, expressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRelevant() {
		return relevant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelevant(boolean newRelevant) {
		boolean oldRelevant = relevant;
		relevant = newRelevant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.ELEMENT__RELEVANT, oldRelevant, relevant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Visualizer> getVisualizer() {
		if (visualizer == null) {
			visualizer = new EObjectContainmentEList<Visualizer>(Visualizer.class, this, PLMPackage.ELEMENT__VISUALIZER);
		}
		return visualizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PLMPackage.ELEMENT__VISUALIZER:
				return ((InternalEList<?>)getVisualizer()).basicRemove(otherEnd, msgs);
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
			case PLMPackage.ELEMENT__NAME:
				return getName();
			case PLMPackage.ELEMENT__EXPRESSED:
				return isExpressed();
			case PLMPackage.ELEMENT__RELEVANT:
				return isRelevant();
			case PLMPackage.ELEMENT__VISUALIZER:
				return getVisualizer();
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
			case PLMPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case PLMPackage.ELEMENT__EXPRESSED:
				setExpressed((Boolean)newValue);
				return;
			case PLMPackage.ELEMENT__RELEVANT:
				setRelevant((Boolean)newValue);
				return;
			case PLMPackage.ELEMENT__VISUALIZER:
				getVisualizer().clear();
				getVisualizer().addAll((Collection<? extends Visualizer>)newValue);
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
			case PLMPackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PLMPackage.ELEMENT__EXPRESSED:
				setExpressed(EXPRESSED_EDEFAULT);
				return;
			case PLMPackage.ELEMENT__RELEVANT:
				setRelevant(RELEVANT_EDEFAULT);
				return;
			case PLMPackage.ELEMENT__VISUALIZER:
				getVisualizer().clear();
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
			case PLMPackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PLMPackage.ELEMENT__EXPRESSED:
				return expressed != EXPRESSED_EDEFAULT;
			case PLMPackage.ELEMENT__RELEVANT:
				return relevant != RELEVANT_EDEFAULT;
			case PLMPackage.ELEMENT__VISUALIZER:
				return visualizer != null && !visualizer.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", expressed: ");
		result.append(expressed);
		result.append(", relevant: ");
		result.append(relevant);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
