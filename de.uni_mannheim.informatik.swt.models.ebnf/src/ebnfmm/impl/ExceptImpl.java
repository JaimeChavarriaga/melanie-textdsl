/**
 */
package ebnfmm.impl;

import ebnfmm.EbnfmmPackage;
import ebnfmm.Except;
import ebnfmm.Symbol;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Except</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ebnfmm.impl.ExceptImpl#getExcept <em>Except</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptImpl extends ControlImpl implements Except {
	/**
	 * The cached value of the '{@link #getExcept() <em>Except</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcept()
	 * @generated
	 * @ordered
	 */
	protected Symbol except;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EbnfmmPackage.Literals.EXCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getExcept() {
		return except;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcept(Symbol newExcept, NotificationChain msgs) {
		Symbol oldExcept = except;
		except = newExcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EbnfmmPackage.EXCEPT__EXCEPT, oldExcept, newExcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcept(Symbol newExcept) {
		if (newExcept != except) {
			NotificationChain msgs = null;
			if (except != null)
				msgs = ((InternalEObject)except).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EbnfmmPackage.EXCEPT__EXCEPT, null, msgs);
			if (newExcept != null)
				msgs = ((InternalEObject)newExcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EbnfmmPackage.EXCEPT__EXCEPT, null, msgs);
			msgs = basicSetExcept(newExcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EbnfmmPackage.EXCEPT__EXCEPT, newExcept, newExcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EbnfmmPackage.EXCEPT__EXCEPT:
				return basicSetExcept(null, msgs);
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
			case EbnfmmPackage.EXCEPT__EXCEPT:
				return getExcept();
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
			case EbnfmmPackage.EXCEPT__EXCEPT:
				setExcept((Symbol)newValue);
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
			case EbnfmmPackage.EXCEPT__EXCEPT:
				setExcept((Symbol)null);
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
			case EbnfmmPackage.EXCEPT__EXCEPT:
				return except != null;
		}
		return super.eIsSet(featureID);
	}

} //ExceptImpl
