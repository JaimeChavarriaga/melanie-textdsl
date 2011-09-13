/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rounded Rectangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.RoundedRectangle#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getRoundedRectangle()
 * @model
 * @generated
 */
public interface RoundedRectangle extends Rectangle {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getRoundedRectangle_Radius()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getRadius();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.RoundedRectangle#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(int value);

} // RoundedRectangle
