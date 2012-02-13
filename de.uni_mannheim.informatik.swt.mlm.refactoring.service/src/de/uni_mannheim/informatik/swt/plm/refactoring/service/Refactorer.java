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

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;

import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IRefactoringService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.plm.refactoring.service.handlers.AddFeatureToClabjectCommand;
import de.uni_mannheim.informatik.swt.plm.refactoring.service.handlers.ChangeFeatureDurabilityCommand;
import de.uni_mannheim.informatik.swt.plm.refactoring.service.handlers.RenameFeatureCommand;


public class Refactorer implements IRefactoringService {
	
	public static String ID = "de.uni_mannheim.informatik.swt.mlm.refactoring.service";
	
	private boolean refactoringOperationIsRunning = false;
	
	@Override
	public List<ContributionItem> getAvailableRefactoringCommands(EObject[] modelElements){
		
		List<ContributionItem> items = new LinkedList<ContributionItem>();
		Map<String, Object> commandParamametersMap;
		
		//We have one feature selected
		if (modelElements.length == 1
				&& modelElements[0] instanceof Feature)
		{
			//***************************************************
			// Delete feature command
			//***************************************************
//			CommandContributionItemParameter param = 
//					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), DeleteFeatureCommand.ID + ".menuEntry", DeleteFeatureCommand.ID, CommandContributionItem.STYLE_PUSH);
//			param.label = getCommandName(DeleteFeatureCommand.ID);
//			
//			commandParamametersMap = new HashMap<String, Object>();
//			commandParamametersMap.put("feature",  modelElements[0]);
//			param.parameters = commandParamametersMap;
//			
//			items.add(new CommandContributionItem(param));
			
			//***************************************************
			// Rename feature command
			//***************************************************
			CommandContributionItemParameter param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), RenameFeatureCommand.ID + ".menuEntry", RenameFeatureCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(RenameFeatureCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			commandParamametersMap.put("feature",  modelElements[0]);
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
			
			//***************************************************
			// Change feature durability command
			//***************************************************
			param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), ChangeFeatureDurabilityCommand.ID + ".menuEntry", ChangeFeatureDurabilityCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(ChangeFeatureDurabilityCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			commandParamametersMap.put("feature",  modelElements[0]);
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
		}
		//We have one feature selected
		if (modelElements.length == 1
				&& modelElements[0] instanceof Clabject)
		{
			//***************************************************
			// Delete clabject command
			//***************************************************
//			CommandContributionItemParameter param = 
//					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), DeleteClabjectCommand.ID + ".menuEntry", DeleteClabjectCommand.ID, CommandContributionItem.STYLE_PUSH);
//			param.label = getCommandName(DeleteClabjectCommand.ID);
//			
//			commandParamametersMap = new HashMap<String, Object>();
//			commandParamametersMap.put("clabject",  modelElements[0]);
//			param.parameters = commandParamametersMap;
//			
//			items.add(new CommandContributionItem(param));
			
			//***************************************************
			// Add feature to clabject command
			//***************************************************
//			param = 
//					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), AddFeatureToClabjectCommand.ID + ".menuEntry", AddFeatureToClabjectCommand.ID, CommandContributionItem.STYLE_PUSH);
//			param.label = getCommandName(AddFeatureToClabjectCommand.ID);
//			
//			commandParamametersMap = new HashMap<String, Object>();
//			commandParamametersMap.put("clabject",  modelElements[0]);
//			param.parameters = commandParamametersMap;
//			
//			items.add(new CommandContributionItem(param));
		}
		
		return items;
	}
	
	private String getCommandName(String id){
		
		//Initialize the visualization service
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getExtension("de.uni_mannheim.informatik.swt.plm.refactoring.service.commands").getConfigurationElements();
		
			for (IConfigurationElement ce : configurationElements)
				if (ce.getAttribute("id").equalsIgnoreCase(id))
					return (String)ce.getAttribute("name");
			
		return null;
	}

	@Override
	public boolean run(String commandID, Object[] parameters) {
		IHandlerService handlerService = (IHandlerService)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(IHandlerService.class);
		ICommandService commandService = (ICommandService)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(ICommandService.class);
		
		boolean result = false;
		if (commandID == IRefactoringService.CHANGE_VALUE) {
			Map params = new HashMap();
			params.put("feature", parameters[0]);
			params.put("oldValue", parameters[1]);
			params.put("newValue", parameters[2]);
			params.put("attributeToChange", parameters[3]);
			
			Command command = commandService.getCommand(RenameFeatureCommand.ID);
			ParameterizedCommand parameterizedCommand = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(parameterizedCommand, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}

	private Set<EObject> refactoredObjects = new HashSet<EObject>();
	
	public boolean checkIfRefactoredAndRemove(EObject obj){
		return refactoredObjects.remove(obj);
	}
	
	@Override
	public void addRefactoredObjects(Collection<? extends EObject> objects){
		refactoredObjects.addAll(objects);
	}
	
	@Override
	public void startListening(EObject modelRoot) {
		modelRoot.eAdapters().add(new EContentAdapter(){
			@Override
			public void notifyChanged(Notification notification) {
				//Handles adding removing this adapter to new elements
				//in the containment hierarchy
				super.notifyChanged(notification);
				
				if (notification.getNotifier() instanceof Element 
						&& !checkIfRefactoredAndRemove((EObject)notification.getNotifier())
					)
				{
					if (notification.getFeature() instanceof EStructuralFeature){
						RenameFeatureCommand c = new RenameFeatureCommand();
						try {
							c.execute((Feature)notification.getNotifier(), notification.getOldStringValue(), notification.getNewStringValue());
						} catch (ExecutionException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
	}

	@Override
	public void stopListening(EObject modelRoot) {
		// TODO Auto-generated method stub
	}
}