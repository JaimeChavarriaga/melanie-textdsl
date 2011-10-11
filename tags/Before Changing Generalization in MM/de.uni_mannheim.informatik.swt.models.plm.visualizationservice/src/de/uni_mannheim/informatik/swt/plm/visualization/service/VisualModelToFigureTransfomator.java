/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/ 
package de.uni_mannheim.informatik.swt.plm.visualization.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.gmf.borders.CenteredBorderItemLocator;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer;
import de.uni_mannheim.informatik.swt.models.plm.visualization.Alignment;
import de.uni_mannheim.informatik.swt.models.plm.visualization.BorderLayoutInformationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant;
import de.uni_mannheim.informatik.swt.models.plm.visualization.ExpressionLabel;
import de.uni_mannheim.informatik.swt.models.plm.visualization.FlowLayout;
import de.uni_mannheim.informatik.swt.models.plm.visualization.FontDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.FontStyle;
import de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutContentDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.LayoutInformationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.Point;
import de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure;
import de.uni_mannheim.informatik.swt.models.plm.visualization.ShapeDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayout;
import de.uni_mannheim.informatik.swt.models.plm.visualization.TableLayoutInformation;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationDescriptor;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IVisualModelToFigureTransformator;

/**
 * <p>Translates a visualizer model excerpt into a figure that
 * can be used with gef and gmf.</p> 
 * 
 * <p>Does not translates links to figures.
 * This need to be done in the editparts because the direct figure of
 * an editpart cannot be exchanged and the getters and setters of link
 * figures are very limited.</p>
 * 
 * <p>Figures containing a border Item need to be completely copied as they contain
 * a DefaultNode Figure. The locator needs to be created newly, because this locator
 * has the wrong figure as main figure.</p>
 *
 */
public class VisualModelToFigureTransfomator implements IVisualModelToFigureTransformator {
	
	private Map<VisualizationDescriptor, IFigure> descriptor2figure = new HashMap<VisualizationDescriptor, IFigure>();
	private Visualizer visualizer = null;
	
	
	@Override
	public IFigure run(Visualizer v){
		
		visualizer = v;
		
		DefaultSizeNodeFigure defaultSizeNodeFigure = new DefaultSizeNodeFigure(40,40);
		//If we have border items we need a BorderNodeFigure as outermost container
		BorderedNodeFigure borderNode = null;
		
		if (v.getChild().size() > 1){
			borderNode = new BorderedNodeFigure(defaultSizeNodeFigure);
		}
		TreeIterator<EObject> iterator = v.eAllContents();
		
		while(iterator.hasNext())
		{
			EObject eObj = iterator.next();
			
			if (! (eObj instanceof LayoutContentDescriptor))
				continue;
			
			IFigure newFigure = createFigure((LayoutContentDescriptor)eObj);
			descriptor2figure.put((VisualizationDescriptor)eObj, newFigure);
			
			IFigure parentFigure;
			if ((parentFigure = descriptor2figure.get(getParentVisualizationDescriptor((LayoutContentDescriptor)eObj)))!= null )
			{
				if (((LayoutContentDescriptor)eObj).getLayoutInformation() != null)
				{
					parentFigure.add(newFigure, createLayoutInformation(((LayoutContentDescriptor)eObj).getLayoutInformation()));
					newFigure.setParent(parentFigure);
				}
				else
				{
					parentFigure.add(newFigure);
					newFigure.setParent(parentFigure);
				}
			}
			else if (v.getChild().indexOf(eObj) == 0)
				defaultSizeNodeFigure.add(newFigure);
			else if (v.getChild().indexOf(eObj) > 0)
				if (((LayoutContentDescriptor)eObj).getLayoutInformation() != null)
					borderNode.getBorderItemContainer().add(newFigure, createLayoutInformation(((LayoutContentDescriptor)eObj).getLayoutInformation()));
				else
					borderNode.getBorderItemContainer().add(newFigure);
		}
	
		return borderNode != null ? borderNode : defaultSizeNodeFigure;
	}

	private ShapeDescriptor getParentVisualizationDescriptor(LayoutContentDescriptor desc){
		return desc.eContainer() instanceof Visualizer ? null : desc.eContainer() instanceof ShapeDescriptor ? (ShapeDescriptor)desc.eContainer() : (ShapeDescriptor)desc.eContainer().eContainer();
	}
	
