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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.editors.text.TextEditor;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultiLevelModelViewerConfiguration;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultilevelColorProvider;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

public class MultiLevelModelTextEditor extends TextEditor {

	public final static String ID = "de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor";
	
	private MultilevelColorProvider multilevelColorProvider;
	private WeavingModel weavingModel;
	private MarkerAnnotationSynchronizer markerAnnotationSynchronizer;
	private IResource resource;
	
	public MultiLevelModelTextEditor() {
		super();

		weavingModel = MultiLevelModelEditorInput.LatestInstance.getWeavingModel();
		
		//Find the platform resource for the currently edited file
		resource = ResourcesPlugin.getWorkspace().getRoot().findMember(MultiLevelModelEditorInput.LatestInstance.getModelToEdit().eResource().getURI().toPlatformString(true));

		multilevelColorProvider = new MultilevelColorProvider();
		setSourceViewerConfiguration(new MultiLevelModelViewerConfiguration(multilevelColorProvider));
		
		setDocumentProvider(new MultiLevelModelDocumentProvider());
	}
	
	@Override
	public void dispose() {
		multilevelColorProvider.dispose();
		resource.getWorkspace().removeResourceChangeListener(markerAnnotationSynchronizer);
		super.dispose();
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		
		markerAnnotationSynchronizer = new MarkerAnnotationSynchronizer(resource, weavingModel, getDocumentProvider(), getEditorInput());
		resource.getWorkspace().addResourceChangeListener(markerAnnotationSynchronizer, IResourceChangeEvent.POST_CHANGE);
		
		//Synchronization from model to text
		TransactionUtil.getEditingDomain(MultiLevelModelEditorInput.LatestInstance.getModelToEdit()).addResourceSetListener(new ModelToTextSynchronizer(weavingModel, this, getDocumentProvider().getDocument(getEditorInput())));
		
		//Synchronization from text to model
		((ITextViewerExtension)getSourceViewer()).appendVerifyKeyListener(new TextInputVerifyer(getSourceViewer()));

		// Cannot use IReconcilingStrategy and IReconcilingStrategy extension because dirty regions
		// of model elements which are inserted through text editor.
		getSourceViewer().addTextListener(new TextToModelSynchronizer(getSourceViewer(), weavingModel));
		
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(new TextSelectionToModelSynchronizer(weavingModel));
	}
	
	public void invalidateTextPresentation(){
		getSourceViewer().invalidateTextPresentation();
	}
	
	private static boolean processTextChanged = true;
	
	/**
	 * This is set true by MultiLevelModelTemplateProposal to prevent updating.
	 * Only valid for one change e.g. applying an template.
	 */
	public static void setProcessTextChanged(boolean process){
		processTextChanged = process;
	}
	
	public static boolean getProcessTextChanger(){
		return processTextChanged;
	}
}