/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationFactory
 * @model kind="package"
 * @generated
 */
public interface VisualizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "visualization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://swt.informatik.uni-mannheim.de/visualization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "visualization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualizationPackage eINSTANCE = de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationDescriptorImpl <em>Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationDescriptorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getVisualizationDescriptor()
	 * @generated
	 */
	int VISUALIZATION_DESCRIPTOR = 0;

	/**
	 * The number of structural features of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutDescriptorImpl <em>Layout Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutDescriptorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLayoutDescriptor()
	 * @generated
	 */
	int LAYOUT_DESCRIPTOR = 1;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DESCRIPTOR__MARGIN = VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DESCRIPTOR__PADDING = VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DESCRIPTOR__CONTENT = VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Layout Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DESCRIPTOR_FEATURE_COUNT = VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Layout Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_DESCRIPTOR_OPERATION_COUNT = VISUALIZATION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FlowLayoutImpl <em>Flow Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FlowLayoutImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getFlowLayout()
	 * @generated
	 */
	int FLOW_LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__MARGIN = LAYOUT_DESCRIPTOR__MARGIN;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__PADDING = LAYOUT_DESCRIPTOR__PADDING;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__CONTENT = LAYOUT_DESCRIPTOR__CONTENT;

	/**
	 * The feature id for the '<em><b>Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__VERTICAL = LAYOUT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Single Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT__SINGLE_LINE = LAYOUT_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT_FEATURE_COUNT = LAYOUT_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flow Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LAYOUT_OPERATION_COUNT = LAYOUT_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.AbsoluteLayoutImpl <em>Absolute Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.AbsoluteLayoutImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getAbsoluteLayout()
	 * @generated
	 */
	int ABSOLUTE_LAYOUT = 3;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT__MARGIN = LAYOUT_DESCRIPTOR__MARGIN;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT__PADDING = LAYOUT_DESCRIPTOR__PADDING;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT__CONTENT = LAYOUT_DESCRIPTOR__CONTENT;

	/**
	 * The number of structural features of the '<em>Absolute Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT_FEATURE_COUNT = LAYOUT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Absolute Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT_OPERATION_COUNT = LAYOUT_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutImpl <em>Table Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getTableLayout()
	 * @generated
	 */
	int TABLE_LAYOUT = 4;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT__MARGIN = LAYOUT_DESCRIPTOR__MARGIN;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT__PADDING = LAYOUT_DESCRIPTOR__PADDING;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT__CONTENT = LAYOUT_DESCRIPTOR__CONTENT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT__COLUMNS = LAYOUT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT_FEATURE_COUNT = LAYOUT_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT_OPERATION_COUNT = LAYOUT_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutContentDescriptorImpl <em>Layout Content Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutContentDescriptorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLayoutContentDescriptor()
	 * @generated
	 */
	int LAYOUT_CONTENT_DESCRIPTOR = 5;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION = VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_CONTENT_DESCRIPTOR__BACKGROUND_COLOR = VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_CONTENT_DESCRIPTOR__FOREGROUND_COLOR = VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Layout Content Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_CONTENT_DESCRIPTOR_FEATURE_COUNT = VISUALIZATION_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Layout Content Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_CONTENT_DESCRIPTOR_OPERATION_COUNT = VISUALIZATION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ShapeDescriptorImpl <em>Shape Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ShapeDescriptorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getShapeDescriptor()
	 * @generated
	 */
	int SHAPE_DESCRIPTOR = 6;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DESCRIPTOR__LAYOUT_INFORMATION = LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DESCRIPTOR__BACKGROUND_COLOR = LAYOUT_CONTENT_DESCRIPTOR__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DESCRIPTOR__FOREGROUND_COLOR = LAYOUT_CONTENT_DESCRIPTOR__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DESCRIPTOR__LAYOUT = LAYOUT_CONTENT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DESCRIPTOR__OUTLINE = LAYOUT_CONTENT_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DESCRIPTOR__FILL = LAYOUT_CONTENT_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DESCRIPTOR__OUTLINE_WIDTH = LAYOUT_CONTENT_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shape Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DESCRIPTOR_FEATURE_COUNT = LAYOUT_CONTENT_DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Shape Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_DESCRIPTOR_OPERATION_COUNT = LAYOUT_CONTENT_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.CircleImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 7;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LAYOUT_INFORMATION = SHAPE_DESCRIPTOR__LAYOUT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__BACKGROUND_COLOR = SHAPE_DESCRIPTOR__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FOREGROUND_COLOR = SHAPE_DESCRIPTOR__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LAYOUT = SHAPE_DESCRIPTOR__LAYOUT;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__OUTLINE = SHAPE_DESCRIPTOR__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FILL = SHAPE_DESCRIPTOR__FILL;

	/**
	 * The feature id for the '<em><b>Outline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__OUTLINE_WIDTH = SHAPE_DESCRIPTOR__OUTLINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = SHAPE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = SHAPE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = SHAPE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.RectangleImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 8;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LAYOUT_INFORMATION = SHAPE_DESCRIPTOR__LAYOUT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BACKGROUND_COLOR = SHAPE_DESCRIPTOR__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FOREGROUND_COLOR = SHAPE_DESCRIPTOR__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LAYOUT = SHAPE_DESCRIPTOR__LAYOUT;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__OUTLINE = SHAPE_DESCRIPTOR__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__FILL = SHAPE_DESCRIPTOR__FILL;

	/**
	 * The feature id for the '<em><b>Outline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__OUTLINE_WIDTH = SHAPE_DESCRIPTOR__OUTLINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__HEIGHT = SHAPE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__WIDTH = SHAPE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = SHAPE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.RoundedRectangleImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getRoundedRectangle()
	 * @generated
	 */
	int ROUNDED_RECTANGLE = 9;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LAYOUT_INFORMATION = RECTANGLE__LAYOUT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__BACKGROUND_COLOR = RECTANGLE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FOREGROUND_COLOR = RECTANGLE__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__LAYOUT = RECTANGLE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__OUTLINE = RECTANGLE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__FILL = RECTANGLE__FILL;

	/**
	 * The feature id for the '<em><b>Outline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__OUTLINE_WIDTH = RECTANGLE__OUTLINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__HEIGHT = RECTANGLE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__WIDTH = RECTANGLE__WIDTH;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE__RADIUS = RECTANGLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rounded Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_FEATURE_COUNT = RECTANGLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rounded Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_RECTANGLE_OPERATION_COUNT = RECTANGLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.SVGFigureImpl <em>SVG Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.SVGFigureImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getSVGFigure()
	 * @generated
	 */
	int SVG_FIGURE = 10;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__LAYOUT_INFORMATION = SHAPE_DESCRIPTOR__LAYOUT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__BACKGROUND_COLOR = SHAPE_DESCRIPTOR__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__FOREGROUND_COLOR = SHAPE_DESCRIPTOR__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__LAYOUT = SHAPE_DESCRIPTOR__LAYOUT;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__OUTLINE = SHAPE_DESCRIPTOR__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__FILL = SHAPE_DESCRIPTOR__FILL;

	/**
	 * The feature id for the '<em><b>Outline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__OUTLINE_WIDTH = SHAPE_DESCRIPTOR__OUTLINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__DOCUMENT_URI = SHAPE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__WIDTH = SHAPE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE__HEIGHT = SHAPE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SVG Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE_FEATURE_COUNT = SHAPE_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SVG Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVG_FIGURE_OPERATION_COUNT = SHAPE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 11;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LAYOUT_INFORMATION = SHAPE_DESCRIPTOR__LAYOUT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__BACKGROUND_COLOR = SHAPE_DESCRIPTOR__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__FOREGROUND_COLOR = SHAPE_DESCRIPTOR__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LAYOUT = SHAPE_DESCRIPTOR__LAYOUT;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__OUTLINE = SHAPE_DESCRIPTOR__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__FILL = SHAPE_DESCRIPTOR__FILL;

	/**
	 * The feature id for the '<em><b>Outline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__OUTLINE_WIDTH = SHAPE_DESCRIPTOR__OUTLINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Decoration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DECORATION = SHAPE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LABEL = SHAPE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = SHAPE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = SHAPE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FreehandShapeImpl <em>Freehand Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FreehandShapeImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getFreehandShape()
	 * @generated
	 */
	int FREEHAND_SHAPE = 12;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE__LAYOUT_INFORMATION = SHAPE_DESCRIPTOR__LAYOUT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE__BACKGROUND_COLOR = SHAPE_DESCRIPTOR__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE__FOREGROUND_COLOR = SHAPE_DESCRIPTOR__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE__LAYOUT = SHAPE_DESCRIPTOR__LAYOUT;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE__OUTLINE = SHAPE_DESCRIPTOR__OUTLINE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE__FILL = SHAPE_DESCRIPTOR__FILL;

	/**
	 * The feature id for the '<em><b>Outline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE__OUTLINE_WIDTH = SHAPE_DESCRIPTOR__OUTLINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE__POINTS = SHAPE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE__WIDTH = SHAPE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE__HEIGHT = SHAPE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Freehand Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE_FEATURE_COUNT = SHAPE_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Freehand Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREEHAND_SHAPE_OPERATION_COUNT = SHAPE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.PointImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 13;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.InformationDisplayDescriptorImpl <em>Information Display Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.InformationDisplayDescriptorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getInformationDisplayDescriptor()
	 * @generated
	 */
	int INFORMATION_DISPLAY_DESCRIPTOR = 14;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_DISPLAY_DESCRIPTOR__LAYOUT_INFORMATION = LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_DISPLAY_DESCRIPTOR__BACKGROUND_COLOR = LAYOUT_CONTENT_DESCRIPTOR__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_DISPLAY_DESCRIPTOR__FOREGROUND_COLOR = LAYOUT_CONTENT_DESCRIPTOR__FOREGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Information Display Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_DISPLAY_DESCRIPTOR_FEATURE_COUNT = LAYOUT_CONTENT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Information Display Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_DISPLAY_DESCRIPTOR_OPERATION_COUNT = LAYOUT_CONTENT_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LabelDescriptorImpl <em>Label Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LabelDescriptorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLabelDescriptor()
	 * @generated
	 */
	int LABEL_DESCRIPTOR = 15;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DESCRIPTOR__LAYOUT_INFORMATION = INFORMATION_DISPLAY_DESCRIPTOR__LAYOUT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DESCRIPTOR__BACKGROUND_COLOR = INFORMATION_DISPLAY_DESCRIPTOR__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DESCRIPTOR__FOREGROUND_COLOR = INFORMATION_DISPLAY_DESCRIPTOR__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DESCRIPTOR__FONT = INFORMATION_DISPLAY_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DESCRIPTOR_FEATURE_COUNT = INFORMATION_DISPLAY_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_DESCRIPTOR_OPERATION_COUNT = INFORMATION_DISPLAY_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.MappingLabelImpl <em>Mapping Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.MappingLabelImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getMappingLabel()
	 * @generated
	 */
	int MAPPING_LABEL = 16;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_LABEL__LAYOUT_INFORMATION = LABEL_DESCRIPTOR__LAYOUT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_LABEL__BACKGROUND_COLOR = LABEL_DESCRIPTOR__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_LABEL__FOREGROUND_COLOR = LABEL_DESCRIPTOR__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_LABEL__FONT = LABEL_DESCRIPTOR__FONT;

	/**
	 * The number of structural features of the '<em>Mapping Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_LABEL_FEATURE_COUNT = LABEL_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mapping Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_LABEL_OPERATION_COUNT = LABEL_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ExpressionLabelImpl <em>Expression Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ExpressionLabelImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getExpressionLabel()
	 * @generated
	 */
	int EXPRESSION_LABEL = 17;

	/**
	 * The feature id for the '<em><b>Layout Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LABEL__LAYOUT_INFORMATION = LABEL_DESCRIPTOR__LAYOUT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LABEL__BACKGROUND_COLOR = LABEL_DESCRIPTOR__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LABEL__FOREGROUND_COLOR = LABEL_DESCRIPTOR__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LABEL__FONT = LABEL_DESCRIPTOR__FONT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LABEL__EXPRESSION = LABEL_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LABEL_FEATURE_COUNT = LABEL_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LABEL_OPERATION_COUNT = LABEL_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FontDescriptorImpl <em>Font Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FontDescriptorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getFontDescriptor()
	 * @generated
	 */
	int FONT_DESCRIPTOR = 18;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_DESCRIPTOR__FONT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_DESCRIPTOR__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_DESCRIPTOR__FONT_STYLE = 2;

	/**
	 * The number of structural features of the '<em>Font Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_DESCRIPTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Font Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.SpacingDescriptorImpl <em>Spacing Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.SpacingDescriptorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getSpacingDescriptor()
	 * @generated
	 */
	int SPACING_DESCRIPTOR = 19;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING_DESCRIPTOR__TOP = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING_DESCRIPTOR__RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING_DESCRIPTOR__BOTTOM = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING_DESCRIPTOR__LEFT = 3;

	/**
	 * The number of structural features of the '<em>Spacing Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING_DESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Spacing Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutInformationDescriptorImpl <em>Layout Information Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutInformationDescriptorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLayoutInformationDescriptor()
	 * @generated
	 */
	int LAYOUT_INFORMATION_DESCRIPTOR = 20;

	/**
	 * The number of structural features of the '<em>Layout Information Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Layout Information Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_INFORMATION_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.AbsoluteLayoutInformationImpl <em>Absolute Layout Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.AbsoluteLayoutInformationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getAbsoluteLayoutInformation()
	 * @generated
	 */
	int ABSOLUTE_LAYOUT_INFORMATION = 21;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT_INFORMATION__POSITION = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Absolute Layout Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT_INFORMATION_FEATURE_COUNT = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Absolute Layout Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_LAYOUT_INFORMATION_OPERATION_COUNT = LAYOUT_INFORMATION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutInformationImpl <em>Table Layout Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutInformationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getTableLayoutInformation()
	 * @generated
	 */
	int TABLE_LAYOUT_INFORMATION = 22;

	/**
	 * The feature id for the '<em><b>Row Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT_INFORMATION__ROW_SPAN = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT_INFORMATION__COLUMN_SPAN = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Grab Horizontal Excess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT_INFORMATION__GRAB_HORIZONTAL_EXCESS = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Grab Vertical Excess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT_INFORMATION__GRAB_VERTICAL_EXCESS = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT_INFORMATION__HORIZONTAL_ALIGNMENT = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT_INFORMATION__VERTICAL_ALIGNMENT = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Table Layout Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT_INFORMATION_FEATURE_COUNT = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Table Layout Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_LAYOUT_INFORMATION_OPERATION_COUNT = LAYOUT_INFORMATION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.BorderLayoutInformationDescriptorImpl <em>Border Layout Information Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.BorderLayoutInformationDescriptorImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getBorderLayoutInformationDescriptor()
	 * @generated
	 */
	int BORDER_LAYOUT_INFORMATION_DESCRIPTOR = 23;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_ALIGNMENT = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_ALIGNMENT = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vertical Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_OFFSET = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Horizontal Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_OFFSET = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Border Layout Information Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT = LAYOUT_INFORMATION_DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Border Layout Information Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_LAYOUT_INFORMATION_DESCRIPTOR_OPERATION_COUNT = LAYOUT_INFORMATION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkDecorationImpl <em>Link Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkDecorationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLinkDecoration()
	 * @generated
	 */
	int LINK_DECORATION = 24;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DECORATION__FILL = 0;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DECORATION__OUTLINE = 1;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DECORATION__FOREGROUND_COLOR = 2;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DECORATION__BACKGROUND_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Outline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DECORATION__OUTLINE_WIDTH = 4;

	/**
	 * The number of structural features of the '<em>Link Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DECORATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Link Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DECORATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.DefaultLinkDecorationImpl <em>Default Link Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.DefaultLinkDecorationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getDefaultLinkDecoration()
	 * @generated
	 */
	int DEFAULT_LINK_DECORATION = 25;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LINK_DECORATION__FILL = LINK_DECORATION__FILL;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LINK_DECORATION__OUTLINE = LINK_DECORATION__OUTLINE;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LINK_DECORATION__FOREGROUND_COLOR = LINK_DECORATION__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LINK_DECORATION__BACKGROUND_COLOR = LINK_DECORATION__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Outline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LINK_DECORATION__OUTLINE_WIDTH = LINK_DECORATION__OUTLINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LINK_DECORATION__DECORATION_TYPE = LINK_DECORATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Link Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LINK_DECORATION_FEATURE_COUNT = LINK_DECORATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Default Link Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_LINK_DECORATION_OPERATION_COUNT = LINK_DECORATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.CustomLinkDecorationImpl <em>Custom Link Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.CustomLinkDecorationImpl
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getCustomLinkDecoration()
	 * @generated
	 */
	int CUSTOM_LINK_DECORATION = 26;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK_DECORATION__FILL = LINK_DECORATION__FILL;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK_DECORATION__OUTLINE = LINK_DECORATION__OUTLINE;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK_DECORATION__FOREGROUND_COLOR = LINK_DECORATION__FOREGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK_DECORATION__BACKGROUND_COLOR = LINK_DECORATION__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Outline Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK_DECORATION__OUTLINE_WIDTH = LINK_DECORATION__OUTLINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK_DECORATION__POINTS = LINK_DECORATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Link Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK_DECORATION_FEATURE_COUNT = LINK_DECORATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Link Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LINK_DECORATION_OPERATION_COUNT = LINK_DECORATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecorationTypes <em>Default Link Decoration Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecorationTypes
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getDefaultLinkDecorationTypes()
	 * @generated
	 */
	int DEFAULT_LINK_DECORATION_TYPES = 27;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment <em>Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getAlignment()
	 * @generated
	 */
	int ALIGNMENT = 28;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant <em>Color Constant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getColorConstant()
	 * @generated
	 */
	int COLOR_CONSTANT = 29;

	/**
	 * The meta object id for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle <em>Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 30;


	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationDescriptor
	 * @generated
	 */
	EClass getVisualizationDescriptor();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor <em>Layout Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Descriptor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor
	 * @generated
	 */
	EClass getLayoutDescriptor();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Margin</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor#getMargin()
	 * @see #getLayoutDescriptor()
	 * @generated
	 */
	EReference getLayoutDescriptor_Margin();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Padding</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor#getPadding()
	 * @see #getLayoutDescriptor()
	 * @generated
	 */
	EReference getLayoutDescriptor_Padding();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor#getContent()
	 * @see #getLayoutDescriptor()
	 * @generated
	 */
	EReference getLayoutDescriptor_Content();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout <em>Flow Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Layout</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout
	 * @generated
	 */
	EClass getFlowLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout#isVertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout#isVertical()
	 * @see #getFlowLayout()
	 * @generated
	 */
	EAttribute getFlowLayout_Vertical();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout#isSingleLine <em>Single Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Line</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout#isSingleLine()
	 * @see #getFlowLayout()
	 * @generated
	 */
	EAttribute getFlowLayout_SingleLine();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.AbsoluteLayout <em>Absolute Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Layout</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.AbsoluteLayout
	 * @generated
	 */
	EClass getAbsoluteLayout();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayout <em>Table Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Layout</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayout
	 * @generated
	 */
	EClass getTableLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayout#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayout#getColumns()
	 * @see #getTableLayout()
	 * @generated
	 */
	EAttribute getTableLayout_Columns();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor <em>Layout Content Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Content Descriptor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor
	 * @generated
	 */
	EClass getLayoutContentDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getLayoutInformation <em>Layout Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Information</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getLayoutInformation()
	 * @see #getLayoutContentDescriptor()
	 * @generated
	 */
	EReference getLayoutContentDescriptor_LayoutInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getBackgroundColor()
	 * @see #getLayoutContentDescriptor()
	 * @generated
	 */
	EAttribute getLayoutContentDescriptor_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getForegroundColor <em>Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor#getForegroundColor()
	 * @see #getLayoutContentDescriptor()
	 * @generated
	 */
	EAttribute getLayoutContentDescriptor_ForegroundColor();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor <em>Shape Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Descriptor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor
	 * @generated
	 */
	EClass getShapeDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#getLayout()
	 * @see #getShapeDescriptor()
	 * @generated
	 */
	EReference getShapeDescriptor_Layout();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#isOutline()
	 * @see #getShapeDescriptor()
	 * @generated
	 */
	EAttribute getShapeDescriptor_Outline();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#isFill()
	 * @see #getShapeDescriptor()
	 * @generated
	 */
	EAttribute getShapeDescriptor_Fill();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#getOutlineWidth <em>Outline Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline Width</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor#getOutlineWidth()
	 * @see #getShapeDescriptor()
	 * @generated
	 */
	EAttribute getShapeDescriptor_OutlineWidth();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle#getHeight()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Height();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle#getWidth()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Width();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.RoundedRectangle <em>Rounded Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rounded Rectangle</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.RoundedRectangle
	 * @generated
	 */
	EClass getRoundedRectangle();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.RoundedRectangle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.RoundedRectangle#getRadius()
	 * @see #getRoundedRectangle()
	 * @generated
	 */
	EAttribute getRoundedRectangle_Radius();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure <em>SVG Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SVG Figure</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure
	 * @generated
	 */
	EClass getSVGFigure();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getDocumentURI <em>Document URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document URI</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getDocumentURI()
	 * @see #getSVGFigure()
	 * @generated
	 */
	EAttribute getSVGFigure_DocumentURI();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getWidth()
	 * @see #getSVGFigure()
	 * @generated
	 */
	EAttribute getSVGFigure_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure#getHeight()
	 * @see #getSVGFigure()
	 * @generated
	 */
	EAttribute getSVGFigure_Height();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Link#getDecoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decoration</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Link#getDecoration()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Decoration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Link#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Link#getLabel()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Label();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape <em>Freehand Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Freehand Shape</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape
	 * @generated
	 */
	EClass getFreehandShape();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape#getPoints()
	 * @see #getFreehandShape()
	 * @generated
	 */
	EReference getFreehandShape_Points();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape#getWidth()
	 * @see #getFreehandShape()
	 * @generated
	 */
	EAttribute getFreehandShape_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape#getHeight()
	 * @see #getFreehandShape()
	 * @generated
	 */
	EAttribute getFreehandShape_Height();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.InformationDisplayDescriptor <em>Information Display Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Display Descriptor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.InformationDisplayDescriptor
	 * @generated
	 */
	EClass getInformationDisplayDescriptor();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LabelDescriptor <em>Label Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Descriptor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LabelDescriptor
	 * @generated
	 */
	EClass getLabelDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LabelDescriptor#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LabelDescriptor#getFont()
	 * @see #getLabelDescriptor()
	 * @generated
	 */
	EReference getLabelDescriptor_Font();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.MappingLabel <em>Mapping Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Label</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.MappingLabel
	 * @generated
	 */
	EClass getMappingLabel();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ExpressionLabel <em>Expression Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Label</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ExpressionLabel
	 * @generated
	 */
	EClass getExpressionLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ExpressionLabel#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ExpressionLabel#getExpression()
	 * @see #getExpressionLabel()
	 * @generated
	 */
	EAttribute getExpressionLabel_Expression();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor <em>Font Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Descriptor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor
	 * @generated
	 */
	EClass getFontDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getFontName()
	 * @see #getFontDescriptor()
	 * @generated
	 */
	EAttribute getFontDescriptor_FontName();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getSize()
	 * @see #getFontDescriptor()
	 * @generated
	 */
	EAttribute getFontDescriptor_Size();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor#getFontStyle()
	 * @see #getFontDescriptor()
	 * @generated
	 */
	EAttribute getFontDescriptor_FontStyle();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor <em>Spacing Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacing Descriptor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor
	 * @generated
	 */
	EClass getSpacingDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor#getTop()
	 * @see #getSpacingDescriptor()
	 * @generated
	 */
	EAttribute getSpacingDescriptor_Top();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor#getRight()
	 * @see #getSpacingDescriptor()
	 * @generated
	 */
	EAttribute getSpacingDescriptor_Right();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor#getBottom()
	 * @see #getSpacingDescriptor()
	 * @generated
	 */
	EAttribute getSpacingDescriptor_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor#getLeft()
	 * @see #getSpacingDescriptor()
	 * @generated
	 */
	EAttribute getSpacingDescriptor_Left();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutInformationDescriptor <em>Layout Information Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Information Descriptor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutInformationDescriptor
	 * @generated
	 */
	EClass getLayoutInformationDescriptor();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.AbsoluteLayoutInformation <em>Absolute Layout Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute Layout Information</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.AbsoluteLayoutInformation
	 * @generated
	 */
	EClass getAbsoluteLayoutInformation();

	/**
	 * Returns the meta object for the reference '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.AbsoluteLayoutInformation#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.AbsoluteLayoutInformation#getPosition()
	 * @see #getAbsoluteLayoutInformation()
	 * @generated
	 */
	EReference getAbsoluteLayoutInformation_Position();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation <em>Table Layout Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Layout Information</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation
	 * @generated
	 */
	EClass getTableLayoutInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getRowSpan <em>Row Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Span</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getRowSpan()
	 * @see #getTableLayoutInformation()
	 * @generated
	 */
	EAttribute getTableLayoutInformation_RowSpan();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getColumnSpan <em>Column Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Span</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getColumnSpan()
	 * @see #getTableLayoutInformation()
	 * @generated
	 */
	EAttribute getTableLayoutInformation_ColumnSpan();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#isGrabHorizontalExcess <em>Grab Horizontal Excess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Horizontal Excess</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#isGrabHorizontalExcess()
	 * @see #getTableLayoutInformation()
	 * @generated
	 */
	EAttribute getTableLayoutInformation_GrabHorizontalExcess();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#isGrabVerticalExcess <em>Grab Vertical Excess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Vertical Excess</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#isGrabVerticalExcess()
	 * @see #getTableLayoutInformation()
	 * @generated
	 */
	EAttribute getTableLayoutInformation_GrabVerticalExcess();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getHorizontalAlignment()
	 * @see #getTableLayoutInformation()
	 * @generated
	 */
	EAttribute getTableLayoutInformation_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation#getVerticalAlignment()
	 * @see #getTableLayoutInformation()
	 * @generated
	 */
	EAttribute getTableLayoutInformation_VerticalAlignment();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor <em>Border Layout Information Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Layout Information Descriptor</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor
	 * @generated
	 */
	EClass getBorderLayoutInformationDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getVerticalAlignment()
	 * @see #getBorderLayoutInformationDescriptor()
	 * @generated
	 */
	EAttribute getBorderLayoutInformationDescriptor_VerticalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getHorizontalAlignment()
	 * @see #getBorderLayoutInformationDescriptor()
	 * @generated
	 */
	EAttribute getBorderLayoutInformationDescriptor_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getVerticalOffset <em>Vertical Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Offset</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getVerticalOffset()
	 * @see #getBorderLayoutInformationDescriptor()
	 * @generated
	 */
	EAttribute getBorderLayoutInformationDescriptor_VerticalOffset();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getHorizontalOffset <em>Horizontal Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Offset</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor#getHorizontalOffset()
	 * @see #getBorderLayoutInformationDescriptor()
	 * @generated
	 */
	EAttribute getBorderLayoutInformationDescriptor_HorizontalOffset();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration <em>Link Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Decoration</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration
	 * @generated
	 */
	EClass getLinkDecoration();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#isFill()
	 * @see #getLinkDecoration()
	 * @generated
	 */
	EAttribute getLinkDecoration_Fill();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#isOutline()
	 * @see #getLinkDecoration()
	 * @generated
	 */
	EAttribute getLinkDecoration_Outline();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getForegroundColor <em>Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getForegroundColor()
	 * @see #getLinkDecoration()
	 * @generated
	 */
	EAttribute getLinkDecoration_ForegroundColor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getBackgroundColor()
	 * @see #getLinkDecoration()
	 * @generated
	 */
	EAttribute getLinkDecoration_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getOutlineWidth <em>Outline Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline Width</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration#getOutlineWidth()
	 * @see #getLinkDecoration()
	 * @generated
	 */
	EAttribute getLinkDecoration_OutlineWidth();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecoration <em>Default Link Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Link Decoration</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecoration
	 * @generated
	 */
	EClass getDefaultLinkDecoration();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecoration#getDecorationType <em>Decoration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration Type</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecoration#getDecorationType()
	 * @see #getDefaultLinkDecoration()
	 * @generated
	 */
	EAttribute getDefaultLinkDecoration_DecorationType();

	/**
	 * Returns the meta object for class '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.CustomLinkDecoration <em>Custom Link Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Link Decoration</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.CustomLinkDecoration
	 * @generated
	 */
	EClass getCustomLinkDecoration();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.CustomLinkDecoration#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Points</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.CustomLinkDecoration#getPoints()
	 * @see #getCustomLinkDecoration()
	 * @generated
	 */
	EReference getCustomLinkDecoration_Points();

	/**
	 * Returns the meta object for enum '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecorationTypes <em>Default Link Decoration Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Link Decoration Types</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecorationTypes
	 * @generated
	 */
	EEnum getDefaultLinkDecorationTypes();

	/**
	 * Returns the meta object for enum '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment
	 * @generated
	 */
	EEnum getAlignment();

	/**
	 * Returns the meta object for enum '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant <em>Color Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Constant</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant
	 * @generated
	 */
	EEnum getColorConstant();

	/**
	 * Returns the meta object for enum '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Style</em>'.
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle
	 * @generated
	 */
	EEnum getFontStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisualizationFactory getVisualizationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationDescriptorImpl <em>Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationDescriptorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getVisualizationDescriptor()
		 * @generated
		 */
		EClass VISUALIZATION_DESCRIPTOR = eINSTANCE.getVisualizationDescriptor();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutDescriptorImpl <em>Layout Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutDescriptorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLayoutDescriptor()
		 * @generated
		 */
		EClass LAYOUT_DESCRIPTOR = eINSTANCE.getLayoutDescriptor();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_DESCRIPTOR__MARGIN = eINSTANCE.getLayoutDescriptor_Margin();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_DESCRIPTOR__PADDING = eINSTANCE.getLayoutDescriptor_Padding();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_DESCRIPTOR__CONTENT = eINSTANCE.getLayoutDescriptor_Content();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FlowLayoutImpl <em>Flow Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FlowLayoutImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getFlowLayout()
		 * @generated
		 */
		EClass FLOW_LAYOUT = eINSTANCE.getFlowLayout();

		/**
		 * The meta object literal for the '<em><b>Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LAYOUT__VERTICAL = eINSTANCE.getFlowLayout_Vertical();

		/**
		 * The meta object literal for the '<em><b>Single Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LAYOUT__SINGLE_LINE = eINSTANCE.getFlowLayout_SingleLine();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.AbsoluteLayoutImpl <em>Absolute Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.AbsoluteLayoutImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getAbsoluteLayout()
		 * @generated
		 */
		EClass ABSOLUTE_LAYOUT = eINSTANCE.getAbsoluteLayout();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutImpl <em>Table Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getTableLayout()
		 * @generated
		 */
		EClass TABLE_LAYOUT = eINSTANCE.getTableLayout();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_LAYOUT__COLUMNS = eINSTANCE.getTableLayout_Columns();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutContentDescriptorImpl <em>Layout Content Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutContentDescriptorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLayoutContentDescriptor()
		 * @generated
		 */
		EClass LAYOUT_CONTENT_DESCRIPTOR = eINSTANCE.getLayoutContentDescriptor();

		/**
		 * The meta object literal for the '<em><b>Layout Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION = eINSTANCE.getLayoutContentDescriptor_LayoutInformation();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_CONTENT_DESCRIPTOR__BACKGROUND_COLOR = eINSTANCE.getLayoutContentDescriptor_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Foreground Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT_CONTENT_DESCRIPTOR__FOREGROUND_COLOR = eINSTANCE.getLayoutContentDescriptor_ForegroundColor();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ShapeDescriptorImpl <em>Shape Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ShapeDescriptorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getShapeDescriptor()
		 * @generated
		 */
		EClass SHAPE_DESCRIPTOR = eINSTANCE.getShapeDescriptor();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE_DESCRIPTOR__LAYOUT = eINSTANCE.getShapeDescriptor_Layout();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_DESCRIPTOR__OUTLINE = eINSTANCE.getShapeDescriptor_Outline();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_DESCRIPTOR__FILL = eINSTANCE.getShapeDescriptor_Fill();

		/**
		 * The meta object literal for the '<em><b>Outline Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_DESCRIPTOR__OUTLINE_WIDTH = eINSTANCE.getShapeDescriptor_OutlineWidth();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.CircleImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.RectangleImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__HEIGHT = eINSTANCE.getRectangle_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__WIDTH = eINSTANCE.getRectangle_Width();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.RoundedRectangleImpl <em>Rounded Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.RoundedRectangleImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getRoundedRectangle()
		 * @generated
		 */
		EClass ROUNDED_RECTANGLE = eINSTANCE.getRoundedRectangle();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUNDED_RECTANGLE__RADIUS = eINSTANCE.getRoundedRectangle_Radius();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.SVGFigureImpl <em>SVG Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.SVGFigureImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getSVGFigure()
		 * @generated
		 */
		EClass SVG_FIGURE = eINSTANCE.getSVGFigure();

		/**
		 * The meta object literal for the '<em><b>Document URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVG_FIGURE__DOCUMENT_URI = eINSTANCE.getSVGFigure_DocumentURI();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVG_FIGURE__WIDTH = eINSTANCE.getSVGFigure_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVG_FIGURE__HEIGHT = eINSTANCE.getSVGFigure_Height();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Decoration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__DECORATION = eINSTANCE.getLink_Decoration();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LABEL = eINSTANCE.getLink_Label();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FreehandShapeImpl <em>Freehand Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FreehandShapeImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getFreehandShape()
		 * @generated
		 */
		EClass FREEHAND_SHAPE = eINSTANCE.getFreehandShape();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREEHAND_SHAPE__POINTS = eINSTANCE.getFreehandShape_Points();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREEHAND_SHAPE__WIDTH = eINSTANCE.getFreehandShape_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREEHAND_SHAPE__HEIGHT = eINSTANCE.getFreehandShape_Height();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.PointImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.InformationDisplayDescriptorImpl <em>Information Display Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.InformationDisplayDescriptorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getInformationDisplayDescriptor()
		 * @generated
		 */
		EClass INFORMATION_DISPLAY_DESCRIPTOR = eINSTANCE.getInformationDisplayDescriptor();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LabelDescriptorImpl <em>Label Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LabelDescriptorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLabelDescriptor()
		 * @generated
		 */
		EClass LABEL_DESCRIPTOR = eINSTANCE.getLabelDescriptor();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_DESCRIPTOR__FONT = eINSTANCE.getLabelDescriptor_Font();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.MappingLabelImpl <em>Mapping Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.MappingLabelImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getMappingLabel()
		 * @generated
		 */
		EClass MAPPING_LABEL = eINSTANCE.getMappingLabel();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ExpressionLabelImpl <em>Expression Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.ExpressionLabelImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getExpressionLabel()
		 * @generated
		 */
		EClass EXPRESSION_LABEL = eINSTANCE.getExpressionLabel();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_LABEL__EXPRESSION = eINSTANCE.getExpressionLabel_Expression();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FontDescriptorImpl <em>Font Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.FontDescriptorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getFontDescriptor()
		 * @generated
		 */
		EClass FONT_DESCRIPTOR = eINSTANCE.getFontDescriptor();

		/**
		 * The meta object literal for the '<em><b>Font Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_DESCRIPTOR__FONT_NAME = eINSTANCE.getFontDescriptor_FontName();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_DESCRIPTOR__SIZE = eINSTANCE.getFontDescriptor_Size();

		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_DESCRIPTOR__FONT_STYLE = eINSTANCE.getFontDescriptor_FontStyle();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.SpacingDescriptorImpl <em>Spacing Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.SpacingDescriptorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getSpacingDescriptor()
		 * @generated
		 */
		EClass SPACING_DESCRIPTOR = eINSTANCE.getSpacingDescriptor();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING_DESCRIPTOR__TOP = eINSTANCE.getSpacingDescriptor_Top();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING_DESCRIPTOR__RIGHT = eINSTANCE.getSpacingDescriptor_Right();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING_DESCRIPTOR__BOTTOM = eINSTANCE.getSpacingDescriptor_Bottom();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING_DESCRIPTOR__LEFT = eINSTANCE.getSpacingDescriptor_Left();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutInformationDescriptorImpl <em>Layout Information Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LayoutInformationDescriptorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLayoutInformationDescriptor()
		 * @generated
		 */
		EClass LAYOUT_INFORMATION_DESCRIPTOR = eINSTANCE.getLayoutInformationDescriptor();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.AbsoluteLayoutInformationImpl <em>Absolute Layout Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.AbsoluteLayoutInformationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getAbsoluteLayoutInformation()
		 * @generated
		 */
		EClass ABSOLUTE_LAYOUT_INFORMATION = eINSTANCE.getAbsoluteLayoutInformation();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSOLUTE_LAYOUT_INFORMATION__POSITION = eINSTANCE.getAbsoluteLayoutInformation_Position();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutInformationImpl <em>Table Layout Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.TableLayoutInformationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getTableLayoutInformation()
		 * @generated
		 */
		EClass TABLE_LAYOUT_INFORMATION = eINSTANCE.getTableLayoutInformation();

		/**
		 * The meta object literal for the '<em><b>Row Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_LAYOUT_INFORMATION__ROW_SPAN = eINSTANCE.getTableLayoutInformation_RowSpan();

		/**
		 * The meta object literal for the '<em><b>Column Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_LAYOUT_INFORMATION__COLUMN_SPAN = eINSTANCE.getTableLayoutInformation_ColumnSpan();

		/**
		 * The meta object literal for the '<em><b>Grab Horizontal Excess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_LAYOUT_INFORMATION__GRAB_HORIZONTAL_EXCESS = eINSTANCE.getTableLayoutInformation_GrabHorizontalExcess();

		/**
		 * The meta object literal for the '<em><b>Grab Vertical Excess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_LAYOUT_INFORMATION__GRAB_VERTICAL_EXCESS = eINSTANCE.getTableLayoutInformation_GrabVerticalExcess();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_LAYOUT_INFORMATION__HORIZONTAL_ALIGNMENT = eINSTANCE.getTableLayoutInformation_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_LAYOUT_INFORMATION__VERTICAL_ALIGNMENT = eINSTANCE.getTableLayoutInformation_VerticalAlignment();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.BorderLayoutInformationDescriptorImpl <em>Border Layout Information Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.BorderLayoutInformationDescriptorImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getBorderLayoutInformationDescriptor()
		 * @generated
		 */
		EClass BORDER_LAYOUT_INFORMATION_DESCRIPTOR = eINSTANCE.getBorderLayoutInformationDescriptor();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_ALIGNMENT = eINSTANCE.getBorderLayoutInformationDescriptor_VerticalAlignment();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_ALIGNMENT = eINSTANCE.getBorderLayoutInformationDescriptor_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Vertical Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_OFFSET = eINSTANCE.getBorderLayoutInformationDescriptor_VerticalOffset();

		/**
		 * The meta object literal for the '<em><b>Horizontal Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_OFFSET = eINSTANCE.getBorderLayoutInformationDescriptor_HorizontalOffset();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkDecorationImpl <em>Link Decoration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.LinkDecorationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getLinkDecoration()
		 * @generated
		 */
		EClass LINK_DECORATION = eINSTANCE.getLinkDecoration();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DECORATION__FILL = eINSTANCE.getLinkDecoration_Fill();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DECORATION__OUTLINE = eINSTANCE.getLinkDecoration_Outline();

		/**
		 * The meta object literal for the '<em><b>Foreground Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DECORATION__FOREGROUND_COLOR = eINSTANCE.getLinkDecoration_ForegroundColor();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DECORATION__BACKGROUND_COLOR = eINSTANCE.getLinkDecoration_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Outline Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DECORATION__OUTLINE_WIDTH = eINSTANCE.getLinkDecoration_OutlineWidth();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.DefaultLinkDecorationImpl <em>Default Link Decoration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.DefaultLinkDecorationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getDefaultLinkDecoration()
		 * @generated
		 */
		EClass DEFAULT_LINK_DECORATION = eINSTANCE.getDefaultLinkDecoration();

		/**
		 * The meta object literal for the '<em><b>Decoration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_LINK_DECORATION__DECORATION_TYPE = eINSTANCE.getDefaultLinkDecoration_DecorationType();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.impl.CustomLinkDecorationImpl <em>Custom Link Decoration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.CustomLinkDecorationImpl
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getCustomLinkDecoration()
		 * @generated
		 */
		EClass CUSTOM_LINK_DECORATION = eINSTANCE.getCustomLinkDecoration();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_LINK_DECORATION__POINTS = eINSTANCE.getCustomLinkDecoration_Points();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecorationTypes <em>Default Link Decoration Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecorationTypes
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getDefaultLinkDecorationTypes()
		 * @generated
		 */
		EEnum DEFAULT_LINK_DECORATION_TYPES = eINSTANCE.getDefaultLinkDecorationTypes();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment <em>Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getAlignment()
		 * @generated
		 */
		EEnum ALIGNMENT = eINSTANCE.getAlignment();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant <em>Color Constant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getColorConstant()
		 * @generated
		 */
		EEnum COLOR_CONSTANT = eINSTANCE.getColorConstant();

		/**
		 * The meta object literal for the '{@link de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle <em>Font Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle
		 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationPackageImpl#getFontStyle()
		 * @generated
		 */
		EEnum FONT_STYLE = eINSTANCE.getFontStyle();

	}

} //VisualizationPackage
