/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison#getTargetLevel <em>Target Level</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison#getInstanceLevel <em>Instance Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getLevelComparison()
 * @model
 * @generated
 */
public interface LevelComparison extends Check {
	/**
	 * Returns the value of the '<em><b>Target Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Level</em>' attribute.
	 * @see #setTargetLevel(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getLevelComparison_TargetLevel()
	 * @model required="true"
	 * @generated
	 */
	int getTargetLevel();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison#getTargetLevel <em>Target Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Level</em>' attribute.
	 * @see #getTargetLevel()
	 * @generated
	 */
	void setTargetLevel(int value);

	/**
	 * Returns the value of the '<em><b>Instance Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Level</em>' attribute.
	 * @see #setInstanceLevel(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#getLevelComparison_InstanceLevel()
	 * @model required="true"
	 * @generated
	 */
	int getInstanceLevel();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison#getInstanceLevel <em>Instance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Level</em>' attribute.
	 * @see #getInstanceLevel()
	 * @generated
	 */
	void setInstanceLevel(int value);

} // LevelComparison
