/**
 */
package ebnfmm.impl;

import ebnfmm.*;

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
			EbnfmmFactory theEbnfmmFactory = (EbnfmmFactory)EPackage.Registry.INSTANCE.getEFactory("http://swt.informatik.uni-mannheim.de/ebnfmm"); 
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
			case EbnfmmPackage.RULE: return createRule();
			case EbnfmmPackage.NON_TERMINAL: return createNonTerminal();
			case EbnfmmPackage.SYMBOL: return createSymbol();
			case EbnfmmPackage.TERMINAL: return createTerminal();
			case EbnfmmPackage.CONTROL: return createControl();
			case EbnfmmPackage.CHOICE: return createChoice();
			case EbnfmmPackage.OPTION: return createOption();
			case EbnfmmPackage.REPETITION: return createRepetition();
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
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
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
	public Symbol createSymbol() {
		SymbolImpl symbol = new SymbolImpl();
		return symbol;
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
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
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
