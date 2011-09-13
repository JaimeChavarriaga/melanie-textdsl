/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationFactoryImpl extends EFactoryImpl implements VisualizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VisualizationFactory init() {
		try {
			VisualizationFactory theVisualizationFactory = (VisualizationFactory)EPackage.Registry.INSTANCE.getEFactory("http://swt.informatik.uni-mannheim.de/visualization"); 
			if (theVisualizationFactory != null) {
				return theVisualizationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VisualizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VisualizationPackage.FLOW_LAYOUT: return createFlowLayout();
			case VisualizationPackage.ABSOLUTE_LAYOUT: return createAbsoluteLayout();
			case VisualizationPackage.TABLE_LAYOUT: return createTableLayout();
			case VisualizationPackage.CIRCLE: return createCircle();
			case VisualizationPackage.RECTANGLE: return createRectangle();
			case VisualizationPackage.ROUNDED_RECTANGLE: return createRoundedRectangle();
			case VisualizationPackage.SVG_FIGURE: return createSVGFigure();
			case VisualizationPackage.LINK: return createLink();
			case VisualizationPackage.FREEHAND_SHAPE: return createFreehandShape();
			case VisualizationPackage.POINT: return createPoint();
			case VisualizationPackage.MAPPING_LABEL: return createMappingLabel();
			case VisualizationPackage.EXPRESSION_LABEL: return createExpressionLabel();
			case VisualizationPackage.FONT_DESCRIPTOR: return createFontDescriptor();
			case VisualizationPackage.SPACING_DESCRIPTOR: return createSpacingDescriptor();
			case VisualizationPackage.ABSOLUTE_LAYOUT_INFORMATION: return createAbsoluteLayoutInformation();
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION: return createTableLayoutInformation();
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR: return createBorderLayoutInformationDescriptor();
			case VisualizationPackage.DEFAULT_LINK_DECORATION: return createDefaultLinkDecoration();
			case VisualizationPackage.CUSTOM_LINK_DECORATION: return createCustomLinkDecoration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VisualizationPackage.DEFAULT_LINK_DECORATION_TYPES:
				return createDefaultLinkDecorationTypesFromString(eDataType, initialValue);
			case VisualizationPackage.ALIGNMENT:
				return createAlignmentFromString(eDataType, initialValue);
			case VisualizationPackage.COLOR_CONSTANT:
				return createColorConstantFromString(eDataType, initialValue);
			case VisualizationPackage.FONT_STYLE:
				return createFontStyleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VisualizationPackage.DEFAULT_LINK_DECORATION_TYPES:
				return convertDefaultLinkDecorationTypesToString(eDataType, instanceValue);
			case VisualizationPackage.ALIGNMENT:
				return convertAlignmentToString(eDataType, instanceValue);
			case VisualizationPackage.COLOR_CONSTANT:
				return convertColorConstantToString(eDataType, instanceValue);
			case VisualizationPackage.FONT_STYLE:
				return convertFontStyleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowLayout createFlowLayout() {
		FlowLayoutImpl flowLayout = new FlowLayoutImpl();
		return flowLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteLayout createAbsoluteLayout() {
		AbsoluteLayoutImpl absoluteLayout = new AbsoluteLayoutImpl();
		return absoluteLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableLayout createTableLayout() {
		TableLayoutImpl tableLayout = new TableLayoutImpl();
		return tableLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundedRectangle createRoundedRectangle() {
		RoundedRectangleImpl roundedRectangle = new RoundedRectangleImpl();
		return roundedRectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVGFigure createSVGFigure() {
		SVGFigureImpl svgFigure = new SVGFigureImpl();
		return svgFigure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreehandShape createFreehandShape() {
		FreehandShapeImpl freehandShape = new FreehandShapeImpl();
		return freehandShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingLabel createMappingLabel() {
		MappingLabelImpl mappingLabel = new MappingLabelImpl();
		return mappingLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionLabel createExpressionLabel() {
		ExpressionLabelImpl expressionLabel = new ExpressionLabelImpl();
		return expressionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontDescriptor createFontDescriptor() {
		FontDescriptorImpl fontDescriptor = new FontDescriptorImpl();
		return fontDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingDescriptor createSpacingDescriptor() {
		SpacingDescriptorImpl spacingDescriptor = new SpacingDescriptorImpl();
		return spacingDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteLayoutInformation createAbsoluteLayoutInformation() {
		AbsoluteLayoutInformationImpl absoluteLayoutInformation = new AbsoluteLayoutInformationImpl();
		return absoluteLayoutInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableLayoutInformation createTableLayoutInformation() {
		TableLayoutInformationImpl tableLayoutInformation = new TableLayoutInformationImpl();
		return tableLayoutInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderLayoutInformationDescriptor createBorderLayoutInformationDescriptor() {
		BorderLayoutInformationDescriptorImpl borderLayoutInformationDescriptor = new BorderLayoutInformationDescriptorImpl();
		return borderLayoutInformationDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultLinkDecoration createDefaultLinkDecoration() {
		DefaultLinkDecorationImpl defaultLinkDecoration = new DefaultLinkDecorationImpl();
		return defaultLinkDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomLinkDecoration createCustomLinkDecoration() {
		CustomLinkDecorationImpl customLinkDecoration = new CustomLinkDecorationImpl();
		return customLinkDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultLinkDecorationTypes createDefaultLinkDecorationTypesFromString(EDataType eDataType, String initialValue) {
		DefaultLinkDecorationTypes result = DefaultLinkDecorationTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultLinkDecorationTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment createAlignmentFromString(EDataType eDataType, String initialValue) {
		Alignment result = Alignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorConstant createColorConstantFromString(EDataType eDataType, String initialValue) {
		ColorConstant result = ColorConstant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorConstantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle createFontStyleFromString(EDataType eDataType, String initialValue) {
		FontStyle result = FontStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationPackage getVisualizationPackage() {
		return (VisualizationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VisualizationPackage getPackage() {
		return VisualizationPackage.eINSTANCE;
	}

} //VisualizationFactoryImpl
