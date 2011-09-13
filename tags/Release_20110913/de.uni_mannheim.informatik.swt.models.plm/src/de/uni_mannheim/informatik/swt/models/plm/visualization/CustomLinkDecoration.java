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
 * A representation of the model object '<em><b>Custom Link Decoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.CustomLinkDecoration#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getCustomLinkDecoration()
 * @model
 * @generated
 */
public interface CustomLinkDecoration extends LinkDecoration {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.visualization.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getCustomLinkDecoration_Points()
	 * @model required="true"
	 * @generated
	 */
	EList<Point> getPoints();

} // CustomLinkDecoration
