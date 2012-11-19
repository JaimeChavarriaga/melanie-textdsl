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
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;


public class MultilevelKeywordScanner extends RuleBasedScanner {
	
	private static String[] keywords = {"package", "class", "private", "public"};
	
	public MultilevelKeywordScanner(MultilevelColorProvider colorProvider){
		IToken keyword = new Token(new TextAttribute(colorProvider.getColor(IMultiLevelModelColorConstants.KEYWORD)));
		
		List<IRule> rules = new ArrayList<>();
		
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
		for (String str : keywords)
			wr.addWord(str, keyword);
		
		setRules(rules.toArray(new IRule[]{}));
	}	
}