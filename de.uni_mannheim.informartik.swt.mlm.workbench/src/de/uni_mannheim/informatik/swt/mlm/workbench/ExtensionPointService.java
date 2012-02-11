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
package de.uni_mannheim.informatik.swt.mlm.workbench;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;

import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IDSLService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IProximityIndicationService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IRefactoringService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IGraphicalVisualizationService;
import de.uni_mannheim.informatik.swt.mlm.workbench.preferences.PreferenceConstants;

/**
 * This class manages loading extension points. Call Instance() to 
 * get an instance of this class.
 *
 */
public class ExtensionPointService {
	
	private static String VISUALIZATION_SERVICE_ID = "de.uni_mannheim.informatik.swt.visualization.service";
	private static String REASONING_SERVICE_ID = "de.uni_mannheim.informatik.swt.reasoning.service";
	private static String REFACTORING_SERVICE_ID = "de.uni_mannheim.informatik.swt.refactoring.service";
	private static String PROXIMITY_INDICATION_SERVICE_ID = "de.uni_mannheim.informatik.swt.proximityindication.service";
	private static String DSL_SERVICE_ID = "de.uni_mannheim.informatik.swt.dsl.service";
	
	private static ExtensionPointService instance = null;
	
	/**
	 * Cache for Visualization IConfigurationElements
	 */
	private static Map<String, IConfigurationElement> id2VisualizationServiceConfigurationElement;
	public Map<String, IConfigurationElement> getId2VisualizationServiceConfigurationElement() {
		return id2VisualizationServiceConfigurationElement;
	}
	/**
	 * Cache for Visualization Instances
	 */
	private static Map<String, IGraphicalVisualizationService> id2VisualizationServiceInstance;

	
	
	/**
	 * Cache for Reasoning IConfigurationElements
	 */
	private static Map<String, IConfigurationElement> id2ReasoningServiceConfigurationElement;
	public Map<String, IConfigurationElement> getId2ReasoningServiceConfigurationElement() {
		return id2ReasoningServiceConfigurationElement;
	}
	/**
	 * Cache for Reasoning Instances
	 */
	private static Map<String, IReasoningService> id2ReasoningServiceInstance;
	
	
	
	/**
	 * Cache for Refactoring IConfigurationElements
	 */
	private static Map<String, IConfigurationElement> id2RefactoringServiceConfigurationElement;
	public Map<String, IConfigurationElement> getId2RefactoringServiceConfigurationElement() {
		return id2RefactoringServiceConfigurationElement;
	}
	/**
	 * Cache for Refactoring Instances
	 */
	private static Map<String, IRefactoringService> id2RefactoringServiceInstance;
	
	
	
	/**
	 * Cache for Proximity Indication IConfigurationElements
	 */
	private static Map<String, IConfigurationElement> id2ProximityIndicationServiceConfigurationElement;
	public Map<String, IConfigurationElement> getId2ProximityIndicationServiceConfigurationElement() {
		return id2ProximityIndicationServiceConfigurationElement;
	}
	/**
	 * Cache for Proximity Indication Instances
	 */
	private static Map<String, IProximityIndicationService> id2ProximityIndicationServiceInstance;
	
	
	
	/**
	 * Cache for DSL IConfigurationElements
	 */
	private static Map<String, IConfigurationElement> id2DSLServiceConfigurationElement;
	public Map<String, IConfigurationElement> getId2DSLServiceConfigurationElement() {
		return id2DSLServiceConfigurationElement;
	}
	/**
	 * Cache for DSL Instances
	 */
	private static Map<String, IDSLService> id2DSLServiceInstance;
	
	private ExtensionPointService(){
		
	}
	
	public static ExtensionPointService Instance()
	{
		
		if (instance == null){
			instance = new ExtensionPointService();
			instance.initialize();
		}
		
		return instance;
	}
	
