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

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.swt.graphics.Image;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.SyncModelAndTextReconcilingStrategy;
import de.uni_mannheim.informatik.swt.models.plm.PLM.AbstractDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Literal;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualDSLVisualizer;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualVisualizationDescriptor;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.Value;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingFactory;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

public class MultiLevelModelTemplateProposal extends TemplateProposal {

	private Clabject type;
	private WeavingModel weavingModel;
	
	public MultiLevelModelTemplateProposal(Template template,
			TemplateContext context, IRegion region, Image image, int relevance, Clabject type, WeavingModel weavingModel) {
		super(template, context, region, image, relevance);
		
		Assert.isNotNull(type);
		Assert.isNotNull(weavingModel);
		
		this.type = type;
		this.weavingModel = weavingModel;
	}

	@Override
	public void apply(ITextViewer viewer, char trigger, int stateMask,
			int offset) {

		super.apply(viewer, trigger, stateMask, offset);
		
		List<TextElement> textElements = weavingModel.findTextElementForOffset(offset);
		
		Assert.isTrue(textElements.size() > 0);
		
		TextElement textElement = textElements.get(0);
		WeavingLink textElementContainingWeavingLink = (WeavingLink)textElement.eContainer();
		
		if (textElementContainingWeavingLink.getModelElement() instanceof Attribute)
			textElementContainingWeavingLink = (WeavingLink)textElementContainingWeavingLink.eContainer();
		
		Clabject textElementContainingClabject = (Clabject)textElementContainingWeavingLink.getModelElement();
		
		//Create and setup multi-level model
		Entity newInstance = PLMFactory.eINSTANCE.createEntity();
		PLMFactory.eINSTANCE.configureClabject(type, newInstance);
		
		for (Attribute attribute : newInstance.getEigenAttributes())
			attribute.setValue(attribute.getName());
		
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(type);
		CompoundCommand cCmd = new CompoundCommand();
		Command addInstanceCommand = AddCommand.create(domain, textElementContainingClabject.getModel(), PLMPackage.eINSTANCE.getModel_Content(), newInstance);
		cCmd.append(addInstanceCommand);
		
		Classification newClassification = PLMFactory.eINSTANCE.createClassification();
		newClassification.setType(type);
		newClassification.setInstance(newInstance);
		Command addClassificationCommand = AddCommand.create(domain, textElementContainingClabject.getModel(), PLMPackage.eINSTANCE.getModel_Content(), newClassification);
		cCmd.append(addClassificationCommand);
		domain.getCommandStack().execute(cCmd);
		
		WeavingLink newClabjectWeavingLink = createWeavingLink(newInstance, offset);
		int indexToAdd = textElementContainingWeavingLink.getChildren().indexOf(textElement);
		textElementContainingWeavingLink.getChildren().add(indexToAdd, newClabjectWeavingLink);
		
		SyncModelAndTextReconcilingStrategy.recalculateOffset(((WeavingModel)EcoreUtil.getRootContainer(newClabjectWeavingLink)).getLinks().get(0), 0);
		viewer.invalidateTextPresentation();
		
		//This is done for debug reasons to serialize the model on harddisk for viewing it.
		try {
			newClabjectWeavingLink.eResource().save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Creates templates for a list of clabjects
	 * 
	 * @param clabjects clabjects to create templates for
	 * 
	 * @return a list of templates
	 */
	private WeavingLink createWeavingLink(Clabject clabject, int offset){
		
		WeavingLink link = M2TWeavingFactory.eINSTANCE.createWeavingLink();
		link.setModelElement(clabject);
		
		for (AbstractDSLVisualizer visualizer : clabject.getPossibleDomainSpecificVisualizers()){
			if (! (visualizer instanceof TextualDSLVisualizer))
				continue;
			
			for (TextualVisualizationDescriptor descriptor : ((TextualDSLVisualizer) visualizer).getContent())
				if (descriptor instanceof Literal){
					TextElement textElement = M2TWeavingFactory.eINSTANCE.createTextElement();
					textElement.setText(descriptor.getExpression());
					textElement.setLenght(textElement.getText().length());
					textElement.setOffset(offset);
					offset = offset + textElement.getLenght();
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
					attributeTextElement.setLenght(attributeTextElement.getText().length());
					offset += attributeTextElement.getLenght();
					attributeLink.getChildren().add(attributeTextElement);
				}
				
				break;
			}
		
		return link;
	}
}