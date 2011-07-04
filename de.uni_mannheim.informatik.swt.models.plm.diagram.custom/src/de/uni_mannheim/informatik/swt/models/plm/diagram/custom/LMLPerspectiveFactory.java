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

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * @author Ralph Gerbig
 *
 * This class defines the standard LML perspective.
 */
public class LMLPerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		
		defineLayout(layout);

	}
	
	private void defineLayout(IPageLayout layout)
	{
		// Editors are placed for free.
        String editorArea = layout.getEditorArea();

        // Place navigator and outline to left of
        // editor area.
        IFolderLayout left =
        	layout.createFolder("left", IPageLayout.LEFT, 0.20f, editorArea);
        left.addView(IPageLayout.ID_PROJECT_EXPLORER);
        
        IFolderLayout bottomLeft =
        	layout.createFolder("leftBottom", IPageLayout.BOTTOM, 0.70f, "left");
        bottomLeft.addView(IPageLayout.ID_OUTLINE);
        
        IFolderLayout bottom = 
        	layout.createFolder("bottom", IPageLayout.BOTTOM, 0.70f, editorArea);
        bottom.addView(IPageLayout.ID_PROP_SHEET);
	}

}