	/**
	 * Initializes all IConfigurationElement caches.
	 */
	private void initialize(){
		
		//Initialize caches
		id2VisualizationServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2VisualizationServiceInstance = new HashMap<String, IGraphicalVisualizationService>();
		
		id2ReasoningServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2ReasoningServiceInstance = new HashMap<String, IReasoningService>();
		
		id2RefactoringServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2RefactoringServiceInstance = new HashMap<String, IRefactoringService>();
		
		id2ProximityIndicationServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2ProximityIndicationServiceInstance = new HashMap<String, IProximityIndicationService>();
		
		id2DSLServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2DSLServiceInstance = new HashMap<String, IDSLService>();
		
		//Initialize the visualization service
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(VISUALIZATION_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2VisualizationServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
				
		//Initialize the reasoning service
		configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(REASONING_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2ReasoningServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
		
		//Initialize the refactoring service
		configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(REFACTORING_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2RefactoringServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
		
		//Initialize the proximity indication service
		configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(PROXIMITY_INDICATION_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2ProximityIndicationServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
		
		//Initialize the proximity indication service
		configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(DSL_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2DSLServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
	}
	
	/**
	 * Returns an instance of the Visualization Service. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 * 
	 * @param id ID of the registered extension point
	 * 
	 * @return A cached instance of the visualization service
	 * 
	 * @throws CoreException
	 */
	public IGraphicalVisualizationService getVisualizationService(String id) throws CoreException{
		IGraphicalVisualizationService transformator = id2VisualizationServiceInstance.get(id);
		
		if (transformator == null)
		{
			transformator = (IGraphicalVisualizationService)id2VisualizationServiceConfigurationElement.get(id).createExecutableExtension("class");
			id2VisualizationServiceInstance.put(id, transformator);
		}
		
		return transformator;
	}
	
	/**
	 * Returns the active instance of the Visualization Service. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 *
	 * 
	 * @return A cached instance of the visualization service
	 * 
	 * @throws CoreException
	 */
	public IGraphicalVisualizationService getActiveVisualizationService() throws CoreException{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		return getVisualizationService(store.getString(PreferenceConstants.P_ACTIVE_VISUALIZATION_ENGINE));
	}
	
	/**
	 * Returns an instance of the Reasoning Service. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 * 
	 * @param id ID of the registered extension point
	 * 
	 * @return A cached instance of the reasoning service
	 * 
	 * @throws CoreException
	 */
	public IReasoningService getReasoningService(String id) throws CoreException{
		IReasoningService reasoner = id2ReasoningServiceInstance.get(id);
		
		if (reasoner == null)
		{
			reasoner = (IReasoningService)id2ReasoningServiceConfigurationElement.get(id).createExecutableExtension("class");
			id2ReasoningServiceInstance.put(id, reasoner);
		}
		
		return reasoner;
	}
	
	/**
	 * Returns the active Reasoning Service. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 * 
	 * 
	 * @return A cached instance of the reasoning service
	 * 
	 * @throws CoreException
	 */
	public IReasoningService getActiveReasoningService() throws CoreException{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		return getReasoningService(store.getString(PreferenceConstants.P_ACTIVE_REASONING_ENGINE)).Instance();
	}
	
	/**
	 * Returns an instance of the Refactoring Service. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 * 
	 * @param id ID of the registered extension point
	 * 
	 * @return A cached instance of the reasoning service
	 * 
	 * @throws CoreException
	 */
	public IRefactoringService getRefactoringService(String id) throws CoreException{
		IRefactoringService refactorer = id2RefactoringServiceInstance.get(id);
		
		if (refactorer == null)
		{
			refactorer = (IRefactoringService)id2RefactoringServiceConfigurationElement.get(id).createExecutableExtension("class");
			id2RefactoringServiceInstance.put(id, refactorer);
		}
		
		return refactorer;
	}
	
	/**
	 * Returns the active Refactoring Service. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 * 
	 * @param id ID of the registered extension point
	 * 
	 * @return A cached instance of the reasoning service
	 * 
	 * @throws CoreException
	 */
	public IRefactoringService getActiveRefactoringService() throws CoreException{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		return getRefactoringService(store.getString(PreferenceConstants.P_ACTIVE_REFACTORING_ENGINE));
	}
	
	/**
	 * Returns an instance of the Proximity Indicarion Service. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 * 
	 * @param id ID of the registered extension point
	 * 
	 * @return A cached instance of the reasoning service
	 * 
	 * @throws CoreException
	 */
	public IProximityIndicationService getProximityIndicationService(String id) throws CoreException{
		IProximityIndicationService proximityIndicator = id2ProximityIndicationServiceInstance.get(id);
		
		if (proximityIndicator == null)
		{
			proximityIndicator = (IProximityIndicationService)id2ProximityIndicationServiceConfigurationElement.get(id).createExecutableExtension("class");
			id2ProximityIndicationServiceInstance.put(id, proximityIndicator);
		}
		
		return proximityIndicator;
	}
	
	/**
	 * Returns the active Proximity Indication Service. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 * 
	 * @param id ID of the registered extension point
	 * 
	 * @return A cached instance of the reasoning service
	 * 
	 * @throws CoreException
	 */
	public IProximityIndicationService getActiveProximityIndicationService() throws CoreException{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		return getProximityIndicationService(store.getString(PreferenceConstants.P_ACTIVE_PROXIMITY_INDICATION_ENGINE));
	}
	
	/**
	 * Returns an instance of the Proximity Indicarion Service. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 * 
	 * @param id ID of the registered extension point
	 * 
	 * @return A cached instance of the reasoning service
	 * 
	 * @throws CoreException
	 */
	public IDSLService getDSLService(String id) throws CoreException{
		IDSLService dslService = id2DSLServiceInstance.get(id);
		
		if (dslService == null)
		{
			dslService = (IDSLService)id2DSLServiceConfigurationElement.get(id).createExecutableExtension("class");
			id2DSLServiceInstance.put(id, dslService);
		}
		
		return dslService;
	}
	
	/**
	 * Returns the active Proximity Indication Service. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 * 
	 * @param id ID of the registered extension point
	 * 
	 * @return A cached instance of the reasoning service
	 * 
	 * @throws CoreException
	 */
	public IDSLService getActiveDSLService() throws CoreException{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		return getDSLService(store.getString(PreferenceConstants.P_ACTIVE_DSL_ENGINE));
	}
}