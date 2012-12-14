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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.contentassist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.templates.DocumentTemplateContext;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateCompletionProcessor;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.swt.graphics.Image;

import de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Participation;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

public class MultiLevelTemplateCompletionProcessor extends
		TemplateCompletionProcessor {
	
	private WeavingModel weavingModel;
	
	public MultiLevelTemplateCompletionProcessor(WeavingModel weavingModel){
		this.weavingModel = weavingModel;
	}
	
	@Override
	protected Template[] getTemplates(String contextTypeId) {
		return null;
	}

	@Override
	protected TemplateContextType getContextType(ITextViewer viewer,
			IRegion region) {
		return new MultiLevelTemplateContextType();
	}

	@Override
	protected Image getImage(Template template) {
		return null;
	}
	
	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {
		ICompletionProposal[] proposals = new ICompletionProposal[1];
		
		getDSLTemplates(viewer, offset);
		
		Map<Clabject, String> templates = getDSLTemplates(viewer, offset);
		for (Clabject c : templates.keySet()){
			Template t = new Template(c.getName(), c.getName(), MultiLevelTemplateContextType.CONTEXT_TYPE, templates.get(c), true);
			DocumentTemplateContext context = new DocumentTemplateContext(new MultiLevelTemplateContextType(), viewer.getDocument(), offset, 0);
			TemplateProposal proposal = new MultiLevelModelTemplateProposal(t, context, new Region(offset, 0), null, 100, c, weavingModel);	
			proposals[0] = proposal;
		}
		return proposals;
	}
	
	/**
	 * 
	 * @param viewer
	 * @param offset
	 * @return
	 */
	public Map<Clabject, String> getDSLTemplates(ITextViewer viewer, int offset){
		Map<Clabject, String> result = new HashMap<Clabject, String>();
		
		//Search the modele element to wich the text belongs to
		List<TextElement> textElements = weavingModel.findTextElementForOffset(offset);
		if (textElements.size() == 0)
			return result;
		
		TextElement textElement = weavingModel.findTextElementForOffset(offset).get(0);
		WeavingLink textElementContainer = ((WeavingLink)textElement.eContainer());
		Element visualizedModelElement = textElementContainer.getModelElement();
		
		//We are only interested in Clabjects for offering templates which allow create new clabjects
		if (! (visualizedModelElement instanceof Clabject))
			return result;
		
		Clabject visualizedClabject = (Clabject)visualizedModelElement;
		
		int relativeOffset = calculateRelativeOffset(textElementContainer, textElement);
		
		TextualDSLVisualizer clabjectVisualizer = null;
		
		for (AbstractDSLVisualizer visualizer : visualizedClabject.getPossibleDomainSpecificVisualizers())
			if (visualizer instanceof TextualDSLVisualizer){
				clabjectVisualizer = (TextualDSLVisualizer)visualizer;
				break;
			}
		
		if (clabjectVisualizer == null)
			return result;
		
		List<Clabject> instantiableClabjects = getTypesForInstantiation(clabjectVisualizer, relativeOffset);
		
		return getTemplates(instantiableClabjects);
	}
	
	/**
	 * The relative offset BEFORE the TextElement on which the content assist was
	 * invoked.
	 * 
	 * @param start
	 * @param elementToSearch
	 * @return
	 */
	private int calculateRelativeOffset(WeavingLink start, TextElement elementToSearch){
		int relativeOffset = 0;
		
		for (EObject current : start.eContents())
			if (current instanceof WeavingLink)
				continue;
			else if (current == elementToSearch)
				return relativeOffset;
			else if (current instanceof TextElement)
				relativeOffset += ((TextElement)current).getLenght();
			else
				continue;
		
		return relativeOffset;
	}
	
	/**
	 * This method finds all instantiable clabjects.
	 * 
	 * @param visualizer
	 * @param relativeOffset
	 * @return
	 */
	private List<Clabject> getTypesForInstantiation(TextualDSLVisualizer visualizer, int relativeOffset){
		List<Clabject> result = new ArrayList<>();
		int currentOffset = 0;
		Literal visualizingLiteral = null;
		
		//First find literal for offset in the visualizer
		for (TextualVisualizationDescriptor descriptor : visualizer.getContent()){
			if (descriptor instanceof Literal)
				currentOffset += ((Literal)descriptor).getExpression().length();
			
			if (currentOffset >= relativeOffset){
				visualizingLiteral = (Literal)descriptor;
				break;
			}
		}
		
		if (visualizingLiteral == null){
			return result;
		}
		
		//Find next reference immediately AFTER the literal
		 TextualVisualizationDescriptor descriptor = null;
		 descriptor = visualizer.getContent().get(visualizer.getContent().indexOf(visualizingLiteral) + 1);
		 if (!(descriptor instanceof Value))
			 return result;
		
		//Return all connected clabjects for instantiation
		Value value = (Value)descriptor;
		String expression = value.getExpression();
		Clabject clabject = (Clabject)visualizer.getContainingPLMElement();
		List<Participation> navigations = clabject.getAllNavigationsForParticipationName(expression);
		if (navigations.size() == 0)
			return result;
		
		for (Participation r : navigations)
			result.add(r.getDestination());
		 
		return result;
	}
	
	/**
	 * Creates templates for a list of clabjects
	 * 
	 * @param clabjects clabjects to create templates for
	 * 
	 * @return a list of templates
	 */
	private Map<Clabject, String> getTemplates(List<Clabject> clabjects){
		Map<Clabject, String> templates = new HashMap<Clabject, String>();
		
		for (Clabject clabject : clabjects)
			for (AbstractDSLVisualizer visualizer : clabject.getPossibleDomainSpecificVisualizers())
				if (visualizer instanceof TextualDSLVisualizer){
					String template = "";

					for (TextualVisualizationDescriptor descriptor : ((TextualDSLVisualizer) visualizer).getContent())
						if (descriptor instanceof Literal)
							template += descriptor.getExpression();
						else if (descriptor instanceof Value)
							template += "${" + descriptor.getExpression() + "}";
					
					templates.put(clabject, String.format(template));
				}
		
		return templates;
	}
}