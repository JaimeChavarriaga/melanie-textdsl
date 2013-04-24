/**
 */
package ebnfmm;

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
	 * The meta object id for the '{@link ebnfmm.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.RuleImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Meta Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__META_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Definition List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DEFINITION_LIST = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ebnfmm.impl.ReferenceableSymbolImpl <em>Referenceable Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.ReferenceableSymbolImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getReferenceableSymbol()
	 * @generated
	 */
	int REFERENCEABLE_SYMBOL = 9;

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
	 * The meta object id for the '{@link ebnfmm.impl.NonReferenceableSymbolImpl <em>Non Referenceable Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.NonReferenceableSymbolImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getNonReferenceableSymbol()
	 * @generated
	 */
	int NON_REFERENCEABLE_SYMBOL = 10;

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
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Referenceable Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEABLE_SYMBOL_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL__ID = REFERENCEABLE_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_FEATURE_COUNT = REFERENCEABLE_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Referenceable Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_REFERENCEABLE_SYMBOL_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Terminal String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__TERMINAL_STRING = NON_REFERENCEABLE_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = NON_REFERENCEABLE_SYMBOL_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ITEMS = NON_REFERENCEABLE_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = NON_REFERENCEABLE_SYMBOL_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ITEMS = CONTROL__ITEMS;

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
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ITEMS = CONTROL__ITEMS;

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
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION__ITEMS = CONTROL__ITEMS;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION__MULTIPLICITY = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link ebnfmm.impl.DummyImpl <em>Dummy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.DummyImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getDummy()
	 * @generated
	 */
	int DUMMY = 11;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY__REF = 0;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY__CONTAINMENT = 1;

	/**
	 * The number of structural features of the '<em>Dummy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link ebnfmm.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ebnfmm.impl.GroupImpl
	 * @see ebnfmm.impl.EbnfmmPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 12;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ITEMS = CONTROL__ITEMS;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;


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
	 * Returns the meta object for the containment reference '{@link ebnfmm.Rule#getMetaIdentifier <em>Meta Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Identifier</em>'.
	 * @see ebnfmm.Rule#getMetaIdentifier()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_MetaIdentifier();

	/**
	 * Returns the meta object for the reference list '{@link ebnfmm.Rule#getDefinitionList <em>Definition List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Definition List</em>'.
	 * @see ebnfmm.Rule#getDefinitionList()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_DefinitionList();

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
	 * Returns the meta object for the attribute '{@link ebnfmm.NonTerminal#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ebnfmm.NonTerminal#getId()
	 * @see #getNonTerminal()
	 * @generated
	 */
	EAttribute getNonTerminal_Id();

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
	 * Returns the meta object for the attribute '{@link ebnfmm.Terminal#getTerminalString <em>Terminal String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminal String</em>'.
	 * @see ebnfmm.Terminal#getTerminalString()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_TerminalString();

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
	 * Returns the meta object for the containment reference list '{@link ebnfmm.Control#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see ebnfmm.Control#getItems()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Items();

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
	 * Returns the meta object for the attribute '{@link ebnfmm.Repetition#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see ebnfmm.Repetition#getMultiplicity()
	 * @see #getRepetition()
	 * @generated
	 */
	EAttribute getRepetition_Multiplicity();

	/**
	 * Returns the meta object for class '{@link ebnfmm.ReferenceableSymbol <em>Referenceable Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenceable Symbol</em>'.
	 * @see ebnfmm.ReferenceableSymbol
	 * @generated
	 */
	EClass getReferenceableSymbol();

	/**
	 * Returns the meta object for class '{@link ebnfmm.NonReferenceableSymbol <em>Non Referenceable Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Referenceable Symbol</em>'.
	 * @see ebnfmm.NonReferenceableSymbol
	 * @generated
	 */
	EClass getNonReferenceableSymbol();

	/**
	 * Returns the meta object for class '{@link ebnfmm.Dummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy</em>'.
	 * @see ebnfmm.Dummy
	 * @generated
	 */
	EClass getDummy();

	/**
	 * Returns the meta object for the reference '{@link ebnfmm.Dummy#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see ebnfmm.Dummy#getRef()
	 * @see #getDummy()
	 * @generated
	 */
	EReference getDummy_Ref();

	/**
	 * Returns the meta object for the containment reference '{@link ebnfmm.Dummy#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containment</em>'.
	 * @see ebnfmm.Dummy#getContainment()
	 * @see #getDummy()
	 * @generated
	 */
	EReference getDummy_Containment();

	/**
	 * Returns the meta object for class '{@link ebnfmm.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see ebnfmm.Group
	 * @generated
	 */
	EClass getGroup();

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
		 * The meta object literal for the '<em><b>Meta Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__META_IDENTIFIER = eINSTANCE.getRule_MetaIdentifier();

		/**
		 * The meta object literal for the '<em><b>Definition List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__DEFINITION_LIST = eINSTANCE.getRule_DefinitionList();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_TERMINAL__ID = eINSTANCE.getNonTerminal_Id();

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
		 * The meta object literal for the '<em><b>Terminal String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__TERMINAL_STRING = eINSTANCE.getTerminal_TerminalString();

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
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__ITEMS = eINSTANCE.getControl_Items();

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

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPETITION__MULTIPLICITY = eINSTANCE.getRepetition_Multiplicity();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.ReferenceableSymbolImpl <em>Referenceable Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.ReferenceableSymbolImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getReferenceableSymbol()
		 * @generated
		 */
		EClass REFERENCEABLE_SYMBOL = eINSTANCE.getReferenceableSymbol();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.NonReferenceableSymbolImpl <em>Non Referenceable Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.NonReferenceableSymbolImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getNonReferenceableSymbol()
		 * @generated
		 */
		EClass NON_REFERENCEABLE_SYMBOL = eINSTANCE.getNonReferenceableSymbol();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.DummyImpl <em>Dummy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.DummyImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getDummy()
		 * @generated
		 */
		EClass DUMMY = eINSTANCE.getDummy();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUMMY__REF = eINSTANCE.getDummy_Ref();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUMMY__CONTAINMENT = eINSTANCE.getDummy_Containment();

		/**
		 * The meta object literal for the '{@link ebnfmm.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ebnfmm.impl.GroupImpl
		 * @see ebnfmm.impl.EbnfmmPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

	}

} //EbnfmmPackage
