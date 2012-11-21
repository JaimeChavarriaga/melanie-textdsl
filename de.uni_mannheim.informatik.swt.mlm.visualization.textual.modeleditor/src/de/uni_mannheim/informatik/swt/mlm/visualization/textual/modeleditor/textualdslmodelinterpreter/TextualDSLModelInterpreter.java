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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.textualdslmodelinterpreter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.RGB;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration.MultiLevelModelColorConstants;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration.MultiLevelModelPartitionScanner;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration.MultilevelKeywordScanner;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration.PatternDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Role;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.RGBColor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingFactory;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;


/**
 * Responsible for creating text, weaving model etc.
 *
 */
public class TextualDSLModelInterpreter {

	MultiLevelModelPartitionScanner partitionScanner;
	MultilevelKeywordScanner keywordScanner;
	MultiLevelModelColorConstants colorConstants;
	WeavingModel weavingModel;
	
	public TextualDSLModelInterpreter(MultiLevelModelPartitionScanner partitionScanner, 
			MultilevelKeywordScanner keywordScanner, MultiLevelModelColorConstants colorConstants,
			WeavingModel weavinModel){
		this.partitionScanner = partitionScanner;
		this.keywordScanner = keywordScanner;
		this.colorConstants = colorConstants;
		this.weavingModel = weavinModel;
	}
	
	public String getTextualRepresentation(Element root){
		
		//First we add it to the model without text so that
		//its children can be added to the weaving model
		createWeavingLink(root, null, null);
		
		String result = "";
		
		TextualDSLVisualizer textualVisualizer = null;
		List<AbstractDSLVisualizer> abstractDSLVisualizers = new ArrayList<>();
		
		if (root instanceof Clabject)
			abstractDSLVisualizers = new ArrayList<AbstractDSLVisualizer>( ((Clabject)root).getPossibleDomainSpecificVisualizers() );
		else
			abstractDSLVisualizers.addAll((root.getVisualizer().size() > 0 ? root.getVisualizer().get(0).getDslVisualizer() : new ArrayList<AbstractDSLVisualizer>()));
		
		for (AbstractDSLVisualizer abstractVisualizer : abstractDSLVisualizers)
			if (abstractVisualizer instanceof TextualDSLVisualizer){
				textualVisualizer = (TextualDSLVisualizer)abstractVisualizer;
				break;
			}
		
		if (textualVisualizer == null)
			return "";
		
		if (textualVisualizer.getRoot() != null){
			return getTextualRepresentation(textualVisualizer.getRoot());
		}
		
		registerPartition(textualVisualizer, root);
		
		for(TextualVisualizationDescriptor desc : textualVisualizer.getContent())
			if (desc instanceof Literal)
				result += getLiteral((Literal)desc);
			else
				result += getValue((Value)desc, root);
		
		//Second add the generated text
		createWeavingLink(root, result, null);
		
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
			textElement.setText(text);
			link.getTextElement().add(textElement);
		}
	}
	
	private String getLiteral(Literal l){
		if (l.getColor() != null)
			registerKeyword(l);
		return l.getExpression();
	}
	
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
				createWeavingLink(((Attribute)f), ((Attribute)f).getValue(), modelElement);
				return ((Attribute)f).getValue();
			}
		}
		
		Clabject visualizerContainer = (Clabject)v.getContainingPLMElement();
		
		//Is visualizer container on the same level? -> navigate directly
		if (visualizerContainer.getModel() == clabject.getModel())
			for (Clabject navigationEnd : clabject.getDomainForRoleName(expression))
				result += getTextualRepresentation(navigationEnd);
		else if (visualizerContainer.getModel().getClassifiedModel() == clabject.getModel()){
			List<Clabject> instanceDomain = new ArrayList<>();
			
			for (Role r :clabject.getAllNavigations())
				instanceDomain.add(r.getDestination());
			
			List<Clabject> typetDomainForExpression = visualizerContainer.getDomainForRoleName(expression);
			
			for (Clabject instance : instanceDomain)
				for (Clabject instanceType : instance.getModelTypes())
					if (typetDomainForExpression.contains(instanceType)){
						result += getTextualRepresentation(instance);
						break;
					}
		}			
		else
			return "";
		
		return result;
	}
}