/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ConnectionImpl#isTransitive <em>Transitive</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ConnectionImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ConnectionImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ConnectionImpl#getIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ConnectionImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ConnectionImpl#getRoleName <em>Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends ClabjectImpl implements Connection {
	/**
	 * The default value of the '{@link #isTransitive() <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransitive() <em>Transitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransitive()
	 * @generated
	 * @ordered
	 */
	protected boolean transitive = TRANSITIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> upper;

	/**
	 * The cached value of the '{@link #getIsNavigable() <em>Is Navigable</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> isNavigable;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> participant;

	/**
	 * The cached value of the '{@link #getRoleName() <em>Role Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> roleName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransitive() {
		return transitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitive(boolean newTransitive) {
		boolean oldTransitive = transitive;
		transitive = newTransitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.CONNECTION__TRANSITIVE, oldTransitive, transitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getLower() {
		if (lower == null) {
			lower = new EDataTypeEList<Integer>(Integer.class, this, PLMPackage.CONNECTION__LOWER);
		}
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getUpper() {
		if (upper == null) {
			upper = new EDataTypeEList<Integer>(Integer.class, this, PLMPackage.CONNECTION__UPPER);
		}
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getIsNavigable() {
		if (isNavigable == null) {
			isNavigable = new EDataTypeEList<Boolean>(Boolean.class, this, PLMPackage.CONNECTION__IS_NAVIGABLE);
		}
		return isNavigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Clabject> getParticipant() {
		if (participant == null) {
			participant = new EObjectResolvingEList<Clabject>(Clabject.class, this, PLMPackage.CONNECTION__PARTICIPANT){
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				protected boolean isUnique() {
					return false;
				};
			};
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoleName() {
		if (roleName == null) {
			roleName = new EDataTypeEList<String>(String.class, this, PLMPackage.CONNECTION__ROLE_NAME);
		}
		return roleName;
	}

	/**
	 * The cached invocation delegate for the '{@link #getParticipantForRoleName(java.lang.String) <em>Get Participant For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantForRoleName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_PARTICIPANT_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CONNECTION___GET_PARTICIPANT_FOR_ROLE_NAME__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject getParticipantForRoleName(String roleName) {
		try {
			return (Clabject)GET_PARTICIPANT_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{roleName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getRoleNameForParticipant(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) <em>Get Role Name For Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleNameForParticipant(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ROLE_NAME_FOR_PARTICIPANT_CLABJECT__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CONNECTION___GET_ROLE_NAME_FOR_PARTICIPANT__CLABJECT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getRoleNameForParticipant(Clabject participant) {
		try {
			return (EList<String>)GET_ROLE_NAME_FOR_PARTICIPANT_CLABJECT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{participant}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isNavigableForRoleName(java.lang.String) <em>Is Navigable For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigableForRoleName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_NAVIGABLE_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CONNECTION___IS_NAVIGABLE_FOR_ROLE_NAME__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigableForRoleName(String roleName) {
		try {
			return (Boolean)IS_NAVIGABLE_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{roleName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getLowerForRoleName(java.lang.String) <em>Get Lower For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerForRoleName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_LOWER_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CONNECTION___GET_LOWER_FOR_ROLE_NAME__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerForRoleName(String roleName) {
		try {
			return (Integer)GET_LOWER_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{roleName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getUpperForRoleName(java.lang.String) <em>Get Upper For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperForRoleName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_UPPER_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CONNECTION___GET_UPPER_FOR_ROLE_NAME__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperForRoleName(String roleName) {
		try {
			return (Integer)GET_UPPER_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{roleName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getDomain() <em>Get Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_DOMAIN__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CONNECTION___GET_DOMAIN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getDomain() {
		try {
			return (EList<Clabject>)GET_DOMAIN__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getNotDomain() <em>Get Not Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotDomain()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_NOT_DOMAIN__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CONNECTION___GET_NOT_DOMAIN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getNotDomain() {
		try {
			return (EList<Clabject>)GET_NOT_DOMAIN__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getHumanReadableName() <em>Get Human Readable Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanReadableName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_HUMAN_READABLE_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CONNECTION___GET_HUMAN_READABLE_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHumanReadableName() {
		try {
			return (String)GET_HUMAN_READABLE_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case PLMPackage.CONNECTION__TRANSITIVE:
				return isTransitive();
			case PLMPackage.CONNECTION__LOWER:
				return getLower();
			case PLMPackage.CONNECTION__UPPER:
				return getUpper();
			case PLMPackage.CONNECTION__IS_NAVIGABLE:
				return getIsNavigable();
			case PLMPackage.CONNECTION__PARTICIPANT:
				return getParticipant();
			case PLMPackage.CONNECTION__ROLE_NAME:
				return getRoleName();
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
			case PLMPackage.CONNECTION__TRANSITIVE:
				setTransitive((Boolean)newValue);
				return;
			case PLMPackage.CONNECTION__LOWER:
				getLower().clear();
				getLower().addAll((Collection<? extends Integer>)newValue);
				return;
			case PLMPackage.CONNECTION__UPPER:
				getUpper().clear();
				getUpper().addAll((Collection<? extends Integer>)newValue);
				return;
			case PLMPackage.CONNECTION__IS_NAVIGABLE:
				getIsNavigable().clear();
				getIsNavigable().addAll((Collection<? extends Boolean>)newValue);
				return;
			case PLMPackage.CONNECTION__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends Clabject>)newValue);
				return;
			case PLMPackage.CONNECTION__ROLE_NAME:
				getRoleName().clear();
				getRoleName().addAll((Collection<? extends String>)newValue);
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
			case PLMPackage.CONNECTION__TRANSITIVE:
				setTransitive(TRANSITIVE_EDEFAULT);
				return;
			case PLMPackage.CONNECTION__LOWER:
				getLower().clear();
				return;
			case PLMPackage.CONNECTION__UPPER:
				getUpper().clear();
				return;
			case PLMPackage.CONNECTION__IS_NAVIGABLE:
				getIsNavigable().clear();
				return;
			case PLMPackage.CONNECTION__PARTICIPANT:
				getParticipant().clear();
				return;
			case PLMPackage.CONNECTION__ROLE_NAME:
				getRoleName().clear();
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
			case PLMPackage.CONNECTION__TRANSITIVE:
				return transitive != TRANSITIVE_EDEFAULT;
			case PLMPackage.CONNECTION__LOWER:
				return lower != null && !lower.isEmpty();
			case PLMPackage.CONNECTION__UPPER:
				return upper != null && !upper.isEmpty();
			case PLMPackage.CONNECTION__IS_NAVIGABLE:
				return isNavigable != null && !isNavigable.isEmpty();
			case PLMPackage.CONNECTION__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case PLMPackage.CONNECTION__ROLE_NAME:
				return roleName != null && !roleName.isEmpty();
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
			case PLMPackage.CONNECTION___GET_PARTICIPANT_FOR_ROLE_NAME__STRING:
				return getParticipantForRoleName((String)arguments.get(0));
			case PLMPackage.CONNECTION___GET_ROLE_NAME_FOR_PARTICIPANT__CLABJECT:
				return getRoleNameForParticipant((Clabject)arguments.get(0));
			case PLMPackage.CONNECTION___IS_NAVIGABLE_FOR_ROLE_NAME__STRING:
				return isNavigableForRoleName((String)arguments.get(0));
			case PLMPackage.CONNECTION___GET_LOWER_FOR_ROLE_NAME__STRING:
				return getLowerForRoleName((String)arguments.get(0));
			case PLMPackage.CONNECTION___GET_UPPER_FOR_ROLE_NAME__STRING:
				return getUpperForRoleName((String)arguments.get(0));
			case PLMPackage.CONNECTION___GET_DOMAIN:
				return getDomain();
			case PLMPackage.CONNECTION___GET_NOT_DOMAIN:
				return getNotDomain();
			case PLMPackage.CONNECTION___GET_HUMAN_READABLE_NAME:
				return getHumanReadableName();
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
		result.append(" (transitive: ");
		result.append(transitive);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", isNavigable: ");
		result.append(isNavigable);
		result.append(", roleName: ");
		result.append(roleName);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
