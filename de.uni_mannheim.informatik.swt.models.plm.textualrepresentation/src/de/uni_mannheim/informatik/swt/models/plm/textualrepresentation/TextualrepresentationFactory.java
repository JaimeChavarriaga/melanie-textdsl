/**
 */
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.TextualrepresentationPackage
 * @generated
 */
public interface TextualrepresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextualrepresentationFactory eINSTANCE = de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.impl.TextualrepresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>root</em>'.
	 * @generated
	 */
	root createroot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TextualrepresentationPackage getTextualrepresentationPackage();

} //TextualrepresentationFactory
