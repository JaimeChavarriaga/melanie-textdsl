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

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
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
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.ConsistencyCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.ConsistentClassificationCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.FeatureConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.HasAdditionalPropertiesCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.HyponymCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.InstanceCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.IsExpressedInstanceOfExcludedCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.IsonymCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.LocalConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.MultiplicityConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.NeighbourhoodConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.PropertyConformsCommand;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class ReasoningService implements IReasoningService {
	
	@Override
	public List<ContributionItem> getAvailableReasoningCommands(EObject modelElement) {
		List<ContributionItem> items = new LinkedList<ContributionItem>();
		
		if (modelElement instanceof Clabject)
		{
			CommandContributionItemParameter param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), LocalConformsCommand.ID + ".menuEntry", LocalConformsCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(LocalConformsCommand.ID);
			items.add(new CommandContributionItem(param));
		}
		else if (modelElement instanceof Feature)
		{
			CommandContributionItemParameter param = new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), FeatureConformsCommand.ID + ".menuEntry", FeatureConformsCommand.ID, CommandContributionItem.STYLE_PUSH);
			param.label = getCommandName(FeatureConformsCommand.ID);
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
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getExtension("de.uni_mannheim.informatik.swt.plm.refactoring.service.commands").getConfigurationElements();
		
			for (IConfigurationElement ce : configurationElements)
				if (ce.getAttribute("id").equalsIgnoreCase(id))
					return (String)ce.getAttribute("name");
			
		return null;
	}
	
	private static IReasoningService instance = null;
	private List<IPropertyChangeListener> listeners = new LinkedList<IPropertyChangeListener>(); 
	public ReasoningService() {
		
	}
	
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
		
		boolean result = false;
		if (this != instance) { 
			throw new RuntimeException("Deine Mutter heißt Horst und zieht Lastwagen auf Sport1");
		}
		if (commandID == ReasoningService.CAN_CONNECTION_EXIST) {
			return canConnectionExist((Connection)parameters[0], (Connection)parameters[1]);
		} else if (commandID == ReasoningService.FEATURE_CONFORMS) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			FeatureConformsCommand command = new FeatureConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID.equals(ReasoningService.LOCAL_CONFORMS)){
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			params.put("forceClabject", parameters.length > 2 ? parameters[2] : false);
			LocalConformsCommand command = new LocalConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.MULTIPLICITY_CONFORMS) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("connection", parameters[0]);
			MultiplicityConformsCommand command = new MultiplicityConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}else if (commandID == ReasoningService.NEIGHBOURHOOD_CONFORMS) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			NeighbourhoodConformsCommand command = new NeighbourhoodConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.PROPERTY_CONFORMS) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			PropertyConformsCommand command = new PropertyConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_EXPRESSED_INSTANCE_OF_EXCLUDED) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			IsExpressedInstanceOfExcludedCommand command = new IsExpressedInstanceOfExcludedCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.HAS_ADDITIONAL_PROPERTIES) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			HasAdditionalPropertiesCommand command = new HasAdditionalPropertiesCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_HYPONYM) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			HyponymCommand command = new HyponymCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_ISONYM) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			IsonymCommand command = new IsonymCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_INSTANCE) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			InstanceCommand command = new InstanceCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_CONSISTENT) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("element", parameters[0]);
			ConsistencyCommand command = new ConsistencyCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			} 
		} else if (commandID == ReasoningService.IS_CONSISTENTLY_CLASSIFIED) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("model", parameters[0]);
			ConsistentClassificationCommand command = new ConsistentClassificationCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
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
		return run(LOCAL_CONFORMS, new Object[]{type, instance, true});
	}


	@Override
	public boolean neighbourhoodConstructionConformsConnection(Connection type,
			Connection instance) {
		if (!localConstructionConformsConnection(type, instance)) {
			return false;
		}
		for (String rN: instance.getRoleName()) {
			Clabject destI = instance.getParticipantForRoleName(rN);
			Clabject destT = type.getParticipantForRoleName(rN);
			if (!run(LOCAL_CONFORMS, new Object[]{destT, destI})) {
				System.out.println("Wrong roleName " + rN);
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
