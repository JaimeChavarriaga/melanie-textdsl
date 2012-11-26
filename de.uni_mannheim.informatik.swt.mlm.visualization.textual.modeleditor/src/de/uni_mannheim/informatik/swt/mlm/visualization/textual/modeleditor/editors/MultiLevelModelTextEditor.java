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
	
//	@Override
//	public void createPartControl(Composite parent) {
//		super.createPartControl(parent);
//		
//		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(new ISelectionListener() {
//			
//			@Override
//			public void selectionChanged(IWorkbenchPart part, ISelection selection) {
//				if (selection instanceof TextSelection)
//					System.out.println(((TextSelection)selection).getOffset());
//			}
//		});
//	}
}