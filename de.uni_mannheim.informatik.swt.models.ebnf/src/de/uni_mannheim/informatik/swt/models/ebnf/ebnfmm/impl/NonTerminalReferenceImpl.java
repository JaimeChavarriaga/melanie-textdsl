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

import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminalReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Terminal Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.NonTerminalReferenceImpl#getNonTerminal <em>Non Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonTerminalReferenceImpl extends SymbolImpl implements NonTerminalReference {
	/**
	 * The cached value of the '{@link #getNonTerminal() <em>Non Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonTerminal()
	 * @generated
	 * @ordered
	 */
	protected NonTerminal nonTerminal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonTerminalReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EbnfmmPackage.Literals.NON_TERMINAL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTerminal getNonTerminal() {
		if (nonTerminal != null && nonTerminal.eIsProxy()) {
			InternalEObject oldNonTerminal = (InternalEObject)nonTerminal;
			nonTerminal = (NonTerminal)eResolveProxy(oldNonTerminal);
			if (nonTerminal != oldNonTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EbnfmmPackage.NON_TERMINAL_REFERENCE__NON_TERMINAL, oldNonTerminal, nonTerminal));
			}
		}
		return nonTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTerminal basicGetNonTerminal() {
		return nonTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonTerminal(NonTerminal newNonTerminal) {
		NonTerminal oldNonTerminal = nonTerminal;
		nonTerminal = newNonTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EbnfmmPackage.NON_TERMINAL_REFERENCE__NON_TERMINAL, oldNonTerminal, nonTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EbnfmmPackage.NON_TERMINAL_REFERENCE__NON_TERMINAL:
				if (resolve) return getNonTerminal();
				return basicGetNonTerminal();
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
			case EbnfmmPackage.NON_TERMINAL_REFERENCE__NON_TERMINAL:
				setNonTerminal((NonTerminal)newValue);
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
			case EbnfmmPackage.NON_TERMINAL_REFERENCE__NON_TERMINAL:
				setNonTerminal((NonTerminal)null);
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
			case EbnfmmPackage.NON_TERMINAL_REFERENCE__NON_TERMINAL:
				return nonTerminal != null;
		}
		return super.eIsSet(featureID);
	}

} //NonTerminalReferenceImpl
