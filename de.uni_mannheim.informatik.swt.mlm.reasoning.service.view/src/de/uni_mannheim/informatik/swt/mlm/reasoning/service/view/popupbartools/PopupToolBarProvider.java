/*******************************************************************************
 * Copyright (c) 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.reasoning.service.view.popupbartools;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.view.Activator;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IPopupToolBarProvider;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;

public class PopupToolBarProvider implements IPopupToolBarProvider {

	private final String GROUP_ID = "reasoning";
	
	/**
	 * 
	 */
	public PopupToolBarProvider(){
	}
	
	@Override
	public List<PopupToolBarToolWrapper> getPopUpToolbarButtonsForDiagramElement(Object host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart)host;
		
		List<PopupToolBarToolWrapper> result = new ArrayList<PopupToolBarToolWrapper>();
		AbstractPopupBarTool tool = null;
		ImageDescriptor imageDescriptor = null;
		Image image = null;
		
		if (editPart.resolveSemanticElement() instanceof Clabject){
			//*********************************
			// * Add reasoning source option
			// ********************************
			tool = new SetReasoningSourcePopupBarTool(editPart, null);
	
			imageDescriptor = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/reasoningSource16.gif");
			image = imageDescriptor.createImage();
			
			result.add(new PopupToolBarToolWrapper(image, tool, "Set as Reasoning Source", GROUP_ID));
			
			//*********************************
			// * Add reasoning target option
			// ********************************
			tool = new SetReasoningTargetPopupBarTool(editPart, null);
	
			imageDescriptor = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/reasoningTarget16.gif");
			image = imageDescriptor.createImage();
			
			result.add(new PopupToolBarToolWrapper(image, tool, "Set as Reasoning Target", GROUP_ID));			
		}
		else if(editPart.resolveSemanticElement() instanceof Model){
			//*********************************
			// * Add reasoning option
			// ********************************
			tool = new SetReasoningPopupBarTool(editPart, null);
	
			imageDescriptor = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/reasoning16.gif");
			image = imageDescriptor.createImage();
			
			result.add(new PopupToolBarToolWrapper(image, tool, "Set as reasoning object", GROUP_ID));
		}
		
		return result;
	}
}