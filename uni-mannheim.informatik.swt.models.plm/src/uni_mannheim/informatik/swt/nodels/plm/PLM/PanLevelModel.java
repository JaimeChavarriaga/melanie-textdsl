/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.nodels.plm.PLM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pan Level Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uni_mannheim.informatik.swt.nodels.plm.PLM.PanLevelModel#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPanLevelModel()
 * @model
 * @generated
 */
public interface PanLevelModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link uni_mannheim.informatik.swt.nodels.plm.PLM.PElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Elements</em>' containment reference list.
	 * @see uni_mannheim.informatik.swt.nodels.plm.PLM.PLMPackage#getPanLevelModel_ModelElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PElement> getModelElements();

} // PanLevelModel
