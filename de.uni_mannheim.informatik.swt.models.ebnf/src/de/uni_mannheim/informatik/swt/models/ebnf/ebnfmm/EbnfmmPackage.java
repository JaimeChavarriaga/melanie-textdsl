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
package de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmFactory
 * @model kind="package"
 * @generated
 */
public interface EbnfmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ebnfmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://swt.informatik.uni-mannheim.de/ebnfmm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ebnfmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EbnfmmPackage eINSTANCE = de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EBNFDescriptionImpl <em>EBNF Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EBNFDescriptionImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getEBNFDescription()
	 * @generated
	 */
	int EBNF_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_DESCRIPTION__RULES = 0;

	/**
	 * The number of structural features of the '<em>EBNF Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EBNF Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.NonTerminalImpl <em>Non Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.NonTerminalImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getNonTerminal()
	 * @generated
	 */
	int NON_TERMINAL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL__ID = 0;

	/**
	 * The feature id for the '<em><b>Definition List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL__DEFINITION_LIST = 1;

	/**
	 * The number of structural features of the '<em>Non Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Non Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.SymbolImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 2;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__FACTOR = 0;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.TerminalImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 3;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__FACTOR = SYMBOL__FACTOR;

	/**
	 * The feature id for the '<em><b>Terminal String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__TERMINAL_STRING = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ControlImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 4;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__FACTOR = SYMBOL__FACTOR;

	/**
	 * The feature id for the '<em><b>Definition List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DEFINITION_LIST = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.OptionImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 5;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__FACTOR = CONTROL__FACTOR;

	/**
	 * The feature id for the '<em><b>Definition List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__DEFINITION_LIST = CONTROL__DEFINITION_LIST;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.RepetitionImpl <em>Repetition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.RepetitionImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getRepetition()
	 * @generated
	 */
	int REPETITION = 6;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION__FACTOR = CONTROL__FACTOR;

	/**
	 * The feature id for the '<em><b>Definition List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION__DEFINITION_LIST = CONTROL__DEFINITION_LIST;

	/**
	 * The number of structural features of the '<em>Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.NonTerminalReferenceImpl <em>Non Terminal Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.NonTerminalReferenceImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getNonTerminalReference()
	 * @generated
	 */
	int NON_TERMINAL_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE__FACTOR = SYMBOL__FACTOR;

	/**
	 * The feature id for the '<em><b>Non Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE__NON_TERMINAL = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Terminal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Terminal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.GroupImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 8;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FACTOR = CONTROL__FACTOR;

	/**
	 * The feature id for the '<em><b>Definition List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DEFINITION_LIST = CONTROL__DEFINITION_LIST;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.SpecialSequenceImpl <em>Special Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.SpecialSequenceImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getSpecialSequence()
	 * @generated
	 */
	int SPECIAL_SEQUENCE = 9;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE__FACTOR = SYMBOL__FACTOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE__TEXT = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Special Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Special Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ExceptImpl <em>Except</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ExceptImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getExcept()
	 * @generated
	 */
	int EXCEPT = 10;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT__FACTOR = CONTROL__FACTOR;

	/**
	 * The feature id for the '<em><b>Definition List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT__DEFINITION_LIST = CONTROL__DEFINITION_LIST;

	/**
	 * The feature id for the '<em><b>Except</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT__EXCEPT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Except</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Except</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ChooseImpl <em>Choose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ChooseImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getChoose()
	 * @generated
	 */
	int CHOOSE = 11;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOOSE__FACTOR = CONTROL__FACTOR;

	/**
	 * The feature id for the '<em><b>Definition List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOOSE__DEFINITION_LIST = CONTROL__DEFINITION_LIST;

	/**
	 * The number of structural features of the '<em>Choose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOOSE_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Choose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOOSE_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EBNFDescription <em>EBNF Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBNF Description</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EBNFDescription
	 * @generated
	 */
	EClass getEBNFDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EBNFDescription#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EBNFDescription#getRules()
	 * @see #getEBNFDescription()
	 * @generated
	 */
	EReference getEBNFDescription_Rules();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal <em>Non Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Terminal</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal
	 * @generated
	 */
	EClass getNonTerminal();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal#getId()
	 * @see #getNonTerminal()
	 * @generated
	 */
	EAttribute getNonTerminal_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal#getDefinitionList <em>Definition List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition List</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal#getDefinitionList()
	 * @see #getNonTerminal()
	 * @generated
	 */
	EReference getNonTerminal_DefinitionList();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getFactor()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_Factor();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Terminal#getTerminalString <em>Terminal String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal String</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Terminal#getTerminalString()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_TerminalString();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Control#getDefinitionList <em>Definition List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition List</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Control#getDefinitionList()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_DefinitionList();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Repetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repetition</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Repetition
	 * @generated
	 */
	EClass getRepetition();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminalReference <em>Non Terminal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Terminal Reference</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminalReference
	 * @generated
	 */
	EClass getNonTerminalReference();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminalReference#getNonTerminal <em>Non Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Non Terminal</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminalReference#getNonTerminal()
	 * @see #getNonTerminalReference()
	 * @generated
	 */
	EReference getNonTerminalReference_NonTerminal();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.SpecialSequence <em>Special Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Sequence</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.SpecialSequence
	 * @generated
	 */
	EClass getSpecialSequence();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.SpecialSequence#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.SpecialSequence#getText()
	 * @see #getSpecialSequence()
	 * @generated
	 */
	EAttribute getSpecialSequence_Text();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Except <em>Except</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Except</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Except
	 * @generated
	 */
	EClass getExcept();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Except#getExcept <em>Except</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Except</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Except#getExcept()
	 * @see #getExcept()
	 * @generated
	 */
	EReference getExcept_Except();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Choose <em>Choose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choose</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Choose
	 * @generated
	 */
	EClass getChoose();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EbnfmmFactory getEbnfmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EBNFDescriptionImpl <em>EBNF Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EBNFDescriptionImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getEBNFDescription()
		 * @generated
		 */
		EClass EBNF_DESCRIPTION = eINSTANCE.getEBNFDescription();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBNF_DESCRIPTION__RULES = eINSTANCE.getEBNFDescription_Rules();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.NonTerminalImpl <em>Non Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.NonTerminalImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getNonTerminal()
		 * @generated
		 */
		EClass NON_TERMINAL = eINSTANCE.getNonTerminal();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_TERMINAL__ID = eINSTANCE.getNonTerminal_Id();

		/**
		 * The meta object literal for the '<em><b>Definition List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_TERMINAL__DEFINITION_LIST = eINSTANCE.getNonTerminal_DefinitionList();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.SymbolImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__FACTOR = eINSTANCE.getSymbol_Factor();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.TerminalImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Terminal String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__TERMINAL_STRING = eINSTANCE.getTerminal_TerminalString();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ControlImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Definition List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__DEFINITION_LIST = eINSTANCE.getControl_DefinitionList();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.OptionImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.RepetitionImpl <em>Repetition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.RepetitionImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getRepetition()
		 * @generated
		 */
		EClass REPETITION = eINSTANCE.getRepetition();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.NonTerminalReferenceImpl <em>Non Terminal Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.NonTerminalReferenceImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getNonTerminalReference()
		 * @generated
		 */
		EClass NON_TERMINAL_REFERENCE = eINSTANCE.getNonTerminalReference();

		/**
		 * The meta object literal for the '<em><b>Non Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_TERMINAL_REFERENCE__NON_TERMINAL = eINSTANCE.getNonTerminalReference_NonTerminal();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.GroupImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.SpecialSequenceImpl <em>Special Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.SpecialSequenceImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getSpecialSequence()
		 * @generated
		 */
		EClass SPECIAL_SEQUENCE = eINSTANCE.getSpecialSequence();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_SEQUENCE__TEXT = eINSTANCE.getSpecialSequence_Text();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ExceptImpl <em>Except</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ExceptImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getExcept()
		 * @generated
		 */
		EClass EXCEPT = eINSTANCE.getExcept();

		/**
		 * The meta object literal for the '<em><b>Except</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPT__EXCEPT = eINSTANCE.getExcept_Except();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ChooseImpl <em>Choose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ChooseImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getChoose()
		 * @generated
		 */
		EClass CHOOSE = eINSTANCE.getChoose();

	}

} //EbnfmmPackage
