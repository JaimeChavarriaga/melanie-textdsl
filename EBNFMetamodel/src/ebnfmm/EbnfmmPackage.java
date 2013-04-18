/**
 */
package ebnfmm;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ebnfmm.EbnfmmFactory
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
	EbnfmmPackage eINSTANCE = ebnfmm.impl.EbnfmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link ebnfmm.impl.EBNFDescriptionImpl <em>EBNF Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.EBNFDescriptionImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getEBNFDescription()
	 * @generated
	 */
	int EBNF_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_DESCRIPTION__EREFERENCE0 = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_DESCRIPTION__RULES = 1;

	/**
	 * The number of structural features of the '<em>EBNF Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBNF_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ebnfmm.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.RuleImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EREFERENCE0 = 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LHS = 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RHS = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ebnfmm.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.SymbolImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 3;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ebnfmm.impl.NonTerminalImpl <em>Non Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.NonTerminalImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getNonTerminal()
	 * @generated
	 */
	int NON_TERMINAL = 2;

	/**
	 * The number of structural features of the '<em>Non Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ebnfmm.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.TerminalImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 4;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ebnfmm.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.ControlImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 5;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ebnfmm.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.ChoiceImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 6;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ebnfmm.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.OptionImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 7;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ebnfmm.impl.RepetitionImpl <em>Repetition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.RepetitionImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getRepetition()
	 * @generated
	 */
	int REPETITION = 8;

	/**
	 * The number of structural features of the '<em>Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ebnfmm.EBNFDescription <em>EBNF Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBNF Description</em>'.
	 * @see ebnfmm.EBNFDescription
	 * @generated
	 */
	EClass getEBNFDescription();

	/**
	 * Returns the meta object for the reference '{@link ebnfmm.EBNFDescription#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see ebnfmm.EBNFDescription#getEReference0()
	 * @see #getEBNFDescription()
	 * @generated
	 */
	EReference getEBNFDescription_EReference0();

	/**
	 * Returns the meta object for the containment reference list '{@link ebnfmm.EBNFDescription#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see ebnfmm.EBNFDescription#getRules()
	 * @see #getEBNFDescription()
	 * @generated
	 */
	EReference getEBNFDescription_Rules();

	/**
	 * Returns the meta object for class '{@link ebnfmm.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see ebnfmm.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference '{@link ebnfmm.Rule#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see ebnfmm.Rule#getEReference0()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_EReference0();

	/**
	 * Returns the meta object for the containment reference '{@link ebnfmm.Rule#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see ebnfmm.Rule#getLhs()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Lhs();

	/**
	 * Returns the meta object for the reference list '{@link ebnfmm.Rule#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rhs</em>'.
	 * @see ebnfmm.Rule#getRhs()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Rhs();

	/**
	 * Returns the meta object for class '{@link ebnfmm.NonTerminal <em>Non Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Terminal</em>'.
	 * @see ebnfmm.NonTerminal
	 * @generated
	 */
	EClass getNonTerminal();

	/**
	 * Returns the meta object for class '{@link ebnfmm.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see ebnfmm.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for class '{@link ebnfmm.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see ebnfmm.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for class '{@link ebnfmm.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see ebnfmm.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for class '{@link ebnfmm.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see ebnfmm.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link ebnfmm.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see ebnfmm.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for class '{@link ebnfmm.Repetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repetition</em>'.
	 * @see ebnfmm.Repetition
	 * @generated
	 */
	EClass getRepetition();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ebnfmm.impl.EBNFDescriptionImpl <em>EBNF Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.EBNFDescriptionImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getEBNFDescription()
		 * @generated
		 */
		EClass EBNF_DESCRIPTION = eINSTANCE.getEBNFDescription();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBNF_DESCRIPTION__EREFERENCE0 = eINSTANCE.getEBNFDescription_EReference0();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBNF_DESCRIPTION__RULES = eINSTANCE.getEBNFDescription_Rules();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.RuleImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__EREFERENCE0 = eINSTANCE.getRule_EReference0();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__LHS = eINSTANCE.getRule_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RHS = eINSTANCE.getRule_Rhs();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.NonTerminalImpl <em>Non Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.NonTerminalImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getNonTerminal()
		 * @generated
		 */
		EClass NON_TERMINAL = eINSTANCE.getNonTerminal();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.SymbolImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.TerminalImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.ControlImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.ChoiceImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.OptionImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.RepetitionImpl <em>Repetition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.RepetitionImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getRepetition()
		 * @generated
		 */
		EClass REPETITION = eINSTANCE.getRepetition();

	}

} //EbnfmmPackage
