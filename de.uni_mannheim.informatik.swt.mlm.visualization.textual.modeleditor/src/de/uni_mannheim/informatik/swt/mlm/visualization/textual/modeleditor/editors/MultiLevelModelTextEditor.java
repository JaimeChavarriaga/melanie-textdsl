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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.editors.text.TextEditor;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.Activator;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration.MultiLevelModelViewerConfiguration;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration.MultilevelColorProvider;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

public class MultiLevelModelTextEditor extends TextEditor {

	private MultilevelColorProvider multilevelColorProvider;
	private WeavingModel weavingModel;
	
	public MultiLevelModelTextEditor() {
		super();
		
		multilevelColorProvider = new MultilevelColorProvider();
		setSourceViewerConfiguration(new MultiLevelModelViewerConfiguration(multilevelColorProvider));
		setDocumentProvider(new MultiLevelModelDocumentProvider());
	}
	
	public void dispose() {
		multilevelColorProvider.dispose();
		super.dispose();
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		
		MultiLevelModelEditorInput input = (MultiLevelModelEditorInput)getEditorInput();
		weavingModel = input.getWeavingModel();
				
		for (WeavingLink link : weavingModel.getLinks()){
			completeWeavingModel(link, 0,  input.getModelText());
		}
		
		try {
			weavingModel.eResource().save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(new ISelectionListener() {
			
			@Override
			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
				if (selection instanceof TextSelection)
					System.out.println(((TextSelection)selection).getOffset());
			}
		});
	}
	
	@Override
	protected ISourceViewer createSourceViewer(Composite parent,
			IVerticalRuler ruler, int styles) {
		
		ISourceViewer sourceViewer = super.createSourceViewer(parent, ruler, styles);
		sourceViewer.addTextListener(new ITextListener() {
			
			@Override
			public void textChanged(TextEvent event) {
				//If there is no weaving model we cannot sync
				if (weavingModel == null)
					return;
				
				syncTextWithModel(event);
			}
		});
		
		return sourceViewer;
	}
	
	public static void completeWeavingModel(WeavingLink link, int index, String document){
		int start = index;
		
		for (TextElement element : link.getTextElement()){
			start = document.indexOf(element.getText(), start);
			int length = element.getText().length();
			element.setLenght(length);
			element.setOffset(start);
		}
		
		for (WeavingLink childLink : link.getChildren())
			completeWeavingModel(childLink, start, document);
	}
	
	public void syncTextWithModel(TextEvent event){
		int offset = event.getOffset();
		
		List<TextElement> possibleWeavingLinks = weavingModel.findTextElementForOffset(offset);
		if (possibleWeavingLinks.size() != 1)
			throw new UnsupportedOperationException("Operation not supported!");
		
		TextElement textElement = possibleWeavingLinks.get(0);
		WeavingLink link = (WeavingLink)textElement.eContainer();
		
		if (event.getReplacedText() == null)
		 syncTextInserted(event, textElement, link);
		else if (event.getText().equals("") && event.getReplacedText() != null)
			syncTextRemoved(event, textElement, link);
	}
	
	public void syncTextInserted(TextEvent event, TextElement textElement, WeavingLink link){
		int relativeOffset = event.getOffset() - textElement.getOffset();
		String firstPart = textElement.getText().substring(0, relativeOffset);
		String secondPart = textElement.getText().substring(relativeOffset);
		String newString = firstPart + event.getText() + secondPart;
		textElement.setText(newString);
		
		if (link.getModelElement() instanceof Attribute){
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(link.getModelElement()); 
			Command cmd = SetCommand.create(domain, link.getModelElement(), PLMPackage.eINSTANCE.getAttribute_Value(), newString);
			domain.getCommandStack().execute(cmd);
		}
	}
	
	public void syncTextRemoved(TextEvent event, TextElement textElement, WeavingLink link){
		int relativeOffset = event.getOffset() - textElement.getOffset();
		int lengthToRemove = event.getLength();
		String firstPart = textElement.getText().substring(0, relativeOffset);
		String secondPart = textElement.getText().substring(relativeOffset + lengthToRemove);
		String newString = firstPart + secondPart;
		textElement.setText(newString);
		
		if (link.getModelElement() instanceof Attribute){
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(link.getModelElement()); 
			Command cmd = SetCommand.create(domain, link.getModelElement(), PLMPackage.eINSTANCE.getAttribute_Value(), newString);
			domain.getCommandStack().execute(cmd);
		}
	}
}