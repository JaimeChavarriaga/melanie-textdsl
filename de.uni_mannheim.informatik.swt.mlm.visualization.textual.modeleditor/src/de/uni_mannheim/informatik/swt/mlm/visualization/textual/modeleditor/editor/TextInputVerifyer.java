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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

/**
 * Verifies the user input. Deletes clabjects if a literal is deleted.
 */
public class TextInputVerifyer implements VerifyKeyListener{
	
	private ISourceViewer sourceViewer;
	private MultiLevelModelTextEditor textEditor;
	
	public TextInputVerifyer(ISourceViewer sourceViewer, MultiLevelModelTextEditor textEditor){
		this.sourceViewer = sourceViewer;
		this.textEditor = textEditor;
	}
	
	@Override
	public void verifyKey(VerifyEvent event) {
		
		//use event.stateMask to detect STRG+X etc.
		if (!
					//Character was pressed
					(	(event.keyCode >= 91 && event.keyCode <= 127)
					//Number was pressed or math signs such as "-"
				|| 	(event.keyCode >= 32 && event.keyCode <= 61)
					// "/"	"+"
				||	(event.keyCode >= 16777258 && event.keyCode <= 16777296)
				||  (event.keyCode >= 131072 && event.keyCode <= 131072)
					//Enter key, Back space
				||	(event.keyCode >= 8 && event.keyCode <= 13)
				)
			)
			return;
		
		WeavingModel weavingModel = MultiLevelModelEditorInput.LatestInstance.getWeavingModel();
		List<TextElement> textElements = weavingModel.findTextElementForOffset(((StyledText)event.getSource()).getCaretOffset(), SearchStrategy.ATTRIBUTE_PREFFERED);
		TextElement textElement = textElements.get(0);
		
		if ((event.keyCode == 127 || event.keyCode == 8) 
				&& ((WeavingLink)textElement.eContainer()).getModelElement() instanceof Clabject){
			event.doit = false;
			removeClabjectFromTextAndModel((WeavingLink)textElement.eContainer());
			return;
		}
		
		//Not an Attribute is edited -> Drop changes!
		if ( !( ((WeavingLink)textElement.eContainer()).getModelElement() instanceof Attribute ) ){
			event.doit = false;
		}
	}
	
	private void removeClabjectFromTextAndModel(WeavingLink linkToClabject){
		MessageBox deleteClabjectBox = new MessageBox(PlatformUI.getWorkbench().getDisplay().getActiveShell(), SWT.ICON_QUESTION | SWT.YES | SWT.NO);
		deleteClabjectBox.setMessage("Do you want to delete " + linkToClabject.getModelElement().getName() + "?");
		deleteClabjectBox.setText("Delete Clabject");
		
		if (deleteClabjectBox.open() == SWT.NO)
			return;
		
		CompoundCommand cCmd = new CompoundCommand();
		
		Clabject clabjectToDelete = (Clabject)linkToClabject.getModelElement();
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(clabjectToDelete);
		cCmd.append(RemoveCommand.create(domain, clabjectToDelete));
		
		List<Classification> classificationsToDelete = new ArrayList<>(clabjectToDelete.getClassificationsAsInstance());
		classificationsToDelete.addAll(clabjectToDelete.getClassificationsAsType());
		if (classificationsToDelete.size() > 0)
			cCmd.append(RemoveCommand.create(domain, classificationsToDelete));
		
		for (Clabject c : clabjectToDelete.getEigenConnections()){
			List<Classification> connectionClassificationsToDelete = new ArrayList<>(c.getClassificationsAsInstance());
			connectionClassificationsToDelete.addAll(c.getClassificationsAsType());
			if (connectionClassificationsToDelete.size() > 0)
				cCmd.append(RemoveCommand.create(domain, connectionClassificationsToDelete));
		}
		
		
		if (clabjectToDelete.getEigenConnections().size() > 0)
			cCmd.append(RemoveCommand.create(domain, clabjectToDelete.getEigenConnections()));
		
		domain.getCommandStack().execute(cCmd);
		
		EcoreUtil.delete(linkToClabject);

		//Remove the whole text from the model
		try {
			textEditor.setProcessTextChanged(false);
			sourceViewer.getDocument().replace(linkToClabject.calculateOffset(), linkToClabject.calculateLength(), "");
		} catch (BadLocationException e) {
			textEditor.setProcessTextChanged(false);
			e.printStackTrace();
		}
	}
}
