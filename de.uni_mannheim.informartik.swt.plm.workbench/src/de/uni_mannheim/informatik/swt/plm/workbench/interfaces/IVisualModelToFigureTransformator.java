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
package de.uni_mannheim.informatik.swt.plm.workbench.interfaces;

import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.graphics.Color;

import de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant;
import de.uni_mannheim.informatik.swt.models.plm.visualization.DSLVisualizer;

/**
 * Interface for a visual model to figure transformator.
 * The transformator takes a visualizer as input and generates
 * a renderable figure as output (e.g. a draw2d figure).
 *
 */
public interface IVisualModelToFigureTransformator {
	
	/**
	 * Runs the transformation
	 * 
	 * @param v visualizer to translate into a figure
	 * 
	 * @return renderable figure
	 */
	public IFigure run(DSLVisualizer v);
	
	/**
	 * Translates a color constant into a SWT Color
	 * 
	 * @param constant constant to translate
	 * @return SWT Color
	 */
	public Color colorConstant2Color(ColorConstant constant);
}
