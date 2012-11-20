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
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.graphics.Color;

public class MultilevelKeywordScanner extends RuleBasedScanner {
	
	private static MultilevelColorProvider colorProvider;
	
	public static MultilevelKeywordScanner LATEST_INSTANCE;

	private Set<String> keywords = new HashSet<String>();

	
	public MultilevelKeywordScanner(){
		LATEST_INSTANCE = this;
	}
	
	public void addKeyWord(String keyword){
		keywords.add(keyword);
	}
	
	public void addKeyWord(Collection<String> keywords){
		this.keywords.addAll(keywords);
	}
	
	public void setColorProvider(MultilevelColorProvider provider){
		colorProvider = provider;
	}
	
	public void init(){
		List<IRule> rules = new ArrayList<>();
		
		for (String keyword : keywords){
			Color color = colorProvider.getColor(colorProvider.getMultiLevelModelColorConstants().getColor(keyword));
			IToken keywordToken = new Token(new TextAttribute(color));
			
			WordRule wr = new WordRule(new IWordDetector() {
				
				@Override
				public boolean isWordStart(char c) {
					return c != ' ';
				}
				
				@Override
				public boolean isWordPart(char c) {
					return c != ' ';
				}
			});
			
			rules.add(wr);
			wr.addWord(keyword, keywordToken);
		}
		
		setRules(rules.toArray(new IRule[]{}));
	}
}