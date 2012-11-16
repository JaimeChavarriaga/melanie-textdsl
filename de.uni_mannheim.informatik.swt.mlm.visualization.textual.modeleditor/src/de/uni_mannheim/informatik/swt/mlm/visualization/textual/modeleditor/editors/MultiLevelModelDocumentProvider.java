package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration.MultiLevelModelPartitionScanner;

public class MultiLevelModelDocumentProvider extends FileDocumentProvider {

	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		if (document != null) {
			IDocumentPartitioner partitioner =
				new FastPartitioner(
					new MultiLevelModelPartitionScanner(),
					MultiLevelModelPartitionScanner.getPartitionNames());
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}
}