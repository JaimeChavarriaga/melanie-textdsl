/*******************************************************************************
 * Copyright (c) 2013 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/ 
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor;

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModelContent;

/**
 * 
 * Shared util classes.
 *
 */
public class TextEditorUtil {
	/**
	 * Recalculates offset and length of TextElements
	 *
	 * @param link
	 * @param offset
	 * @param document
	 * @return
	 */
	public static int recalculateOffset(WeavingLink link, int offset){
		int currentOffset = offset;
		
		for (WeavingModelContent element : link.getChildren()){
			if (element instanceof TextElement){
				int length = ((TextElement)element).getText().length();
				((TextElement)element).setLength(length);
				((TextElement)element).setOffset(currentOffset);
				currentOffset = currentOffset + length;
			}
			else{
				currentOffset = recalculateOffset((WeavingLink)element, currentOffset);
			}
		}		
		
		return currentOffset;
	}
}
