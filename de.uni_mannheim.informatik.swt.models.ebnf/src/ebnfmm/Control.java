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
 * </ul>
 * </p>
 *
 * @see ebnfmm.EbnfmmPackage#getControl()
 * @model abstract="true"
 * @generated
 */
public interface Control extends Symbol {
	/**
	 * Returns the value of the '<em><b>Definition List</b></em>' containment reference list.
	 * The list contents are of type {@link ebnfmm.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition List</em>' containment reference list.
	 * @see ebnfmm.EbnfmmPackage#getControl_DefinitionList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Symbol> getDefinitionList();

} // Control
