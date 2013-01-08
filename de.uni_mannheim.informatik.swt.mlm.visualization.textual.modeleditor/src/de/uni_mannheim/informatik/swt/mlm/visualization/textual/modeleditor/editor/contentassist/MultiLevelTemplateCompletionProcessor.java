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
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Participation;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy;
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
		
		List<DSLTemplate> templates = getDSLTemplates(viewer, offset);
		ICompletionProposal[] proposals = new ICompletionProposal[templates.size()];
		for (DSLTemplate template : templates){
			Template t = new Template(template.getTypeClabject().getName(), template.getTypeClabject().getName(), MultiLevelTemplateContextType.CONTEXT_TYPE, template.getTemplateString(), true);
			DocumentTemplateContext context = new DocumentTemplateContext(new MultiLevelTemplateContextType(), viewer.getDocument(), offset, 0);
			TemplateProposal proposal = new MultiLevelModelTemplateProposal(t, context, new Region(offset, 0), null, 100, template.getTypeClabject(), template.getTypeConnection(), template.getContainerClabject(), weavingModel);	
			proposals[0] = proposal;
		}
		return proposals;
	}
	
	/**
	 * 
	 * @param viewer
	 * @param offset
	 * @return The map is of format Type, Template
	 */
	private List<DSLTemplate> getDSLTemplates(ITextViewer viewer, int offset){
		List<DSLTemplate> result = new ArrayList<>();
		
		//Search the model element to which the text belongs to
		List<TextElement> textElements = weavingModel.findTextElementForOffset(offset, SearchStrategy.ATTRIBUTE_PREFFERED);
		if (textElements.size() == 0)
			return result;
		
		TextElement textElement = textElements.get(0);
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
		
		Map<Connection, Clabject> instantiableClabjects = getTypesForInstantiation(clabjectVisualizer, relativeOffset);
		
		for (Connection c : instantiableClabjects.keySet())
			result.add(new DSLTemplate(instantiableClabjects.get(c), visualizedClabject, c));
		
		return result;
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
				relativeOffset += ((TextElement)current).getLength();
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
	private Map<Connection, Clabject> getTypesForInstantiation(TextualDSLVisualizer visualizer, int relativeOffset){
		Map<Connection, Clabject> result = new HashMap<>();
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
			result.put(r.getConnection(), r.getDestination());
		 
		return result;
	}
	
	/**
	 * private class for storing a dsl template and information about it
	 */
	private class DSLTemplate{
		private Clabject typeClabject;
		public Clabject getTypeClabject(){
			return typeClabject;
		}
		
		private Clabject containerClabject;
		public Clabject getContainerClabject(){
			return containerClabject;
		}
		
		private Connection typeConnection;
		public Connection getTypeConnection(){
			return typeConnection;
		}
		
		public DSLTemplate(Clabject typeClabject, Clabject containerClabject, Connection typeConnection){
			this.typeClabject = typeClabject;
			this.containerClabject = containerClabject;
			this.typeConnection = typeConnection;
		}
		
		private String template = null;
		public String getTemplateString(){
			if (template != null)
					return template;
			
			for (AbstractDSLVisualizer visualizer : typeClabject.getPossibleDomainSpecificVisualizers())
				if (visualizer instanceof TextualDSLVisualizer){
					String template = "";

					for (TextualVisualizationDescriptor descriptor : ((TextualDSLVisualizer) visualizer).getContent())
						if (descriptor instanceof Literal)
							template += descriptor.getExpression();
						else if (descriptor instanceof Value
									&& ((Value)descriptor).isAttribute())
							template += "${" + descriptor.getExpression() + "}";
					
					return String.format(template);
				}
			
			return null;
		}
	}
}