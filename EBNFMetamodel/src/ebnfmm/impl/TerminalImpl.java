/**
 */
package ebnfmm.impl;

import ebnfmm.EbnfmmPackage;
import ebnfmm.Terminal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ebnfmm.impl.TerminalImpl#getTerminalString <em>Terminal String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalImpl extends NonReferenceableSymbolImpl implements Terminal {
	/**
	 * The default value of the '{@link #getTerminalString() <em>Terminal String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalString()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMINAL_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTerminalString() <em>Terminal String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalString()
	 * @generated
	 * @ordered
	 */
	protected String terminalString = TERMINAL_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EbnfmmPackage.Literals.TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerminalString() {
		return terminalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminalString(String newTerminalString) {
		String oldTerminalString = terminalString;
		terminalString = newTerminalString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EbnfmmPackage.TERMINAL__TERMINAL_STRING, oldTerminalString, terminalString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EbnfmmPackage.TERMINAL__TERMINAL_STRING:
				return getTerminalString();
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
			case EbnfmmPackage.TERMINAL__TERMINAL_STRING:
				setTerminalString((String)newValue);
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
			case EbnfmmPackage.TERMINAL__TERMINAL_STRING:
				setTerminalString(TERMINAL_STRING_EDEFAULT);
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
			case EbnfmmPackage.TERMINAL__TERMINAL_STRING:
				return TERMINAL_STRING_EDEFAULT == null ? terminalString != null : !TERMINAL_STRING_EDEFAULT.equals(terminalString);
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
		result.append(" (terminalString: ");
		result.append(terminalString);
		result.append(')');
		return result.toString();
	}

} //TerminalImpl
