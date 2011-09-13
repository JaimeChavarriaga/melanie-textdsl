/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM;

import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationDescriptor;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clabject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isInstantiable <em>Instantiable</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getPotency <em>Potency</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getLevel <em>Level</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getBlueprint <em>Blueprint</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getContent <em>Content</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getClabject()
 * @model annotation="Comment level\040derrived='Element container = (this.eContainer() instanceof Element) ? (Element)this.eContainer() : null;\r\n\t\t\r\n\t\twhile ( (container != null) && !(container instanceof Model) )\r\n\t\t\tcontainer = (container.eContainer() instanceof Element) ? (Element)container.eContainer() : null;\r\n\t\tif (container == null)\r\n\t\t\treturn -1;\r\n\t\treturn (container.eContainer() instanceof Ontology) ? ((Ontology)container.eContainer()).getModels().indexOf(container) : -1;'"
 * @generated
 */
public interface Clabject extends DomainElement, VisualizationContainer {
	/**
	 * Returns the value of the '<em><b>Instantiable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiable</em>' attribute.
	 * @see #setInstantiable(boolean)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getClabject_Instantiable()
	 * @model default="true"
	 * @generated
	 */
	boolean isInstantiable();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#isInstantiable <em>Instantiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiable</em>' attribute.
	 * @see #isInstantiable()
	 * @generated
	 */
	void setInstantiable(boolean value);

