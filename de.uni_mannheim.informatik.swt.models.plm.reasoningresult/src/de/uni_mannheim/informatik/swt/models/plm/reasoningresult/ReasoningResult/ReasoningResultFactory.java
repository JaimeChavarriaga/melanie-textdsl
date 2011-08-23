/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage
 * @generated
 */
public interface ReasoningResultFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReasoningResultFactory eINSTANCE = de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	ReasoningResultModel createReasoningResultModel();

	/**
	 * Returns a new object of class '<em>Composite Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Check</em>'.
	 * @generated
	 */
	CompositeCheck createCompositeCheck();

	/**
	 * Returns a new object of class '<em>Name Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Comparison</em>'.
	 * @generated
	 */
	NameComparison createNameComparison();

	/**
	 * Returns a new object of class '<em>Durability Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Durability Comparison</em>'.
	 * @generated
	 */
	DurabilityComparison createDurabilityComparison();

	/**
	 * Returns a new object of class '<em>Mutability Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutability Comparison</em>'.
	 * @generated
	 */
	MutabilityComparison createMutabilityComparison();

	/**
	 * Returns a new object of class '<em>Datatype Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Comparison</em>'.
	 * @generated
	 */
	DatatypeComparison createDatatypeComparison();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReasoningResultPackage getReasoningResultPackage();

} //ReasoningResultFactory
