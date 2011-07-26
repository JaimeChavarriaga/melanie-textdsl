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
 * This class manages loading extension points
 *
 */
public class ExtensionPointService {
	
	private static String VISUALIZATION_SERVICE_ID = "de.uni_mannheim.informatik.swt.visualization.service";
	
	private static ExtensionPointService instance = null;
	
	private static Map<String, IConfigurationElement> id2vislualizer;
	
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
	
	private void initialize(){
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(VISUALIZATION_SERVICE_ID);
		
		id2vislualizer = new HashMap<String, IConfigurationElement>();
		
		for (IConfigurationElement cElement : configurationElements)
			id2vislualizer.put(cElement.getAttribute("id"), cElement);
	}
	
	public IVisualModelToFigureTransformator getVisualizationService(String id) throws CoreException{
		return (IVisualModelToFigureTransformator)id2vislualizer.get(id).createExecutableExtension("class");
	}
}
