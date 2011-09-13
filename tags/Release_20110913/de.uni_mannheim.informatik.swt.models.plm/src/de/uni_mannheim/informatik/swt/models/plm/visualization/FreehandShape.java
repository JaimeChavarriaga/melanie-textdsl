/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Freehand Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape#getPoints <em>Points</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape#getWidth <em>Width</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getFreehandShape()
 * @model
 * @generated
 */
public interface FreehandShape extends ShapeDescriptor {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.visualization.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getFreehandShape_Points()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Point> getPoints();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getFreehandShape_Width()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getFreehandShape_Height()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // FreehandShape
