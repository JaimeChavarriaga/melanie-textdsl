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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.contentassist;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.swt.graphics.Image;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelTextEditor;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.util.TextEditorUtil;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.ClassificationKind;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Participation;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

public class MultiLevelModelTemplateProposal extends TemplateProposal {

	final private Clabject type;
	final private Clabject typeConnection;
	final private Clabject container;
	final private WeavingLink containerWeavingLink;
	final private TextElement editedTextElement;
	final private MultiLevelModelTextEditor textEditor;
	
	public MultiLevelModelTemplateProposal(Template template,
			TemplateContext context, IRegion region, Image image, int relevance, Clabject type, 
			Connection typeConnection, Clabject container,  WeavingLink containerWeavingLink, 
			TextElement editedTextElement, MultiLevelModelTextEditor textEditor) {
		super(template, context, region, image, relevance);
		
		Assert.isNotNull(type);
		Assert.isNotNull(container);
		Assert.isNotNull(typeConnection);
		Assert.isNotNull(containerWeavingLink);
		Assert.isNotNull(editedTextElement);
		Assert.isNotNull(textEditor);
		
		this.type = type;
		this.typeConnection = typeConnection;
		this.container = container;
		this.containerWeavingLink = containerWeavingLink;
		this.editedTextElement = editedTextElement;
		this.textEditor = textEditor;
	}

	/**
	 * This method instantiates the created clabject, the connection it is connected through with its
	 * container and the inserts the text template into the graphical LML editor.
	 */
	@Override
	public void apply(ITextViewer viewer, char trigger, int stateMask,
			int offset) {

		textEditor.setProcessTextChanged(false);
		
		super.apply(viewer, trigger, stateMask, offset);
		
		textEditor.setProcessTextChanged(false);
		
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(type);
		CompoundCommand cCmd = new CompoundCommand();
		
		//Create and setup multi-level model element
		Entity instanceClabject = PLMFactory.eINSTANCE.createEntity();
		PLMFactory.eINSTANCE.configureClabject(type, instanceClabject);
		
		instanceClabject.setName("Created");
		for (Attribute attribute : instanceClabject.getEigenAttributes())
			attribute.setValue(attribute.getName());
		Command addInstanceClabjectCommand = AddCommand.create(domain, container.getModel(), PLMPackage.eINSTANCE.getModel_Content(), instanceClabject);
		cCmd.append(addInstanceClabjectCommand);
		
		//Create and setup new connection
		Connection instanceConnection = PLMFactory.eINSTANCE.createConnection();
		PLMFactory.eINSTANCE.configureClabject(typeConnection, instanceConnection);
		Participation containerParticipation = PLMFactory.eINSTANCE.createParticipation();
		containerParticipation.setDestination(container);
		instanceConnection.getParticipation().add(containerParticipation);
		Participation instanceParticipation = PLMFactory.eINSTANCE.createParticipation();
		instanceParticipation.setDestination(instanceClabject);
		instanceConnection.getParticipation().add(instanceParticipation);
		Command addConnectionCommand = AddCommand.create(domain, container.getModel(), PLMPackage.eINSTANCE.getModel_Content(), instanceConnection);
		cCmd.append(addConnectionCommand);
		
		//Create new classification for the instance clabject
		Classification instanceClabjectClassification = PLMFactory.eINSTANCE.createClassification();
		instanceClabjectClassification.setType(type);
		instanceClabjectClassification.setInstance(instanceClabject);
		instanceClabjectClassification.setKind(ClassificationKind.INSTANTIATION);
		Command addinstanceClabjectClassificationCommand = AddCommand.create(domain, container.getModel(), PLMPackage.eINSTANCE.getModel_Content(), instanceClabjectClassification);
		cCmd.append(addinstanceClabjectClassificationCommand);
		
		//Create new classification for the instance connection
		Classification instanceConnectionClassification = PLMFactory.eINSTANCE.createClassification();
		instanceConnectionClassification.setType(typeConnection);
		instanceConnectionClassification.setInstance(instanceConnection);
		instanceConnectionClassification.setKind(ClassificationKind.INSTANTIATION);
		Command addinstancteConnectionClassificationCommand = AddCommand.create(domain, container.getModel(), PLMPackage.eINSTANCE.getModel_Content(), instanceConnectionClassification);
		cCmd.append(addinstancteConnectionClassificationCommand);
		
		domain.getCommandStack().execute(cCmd);
		
		//Create new WeavingLink
		WeavingLink newClabjectWeavingLink = TextEditorUtil.createWeavingLink(instanceClabject, offset);
		
		//Insert before or behind model element?
		WeavingModel weavingModel = (WeavingModel)EcoreUtil.getRootContainer(containerWeavingLink);
		List<TextElement> editedTextElements = weavingModel.findTextElementForOffset(offset, SearchStrategy.ENTITY_PREFFERED);
		
		TextElement editedTextElement = null;
		
		//Look for the text element that is contained in the container weaving link
		for (TextElement e :editedTextElements)
			if (e.eContainer() == containerWeavingLink)
				editedTextElement = e;
		
		int indexToAdd = -1;
		
		//Insert between two child weaving links -> two text elements of the child weaving links
		//are found. Look where this weaving link is in the container weaving link and place new
		//model element behind the first one.
		if (editedTextElement == null)
			indexToAdd = containerWeavingLink.getChildren().indexOf(((WeavingLink)editedTextElements.get(0).eContainer())) + 1;
		else{
			indexToAdd = containerWeavingLink.getChildren().indexOf(editedTextElement);
		
			if (editedTextElement.getOffset() + editedTextElement.getLength() <= offset)
				indexToAdd += 1;
		}
		
		containerWeavingLink.getChildren().add(indexToAdd, newClabjectWeavingLink);
		viewer.invalidateTextPresentation();
		TextEditorUtil.calculateWeavingModelOffsets(((WeavingModel)EcoreUtil.getRootContainer(newClabjectWeavingLink)).getLinks().get(0), 0);
		
		//This is done for debug reasons to serialize the model on harddisk for viewing it.
		try {
			newClabjectWeavingLink.eResource().save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}