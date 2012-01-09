/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel, Ralph Gerbig
 *    				 - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.plm.reasoning.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;

import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Role;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.ClassificationConsistencyCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.FeatureConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.GeneralizationConsistencyCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.HasAdditionalPropertiesCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.HyponymCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.InstanceCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.IsExpressedInstanceOfExcludedCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.IsonymCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.LocalConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.ModelConsistentClassificationCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.MultiplicityConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.NeighbourhoodConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.OntologyConsistencyCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.PropertyConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.SubsumptionCommand;

public class ReasoningService implements IReasoningService {
	
	@Override
	public List<ContributionItem> getAvailableReasoningCommands(EObject[] modelElements) {
		List<ContributionItem> items = new LinkedList<ContributionItem>();
		
		Map<String, Object> commandParamametersMap;
		
		//We have two clabjects selected
		if (modelElements.length == 2 
				&& modelElements[0] instanceof Clabject
				&& modelElements[1] instanceof Clabject)
		{
			//***************************************************
			// Local conforms command
			//***************************************************
			CommandContributionItemParameter param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), LocalConformsCommand.ID + ".menuEntry", LocalConformsCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(LocalConformsCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("type",  modelElements[0]);
			commandParamametersMap.put("instance", modelElements[1]);
			commandParamametersMap.put("forceClabject", "false");
		
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
			
			//***************************************************
			// Hyponym command
			//***************************************************
			param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), HyponymCommand.ID + ".menuEntry", HyponymCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(HyponymCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("type",  modelElements[0]);
			commandParamametersMap.put("instance", modelElements[1]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
			
			//***************************************************
			// Instance command
			//***************************************************
			param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), InstanceCommand.ID + ".menuEntry", InstanceCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(InstanceCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("type",  modelElements[0]);
			commandParamametersMap.put("instance", modelElements[1]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
			
			//***************************************************
			// Is expressed instance of excluded command
			//***************************************************
			param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), IsExpressedInstanceOfExcludedCommand.ID + ".menuEntry", IsExpressedInstanceOfExcludedCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(IsExpressedInstanceOfExcludedCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("type",  modelElements[0]);
			commandParamametersMap.put("instance", modelElements[1]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
			
			//***************************************************
			// Isonym command
			//***************************************************
			param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), IsonymCommand.ID + ".menuEntry", IsonymCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(IsonymCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("type",  modelElements[0]);
			commandParamametersMap.put("instance", modelElements[1]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
			
			//***************************************************
			// Neighbourhood conforms command
			//***************************************************
			param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), NeighbourhoodConformsCommand.ID + ".menuEntry", NeighbourhoodConformsCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(NeighbourhoodConformsCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("type",  modelElements[0]);
			commandParamametersMap.put("instance", modelElements[1]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
			
			//***************************************************
			// Property conforms command
			//***************************************************
			param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), PropertyConformsCommand.ID + ".menuEntry", PropertyConformsCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(PropertyConformsCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("type",  modelElements[0]);
			commandParamametersMap.put("instance", modelElements[1]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
			
			//***************************************************
			// Subsumption command
			//***************************************************
			param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), SubsumptionCommand.ID + ".menuEntry", SubsumptionCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(SubsumptionCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("supertype",  modelElements[0]);
			commandParamametersMap.put("subtype", modelElements[1]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
			
		}
		
		//We have a connection selected
		if (modelElements.length == 1 
				&& modelElements[0] instanceof Connection){
			
			//***************************************************
			// Multiplicity conforms command
			//***************************************************
			CommandContributionItemParameter param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), MultiplicityConformsCommand.ID + ".menuEntry", MultiplicityConformsCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(MultiplicityConformsCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("connection",  modelElements[0]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
		}
		
		//We have two features selected
		if (modelElements.length == 2
				&& modelElements[0] instanceof Feature
				&& modelElements[1] instanceof Feature)
		{
			CommandContributionItemParameter param = new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), FeatureConformsCommand.ID + ".menuEntry", FeatureConformsCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(FeatureConformsCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("type",  modelElements[0]);
			commandParamametersMap.put("instance", modelElements[1]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
		}
		
		//We have a classification selected
		if (modelElements.length == 1 
				&& modelElements[0] instanceof Classification){
			
			//***************************************************
			// Classification consistency command
			//***************************************************
			CommandContributionItemParameter param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), ClassificationConsistencyCommand.ID + ".menuEntry", ClassificationConsistencyCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(ClassificationConsistencyCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("classification",  modelElements[0]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
		}
		
		//We have a generalization selected
		if (modelElements.length == 1 
				&& modelElements[0] instanceof Generalization){
		
			//***************************************************
			// Generalization consistency command
			//***************************************************
			CommandContributionItemParameter param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), GeneralizationConsistencyCommand.ID + ".menuEntry", GeneralizationConsistencyCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(GeneralizationConsistencyCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("generalization",  modelElements[0]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
		}

		//We have a model selected
		if (modelElements.length == 1 
				&& modelElements[0] instanceof Model){
		
			//***************************************************
			// Model consistent classification
			//***************************************************
			CommandContributionItemParameter param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), ModelConsistentClassificationCommand.ID + ".menuEntry", ModelConsistentClassificationCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(ModelConsistentClassificationCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("model",  modelElements[0]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
		}
		
		//We have an ontology selected
		if (modelElements.length == 1 
				&& modelElements[0] instanceof Ontology){
		
			//***************************************************
			// Ontology consistency command
			//***************************************************
			CommandContributionItemParameter param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), OntologyConsistencyCommand.ID + ".menuEntry", OntologyConsistencyCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(OntologyConsistencyCommand.ID);
			
			commandParamametersMap = new HashMap<String, Object>();
			
			commandParamametersMap.put("ontology",  modelElements[0]);
			
			param.parameters = commandParamametersMap;
			
			items.add(new CommandContributionItem(param));
		}
		
		return items;
	}
	
	/**
	 * Retrieves the name of the command with id from the extension point
	 * 
	 * @param id id of command to retrieve name from
	 * 
	 * @return name of command if one is registered with this id null else
	 */
	private String getCommandName(String id){
		
		//Initialize the visualization service
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getExtension("de.uni_mannheim.informatik.swt.plm.reasoning.service.commands").getConfigurationElements();
		
			for (IConfigurationElement ce : configurationElements)
				if (ce.getAttribute("id").equalsIgnoreCase(id))
					return (String)ce.getAttribute("name");
			
		return null;
	}
	
	private static IReasoningService instance = null;
	private List<IPropertyChangeListener> listeners = new LinkedList<IPropertyChangeListener>(); 
	public ReasoningService() {
		
	}
	
	//TODO: Replace this method by factory
	/**
	 * @deprecated Needs to be replaced with factory method
	 */
	public CompositeCheck createCompositeCheck(String name, Element source, Element target, String expression) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		check.setName(name);
		check.setSource(source);
		check.setTarget(target);
		check.setExpression(expression);
		return check;
	}
	
	
	@Override
	public void addPropertyChangeListener(IPropertyChangeListener listener) {
		if (!listeners.contains(listener))
			listeners.add(listener);
	}

	@Override
	public void removePropertyChangeListener(IPropertyChangeListener listener) {
		listeners.remove(listener);
	}	
	
	/**
	 * This is used to record all reasoning results
	 */
	private List<ReasoningResultModel> reasoningResults = new LinkedList<ReasoningResultModel>(){
		/**
		 * Does additionally notify all listeners.
		 */
		public void addLast(ReasoningResultModel e) {
			super.addLast(e);
			
			//Notify all listeners on addLast
			for (IPropertyChangeListener listener : listeners)
				listener.propertyChange(new PropertyChangeEvent(this, "reasoningResults", new LinkedList<ReasoningResultModel>(this).remove(e), this));
		};
		
		@Override
		public boolean add(ReasoningResultModel e) {
			/**
			 * Does additionally notify all listeners.
			 */
			boolean result = super.add(e);
			
			//Notify all listeners on addLast
			for (IPropertyChangeListener listener : listeners)
				listener.propertyChange(new PropertyChangeEvent(this, "reasoningResults", new LinkedList<ReasoningResultModel>(this).remove(e), this));
			
			return result;
		}
	};
	
	@Override
	public List<ReasoningResultModel> getReasoningHistory() {
		return reasoningResults;
	}


	@Override
	public ReasoningResultModel getLastResult() {
		return ((LinkedList<ReasoningResultModel>)reasoningResults).getLast();
	}
	
	@Override
	public IReasoningService Instance() {
		if (instance == null){
			instance = new ReasoningService();
			return instance;
		}
		return instance;
	}

	@Override
	public boolean run(String commandID, Object[] parameters) {
		return run(commandID, parameters, false);
	}

	@Override
	public boolean run(String commandID, Object[] parameters, boolean silent) {
		
		IHandlerService handlerService = (IHandlerService)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(IHandlerService.class);
		ICommandService commandService = (ICommandService)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(ICommandService.class);
		
		boolean result = false;
		if (this != instance) { 
			throw new RuntimeException("You need to use .Instance() to get the singleton instance of this service");
		}
		if (commandID == ReasoningService.CAN_CONNECTION_EXIST) {
			return canConnectionExist((Connection)parameters[0], (Connection)parameters[1]);
		} else if (commandID == ReasoningService.FEATURE_CONFORMS) {
			Map params = new HashMap();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(FeatureConformsCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (commandID.equals(ReasoningService.LOCAL_CONFORMS)){
			Map params = new HashMap();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			params.put("forceClabject", parameters.length > 2 ? parameters[2].toString() : "false");
			params.put("silent", Boolean.toString(silent));
			Command command = commandService.getCommand(LocalConformsCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else if (commandID == ReasoningService.MULTIPLICITY_CONFORMS) {
			Map params = new HashMap();
			params.put("connection", parameters[0]);
			params.put("silent", Boolean.toString(silent));
			Command command = commandService.getCommand(MultiplicityConformsCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (commandID == ReasoningService.NEIGHBOURHOOD_CONFORMS) {
			Map params = new HashMap();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(NeighbourhoodConformsCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.PROPERTY_CONFORMS) {
			Map params = new HashMap();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(PropertyConformsCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_EXPRESSED_INSTANCE_OF_EXCLUDED) {
			Map params = new HashMap();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(IsExpressedInstanceOfExcludedCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.HAS_ADDITIONAL_PROPERTIES) {
			Map params = new HashMap();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(HasAdditionalPropertiesCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_HYPONYM) {
			Map params = new HashMap();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(HyponymCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_ISONYM) {
			Map params = new HashMap();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(IsonymCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_INSTANCE) {
			Map params = new HashMap();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(InstanceCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.CLASSIFICATION_CONSISTENCY) {
			Map params = new HashMap();
			params.put("element", parameters[0]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(ClassificationConsistencyCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		} else if (commandID == ReasoningService.GENERALIZATION_CONSISTENCY) {
			Map params = new HashMap();
			params.put("element", parameters[0]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(GeneralizationConsistencyCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}  
		} else if (commandID == ReasoningService.ONTOLOGY_CONSISTENCY) {
			Map params = new HashMap();
			params.put("element", parameters[0]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(OntologyConsistencyCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_CONSISTENTLY_CLASSIFIED) {
			Map params = new HashMap();
			params.put("model", parameters[0]);
			params.put("silent", Boolean.toString(silent));
			
			Command command = commandService.getCommand(ModelConsistentClassificationCommand.ID);
			ParameterizedCommand paramCmd = ParameterizedCommand.generateCommand(command, params);
			try {
				result = (Boolean)handlerService.executeCommand(paramCmd, null);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}else {
			System.out.println("Unrecognized (read:implemented) command " + commandID);
		}
		System.out.println("Command Execution finished: " + commandID);
		return result;
	}

	@Override
	public boolean canConnectionExist(Connection source, Clabject target) {
		return false;
	}

	@Override
	public boolean localConstructionConformsConnection(Connection type,
			Connection instance) {
		return run(LOCAL_CONFORMS, new Object[]{type, instance, true}, true);
	}


	@Override
	public boolean neighbourhoodConstructionConformsConnection(Connection type,
			Connection instance) {
		if (!localConstructionConformsConnection(type, instance)) {
			return false;
		}
		for (Role r:instance.getAllRoles()) {
			Clabject destI = instance.getParticipantForRoleName(r.roleName()); 
			Clabject destT = type.getParticipantForRoleName(r.roleName());
			if (!run(LOCAL_CONFORMS, new Object[]{destT, destI}, true)) {
				System.out.println("Wrong roleName " + r.roleName());
				return false;
			}
		}
		return true; 
	}

	@Override
	public Element getElementByXMIID(String id, Element modelElement) {
		TreeIterator<EObject> iter = EcoreUtil.getRootContainer(modelElement).eAllContents();
		while (iter.hasNext()) {
			EObject current = iter.next();
			if (EMFCoreUtil.getProxyID(current).equals(id)) 
				return (Element) current;
		}
		return null;
	}
}
