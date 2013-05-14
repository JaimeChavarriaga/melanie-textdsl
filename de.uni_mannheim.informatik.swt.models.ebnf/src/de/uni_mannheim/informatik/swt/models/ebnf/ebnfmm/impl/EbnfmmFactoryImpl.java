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

import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EbnfmmFactoryImpl extends EFactoryImpl implements EbnfmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EbnfmmFactory init() {
		try {
			EbnfmmFactory theEbnfmmFactory = (EbnfmmFactory)EPackage.Registry.INSTANCE.getEFactory(EbnfmmPackage.eNS_URI);
			if (theEbnfmmFactory != null) {
				return theEbnfmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EbnfmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EbnfmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EbnfmmPackage.EBNF_DESCRIPTION: return createEBNFDescription();
			case EbnfmmPackage.NON_TERMINAL: return createNonTerminal();
			case EbnfmmPackage.TERMINAL: return createTerminal();
			case EbnfmmPackage.OPTION: return createOption();
			case EbnfmmPackage.REPETITION: return createRepetition();
			case EbnfmmPackage.NON_TERMINAL_REFERENCE: return createNonTerminalReference();
			case EbnfmmPackage.GROUP: return createGroup();
			case EbnfmmPackage.SPECIAL_SEQUENCE: return createSpecialSequence();
			case EbnfmmPackage.EXCEPT: return createExcept();
			case EbnfmmPackage.CHOOSE: return createChoose();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBNFDescription createEBNFDescription() {
		EBNFDescriptionImpl ebnfDescription = new EBNFDescriptionImpl();
		return ebnfDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTerminal createNonTerminal() {
		NonTerminalImpl nonTerminal = new NonTerminalImpl();
		return nonTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repetition createRepetition() {
		RepetitionImpl repetition = new RepetitionImpl();
		return repetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTerminalReference createNonTerminalReference() {
		NonTerminalReferenceImpl nonTerminalReference = new NonTerminalReferenceImpl();
		return nonTerminalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialSequence createSpecialSequence() {
		SpecialSequenceImpl specialSequence = new SpecialSequenceImpl();
		return specialSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Except createExcept() {
		ExceptImpl except = new ExceptImpl();
		return except;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choose createChoose() {
		ChooseImpl choose = new ChooseImpl();
		return choose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EbnfmmPackage getEbnfmmPackage() {
		return (EbnfmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EbnfmmPackage getPackage() {
		return EbnfmmPackage.eINSTANCE;
	}

} //EbnfmmFactoryImpl