	/**
	 * Creates figures and labels
	 * 
	 * @param desc
	 * @return
	 */
	private IFigure createFigure(LayoutContentDescriptor desc){
		
		//Figures
		if (desc instanceof de.uni_mannheim.informatik.swt.models.plm.visualization.RoundedRectangle)
			return createRoundedRectangle((de.uni_mannheim.informatik.swt.models.plm.visualization.RoundedRectangle)desc);
		else if (desc instanceof de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle)
			return createRectangle((de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle)desc); 
		else if (desc instanceof de.uni_mannheim.informatik.swt.models.plm.visualization.Circle)
			return createCircle((de.uni_mannheim.informatik.swt.models.plm.visualization.Circle)desc);
		else if (desc instanceof FreehandShape)
			return createFreehandShape((de.uni_mannheim.informatik.swt.models.plm.visualization.FreehandShape)desc);
		else if (desc instanceof SVGFigure)
			return createSVGFigure((de.uni_mannheim.informatik.swt.models.plm.visualization.SVGFigure)desc);
		
		//Labels
		else if (desc instanceof ExpressionLabel)
			return createExpressionLabel((ExpressionLabel)desc);
			
		return null;
	}

	private IFigure createSVGFigure(SVGFigure desc) {
		org.eclipse.gmf.runtime.lite.svg.SVGFigure figure = new org.eclipse.gmf.runtime.lite.svg.SVGFigure();
		
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(desc.getDocumentURI()));
		figure.setURI("file:///" + file.getLocation().toOSString());

		figure.setPreferredSize(desc.getWidth(), desc.getHeight());
		
		if (desc.getLayout() != null)
			figure.setLayoutManager(createLayout(desc.getLayout()));
		
