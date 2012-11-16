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

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration.MultiLevelModelPartitionScanner;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration.PatternDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Role;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value;


/**
 * Responsible for creating text, weaving model etc.
 *
 */
public class TextualDSLModelInterpreter {

	static public String getTextualRepresentation(Element root){
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
			MultiLevelModelPartitionScanner.clearPartitions();
			return getTextualRepresentation(textualVisualizer.getRoot());
		}
		
		registerPartition(textualVisualizer, root);
		
		for(TextualVisualizationDescriptor desc : textualVisualizer.getContent())
			if (desc instanceof Literal)
				result += getLiteral((Literal)desc);
			else
				result += getValue((Value)desc, root);
		
		return result;
	}
	
	static private void registerPartition(TextualDSLVisualizer v, Element root){
		
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
		MultiLevelModelPartitionScanner.addPartition(root, pd);
	}
	
	static private String getLiteral(Literal l){
		return l.getExpression();
	}
	
	static private String getValue(Value v, Element modelElement){
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
