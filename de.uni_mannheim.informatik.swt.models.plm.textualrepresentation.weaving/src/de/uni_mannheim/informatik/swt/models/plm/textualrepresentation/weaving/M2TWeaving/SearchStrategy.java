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
package de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Search Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingPackage#getSearchStrategy()
 * @model
 * @generated
 */
public enum SearchStrategy implements Enumerator {
	/**
	 * The '<em><b>Attribute Preffered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_PREFFERED_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRIBUTE_PREFFERED(0, "AttributePreffered", "AttributePreffered"),

	/**
	 * The '<em><b>Entity Preffered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTITY_PREFFERED_VALUE
	 * @generated
	 * @ordered
	 */
	ENTITY_PREFFERED(1, "EntityPreffered", "EntityPreffered");

	/**
	 * The '<em><b>Attribute Preffered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Attribute Preffered</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_PREFFERED
	 * @model name="AttributePreffered"
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_PREFFERED_VALUE = 0;

	/**
	 * The '<em><b>Entity Preffered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entity Preffered</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTITY_PREFFERED
	 * @model name="EntityPreffered"
	 * @generated
	 * @ordered
	 */
	public static final int ENTITY_PREFFERED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Search Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SearchStrategy[] VALUES_ARRAY =
		new SearchStrategy[] {
			ATTRIBUTE_PREFFERED,
			ENTITY_PREFFERED,
		};

	/**
	 * A public read-only list of all the '<em><b>Search Strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SearchStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Search Strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SearchStrategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SearchStrategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Search Strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SearchStrategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SearchStrategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Search Strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SearchStrategy get(int value) {
		switch (value) {
			case ATTRIBUTE_PREFFERED_VALUE: return ATTRIBUTE_PREFFERED;
			case ENTITY_PREFFERED_VALUE: return ENTITY_PREFFERED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SearchStrategy(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SearchStrategy
