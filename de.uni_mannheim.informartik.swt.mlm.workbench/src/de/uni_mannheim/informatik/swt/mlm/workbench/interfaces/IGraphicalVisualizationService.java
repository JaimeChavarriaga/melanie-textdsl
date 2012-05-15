/*******************************************************************************
 * Copyright (c) 2011, 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/ 
package de.uni_mannheim.informatik.swt.mlm.workbench.interfaces;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.visualization.ColorConstant;
import de.uni_mannheim.informatik.swt.models.plm.visualization.DSLVisualizer;

/**
 * Interface for a visual model to figure transformator.
 * The transformator takes a visualizer as input and generates
 * a renderable figure as output (e.g. a draw2d figure).
 *
 */
public interface IGraphicalVisualizationService {
	
	/**
	 * Runs the transformation
	 * 
	 * @param v visualizer to translate into a figure
	 * @param c the clabject meta-model element which is visualized
	 * 
	 * @return renderable figure (org.eclipse.draw2d.IFigure)
	 */
	public Object run(DSLVisualizer v, Clabject c);
	
	/**
	 * Translates a color constant into a SWT Color
	 * 
	 * @param constant constant to translate
	 * @return SWT Color (org.eclipse.swt.graphics.Color)
	 */
	public Object colorConstant2Color(ColorConstant constant);
	
	/**
	 * <p>Looks up the DSLVisualizer for an Element by the following rules:</p>
	 * 
	 * <ol> 
	 * 		<li>Check the supertypes for a visualizer and take the closest
	 * 		with lowest potency.</li>
	 * 		<li>Check the types for a visualizer and take the closest
	 * 		with lowest potency.</li>
	 * 		<li>Return the default LMLVisualization (null)</li>
	 * </ol>
	 * 
	 * @param e The element to search the DSLVisualizer for.
	 * @return A DSLVisualizer or  null if none is found.
	 */
	public DSLVisualizer findDSLVisualizerForElement(Element e);
}
