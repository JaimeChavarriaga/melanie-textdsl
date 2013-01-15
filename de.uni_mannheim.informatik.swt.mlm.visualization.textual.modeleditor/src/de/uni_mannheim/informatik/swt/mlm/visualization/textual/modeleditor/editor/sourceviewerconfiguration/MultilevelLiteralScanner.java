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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

/**
 * This class is responsible for syntax highlighting and background marking 
 * of in the multi-level model defined literals. The light grey background
 * indicates that the literal is not editable.
 */
public class MultilevelLiteralScanner extends RuleBasedScanner {
	
	private static MultilevelColorProvider colorProvider;
	
	public static MultilevelLiteralScanner LATEST_INSTANCE;

	private Set<String> literals = new HashSet<String>();

	
	public MultilevelLiteralScanner(){
		LATEST_INSTANCE = this;
	}
	
	public void addKeyWord(String keyword){
		literals.add(keyword);
	}
	
	public void addLiteral(Collection<String> literals){
		this.literals.addAll(literals);
	}
	
	public void setColorProvider(MultilevelColorProvider provider){
		colorProvider = provider;
	}
	
	public void init(){
		List<IRule> rules = new ArrayList<>();
		
		// Here we only iterate over literals which have been registered with a foreground
		// color. KeywordLiteralWordRule will return a token with a background for all tokens known
		// to the weaving model.
//		for (String keywordLiteral : literals){
//			Color color = colorProvider.getColor(colorProvider.getMultiLevelModelColorConstants().getColor(keywordLiteral));
//			
//			Color backgroundColor = colorProvider.getColor(new RGB(230,230,230));
//			IToken keywordLiteralToken = new Token(new TextAttribute(color, backgroundColor, SWT.NORMAL));
//			
//			KeywordLiteralWordRule wr = new KeywordLiteralWordRule(new IWordDetector() {
//				
//				@Override
//				public boolean isWordStart(char c) {
//					return c != ' ';
//				}
//				
//				@Override
//				public boolean isWordPart(char c) {
//					return c != ' ';
//				}
//				
//				
//			});
//			
//			rules.add(wr);
//			wr.addWord(keywordLiteral, keywordLiteralToken);
//		}
		
		//Add a rule that marks everything that is not changeable with a grey background
		rules.add(new LockedLiteralRule(colorProvider));
		
		setRules(rules.toArray(new IRule[]{}));
	}
	
	public int getOffset(){
		return fOffset;
	}
}