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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor;

import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.editors.text.TextEditor;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultiLevelModelViewerConfiguration;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultilevelColorProvider;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

public class MultiLevelModelTextEditor extends TextEditor {

	private MultilevelColorProvider multilevelColorProvider;
	
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
		
		((ITextViewerExtension)getSourceViewer()).appendVerifyKeyListener(new VerifyKeyListener() {
			
			@Override
			public void verifyKey(VerifyEvent event) {
				
				//use event.stateMask to detect STRG+X etc.
				if (!
							//Character was pressed
							(event.keyCode >= 97 && event.keyCode <= 122)
							//Number was pressed
						|| 	(event.keyCode >= 48 && event.keyCode <= 57)
					)
					return;
				
				WeavingModel weavingModel = MultiLevelModelEditorInput.LatestInstance.getWeavingModel();
				TextElement textElement = weavingModel.findTextElementForOffset(((StyledText)event.getSource()).getCaretOffset()).get(0);
				
				//Not an Attribute is edited -> Drop changes!
				if ( !( ((WeavingLink)textElement.eContainer()).getModelElement() instanceof Attribute ) ){
					event.doit = false;
					System.out.println("aaaaahhhhh");
				}
			}
		});
		
//		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(new ISelectionListener() {
//			
//			@Override
//			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
//				if (selection instanceof TextSelection)
//					System.out.println(((TextSelection)selection).getOffset());
//			}
//		});
	}
}