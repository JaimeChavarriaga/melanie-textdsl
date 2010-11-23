/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.util;

import de.uni_mannheim.informatik.swt.models.plm.PLM.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage
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
			case PLMPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.ONTOLOGY: {
				Ontology ontology = (Ontology)theEObject;
				T result = caseOntology(ontology);
				if (result == null) result = caseElement(ontology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.OWNED_ELEMENT: {
				OwnedElement ownedElement = (OwnedElement)theEObject;
				T result = caseOwnedElement(ownedElement);
				if (result == null) result = caseElement(ownedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.LOGICAL_ELEMENT: {
				LogicalElement logicalElement = (LogicalElement)theEObject;
				T result = caseLogicalElement(logicalElement);
				if (result == null) result = caseOwnedElement(logicalElement);
				if (result == null) result = caseElement(logicalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.POTENT_ELEMENT: {
				PotentElement potentElement = (PotentElement)theEObject;
				T result = casePotentElement(potentElement);
				if (result == null) result = caseOwnedElement(potentElement);
				if (result == null) result = caseElement(potentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.SET_RELATIONSHIP: {
				SetRelationship setRelationship = (SetRelationship)theEObject;
				T result = caseSetRelationship(setRelationship);
				if (result == null) result = caseLogicalElement(setRelationship);
				if (result == null) result = caseOwnedElement(setRelationship);
				if (result == null) result = caseElement(setRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseLogicalElement(generalization);
				if (result == null) result = caseOwnedElement(generalization);
				if (result == null) result = caseElement(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.INSTANTIATION: {
				Instantiation instantiation = (Instantiation)theEObject;
				T result = caseInstantiation(instantiation);
				if (result == null) result = caseLogicalElement(instantiation);
				if (result == null) result = caseOwnedElement(instantiation);
				if (result == null) result = caseElement(instantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.COMPLEMENT: {
				Complement complement = (Complement)theEObject;
				T result = caseComplement(complement);
				if (result == null) result = caseSetRelationship(complement);
				if (result == null) result = caseLogicalElement(complement);
				if (result == null) result = caseOwnedElement(complement);
				if (result == null) result = caseElement(complement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.EQUALS: {
				Equals equals = (Equals)theEObject;
				T result = caseEquals(equals);
				if (result == null) result = caseSetRelationship(equals);
				if (result == null) result = caseLogicalElement(equals);
				if (result == null) result = caseOwnedElement(equals);
				if (result == null) result = caseElement(equals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.INVERSION: {
				Inversion inversion = (Inversion)theEObject;
				T result = caseInversion(inversion);
				if (result == null) result = caseSetRelationship(inversion);
				if (result == null) result = caseLogicalElement(inversion);
				if (result == null) result = caseOwnedElement(inversion);
				if (result == null) result = caseElement(inversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.BINARY_GENERALIZATION: {
				BinaryGeneralization binaryGeneralization = (BinaryGeneralization)theEObject;
				T result = caseBinaryGeneralization(binaryGeneralization);
				if (result == null) result = caseGeneralization(binaryGeneralization);
				if (result == null) result = caseLogicalElement(binaryGeneralization);
				if (result == null) result = caseOwnedElement(binaryGeneralization);
				if (result == null) result = caseElement(binaryGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.MULTIPLE_GENERALIZATION: {
				MultipleGeneralization multipleGeneralization = (MultipleGeneralization)theEObject;
				T result = caseMultipleGeneralization(multipleGeneralization);
				if (result == null) result = caseGeneralization(multipleGeneralization);
				if (result == null) result = caseLogicalElement(multipleGeneralization);
				if (result == null) result = caseOwnedElement(multipleGeneralization);
				if (result == null) result = caseElement(multipleGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.MULTIPLE_SPECIALIZATION: {
				MultipleSpecialization multipleSpecialization = (MultipleSpecialization)theEObject;
				T result = caseMultipleSpecialization(multipleSpecialization);
				if (result == null) result = caseGeneralization(multipleSpecialization);
				if (result == null) result = caseLogicalElement(multipleSpecialization);
				if (result == null) result = caseOwnedElement(multipleSpecialization);
				if (result == null) result = caseElement(multipleSpecialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.CLABJECT: {
				Clabject clabject = (Clabject)theEObject;
				T result = caseClabject(clabject);
				if (result == null) result = casePotentElement(clabject);
				if (result == null) result = caseOwnedElement(clabject);
				if (result == null) result = caseElement(clabject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = casePotentElement(feature);
				if (result == null) result = caseOwnedElement(feature);
				if (result == null) result = caseElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.DOMAIN_ENTITY: {
				DomainEntity domainEntity = (DomainEntity)theEObject;
				T result = caseDomainEntity(domainEntity);
				if (result == null) result = caseClabject(domainEntity);
				if (result == null) result = casePotentElement(domainEntity);
				if (result == null) result = caseOwnedElement(domainEntity);
				if (result == null) result = caseElement(domainEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.DOMAIN_CONNECTION: {
				DomainConnection domainConnection = (DomainConnection)theEObject;
				T result = caseDomainConnection(domainConnection);
				if (result == null) result = caseClabject(domainConnection);
				if (result == null) result = casePotentElement(domainConnection);
				if (result == null) result = caseOwnedElement(domainConnection);
				if (result == null) result = caseElement(domainConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseFeature(field);
				if (result == null) result = casePotentElement(field);
				if (result == null) result = caseOwnedElement(field);
				if (result == null) result = caseElement(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseFeature(method);
				if (result == null) result = casePotentElement(method);
				if (result == null) result = caseOwnedElement(method);
				if (result == null) result = caseElement(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.ONTOLOGY_LEVEL: {
				OntologyLevel ontologyLevel = (OntologyLevel)theEObject;
				T result = caseOntologyLevel(ontologyLevel);
				if (result == null) result = caseOwnedElement(ontologyLevel);
				if (result == null) result = caseElement(ontologyLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntology(Ontology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owned Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owned Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnedElement(OwnedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalElement(LogicalElement object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Potent Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Potent Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePotentElement(PotentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetRelationship(SetRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantiation(Instantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplement(Complement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquals(Equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInversion(Inversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryGeneralization(BinaryGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleGeneralization(MultipleGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Specialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleSpecialization(MultipleSpecialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clabject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clabject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClabject(Clabject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainEntity(DomainEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainConnection(DomainConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologyLevel(OntologyLevel object) {
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
