/*******************************************************************************
 * Copyright (c) 2012, 2013 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingPackage;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weaving Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.impl.WeavingModelImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeavingModelImpl extends EObjectImpl implements WeavingModel {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<WeavingLink> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeavingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2TWeavingPackage.Literals.WEAVING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WeavingLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<WeavingLink>(WeavingLink.class, this, M2TWeavingPackage.WEAVING_MODEL__LINKS);
		}
		return links;
	}

	/**
	 * The cached invocation delegate for the '{@link #findLinkForPLMElement(de.uni_mannheim.informatik.swt.models.plm.PLM.Element) <em>Find Link For PLM Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #findLinkForPLMElement(de.uni_mannheim.informatik.swt.models.plm.PLM.Element)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate FIND_LINK_FOR_PLM_ELEMENT_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)M2TWeavingPackage.Literals.WEAVING_MODEL___FIND_LINK_FOR_PLM_ELEMENT__ELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<WeavingLink> findLinkForPLMElement(Element element) {
		try {
			return (EList<WeavingLink>)FIND_LINK_FOR_PLM_ELEMENT_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{element}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #findTextElementForOffset(int) <em>Find Text Element For Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #findTextElementForOffset(int)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate FIND_TEXT_ELEMENT_FOR_OFFSET_INT__EINVOCATION_DELEGATE = ((EOperation.Internal)M2TWeavingPackage.Literals.WEAVING_MODEL___FIND_TEXT_ELEMENT_FOR_OFFSET__INT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TextElement> findTextElementForOffset(int offset) {
		try {
			return (EList<TextElement>)FIND_TEXT_ELEMENT_FOR_OFFSET_INT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{offset}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #findTextElementForOffset(int, de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy) <em>Find Text Element For Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #findTextElementForOffset(int, de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate FIND_TEXT_ELEMENT_FOR_OFFSET_INT_SEARCH_STRATEGY__EINVOCATION_DELEGATE = ((EOperation.Internal)M2TWeavingPackage.Literals.WEAVING_MODEL___FIND_TEXT_ELEMENT_FOR_OFFSET__INT_SEARCHSTRATEGY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TextElement> findTextElementForOffset(int offset, SearchStrategy strategy) {
		try {
			return (EList<TextElement>)FIND_TEXT_ELEMENT_FOR_OFFSET_INT_SEARCH_STRATEGY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{offset, strategy}));
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
			case M2TWeavingPackage.WEAVING_MODEL__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case M2TWeavingPackage.WEAVING_MODEL__LINKS:
				return getLinks();
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
			case M2TWeavingPackage.WEAVING_MODEL__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends WeavingLink>)newValue);
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
			case M2TWeavingPackage.WEAVING_MODEL__LINKS:
				getLinks().clear();
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
			case M2TWeavingPackage.WEAVING_MODEL__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case M2TWeavingPackage.WEAVING_MODEL___FIND_LINK_FOR_PLM_ELEMENT__ELEMENT:
				return findLinkForPLMElement((Element)arguments.get(0));
			case M2TWeavingPackage.WEAVING_MODEL___FIND_TEXT_ELEMENT_FOR_OFFSET__INT:
				return findTextElementForOffset((Integer)arguments.get(0));
			case M2TWeavingPackage.WEAVING_MODEL___FIND_TEXT_ELEMENT_FOR_OFFSET__INT_SEARCHSTRATEGY:
				return findTextElementForOffset((Integer)arguments.get(0), (SearchStrategy)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //WeavingModelImpl
