/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

import de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl;

import de.uni_mannheim.informatik.swt.models.plm.visualization.AbsoluteLayout;
import de.uni_mannheim.informatik.swt.models.plm.visualization.AbsoluteLayoutInformation;
import de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment;
import de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.Circle;
import de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant;
import de.uni_mannheim.informatik.swt.models.plm.visualization.CustomLinkDecoration;
import de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecoration;
import de.uni_mannheim.informatik.swt.models.plm.visualization.DefaultLinkDecorationTypes;
import de.uni_mannheim.informatik.swt.models.plm.visualization.ExpressionLabel;
import de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout;
import de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle;
import de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape;
import de.uni_mannheim.informatik.swt.models.plm.visualization.InformationDisplayDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LabelDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutInformationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.Link;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LinkDecoration;
import de.uni_mannheim.informatik.swt.models.plm.visualization.MappingLabel;
import de.uni_mannheim.informatik.swt.models.plm.visualization.Point;
import de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle;
import de.uni_mannheim.informatik.swt.models.plm.visualization.RoundedRectangle;
import de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure;
import de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.SpacingDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayout;
import de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationFactory;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationPackageImpl extends EPackageImpl implements VisualizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutContentDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundedRectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svgFigureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freehandShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationDisplayDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacingDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutInformationDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteLayoutInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableLayoutInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borderLayoutInformationDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkDecorationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultLinkDecorationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customLinkDecorationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultLinkDecorationTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorConstantEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStyleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisualizationPackageImpl() {
		super(eNS_URI, VisualizationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VisualizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisualizationPackage init() {
		if (isInited) return (VisualizationPackage)EPackage.Registry.INSTANCE.getEPackage(VisualizationPackage.eNS_URI);

		// Obtain or create and register package
		VisualizationPackageImpl theVisualizationPackage = (VisualizationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisualizationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisualizationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PLMPackageImpl thePLMPackage = (PLMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PLMPackage.eNS_URI) instanceof PLMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PLMPackage.eNS_URI) : PLMPackage.eINSTANCE);

		// Create package meta-data objects
		theVisualizationPackage.createPackageContents();
		thePLMPackage.createPackageContents();

		// Initialize created meta-data
		theVisualizationPackage.initializePackageContents();
		thePLMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVisualizationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisualizationPackage.eNS_URI, theVisualizationPackage);
		return theVisualizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualizationDescriptor() {
		return visualizationDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutDescriptor() {
		return layoutDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutDescriptor_Margin() {
		return (EReference)layoutDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutDescriptor_Padding() {
		return (EReference)layoutDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutDescriptor_Content() {
		return (EReference)layoutDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowLayout() {
		return flowLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowLayout_Vertical() {
		return (EAttribute)flowLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowLayout_SingleLine() {
		return (EAttribute)flowLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteLayout() {
		return absoluteLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableLayout() {
		return tableLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableLayout_Columns() {
		return (EAttribute)tableLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutContentDescriptor() {
		return layoutContentDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayoutContentDescriptor_LayoutInformation() {
		return (EReference)layoutContentDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutContentDescriptor_BackgroundColor() {
		return (EAttribute)layoutContentDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayoutContentDescriptor_ForegroundColor() {
		return (EAttribute)layoutContentDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeDescriptor() {
		return shapeDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeDescriptor_Layout() {
		return (EReference)shapeDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeDescriptor_Outline() {
		return (EAttribute)shapeDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeDescriptor_Fill() {
		return (EAttribute)shapeDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeDescriptor_OutlineWidth() {
		return (EAttribute)shapeDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircle() {
		return circleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircle_Radius() {
		return (EAttribute)circleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangle() {
		return rectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangle_Height() {
		return (EAttribute)rectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangle_Width() {
		return (EAttribute)rectangleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundedRectangle() {
		return roundedRectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundedRectangle_Radius() {
		return (EAttribute)roundedRectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSVGFigure() {
		return svgFigureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSVGFigure_DocumentURI() {
		return (EAttribute)svgFigureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSVGFigure_Width() {
		return (EAttribute)svgFigureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSVGFigure_Height() {
		return (EAttribute)svgFigureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Decoration() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Label() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLink__GetLinkDecorationForRoleName__String() {
		return linkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLink__GetLabelDescriptorForRoleName__String() {
		return linkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreehandShape() {
		return freehandShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandShape_Points() {
		return (EReference)freehandShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreehandShape_Width() {
		return (EAttribute)freehandShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreehandShape_Height() {
		return (EAttribute)freehandShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationDisplayDescriptor() {
		return informationDisplayDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelDescriptor() {
		return labelDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelDescriptor_Font() {
		return (EReference)labelDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelDescriptor_TargetRoleName() {
		return (EAttribute)labelDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingLabel() {
		return mappingLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionLabel() {
		return expressionLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpressionLabel_Expression() {
		return (EAttribute)expressionLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontDescriptor() {
		return fontDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontDescriptor_FontName() {
		return (EAttribute)fontDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontDescriptor_Size() {
		return (EAttribute)fontDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontDescriptor_FontStyle() {
		return (EAttribute)fontDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacingDescriptor() {
		return spacingDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacingDescriptor_Top() {
		return (EAttribute)spacingDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacingDescriptor_Right() {
		return (EAttribute)spacingDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacingDescriptor_Bottom() {
		return (EAttribute)spacingDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacingDescriptor_Left() {
		return (EAttribute)spacingDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayoutInformationDescriptor() {
		return layoutInformationDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteLayoutInformation() {
		return absoluteLayoutInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsoluteLayoutInformation_Position() {
		return (EReference)absoluteLayoutInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableLayoutInformation() {
		return tableLayoutInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableLayoutInformation_RowSpan() {
		return (EAttribute)tableLayoutInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableLayoutInformation_ColumnSpan() {
		return (EAttribute)tableLayoutInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableLayoutInformation_GrabHorizontalExcess() {
		return (EAttribute)tableLayoutInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableLayoutInformation_GrabVerticalExcess() {
		return (EAttribute)tableLayoutInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableLayoutInformation_HorizontalAlignment() {
		return (EAttribute)tableLayoutInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableLayoutInformation_VerticalAlignment() {
		return (EAttribute)tableLayoutInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorderLayoutInformationDescriptor() {
		return borderLayoutInformationDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorderLayoutInformationDescriptor_VerticalAlignment() {
		return (EAttribute)borderLayoutInformationDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorderLayoutInformationDescriptor_HorizontalAlignment() {
		return (EAttribute)borderLayoutInformationDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorderLayoutInformationDescriptor_VerticalOffset() {
		return (EAttribute)borderLayoutInformationDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBorderLayoutInformationDescriptor_HorizontalOffset() {
		return (EAttribute)borderLayoutInformationDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkDecoration() {
		return linkDecorationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDecoration_Fill() {
		return (EAttribute)linkDecorationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDecoration_Outline() {
		return (EAttribute)linkDecorationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDecoration_ForegroundColor() {
		return (EAttribute)linkDecorationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDecoration_BackgroundColor() {
		return (EAttribute)linkDecorationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDecoration_OutlineWidth() {
		return (EAttribute)linkDecorationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDecoration_TargetRoleName() {
		return (EAttribute)linkDecorationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultLinkDecoration() {
		return defaultLinkDecorationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultLinkDecoration_DecorationType() {
		return (EAttribute)defaultLinkDecorationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomLinkDecoration() {
		return customLinkDecorationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomLinkDecoration_Points() {
		return (EReference)customLinkDecorationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefaultLinkDecorationTypes() {
		return defaultLinkDecorationTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignment() {
		return alignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorConstant() {
		return colorConstantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontStyle() {
		return fontStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationFactory getVisualizationFactory() {
		return (VisualizationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		visualizationDescriptorEClass = createEClass(VISUALIZATION_DESCRIPTOR);

		layoutDescriptorEClass = createEClass(LAYOUT_DESCRIPTOR);
		createEReference(layoutDescriptorEClass, LAYOUT_DESCRIPTOR__MARGIN);
		createEReference(layoutDescriptorEClass, LAYOUT_DESCRIPTOR__PADDING);
		createEReference(layoutDescriptorEClass, LAYOUT_DESCRIPTOR__CONTENT);

		flowLayoutEClass = createEClass(FLOW_LAYOUT);
		createEAttribute(flowLayoutEClass, FLOW_LAYOUT__VERTICAL);
		createEAttribute(flowLayoutEClass, FLOW_LAYOUT__SINGLE_LINE);

		absoluteLayoutEClass = createEClass(ABSOLUTE_LAYOUT);

		tableLayoutEClass = createEClass(TABLE_LAYOUT);
		createEAttribute(tableLayoutEClass, TABLE_LAYOUT__COLUMNS);

		layoutContentDescriptorEClass = createEClass(LAYOUT_CONTENT_DESCRIPTOR);
		createEReference(layoutContentDescriptorEClass, LAYOUT_CONTENT_DESCRIPTOR__LAYOUT_INFORMATION);
		createEAttribute(layoutContentDescriptorEClass, LAYOUT_CONTENT_DESCRIPTOR__BACKGROUND_COLOR);
		createEAttribute(layoutContentDescriptorEClass, LAYOUT_CONTENT_DESCRIPTOR__FOREGROUND_COLOR);

		shapeDescriptorEClass = createEClass(SHAPE_DESCRIPTOR);
		createEReference(shapeDescriptorEClass, SHAPE_DESCRIPTOR__LAYOUT);
		createEAttribute(shapeDescriptorEClass, SHAPE_DESCRIPTOR__OUTLINE);
		createEAttribute(shapeDescriptorEClass, SHAPE_DESCRIPTOR__FILL);
		createEAttribute(shapeDescriptorEClass, SHAPE_DESCRIPTOR__OUTLINE_WIDTH);

		circleEClass = createEClass(CIRCLE);
		createEAttribute(circleEClass, CIRCLE__RADIUS);

		rectangleEClass = createEClass(RECTANGLE);
		createEAttribute(rectangleEClass, RECTANGLE__HEIGHT);
		createEAttribute(rectangleEClass, RECTANGLE__WIDTH);

		roundedRectangleEClass = createEClass(ROUNDED_RECTANGLE);
		createEAttribute(roundedRectangleEClass, ROUNDED_RECTANGLE__RADIUS);

		svgFigureEClass = createEClass(SVG_FIGURE);
		createEAttribute(svgFigureEClass, SVG_FIGURE__DOCUMENT_URI);
		createEAttribute(svgFigureEClass, SVG_FIGURE__WIDTH);
		createEAttribute(svgFigureEClass, SVG_FIGURE__HEIGHT);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__DECORATION);
		createEReference(linkEClass, LINK__LABEL);
		createEOperation(linkEClass, LINK___GET_LINK_DECORATION_FOR_ROLE_NAME__STRING);
		createEOperation(linkEClass, LINK___GET_LABEL_DESCRIPTOR_FOR_ROLE_NAME__STRING);

		freehandShapeEClass = createEClass(FREEHAND_SHAPE);
		createEReference(freehandShapeEClass, FREEHAND_SHAPE__POINTS);
		createEAttribute(freehandShapeEClass, FREEHAND_SHAPE__WIDTH);
		createEAttribute(freehandShapeEClass, FREEHAND_SHAPE__HEIGHT);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);

		informationDisplayDescriptorEClass = createEClass(INFORMATION_DISPLAY_DESCRIPTOR);

		labelDescriptorEClass = createEClass(LABEL_DESCRIPTOR);
		createEReference(labelDescriptorEClass, LABEL_DESCRIPTOR__FONT);
		createEAttribute(labelDescriptorEClass, LABEL_DESCRIPTOR__TARGET_ROLE_NAME);

		mappingLabelEClass = createEClass(MAPPING_LABEL);

		expressionLabelEClass = createEClass(EXPRESSION_LABEL);
		createEAttribute(expressionLabelEClass, EXPRESSION_LABEL__EXPRESSION);

		fontDescriptorEClass = createEClass(FONT_DESCRIPTOR);
		createEAttribute(fontDescriptorEClass, FONT_DESCRIPTOR__FONT_NAME);
		createEAttribute(fontDescriptorEClass, FONT_DESCRIPTOR__SIZE);
		createEAttribute(fontDescriptorEClass, FONT_DESCRIPTOR__FONT_STYLE);

		spacingDescriptorEClass = createEClass(SPACING_DESCRIPTOR);
		createEAttribute(spacingDescriptorEClass, SPACING_DESCRIPTOR__TOP);
		createEAttribute(spacingDescriptorEClass, SPACING_DESCRIPTOR__RIGHT);
		createEAttribute(spacingDescriptorEClass, SPACING_DESCRIPTOR__BOTTOM);
		createEAttribute(spacingDescriptorEClass, SPACING_DESCRIPTOR__LEFT);

		layoutInformationDescriptorEClass = createEClass(LAYOUT_INFORMATION_DESCRIPTOR);

		absoluteLayoutInformationEClass = createEClass(ABSOLUTE_LAYOUT_INFORMATION);
		createEReference(absoluteLayoutInformationEClass, ABSOLUTE_LAYOUT_INFORMATION__POSITION);

		tableLayoutInformationEClass = createEClass(TABLE_LAYOUT_INFORMATION);
		createEAttribute(tableLayoutInformationEClass, TABLE_LAYOUT_INFORMATION__ROW_SPAN);
		createEAttribute(tableLayoutInformationEClass, TABLE_LAYOUT_INFORMATION__COLUMN_SPAN);
		createEAttribute(tableLayoutInformationEClass, TABLE_LAYOUT_INFORMATION__GRAB_HORIZONTAL_EXCESS);
		createEAttribute(tableLayoutInformationEClass, TABLE_LAYOUT_INFORMATION__GRAB_VERTICAL_EXCESS);
		createEAttribute(tableLayoutInformationEClass, TABLE_LAYOUT_INFORMATION__HORIZONTAL_ALIGNMENT);
		createEAttribute(tableLayoutInformationEClass, TABLE_LAYOUT_INFORMATION__VERTICAL_ALIGNMENT);

		borderLayoutInformationDescriptorEClass = createEClass(BORDER_LAYOUT_INFORMATION_DESCRIPTOR);
		createEAttribute(borderLayoutInformationDescriptorEClass, BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_ALIGNMENT);
		createEAttribute(borderLayoutInformationDescriptorEClass, BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_ALIGNMENT);
		createEAttribute(borderLayoutInformationDescriptorEClass, BORDER_LAYOUT_INFORMATION_DESCRIPTOR__VERTICAL_OFFSET);
		createEAttribute(borderLayoutInformationDescriptorEClass, BORDER_LAYOUT_INFORMATION_DESCRIPTOR__HORIZONTAL_OFFSET);

		linkDecorationEClass = createEClass(LINK_DECORATION);
		createEAttribute(linkDecorationEClass, LINK_DECORATION__FILL);
		createEAttribute(linkDecorationEClass, LINK_DECORATION__OUTLINE);
		createEAttribute(linkDecorationEClass, LINK_DECORATION__FOREGROUND_COLOR);
		createEAttribute(linkDecorationEClass, LINK_DECORATION__BACKGROUND_COLOR);
		createEAttribute(linkDecorationEClass, LINK_DECORATION__OUTLINE_WIDTH);
		createEAttribute(linkDecorationEClass, LINK_DECORATION__TARGET_ROLE_NAME);

		defaultLinkDecorationEClass = createEClass(DEFAULT_LINK_DECORATION);
		createEAttribute(defaultLinkDecorationEClass, DEFAULT_LINK_DECORATION__DECORATION_TYPE);

		customLinkDecorationEClass = createEClass(CUSTOM_LINK_DECORATION);
		createEReference(customLinkDecorationEClass, CUSTOM_LINK_DECORATION__POINTS);

		// Create enums
		defaultLinkDecorationTypesEEnum = createEEnum(DEFAULT_LINK_DECORATION_TYPES);
		alignmentEEnum = createEEnum(ALIGNMENT);
		colorConstantEEnum = createEEnum(COLOR_CONSTANT);
		fontStyleEEnum = createEEnum(FONT_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		layoutDescriptorEClass.getESuperTypes().add(this.getVisualizationDescriptor());
		flowLayoutEClass.getESuperTypes().add(this.getLayoutDescriptor());
		absoluteLayoutEClass.getESuperTypes().add(this.getLayoutDescriptor());
		tableLayoutEClass.getESuperTypes().add(this.getLayoutDescriptor());
		layoutContentDescriptorEClass.getESuperTypes().add(this.getVisualizationDescriptor());
		shapeDescriptorEClass.getESuperTypes().add(this.getLayoutContentDescriptor());
		circleEClass.getESuperTypes().add(this.getShapeDescriptor());
		rectangleEClass.getESuperTypes().add(this.getShapeDescriptor());
		roundedRectangleEClass.getESuperTypes().add(this.getRectangle());
		svgFigureEClass.getESuperTypes().add(this.getShapeDescriptor());
		linkEClass.getESuperTypes().add(this.getShapeDescriptor());
		freehandShapeEClass.getESuperTypes().add(this.getShapeDescriptor());
		informationDisplayDescriptorEClass.getESuperTypes().add(this.getLayoutContentDescriptor());
		labelDescriptorEClass.getESuperTypes().add(this.getInformationDisplayDescriptor());
		mappingLabelEClass.getESuperTypes().add(this.getLabelDescriptor());
		expressionLabelEClass.getESuperTypes().add(this.getLabelDescriptor());
		absoluteLayoutInformationEClass.getESuperTypes().add(this.getLayoutInformationDescriptor());
		tableLayoutInformationEClass.getESuperTypes().add(this.getLayoutInformationDescriptor());
		borderLayoutInformationDescriptorEClass.getESuperTypes().add(this.getLayoutInformationDescriptor());
		defaultLinkDecorationEClass.getESuperTypes().add(this.getLinkDecoration());
		customLinkDecorationEClass.getESuperTypes().add(this.getLinkDecoration());

		// Initialize classes, features, and operations; add parameters
		initEClass(visualizationDescriptorEClass, VisualizationDescriptor.class, "VisualizationDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layoutDescriptorEClass, LayoutDescriptor.class, "LayoutDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayoutDescriptor_Margin(), this.getSpacingDescriptor(), null, "margin", null, 0, 1, LayoutDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutDescriptor_Padding(), this.getSpacingDescriptor(), null, "padding", null, 0, 1, LayoutDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayoutDescriptor_Content(), this.getLayoutContentDescriptor(), null, "content", null, 0, -1, LayoutDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowLayoutEClass, FlowLayout.class, "FlowLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowLayout_Vertical(), ecorePackage.getEBoolean(), "vertical", "false", 1, 1, FlowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowLayout_SingleLine(), ecorePackage.getEBoolean(), "singleLine", "false", 1, 1, FlowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absoluteLayoutEClass, AbsoluteLayout.class, "AbsoluteLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableLayoutEClass, TableLayout.class, "TableLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableLayout_Columns(), ecorePackage.getEInt(), "columns", "1", 1, 1, TableLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutContentDescriptorEClass, LayoutContentDescriptor.class, "LayoutContentDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayoutContentDescriptor_LayoutInformation(), this.getLayoutInformationDescriptor(), null, "layoutInformation", null, 0, 1, LayoutContentDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutContentDescriptor_BackgroundColor(), this.getColorConstant(), "backgroundColor", "White", 1, 1, LayoutContentDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayoutContentDescriptor_ForegroundColor(), this.getColorConstant(), "foregroundColor", "Black", 1, 1, LayoutContentDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeDescriptorEClass, ShapeDescriptor.class, "ShapeDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapeDescriptor_Layout(), this.getLayoutDescriptor(), null, "layout", null, 0, 1, ShapeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeDescriptor_Outline(), ecorePackage.getEBoolean(), "outline", "true", 1, 1, ShapeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeDescriptor_Fill(), ecorePackage.getEBoolean(), "fill", "true", 1, 1, ShapeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeDescriptor_OutlineWidth(), ecorePackage.getEInt(), "outlineWidth", "1", 1, 1, ShapeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(circleEClass, Circle.class, "Circle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircle_Radius(), ecorePackage.getEInt(), "radius", "1", 1, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangle_Height(), ecorePackage.getEInt(), "height", null, 1, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangle_Width(), ecorePackage.getEInt(), "width", null, 1, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roundedRectangleEClass, RoundedRectangle.class, "RoundedRectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoundedRectangle_Radius(), ecorePackage.getEInt(), "radius", "1", 1, 1, RoundedRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(svgFigureEClass, SVGFigure.class, "SVGFigure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSVGFigure_DocumentURI(), ecorePackage.getEString(), "documentURI", null, 1, 1, SVGFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSVGFigure_Width(), ecorePackage.getEInt(), "width", null, 1, 1, SVGFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSVGFigure_Height(), ecorePackage.getEInt(), "height", null, 1, 1, SVGFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Decoration(), this.getLinkDecoration(), null, "decoration", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Label(), this.getLabelDescriptor(), null, "label", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getLink__GetLinkDecorationForRoleName__String(), this.getLinkDecoration(), "getLinkDecorationForRoleName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLink__GetLabelDescriptorForRoleName__String(), this.getLabelDescriptor(), "getLabelDescriptorForRoleName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roleName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(freehandShapeEClass, FreehandShape.class, "FreehandShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFreehandShape_Points(), this.getPoint(), null, "points", null, 1, -1, FreehandShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreehandShape_Width(), ecorePackage.getEInt(), "width", "0", 1, 1, FreehandShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreehandShape_Height(), ecorePackage.getEInt(), "height", "0", 1, 1, FreehandShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), ecorePackage.getEInt(), "x", "0", 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), ecorePackage.getEInt(), "y", "0", 1, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationDisplayDescriptorEClass, InformationDisplayDescriptor.class, "InformationDisplayDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelDescriptorEClass, LabelDescriptor.class, "LabelDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelDescriptor_Font(), this.getFontDescriptor(), null, "font", null, 0, 1, LabelDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelDescriptor_TargetRoleName(), ecorePackage.getEString(), "targetRoleName", null, 1, 1, LabelDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingLabelEClass, MappingLabel.class, "MappingLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionLabelEClass, ExpressionLabel.class, "ExpressionLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionLabel_Expression(), ecorePackage.getEString(), "expression", "", 1, 1, ExpressionLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontDescriptorEClass, FontDescriptor.class, "FontDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFontDescriptor_FontName(), ecorePackage.getEString(), "fontName", null, 0, 1, FontDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFontDescriptor_Size(), ecorePackage.getEInt(), "size", null, 0, 1, FontDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFontDescriptor_FontStyle(), this.getFontStyle(), "fontStyle", "Normal", 0, 1, FontDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spacingDescriptorEClass, SpacingDescriptor.class, "SpacingDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpacingDescriptor_Top(), ecorePackage.getEInt(), "top", "0", 1, 1, SpacingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacingDescriptor_Right(), ecorePackage.getEInt(), "right", "0", 1, 1, SpacingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacingDescriptor_Bottom(), ecorePackage.getEInt(), "bottom", "0", 1, 1, SpacingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacingDescriptor_Left(), ecorePackage.getEInt(), "left", "0", 1, 1, SpacingDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutInformationDescriptorEClass, LayoutInformationDescriptor.class, "LayoutInformationDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(absoluteLayoutInformationEClass, AbsoluteLayoutInformation.class, "AbsoluteLayoutInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsoluteLayoutInformation_Position(), this.getPoint(), null, "position", null, 1, 1, AbsoluteLayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableLayoutInformationEClass, TableLayoutInformation.class, "TableLayoutInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableLayoutInformation_RowSpan(), ecorePackage.getEInt(), "rowSpan", "1", 1, 1, TableLayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableLayoutInformation_ColumnSpan(), ecorePackage.getEInt(), "columnSpan", "1", 1, 1, TableLayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableLayoutInformation_GrabHorizontalExcess(), ecorePackage.getEBoolean(), "grabHorizontalExcess", "false", 1, 1, TableLayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableLayoutInformation_GrabVerticalExcess(), ecorePackage.getEBoolean(), "grabVerticalExcess", "false", 1, 1, TableLayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableLayoutInformation_HorizontalAlignment(), this.getAlignment(), "horizontalAlignment", "Begin", 1, 1, TableLayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableLayoutInformation_VerticalAlignment(), this.getAlignment(), "verticalAlignment", "Begin", 1, 1, TableLayoutInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(borderLayoutInformationDescriptorEClass, BorderLayoutInformationDescriptor.class, "BorderLayoutInformationDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBorderLayoutInformationDescriptor_VerticalAlignment(), this.getAlignment(), "verticalAlignment", "End", 1, 1, BorderLayoutInformationDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBorderLayoutInformationDescriptor_HorizontalAlignment(), this.getAlignment(), "horizontalAlignment", "Center", 1, 1, BorderLayoutInformationDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBorderLayoutInformationDescriptor_VerticalOffset(), ecorePackage.getEInt(), "verticalOffset", "0", 1, 1, BorderLayoutInformationDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBorderLayoutInformationDescriptor_HorizontalOffset(), ecorePackage.getEInt(), "horizontalOffset", "0", 1, 1, BorderLayoutInformationDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkDecorationEClass, LinkDecoration.class, "LinkDecoration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkDecoration_Fill(), ecorePackage.getEBoolean(), "fill", "true", 1, 1, LinkDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDecoration_Outline(), ecorePackage.getEBoolean(), "outline", "true", 1, 1, LinkDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDecoration_ForegroundColor(), this.getColorConstant(), "foregroundColor", "Black", 1, 1, LinkDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDecoration_BackgroundColor(), this.getColorConstant(), "backgroundColor", "White", 1, 1, LinkDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDecoration_OutlineWidth(), ecorePackage.getEInt(), "outlineWidth", "1", 1, 1, LinkDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDecoration_TargetRoleName(), ecorePackage.getEString(), "targetRoleName", null, 1, 1, LinkDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultLinkDecorationEClass, DefaultLinkDecoration.class, "DefaultLinkDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultLinkDecoration_DecorationType(), this.getDefaultLinkDecorationTypes(), "decorationType", "PolygoneLineDecoration", 1, 1, DefaultLinkDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customLinkDecorationEClass, CustomLinkDecoration.class, "CustomLinkDecoration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomLinkDecoration_Points(), this.getPoint(), null, "points", null, 1, -1, CustomLinkDecoration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(defaultLinkDecorationTypesEEnum, DefaultLinkDecorationTypes.class, "DefaultLinkDecorationTypes");
		addEEnumLiteral(defaultLinkDecorationTypesEEnum, DefaultLinkDecorationTypes.POLY_LINE_DECORATION);
		addEEnumLiteral(defaultLinkDecorationTypesEEnum, DefaultLinkDecorationTypes.POLYGONE_LINE_DECORATION);
		addEEnumLiteral(defaultLinkDecorationTypesEEnum, DefaultLinkDecorationTypes.NO_LINE_DECORATION);

		initEEnum(alignmentEEnum, Alignment.class, "Alignment");
		addEEnumLiteral(alignmentEEnum, Alignment.BEGIN);
		addEEnumLiteral(alignmentEEnum, Alignment.CENTER);
		addEEnumLiteral(alignmentEEnum, Alignment.END);

		initEEnum(colorConstantEEnum, ColorConstant.class, "ColorConstant");
		addEEnumLiteral(colorConstantEEnum, ColorConstant.BLACK);
		addEEnumLiteral(colorConstantEEnum, ColorConstant.WHITE);
		addEEnumLiteral(colorConstantEEnum, ColorConstant.BLUE);
		addEEnumLiteral(colorConstantEEnum, ColorConstant.RED);
		addEEnumLiteral(colorConstantEEnum, ColorConstant.GREEN);
		addEEnumLiteral(colorConstantEEnum, ColorConstant.YELLOW);
		addEEnumLiteral(colorConstantEEnum, ColorConstant.ORANGE);

		initEEnum(fontStyleEEnum, FontStyle.class, "FontStyle");
		addEEnumLiteral(fontStyleEEnum, FontStyle.NORMAL);
		addEEnumLiteral(fontStyleEEnum, FontStyle.ITALICS);
		addEEnumLiteral(fontStyleEEnum, FontStyle.BOLD);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";		
		addAnnotation
		  (getLink__GetLinkDecorationForRoleName__String(), 
		   source, 
		   new String[] {
			 "body", "self.decoration->select(d | d.targetRoleName = roleName)->asOrderedSet()->first()"
		   });		
		addAnnotation
		  (getLink__GetLabelDescriptorForRoleName__String(), 
		   source, 
		   new String[] {
			 "body", "self.label->select(l | l.targetRoleName = roleName)->asOrderedSet()->first()"
		   });
	}

} //VisualizationPackageImpl
