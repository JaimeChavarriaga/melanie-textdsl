/*******************************************************************************
 * Copyright (c) 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.graphics.RGB;

public class MultiLevelModelColorConstants {
	
	public static MultiLevelModelColorConstants LATEST_INSTANCE;
	
	public static final String DEFAULT_KEY = "DEFAULT_KEY";
	
	private Map<String, RGB> colors = new HashMap<>();
	
	public MultiLevelModelColorConstants(){
		colors.put("DEFAULT_KEY", new RGB(0,0,0));
		LATEST_INSTANCE = this;
	}
	
	public void putColor(String keyword, RGB color){
		colors.put(keyword, color);
	}
	
	public RGB getColor(String keyword){
		return colors.get(keyword);
	}
}
