/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.util;

import de.uni_mannheim.informatik.swt.models.plm.PLM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
public class PLMSwitch<T> extends Switch<T> {
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
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PLMPackage.LML_MODEL: {
				LMLModel lmlModel = (LMLModel)theEObject;
				T result = caseLMLModel(lmlModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.DOMAIN_ELEMENT: {
				DomainElement domainElement = (DomainElement)theEObject;
				T result = caseDomainElement(domainElement);
				if (result == null) result = caseOwnedElement(domainElement);
				if (result == null) result = caseElement(domainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseElement(model);
				if (result == null) result = caseTopLevelVisualizationContainer(model);
				if (result == null) result = caseVisualizationContainer(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.ONTOLOGY: {
				Ontology ontology = (Ontology)theEObject;
				T result = caseOntology(ontology);
				if (result == null) result = caseElement(ontology);
				if (result == null) result = caseTopLevelVisualizationContainer(ontology);
				if (result == null) result = caseVisualizationContainer(ontology);
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
			case PLMPackage.SET_RELATIONSHIP: {
				SetRelationship setRelationship = (SetRelationship)theEObject;
				T result = caseSetRelationship(setRelationship);
				if (result == null) result = caseLogicalElement(setRelationship);
				if (result == null) result = caseOwnedElement(setRelationship);
				if (result == null) result = caseElement(setRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.EQUALITY: {
				Equality equality = (Equality)theEObject;
				T result = caseEquality(equality);
				if (result == null) result = caseSetRelationship(equality);
				if (result == null) result = caseLogicalElement(equality);
				if (result == null) result = caseOwnedElement(equality);
				if (result == null) result = caseElement(equality);
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
			case PLMPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseLogicalElement(generalization);
				if (result == null) result = caseOwnedElement(generalization);
				if (result == null) result = caseElement(generalization);
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
			case PLMPackage.INSTANTIATION: {
				Instantiation instantiation = (Instantiation)theEObject;
				T result = caseInstantiation(instantiation);
				if (result == null) result = caseLogicalElement(instantiation);
				if (result == null) result = caseOwnedElement(instantiation);
				if (result == null) result = caseElement(instantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.CLABJECT: {
				Clabject clabject = (Clabject)theEObject;
				T result = caseClabject(clabject);
				if (result == null) result = caseDomainElement(clabject);
				if (result == null) result = caseVisualizationContainer(clabject);
				if (result == null) result = caseOwnedElement(clabject);
				if (result == null) result = caseElement(clabject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseDomainElement(feature);
				if (result == null) result = caseOwnedElement(feature);
				if (result == null) result = caseElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseClabject(entity);
				if (result == null) result = caseDomainElement(entity);
				if (result == null) result = caseVisualizationContainer(entity);
				if (result == null) result = caseOwnedElement(entity);
				if (result == null) result = caseElement(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseClabject(connection);
				if (result == null) result = caseDomainElement(connection);
				if (result == null) result = caseVisualizationContainer(connection);
				if (result == null) result = caseOwnedElement(connection);
				if (result == null) result = caseElement(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.VISUALIZER: {
				Visualizer visualizer = (Visualizer)theEObject;
				T result = caseVisualizer(visualizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseDomainElement(attribute);
				if (result == null) result = caseOwnedElement(attribute);
				if (result == null) result = caseElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseFeature(method);
				if (result == null) result = caseDomainElement(method);
				if (result == null) result = caseOwnedElement(method);
				if (result == null) result = caseElement(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.VISUALIZATION_CONTAINER: {
				VisualizationContainer visualizationContainer = (VisualizationContainer)theEObject;
				T result = caseVisualizationContainer(visualizationContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PLMPackage.TOP_LEVEL_VISUALIZATION_CONTAINER: {
				TopLevelVisualizationContainer topLevelVisualizationContainer = (TopLevelVisualizationContainer)theEObject;
				T result = caseTopLevelVisualizationContainer(topLevelVisualizationContainer);
				if (result == null) result = caseVisualizationContainer(topLevelVisualizationContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LML Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LML Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLMLModel(LMLModel object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainElement(DomainElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquality(Equality object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizer(Visualizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Visualization Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualization Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizationContainer(VisualizationContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Level Visualization Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Level Visualization Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopLevelVisualizationContainer(TopLevelVisualizationContainer object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PLMSwitch
