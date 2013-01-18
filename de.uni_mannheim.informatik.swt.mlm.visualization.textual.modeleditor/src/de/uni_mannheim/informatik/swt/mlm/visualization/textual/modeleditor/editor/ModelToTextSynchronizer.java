/*******************************************************************************
 * Copyright (c) 2013 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/ 
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor;

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.BadLocationException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

/**
 * 
 * This class is responsible for syncing changes made in the multi-level model
 * with the text view.
 * 
 */
public class ModelToTextSynchronizer implements ResourceSetListener {

	private WeavingModel weavingModel;
	private MultiLevelModelTextEditor textEditor;
	private IDocument document;
	
	public ModelToTextSynchronizer(WeavingModel weavingModel, MultiLevelModelTextEditor textEditor, IDocument document) {
		this.weavingModel = weavingModel;
		this.textEditor = textEditor;
		this.document = document;
	}
	
	@Override
	public NotificationFilter getFilter() {
		return null;
	}

	@Override
	public Command transactionAboutToCommit(ResourceSetChangeEvent event)
			throws RollbackException {
		return null;
	}

	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		
		for (Notification n : event.getNotifications())
			if (n.getFeature() instanceof EStructuralFeature
					&& ((EStructuralFeature)n.getFeature()).getName().equals("value")){
			Attribute attribute = (Attribute)n.getNotifier();
			
			List<WeavingLink> attributeLinks = weavingModel.findLinkForPLMElement(attribute);
			
			if (attributeLinks.size() != 1)
				return;
			
			WeavingLink attributeLink = attributeLinks.get(0);
			TextElement valueTextElement = (TextElement)attributeLink.getChildren().get(0);
			int offset = valueTextElement.getOffset();
			int length = valueTextElement.getLength();
			
			try {
				//Check if change is already in weaving model -> No action required
				if (valueTextElement.getText().equals(n.getNewStringValue()))
					return;
				
				document.replace(offset, length, n.getNewStringValue());
				valueTextElement.setOffset(offset);
				valueTextElement.setLength(length);
				valueTextElement.setText(n.getNewStringValue());
				MultiLevelModelTextEditor.recalculateOffset(((WeavingModel)EcoreUtil.getRootContainer(attributeLink)).getLinks().get(0), 0);
				textEditor.invalidateTextPresentation();
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean isAggregatePrecommitListener() {
		return false;
	}

	@Override
	public boolean isPrecommitOnly() {
		return false;
	}

	@Override
	public boolean isPostcommitOnly() {
		return true;
	}

}
