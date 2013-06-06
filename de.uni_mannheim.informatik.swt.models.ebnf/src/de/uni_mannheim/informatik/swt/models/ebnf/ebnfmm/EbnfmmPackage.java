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
import org.eclipse.emf.ecore.EOperation;
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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
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
	 * The feature id for the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__CONTAINING_NON_TERMINAL = 0;

	/**
	 * The feature id for the '<em><b>Containing Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__CONTAINING_CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Containing Choice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__CONTAINING_CHOICE = 2;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.FactorableSymbolImpl <em>Factorable Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.FactorableSymbolImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getFactorableSymbol()
	 * @generated
	 */
	int FACTORABLE_SYMBOL = 12;

	/**
	 * The feature id for the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORABLE_SYMBOL__CONTAINING_NON_TERMINAL = SYMBOL__CONTAINING_NON_TERMINAL;

	/**
	 * The feature id for the '<em><b>Containing Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORABLE_SYMBOL__CONTAINING_CONTROL = SYMBOL__CONTAINING_CONTROL;

	/**
	 * The feature id for the '<em><b>Containing Choice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORABLE_SYMBOL__CONTAINING_CHOICE = SYMBOL__CONTAINING_CHOICE;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORABLE_SYMBOL__FACTOR = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Factorable Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORABLE_SYMBOL_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Contained By Choose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORABLE_SYMBOL___IS_CONTAINED_BY_CHOOSE = SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Factorable Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORABLE_SYMBOL_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__CONTAINING_NON_TERMINAL = FACTORABLE_SYMBOL__CONTAINING_NON_TERMINAL;

	/**
	 * The feature id for the '<em><b>Containing Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__CONTAINING_CONTROL = FACTORABLE_SYMBOL__CONTAINING_CONTROL;

	/**
	 * The feature id for the '<em><b>Containing Choice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__CONTAINING_CHOICE = FACTORABLE_SYMBOL__CONTAINING_CHOICE;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__FACTOR = FACTORABLE_SYMBOL__FACTOR;

	/**
	 * The feature id for the '<em><b>Terminal String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__TERMINAL_STRING = FACTORABLE_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = FACTORABLE_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Contained By Choose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___IS_CONTAINED_BY_CHOOSE = FACTORABLE_SYMBOL___IS_CONTAINED_BY_CHOOSE;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = FACTORABLE_SYMBOL_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTAINING_NON_TERMINAL = FACTORABLE_SYMBOL__CONTAINING_NON_TERMINAL;

	/**
	 * The feature id for the '<em><b>Containing Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTAINING_CONTROL = FACTORABLE_SYMBOL__CONTAINING_CONTROL;

	/**
	 * The feature id for the '<em><b>Containing Choice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTAINING_CHOICE = FACTORABLE_SYMBOL__CONTAINING_CHOICE;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__FACTOR = FACTORABLE_SYMBOL__FACTOR;

	/**
	 * The feature id for the '<em><b>Definition List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__DEFINITION_LIST = FACTORABLE_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = FACTORABLE_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Contained By Choose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL___IS_CONTAINED_BY_CHOOSE = FACTORABLE_SYMBOL___IS_CONTAINED_BY_CHOOSE;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = FACTORABLE_SYMBOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.OptionalImpl <em>Optional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.OptionalImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getOptional()
	 * @generated
	 */
	int OPTIONAL = 5;

	/**
	 * The feature id for the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__CONTAINING_NON_TERMINAL = CONTROL__CONTAINING_NON_TERMINAL;

	/**
	 * The feature id for the '<em><b>Containing Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__CONTAINING_CONTROL = CONTROL__CONTAINING_CONTROL;

	/**
	 * The feature id for the '<em><b>Containing Choice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__CONTAINING_CHOICE = CONTROL__CONTAINING_CHOICE;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__FACTOR = CONTROL__FACTOR;

	/**
	 * The feature id for the '<em><b>Definition List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL__DEFINITION_LIST = CONTROL__DEFINITION_LIST;

	/**
	 * The number of structural features of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Contained By Choose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL___IS_CONTAINED_BY_CHOOSE = CONTROL___IS_CONTAINED_BY_CHOOSE;

	/**
	 * The number of operations of the '<em>Optional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION__CONTAINING_NON_TERMINAL = CONTROL__CONTAINING_NON_TERMINAL;

	/**
	 * The feature id for the '<em><b>Containing Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION__CONTAINING_CONTROL = CONTROL__CONTAINING_CONTROL;

	/**
	 * The feature id for the '<em><b>Containing Choice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION__CONTAINING_CHOICE = CONTROL__CONTAINING_CHOICE;

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
	 * The operation id for the '<em>Is Contained By Choose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION___IS_CONTAINED_BY_CHOOSE = CONTROL___IS_CONTAINED_BY_CHOOSE;

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
	 * The feature id for the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE__CONTAINING_NON_TERMINAL = FACTORABLE_SYMBOL__CONTAINING_NON_TERMINAL;

	/**
	 * The feature id for the '<em><b>Containing Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE__CONTAINING_CONTROL = FACTORABLE_SYMBOL__CONTAINING_CONTROL;

	/**
	 * The feature id for the '<em><b>Containing Choice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE__CONTAINING_CHOICE = FACTORABLE_SYMBOL__CONTAINING_CHOICE;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE__FACTOR = FACTORABLE_SYMBOL__FACTOR;

	/**
	 * The feature id for the '<em><b>Non Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE__NON_TERMINAL = FACTORABLE_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Terminal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE_FEATURE_COUNT = FACTORABLE_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Contained By Choose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE___IS_CONTAINED_BY_CHOOSE = FACTORABLE_SYMBOL___IS_CONTAINED_BY_CHOOSE;

	/**
	 * The number of operations of the '<em>Non Terminal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_REFERENCE_OPERATION_COUNT = FACTORABLE_SYMBOL_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTAINING_NON_TERMINAL = CONTROL__CONTAINING_NON_TERMINAL;

	/**
	 * The feature id for the '<em><b>Containing Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTAINING_CONTROL = CONTROL__CONTAINING_CONTROL;

	/**
	 * The feature id for the '<em><b>Containing Choice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTAINING_CHOICE = CONTROL__CONTAINING_CHOICE;

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
	 * The operation id for the '<em>Is Contained By Choose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___IS_CONTAINED_BY_CHOOSE = CONTROL___IS_CONTAINED_BY_CHOOSE;

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
	 * The feature id for the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE__CONTAINING_NON_TERMINAL = FACTORABLE_SYMBOL__CONTAINING_NON_TERMINAL;

	/**
	 * The feature id for the '<em><b>Containing Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE__CONTAINING_CONTROL = FACTORABLE_SYMBOL__CONTAINING_CONTROL;

	/**
	 * The feature id for the '<em><b>Containing Choice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE__CONTAINING_CHOICE = FACTORABLE_SYMBOL__CONTAINING_CHOICE;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE__FACTOR = FACTORABLE_SYMBOL__FACTOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE__TEXT = FACTORABLE_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Special Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE_FEATURE_COUNT = FACTORABLE_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Contained By Choose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE___IS_CONTAINED_BY_CHOOSE = FACTORABLE_SYMBOL___IS_CONTAINED_BY_CHOOSE;

	/**
	 * The number of operations of the '<em>Special Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_SEQUENCE_OPERATION_COUNT = FACTORABLE_SYMBOL_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT__CONTAINING_NON_TERMINAL = CONTROL__CONTAINING_NON_TERMINAL;

	/**
	 * The feature id for the '<em><b>Containing Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT__CONTAINING_CONTROL = CONTROL__CONTAINING_CONTROL;

	/**
	 * The feature id for the '<em><b>Containing Choice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT__CONTAINING_CHOICE = CONTROL__CONTAINING_CHOICE;

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
	 * The operation id for the '<em>Is Contained By Choose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT___IS_CONTAINED_BY_CHOOSE = CONTROL___IS_CONTAINED_BY_CHOOSE;

	/**
	 * The number of operations of the '<em>Except</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ChoiceImpl
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 11;

	/**
	 * The feature id for the '<em><b>Containing Non Terminal</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CONTAINING_NON_TERMINAL = SYMBOL__CONTAINING_NON_TERMINAL;

	/**
	 * The feature id for the '<em><b>Containing Control</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CONTAINING_CONTROL = SYMBOL__CONTAINING_CONTROL;

	/**
	 * The feature id for the '<em><b>Containing Choice</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CONTAINING_CHOICE = SYMBOL__CONTAINING_CHOICE;

	/**
	 * The feature id for the '<em><b>Definition List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DEFINITION_LIST = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = SYMBOL_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the container reference '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingNonTerminal <em>Containing Non Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Non Terminal</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingNonTerminal()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_ContainingNonTerminal();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingControl <em>Containing Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Control</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingControl()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_ContainingControl();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingChoice <em>Containing Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Choice</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol#getContainingChoice()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_ContainingChoice();

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
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Optional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Optional
	 * @generated
	 */
	EClass getOptional();

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
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Choice#getDefinitionList <em>Definition List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition List</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Choice#getDefinitionList()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_DefinitionList();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.FactorableSymbol <em>Factorable Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factorable Symbol</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.FactorableSymbol
	 * @generated
	 */
	EClass getFactorableSymbol();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.FactorableSymbol#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.FactorableSymbol#getFactor()
	 * @see #getFactorableSymbol()
	 * @generated
	 */
	EAttribute getFactorableSymbol_Factor();

	/**
	 * Returns the meta object for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.FactorableSymbol#isContainedByChoose() <em>Is Contained By Choose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Contained By Choose</em>' operation.
	 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.FactorableSymbol#isContainedByChoose()
	 * @generated
	 */
	EOperation getFactorableSymbol__IsContainedByChoose();

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
		 * The meta object literal for the '<em><b>Containing Non Terminal</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__CONTAINING_NON_TERMINAL = eINSTANCE.getSymbol_ContainingNonTerminal();

		/**
		 * The meta object literal for the '<em><b>Containing Control</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__CONTAINING_CONTROL = eINSTANCE.getSymbol_ContainingControl();

		/**
		 * The meta object literal for the '<em><b>Containing Choice</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__CONTAINING_CHOICE = eINSTANCE.getSymbol_ContainingChoice();

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
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.OptionalImpl <em>Optional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.OptionalImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getOptional()
		 * @generated
		 */
		EClass OPTIONAL = eINSTANCE.getOptional();

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
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.ChoiceImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Definition List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__DEFINITION_LIST = eINSTANCE.getChoice_DefinitionList();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.FactorableSymbolImpl <em>Factorable Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.FactorableSymbolImpl
		 * @see de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmPackageImpl#getFactorableSymbol()
		 * @generated
		 */
		EClass FACTORABLE_SYMBOL = eINSTANCE.getFactorableSymbol();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORABLE_SYMBOL__FACTOR = eINSTANCE.getFactorableSymbol_Factor();

		/**
		 * The meta object literal for the '<em><b>Is Contained By Choose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACTORABLE_SYMBOL___IS_CONTAINED_BY_CHOOSE = eINSTANCE.getFactorableSymbol__IsContainedByChoose();

	}

} //EbnfmmPackage
