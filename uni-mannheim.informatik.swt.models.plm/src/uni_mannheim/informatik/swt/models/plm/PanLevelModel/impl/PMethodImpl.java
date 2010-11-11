/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PElement;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PMethod;
import uni_mannheim.informatik.swt.models.plm.PanLevelModel.PanLevelModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PMethodImpl#getBody <em>Body</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PMethodImpl#getInput <em>Input</em>}</li>
 *   <li>{@link uni_mannheim.informatik.swt.models.plm.PanLevelModel.impl.PMethodImpl#getOutPut <em>Out Put</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PMethodImpl extends PInstantiableElementImpl implements PMethod {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<PElement> input;

	/**
	 * The cached value of the '{@link #getOutPut() <em>Out Put</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPut()
	 * @generated
	 * @ordered
	 */
	protected EList<PElement> outPut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PanLevelModelPackage.Literals.PMETHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PanLevelModelPackage.PMETHOD__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PElement> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<PElement>(PElement.class, this, PanLevelModelPackage.PMETHOD__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PElement> getOutPut() {
		if (outPut == null) {
			outPut = new EObjectResolvingEList<PElement>(PElement.class, this, PanLevelModelPackage.PMETHOD__OUT_PUT);
		}
		return outPut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PanLevelModelPackage.PMETHOD__BODY:
				return getBody();
			case PanLevelModelPackage.PMETHOD__INPUT:
				return getInput();
			case PanLevelModelPackage.PMETHOD__OUT_PUT:
				return getOutPut();
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
			case PanLevelModelPackage.PMETHOD__BODY:
				setBody((String)newValue);
				return;
			case PanLevelModelPackage.PMETHOD__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends PElement>)newValue);
				return;
			case PanLevelModelPackage.PMETHOD__OUT_PUT:
				getOutPut().clear();
				getOutPut().addAll((Collection<? extends PElement>)newValue);
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
			case PanLevelModelPackage.PMETHOD__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case PanLevelModelPackage.PMETHOD__INPUT:
				getInput().clear();
				return;
			case PanLevelModelPackage.PMETHOD__OUT_PUT:
				getOutPut().clear();
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
			case PanLevelModelPackage.PMETHOD__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case PanLevelModelPackage.PMETHOD__INPUT:
				return input != null && !input.isEmpty();
			case PanLevelModelPackage.PMETHOD__OUT_PUT:
				return outPut != null && !outPut.isEmpty();
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
		result.append(" (body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //PMethodImpl
