/**
 */
package ebnfmm;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ebnfmm.Control#getDefinitionList <em>Definition List</em>}</li>
 *   <li>{@link ebnfmm.Control#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see ebnfmm.EbnfmmPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends NonReferenceableSymbol {

	/**
	 * Returns the value of the '<em><b>Definition List</b></em>' reference list.
	 * The list contents are of type {@link ebnfmm.NonReferenceableSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition List</em>' reference list.
	 * @see ebnfmm.EbnfmmPackage#getControl_DefinitionList()
	 * @model
	 * @generated
	 */
	EList<NonReferenceableSymbol> getDefinitionList();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link ebnfmm.Dummy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see ebnfmm.EbnfmmPackage#getControl_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dummy> getItems();
} // Control
