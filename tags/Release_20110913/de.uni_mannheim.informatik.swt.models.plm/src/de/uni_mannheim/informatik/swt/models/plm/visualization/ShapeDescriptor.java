/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#getLayout <em>Layout</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#isOutline <em>Outline</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#isFill <em>Fill</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#getOutlineWidth <em>Outline Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getShapeDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface ShapeDescriptor extends LayoutContentDescriptor {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(LayoutDescriptor)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getShapeDescriptor_Layout()
	 * @model containment="true"
	 * @generated
	 */
	LayoutDescriptor getLayout();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(LayoutDescriptor value);

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
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getShapeDescriptor_Outline()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isOutline();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#isOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see #isOutline()
	 * @generated
	 */
	void setOutline(boolean value);

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
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getShapeDescriptor_Fill()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isFill();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isFill()
	 * @generated
	 */
	void setFill(boolean value);

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
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getShapeDescriptor_OutlineWidth()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getOutlineWidth();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#getOutlineWidth <em>Outline Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline Width</em>' attribute.
	 * @see #getOutlineWidth()
	 * @generated
	 */
	void setOutlineWidth(int value);

} // ShapeDescriptor
