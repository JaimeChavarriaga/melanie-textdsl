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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelEditorInput;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelTextEditor;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.contentassist.MultiLevelTemplateCompletionProcessor;

public class MultiLevelModelViewerConfiguration extends SourceViewerConfiguration {
	
//	private MultilevelLiteralScanner multilevelLiteralScanner;
//	private MultilevelColorProvider multilevelColorProvider;
	final private MultiLevelModelTextEditor textEditor;

	public MultiLevelModelViewerConfiguration(MultilevelColorProvider multilevelColorProvider, MultiLevelModelTextEditor textEditor) {
//		this.multilevelColorProvider = multilevelColorProvider;
		this.textEditor = textEditor;
	}
	
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[]{IDocument.DEFAULT_CONTENT_TYPE};
	}
	
//	/**
//	 * Responsible for marking keywords with the right colors 
//	 * 
//	 * @return
//	 */
//	protected MultilevelLiteralScanner getMultiLevelModelKeywordScanner() {
//		if (multilevelLiteralScanner == null) {
//			multilevelLiteralScanner = MultilevelLiteralScanner.LATEST_INSTANCE;
//			multilevelLiteralScanner.setColorProvider(multilevelColorProvider);
//			multilevelLiteralScanner.init();
//			multilevelLiteralScanner.setDefaultReturnToken(
//				new Token(
//					new TextAttribute(
//						multilevelColorProvider.getColor(multilevelColorProvider.getMultiLevelModelColorConstants().getColor(multilevelColorProvider.getMultiLevelModelColorConstants().DEFAULT_KEY)))));
//		}
//		return multilevelLiteralScanner;
//	}

	/**
	 * Responsible for syntax highlighting
	 */
	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();
		sourceViewer.getDocument();
		//************************************
		// Keyword scanner
		//************************************
		//for(String contentType : MultiLevelModelPartitionScanner.LatestInstance.getPartitionNames()){
//		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getMultiLevelModelKeywordScanner());
//		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
//		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		//}

		return reconciler;
	}	
	
	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		
		ContentAssistant contentAssistant = new ContentAssistant();
		contentAssistant.setContentAssistProcessor(new MultiLevelTemplateCompletionProcessor(MultiLevelModelEditorInput.LatestInstance.getWeavingModel(), textEditor), IDocument.DEFAULT_CONTENT_TYPE);
		
		contentAssistant.enableAutoActivation(true);
		contentAssistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		
		return contentAssistant;
	}
	
//	/**
//	 * Responsible for syncing text and model
//	 * For more information on reconcilers see http://blog.darevay.com/2007/11/the-eclipse-reconciler/
//	 * http://wiki.eclipse.org/FAQ_How_do_I_use_a_model_reconciler%3F
//	 */
//	@Override
//	public IReconciler getReconciler(ISourceViewer sourceViewer) {
//				
//		SyncModelAndTextReconcilingStrategy reconcilingStrategy = new SyncModelAndTextReconcilingStrategy(MultiLevelModelEditorInput.LatestInstance.getWeavingModel(), sourceViewer);
//		
//		MonoReconciler reconciler = new MonoReconciler(reconcilingStrategy, true);
//		reconciler.install(sourceViewer);
//		reconciler.setIsIncrementalReconciler(true);
//		
//		// Very low delay is needed to keep the text in sync with weaving model
//		// otherwise the user loses some characters while typing as he/she always
//		// runs into a locked region.
//		reconciler.setDelay(0);
//		
//		return reconciler;
//	}
}