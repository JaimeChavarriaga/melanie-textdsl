/**
 */
package ebnfmm.impl;

import ebnfmm.Dummy;
import ebnfmm.EbnfmmPackage;
import ebnfmm.NonReferenceableSymbol;
import ebnfmm.ReferenceableSymbol;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dummy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ebnfmm.impl.DummyImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link ebnfmm.impl.DummyImpl#getContainment <em>Containment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DummyImpl extends EObjectImpl implements Dummy {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected ReferenceableSymbol ref;

	/**
	 * The cached value of the '{@link #getContainment() <em>Containment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainment()
	 * @generated
	 * @ordered
	 */
	protected NonReferenceableSymbol containment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DummyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EbnfmmPackage.Literals.DUMMY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceableSymbol getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (ReferenceableSymbol)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EbnfmmPackage.DUMMY__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceableSymbol basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(ReferenceableSymbol newRef) {
		ReferenceableSymbol oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EbnfmmPackage.DUMMY__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonReferenceableSymbol getContainment() {
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainment(NonReferenceableSymbol newContainment, NotificationChain msgs) {
		NonReferenceableSymbol oldContainment = containment;
		containment = newContainment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EbnfmmPackage.DUMMY__CONTAINMENT, oldContainment, newContainment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainment(NonReferenceableSymbol newContainment) {
		if (newContainment != containment) {
			NotificationChain msgs = null;
			if (containment != null)
				msgs = ((InternalEObject)containment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EbnfmmPackage.DUMMY__CONTAINMENT, null, msgs);
			if (newContainment != null)
				msgs = ((InternalEObject)newContainment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EbnfmmPackage.DUMMY__CONTAINMENT, null, msgs);
			msgs = basicSetContainment(newContainment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EbnfmmPackage.DUMMY__CONTAINMENT, newContainment, newContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EbnfmmPackage.DUMMY__CONTAINMENT:
				return basicSetContainment(null, msgs);
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
			case EbnfmmPackage.DUMMY__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case EbnfmmPackage.DUMMY__CONTAINMENT:
				return getContainment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EbnfmmPackage.DUMMY__REF:
				setRef((ReferenceableSymbol)newValue);
				return;
			case EbnfmmPackage.DUMMY__CONTAINMENT:
				setContainment((NonReferenceableSymbol)newValue);
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
			case EbnfmmPackage.DUMMY__REF:
				setRef((ReferenceableSymbol)null);
				return;
			case EbnfmmPackage.DUMMY__CONTAINMENT:
				setContainment((NonReferenceableSymbol)null);
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
			case EbnfmmPackage.DUMMY__REF:
				return ref != null;
			case EbnfmmPackage.DUMMY__CONTAINMENT:
				return containment != null;
		}
		return super.eIsSet(featureID);
	}

} //DummyImpl
