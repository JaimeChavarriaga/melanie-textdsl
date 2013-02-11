/*******************************************************************************
 * Copyright (c) 2012, 2013 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration;

public class PatternDescriptor{
	final private String startPattern;
	final private String endPattern;
	final private boolean isSingleLine;
	final private boolean isLiteral = false;
	
	public PatternDescriptor(String startPattern, String endPattern, boolean isSingleLine){
		this.startPattern = startPattern;
		this.endPattern = endPattern;
		this.isSingleLine = isSingleLine;
	}
	
	public boolean isSingleLinePattern(){
		return isSingleLine;
	}
	
	public String getStartPattern(){
		return startPattern;
	}
	
	public String getEndPattern(){
		return endPattern;
	}
	
	public boolean isLiteral(){
		return isLiteral;
	}
}
