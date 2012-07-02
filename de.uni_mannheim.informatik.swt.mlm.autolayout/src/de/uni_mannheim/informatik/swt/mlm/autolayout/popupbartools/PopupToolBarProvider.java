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
package de.uni_mannheim.informatik.swt.mlm.autolayout.popupbartools;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import de.uni_mannheim.informatik.swt.mlm.autolayout.Activator;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IPopupToolBarProvider;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.LogicalElement;

public class PopupToolBarProvider implements IPopupToolBarProvider {

	/**
	 * 
	 */
	public PopupToolBarProvider() {
	}

	@Override
	public List<IPopupToolBarToolWrapper> getPopUpToolbarButtonsForDiagramElement(Object host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart)host;
		
		List<IPopupToolBarToolWrapper> result = new ArrayList<IPopupToolBarToolWrapper>();
		AbstractPopupBarTool tool = null;
		ImageDescriptor imageDescriptor = null;
		Image image = null;
		
		if(editPart.resolveSemanticElement() instanceof Connection
				|| editPart.resolveSemanticElement() instanceof LogicalElement){
			//*********************************
			// * Add reasoning option
			// ********************************
			tool = new AutoLayoutPopupBarTool(editPart, null);
	
			imageDescriptor = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/auto_layout16.gif");
			image = imageDescriptor.createImage();
			
			result.add(new PopupToolBarToolWrapper(image, tool, "Execute Autolayout"));
		}
		
		return result;
	}
	
	private class PopupToolBarToolWrapper implements IPopupToolBarToolWrapper{

		private Object image = null;
		private Object tool = null;
		private String text;
		
		public PopupToolBarToolWrapper(Object image, Object tool, String text){
			this.image = image;
			this.tool = tool;
			this.text = text;
		}
		
		@Override
		public void setImage(Object image) {
			this.image = image;
		}

		@Override
		public Object getImage() {
			return image;
		}

		@Override
		public void setTool(Object tool) {
			this.tool = tool;
		}

		@Override
		public Object getTool() {
			return tool;
		}

		@Override
		public void setText(String text) {
			this.text = text;
		}

		@Override
		public String getText() {
			return text;
		}
		
	}

}
