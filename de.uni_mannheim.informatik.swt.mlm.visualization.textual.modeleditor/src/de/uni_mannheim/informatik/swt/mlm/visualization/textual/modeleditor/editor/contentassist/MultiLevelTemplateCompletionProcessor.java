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
import java.util.List;

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

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelEditorInput;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
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
		
		Template t = new Template("Create something!", "Creates Something", MultiLevelTemplateContextType.CONTEXT_TYPE, "Hello \u00AB${name}\u00BB and \u00AB${name2}\u00BB from \u00AB${name3}\u00BB!", true);
		DocumentTemplateContext context = new DocumentTemplateContext(new MultiLevelTemplateContextType(), viewer.getDocument(), offset, 0);
		TemplateProposal proposal = new TemplateProposal(t, context, new Region(offset, 0), null, 100);	
		proposals[0] = proposal;
		
		return proposals;
	}
	
	public List<String> getDSLTemplates(ITextViewer viewer, int offset){
		List<String> result = new ArrayList<>();
		
		//Search the modele element to wich the text belongs to
		List<TextElement> textElements = weavingModel.findTextElementForOffset(offset);
		if (textElements.size() == 0)
			return result;
		
		TextElement textElement = weavingModel.findTextElementForOffset(offset).get(0);
		Element textContainingModelElement = ((WeavingLink)textElement.eContainer()).getModelElement();
		
		//We are only interested in Clabjects for offering templates which allow create new clabjects
		if (! (textContainingModelElement instanceof Clabject))
			return result;
		
		return result;
	}
}