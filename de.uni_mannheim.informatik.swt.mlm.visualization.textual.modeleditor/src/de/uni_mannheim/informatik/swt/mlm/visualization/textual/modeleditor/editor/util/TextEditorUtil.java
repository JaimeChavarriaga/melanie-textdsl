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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.util;

import java.util.List;

import de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingFactory;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModelContent;

/**
 * 
 * Shared util classes.
 *
 */
public class TextEditorUtil {
	/**
	 * Recalculates offset and length of TextElements for a weaving model
	 * or a part of a weaving model.
	 *
	 * @param link starting link
	 * @param offset starting offset
	 * 
	 * @return current offset
	 */
	public static int calculateWeavingModelOffsets(WeavingLink link, int offset){
		int currentOffset = offset;
		
		for (WeavingModelContent element : link.getChildren()){
			if (element instanceof TextElement){
				int length = ((TextElement)element).getText().length();
				((TextElement)element).setLength(length);
				((TextElement)element).setOffset(currentOffset);
				currentOffset = currentOffset + length;
			}
			else{
				currentOffset = calculateWeavingModelOffsets((WeavingLink)element, currentOffset);
			}
		}		
		
		return currentOffset;
	}
	
	/**
	 * Creates a weaving link for a given text
	 * 
	 * @param element
	 * @param text
	 * @param parent
	 */
	public static void createWeavingLink(WeavingModel weavingModel, Element element, String text, Element parent){
		List<WeavingLink> links = weavingModel.findLinkForPLMElement(element);
		WeavingLink link;
		
		if (links.size() == 0){
			if (parent == null){
				link = M2TWeavingFactory.eINSTANCE.createWeavingLink();
				link.setModelElement(element);
				weavingModel.getLinks().add(link);
			}else{
				List<WeavingLink> parentLinks = weavingModel.findLinkForPLMElement(parent);
				
				if (parentLinks.size() != 1)
					throw new UnsupportedOperationException("Not Supported!");
				
				link = M2TWeavingFactory.eINSTANCE.createWeavingLink();
				link.setModelElement(element);
				parentLinks.get(0).getChildren().add(link);
			}
		} else if (links.size() == 1){
			link = links.get(0);
		} else{
			throw new UnsupportedOperationException("Not Supported!");
		}
		
		if (text != null){
			TextElement textElement = M2TWeavingFactory.eINSTANCE.createTextElement();
			textElement.setText(String.format(text));
			link.getChildren().add(textElement);
		}
	}
	
	/**
	 * Creates templates for a list of clabjects
	 * 
	 * @param clabjects clabjects to create templates for
	 * 
	 * @return a list of templates
	 */
	public static WeavingLink createWeavingLink(Clabject clabject, int offset){
		
		WeavingLink link = M2TWeavingFactory.eINSTANCE.createWeavingLink();
		link.setModelElement(clabject);
		
		for (AbstractDSLVisualizer visualizer : clabject.getPossibleDomainSpecificVisualizers()){
			if (! (visualizer instanceof TextualDSLVisualizer))
				continue;
			
			for (TextualVisualizationDescriptor descriptor : ((TextualDSLVisualizer) visualizer).getContent())
				if (descriptor instanceof Literal){
					TextElement textElement = M2TWeavingFactory.eINSTANCE.createTextElement();
					textElement.setText(String.format(descriptor.getExpression()));
					textElement.setLength(textElement.getText().length());
					textElement.setOffset(offset);
					offset = offset + textElement.getLength();
					link.getChildren().add(textElement);
				}
				else if (descriptor instanceof Value
						 && clabject.getAttributeByName(descriptor.getExpression()) != null){
					
					WeavingLink attributeLink = M2TWeavingFactory.eINSTANCE.createWeavingLink();
					Attribute attribute = clabject.getAttributeByName(descriptor.getExpression());
					attributeLink.setModelElement(attribute);
					link.getChildren().add(attributeLink);
					
					TextElement attributeTextElement = M2TWeavingFactory.eINSTANCE.createTextElement();
					attributeTextElement.setText(descriptor.getExpression());
					attributeTextElement.setOffset(offset);
					attributeTextElement.setLength(attributeTextElement.getText().length());
					offset += attributeTextElement.getLength();
					attributeLink.getChildren().add(attributeTextElement);
				}
				
				break;
			}
		
		return link;
	}
}