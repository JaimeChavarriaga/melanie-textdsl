/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level Visualization Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer#getCompletness <em>Completness</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getTopLevelVisualizationContainer()
 * @model abstract="true"
 * @generated
 */
public interface TopLevelVisualizationContainer extends VisualizationContainer {
	/**
	 * Returns the value of the '<em><b>Completness</b></em>' attribute.
	 * The default value is <code>"elision"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completness</em>' attribute.
	 * @see #setCompletness(String)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getTopLevelVisualizationContainer_Completness()
	 * @model default="elision"
	 * @generated
	 */
	String getCompletness();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer#getCompletness <em>Completness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completness</em>' attribute.
	 * @see #getCompletness()
	 * @generated
	 */
	void setCompletness(String value);

} // TopLevelVisualizationContainer
