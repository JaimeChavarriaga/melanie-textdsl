package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.jface.text.source.ISourceViewer;

import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

/**
 * This class is not used at the moment as sync of newly created model elements
 * does not work because dirty regions are not created correctly for these.
 *
 */
public class SyncModelAndTextReconcilingStrategy implements
		IReconcilingStrategy, IReconcilingStrategyExtension {

	private WeavingModel weavingModel;
	private ISourceViewer sourceViewer;
	
	private static IDocument document;
	
	
	public SyncModelAndTextReconcilingStrategy(WeavingModel weavingModel, ISourceViewer sourceViewer){
		this.weavingModel = weavingModel;
		this.sourceViewer = sourceViewer;
	}
	
	@Override
	public void initialReconcile() {
		// Do nothing
	}
	
	@Override
	public void setProgressMonitor(IProgressMonitor monitor) {
		// Do nothing
	}

	@Override
	public void setDocument(IDocument document) {
		this.document = document;
	}

	@Override
	public void reconcile(DirtyRegion dirtyRegion, IRegion subRegion) {
		//If there is no weaving model we cannot sync
		
	}

	@Override
	public void reconcile(IRegion partition) {
		// Do nothing

	}
}