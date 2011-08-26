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
package de.uni_mannheim.informatik.swt.plm.refactoring.service;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IRefactoringService;


public class Refactorer implements IRefactoringService {

	//Commands for Clabjects
	private static String DELETE_CLABJECT_COMMAND_ID = "de.uni_mannheim.informatik.swt.plm.refactoring.service.commands.deleteclabjectcommand";
	
	
	//Commands for Features
	private static String DELETE_FEATURE_COMMAND_ID = "de.uni_mannheim.informatik.swt.plm.refactoring.service.commands.deletefeaturecommand";
	
	@Override
	public boolean changeValue(EObject modelElement,
			EStructuralFeature feature, Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(EObject modelElement) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, String> getAvailableRefactoringCommands(EObject modelElement) {
		Map<String, String> commands = new HashMap<String, String>();
		
		if (modelElement instanceof Clabject)
			commands.put(DELETE_CLABJECT_COMMAND_ID, getCommandName(DELETE_CLABJECT_COMMAND_ID));
		else if (modelElement instanceof Feature)
			commands.put(DELETE_FEATURE_COMMAND_ID, getCommandName(DELETE_FEATURE_COMMAND_ID));
		
		return commands;
	}
	
	private String getCommandName(String id){
		
		//Initialize the visualization service
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getExtension("de.uni_mannheim.informatik.swt.plm.refactoring.service.commands").getConfigurationElements();
		
			for (IConfigurationElement ce : configurationElements)
				if (ce.getAttribute("id").equalsIgnoreCase(id))
					return (String)ce.getAttribute("name");
			
		return null;
	}

}
