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
package de.uni_mannheim.informatik.swt.gmf.editpolicies;

import java.util.LinkedList;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.PopupBarEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import de.uni_mannheim.informatik.swt.gmf.Activator;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

public class ToggableModelElementPopupBarEditPolicy extends PopupBarEditPolicy {

	@Override
	protected void fillPopupBarDescriptors() {
		super.fillPopupBarDescriptors();
		
		AbstractPopupBarTool theTracker =
				new TogglePopupBarTool(getHost(), null);

		ImageDescriptor imageDescriptor = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/toggle16.gif");
		Image image = imageDescriptor.createImage();
		
		addPopupBarDescriptor(null, image, theTracker, "Toggle");
		
	}
	
	private class TogglePopupBarTool extends AbstractPopupBarTool{

		
		
		public TogglePopupBarTool(EditPart epHost, CreateRequest theRequest) {
			super(epHost, theRequest);
		}

		@Override
		protected Request createTargetRequest() {
			ChangePropertyValueRequest req = new ChangePropertyValueRequest("toggle", "toggle");
			return req;
		}

		@Override
		protected Command getCommand() {
			return new Command() {
				@Override
				public void execute() {
					super.execute();
					
					Element self = (Element)((IGraphicalEditPart)getHost()).resolveSemanticElement();
					
					if (self.getVisualizer() == null)
						return;
					
					LinkedList<String> attributes = new LinkedList<String>();
					
					for (String attr : self.getVisualizer().get(0).getAttributes())
					{
						if (attr.startsWith("collapsed"))
						{
							attributes.remove(attr);
							String value = self.getVisualizer().get(0).getValueForKey("collapsed");
							attr = (value.equals("true")) ? "collapsed= false":"collapsed= true";
							attributes.add(attr);
						}
						else
						{
							attributes.add(attr);
						}
					}
					
					EditingDomain domain = ((IGraphicalEditPart)getHost()).getEditingDomain();
					domain.getCommandStack().execute(SetCommand.create(domain, self.getVisualizer().get(0), PLMPackage.eINSTANCE.getVisualizer_Attributes(), attributes));
				}
			};
		}
		
	}
}
