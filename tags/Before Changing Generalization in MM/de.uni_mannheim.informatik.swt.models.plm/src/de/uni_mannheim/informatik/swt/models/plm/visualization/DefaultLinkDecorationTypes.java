/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Default Link Decoration Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#getDefaultLinkDecorationTypes()
 * @model
 * @generated
 */
public enum DefaultLinkDecorationTypes implements Enumerator {
	/**
	 * The '<em><b>Poly Line Decoration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLY_LINE_DECORATION_VALUE
	 * @generated
	 * @ordered
	 */
	POLY_LINE_DECORATION(0, "PolyLineDecoration", "PolyLineDecoration"),

	/**
	 * The '<em><b>Polygone Line Decoration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYGONE_LINE_DECORATION_VALUE
	 * @generated
	 * @ordered
	 */
	POLYGONE_LINE_DECORATION(1, "PolygoneLineDecoration", "PolygoneLineDecoration"),

	/**
	 * The '<em><b>No Line Decoration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_LINE_DECORATION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_LINE_DECORATION(2, "NoLineDecoration", "NoLineDecoration");

	/**
	 * The '<em><b>Poly Line Decoration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poly Line Decoration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLY_LINE_DECORATION
	 * @model name="PolyLineDecoration"
	 * @generated
	 * @ordered
	 */
	public static final int POLY_LINE_DECORATION_VALUE = 0;

	/**
	 * The '<em><b>Polygone Line Decoration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Polygone Line Decoration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLYGONE_LINE_DECORATION
	 * @model name="PolygoneLineDecoration"
	 * @generated
	 * @ordered
	 */
	public static final int POLYGONE_LINE_DECORATION_VALUE = 1;

	/**
	 * The '<em><b>No Line Decoration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Line Decoration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_LINE_DECORATION
	 * @model name="NoLineDecoration"
	 * @generated
	 * @ordered
	 */
	public static final int NO_LINE_DECORATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Default Link Decoration Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DefaultLinkDecorationTypes[] VALUES_ARRAY =
		new DefaultLinkDecorationTypes[] {
			POLY_LINE_DECORATION,
			POLYGONE_LINE_DECORATION,
			NO_LINE_DECORATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Default Link Decoration Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DefaultLinkDecorationTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Default Link Decoration Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefaultLinkDecorationTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefaultLinkDecorationTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Default Link Decoration Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefaultLinkDecorationTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DefaultLinkDecorationTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Default Link Decoration Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefaultLinkDecorationTypes get(int value) {
		switch (value) {
			case POLY_LINE_DECORATION_VALUE: return POLY_LINE_DECORATION;
			case POLYGONE_LINE_DECORATION_VALUE: return POLYGONE_LINE_DECORATION;
			case NO_LINE_DECORATION_VALUE: return NO_LINE_DECORATION;
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
	private DefaultLinkDecorationTypes(int value, String name, String literal) {
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
	
} //DefaultLinkDecorationTypes
