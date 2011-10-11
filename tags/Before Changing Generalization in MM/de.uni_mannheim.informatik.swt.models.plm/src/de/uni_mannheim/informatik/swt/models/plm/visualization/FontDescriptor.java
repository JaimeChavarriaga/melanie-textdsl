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
 * A representation of the model object '<em><b>Font Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getFontName <em>Font Name</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getSize <em>Size</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getFontStyle <em>Font Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getFontDescriptor()
 * @model
 * @generated
 */
public interface FontDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Name</em>' attribute.
	 * @see #setFontName(String)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getFontDescriptor_FontName()
	 * @model
	 * @generated
	 */
	String getFontName();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getFontName <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Name</em>' attribute.
	 * @see #getFontName()
	 * @generated
	 */
	void setFontName(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getFontDescriptor_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' attribute.
	 * The default value is <code>"Normal"</code>.
	 * The literals are from the enumeration {@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle
	 * @see #setFontStyle(FontStyle)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getFontDescriptor_FontStyle()
	 * @model default="Normal"
	 * @generated
	 */
	FontStyle getFontStyle();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(FontStyle value);

} // FontDescriptor