	/**
	 * Returns the value of the '<em><b>Potency</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potency</em>' attribute.
	 * @see #setPotency(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getClabject_Potency()
	 * @model default="1"
	 * @generated
	 */
	int getPotency();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getPotency <em>Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potency</em>' attribute.
	 * @see #getPotency()
	 * @generated
	 */
	void setPotency(int value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getClabject_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Blueprint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blueprint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blueprint</em>' reference.
	 * @see #setBlueprint(Clabject)
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getClabject_Blueprint()
	 * @model
	 * @generated
	 */
	Clabject getBlueprint();

	/**
	 * Sets the value of the '{@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject#getBlueprint <em>Blueprint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blueprint</em>' reference.
	 * @see #getBlueprint()
	 * @generated
	 */
	void setBlueprint(Clabject value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getClabject_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clabject> getContent();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_mannheim.informatik.swt.models.plm.PLM.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage#getClabject_Feature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='Instantiation.allInstances()->select(i | i.type = self).instance'"
	 * @generated
	 */
	EList<Clabject> allInstancesFrom(String model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let parent:ecore::EObject = \r\n\tself.oclAsType(ecore::EObject).eContainer()\r\nin\r\n\tif (parent.oclIsTypeOf(Model)) then\r\n\t\tparent.oclAsType(Model)\r\n\telse\r\n\t\tif (parent.oclIsTypeOf(Clabject)) then\r\n\t\t\tparent.oclAsType(Clabject).getModel()\r\n\t\telse\r\n\t\t\tnull\r\n\t\tendif\r\n\tendif'"
	 * @generated
	 */
	Model getModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let containingModel:Model = \r\n\tself.getModel()\r\nin\r\nlet directResult:Set(Clabject) =\r\n\t--Check all direct BinaryGeneralizations\r\n\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(BinaryGeneralization) and g.oclAsType(BinaryGeneralization).subtype = self)\r\n\t->collect(g | g.oclAsType(BinaryGeneralization).supertype)\r\n\t\r\n\t--Check all direct MultipleSpecializations\r\n\t->union(\r\n\t\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(MultipleSpecialization) and g.oclAsType(MultipleSpecialization).subtype->includes(self))\r\n\t\t->collect(g | g.oclAsType(MultipleSpecialization).supertype)\r\n\t)\r\n\t--Check all direct MultipleGeneralizations\r\n\t->union(\r\n\t\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(MultipleGeneralization) and g.oclAsType(MultipleGeneralization).subtype = self)\r\n\t\t->collect(g | g.oclAsType(MultipleGeneralization).supertype)->flatten()\r\n\t)->asSet()\r\nin\r\n--Start recursion\r\ndirectResult->iterate(c:Clabject; type:Set(Clabject) = directResult|\r\n\ttype->union(c.getModelSupertypes())\r\n)'"
	 * @generated
	 */
	EList<Clabject> getModelSupertypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let containingModel:Model = \r\n\tself.getModel()\r\nin\r\nlet directResult:OrderedSet(Clabject) =\r\n\t--Check all direct BinaryGeneralizations\r\n\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(BinaryGeneralization) and g.oclAsType(BinaryGeneralization).supertype = self)\r\n\t->collect(g | g.oclAsType(BinaryGeneralization).subtype)\r\n\t\r\n\t--Check all direct MultipleSpecializations\r\n\t->union(\r\n\t\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(MultipleGeneralization) and g.oclAsType(MultipleGeneralization).supertype->includes(self))\r\n\t\t->collect(g | g.oclAsType(MultipleGeneralization).subtype)\r\n\t)\r\n\t\r\n\t--Check all direct MultipleGeneralizations\r\n\t->union(\r\n\t\tcontainingModel.getAllGeneralizations()->select(g | g.oclIsTypeOf(MultipleSpecialization) and g.oclAsType(MultipleSpecialization).supertype = self)\r\n\t\t->collect(g | g.oclAsType(MultipleSpecialization).subtype)->flatten()\r\n\t)\r\n\t->asOrderedSet()\r\nin\r\n--Start recursion\r\ndirectResult->iterate(c:Clabject; type:OrderedSet(Clabject) = directResult|\r\n\ttype->union(c.getModelSubtypes())\r\n)'"
	 * @generated
	 */
	EList<Clabject> getModelSubtypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='Instantiation.allInstances()->select(i|i.instance = self)'"
	 * @generated
	 */
	EList<Instantiation> getModelClassificationsAsInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='Instantiation.allInstances()->select(i|i.type = self)'"
	 * @generated
	 */
	EList<Instantiation> getModelClassificationsAsType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let allTypes:Set(Clabject) = \r\n\tself.getModelSubtypes()->append(self)\r\nin\r\n\tallTypes->iterate(type:Clabject; instances:Set(Clabject) = Set(Clabject){}|\r\n\t\t--Take all instances\r\n\t\tinstances->union(type.getModelClassificationsAsType().instance)\r\n\t\t--Union with subtypes of instances\r\n\t\t->union(type.getModelClassificationsAsType().instance.getModelSubtypes())\r\n\t)'"
	 * @generated
	 */
	EList<Clabject> getModelInstances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let allTypesSet(Clabject) = \r\n\tself.getModelSupertypes()->append(self)\r\nin\r\n\tallTypes->iterate(type:Clabject; instances:Set(Clabject) =Set(Clabject){}|\r\n\t\t--Take all types\r\n\t\tinstances->union(type.getModelClassificationsAsInstance().type)\r\n\t\t--Union with supertypes of types\r\n\t\t->union(type.getModelClassificationsAsInstance().type.getModelSupertypes())\r\n\t)'"
	 * @generated
	 */
	EList<Clabject> getModelTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getModelSupertypes()->including(self).feature->asSet()'"
	 * @generated
	 */
	EList<Feature> getAllFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getAllFeatures()->select(f | f.oclIsTypeOf(Attribute)).oclAsType(Attribute)'"
	 * @generated
	 */
	EList<Attribute> getAllAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getAllFeatures()->select(f | f.oclIsTypeOf(Method)).oclAsType(Method)'"
	 * @generated
	 */
	EList<Method> getAllMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='type.getModelInstances()->includes(self)'"
	 * @generated
	 */
	boolean isModelInstanceOf(Clabject type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" instanceRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='instance.getModelTypes()->includes(self)'"
	 * @generated
	 */
	boolean isModelTypeOf(Clabject instance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='Connection.allInstances()->select(c|c.participant->includes(self))'"
	 * @generated
	 */
	EList<Connection> getEigenConnections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getInheritedConnections()->union(self.getEigenConnections())'"
	 * @generated
	 */
	EList<Connection> getAllConnections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getModelSupertypes().getEigenConnections()->asSet()'"
	 * @generated
	 */
	EList<Connection> getInheritedConnections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getEigenConnections()->iterate(c:Connection; associates:Set(Clabject)=Set(Clabject){}|\r\n\tassociates->union(\r\n\t\tc.participant->select(p | c.isNavigableForParticipant(p) and p <> self)\r\n\t)\r\n)'"
	 * @generated
	 */
	EList<Clabject> getEigenAssociates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	EList<Clabject> getInheritedAssociates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	EList<Clabject> getAllAssociates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getEigenConnections()->iterate(c:Connection; associates:Set(String)=Set(String){}|\r\n\tassociates->union(\r\n\t\tc.roleName->select(rN| c.getParticipantForRoleName(rN) <> self)->asSet()\r\n\t)\r\n)'"
	 * @generated
	 */
	EList<String> getEigenAssociateRoleNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getInheritedAssociateRoleNames()->union(self.getEigenAssociateRoleNames())'"
	 * @generated
	 */
	EList<String> getAllAssociateRoleNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getModelSupertypes()->iterate(sup:Clabject; associates:Set(String)=Set(String){}|\r\n\tassociates->union( sup.getEigenAssociateRoleNames())\r\n\t)'"
	 * @generated
	 */
	EList<String> getInheritedAssociateRoleNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roleNameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getEigenConnections()->select(c | c.roleName->includes(roleName) and c.isNavigableForRoleName(roleName)).getParticipantForRoleName(roleName)->asSet()'"
	 * @generated
	 */
	EList<Clabject> getEigenAssociatesForRoleName(String roleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roleNameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getInheritedConnections()->select(c | c.roleName->includes(roleName) and c.isNavigableForRoleName(roleName)).getParticipantForRoleName(roleName)->asSet()'"
	 * @generated
	 */
	EList<Clabject> getInheritedAssociatesForRoleName(String roleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roleNameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getInheritedAssociatesForRoleName(roleName)->union(self.getEigenAssociatesForRoleName(roleName))'"
	 * @generated
	 */
	EList<Clabject> getAllAssociatesForRoleName(String roleName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	EList<Clabject> getModelCompleteTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	EList<Clabject> getModelIncompleteTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	Clabject getModelBlueprint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	EList<Clabject> getModelOffspring();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	EList<Clabject> getModelIsonyms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	EList<Clabject> getModelHyponyms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" connectionRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='OclInvalid'"
	 * @generated
	 */
	EList<Clabject> getDomainForConnection(Connection connection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='--At first we look if a visualization descriptor is directly attached\r\nlet possibleVisualization:Set(visualization::VisualizationDescriptor) = \r\n\tself.visualizer.child->asSet()\r\nin\r\n--Now look at the superTypes if nothing is directly found\r\nlet possibleVisualizationOfModelSupertypes:Set(visualization::VisualizationDescriptor) =\r\n\tif (possibleVisualization->size() = 0) then\r\n\t\tself.getModelSupertypes().visualizer.child->asSet()\r\n\telse\r\n\t\tpossibleVisualization\r\n\tendif\r\nin\r\n--Look at the model types if nothing is found\r\nif (possibleVisualizationOfModelSupertypes->size() = 0) then\r\n\tself.getModelTypes().getPossibleDomainSpecificVisualizers()->asSet()\r\nelse\r\n\tpossibleVisualizationOfModelSupertypes\r\nendif'"
	 * @generated
	 */
	EList<VisualizationDescriptor> getPossibleDomainSpecificVisualizers();

} // Clabject
