/**
 */
package ebnfmm.impl;

import ebnfmm.EbnfmmPackage;
import ebnfmm.NonTerminal;
import ebnfmm.Rule;
import ebnfmm.Symbol;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ebnfmm.impl.RuleImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link ebnfmm.impl.RuleImpl#getMetaIdentifier <em>Meta Identifier</em>}</li>
 *   <li>{@link ebnfmm.impl.RuleImpl#getDefinitionList <em>Definition List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected NonTerminal eReference0;

	/**
	 * The cached value of the '{@link #getMetaIdentifier() <em>Meta Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaIdentifier()
	 * @generated
	 * @ordered
	 */
	protected NonTerminal metaIdentifier;

	/**
	 * The cached value of the '{@link #getDefinitionList() <em>Definition List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionList()
	 * @generated
	 * @ordered
	 */
	protected EList<Symbol> definitionList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EbnfmmPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTerminal getEReference0() {
		if (eReference0 != null && eReference0.eIsProxy()) {
			InternalEObject oldEReference0 = (InternalEObject)eReference0;
			eReference0 = (NonTerminal)eResolveProxy(oldEReference0);
			if (eReference0 != oldEReference0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EbnfmmPackage.RULE__EREFERENCE0, oldEReference0, eReference0));
			}
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTerminal basicGetEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(NonTerminal newEReference0) {
		NonTerminal oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EbnfmmPackage.RULE__EREFERENCE0, oldEReference0, eReference0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTerminal getMetaIdentifier() {
		return metaIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaIdentifier(NonTerminal newMetaIdentifier, NotificationChain msgs) {
		NonTerminal oldMetaIdentifier = metaIdentifier;
		metaIdentifier = newMetaIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EbnfmmPackage.RULE__META_IDENTIFIER, oldMetaIdentifier, newMetaIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaIdentifier(NonTerminal newMetaIdentifier) {
		if (newMetaIdentifier != metaIdentifier) {
			NotificationChain msgs = null;
			if (metaIdentifier != null)
				msgs = ((InternalEObject)metaIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EbnfmmPackage.RULE__META_IDENTIFIER, null, msgs);
			if (newMetaIdentifier != null)
				msgs = ((InternalEObject)newMetaIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EbnfmmPackage.RULE__META_IDENTIFIER, null, msgs);
			msgs = basicSetMetaIdentifier(newMetaIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EbnfmmPackage.RULE__META_IDENTIFIER, newMetaIdentifier, newMetaIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Symbol> getDefinitionList() {
		if (definitionList == null) {
			definitionList = new EObjectResolvingEList<Symbol>(Symbol.class, this, EbnfmmPackage.RULE__DEFINITION_LIST);
		}
		return definitionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EbnfmmPackage.RULE__META_IDENTIFIER:
				return basicSetMetaIdentifier(null, msgs);
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
			case EbnfmmPackage.RULE__EREFERENCE0:
				if (resolve) return getEReference0();
				return basicGetEReference0();
			case EbnfmmPackage.RULE__META_IDENTIFIER:
				return getMetaIdentifier();
			case EbnfmmPackage.RULE__DEFINITION_LIST:
				return getDefinitionList();
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
			case EbnfmmPackage.RULE__EREFERENCE0:
				setEReference0((NonTerminal)newValue);
				return;
			case EbnfmmPackage.RULE__META_IDENTIFIER:
				setMetaIdentifier((NonTerminal)newValue);
				return;
			case EbnfmmPackage.RULE__DEFINITION_LIST:
				getDefinitionList().clear();
				getDefinitionList().addAll((Collection<? extends Symbol>)newValue);
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
			case EbnfmmPackage.RULE__EREFERENCE0:
				setEReference0((NonTerminal)null);
				return;
			case EbnfmmPackage.RULE__META_IDENTIFIER:
				setMetaIdentifier((NonTerminal)null);
				return;
			case EbnfmmPackage.RULE__DEFINITION_LIST:
				getDefinitionList().clear();
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
			case EbnfmmPackage.RULE__EREFERENCE0:
				return eReference0 != null;
			case EbnfmmPackage.RULE__META_IDENTIFIER:
				return metaIdentifier != null;
			case EbnfmmPackage.RULE__DEFINITION_LIST:
				return definitionList != null && !definitionList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleImpl
