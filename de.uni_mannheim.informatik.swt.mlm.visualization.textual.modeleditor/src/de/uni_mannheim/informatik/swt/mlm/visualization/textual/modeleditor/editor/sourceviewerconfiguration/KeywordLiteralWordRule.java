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

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelEditorInput;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

public class KeywordLiteralWordRule extends WordRule {

	private WeavingModel weavingModel;
	
	public KeywordLiteralWordRule(IWordDetector detector) {
		super(detector);
		weavingModel = MultiLevelModelEditorInput.LatestInstance.getWeavingModel();
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		if ( ((WeavingLink)weavingModel.findTextElementForOffset(scanner.getColumn()).get(0).eContainer()).getModelElement() instanceof Attribute )
			return Token.UNDEFINED;
		else
			return super.evaluate(scanner);
	}
}