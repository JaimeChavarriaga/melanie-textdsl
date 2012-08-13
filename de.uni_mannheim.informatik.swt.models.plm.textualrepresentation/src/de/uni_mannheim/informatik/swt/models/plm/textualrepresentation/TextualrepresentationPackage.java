/**
 */
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.TextualrepresentationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface TextualrepresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "textualrepresentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://swt.informatik.uni-mannheim.de/MLM/textualrepresentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "textualrepresentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextualrepresentationPackage eINSTANCE = de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.impl.TextualrepresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.impl.rootImpl <em>root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.impl.rootImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.impl.TextualrepresentationPackageImpl#getroot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The number of structural features of the '<em>root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.root <em>root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>root</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.root
	 * @generated
	 */
	EClass getroot();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TextualrepresentationFactory getTextualrepresentationFactory();

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
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.impl.rootImpl <em>root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.impl.rootImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.impl.TextualrepresentationPackageImpl#getroot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getroot();

	}

} //TextualrepresentationPackage
