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
package de.uni_mannheim.informatik.swt.gmf.borders;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;

/**
 * 
 * Positions a figure at the centered south. If an other position than
 * south is chosen it behaves like the standard BorderItemLocator 
 *
 */
public class CenteredBorderItemLocator extends BorderItemLocator {

	public CenteredBorderItemLocator(IFigure mainFigure, int preferredSide) {
		super(mainFigure, preferredSide);
	}

	/**
	 * If position is set to south calculate the center
	 */
	protected Point getPreferredLocation(int side, IFigure borderItem) {
		if (side == PositionConstants.SOUTH) {
			
			Rectangle bounds = getParentBorder();
			int parentFigureWidth = bounds.width;
			
			int x = -(getSize(borderItem).width / 2) + (parentFigureWidth / 2);
			int y = 0;
			
			setBorderItemOffset(new Dimension(x, y));
			
			return super.getPreferredLocation(side, borderItem);
		} else {
			return super.getPreferredLocation(side, borderItem);
		}
	}

}
