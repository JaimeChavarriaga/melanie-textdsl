package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration;

import java.util.List;

import org.eclipse.jface.text.IDocument;
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
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.XMLScanner;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.XMLTagScanner;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;

public class MultiLevelModelViewerConfiguration extends SourceViewerConfiguration {
	private XMLDoubleClickStrategy doubleClickStrategy;
	private MultilevelCodeScanner multilevelCodeScannerKeywords;
	private MultilevelCodeScanner multilevelCodeKeywords;
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

	protected MultilevelCodeScanner getXMLScanner() {
		if (multilevelCodeKeywords == null) {
			multilevelCodeKeywords = new MultilevelCodeScanner(multilevelColorProvider);
			multilevelCodeKeywords.setDefaultReturnToken(
				new Token(
					new TextAttribute(
						multilevelColorProvider.getColor(IMultiLevelModelColorConstants.DEFAULT))));
		}
		return multilevelCodeKeywords;
	}
	
	protected MultilevelCodeScanner getXMLTagScanner() {
		if (multilevelCodeScannerKeywords == null) {
			multilevelCodeScannerKeywords = new MultilevelCodeScanner(multilevelColorProvider);
			multilevelCodeScannerKeywords.setDefaultReturnToken(
				new Token(
					new TextAttribute(
						multilevelColorProvider.getColor(IMultiLevelModelColorConstants.TAG))));
		}
		return multilevelCodeScannerKeywords;
	}

	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		
		
		for(String contentType : MultiLevelModelPartitionScanner.getPartitionNames()){
		
			DefaultDamagerRepairer dr =new DefaultDamagerRepairer(getXMLTagScanner());
			reconciler.setDamager(dr, contentType);
			reconciler.setRepairer(dr, contentType);
		}
//
		//Here I need something 
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getXMLScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
//
//		NonRuleBasedDamagerRepairer ndr =
//			new NonRuleBasedDamagerRepairer(
//				new TextAttribute(
//					multilevelColorProvider.getColor(IMultiLevelModelColorConstants.XML_COMMENT)));
//		reconciler.setDamager(ndr, MultiLevelModelPartitionScanner.XML_COMMENT);
//		reconciler.setRepairer(ndr, MultiLevelModelPartitionScanner.XML_COMMENT);

		return reconciler;
	}

}