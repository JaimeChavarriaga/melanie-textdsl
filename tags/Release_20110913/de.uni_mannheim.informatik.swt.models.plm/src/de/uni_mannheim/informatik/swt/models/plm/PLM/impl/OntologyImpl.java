/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.TopLevelVisualizationContainer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
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
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyImpl#getVisualizersShown <em>Visualizers Shown</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyImpl#getCompletness <em>Completness</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.OntologyImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OntologyImpl extends ElementImpl implements Ontology {
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
	protected EList<Model> content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.ONTOLOGY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.ONTOLOGY__ORIGIN, oldOrigin, origin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.ONTOLOGY__VISUALIZERS_SHOWN, oldVisualizersShown, visualizersShown));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.ONTOLOGY__COMPLETNESS, oldCompletness, completness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<Model>(Model.class, this, PLMPackage.ONTOLOGY__CONTENT);
		}
		return content;
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelAtLevel(int) <em>Get Model At Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAtLevel(int)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_AT_LEVEL_INT__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.ONTOLOGY___GET_MODEL_AT_LEVEL__INT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModelAtLevel(int level) {
		try {
			return (Model)GET_MODEL_AT_LEVEL_INT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{level}));
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
			case PLMPackage.ONTOLOGY__CONTENT:
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
			case PLMPackage.ONTOLOGY__ORIGIN:
				return getOrigin();
			case PLMPackage.ONTOLOGY__VISUALIZERS_SHOWN:
				return getVisualizersShown();
			case PLMPackage.ONTOLOGY__COMPLETNESS:
				return getCompletness();
			case PLMPackage.ONTOLOGY__CONTENT:
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
			case PLMPackage.ONTOLOGY__ORIGIN:
				setOrigin((String)newValue);
				return;
			case PLMPackage.ONTOLOGY__VISUALIZERS_SHOWN:
				setVisualizersShown((String)newValue);
				return;
			case PLMPackage.ONTOLOGY__COMPLETNESS:
				setCompletness((String)newValue);
				return;
			case PLMPackage.ONTOLOGY__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Model>)newValue);
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
			case PLMPackage.ONTOLOGY__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case PLMPackage.ONTOLOGY__VISUALIZERS_SHOWN:
				setVisualizersShown(VISUALIZERS_SHOWN_EDEFAULT);
				return;
			case PLMPackage.ONTOLOGY__COMPLETNESS:
				setCompletness(COMPLETNESS_EDEFAULT);
				return;
			case PLMPackage.ONTOLOGY__CONTENT:
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
			case PLMPackage.ONTOLOGY__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case PLMPackage.ONTOLOGY__VISUALIZERS_SHOWN:
				return VISUALIZERS_SHOWN_EDEFAULT == null ? visualizersShown != null : !VISUALIZERS_SHOWN_EDEFAULT.equals(visualizersShown);
			case PLMPackage.ONTOLOGY__COMPLETNESS:
				return COMPLETNESS_EDEFAULT == null ? completness != null : !COMPLETNESS_EDEFAULT.equals(completness);
			case PLMPackage.ONTOLOGY__CONTENT:
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
				case PLMPackage.ONTOLOGY__ORIGIN: return PLMPackage.VISUALIZATION_CONTAINER__ORIGIN;
				case PLMPackage.ONTOLOGY__VISUALIZERS_SHOWN: return PLMPackage.VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN;
				default: return -1;
			}
		}
		if (baseClass == TopLevelVisualizationContainer.class) {
			switch (derivedFeatureID) {
				case PLMPackage.ONTOLOGY__COMPLETNESS: return PLMPackage.TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS;
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
				case PLMPackage.VISUALIZATION_CONTAINER__ORIGIN: return PLMPackage.ONTOLOGY__ORIGIN;
				case PLMPackage.VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN: return PLMPackage.ONTOLOGY__VISUALIZERS_SHOWN;
				default: return -1;
			}
		}
		if (baseClass == TopLevelVisualizationContainer.class) {
			switch (baseFeatureID) {
				case PLMPackage.TOP_LEVEL_VISUALIZATION_CONTAINER__COMPLETNESS: return PLMPackage.ONTOLOGY__COMPLETNESS;
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
			case PLMPackage.ONTOLOGY___GET_MODEL_AT_LEVEL__INT:
				return getModelAtLevel((Integer)arguments.get(0));
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

} //OntologyImpl
