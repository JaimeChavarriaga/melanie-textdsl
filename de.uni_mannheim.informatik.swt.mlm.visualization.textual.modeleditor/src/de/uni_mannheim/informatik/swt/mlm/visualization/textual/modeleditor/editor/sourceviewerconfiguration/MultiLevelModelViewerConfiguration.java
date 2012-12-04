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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration;

import org.eclipse.core.internal.content.ContentType;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelEditorInput;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.contentassist.MultiLevelTemplateCompletionProcessor;

public class MultiLevelModelViewerConfiguration extends SourceViewerConfiguration {
	
	private MultilevelLiteralScanner multilevelLiteralScanner;
	private MultilevelColorProvider multilevelColorProvider;

	public MultiLevelModelViewerConfiguration(MultilevelColorProvider multilevelColorProvider) {
		this.multilevelColorProvider = multilevelColorProvider;
	}
	
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		//TODO:This could not be working anymore if multiple editors are opened at the same time	
		return MultiLevelModelPartitionScanner.LatestInstance.getPartitionNames();
//		return MultiLevelModelPartitionScanner.getPartitionNames();
	}
	
	protected MultilevelLiteralScanner getMultiLevelModelKeywordScanner() {
		if (multilevelLiteralScanner == null) {
			multilevelLiteralScanner = MultilevelLiteralScanner.LATEST_INSTANCE;
			multilevelLiteralScanner.setColorProvider(multilevelColorProvider);
			multilevelLiteralScanner.init();
			multilevelLiteralScanner.setDefaultReturnToken(
				new Token(
					new TextAttribute(
						multilevelColorProvider.getColor(multilevelColorProvider.getMultiLevelModelColorConstants().getColor(multilevelColorProvider.getMultiLevelModelColorConstants().DEFAULT_KEY)))));
		}
		return multilevelLiteralScanner;
	}

	/**
	 * Responsible for syntax highlighting
	 */
	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();
		sourceViewer.getDocument();
		//TODO:This could not be working anymore if multiple editors are opened at the same time
		for(String contentType : MultiLevelModelPartitionScanner.LatestInstance.getPartitionNames()){
			DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getMultiLevelModelKeywordScanner());
			reconciler.setDamager(dr, contentType);
			reconciler.setRepairer(dr, contentType);
		}

		return reconciler;
	}
	
	/**
	 * Responsible for syncing text and model
	 * For more information on reconcilers see http://blog.darevay.com/2007/11/the-eclipse-reconciler/
	 * http://wiki.eclipse.org/FAQ_How_do_I_use_a_model_reconciler%3F
	 */
	@Override
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
				
		SyncModelAndTextReconcilingStrategy reconcilingStrategy = new SyncModelAndTextReconcilingStrategy(MultiLevelModelEditorInput.LatestInstance.getWeavingModel(), MultiLevelModelEditorInput.LatestInstance);
		
		MonoReconciler reconciler = new MonoReconciler(reconcilingStrategy, true);
		reconciler.install(sourceViewer);
		reconciler.setIsIncrementalReconciler(true);
		reconciler.setDelay(200);
		return reconciler;
	}
	
	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		
		ContentAssistant contentAssistant = new ContentAssistant();
		for (String contentType : MultiLevelModelPartitionScanner.LatestInstance.getPartitionNames())
			contentAssistant.setContentAssistProcessor(new MultiLevelTemplateCompletionProcessor(MultiLevelModelEditorInput.LatestInstance.getWeavingModel()), contentType);
		
		contentAssistant.enableAutoActivation(true);
		contentAssistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		
		return contentAssistant;
	}
}

//private XMLDoubleClickStrategy doubleClickStrategy;
//public ITextDoubleClickStrategy getDoubleClickStrategy(
//		ISourceViewer sourceViewer,
//		String contentType) {
//		if (doubleClickStrategy == null)
//			doubleClickStrategy = new XMLDoubleClickStrategy();
//		return doubleClickStrategy;
//}