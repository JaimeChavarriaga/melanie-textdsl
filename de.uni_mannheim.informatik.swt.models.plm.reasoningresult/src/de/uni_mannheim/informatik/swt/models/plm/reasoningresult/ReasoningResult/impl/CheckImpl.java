/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.CheckImpl#isResult <em>Result</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.CheckImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.CheckImpl#isRootCause <em>Root Cause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CheckImpl extends EObjectImpl implements Check {
	/**
	 * The default value of the '{@link #isResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResult()
	 * @generated
	 * @ordered
	 */
	protected boolean result = RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRootCause() <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRootCause()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROOT_CAUSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRootCause() <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRootCause()
	 * @generated
	 * @ordered
	 */
	protected boolean rootCause = ROOT_CAUSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReasoningResultPackage.Literals.CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(boolean newResult) {
		boolean oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.CHECK__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.CHECK__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRootCause() {
		return rootCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootCause(boolean newRootCause) {
		boolean oldRootCause = rootCause;
		rootCause = newRootCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReasoningResultPackage.CHECK__ROOT_CAUSE, oldRootCause, rootCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReasoningResultPackage.CHECK__RESULT:
				return isResult();
			case ReasoningResultPackage.CHECK__EXPRESSION:
				return getExpression();
			case ReasoningResultPackage.CHECK__ROOT_CAUSE:
				return isRootCause();
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
			case ReasoningResultPackage.CHECK__RESULT:
				setResult((Boolean)newValue);
				return;
			case ReasoningResultPackage.CHECK__EXPRESSION:
				setExpression((String)newValue);
				return;
			case ReasoningResultPackage.CHECK__ROOT_CAUSE:
				setRootCause((Boolean)newValue);
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
			case ReasoningResultPackage.CHECK__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case ReasoningResultPackage.CHECK__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case ReasoningResultPackage.CHECK__ROOT_CAUSE:
				setRootCause(ROOT_CAUSE_EDEFAULT);
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
			case ReasoningResultPackage.CHECK__RESULT:
				return result != RESULT_EDEFAULT;
			case ReasoningResultPackage.CHECK__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case ReasoningResultPackage.CHECK__ROOT_CAUSE:
				return rootCause != ROOT_CAUSE_EDEFAULT;
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
		result.append(" (result: ");
		result.append(result);
		result.append(", expression: ");
		result.append(expression);
		result.append(", rootCause: ");
		result.append(rootCause);
		result.append(')');
		return result.toString();
	}

} //CheckImpl
