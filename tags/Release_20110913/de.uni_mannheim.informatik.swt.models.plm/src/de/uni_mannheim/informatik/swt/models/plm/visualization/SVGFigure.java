/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVG Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getDocumentURI <em>Document URI</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getWidth <em>Width</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getSVGFigure()
 * @model
 * @generated
 */
public interface SVGFigure extends ShapeDescriptor {
	/**
	 * Returns the value of the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document URI</em>' attribute.
	 * @see #setDocumentURI(String)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getSVGFigure_DocumentURI()
	 * @model required="true"
	 * @generated
	 */
	String getDocumentURI();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getDocumentURI <em>Document URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document URI</em>' attribute.
	 * @see #getDocumentURI()
	 * @generated
	 */
	void setDocumentURI(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getSVGFigure_Width()
	 * @model required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getSVGFigure_Height()
	 * @model required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // SVGFigure
