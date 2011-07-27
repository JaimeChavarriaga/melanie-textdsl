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

import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IVisualModelToFigureTransformator;

/**
 * This class manages loading extension points. Call Instance() to 
 * get an instance of this class.
 *
 */
public class ExtensionPointService {
	
	private static String VISUALIZATION_SERVICE_ID = "de.uni_mannheim.informatik.swt.visualization.service";
	
	private static ExtensionPointService instance = null;
	
	/**
	 * Cache for Visualization IConfigurationElements
	 */
	private static Map<String, IConfigurationElement> id2VislualizationServiceConfigurationElement;
	/**
	 * Cache for Visualization Instances
	 */
	private static Map<String, IVisualModelToFigureTransformator> id2VisualizationServiceInstance;
	
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
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(VISUALIZATION_SERVICE_ID);
		
		id2VislualizationServiceConfigurationElement = new HashMap<String, IConfigurationElement>();
		id2VisualizationServiceInstance = new HashMap<String, IVisualModelToFigureTransformator>();
		
		for (IConfigurationElement cElement : configurationElements)
			id2VislualizationServiceConfigurationElement.put(cElement.getAttribute("id"), cElement);
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
}
