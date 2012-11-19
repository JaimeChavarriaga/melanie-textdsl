package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration;

import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.IMultiLevelModelColorConstants;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.XMLDoubleClickStrategy;

public class MultiLevelModelViewerConfiguration extends SourceViewerConfiguration {
	private XMLDoubleClickStrategy doubleClickStrategy;
	private MultilevelKeywordScanner multilevelKeywordScanner;
	//private XMLScanner scanner;
	private MultilevelColorProvider multilevelColorProvider;

	public MultiLevelModelViewerConfiguration(MultilevelColorProvider multilevelColorProvider) {
		this.multilevelColorProvider = multilevelColorProvider;
	}
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return MultiLevelModelPartitionScanner.getPartitionNames();
	}
	public ITextDoubleClickStrategy getDoubleClickStrategy(
		ISourceViewer sourceViewer,
		String contentType) {
		if (doubleClickStrategy == null)
			doubleClickStrategy = new XMLDoubleClickStrategy();
		return doubleClickStrategy;
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

		
		
		for(String contentType : MultiLevelModelPartitionScanner.getPartitionNames()){
		
			DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getMultiLevelModelKeywordScanner());
			reconciler.setDamager(dr, contentType);
			reconciler.setRepairer(dr, contentType);
		}

		return reconciler;
	}

}