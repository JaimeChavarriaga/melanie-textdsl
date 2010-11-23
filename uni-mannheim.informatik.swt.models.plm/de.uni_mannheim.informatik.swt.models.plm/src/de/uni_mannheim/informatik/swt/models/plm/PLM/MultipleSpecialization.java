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
 * A representation of the model object '<em><b>Multiple Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#isComplete <em>Complete</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#isDisjoint <em>Disjoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getMultipleSpecialization()
 * @model
 * @generated
 */
public interface MultipleSpecialization extends Generalization {
	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getMultipleSpecialization_Subtype()
	 * @model required="true"
	 * @generated
	 */
	EList<Clabject> getSubtype();

	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' reference.
	 * @see #setSupertype(Clabject)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getMultipleSpecialization_Supertype()
	 * @model
	 * @generated
	 */
	Clabject getSupertype();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#getSupertype <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(Clabject value);

	/**
	 * Returns the value of the '<em><b>Complete</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete</em>' attribute.
	 * @see #setComplete(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getMultipleSpecialization_Complete()
	 * @model default="false"
	 * @generated
	 */
	boolean isComplete();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#isComplete <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' attribute.
	 * @see #isComplete()
	 * @generated
	 */
	void setComplete(boolean value);

	/**
	 * Returns the value of the '<em><b>Disjoint</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint</em>' attribute.
	 * @see #setDisjoint(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getMultipleSpecialization_Disjoint()
	 * @model default="false"
	 * @generated
	 */
	boolean isDisjoint();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization#isDisjoint <em>Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjoint</em>' attribute.
	 * @see #isDisjoint()
	 * @generated
	 */
	void setDisjoint(boolean value);

} // MultipleSpecialization
