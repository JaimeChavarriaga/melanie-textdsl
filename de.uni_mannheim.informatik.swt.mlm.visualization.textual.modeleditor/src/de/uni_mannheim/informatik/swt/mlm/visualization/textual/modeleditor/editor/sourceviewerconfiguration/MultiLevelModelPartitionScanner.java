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

import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;

public class MultiLevelModelPartitionScanner extends RuleBasedPartitionScanner {
	//public final Map<Element, PatternDescriptor> PARTITIONS = new HashMap<>();

//	public static MultiLevelModelPartitionScanner LatestInstance;
	
	public MultiLevelModelPartitionScanner() {

//		LatestInstance = this;
		
//		List<IPredicateRule> rules = new ArrayList<>();
		
//		for (Element e : PARTITIONS.keySet()){
//			IToken token = new Token(e.getName());
//			PatternDescriptor desc = PARTITIONS.get(e);
//			if (desc.isSingleLinePattern())
//				rules.add(new SingleLineRule(desc.getStartPattern(), desc.getEndPattern(), token));
//			else if (!desc.isSingleLinePattern())
//				rules.add(new MultiLineRule(desc.getStartPattern(), desc.getEndPattern(), token));
//		}

//		setPredicateRules(rules.toArray(new IPredicateRule[]{}));		
	}
	
//	public String[] getPartitionNames(){
//		String[] contentTypes = new String[PARTITIONS.keySet().size() + 1];
//		Element[] elements = PARTITIONS.keySet().toArray(new Element[]{});
//		
//		contentTypes[0] = IDocument.DEFAULT_CONTENT_TYPE;
//		
//		for (int i = 1; i < contentTypes.length; i++)
//			contentTypes[i] = elements[i-1].getName(); 
//		
//		return contentTypes;
//	}
	
//	public void clearPartitions(){
//		PARTITIONS.clear();
//	}
	
//	public void addPartition(Element e, PatternDescriptor d){
//		PARTITIONS.put(e, d);
//	}
	
//	public void addAllPartitions(Map<Element, PatternDescriptor> partitions){
//		for (Element e : partitions.keySet())
//			addPartition(e, partitions.get(e));
//	}
}
