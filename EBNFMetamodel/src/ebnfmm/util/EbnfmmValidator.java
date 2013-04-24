/**
 */
package ebnfmm.util;

import ebnfmm.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ebnfmm.EbnfmmPackage
 * @generated
 */
public class EbnfmmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EbnfmmValidator INSTANCE = new EbnfmmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ebnfmm";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EbnfmmValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EbnfmmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EbnfmmPackage.EBNF_DESCRIPTION:
				return validateEBNFDescription((EBNFDescription)value, diagnostics, context);
			case EbnfmmPackage.RULE:
				return validateRule((Rule)value, diagnostics, context);
			case EbnfmmPackage.NON_TERMINAL:
				return validateNonTerminal((NonTerminal)value, diagnostics, context);
			case EbnfmmPackage.SYMBOL:
				return validateSymbol((Symbol)value, diagnostics, context);
			case EbnfmmPackage.TERMINAL:
				return validateTerminal((Terminal)value, diagnostics, context);
			case EbnfmmPackage.CONTROL:
				return validateControl((Control)value, diagnostics, context);
			case EbnfmmPackage.CHOICE:
				return validateChoice((Choice)value, diagnostics, context);
			case EbnfmmPackage.OPTION:
				return validateOption((Option)value, diagnostics, context);
			case EbnfmmPackage.REPETITION:
				return validateRepetition((Repetition)value, diagnostics, context);
			case EbnfmmPackage.REFERENCEABLE_SYMBOL:
				return validateReferenceableSymbol((ReferenceableSymbol)value, diagnostics, context);
			case EbnfmmPackage.NON_REFERENCEABLE_SYMBOL:
				return validateNonReferenceableSymbol((NonReferenceableSymbol)value, diagnostics, context);
			case EbnfmmPackage.DUMMY:
				return validateDummy((Dummy)value, diagnostics, context);
			case EbnfmmPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBNFDescription(EBNFDescription ebnfDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ebnfDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRule(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonTerminal(NonTerminal nonTerminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonTerminal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbol(Symbol symbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symbol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControl(Control control, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(control, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoice(Choice choice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(choice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOption(Option option, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(option, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepetition(Repetition repetition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repetition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceableSymbol(ReferenceableSymbol referenceableSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceableSymbol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonReferenceableSymbol(NonReferenceableSymbol nonReferenceableSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonReferenceableSymbol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDummy(Dummy dummy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dummy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dummy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dummy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dummy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dummy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dummy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dummy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dummy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dummy, diagnostics, context);
		if (result || diagnostics != null) result &= validateDummy_validDummy(dummy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validDummy constraint of '<em>Dummy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDummy_validDummy(Dummy dummy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = (dummy.getRef() != null ) ^ (dummy.getContainment() != null); 
		
		if (valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validDummy", getObjectLabel(dummy, context) },
						 new Object[] { dummy },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EbnfmmValidator
