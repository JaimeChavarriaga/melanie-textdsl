/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Method;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.VisualizationContainer;

import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer;
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
 * An implementation of the model object '<em><b>Clabject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl#getVisualizersShown <em>Visualizers Shown</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl#isInstantiable <em>Instantiable</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl#getPotency <em>Potency</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl#getContent <em>Content</em>}</li>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.PLM.impl.ClabjectImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClabjectImpl extends DomainElementImpl implements Clabject {
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
	 * The default value of the '{@link #isInstantiable() <em>Instantiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTANTIABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInstantiable() <em>Instantiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiable()
	 * @generated
	 * @ordered
	 */
	protected boolean instantiable = INSTANTIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPotency() <em>Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotency()
	 * @generated
	 * @ordered
	 */
	protected static final int POTENCY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPotency() <em>Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotency()
	 * @generated
	 * @ordered
	 */
	protected int potency = POTENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Clabject> content;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClabjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PLMPackage.Literals.CLABJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.CLABJECT__ORIGIN, oldOrigin, origin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.CLABJECT__VISUALIZERS_SHOWN, oldVisualizersShown, visualizersShown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstantiable() {
		return instantiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiable(boolean newInstantiable) {
		boolean oldInstantiable = instantiable;
		instantiable = newInstantiable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.CLABJECT__INSTANTIABLE, oldInstantiable, instantiable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPotency() {
		return potency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPotency(int newPotency) {
		int oldPotency = potency;
		potency = newPotency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.CLABJECT__POTENCY, oldPotency, potency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PLMPackage.CLABJECT__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clabject> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<Clabject>(Clabject.class, this, PLMPackage.CLABJECT__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectContainmentEList<Feature>(Feature.class, this, PLMPackage.CLABJECT__FEATURE);
		}
		return feature;
	}

	/**
	 * The cached invocation delegate for the '{@link #allInstancesFrom(java.lang.String) <em>All Instances From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allInstancesFrom(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_INSTANCES_FROM_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___ALL_INSTANCES_FROM__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> allInstancesFrom(String model) {
		try {
			return (EList<Clabject>)ALL_INSTANCES_FROM_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{model}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModel() <em>Get Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		try {
			return (Model)GET_MODEL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelSupertypes() <em>Get Model Supertypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelSupertypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_SUPERTYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL_SUPERTYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getModelSupertypes() {
		try {
			return (EList<Clabject>)GET_MODEL_SUPERTYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelSubtypes() <em>Get Model Subtypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelSubtypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_SUBTYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL_SUBTYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getModelSubtypes() {
		try {
			return (EList<Clabject>)GET_MODEL_SUBTYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelClassificationsAsInstance() <em>Get Model Classifications As Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelClassificationsAsInstance()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_CLASSIFICATIONS_AS_INSTANCE__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_INSTANCE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classification> getModelClassificationsAsInstance() {
		try {
			return (EList<Classification>)GET_MODEL_CLASSIFICATIONS_AS_INSTANCE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelClassificationsAsType() <em>Get Model Classifications As Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelClassificationsAsType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_CLASSIFICATIONS_AS_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classification> getModelClassificationsAsType() {
		try {
			return (EList<Classification>)GET_MODEL_CLASSIFICATIONS_AS_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelInstances() <em>Get Model Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelInstances()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_INSTANCES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL_INSTANCES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getModelInstances() {
		try {
			return (EList<Clabject>)GET_MODEL_INSTANCES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelTypes() <em>Get Model Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelTypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_TYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL_TYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getModelTypes() {
		try {
			return (EList<Clabject>)GET_MODEL_TYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllFeatures() <em>Get All Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_FEATURES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_ALL_FEATURES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Feature> getAllFeatures() {
		try {
			return (EList<Feature>)GET_ALL_FEATURES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllAttributes() <em>Get All Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_ATTRIBUTES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_ALL_ATTRIBUTES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Attribute> getAllAttributes() {
		try {
			return (EList<Attribute>)GET_ALL_ATTRIBUTES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllMethods() <em>Get All Methods</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMethods()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_METHODS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_ALL_METHODS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Method> getAllMethods() {
		try {
			return (EList<Method>)GET_ALL_METHODS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isModelInstanceOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) <em>Is Model Instance Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModelInstanceOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_MODEL_INSTANCE_OF_CLABJECT__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___IS_MODEL_INSTANCE_OF__CLABJECT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public boolean isModelInstanceOf(Clabject type) {
		try {
			return (Boolean)IS_MODEL_INSTANCE_OF_CLABJECT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isModelTypeOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) <em>Is Model Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModelTypeOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_MODEL_TYPE_OF_CLABJECT__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___IS_MODEL_TYPE_OF__CLABJECT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModelTypeOf(Clabject instance) {
		try {
			return (Boolean)IS_MODEL_TYPE_OF_CLABJECT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{instance}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getEigenConnections() <em>Get Eigen Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEigenConnections()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_EIGEN_CONNECTIONS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_EIGEN_CONNECTIONS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connection> getEigenConnections() {
		try {
			return (EList<Connection>)GET_EIGEN_CONNECTIONS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_CONNECTIONS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_ALL_CONNECTIONS).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #getInheritedConnections() <em>Get Inherited Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedConnections()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INHERITED_CONNECTIONS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_INHERITED_CONNECTIONS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connection> getInheritedConnections() {
		try {
			return (EList<Connection>)GET_INHERITED_CONNECTIONS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getEigenAssociates() <em>Get Eigen Associates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEigenAssociates()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_EIGEN_ASSOCIATES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_EIGEN_ASSOCIATES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getEigenAssociates() {
		try {
			return (EList<Clabject>)GET_EIGEN_ASSOCIATES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInheritedAssociates() <em>Get Inherited Associates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedAssociates()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INHERITED_ASSOCIATES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_INHERITED_ASSOCIATES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getInheritedAssociates() {
		try {
			return (EList<Clabject>)GET_INHERITED_ASSOCIATES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllAssociates() <em>Get All Associates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAssociates()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_ASSOCIATES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_ALL_ASSOCIATES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getAllAssociates() {
		try {
			return (EList<Clabject>)GET_ALL_ASSOCIATES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getEigenAssociateRoleNames() <em>Get Eigen Associate Role Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEigenAssociateRoleNames()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_EIGEN_ASSOCIATE_ROLE_NAMES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_EIGEN_ASSOCIATE_ROLE_NAMES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getEigenAssociateRoleNames() {
		try {
			return (EList<String>)GET_EIGEN_ASSOCIATE_ROLE_NAMES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllAssociateRoleNames() <em>Get All Associate Role Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAssociateRoleNames()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_ASSOCIATE_ROLE_NAMES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_ALL_ASSOCIATE_ROLE_NAMES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getAllAssociateRoleNames() {
		try {
			return (EList<String>)GET_ALL_ASSOCIATE_ROLE_NAMES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInheritedAssociateRoleNames() <em>Get Inherited Associate Role Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedAssociateRoleNames()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INHERITED_ASSOCIATE_ROLE_NAMES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_INHERITED_ASSOCIATE_ROLE_NAMES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getInheritedAssociateRoleNames() {
		try {
			return (EList<String>)GET_INHERITED_ASSOCIATE_ROLE_NAMES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getEigenAssociatesForRoleName(java.lang.String) <em>Get Eigen Associates For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEigenAssociatesForRoleName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_EIGEN_ASSOCIATES_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_EIGEN_ASSOCIATES_FOR_ROLE_NAME__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getEigenAssociatesForRoleName(String roleName) {
		try {
			return (EList<Clabject>)GET_EIGEN_ASSOCIATES_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{roleName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getInheritedAssociatesForRoleName(java.lang.String) <em>Get Inherited Associates For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedAssociatesForRoleName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_INHERITED_ASSOCIATES_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_INHERITED_ASSOCIATES_FOR_ROLE_NAME__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getInheritedAssociatesForRoleName(String roleName) {
		try {
			return (EList<Clabject>)GET_INHERITED_ASSOCIATES_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{roleName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getAllAssociatesForRoleName(java.lang.String) <em>Get All Associates For Role Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAssociatesForRoleName(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALL_ASSOCIATES_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_ALL_ASSOCIATES_FOR_ROLE_NAME__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getAllAssociatesForRoleName(String roleName) {
		try {
			return (EList<Clabject>)GET_ALL_ASSOCIATES_FOR_ROLE_NAME_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{roleName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelCompleteTypes() <em>Get Model Complete Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelCompleteTypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_COMPLETE_TYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL_COMPLETE_TYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getModelCompleteTypes() {
		try {
			return (EList<Clabject>)GET_MODEL_COMPLETE_TYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelIncompleteTypes() <em>Get Model Incomplete Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIncompleteTypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_INCOMPLETE_TYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL_INCOMPLETE_TYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getModelIncompleteTypes() {
		try {
			return (EList<Clabject>)GET_MODEL_INCOMPLETE_TYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getBlueprint() <em>Get Blueprint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueprint()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_BLUEPRINT__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_BLUEPRINT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject getBlueprint() {
		try {
			return (Clabject)GET_BLUEPRINT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelOffspring() <em>Get Model Offspring</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelOffspring()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_OFFSPRING__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL_OFFSPRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getModelOffspring() {
		try {
			return (EList<Clabject>)GET_MODEL_OFFSPRING__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelIsonyms() <em>Get Model Isonyms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIsonyms()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_ISONYMS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL_ISONYMS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getModelIsonyms() {
		try {
			return (EList<Clabject>)GET_MODEL_ISONYMS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getModelHyponyms() <em>Get Model Hyponyms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelHyponyms()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_MODEL_HYPONYMS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_MODEL_HYPONYMS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getModelHyponyms() {
		try {
			return (EList<Clabject>)GET_MODEL_HYPONYMS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getDomainForConnection(de.uni_mannheim.informatik.swt.models.plm.PLM.Connection) <em>Get Domain For Connection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainForConnection(de.uni_mannheim.informatik.swt.models.plm.PLM.Connection)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_DOMAIN_FOR_CONNECTION_CONNECTION__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_DOMAIN_FOR_CONNECTION__CONNECTION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clabject> getDomainForConnection(Connection connection) {
		try {
			return (EList<Clabject>)GET_DOMAIN_FOR_CONNECTION_CONNECTION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{connection}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getPossibleDomainSpecificVisualizers() <em>Get Possible Domain Specific Visualizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleDomainSpecificVisualizers()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_POSSIBLE_DOMAIN_SPECIFIC_VISUALIZERS__EINVOCATION_DELEGATE = ((EOperation.Internal)PLMPackage.Literals.CLABJECT___GET_POSSIBLE_DOMAIN_SPECIFIC_VISUALIZERS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VisualizationDescriptor> getPossibleDomainSpecificVisualizers() {
		try {
			return (EList<VisualizationDescriptor>)GET_POSSIBLE_DOMAIN_SPECIFIC_VISUALIZERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case PLMPackage.CLABJECT__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case PLMPackage.CLABJECT__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
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
			case PLMPackage.CLABJECT__ORIGIN:
				return getOrigin();
			case PLMPackage.CLABJECT__VISUALIZERS_SHOWN:
				return getVisualizersShown();
			case PLMPackage.CLABJECT__INSTANTIABLE:
				return isInstantiable();
			case PLMPackage.CLABJECT__POTENCY:
				return getPotency();
			case PLMPackage.CLABJECT__LEVEL:
				return getLevel();
			case PLMPackage.CLABJECT__CONTENT:
				return getContent();
			case PLMPackage.CLABJECT__FEATURE:
				return getFeature();
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
			case PLMPackage.CLABJECT__ORIGIN:
				setOrigin((String)newValue);
				return;
			case PLMPackage.CLABJECT__VISUALIZERS_SHOWN:
				setVisualizersShown((String)newValue);
				return;
			case PLMPackage.CLABJECT__INSTANTIABLE:
				setInstantiable((Boolean)newValue);
				return;
			case PLMPackage.CLABJECT__POTENCY:
				setPotency((Integer)newValue);
				return;
			case PLMPackage.CLABJECT__LEVEL:
				setLevel((Integer)newValue);
				return;
			case PLMPackage.CLABJECT__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Clabject>)newValue);
				return;
			case PLMPackage.CLABJECT__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
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
			case PLMPackage.CLABJECT__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case PLMPackage.CLABJECT__VISUALIZERS_SHOWN:
				setVisualizersShown(VISUALIZERS_SHOWN_EDEFAULT);
				return;
			case PLMPackage.CLABJECT__INSTANTIABLE:
				setInstantiable(INSTANTIABLE_EDEFAULT);
				return;
			case PLMPackage.CLABJECT__POTENCY:
				setPotency(POTENCY_EDEFAULT);
				return;
			case PLMPackage.CLABJECT__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case PLMPackage.CLABJECT__CONTENT:
				getContent().clear();
				return;
			case PLMPackage.CLABJECT__FEATURE:
				getFeature().clear();
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
			case PLMPackage.CLABJECT__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case PLMPackage.CLABJECT__VISUALIZERS_SHOWN:
				return VISUALIZERS_SHOWN_EDEFAULT == null ? visualizersShown != null : !VISUALIZERS_SHOWN_EDEFAULT.equals(visualizersShown);
			case PLMPackage.CLABJECT__INSTANTIABLE:
				return instantiable != INSTANTIABLE_EDEFAULT;
			case PLMPackage.CLABJECT__POTENCY:
				return potency != POTENCY_EDEFAULT;
			case PLMPackage.CLABJECT__LEVEL:
				return level != LEVEL_EDEFAULT;
			case PLMPackage.CLABJECT__CONTENT:
				return content != null && !content.isEmpty();
			case PLMPackage.CLABJECT__FEATURE:
				return feature != null && !feature.isEmpty();
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
				case PLMPackage.CLABJECT__ORIGIN: return PLMPackage.VISUALIZATION_CONTAINER__ORIGIN;
				case PLMPackage.CLABJECT__VISUALIZERS_SHOWN: return PLMPackage.VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN;
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
				case PLMPackage.VISUALIZATION_CONTAINER__ORIGIN: return PLMPackage.CLABJECT__ORIGIN;
				case PLMPackage.VISUALIZATION_CONTAINER__VISUALIZERS_SHOWN: return PLMPackage.CLABJECT__VISUALIZERS_SHOWN;
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
			case PLMPackage.CLABJECT___ALL_INSTANCES_FROM__STRING:
				return allInstancesFrom((String)arguments.get(0));
			case PLMPackage.CLABJECT___GET_MODEL:
				return getModel();
			case PLMPackage.CLABJECT___GET_MODEL_SUPERTYPES:
				return getModelSupertypes();
			case PLMPackage.CLABJECT___GET_MODEL_SUBTYPES:
				return getModelSubtypes();
			case PLMPackage.CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_INSTANCE:
				return getModelClassificationsAsInstance();
			case PLMPackage.CLABJECT___GET_MODEL_CLASSIFICATIONS_AS_TYPE:
				return getModelClassificationsAsType();
			case PLMPackage.CLABJECT___GET_MODEL_INSTANCES:
				return getModelInstances();
			case PLMPackage.CLABJECT___GET_MODEL_TYPES:
				return getModelTypes();
			case PLMPackage.CLABJECT___GET_ALL_FEATURES:
				return getAllFeatures();
			case PLMPackage.CLABJECT___GET_ALL_ATTRIBUTES:
				return getAllAttributes();
			case PLMPackage.CLABJECT___GET_ALL_METHODS:
				return getAllMethods();
			case PLMPackage.CLABJECT___IS_MODEL_INSTANCE_OF__CLABJECT:
				return isModelInstanceOf((Clabject)arguments.get(0));
			case PLMPackage.CLABJECT___IS_MODEL_TYPE_OF__CLABJECT:
				return isModelTypeOf((Clabject)arguments.get(0));
			case PLMPackage.CLABJECT___GET_EIGEN_CONNECTIONS:
				return getEigenConnections();
			case PLMPackage.CLABJECT___GET_ALL_CONNECTIONS:
				return getAllConnections();
			case PLMPackage.CLABJECT___GET_INHERITED_CONNECTIONS:
				return getInheritedConnections();
			case PLMPackage.CLABJECT___GET_EIGEN_ASSOCIATES:
				return getEigenAssociates();
			case PLMPackage.CLABJECT___GET_INHERITED_ASSOCIATES:
				return getInheritedAssociates();
			case PLMPackage.CLABJECT___GET_ALL_ASSOCIATES:
				return getAllAssociates();
			case PLMPackage.CLABJECT___GET_EIGEN_ASSOCIATE_ROLE_NAMES:
				return getEigenAssociateRoleNames();
			case PLMPackage.CLABJECT___GET_ALL_ASSOCIATE_ROLE_NAMES:
				return getAllAssociateRoleNames();
			case PLMPackage.CLABJECT___GET_INHERITED_ASSOCIATE_ROLE_NAMES:
				return getInheritedAssociateRoleNames();
			case PLMPackage.CLABJECT___GET_EIGEN_ASSOCIATES_FOR_ROLE_NAME__STRING:
				return getEigenAssociatesForRoleName((String)arguments.get(0));
			case PLMPackage.CLABJECT___GET_INHERITED_ASSOCIATES_FOR_ROLE_NAME__STRING:
				return getInheritedAssociatesForRoleName((String)arguments.get(0));
			case PLMPackage.CLABJECT___GET_ALL_ASSOCIATES_FOR_ROLE_NAME__STRING:
				return getAllAssociatesForRoleName((String)arguments.get(0));
			case PLMPackage.CLABJECT___GET_MODEL_COMPLETE_TYPES:
				return getModelCompleteTypes();
			case PLMPackage.CLABJECT___GET_MODEL_INCOMPLETE_TYPES:
				return getModelIncompleteTypes();
			case PLMPackage.CLABJECT___GET_BLUEPRINT:
				return getBlueprint();
			case PLMPackage.CLABJECT___GET_MODEL_OFFSPRING:
				return getModelOffspring();
			case PLMPackage.CLABJECT___GET_MODEL_ISONYMS:
				return getModelIsonyms();
			case PLMPackage.CLABJECT___GET_MODEL_HYPONYMS:
				return getModelHyponyms();
			case PLMPackage.CLABJECT___GET_DOMAIN_FOR_CONNECTION__CONNECTION:
				return getDomainForConnection((Connection)arguments.get(0));
			case PLMPackage.CLABJECT___GET_POSSIBLE_DOMAIN_SPECIFIC_VISUALIZERS:
				return getPossibleDomainSpecificVisualizers();
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
		result.append(", instantiable: ");
		result.append(instantiable);
		result.append(", potency: ");
		result.append(potency);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //ClabjectImpl
