/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getClassification()
 * @model
 * @generated
 */
public interface Classification extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(Clabject)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getClassification_Instance()
	 * @model required="true"
	 * @generated
	 */
	Clabject getInstance();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Clabject value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Clabject)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getClassification_Type()
	 * @model required="true"
	 * @generated
	 */
	Clabject getType();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Clabject value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"classification"</code>.
	 * The literals are from the enumeration {@link de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind
	 * @see #setKind(ClassificationKind)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getClassification_Kind()
	 * @model default="classification" required="true"
	 * @generated
	 */
	ClassificationKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Classification#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ClassificationKind value);

} // Classification
