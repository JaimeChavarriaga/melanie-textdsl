/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Link Decoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecoration#getDecorationType <em>Decoration Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getDefaultLinkDecoration()
 * @model
 * @generated
 */
public interface DefaultLinkDecoration extends LinkDecoration {
	/**
	 * Returns the value of the '<em><b>Decoration Type</b></em>' attribute.
	 * The default value is <code>"PolygoneLineDecoration"</code>.
	 * The literals are from the enumeration {@link de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecorationTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration Type</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecorationTypes
	 * @see #setDecorationType(DefaultLinkDecorationTypes)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getDefaultLinkDecoration_DecorationType()
	 * @model default="PolygoneLineDecoration" required="true"
	 * @generated
	 */
	DefaultLinkDecorationTypes getDecorationType();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecoration#getDecorationType <em>Decoration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoration Type</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecorationTypes
	 * @see #getDecorationType()
	 * @generated
	 */
	void setDecorationType(DefaultLinkDecorationTypes value);

} // DefaultLinkDecoration
