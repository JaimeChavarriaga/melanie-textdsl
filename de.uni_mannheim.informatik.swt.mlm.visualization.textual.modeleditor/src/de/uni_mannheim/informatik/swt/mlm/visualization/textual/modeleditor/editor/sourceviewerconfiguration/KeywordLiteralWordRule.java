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

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;

import com.sun.xml.internal.stream.Entity;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelEditorInput;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

public class KeywordLiteralWordRule extends WordRule {

	final private WeavingModel weavingModel;
	
	public KeywordLiteralWordRule(IWordDetector detector) {
		super(detector);
		weavingModel = MultiLevelModelEditorInput.LatestInstance.getWeavingModel();
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		for(TextElement textElement : weavingModel.findTextElementForOffset(scanner.getColumn()))
			if ( ((WeavingLink)textElement.eContainer()).getModelElement() instanceof Entity )
				return Token.UNDEFINED;
			
		//Attributes shall not get highlighted
		return super.evaluate(scanner);
	}
}