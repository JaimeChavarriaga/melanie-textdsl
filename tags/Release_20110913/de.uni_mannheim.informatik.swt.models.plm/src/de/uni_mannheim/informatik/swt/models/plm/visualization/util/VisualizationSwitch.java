/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization.util;

import de.uni_mannheim.informatik.swt.models.plm.visualization.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage
 * @generated
 */
public class VisualizationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisualizationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationSwitch() {
		if (modelPackage == null) {
			modelPackage = VisualizationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VisualizationPackage.VISUALIZATION_DESCRIPTOR: {
				VisualizationDescriptor visualizationDescriptor = (VisualizationDescriptor)theEObject;
				T result = caseVisualizationDescriptor(visualizationDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.LAYOUT_DESCRIPTOR: {
				LayoutDescriptor layoutDescriptor = (LayoutDescriptor)theEObject;
				T result = caseLayoutDescriptor(layoutDescriptor);
				if (result == null) result = caseVisualizationDescriptor(layoutDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.FLOW_LAYOUT: {
				FlowLayout flowLayout = (FlowLayout)theEObject;
				T result = caseFlowLayout(flowLayout);
				if (result == null) result = caseLayoutDescriptor(flowLayout);
				if (result == null) result = caseVisualizationDescriptor(flowLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.ABSOLUTE_LAYOUT: {
				AbsoluteLayout absoluteLayout = (AbsoluteLayout)theEObject;
				T result = caseAbsoluteLayout(absoluteLayout);
				if (result == null) result = caseLayoutDescriptor(absoluteLayout);
				if (result == null) result = caseVisualizationDescriptor(absoluteLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.TABLE_LAYOUT: {
				TableLayout tableLayout = (TableLayout)theEObject;
				T result = caseTableLayout(tableLayout);
				if (result == null) result = caseLayoutDescriptor(tableLayout);
				if (result == null) result = caseVisualizationDescriptor(tableLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.LAYOUT_CONTENT_DESCRIPTOR: {
				LayoutContentDescriptor layoutContentDescriptor = (LayoutContentDescriptor)theEObject;
				T result = caseLayoutContentDescriptor(layoutContentDescriptor);
				if (result == null) result = caseVisualizationDescriptor(layoutContentDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.SHAPE_DESCRIPTOR: {
				ShapeDescriptor shapeDescriptor = (ShapeDescriptor)theEObject;
				T result = caseShapeDescriptor(shapeDescriptor);
				if (result == null) result = caseLayoutContentDescriptor(shapeDescriptor);
				if (result == null) result = caseVisualizationDescriptor(shapeDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.CIRCLE: {
				Circle circle = (Circle)theEObject;
				T result = caseCircle(circle);
				if (result == null) result = caseShapeDescriptor(circle);
				if (result == null) result = caseLayoutContentDescriptor(circle);
				if (result == null) result = caseVisualizationDescriptor(circle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.RECTANGLE: {
				Rectangle rectangle = (Rectangle)theEObject;
				T result = caseRectangle(rectangle);
				if (result == null) result = caseShapeDescriptor(rectangle);
				if (result == null) result = caseLayoutContentDescriptor(rectangle);
				if (result == null) result = caseVisualizationDescriptor(rectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.ROUNDED_RECTANGLE: {
				RoundedRectangle roundedRectangle = (RoundedRectangle)theEObject;
				T result = caseRoundedRectangle(roundedRectangle);
				if (result == null) result = caseRectangle(roundedRectangle);
				if (result == null) result = caseShapeDescriptor(roundedRectangle);
				if (result == null) result = caseLayoutContentDescriptor(roundedRectangle);
				if (result == null) result = caseVisualizationDescriptor(roundedRectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.SVG_FIGURE: {
				SVGFigure svgFigure = (SVGFigure)theEObject;
				T result = caseSVGFigure(svgFigure);
				if (result == null) result = caseShapeDescriptor(svgFigure);
				if (result == null) result = caseLayoutContentDescriptor(svgFigure);
				if (result == null) result = caseVisualizationDescriptor(svgFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseShapeDescriptor(link);
				if (result == null) result = caseLayoutContentDescriptor(link);
				if (result == null) result = caseVisualizationDescriptor(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.FREEHAND_SHAPE: {
				FreehandShape freehandShape = (FreehandShape)theEObject;
				T result = caseFreehandShape(freehandShape);
				if (result == null) result = caseShapeDescriptor(freehandShape);
				if (result == null) result = caseLayoutContentDescriptor(freehandShape);
				if (result == null) result = caseVisualizationDescriptor(freehandShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.INFORMATION_DISPLAY_DESCRIPTOR: {
				InformationDisplayDescriptor informationDisplayDescriptor = (InformationDisplayDescriptor)theEObject;
				T result = caseInformationDisplayDescriptor(informationDisplayDescriptor);
				if (result == null) result = caseLayoutContentDescriptor(informationDisplayDescriptor);
				if (result == null) result = caseVisualizationDescriptor(informationDisplayDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.LABEL_DESCRIPTOR: {
				LabelDescriptor labelDescriptor = (LabelDescriptor)theEObject;
				T result = caseLabelDescriptor(labelDescriptor);
				if (result == null) result = caseInformationDisplayDescriptor(labelDescriptor);
				if (result == null) result = caseLayoutContentDescriptor(labelDescriptor);
				if (result == null) result = caseVisualizationDescriptor(labelDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.MAPPING_LABEL: {
				MappingLabel mappingLabel = (MappingLabel)theEObject;
				T result = caseMappingLabel(mappingLabel);
				if (result == null) result = caseLabelDescriptor(mappingLabel);
				if (result == null) result = caseInformationDisplayDescriptor(mappingLabel);
				if (result == null) result = caseLayoutContentDescriptor(mappingLabel);
				if (result == null) result = caseVisualizationDescriptor(mappingLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.EXPRESSION_LABEL: {
				ExpressionLabel expressionLabel = (ExpressionLabel)theEObject;
				T result = caseExpressionLabel(expressionLabel);
				if (result == null) result = caseLabelDescriptor(expressionLabel);
				if (result == null) result = caseInformationDisplayDescriptor(expressionLabel);
				if (result == null) result = caseLayoutContentDescriptor(expressionLabel);
				if (result == null) result = caseVisualizationDescriptor(expressionLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.FONT_DESCRIPTOR: {
				FontDescriptor fontDescriptor = (FontDescriptor)theEObject;
				T result = caseFontDescriptor(fontDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.SPACING_DESCRIPTOR: {
				SpacingDescriptor spacingDescriptor = (SpacingDescriptor)theEObject;
				T result = caseSpacingDescriptor(spacingDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.LAYOUT_INFORMATION_DESCRIPTOR: {
				LayoutInformationDescriptor layoutInformationDescriptor = (LayoutInformationDescriptor)theEObject;
				T result = caseLayoutInformationDescriptor(layoutInformationDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.ABSOLUTE_LAYOUT_INFORMATION: {
				AbsoluteLayoutInformation absoluteLayoutInformation = (AbsoluteLayoutInformation)theEObject;
				T result = caseAbsoluteLayoutInformation(absoluteLayoutInformation);
				if (result == null) result = caseLayoutInformationDescriptor(absoluteLayoutInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.TABLE_LAYOUT_INFORMATION: {
				TableLayoutInformation tableLayoutInformation = (TableLayoutInformation)theEObject;
				T result = caseTableLayoutInformation(tableLayoutInformation);
				if (result == null) result = caseLayoutInformationDescriptor(tableLayoutInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.BORDER_LAYOUT_INFORMATION_DESCRIPTOR: {
				BorderLayoutInformationDescriptor borderLayoutInformationDescriptor = (BorderLayoutInformationDescriptor)theEObject;
				T result = caseBorderLayoutInformationDescriptor(borderLayoutInformationDescriptor);
				if (result == null) result = caseLayoutInformationDescriptor(borderLayoutInformationDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.LINK_DECORATION: {
				LinkDecoration linkDecoration = (LinkDecoration)theEObject;
				T result = caseLinkDecoration(linkDecoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.DEFAULT_LINK_DECORATION: {
				DefaultLinkDecoration defaultLinkDecoration = (DefaultLinkDecoration)theEObject;
				T result = caseDefaultLinkDecoration(defaultLinkDecoration);
				if (result == null) result = caseLinkDecoration(defaultLinkDecoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisualizationPackage.CUSTOM_LINK_DECORATION: {
				CustomLinkDecoration customLinkDecoration = (CustomLinkDecoration)theEObject;
				T result = caseCustomLinkDecoration(customLinkDecoration);
				if (result == null) result = caseLinkDecoration(customLinkDecoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizationDescriptor(VisualizationDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutDescriptor(LayoutDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowLayout(FlowLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteLayout(AbsoluteLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableLayout(TableLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Content Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Content Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutContentDescriptor(LayoutContentDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeDescriptor(ShapeDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircle(Circle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangle(Rectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundedRectangle(RoundedRectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SVG Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SVG Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSVGFigure(SVGFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freehand Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freehand Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreehandShape(FreehandShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Display Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Display Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationDisplayDescriptor(InformationDisplayDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelDescriptor(LabelDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingLabel(MappingLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionLabel(ExpressionLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontDescriptor(FontDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacing Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacing Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpacingDescriptor(SpacingDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Information Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Information Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutInformationDescriptor(LayoutInformationDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Layout Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Layout Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteLayoutInformation(AbsoluteLayoutInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Layout Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Layout Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableLayoutInformation(TableLayoutInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Layout Information Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Layout Information Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderLayoutInformationDescriptor(BorderLayoutInformationDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Decoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkDecoration(LinkDecoration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Link Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Link Decoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultLinkDecoration(DefaultLinkDecoration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Link Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Link Decoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomLinkDecoration(CustomLinkDecoration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VisualizationSwitch
