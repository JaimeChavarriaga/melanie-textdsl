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
 * A representation of the model object '<em><b>Multiple Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#isIntersection <em>Intersection</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#isUnion <em>Union</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getMultipleGeneralization()
 * @model
 * @generated
 */
public interface MultipleGeneralization extends Generalization {
	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' reference.
	 * @see #setSubtype(Clabject)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getMultipleGeneralization_Subtype()
	 * @model
	 * @generated
	 */
	Clabject getSubtype();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#getSubtype <em>Subtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' reference.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(Clabject value);

	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getMultipleGeneralization_Supertype()
	 * @model required="true"
	 * @generated
	 */
	EList<Clabject> getSupertype();

	/**
	 * Returns the value of the '<em><b>Intersection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intersection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intersection</em>' attribute.
	 * @see #setIntersection(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getMultipleGeneralization_Intersection()
	 * @model default="false"
	 * @generated
	 */
	boolean isIntersection();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#isIntersection <em>Intersection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intersection</em>' attribute.
	 * @see #isIntersection()
	 * @generated
	 */
	void setIntersection(boolean value);

	/**
	 * Returns the value of the '<em><b>Union</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union</em>' attribute.
	 * @see #setUnion(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getMultipleGeneralization_Union()
	 * @model default="false"
	 * @generated
	 */
	boolean isUnion();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization#isUnion <em>Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Union</em>' attribute.
	 * @see #isUnion()
	 * @generated
	 */
	void setUnion(boolean value);

} // MultipleGeneralization
