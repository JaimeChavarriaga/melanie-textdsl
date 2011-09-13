/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Decoration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#isFill <em>Fill</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#isOutline <em>Outline</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getOutlineWidth <em>Outline Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLinkDecoration()
 * @model abstract="true"
 * @generated
 */
public interface LinkDecoration extends EObject {
	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #setFill(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLinkDecoration_Fill()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isFill();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isFill()
	 * @generated
	 */
	void setFill(boolean value);

	/**
	 * Returns the value of the '<em><b>Outline</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline</em>' attribute.
	 * @see #setOutline(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLinkDecoration_Outline()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isOutline();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#isOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see #isOutline()
	 * @generated
	 */
	void setOutline(boolean value);

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
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLinkDecoration_ForegroundColor()
	 * @model default="Black" required="true"
	 * @generated
	 */
	ColorConstant getForegroundColor();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getForegroundColor <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground Color</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant
	 * @see #getForegroundColor()
	 * @generated
	 */
	void setForegroundColor(ColorConstant value);

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
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLinkDecoration_BackgroundColor()
	 * @model default="White" required="true"
	 * @generated
	 */
	ColorConstant getBackgroundColor();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(ColorConstant value);

	/**
	 * Returns the value of the '<em><b>Outline Width</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline Width</em>' attribute.
	 * @see #setOutlineWidth(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLinkDecoration_OutlineWidth()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getOutlineWidth();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getOutlineWidth <em>Outline Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline Width</em>' attribute.
	 * @see #getOutlineWidth()
	 * @generated
	 */
	void setOutlineWidth(int value);

} // LinkDecoration
