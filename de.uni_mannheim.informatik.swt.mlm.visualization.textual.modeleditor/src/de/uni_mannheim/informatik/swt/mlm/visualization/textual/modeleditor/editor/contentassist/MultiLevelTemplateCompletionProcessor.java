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

public class MultiLevelTemplateCompletionProcessor extends
		TemplateCompletionProcessor {
	
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
		
		Template t = new Template("Create something!", "Creates Something", MultiLevelTemplateContextType.CONTEXT_TYPE, "Hello \u00AB${name}\u00BB and \u00AB${name2}\u00BB from \u00AB${name3}\u00BB!", true);
		DocumentTemplateContext context = new DocumentTemplateContext(new MultiLevelTemplateContextType(), viewer.getDocument(), offset, 0);
		TemplateProposal proposal = new TemplateProposal(t, context, new Region(offset, 0), null, 100);	
		proposals[0] = proposal;
		return proposals;
	}
}