		return figure;
	}

	private IFigure createFreehandShape(FreehandShape desc) {
		ScalablePolygonShape fig = new ScalablePolygonShape();
		
		for (Point p : desc.getPoints())
			fig.addPoint(new org.eclipse.draw2d.geometry.Point(p.getX(), p.getY()));
		
		fig.setOutline(desc.isOutline());
		fig.setFill(desc.isFill());
		fig.setBackgroundColor(colorConstant2Color(desc.getBackgroundColor()));
		fig.setForegroundColor(colorConstant2Color(desc.getForegroundColor()));
		fig.setLineWidth(desc.getOutlineWidth());
		fig.setPreferredSize(desc.getWidth(), desc.getHeight());
		
		if (desc.getLayout() != null)
			fig.setLayoutManager(createLayout(desc.getLayout()));
		
		return fig;
	}

	private IFigure createRectangle(de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle rect){
		RectangleFigure fig = new RectangleFigure();
		fig.setPreferredSize(rect.getWidth(), rect.getHeight());
		fig.setOutline(rect.isOutline());
		fig.setFill(rect.isFill());
		fig.setBackgroundColor(colorConstant2Color(rect.getBackgroundColor()));
		fig.setForegroundColor(colorConstant2Color(rect.getForegroundColor()));
		fig.setLineWidth(rect.getOutlineWidth());
		
		if (rect.getLayout() != null)
			fig.setLayoutManager(createLayout(rect.getLayout()));
		
		return fig;
	}
	
	private IFigure createRoundedRectangle(de.uni_mannheim.informatik.swt.models.plm.visualization.RoundedRectangle rect){
		RoundedRectangle fig = new RoundedRectangle();
		fig.setPreferredSize(rect.getWidth(), rect.getHeight());
		fig.setOutline(rect.isOutline());
		fig.setFill(rect.isFill());
		fig.setBackgroundColor(colorConstant2Color(rect.getBackgroundColor()));
		fig.setForegroundColor(colorConstant2Color(rect.getForegroundColor()));
		fig.setCornerDimensions(new Dimension(rect.getRadius(), rect.getRadius()));
		fig.setLineWidth(rect.getOutlineWidth());
		
		if (rect.getLayout() != null)
			fig.setLayoutManager(createLayout(rect.getLayout()));
		
		return fig;
	}
	
	private IFigure createCircle(de.uni_mannheim.informatik.swt.models.plm.visualization.Circle circle){
		Ellipse fig = new Ellipse();
		
		fig.setPreferredSize(circle.getRadius(), circle.getRadius());
		fig.setOutline(circle.isOutline());
		fig.setFill(circle.isFill());
		fig.setBackgroundColor(colorConstant2Color(circle.getBackgroundColor()));
		fig.setForegroundColor(colorConstant2Color(circle.getForegroundColor()));
		fig.setLineWidth(circle.getOutlineWidth());
		
		if (circle.getLayout() != null)
			fig.setLayoutManager(createLayout(circle.getLayout()));
		
		return fig;
	}
	
	/**
	 * To get this working we need an OCL Factory that supports the OCA
	 * @param desc
	 * @return
	 */
	private IFigure createExpressionLabel(ExpressionLabel desc) {
		WrappingLabel label = new WrappingLabel();
		
		label.setBackgroundColor(colorConstant2Color(desc.getBackgroundColor()));
		label.setForegroundColor(colorConstant2Color(desc.getForegroundColor()));
		
		if (desc.getFont() != null)
		{
			FontDescriptor fontDesc = desc.getFont();
			org.eclipse.jface.resource.FontDescriptor fd = org.eclipse.jface.resource.FontDescriptor.createFrom(fontDesc.getFontName(), fontDesc.getSize(), 
					fontDesc.getFontStyle() == FontStyle.NORMAL? SWT.NORMAL : 
						fontDesc.getFontStyle() == FontStyle.ITALICS ? SWT.ITALIC : SWT.BOLD);
			label.setFont(JFaceResources.getResources(PlatformUI.getWorkbench().getDisplay()).createFont(fd));
		}
		//Execute the OCL expression to get the value
		de.uni_mannheim.informatik.swt.models.plm.PLM.Feature[] feature = new de.uni_mannheim.informatik.swt.models.plm.PLM.Feature[] {};

		org.eclipse.ocl.ecore.OCL ocl = org.eclipse.ocl.ecore.OCL
				.newInstance();
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
				.createOCLHelper();
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.ENTITY);

		try {
			OCLExpression<EClassifier> q = helper.createQuery("self.feature->select(f | f.oclIsKindOf(Attribute))->select(f | f.name = '"+desc.getExpression()+"')");
			feature = ((HashSet<de.uni_mannheim.informatik.swt.models.plm.PLM.Feature>) ocl
					.evaluate(visualizer.eContainer(),q))
					.toArray(new de.uni_mannheim.informatik.swt.models.plm.PLM.Feature[] {});
		} catch (ParserException e) {
			e.printStackTrace();
		}
		
		if (feature.length > 0)
			label.setText(((Attribute)feature[0]).getValue());
		
		return label;
	}
	
	private AbstractLayout createLayout(LayoutDescriptor desc)
	{
		if (desc instanceof FlowLayout)
			return createFlowLayout((FlowLayout)desc);
		else if (desc instanceof TableLayout)
			return createTableLayout((TableLayout)desc);
		
		return null;
	}

	private GridLayout createTableLayout(TableLayout desc) {
		GridLayout layout = new GridLayout();
		
		return layout;
	}

	private org.eclipse.draw2d.FlowLayout createFlowLayout(FlowLayout desc) {
		org.eclipse.draw2d.FlowLayout layout = new org.eclipse.draw2d.FlowLayout();
		
		return layout;
	}
	
	private Object createLayoutInformation(
			LayoutInformationDescriptor layoutInformation) {
		
		if (layoutInformation instanceof TableLayoutInformation)
			return createTableLayoutInformation((TableLayoutInformation) layoutInformation);
		if (layoutInformation instanceof BorderLayoutInformationDescriptor)
			return createBorderLayoutInformation((BorderLayoutInformationDescriptor) layoutInformation);
		
		return null;
	}

	private Object createBorderLayoutInformation(
			BorderLayoutInformationDescriptor layoutInformation) {
		
		CenteredBorderItemLocator locator = null;
		
		//We need to find out at which side the item shall be place
		if (layoutInformation.getVerticalAlignment() == Alignment.BEGIN
				&& layoutInformation.getHorizontalAlignment() == Alignment.BEGIN)
			locator = new de.uni_mannheim.informatik.swt.gmf.borders.CenteredBorderItemLocator(
					 descriptor2figure.get(layoutInformation.eContainer()), PositionConstants.NORTH_WEST);
		else if (layoutInformation.getVerticalAlignment() == Alignment.BEGIN
					&& layoutInformation.getHorizontalAlignment() == Alignment.CENTER)
			locator = new de.uni_mannheim.informatik.swt.gmf.borders.CenteredBorderItemLocator(
					 descriptor2figure.get(layoutInformation.eContainer()), PositionConstants.NORTH);
		else if (layoutInformation.getVerticalAlignment() == Alignment.BEGIN
				&& layoutInformation.getHorizontalAlignment() == Alignment.END)
			locator = new de.uni_mannheim.informatik.swt.gmf.borders.CenteredBorderItemLocator(
				 descriptor2figure.get(layoutInformation.eContainer()), PositionConstants.NORTH_EAST);
		else if (layoutInformation.getVerticalAlignment() == Alignment.CENTER
				&& layoutInformation.getHorizontalAlignment() == Alignment.BEGIN)
			locator = new de.uni_mannheim.informatik.swt.gmf.borders.CenteredBorderItemLocator(
				 descriptor2figure.get(layoutInformation.eContainer()), PositionConstants.WEST);
		else if (layoutInformation.getVerticalAlignment() == Alignment.CENTER
				&& layoutInformation.getHorizontalAlignment() == Alignment.END)
			locator = new de.uni_mannheim.informatik.swt.gmf.borders.CenteredBorderItemLocator(
				 descriptor2figure.get(layoutInformation.eContainer()), PositionConstants.EAST);
		else if (layoutInformation.getVerticalAlignment() == Alignment.END
				&& layoutInformation.getHorizontalAlignment() == Alignment.BEGIN)
			locator = new de.uni_mannheim.informatik.swt.gmf.borders.CenteredBorderItemLocator(
				 descriptor2figure.get(layoutInformation.eContainer()), PositionConstants.SOUTH_WEST);
		else if (layoutInformation.getVerticalAlignment() == Alignment.END
				&& layoutInformation.getHorizontalAlignment() == Alignment.CENTER)
			locator = new de.uni_mannheim.informatik.swt.gmf.borders.CenteredBorderItemLocator(
				 descriptor2figure.get(layoutInformation.eContainer()), PositionConstants.SOUTH);
		else if (layoutInformation.getVerticalAlignment() == Alignment.END
				&& layoutInformation.getHorizontalAlignment() == Alignment.END)
			locator = new de.uni_mannheim.informatik.swt.gmf.borders.CenteredBorderItemLocator(
				 descriptor2figure.get(layoutInformation.eContainer()), PositionConstants.SOUTH_EAST);
		
		if (locator != null)
			locator.setInitialOffset(layoutInformation.getHorizontalOffset(), layoutInformation.getVerticalOffset());
		
		return locator;
	}

	private Object createTableLayoutInformation(
			TableLayoutInformation layoutInformation) {
		
		GridData data = new GridData();
		
		data.horizontalSpan = layoutInformation.getColumnSpan();
		data.verticalSpan = layoutInformation.getRowSpan();
		
		data.grabExcessHorizontalSpace = layoutInformation.isGrabHorizontalExcess();
		data.grabExcessVerticalSpace = layoutInformation.isGrabVerticalExcess();
		
		if (layoutInformation.getVerticalAlignment() == Alignment.BEGIN)
			data.verticalAlignment = SWT.TOP;	
		else if (layoutInformation.getVerticalAlignment() == Alignment.CENTER)
			data.verticalAlignment = SWT.CENTER;
		else if (layoutInformation.getVerticalAlignment() == Alignment.END)
			data.verticalAlignment = SWT.BOTTOM;
		
		if (layoutInformation.getHorizontalAlignment() == Alignment.BEGIN)
			data.horizontalAlignment = SWT.LEFT;
		else if (layoutInformation.getHorizontalAlignment() == Alignment.CENTER)
			data.horizontalAlignment = SWT.CENTER;
		else if (layoutInformation.getHorizontalAlignment() == Alignment.END)
			data.horizontalAlignment = SWT.RIGHT;
		
		return data;
	}
	
	@Override
	public Color colorConstant2Color(ColorConstant constant)
	{
		switch (constant.getValue()) {
		case ColorConstant.BLACK_VALUE:
			return PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_BLACK);
		case ColorConstant.WHITE_VALUE:
			return PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_WHITE);
		case ColorConstant.BLUE_VALUE:
			return PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_BLUE);
		case ColorConstant.RED_VALUE:
			return PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_RED);
		case ColorConstant.GREEN_VALUE:
			return PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_GREEN);
		case ColorConstant.YELLOW_VALUE:
			return PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_YELLOW);
		case ColorConstant.ORANGE_VALUE:
			return PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_MAGENTA);
		default:
			return null;
		}
	}
}