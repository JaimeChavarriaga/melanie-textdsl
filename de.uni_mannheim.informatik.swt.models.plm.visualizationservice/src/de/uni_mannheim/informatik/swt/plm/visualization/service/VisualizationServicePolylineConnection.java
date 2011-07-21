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

import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

/**
 * This class is used to transport information from the visualization service
 * to the connection editpart. This class will be replaced. As soon as a 
 * better solution is found
 */
public class VisualizationServicePolylineConnection extends
		PolylineConnectionEx {

	/**
	 * to not interfere with the inherited, protected getTargetDecoration
	 * method.
	 * 
	 * @return
	 */
	public RotatableDecoration getTargetDecorationForThisShape(){
		return this.getTargetDecoration();
	}
}
