/*******************************************************************************
 * Copyright (c) 2011-2013 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nikolai Hellwig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl;

import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Choice;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Control;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.SymbolImpl#getContainingNonTerminal <em>Containing Non Terminal</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.SymbolImpl#getContainingControl <em>Containing Control</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.SymbolImpl#getContainingChoice <em>Containing Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SymbolImpl extends EObjectImpl implements Symbol {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EbnfmmPackage.Literals.SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTerminal getContainingNonTerminal() {
		if (eContainerFeatureID() != EbnfmmPackage.SYMBOL__CONTAINING_NON_TERMINAL) return null;
		return (NonTerminal)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingNonTerminal(NonTerminal newContainingNonTerminal, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingNonTerminal, EbnfmmPackage.SYMBOL__CONTAINING_NON_TERMINAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingNonTerminal(NonTerminal newContainingNonTerminal) {
		if (newContainingNonTerminal != eInternalContainer() || (eContainerFeatureID() != EbnfmmPackage.SYMBOL__CONTAINING_NON_TERMINAL && newContainingNonTerminal != null)) {
			if (EcoreUtil.isAncestor(this, newContainingNonTerminal))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingNonTerminal != null)
				msgs = ((InternalEObject)newContainingNonTerminal).eInverseAdd(this, EbnfmmPackage.NON_TERMINAL__DEFINITION_LIST, NonTerminal.class, msgs);
			msgs = basicSetContainingNonTerminal(newContainingNonTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EbnfmmPackage.SYMBOL__CONTAINING_NON_TERMINAL, newContainingNonTerminal, newContainingNonTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getContainingControl() {
		if (eContainerFeatureID() != EbnfmmPackage.SYMBOL__CONTAINING_CONTROL) return null;
		return (Control)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingControl(Control newContainingControl, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingControl, EbnfmmPackage.SYMBOL__CONTAINING_CONTROL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingControl(Control newContainingControl) {
		if (newContainingControl != eInternalContainer() || (eContainerFeatureID() != EbnfmmPackage.SYMBOL__CONTAINING_CONTROL && newContainingControl != null)) {
			if (EcoreUtil.isAncestor(this, newContainingControl))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingControl != null)
				msgs = ((InternalEObject)newContainingControl).eInverseAdd(this, EbnfmmPackage.CONTROL__DEFINITION_LIST, Control.class, msgs);
			msgs = basicSetContainingControl(newContainingControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EbnfmmPackage.SYMBOL__CONTAINING_CONTROL, newContainingControl, newContainingControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice getContainingChoice() {
		if (eContainerFeatureID() != EbnfmmPackage.SYMBOL__CONTAINING_CHOICE) return null;
		return (Choice)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingChoice(Choice newContainingChoice, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingChoice, EbnfmmPackage.SYMBOL__CONTAINING_CHOICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingChoice(Choice newContainingChoice) {
		if (newContainingChoice != eInternalContainer() || (eContainerFeatureID() != EbnfmmPackage.SYMBOL__CONTAINING_CHOICE && newContainingChoice != null)) {
			if (EcoreUtil.isAncestor(this, newContainingChoice))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingChoice != null)
				msgs = ((InternalEObject)newContainingChoice).eInverseAdd(this, EbnfmmPackage.CHOICE__DEFINITION_LIST, Choice.class, msgs);
			msgs = basicSetContainingChoice(newContainingChoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EbnfmmPackage.SYMBOL__CONTAINING_CHOICE, newContainingChoice, newContainingChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EbnfmmPackage.SYMBOL__CONTAINING_NON_TERMINAL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingNonTerminal((NonTerminal)otherEnd, msgs);
			case EbnfmmPackage.SYMBOL__CONTAINING_CONTROL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingControl((Control)otherEnd, msgs);
			case EbnfmmPackage.SYMBOL__CONTAINING_CHOICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingChoice((Choice)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EbnfmmPackage.SYMBOL__CONTAINING_NON_TERMINAL:
				return basicSetContainingNonTerminal(null, msgs);
			case EbnfmmPackage.SYMBOL__CONTAINING_CONTROL:
				return basicSetContainingControl(null, msgs);
			case EbnfmmPackage.SYMBOL__CONTAINING_CHOICE:
				return basicSetContainingChoice(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EbnfmmPackage.SYMBOL__CONTAINING_NON_TERMINAL:
				return eInternalContainer().eInverseRemove(this, EbnfmmPackage.NON_TERMINAL__DEFINITION_LIST, NonTerminal.class, msgs);
			case EbnfmmPackage.SYMBOL__CONTAINING_CONTROL:
				return eInternalContainer().eInverseRemove(this, EbnfmmPackage.CONTROL__DEFINITION_LIST, Control.class, msgs);
			case EbnfmmPackage.SYMBOL__CONTAINING_CHOICE:
				return eInternalContainer().eInverseRemove(this, EbnfmmPackage.CHOICE__DEFINITION_LIST, Choice.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EbnfmmPackage.SYMBOL__CONTAINING_NON_TERMINAL:
				return getContainingNonTerminal();
			case EbnfmmPackage.SYMBOL__CONTAINING_CONTROL:
				return getContainingControl();
			case EbnfmmPackage.SYMBOL__CONTAINING_CHOICE:
				return getContainingChoice();
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
			case EbnfmmPackage.SYMBOL__CONTAINING_NON_TERMINAL:
				setContainingNonTerminal((NonTerminal)newValue);
				return;
			case EbnfmmPackage.SYMBOL__CONTAINING_CONTROL:
				setContainingControl((Control)newValue);
				return;
			case EbnfmmPackage.SYMBOL__CONTAINING_CHOICE:
				setContainingChoice((Choice)newValue);
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
			case EbnfmmPackage.SYMBOL__CONTAINING_NON_TERMINAL:
				setContainingNonTerminal((NonTerminal)null);
				return;
			case EbnfmmPackage.SYMBOL__CONTAINING_CONTROL:
				setContainingControl((Control)null);
				return;
			case EbnfmmPackage.SYMBOL__CONTAINING_CHOICE:
				setContainingChoice((Choice)null);
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
			case EbnfmmPackage.SYMBOL__CONTAINING_NON_TERMINAL:
				return getContainingNonTerminal() != null;
			case EbnfmmPackage.SYMBOL__CONTAINING_CONTROL:
				return getContainingControl() != null;
			case EbnfmmPackage.SYMBOL__CONTAINING_CHOICE:
				return getContainingChoice() != null;
		}
		return super.eIsSet(featureID);
	}

} //SymbolImpl
