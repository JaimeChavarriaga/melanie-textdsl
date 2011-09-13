/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element#isExpressed <em>Expressed</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element#isRelevant <em>Relevant</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element#getVisualizer <em>Visualizer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expressed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressed</em>' attribute.
	 * @see #setExpressed(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getElement_Expressed()
	 * @model default="true"
	 * @generated
	 */
	boolean isExpressed();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element#isExpressed <em>Expressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressed</em>' attribute.
	 * @see #isExpressed()
	 * @generated
	 */
	void setExpressed(boolean value);

	/**
	 * Returns the value of the '<em><b>Relevant</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant</em>' attribute.
	 * @see #setRelevant(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getElement_Relevant()
	 * @model default="true"
	 * @generated
	 */
	boolean isRelevant();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Element#isRelevant <em>Relevant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevant</em>' attribute.
	 * @see #isRelevant()
	 * @generated
	 */
	void setRelevant(boolean value);

	/**
	 * Returns the value of the '<em><b>Visualizer</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visualizer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualizer</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getElement_Visualizer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Visualizer> getVisualizer();

} // Element
