/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.nodels.plm.PLM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage
 * @generated
 */
public interface PLMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PLMFactory eINSTANCE = uni_mannheim.informatik.swt.nodels.plm.PLM.impl.PLMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PElement</em>'.
	 * @generated
	 */
	PElement createPElement();

	/**
	 * Returns a new object of class '<em>PLevel Specific Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PLevel Specific Element</em>'.
	 * @generated
	 */
	PLevelSpecificElement createPLevelSpecificElement();

	/**
	 * Returns a new object of class '<em>PModule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PModule</em>'.
	 * @generated
	 */
	PModule createPModule();

	/**
	 * Returns a new object of class '<em>PInstantiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PInstantiable Element</em>'.
	 * @generated
	 */
	PInstantiableElement createPInstantiableElement();

	/**
	 * Returns a new object of class '<em>PPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PPackage</em>'.
	 * @generated
	 */
	PPackage createPPackage();

	/**
	 * Returns a new object of class '<em>PConnector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PConnector</em>'.
	 * @generated
	 */
	PConnector createPConnector();

	/**
	 * Returns a new object of class '<em>PField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PField</em>'.
	 * @generated
	 */
	PField createPField();

	/**
	 * Returns a new object of class '<em>PClabject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PClabject</em>'.
	 * @generated
	 */
	PClabject createPClabject();

	/**
	 * Returns a new object of class '<em>PMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PMethod</em>'.
	 * @generated
	 */
	PMethod createPMethod();

	/**
	 * Returns a new object of class '<em>PNode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PNode</em>'.
	 * @generated
	 */
	PNode createPNode();

	/**
	 * Returns a new object of class '<em>PRelationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRelationship</em>'.
	 * @generated
	 */
	PRelationship createPRelationship();

	/**
	 * Returns a new object of class '<em>PGeneralization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PGeneralization</em>'.
	 * @generated
	 */
	PGeneralization createPGeneralization();

	/**
	 * Returns a new object of class '<em>PInstantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PInstantiation</em>'.
	 * @generated
	 */
	PInstantiation createPInstantiation();

	/**
	 * Returns a new object of class '<em>Pan Level Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pan Level Model</em>'.
	 * @generated
	 */
	PanLevelModel createPanLevelModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PLMPackage getPLMPackage();

} //PLMFactory
