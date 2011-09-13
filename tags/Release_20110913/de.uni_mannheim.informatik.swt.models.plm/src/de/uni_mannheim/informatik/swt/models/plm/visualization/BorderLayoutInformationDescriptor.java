/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Border Layout Information Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getVerticalOffset <em>Vertical Offset</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getHorizontalOffset <em>Horizontal Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getBorderLayoutInformationDescriptor()
 * @model
 * @generated
 */
public interface BorderLayoutInformationDescriptor extends LayoutInformationDescriptor {
	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * The default value is <code>"End"</code>.
	 * The literals are from the enumeration {@link de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment
	 * @see #setVerticalAlignment(Alignment)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getBorderLayoutInformationDescriptor_VerticalAlignment()
	 * @model default="End" required="true"
	 * @generated
	 */
	Alignment getVerticalAlignment();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * The default value is <code>"Center"</code>.
	 * The literals are from the enumeration {@link de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment
	 * @see #setHorizontalAlignment(Alignment)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getBorderLayoutInformationDescriptor_HorizontalAlignment()
	 * @model default="Center" required="true"
	 * @generated
	 */
	Alignment getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
	void setHorizontalAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Vertical Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Offset</em>' attribute.
	 * @see #setVerticalOffset(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getBorderLayoutInformationDescriptor_VerticalOffset()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getVerticalOffset();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getVerticalOffset <em>Vertical Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Offset</em>' attribute.
	 * @see #getVerticalOffset()
	 * @generated
	 */
	void setVerticalOffset(int value);

	/**
	 * Returns the value of the '<em><b>Horizontal Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Offset</em>' attribute.
	 * @see #setHorizontalOffset(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getBorderLayoutInformationDescriptor_HorizontalOffset()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getHorizontalOffset();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getHorizontalOffset <em>Horizontal Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Offset</em>' attribute.
	 * @see #getHorizontalOffset()
	 * @generated
	 */
	void setHorizontalOffset(int value);

} // BorderLayoutInformationDescriptor
