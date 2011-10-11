/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LabelDescriptor#getFont <em>Font</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LabelDescriptor#getTargetRoleName <em>Target Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLabelDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface LabelDescriptor extends InformationDisplayDescriptor {
	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(FontDescriptor)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLabelDescriptor_Font()
	 * @model containment="true"
	 * @generated
	 */
	FontDescriptor getFont();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LabelDescriptor#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(FontDescriptor value);

	/**
	 * Returns the value of the '<em><b>Target Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Role Name</em>' attribute.
	 * @see #setTargetRoleName(String)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLabelDescriptor_TargetRoleName()
	 * @model required="true"
	 * @generated
	 */
	String getTargetRoleName();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LabelDescriptor#getTargetRoleName <em>Target Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Role Name</em>' attribute.
	 * @see #getTargetRoleName()
	 * @generated
	 */
	void setTargetRoleName(String value);

} // LabelDescriptor
