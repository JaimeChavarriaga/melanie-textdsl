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
package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer;
import de.uni_mannheim.informatik.swt.models.plm.visualization.VisualizationDescriptor;

/**
 * Translates a visualizer model excerpt into a figure that
 * can be used with gef and gmf
 *
 */
public class ModelToFigureTransfomator {
	
	private Visualizer visualizer = null;
	
	public ModelToFigureTransfomator(Visualizer v){
		
		if (v == null)
			throw new IllegalArgumentException("Visualizer must not be null!");
		
		visualizer = v;
		
	}
	
	public IFigure getFigure(){
		IFigure fig = null;
		TreeIterator<EObject> iter = visualizer.getChild().eAllContents();		
		
		while (iter.hasNext())
		{
			EObject eObj = iter.next();
			if (eObj instanceof VisualizationDescriptor)
				fig = createFigure((VisualizationDescriptor)eObj);
		}
		
		return fig;
	}
	
	private IFigure createFigure(VisualizationDescriptor desc){
		
		if (desc instanceof de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle)
			return createRectangle((de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle)desc);
		
		return null;
	}
	
	private IFigure createRectangle(de.uni_mannheim.informatik.swt.models.plm.visualization.Rectangle rect){
		Rectangle fig = new Rectangle();
		
		fig.setSize(new Dimension(rect.getWidth(), rect.getHeight()));
		
		return (IFigure)fig;
	}
	
}
