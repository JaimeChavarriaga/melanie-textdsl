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

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.source.ISourceViewer;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.util.TextEditorUtil;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

/**
 * Syncs text from text editor to multi-level and weaving model
 *
 */
public class TextToModelSynchronizer implements ITextListener {

	final private ISourceViewer sourceViewer;
	final private WeavingModel weavingModel;
	
	private boolean processTextChanged = true;
	
	public TextToModelSynchronizer(ISourceViewer sourceViewer, WeavingModel weavingModel){
		this.sourceViewer = sourceViewer;
		this.weavingModel = weavingModel;
	}
	
	@Override
	public void textChanged(TextEvent event) {
		if (weavingModel == null)
			return;
		
		//This condition is needed because the text change listener is called
		//for changes which are not done through user input with offset 0 and
		//length = document length
		if (event.getDocumentEvent() != null)
			syncTextWithModel(event);
	}
	
	/**
	 * Delegates to the methods for instering/removing text
	 * 
	 * @param dirtyRegion
	 */
	public void syncTextWithModel(TextEvent event){
		
		if (! processTextChanged){
			processTextChanged = true;
			return;
		}
		
		int offset = event.getOffset();
		
		List<TextElement> possibleWeavingLinks = weavingModel.findTextElementForOffset(offset, SearchStrategy.ATTRIBUTE_PREFFERED);
		
		if (possibleWeavingLinks.size() != 1)
				return;

		
		TextElement textElement = possibleWeavingLinks.get(0);
		WeavingLink link = (WeavingLink)textElement.eContainer();
		
		if (event.getReplacedText() != null && event.getText().length() != 0){
			syncTextRemoved(event.getReplacedText(), offset, textElement, link);
			syncTextInserted(event.getText(), offset, textElement, link);
		}
		//Insert by typing without selection
		else if (event.getReplacedText() == null)
			syncTextInserted(event.getText(), offset, textElement, link);
		//Remove
		else if (event.getReplacedText() != null && event.getText().length() == 0)
			syncTextRemoved(event.getReplacedText(), offset, textElement, link);
		
		sourceViewer.invalidateTextPresentation();
	}
	
	/**
	 * Syncs multi-level model and weaving model on text insert
	 * 
	 * @param dirtyRegion
	 * @param textElement
	 * @param link
	 */
	public void syncTextInserted(String newText, int offset, final TextElement textElement, final WeavingLink link){
		int relativeOffset = offset - textElement.getOffset();
		
		if (relativeOffset > textElement.getText().length())
			return;
		
		String firstPart = textElement.getText().substring(0, relativeOffset);
		String secondPart = textElement.getText().substring(relativeOffset);
		final String newString = firstPart + newText + secondPart;
		textElement.setText(newString);
		
		if (link.getModelElement() instanceof Attribute)
			changeModel(newString, link, textElement);
		//If a TextElement that does belong to a Attribute is edited
		//only the offset needs to be recalculated. Nothing needs
		//to be written into the multi-level model
		else
			TextEditorUtil.calculateWeavingModelOffsets(((WeavingModel)EcoreUtil.getRootContainer(textElement)).getLinks().get(0), 0);
	}
	
	/**
	 * Syncs multi-level and weaving model on text remove
	 * 
	 * @param dirtyRegion
	 * @param textElement
	 * @param link
	 */
	public void syncTextRemoved(String removedText, int offset, TextElement textElement, WeavingLink link){
		int relativeOffset = offset - textElement.getOffset();
		
		if (relativeOffset > textElement.getText().length())
			return;
		
		int lengthToRemove = removedText.length();
		String firstPart = textElement.getText().substring(0, relativeOffset);
		
		if (relativeOffset + lengthToRemove > textElement.getText().length())
			return;
			
		String secondPart = textElement.getText().substring(relativeOffset + lengthToRemove);
		final String newString = firstPart + secondPart;
		textElement.setText(newString);
		
		if (link.getModelElement() instanceof Attribute)
			changeModel(newString, link, textElement);
		//If a TextElement that does belong to a Attribute is edited
		//only the offset needs to be recalculated. Nothing needs
		//to be written into the multi-level model
		else
			TextEditorUtil.calculateWeavingModelOffsets(((WeavingModel)EcoreUtil.getRootContainer(textElement)).getLinks().get(0), 0);
	}
	
	/**
	 * Changes the text in the multi-level and weaving model and updates 
	 * offset, length etc. in the weaving model.
	 * 
	 * @param newString
	 * @param link
	 * @param textElement
	 */
	private void changeModel(final String newString, final WeavingLink link, final TextElement textElement){
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(link.getModelElement());
		//Update the multi-level model
		Command updateMultiLevelModelCommand = SetCommand.create(domain, link.getModelElement(), PLMPackage.eINSTANCE.getAttribute_Value(), newString);
		domain.getCommandStack().execute(updateMultiLevelModelCommand);
		
		textElement.setText(newString);
		TextEditorUtil.calculateWeavingModelOffsets(((WeavingModel)EcoreUtil.getRootContainer(link)).getLinks().get(0), 0);
		try {
			weavingModel.eResource().save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Because this reconciler works asynchronous to the UI thread the
		// damage repairer etc. are already run before the weaving model is
		// updated. Thus, it must be run mannualy after updating the weaving
		// model.
		sourceViewer.invalidateTextPresentation();
	}
}
