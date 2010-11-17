/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uni_mannheim.informatik.swt.models.plm.PLM.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import uni_mannheim.informatik.swt.models.plm.PLM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage
 * @generated
 */
public class PLMSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PLMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLMSwitch() {
		if (modelPackage == null) {
			modelPackage = PLMPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PLMPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PELEMENT: {
				PElement pElement = (PElement)theEObject;
				T result = casePElement(pElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PLEVEL_SPECIFIC_ELEMENT: {
				PLevelSpecificElement pLevelSpecificElement = (PLevelSpecificElement)theEObject;
				T result = casePLevelSpecificElement(pLevelSpecificElement);
				if (result == null) result = casePElement(pLevelSpecificElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PMODULE: {
				PModule pModule = (PModule)theEObject;
				T result = casePModule(pModule);
				if (result == null) result = casePElement(pModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PINSTANTIABLE_ELEMENT: {
				PInstantiableElement pInstantiableElement = (PInstantiableElement)theEObject;
				T result = casePInstantiableElement(pInstantiableElement);
				if (result == null) result = casePLevelSpecificElement(pInstantiableElement);
				if (result == null) result = casePElement(pInstantiableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PPACKAGE: {
				PPackage pPackage = (PPackage)theEObject;
				T result = casePPackage(pPackage);
				if (result == null) result = casePLevelSpecificElement(pPackage);
				if (result == null) result = casePElement(pPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PCONNECTOR: {
				PConnector pConnector = (PConnector)theEObject;
				T result = casePConnector(pConnector);
				if (result == null) result = casePLevelSpecificElement(pConnector);
				if (result == null) result = casePElement(pConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PFIELD: {
				PField pField = (PField)theEObject;
				T result = casePField(pField);
				if (result == null) result = casePInstantiableElement(pField);
				if (result == null) result = casePLevelSpecificElement(pField);
				if (result == null) result = casePElement(pField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PCLABJECT: {
				PClabject pClabject = (PClabject)theEObject;
				T result = casePClabject(pClabject);
				if (result == null) result = casePInstantiableElement(pClabject);
				if (result == null) result = casePLevelSpecificElement(pClabject);
				if (result == null) result = casePElement(pClabject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PMETHOD: {
				PMethod pMethod = (PMethod)theEObject;
				T result = casePMethod(pMethod);
				if (result == null) result = casePInstantiableElement(pMethod);
				if (result == null) result = casePLevelSpecificElement(pMethod);
				if (result == null) result = casePElement(pMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PNODE: {
				PNode pNode = (PNode)theEObject;
				T result = casePNode(pNode);
				if (result == null) result = casePClabject(pNode);
				if (result == null) result = casePInstantiableElement(pNode);
				if (result == null) result = casePLevelSpecificElement(pNode);
				if (result == null) result = casePElement(pNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PRELATIONSHIP: {
				PRelationship pRelationship = (PRelationship)theEObject;
				T result = casePRelationship(pRelationship);
				if (result == null) result = casePClabject(pRelationship);
				if (result == null) result = casePConnector(pRelationship);
				if (result == null) result = casePInstantiableElement(pRelationship);
				if (result == null) result = casePLevelSpecificElement(pRelationship);
				if (result == null) result = casePElement(pRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PGENERALIZATION: {
				PGeneralization pGeneralization = (PGeneralization)theEObject;
				T result = casePGeneralization(pGeneralization);
				if (result == null) result = casePConnector(pGeneralization);
				if (result == null) result = casePLevelSpecificElement(pGeneralization);
				if (result == null) result = casePElement(pGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PINSTANTIATION: {
				PInstantiation pInstantiation = (PInstantiation)theEObject;
				T result = casePInstantiation(pInstantiation);
				if (result == null) result = casePConnector(pInstantiation);
				if (result == null) result = casePLevelSpecificElement(pInstantiation);
				if (result == null) result = casePElement(pInstantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.PAN_LEVEL_MODEL: {
				PanLevelModel panLevelModel = (PanLevelModel)theEObject;
				T result = casePanLevelModel(panLevelModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePElement(PElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PLevel Specific Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PLevel Specific Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePLevelSpecificElement(PLevelSpecificElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PModule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PModule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePModule(PModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PInstantiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PInstantiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePInstantiableElement(PInstantiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePPackage(PPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PConnector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PConnector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePConnector(PConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePField(PField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PClabject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PClabject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePClabject(PClabject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePMethod(PMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PNode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PNode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePNode(PNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRelationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRelationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRelationship(PRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PGeneralization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PGeneralization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePGeneralization(PGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PInstantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PInstantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePInstantiation(PInstantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pan Level Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pan Level Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePanLevelModel(PanLevelModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //PLMSwitch
