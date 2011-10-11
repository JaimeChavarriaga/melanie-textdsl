/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout Content Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getLayoutInformation <em>Layout Information</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getForegroundColor <em>Foreground Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLayoutContentDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface LayoutContentDescriptor extends VisualizationDescriptor {
	/**
	 * Returns the value of the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Information</em>' containment reference.
	 * @see #setLayoutInformation(LayoutInformationDescriptor)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLayoutContentDescriptor_LayoutInformation()
	 * @model containment="true"
	 * @generated
	 */
	LayoutInformationDescriptor getLayoutInformation();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getLayoutInformation <em>Layout Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Information</em>' containment reference.
	 * @see #getLayoutInformation()
	 * @generated
	 */
	void setLayoutInformation(LayoutInformationDescriptor value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The default value is <code>"White"</code>.
	 * The literals are from the enumeration {@link de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant
	 * @see #setBackgroundColor(ColorConstant)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLayoutContentDescriptor_BackgroundColor()
	 * @model default="White" required="true"
	 * @generated
	 */
	ColorConstant getBackgroundColor();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(ColorConstant value);

	/**
	 * Returns the value of the '<em><b>Foreground Color</b></em>' attribute.
	 * The default value is <code>"Black"</code>.
	 * The literals are from the enumeration {@link de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground Color</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant
	 * @see #setForegroundColor(ColorConstant)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLayoutContentDescriptor_ForegroundColor()
	 * @model default="Black" required="true"
	 * @generated
	 */
	ColorConstant getForegroundColor();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getForegroundColor <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground Color</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant
	 * @see #getForegroundColor()
	 * @generated
	 */
	void setForegroundColor(ColorConstant value);

} // LayoutContentDescriptor
