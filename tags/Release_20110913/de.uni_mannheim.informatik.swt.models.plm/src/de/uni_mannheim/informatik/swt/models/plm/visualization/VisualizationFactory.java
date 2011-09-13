/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.visualization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationPackage
 * @generated
 */
public interface VisualizationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualizationFactory eINSTANCE = de.uni_mannheim.informatik.swt.models.plm.visualization.impl.VisualizationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Flow Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Layout</em>'.
	 * @generated
	 */
	FlowLayout createFlowLayout();

	/**
	 * Returns a new object of class '<em>Absolute Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Layout</em>'.
	 * @generated
	 */
	AbsoluteLayout createAbsoluteLayout();

	/**
	 * Returns a new object of class '<em>Table Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Layout</em>'.
	 * @generated
	 */
	TableLayout createTableLayout();

	/**
	 * Returns a new object of class '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circle</em>'.
	 * @generated
	 */
	Circle createCircle();

	/**
	 * Returns a new object of class '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangle</em>'.
	 * @generated
	 */
	Rectangle createRectangle();

	/**
	 * Returns a new object of class '<em>Rounded Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rounded Rectangle</em>'.
	 * @generated
	 */
	RoundedRectangle createRoundedRectangle();

	/**
	 * Returns a new object of class '<em>SVG Figure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SVG Figure</em>'.
	 * @generated
	 */
	SVGFigure createSVGFigure();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Freehand Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Freehand Shape</em>'.
	 * @generated
	 */
	FreehandShape createFreehandShape();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Mapping Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Label</em>'.
	 * @generated
	 */
	MappingLabel createMappingLabel();

	/**
	 * Returns a new object of class '<em>Expression Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Label</em>'.
	 * @generated
	 */
	ExpressionLabel createExpressionLabel();

	/**
	 * Returns a new object of class '<em>Font Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font Descriptor</em>'.
	 * @generated
	 */
	FontDescriptor createFontDescriptor();

	/**
	 * Returns a new object of class '<em>Spacing Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacing Descriptor</em>'.
	 * @generated
	 */
	SpacingDescriptor createSpacingDescriptor();

	/**
	 * Returns a new object of class '<em>Absolute Layout Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Layout Information</em>'.
	 * @generated
	 */
	AbsoluteLayoutInformation createAbsoluteLayoutInformation();

	/**
	 * Returns a new object of class '<em>Table Layout Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Layout Information</em>'.
	 * @generated
	 */
	TableLayoutInformation createTableLayoutInformation();

	/**
	 * Returns a new object of class '<em>Border Layout Information Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Border Layout Information Descriptor</em>'.
	 * @generated
	 */
	BorderLayoutInformationDescriptor createBorderLayoutInformationDescriptor();

	/**
	 * Returns a new object of class '<em>Default Link Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Link Decoration</em>'.
	 * @generated
	 */
	DefaultLinkDecoration createDefaultLinkDecoration();

	/**
	 * Returns a new object of class '<em>Custom Link Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Link Decoration</em>'.
	 * @generated
	 */
	CustomLinkDecoration createCustomLinkDecoration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VisualizationPackage getVisualizationPackage();

} //VisualizationFactory
