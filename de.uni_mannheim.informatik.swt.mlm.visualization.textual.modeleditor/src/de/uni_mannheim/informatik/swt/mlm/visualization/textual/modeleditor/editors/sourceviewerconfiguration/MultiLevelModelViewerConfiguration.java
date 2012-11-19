package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

public class MultiLevelModelViewerConfiguration extends SourceViewerConfiguration {
	
	private MultilevelKeywordScanner multilevelKeywordScanner;
	private MultilevelColorProvider multilevelColorProvider;

	public MultiLevelModelViewerConfiguration(MultilevelColorProvider multilevelColorProvider) {
		this.multilevelColorProvider = multilevelColorProvider;
	}
	
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		//TODO:This could not be working anymore if multiple editors are opened at the same time	
		return MultiLevelModelPartitionScanner.LatestInstance.getPartitionNames();
//		return MultiLevelModelPartitionScanner.getPartitionNames();
	}
	
	protected MultilevelKeywordScanner getMultiLevelModelKeywordScanner() {
		if (multilevelKeywordScanner == null) {
			multilevelKeywordScanner = new MultilevelKeywordScanner(multilevelColorProvider);
			multilevelKeywordScanner.setDefaultReturnToken(
				new Token(
					new TextAttribute(
						multilevelColorProvider.getColor(IMultiLevelModelColorConstants.DEFAULT))));
		}
		return multilevelKeywordScanner;
	}

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
}

//private XMLDoubleClickStrategy doubleClickStrategy;
//public ITextDoubleClickStrategy getDoubleClickStrategy(
//		ISourceViewer sourceViewer,
//		String contentType) {
//		if (doubleClickStrategy == null)
//			doubleClickStrategy = new XMLDoubleClickStrategy();
//		return doubleClickStrategy;
//}