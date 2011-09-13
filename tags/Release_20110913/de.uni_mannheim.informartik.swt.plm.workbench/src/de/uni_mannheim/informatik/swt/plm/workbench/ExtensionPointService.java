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
package de.uni_mannheim.informatik.swt.plm.workbench;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IRefactoringService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IVisualModelToFigureTransformator;

/**
 * This class manages loading extension points. Call Instance() to 
 * get an instance of this class.
 *
 */
public class ExtensionPointService {
	
	private static String VISUALIZATION_SERVICE_ID = "de.uni_mannheim.informatik.swt.visualization.service";
	private static String REASONING_SERVICE_ID = "de.uni_mannheim.informatik.swt.reasoning.service";
	private static String REFACTORING_SERVICE_ID = "de.uni_mannheim.informatik.swt.refactoring.service";
	
	private static ExtensionPointService instance = null;
	
	/**
	 * Cache for Visualization IConfigurationElements
	 */
	private static Map<String, IConfigurationElement> id2VislualizationServiceConfigurationElement;
	/**
	 * Cache for Visualization Instances
	 */
	private static Map<String, IVisualModelToFigureTransformator> id2VisualizationServiceInstance;
	
	/**
	 * Cache for Reasoning IConfigurationElements
	 */
	private static Map<String, IConfigurationElement> id2ReasoningServiceConfigurationElement;
	/**
	 * Cache for Reasoning Instances
	 */
	private static Map<String, IReasoningService> id2ReasoningServiceInstance;
	
	/**
	 * Cache for Reasoning IConfigurationElements
	 */
	private static Map<String, IConfigurationElement> id2RefactoringServiceConfigurationElement;
	/**
	 * Cache for Reasoning Instances
	 */
	private static Map<String, IRefactoringService> id2RefactoringServiceInstance;
	
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
		id2VislualizationServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2VisualizationServiceInstance = new HashMap<String, IVisualModelToFigureTransformator>();
		
		id2ReasoningServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2ReasoningServiceInstance = new HashMap<String, IReasoningService>();
		
		id2RefactoringServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2RefactoringServiceInstance = new HashMap<String, IRefactoringService>();
		
		//Initialize the visualization service
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(VISUALIZATION_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2VislualizationServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
				
		//Initialize the reasoning service
		configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(REASONING_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2ReasoningServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
		
		//Initialize the refactoring service
		configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(REFACTORING_SERVICE_ID);
		
		for (IConfigurationElement cElement : configurationElements)
			id2RefactoringServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
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
	public IVisualModelToFigureTransformator getVisualizationService(String id) throws CoreException{
		IVisualModelToFigureTransformator transformator = id2VisualizationServiceInstance.get(id);
		
		if (transformator == null)
		{
			transformator = (IVisualModelToFigureTransformator)id2VislualizationServiceConfigurationElement.get(id).createExecutableExtension("class");
			id2VisualizationServiceInstance.put(id, transformator);
		}
		
		return transformator;
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
}
