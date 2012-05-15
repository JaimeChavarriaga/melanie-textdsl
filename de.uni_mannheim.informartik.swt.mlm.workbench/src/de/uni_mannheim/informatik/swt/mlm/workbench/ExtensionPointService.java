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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;

import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IDSLService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IEmendationService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IGraphicalVisualizationService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IPopupToolBarProvider;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IProximityIndicationService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.mlm.workbench.preferences.PreferenceConstants;

/**
 * This class manages loading extension points. Call Instance() to 
 * get an instance of this class.
 *
 */
public class ExtensionPointService {
	
	private static String VISUALIZATION_SERVICE_ID = "de.uni_mannheim.informatik.swt.visualization.service";
	private static String REASONING_SERVICE_ID = "de.uni_mannheim.informatik.swt.reasoning.service";
	private static String EMENDATION_SERVICE_ID = "de.uni_mannheim.informatik.swt.emendation.service";
	private static String PROXIMITY_INDICATION_SERVICE_ID = "de.uni_mannheim.informatik.swt.proximityindication.service";
	private static String DSL_SERVICE_ID = "de.uni_mannheim.informatik.swt.dsl.service";
	private static String POPUPBARBUTTON_PROVIDER_ID = "de.uni_mannheim.informatik.swt.popupbarbuttons.provider";
	
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
	private static Map<String, IConfigurationElement> id2EmendationServiceConfigurationElement;
	public Map<String, IConfigurationElement> getId2EmendationServiceConfigurationElement() {
		return id2EmendationServiceConfigurationElement;
	}
	/**
	 * Cache for Refactoring Instances
	 */
	private static Map<String, IEmendationService> id2EmendationServiceInstance;
	
	
	
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
	
	
	/**
	 * Cache for IPopupToolBarProvider IConfigurationElements
	 */
	private static Map<String, IConfigurationElement> id2IPopupToolBarProviderConfigurationElement;
	public Map<String, IConfigurationElement> getPopUpBarButtonProviderConfigurationElement() {
		return id2IPopupToolBarProviderConfigurationElement;
	}
	/**
	 * Cache for IPopupToolBarProvider Instances
	 */
	private static Map<String, IPopupToolBarProvider> id2IPopupToolBarProviderInstance;
	
	
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
		
		id2EmendationServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2EmendationServiceInstance = new HashMap<String, IEmendationService>();
		
		id2ProximityIndicationServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2ProximityIndicationServiceInstance = new HashMap<String, IProximityIndicationService>();
		
		id2DSLServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2DSLServiceInstance = new HashMap<String, IDSLService>();
		
		id2IPopupToolBarProviderConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2IPopupToolBarProviderInstance = new HashMap<String, IPopupToolBarProvider>();
		
		//Initialize the visualization service
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(VISUALIZATION_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2VisualizationServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
				
		//Initialize the reasoning service
		configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(REASONING_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2ReasoningServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
		
		//Initialize the refactoring service
		configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EMENDATION_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2EmendationServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
		
		//Initialize the proximity indication service
		configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(PROXIMITY_INDICATION_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2ProximityIndicationServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
		
		//Initialize the DSL service
		configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(DSL_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2DSLServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
		
		//Initialize the proximity indication service
		configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(POPUPBARBUTTON_PROVIDER_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2IPopupToolBarProviderConfigurationElement.put(cElement.getAttribute("id"), cElement);
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
	public IEmendationService getEmendationService(String id) throws CoreException{
		IEmendationService refactorer = id2EmendationServiceInstance.get(id);
		
		if (refactorer == null)
		{
			refactorer = (IEmendationService)id2EmendationServiceConfigurationElement.get(id).createExecutableExtension("class");
			id2EmendationServiceInstance.put(id, refactorer);
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
	public IEmendationService getActiveEmendationService() throws CoreException{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		return getEmendationService(store.getString(PreferenceConstants.P_ACTIVE_EMENDATION_ENGINE));
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
	 * Returns an instance of the Proximity Indication Service. For performance improvements two caches are used.
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
	
	/**
	 * Returns an instance of the PopupBarButtonProvider. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 * 
	 * @param id ID of the registered extension point
	 * 
	 * @return A cached instance of the reasoning service
	 * 
	 * @throws CoreException
	 */
	public IPopupToolBarProvider getPopUpBarButtonProvider(String id) throws CoreException{
		IPopupToolBarProvider popupBarToolProvider = id2IPopupToolBarProviderInstance.get(id);
		
		if (popupBarToolProvider == null)
		{
			popupBarToolProvider = (IPopupToolBarProvider)id2IPopupToolBarProviderConfigurationElement.get(id).createExecutableExtension("class");
			id2IPopupToolBarProviderInstance.put(id, popupBarToolProvider);
		}
		
		return popupBarToolProvider;
	}
	
	/**
	 * Returns instances of all PopupBarButtonProvider. For performance improvements two caches are used.
	 * One to cache the IConfigurationElements and one to cache the visualization service instance.
	 * 
	 * @param id ID of the registered extension point
	 * 
	 * @return A cached instance of the reasoning service
	 * 
	 * @throws CoreException
	 */
	public List<IPopupToolBarProvider> getAllPopUpBarButtonProvider() throws CoreException{
		List<IPopupToolBarProvider> popupBarToolProviders = new ArrayList<IPopupToolBarProvider>(id2IPopupToolBarProviderInstance.keySet().size()); 
		
		for (String id : id2IPopupToolBarProviderConfigurationElement.keySet()){
			popupBarToolProviders.add(getPopUpBarButtonProvider(id));
		}
		
		return popupBarToolProviders;
	}
}