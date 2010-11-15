/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tut.models.requirements.requirements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tut.models.requirements.requirements.RequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/2008/requirements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "requirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsPackage eINSTANCE = tut.models.requirements.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link tut.models.requirements.requirements.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tut.models.requirements.requirements.impl.ModelImpl
	 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GROUPS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link tut.models.requirements.requirements.impl.RequirementGroupImpl <em>Requirement Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tut.models.requirements.requirements.impl.RequirementGroupImpl
	 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getRequirementGroup()
	 * @generated
	 */
	int REQUIREMENT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__ID = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__CHILDREN = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__PARENT = 4;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__REQUIREMENTS = 5;

	/**
	 * The number of structural features of the '<em>Requirement Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link tut.models.requirements.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tut.models.requirements.requirements.impl.RequirementImpl
	 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__AUTHOR = 4;

	/**
	 * The feature id for the '<em><b>Cretated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CRETATED = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 6;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATE = 7;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RESOLUTION = 8;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DEPENDENCIES = 9;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CHILDREN = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PARENT = 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERSION = 12;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COMMENTS = 13;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link tut.models.requirements.requirements.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tut.models.requirements.requirements.impl.CommentImpl
	 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SUBJECT = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATED = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CHILDREN = 4;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link tut.models.requirements.requirements.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tut.models.requirements.requirements.impl.VersionImpl
	 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 4;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__MAJOR = 0;

	/**
	 * The feature id for the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__MINOR = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__SERVICE = 2;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link tut.models.requirements.requirements.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tut.models.requirements.requirements.Type
	 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;

	/**
	 * The meta object id for the '{@link tut.models.requirements.requirements.Priority <em>Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tut.models.requirements.requirements.Priority
	 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 6;

	/**
	 * The meta object id for the '{@link tut.models.requirements.requirements.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tut.models.requirements.requirements.State
	 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getState()
	 * @generated
	 */
	int STATE = 7;

	/**
	 * The meta object id for the '{@link tut.models.requirements.requirements.Resolution <em>Resolution</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tut.models.requirements.requirements.Resolution
	 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getResolution()
	 * @generated
	 */
	int RESOLUTION = 8;


	/**
	 * Returns the meta object for class '{@link tut.models.requirements.requirements.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see tut.models.requirements.requirements.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link tut.models.requirements.requirements.Model#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see tut.models.requirements.requirements.Model#getGroups()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Groups();

	/**
	 * Returns the meta object for class '{@link tut.models.requirements.requirements.RequirementGroup <em>Requirement Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Group</em>'.
	 * @see tut.models.requirements.requirements.RequirementGroup
	 * @generated
	 */
	EClass getRequirementGroup();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.RequirementGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tut.models.requirements.requirements.RequirementGroup#getName()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EAttribute getRequirementGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.RequirementGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tut.models.requirements.requirements.RequirementGroup#getDescription()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EAttribute getRequirementGroup_Description();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.RequirementGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tut.models.requirements.requirements.RequirementGroup#getId()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EAttribute getRequirementGroup_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link tut.models.requirements.requirements.RequirementGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see tut.models.requirements.requirements.RequirementGroup#getChildren()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EReference getRequirementGroup_Children();

	/**
	 * Returns the meta object for the container reference '{@link tut.models.requirements.requirements.RequirementGroup#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see tut.models.requirements.requirements.RequirementGroup#getParent()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EReference getRequirementGroup_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link tut.models.requirements.requirements.RequirementGroup#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see tut.models.requirements.requirements.RequirementGroup#getRequirements()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EReference getRequirementGroup_Requirements();

	/**
	 * Returns the meta object for class '{@link tut.models.requirements.requirements.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see tut.models.requirements.requirements.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Requirement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getTitle()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Title();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Requirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Type();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Requirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Requirement#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getAuthor()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Author();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Requirement#getCretated <em>Cretated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cretated</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getCretated()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Cretated();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Requirement#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getState()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_State();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Requirement#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getResolution()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Resolution();

	/**
	 * Returns the meta object for the reference list '{@link tut.models.requirements.requirements.Requirement#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getDependencies()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link tut.models.requirements.requirements.Requirement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getChildren()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Children();

	/**
	 * Returns the meta object for the container reference '{@link tut.models.requirements.requirements.Requirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getParent()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link tut.models.requirements.requirements.Requirement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getVersion()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link tut.models.requirements.requirements.Requirement#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see tut.models.requirements.requirements.Requirement#getComments()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Comments();

	/**
	 * Returns the meta object for class '{@link tut.models.requirements.requirements.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see tut.models.requirements.requirements.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Comment#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see tut.models.requirements.requirements.Comment#getSubject()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Subject();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see tut.models.requirements.requirements.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Comment#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see tut.models.requirements.requirements.Comment#getAuthor()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Author();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Comment#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see tut.models.requirements.requirements.Comment#getCreated()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Created();

	/**
	 * Returns the meta object for the reference list '{@link tut.models.requirements.requirements.Comment#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see tut.models.requirements.requirements.Comment#getChildren()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Children();

	/**
	 * Returns the meta object for class '{@link tut.models.requirements.requirements.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see tut.models.requirements.requirements.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Version#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see tut.models.requirements.requirements.Version#getMajor()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Major();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Version#getMinor <em>Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor</em>'.
	 * @see tut.models.requirements.requirements.Version#getMinor()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Minor();

	/**
	 * Returns the meta object for the attribute '{@link tut.models.requirements.requirements.Version#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see tut.models.requirements.requirements.Version#getService()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Service();

	/**
	 * Returns the meta object for enum '{@link tut.models.requirements.requirements.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see tut.models.requirements.requirements.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link tut.models.requirements.requirements.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority</em>'.
	 * @see tut.models.requirements.requirements.Priority
	 * @generated
	 */
	EEnum getPriority();

	/**
	 * Returns the meta object for enum '{@link tut.models.requirements.requirements.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see tut.models.requirements.requirements.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the meta object for enum '{@link tut.models.requirements.requirements.Resolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolution</em>'.
	 * @see tut.models.requirements.requirements.Resolution
	 * @generated
	 */
	EEnum getResolution();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tut.models.requirements.requirements.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tut.models.requirements.requirements.impl.ModelImpl
		 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__GROUPS = eINSTANCE.getModel_Groups();

		/**
		 * The meta object literal for the '{@link tut.models.requirements.requirements.impl.RequirementGroupImpl <em>Requirement Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tut.models.requirements.requirements.impl.RequirementGroupImpl
		 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getRequirementGroup()
		 * @generated
		 */
		EClass REQUIREMENT_GROUP = eINSTANCE.getRequirementGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_GROUP__NAME = eINSTANCE.getRequirementGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_GROUP__DESCRIPTION = eINSTANCE.getRequirementGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_GROUP__ID = eINSTANCE.getRequirementGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_GROUP__CHILDREN = eINSTANCE.getRequirementGroup_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_GROUP__PARENT = eINSTANCE.getRequirementGroup_Parent();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_GROUP__REQUIREMENTS = eINSTANCE.getRequirementGroup_Requirements();

		/**
		 * The meta object literal for the '{@link tut.models.requirements.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tut.models.requirements.requirements.impl.RequirementImpl
		 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TITLE = eINSTANCE.getRequirement_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__AUTHOR = eINSTANCE.getRequirement_Author();

		/**
		 * The meta object literal for the '<em><b>Cretated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CRETATED = eINSTANCE.getRequirement_Cretated();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__STATE = eINSTANCE.getRequirement_State();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__RESOLUTION = eINSTANCE.getRequirement_Resolution();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DEPENDENCIES = eINSTANCE.getRequirement_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CHILDREN = eINSTANCE.getRequirement_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PARENT = eINSTANCE.getRequirement_Parent();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__VERSION = eINSTANCE.getRequirement_Version();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__COMMENTS = eINSTANCE.getRequirement_Comments();

		/**
		 * The meta object literal for the '{@link tut.models.requirements.requirements.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tut.models.requirements.requirements.impl.CommentImpl
		 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__SUBJECT = eINSTANCE.getComment_Subject();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__AUTHOR = eINSTANCE.getComment_Author();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CREATED = eINSTANCE.getComment_Created();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__CHILDREN = eINSTANCE.getComment_Children();

		/**
		 * The meta object literal for the '{@link tut.models.requirements.requirements.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tut.models.requirements.requirements.impl.VersionImpl
		 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MAJOR = eINSTANCE.getVersion_Major();

		/**
		 * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MINOR = eINSTANCE.getVersion_Minor();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__SERVICE = eINSTANCE.getVersion_Service();

		/**
		 * The meta object literal for the '{@link tut.models.requirements.requirements.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tut.models.requirements.requirements.Type
		 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link tut.models.requirements.requirements.Priority <em>Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tut.models.requirements.requirements.Priority
		 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getPriority()
		 * @generated
		 */
		EEnum PRIORITY = eINSTANCE.getPriority();

		/**
		 * The meta object literal for the '{@link tut.models.requirements.requirements.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tut.models.requirements.requirements.State
		 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link tut.models.requirements.requirements.Resolution <em>Resolution</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tut.models.requirements.requirements.Resolution
		 * @see tut.models.requirements.requirements.impl.RequirementsPackageImpl#getResolution()
		 * @generated
		 */
		EEnum RESOLUTION = eINSTANCE.getResolution();

	}

} //RequirementsPackage
