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
 * A representation of the model object '<em><b>Layout Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor#getMargin <em>Margin</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor#getPadding <em>Padding</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLayoutDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface LayoutDescriptor extends VisualizationDescriptor {
	/**
	 * Returns the value of the '<em><b>Margin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin</em>' reference.
	 * @see #setMargin(SpacingDescriptor)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLayoutDescriptor_Margin()
	 * @model
	 * @generated
	 */
	SpacingDescriptor getMargin();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor#getMargin <em>Margin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin</em>' reference.
	 * @see #getMargin()
	 * @generated
	 */
	void setMargin(SpacingDescriptor value);

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding</em>' reference.
	 * @see #setPadding(SpacingDescriptor)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLayoutDescriptor_Padding()
	 * @model
	 * @generated
	 */
	SpacingDescriptor getPadding();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor#getPadding <em>Padding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' reference.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(SpacingDescriptor value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getLayoutDescriptor_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<LayoutContentDescriptor> getContent();

} // LayoutDescriptor
