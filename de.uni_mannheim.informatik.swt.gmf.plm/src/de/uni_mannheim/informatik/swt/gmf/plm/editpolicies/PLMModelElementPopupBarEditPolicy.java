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
package de.uni_mannheim.informatik.swt.gmf.plm.editpolicies;


import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.PopupBarEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import de.uni_mannheim.informatik.swt.gmf.Activator;
import de.uni_mannheim.informatik.swt.gmf.plm.popupbartools.InterceptPopupBarTool;
import de.uni_mannheim.informatik.swt.gmf.plm.popupbartools.SepetatorPopupBarTool;
import de.uni_mannheim.informatik.swt.gmf.plm.popupbartools.TogglePopupBarTool;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;

public class PLMModelElementPopupBarEditPolicy extends PopupBarEditPolicy {

	@Override
	protected void fillPopupBarDescriptors() {
		super.fillPopupBarDescriptors();

		AbstractPopupBarTool expandCollapseTool = null;

		ImageDescriptor imageDescriptor = null;
		Image image = null;
		
		/***********************************************************
		 * Intercept button
		 ***********************************************************/
		if (((IGraphicalEditPart)getHost()).resolveSemanticElement() instanceof Clabject){
			expandCollapseTool =
					new InterceptPopupBarTool(getHost(), null);
	
			imageDescriptor = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/intercept16.gif");
			image = imageDescriptor.createImage();
			
			addPopupBarDescriptor(null, image, expandCollapseTool, "Intercept");
		}
		/***********************************************************
		 * Expand/Collapse button
		 ***********************************************************/
		expandCollapseTool =
				new TogglePopupBarTool(getHost(), null);

		imageDescriptor = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/toggle16.gif");
		image = imageDescriptor.createImage();
		
		addPopupBarDescriptor(null, image, expandCollapseTool, "Expand / Collapse");
		
		/***********************************************************
		 * Seperator
		 ***********************************************************/
		AbstractPopupBarTool seperatorTool =
				new SepetatorPopupBarTool(getHost(), null);
		
		imageDescriptor = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/seperator16.gif");
		image = imageDescriptor.createImage();
		
		addPopupBarDescriptor(null, image, seperatorTool, "Seperator");
	}
}
