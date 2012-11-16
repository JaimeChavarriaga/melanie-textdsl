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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;

public class MultiLevelModelPartitionScanner extends RuleBasedPartitionScanner {
	public final static Map<Element, PatternDescriptor> PARTITIONS = new HashMap<>();

	public MultiLevelModelPartitionScanner() {

		List<IPredicateRule> rules = new ArrayList<>();
		
		for (Element e : PARTITIONS.keySet()){
			IToken token = new Token(e.getName());
			PatternDescriptor desc = PARTITIONS.get(e);
			if (desc.isSingleLinePattern())
				rules.add(new SingleLineRule(desc.getStartPattern(), desc.getEndPattern(), token));
			else if (!desc.isSingleLinePattern())
				rules.add(new MultiLineRule(desc.getStartPattern(), desc.getEndPattern(), token));
		}

		setPredicateRules(rules.toArray(new IPredicateRule[]{}));		
	}
	
	static public String[] getPartitionNames(){
		String[] contentTypes = new String[MultiLevelModelPartitionScanner.PARTITIONS.keySet().size() + 1];
		Element[] elements = MultiLevelModelPartitionScanner.PARTITIONS.keySet().toArray(new Element[]{});
		
		contentTypes[0] = IDocument.DEFAULT_CONTENT_TYPE;
		
		for (int i = 1; i < contentTypes.length; i++)
			contentTypes[i] = elements[i-1].getName(); 
		
		return contentTypes;
	}
	
	static public void clearPartitions(){
		PARTITIONS.clear();
	}
	
	static public void addPartition(Element e, PatternDescriptor d){
		PARTITIONS.put(e, d);
	}
	
	static public void addAllPartitions(Map<Element, PatternDescriptor> partitions){
		for (Element e : partitions.keySet())
			addPartition(e, partitions.get(e));
	}
}
