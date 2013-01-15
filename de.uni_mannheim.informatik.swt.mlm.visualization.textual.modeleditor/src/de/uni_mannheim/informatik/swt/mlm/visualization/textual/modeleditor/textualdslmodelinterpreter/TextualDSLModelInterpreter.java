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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.textualdslmodelinterpreter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.RGB;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultiLevelModelColorConstants;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultiLevelModelPartitionScanner;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultilevelLiteralScanner;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.PatternDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Participation;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.RGBColor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingFactory;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModelContent;


/**
 * Responsible for creating text, weaving model etc.
 *
 */
public class TextualDSLModelInterpreter {

	MultiLevelModelPartitionScanner partitionScanner;
	MultilevelLiteralScanner keywordScanner;
	MultiLevelModelColorConstants colorConstants;
	WeavingModel weavingModel;
	
	public TextualDSLModelInterpreter(MultiLevelModelPartitionScanner partitionScanner, 
			MultilevelLiteralScanner keywordScanner, MultiLevelModelColorConstants colorConstants,
			WeavingModel weavinModel){
		this.partitionScanner = partitionScanner;
		this.keywordScanner = keywordScanner;
		this.colorConstants = colorConstants;
		this.weavingModel = weavinModel;
	}
	
	/**
	 * Textually visualizes the model element. For the root parent will be null. Besides visualizing,
	 * the partition for the model editor and the weaving model get created.
	 * 
	 * @param modelElelmentToVisualize
	 * @param parent parent of the model element to be visualized. Null for root in containment
	 * 		  hierarchy.
	 * */
	public String getTextFromModel(Element modelElelmentToVisualize, Element parent){
		String representation = String.format(getTextualRepresentation(modelElelmentToVisualize, parent));
		calculateWeavingModelOffsets(weavingModel.getLinks().get(0), 0, representation);
		return representation;
	}
	
	/**
	 * 
	 * @param modelElelmentToVisualize
	 * @param parent parent of the model element to be visualized. Null for root in containment
	 * 		  hierarchy.
	 * @return
	 */
	private String getTextualRepresentation(Element modelElelmentToVisualize, Element parent){
		
		//First we add it to the model without text so that
		//its children can be added to the weaving model
		createWeavingLink(modelElelmentToVisualize, null, parent);
		
		String result = "";
		
		TextualDSLVisualizer textualVisualizer = null;
		List<AbstractDSLVisualizer> abstractDSLVisualizers = new ArrayList<>();
		
		if (modelElelmentToVisualize instanceof Clabject)
			abstractDSLVisualizers = new ArrayList<AbstractDSLVisualizer>( ((Clabject)modelElelmentToVisualize).getPossibleDomainSpecificVisualizers() );
		else
			abstractDSLVisualizers.addAll((modelElelmentToVisualize.getVisualizer().size() > 0 ? modelElelmentToVisualize.getVisualizer().get(0).getDslVisualizer() : new ArrayList<AbstractDSLVisualizer>()));
		
		for (AbstractDSLVisualizer abstractVisualizer : abstractDSLVisualizers)
			if (abstractVisualizer instanceof TextualDSLVisualizer){
				textualVisualizer = (TextualDSLVisualizer)abstractVisualizer;
				break;
			}
		
		if (textualVisualizer == null)
			return "";
		
		if (textualVisualizer.getRoot() != null){
			return getTextualRepresentation(textualVisualizer.getRoot(), modelElelmentToVisualize);
		}
		
		registerPartition(textualVisualizer, modelElelmentToVisualize);
		
		for(TextualVisualizationDescriptor desc : textualVisualizer.getContent())
			if (desc instanceof Literal){
				String literal = getLiteral((Literal)desc);
				createWeavingLink(modelElelmentToVisualize, literal, parent);
				result += literal;
			}
			else
				result += getValue((Value)desc, modelElelmentToVisualize);
		
		return result;
	}
	
	/**
	 * Registers keywords. Keywords need to be registered to the keyword scanner
	 * and to the color provider.
	 * 
	 * @param l Literal to register as keyword
	 */
	private void registerKeyword(Literal l){
		if (l.getColor() == null &&
				! (l.getColor() instanceof RGBColor))
			return;
		
		keywordScanner.addKeyWord(l.getExpression().trim());
		
		RGBColor color = (RGBColor)l.getColor();
		RGB rgb = new RGB(color.getR(), color.getG(),color.getB());
		colorConstants.putColor(l.getExpression().trim(), rgb);
	}
	
