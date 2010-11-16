/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.oca.OCA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uni_mannheim.informatik.swt.models.oca.OCA.OCAPackage
 * @generated
 */
public interface OCAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OCAFactory eINSTANCE = uni_mannheim.informatik.swt.models.oca.OCA.impl.OCAFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OCAPackage getOCAPackage();

} //OCAFactory
