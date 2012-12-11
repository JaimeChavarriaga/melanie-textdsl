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

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.swt.graphics.Image;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
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
		WeavingLink link = (WeavingLink)textElement.eContainer();
		
		if (link.getModelElement() instanceof Attribute)
			link = (WeavingLink)link.eContainer();
		
		Clabject textElementContainingClabject = (Clabject)link.getModelElement();
		
		Entity instance = PLMFactory.eINSTANCE.createEntity();
		
		PLMFactory.eINSTANCE.configureClabject(type, instance);
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(type);
		Command cmd = AddCommand.create(domain, textElementContainingClabject.getModel(), PLMPackage.eINSTANCE.getModel_Content(), instance);
		domain.getCommandStack().execute(cmd);
		
	}
}