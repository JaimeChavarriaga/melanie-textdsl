/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Layout Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getRowSpan <em>Row Span</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getColumnSpan <em>Column Span</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#isGrabHorizontalExcess <em>Grab Horizontal Excess</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#isGrabVerticalExcess <em>Grab Vertical Excess</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getTableLayoutInformation()
 * @model
 * @generated
 */
public interface TableLayoutInformation extends LayoutInformationDescriptor {
	/**
	 * Returns the value of the '<em><b>Row Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Span</em>' attribute.
	 * @see #setRowSpan(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getTableLayoutInformation_RowSpan()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getRowSpan();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getRowSpan <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Span</em>' attribute.
	 * @see #getRowSpan()
	 * @generated
	 */
	void setRowSpan(int value);

	/**
	 * Returns the value of the '<em><b>Column Span</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Span</em>' attribute.
	 * @see #setColumnSpan(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getTableLayoutInformation_ColumnSpan()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getColumnSpan();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getColumnSpan <em>Column Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Span</em>' attribute.
	 * @see #getColumnSpan()
	 * @generated
	 */
	void setColumnSpan(int value);

	/**
	 * Returns the value of the '<em><b>Grab Horizontal Excess</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grab Horizontal Excess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grab Horizontal Excess</em>' attribute.
	 * @see #setGrabHorizontalExcess(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getTableLayoutInformation_GrabHorizontalExcess()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isGrabHorizontalExcess();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#isGrabHorizontalExcess <em>Grab Horizontal Excess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Horizontal Excess</em>' attribute.
	 * @see #isGrabHorizontalExcess()
	 * @generated
	 */
	void setGrabHorizontalExcess(boolean value);

	/**
	 * Returns the value of the '<em><b>Grab Vertical Excess</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grab Vertical Excess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grab Vertical Excess</em>' attribute.
	 * @see #setGrabVerticalExcess(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getTableLayoutInformation_GrabVerticalExcess()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isGrabVerticalExcess();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#isGrabVerticalExcess <em>Grab Vertical Excess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grab Vertical Excess</em>' attribute.
	 * @see #isGrabVerticalExcess()
	 * @generated
	 */
	void setGrabVerticalExcess(boolean value);

	/**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * The default value is <code>"Begin"</code>.
	 * The literals are from the enumeration {@link de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment
	 * @see #setHorizontalAlignment(Alignment)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getTableLayoutInformation_HorizontalAlignment()
	 * @model default="Begin" required="true"
	 * @generated
	 */
	Alignment getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
	void setHorizontalAlignment(Alignment value);

	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * The default value is <code>"Begin"</code>.
	 * The literals are from the enumeration {@link de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment
	 * @see #setVerticalAlignment(Alignment)
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getTableLayoutInformation_VerticalAlignment()
	 * @model default="Begin" required="true"
	 * @generated
	 */
	Alignment getVerticalAlignment();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(Alignment value);

} // TableLayoutInformation