	/**
	 * Adds a partition to the partition scanner. Patterns are built out of the literals
	 * specified in the visualizer. The algorithm for the start pattern collects all 
	 * literals until the first value is reached. If the first statement is a value it
	 * starts at the first following literal. The end pattern is built in the same way
	 * by searching the visualizer content in reverse order.
	 * 
	 * @param v Textual visualizer which contains information to build the patterns from.
	 * @param root The model element for which the visualizer is defined.
	 */
	private void registerPartition(TextualDSLVisualizer v, Element root){
		
		if (v.getContent().size() == 0)
			return;
		
		String startPattern = "";
		String endPattern = "";
		
		for (TextualVisualizationDescriptor d : v.getContent())
			if (d instanceof Literal)
				startPattern += d.getExpression();
			else{
				startPattern = startPattern.replace("%n", "");
				if ("".equals(startPattern))
					continue;
				else
					break;
			}
		
		for (int i = v.getContent().size() - 1; i > 0; i--)
			if (v.getContent().get(i) instanceof Literal)
				endPattern = v.getContent().get(i).getExpression() + endPattern;
			else{
				endPattern = endPattern.replace("%n", "");
				if ("".equals(endPattern))
					continue;
				else
					break;
			}
		
		PatternDescriptor pd = new PatternDescriptor(startPattern, endPattern, false);
		partitionScanner.addPartition(root, pd);
	}
	
	/**
	 * Creates a weaving link for a given text
	 * 
	 * @param element
	 * @param text
	 * @param parent
	 */
	private void createWeavingLink(Element element, String text, Element parent){
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
	 * Registers the literal as keyword and returns its value
	 * 
	 * @param l
	 * @return
	 */
	private String getLiteral(Literal l){
		if (l.getColor() != null)
			registerKeyword(l);
		return l.getExpression();
	}
	
	/**
	 * Gets the value stated in a Textual Visualizer Expression. This is either
	 * an attribute or the textual representation of the connected clabjects. 
	 * 
	 * @param v
	 * @param modelElement
	 * @return
	 */
	private String getValue(Value v, Element modelElement){
		String result = "";
		String expression = v.getExpression();
		
		if (expression == null
				|| (expression.length() == 0) 
				|| ! (modelElement instanceof Clabject))
			return "";
		
		Clabject clabject = (Clabject)modelElement;
		
		//If the expression is a feature we can return the value
		for (Feature f : clabject.getAllFeatures()){
			if (expression.equals(f.getName())
					&& f instanceof Attribute){
				//Register in weaving model
				createWeavingLink(((Attribute)f), ((Attribute)f).getValue(), modelElement);
				return ((Attribute)f).getValue();
			}
		}
		
		Clabject visualizerContainer = (Clabject)v.getContainingPLMElement();
		
		//Is visualizer container on the same level? -> navigate directly
		if (visualizerContainer.getModel() == clabject.getModel())
			for (Clabject navigationEnd : clabject.getDomainForParticipationName(expression))
				result += getTextualRepresentation(navigationEnd, modelElement);
		else if (visualizerContainer.getModel().getClassifiedModel() == clabject.getModel()){
			List<Clabject> instanceDomain = new ArrayList<>();
			
			for (Participation r :clabject.getAllNavigations())
				instanceDomain.add(r.getDestination());
			
			List<Clabject> typetDomainForExpression = visualizerContainer.getDomainForParticipationName(expression);
			
			for (Clabject instance : instanceDomain)
				for (Clabject instanceType : instance.getModelTypes())
					if (typetDomainForExpression.contains(instanceType)){
						result += getTextualRepresentation(instance, modelElement);
						break;
					}
		}			
		else
			return "";
		
		return result;
	}
	
	/**
	 * 
	 * @param link
	 * @param offset
	 * @param document
	 */
	private static int calculateWeavingModelOffsets(WeavingLink link, int offset, String document){
		int currentOffset = offset;
		
		for (WeavingModelContent element : link.getChildren()){
			if (element instanceof TextElement){
				currentOffset = document.indexOf(((TextElement)element).getText(), currentOffset);
				int length = ((TextElement)element).getText().length();
				((TextElement)element).setLength(length);
				((TextElement)element).setOffset(currentOffset);
				currentOffset = currentOffset + length;
			}
			else{
				currentOffset = calculateWeavingModelOffsets((WeavingLink)element, currentOffset, document);
			}
		}
		
		return currentOffset;
	}
}