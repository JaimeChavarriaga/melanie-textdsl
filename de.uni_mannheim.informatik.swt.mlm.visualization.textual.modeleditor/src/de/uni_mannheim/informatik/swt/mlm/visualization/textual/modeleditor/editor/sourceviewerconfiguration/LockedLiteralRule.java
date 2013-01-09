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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration;

import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelEditorInput;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

/**
 * This scanner uses the weaving model to determine whether to
 * show a grey background to indicate that a literal is not editable
 *
 */
public class LockedLiteralRule implements IRule {

	MultilevelColorProvider colorProvider;
	WeavingModel weavingModel;
	
	public LockedLiteralRule(MultilevelColorProvider colorProvider){
		this.colorProvider = colorProvider;
		this.weavingModel = MultiLevelModelEditorInput.LatestInstance.getWeavingModel();
	}
	
	private int buffer;
	private int lastOffset = -1;
	
	@Override
	public IToken evaluate(ICharacterScanner scanner) {		
		int offset = ((MultilevelLiteralScanner)scanner).getOffset();
		
		//This is to prevent the scanner to jump sometimes by one
		if (offset == lastOffset)
			buffer = scanner.read();
		
		lastOffset = ((MultilevelLiteralScanner)scanner).getOffset();
		
		if (buffer == ICharacterScanner.EOF){
			scanner.unread();
			buffer = 0;
			return Token.UNDEFINED;
		}
		
		Color backgroundColor = colorProvider.getColor(new RGB(230,230,230));
		Token lockedToken = new Token(new TextAttribute(null, backgroundColor, SWT.NORMAL));
		
		List<TextElement> textElements = weavingModel.findTextElementForOffset(offset);
		if (textElements.size() == 0){
			return Token.UNDEFINED;
		}
		
		//In cases where the cursor is between two tokens the second token is wanted
		TextElement currentTextElement = textElements.size() > 1 ? textElements.get(1) : textElements.get(0);
		WeavingLink currentWeavingLink = (WeavingLink)currentTextElement.eContainer();
		
		if (currentWeavingLink.getModelElement() instanceof Attribute){
			return Token.UNDEFINED;
		}
		else{
			return lockedToken;
		}
	}

}
