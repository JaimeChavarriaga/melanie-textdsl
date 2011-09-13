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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl;

public class OntologicalPropertySectionAbstractPropertySection extends
	AdvancedPropertySection{

	/***
	 * Stores a clabject's ontological attribute's sorted by the ID in the EMF file
	 */
	private Map<String, Attribute> attributes;
	/***
	 * Stores the descriptors for the distinct property sheet entries
	 */
	private IPropertyDescriptor[] descriptors;
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		
		if (selection.isEmpty()
				|| false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		
		StructuredSelection structuredSelection = ((StructuredSelection) selection);
		
		ArrayList transformedSelection = new ArrayList(structuredSelection.size());
		
		for (Iterator it = structuredSelection.iterator(); it.hasNext();) {
			
			Object model = it.next();
			
			//Get the selected EditPart
			if (model instanceof EditPart) {
				model = ((EditPart) model).getModel();
			}
			
			//Get the view of the Edipart
			EObject r = model instanceof View ? ((View) model).getElement() : null;
			
			//We have an clabject => Attributes might be availables
			if (r != null && r instanceof Clabject) {
				
				attributes = new HashMap<String, Attribute>();
				
				Clabject c = (Clabject)r;
				
				//Go to all Features. If Feature is Attribute -> store it in HashMap
				for (Feature f : c.getFeature())
				{
					if (f instanceof Attribute)
					{
						attributes.put(EMFCoreUtil.getProxyID(f), (Attribute)f);
					}
				}
				
				//Initialize the descriptors with the size of the attributes
				descriptors = new IPropertyDescriptor[attributes.size()];
				
				//Create a descriptor for each attribute
				for (int i = 0; i < descriptors.length; i++)
					descriptors[i] =  new TextPropertyDescriptor(attributes.keySet().toArray()[i], attributes.get(attributes.keySet().toArray()[i]).getName());
				
				//Set the selcetion to the current property source
				transformedSelection.add(new OntologicalPropertySource());
			}
		}
		super.setInput(part, new StructuredSelection(transformedSelection));
	}
	
	class OntologicalPropertySource implements IPropertySource{
		
		@Override
		public Object getEditableValue() {
			return null;
		}

		@Override
		public IPropertyDescriptor[] getPropertyDescriptors() {
			//Return the descriptors which represent the rows in the ProprtyPage
			return descriptors;
		}

		@Override
		public Object getPropertyValue(Object id) {
			//Get attribute out of the HashMap and Display it's values
			if (attributes.get(id) != null)
				return (attributes.get(id).getValue() == null) ? "" : attributes.get(id).getValue();
			return "";
		}

		@Override
		public boolean isPropertySet(Object id) {
			return false;
		}

		@Override
		public void resetPropertyValue(Object id) {
		}

		@Override
		public void setPropertyValue(Object id, Object value) {
			//Write the new value in a transaction
			if (attributes.get(id) != null)
			{
				Attribute attr = attributes.get(id); 
				EditingDomain domain =  TransactionUtil.getEditingDomain(attr);
				SetCommand cmd = new SetCommand(domain, attr, PLMPackageImpl.eINSTANCE.getAttribute_Value(), value);
				domain.getCommandStack().execute(cmd);
			}
		}
	}
}
