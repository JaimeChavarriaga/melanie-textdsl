/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#getDiscriminant <em>Discriminant</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Discriminant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminant</em>' attribute.
	 * @see #setDiscriminant(String)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getGeneralization_Discriminant()
	 * @model
	 * @generated
	 */
	String getDiscriminant();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization#getDiscriminant <em>Discriminant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminant</em>' attribute.
	 * @see #getDiscriminant()
	 * @generated
	 */
	void setDiscriminant(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (self.oclIsTypeOf(MultipleGeneralization)) then\r\n\tself.oclAsType(MultipleGeneralization).supertype->asSet()\r\nelse\r\n\tif (self.oclIsTypeOf(MultipleSpecialization)) then\r\n\t\tself.oclAsType(MultipleSpecialization).supertype->asSet()\r\n\telse\r\n\t\tif (self.oclIsTypeOf(BinaryGeneralization)) then\r\n\t\t\tself.oclAsType(BinaryGeneralization).supertype->asSet()\r\n\t\telse\r\n\t\t\tSet(Clabject){}\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	EList<Clabject> getSupertypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (self.oclIsTypeOf(MultipleGeneralization)) then\r\n\tself.oclAsType(MultipleGeneralization).subtype->asSet()\r\nelse\r\n\tif (self.oclIsTypeOf(MultipleSpecialization)) then\r\n\t\tself.oclAsType(MultipleSpecialization).subtype->asSet()\r\n\telse\r\n\t\tif (self.oclIsTypeOf(BinaryGeneralization)) then\r\n\t\t\tself.oclAsType(BinaryGeneralization).subtype->asSet()\r\n\t\telse\r\n\t\t\tSet(Clabject){}\r\n\t\tendif\r\n\tendif\r\nendif'"
	 * @generated
	 */
	EList<Clabject> getSubtypes();

} // Generalization
