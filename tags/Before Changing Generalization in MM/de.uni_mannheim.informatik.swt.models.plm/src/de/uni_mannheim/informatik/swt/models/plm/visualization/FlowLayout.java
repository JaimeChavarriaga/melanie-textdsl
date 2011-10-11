/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout#isVertical <em>Vertical</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout#isSingleLine <em>Single Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getFlowLayout()
 * @model
 * @generated
 */
public interface FlowLayout extends LayoutDescriptor {
	/**
	 * Returns the value of the '<em><b>Vertical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical</em>' attribute.
	 * @see #setVertical(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getFlowLayout_Vertical()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isVertical();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout#isVertical <em>Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical</em>' attribute.
	 * @see #isVertical()
	 * @generated
	 */
	void setVertical(boolean value);

	/**
	 * Returns the value of the '<em><b>Single Line</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Line</em>' attribute.
	 * @see #setSingleLine(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getFlowLayout_SingleLine()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSingleLine();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout#isSingleLine <em>Single Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Line</em>' attribute.
	 * @see #isSingleLine()
	 * @generated
	 */
	void setSingleLine(boolean value);

} // FlowLayout
