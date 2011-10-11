/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer#getOrigin <em>Origin</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer#getVisualizersShown <em>Visualizers Shown</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getVisualizationContainer()
 * @model abstract="true"
 * @generated
 */
public interface VisualizationContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * The default value is <code>"all"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getVisualizationContainer_Origin()
	 * @model default="all"
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Visualizers Shown</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supports ALL and NONE
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visualizers Shown</em>' attribute.
	 * @see #setVisualizersShown(String)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getVisualizationContainer_VisualizersShown()
	 * @model default="none"
	 * @generated
	 */
	String getVisualizersShown();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer#getVisualizersShown <em>Visualizers Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualizers Shown</em>' attribute.
	 * @see #getVisualizersShown()
	 * @generated
	 */
	void setVisualizersShown(String value);

} // VisualizationContainer
