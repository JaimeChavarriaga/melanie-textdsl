/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.PLM.OwnedElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.SetRelationship;
import de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ModelImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ModelImpl#getVisualizersShown <em>Visualizers Shown</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ModelImpl#getCompletness <em>Completness</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ModelImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends ElementImpl implements Model {
	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_EDEFAULT = "all";

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected String origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisualizersShown() <em>Visualizers Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizersShown()
	 * @generated
	 * @ordered
	 */
	protected static final String VISUALIZERS_SHOWN_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getVisualizersShown() <em>Visualizers Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizersShown()
	 * @generated
	 * @ordered
	 */
	protected String visualizersShown = VISUALIZERS_SHOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletness() <em>Completness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletness()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETNESS_EDEFAULT = "elision";

	/**
	 * The cached value of the '{@link #getCompletness() <em>Completness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletness()
	 * @generated
	 * @ordered
	 */
	protected String completness = COMPLETNESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<OwnedElement> content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(String newOrigin) {
		String oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.MODEL__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisualizersShown() {
		return visualizersShown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualizersShown(String newVisualizersShown) {
		String oldVisualizersShown = visualizersShown;
		visualizersShown = newVisualizersShown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.MODEL__VISUALIZERS_SHOWN, oldVisualizersShown, visualizersShown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompletness() {
		return completness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletness(String newCompletness) {
		String oldCompletness = completness;
		completness = newCompletness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.MODEL__COMPLETNESS, oldCompletness, completness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwnedElement> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<OwnedElement>(OwnedElement.class, this, PLMPackage.MODEL__CONTENT);
		}
		return content;
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllGeneralizations() <em>Get All Generalizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_GENERALIZATIONS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___GET_ALL_GENERALIZATIONS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generalization> getAllGeneralizations() {
		try {
			return (EList<Generalization>)GET_ALL_GENERALIZATIONS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllSetRelationships() <em>Get All Set Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSetRelationships()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_SET_RELATIONSHIPS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___GET_ALL_SET_RELATIONSHIPS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SetRelationship> getAllSetRelationships() {
		try {
			return (EList<SetRelationship>)GET_ALL_SET_RELATIONSHIPS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllClabjects() <em>Get All Clabjects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllClabjects()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_CLABJECTS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___GET_ALL_CLABJECTS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getAllClabjects() {
		try {
			return (EList<Clabject>)GET_ALL_CLABJECTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllEntities() <em>Get All Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllEntities()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_ENTITIES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___GET_ALL_ENTITIES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entity> getAllEntities() {
		try {
			return (EList<Entity>)GET_ALL_ENTITIES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllConnections() <em>Get All Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllConnections()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_CONNECTIONS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___GET_ALL_CONNECTIONS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connection> getAllConnections() {
		try {
			return (EList<Connection>)GET_ALL_CONNECTIONS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllClassifications() <em>Get All Classifications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllClassifications()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_CLASSIFICATIONS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___GET_ALL_CLASSIFICATIONS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classification> getAllClassifications() {
		try {
			return (EList<Classification>)GET_ALL_CLASSIFICATIONS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getOntology() <em>Get Ontology</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntology()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ONTOLOGY__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___GET_ONTOLOGY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology getOntology() {
		try {
			return (Ontology)GET_ONTOLOGY__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getClassifiedModel() <em>Get Classified Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedModel()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CLASSIFIED_MODEL__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___GET_CLASSIFIED_MODEL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getClassifiedModel() {
		try {
			return (Model)GET_CLASSIFIED_MODEL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getClassifyingModel() <em>Get Classifying Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifyingModel()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CLASSIFYING_MODEL__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___GET_CLASSIFYING_MODEL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getClassifyingModel() {
		try {
			return (Model)GET_CLASSIFYING_MODEL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getLevel() <em>Get Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_LEVEL__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___GET_LEVEL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		try {
			return (Integer)GET_LEVEL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isRootModel() <em>Is Root Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRootModel()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_ROOT_MODEL__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___IS_ROOT_MODEL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRootModel() {
		try {
			return (Boolean)IS_ROOT_MODEL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isLeafModel() <em>Is Leaf Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeafModel()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_LEAF_MODEL__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.MODEL___IS_LEAF_MODEL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeafModel() {
		try {
			return (Boolean)IS_LEAF_MODEL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PLMPackage.MODEL__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PLMPackage.MODEL__ORIGIN:
				return getOrigin();
			case PLMPackage.MODEL__VISUALIZERS_SHOWN:
				return getVisualizersShown();
			case PLMPackage.MODEL__COMPLETNESS:
				return getCompletness();
			case PLMPackage.MODEL__CONTENT:
				return getContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PLMPackage.MODEL__ORIGIN:
				setOrigin((String)newValue);
				return;
			case PLMPackage.MODEL__VISUALIZERS_SHOWN:
				setVisualizersShown((String)newValue);
				return;
			case PLMPackage.MODEL__COMPLETNESS:
				setCompletness((String)newValue);
				return;
			case PLMPackage.MODEL__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends OwnedElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PLMPackage.MODEL__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case PLMPackage.MODEL__VISUALIZERS_SHOWN:
				setVisualizersShown(VISUALIZERS_SHOWN_EDEFAULT);
				return;
			case PLMPackage.MODEL__COMPLETNESS:
				setCompletness(COMPLETNESS_EDEFAULT);
				return;
			case PLMPackage.MODEL__CONTENT:
				getContent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PLMPackage.MODEL__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case PLMPackage.MODEL__VISUALIZERS_SHOWN:
				return VISUALIZERS_SHOWN_EDEFAULT == null ? visualizersShown != null : !VISUALIZERS_SHOWN_EDEFAULT.equals(visualizersShown);
			case PLMPackage.MODEL__COMPLETNESS:
				return COMPLETNESS_EDEFAULT == null ? completness != null : !COMPLETNESS_EDEFAULT.equals(completness);
			case PLMPackage.MODEL__CONTENT:
				return content != null && !content.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VisualizationContainer.class) {
			switch (derivedFeatureID) {
				case PLMPackage.MODEL__ORIGIN: return PLMPackage.VISUALIZATION_CONTAINER__ORIGIN;
				case PLMPackage.MODEL__VISUALIZERS_SHOWN: return PLMPackage.VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN;
				default: return -1;
			}
		}
		if (baseClass == TopLevelVisualizationContainer.class) {
			switch (derivedFeatureID) {
				case PLMPackage.MODEL__COMPLETNESS: return PLMPackage.TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VisualizationContainer.class) {
			switch (baseFeatureID) {
				case PLMPackage.VISUALIZATION_CONTAINER__ORIGIN: return PLMPackage.MODEL__ORIGIN;
				case PLMPackage.VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN: return PLMPackage.MODEL__VISUALIZERS_SHOWN;
				default: return -1;
			}
		}
		if (baseClass == TopLevelVisualizationContainer.class) {
			switch (baseFeatureID) {
				case PLMPackage.TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS: return PLMPackage.MODEL__COMPLETNESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PLMPackage.MODEL___GET_ALL_GENERALIZATIONS:
				return getAllGeneralizations();
			case PLMPackage.MODEL___GET_ALL_SET_RELATIONSHIPS:
				return getAllSetRelationships();
			case PLMPackage.MODEL___GET_ALL_CLABJECTS:
				return getAllClabjects();
			case PLMPackage.MODEL___GET_ALL_ENTITIES:
				return getAllEntities();
			case PLMPackage.MODEL___GET_ALL_CONNECTIONS:
				return getAllConnections();
			case PLMPackage.MODEL___GET_ALL_CLASSIFICATIONS:
				return getAllClassifications();
			case PLMPackage.MODEL___GET_ONTOLOGY:
				return getOntology();
			case PLMPackage.MODEL___GET_CLASSIFIED_MODEL:
				return getClassifiedModel();
			case PLMPackage.MODEL___GET_CLASSIFYING_MODEL:
				return getClassifyingModel();
			case PLMPackage.MODEL___GET_LEVEL:
				return getLevel();
			case PLMPackage.MODEL___IS_ROOT_MODEL:
				return isRootModel();
			case PLMPackage.MODEL___IS_LEAF_MODEL:
				return isLeafModel();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (origin: ");
		result.append(origin);
		result.append(", visualizersShown: ");
		result.append(visualizersShown);
		result.append(", completness: ");
		result.append(completness);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
