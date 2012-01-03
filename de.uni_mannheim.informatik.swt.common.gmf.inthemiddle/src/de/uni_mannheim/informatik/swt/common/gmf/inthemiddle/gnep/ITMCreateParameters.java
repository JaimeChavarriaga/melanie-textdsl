/*******************************************************************************
 * Copyright (c) 2012 University of Mannheim: Chair for Software Engineering
 * and others All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.common.gmf.inthemiddle.gnep;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.notation.View;

public interface ITMCreateParameters {

	public View getParentView();

	public Point getRelativeLocation();

	public View getAnchorSibling();

	public boolean isBeforeNotAfterAnchor();
}