package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class MultiLevelModelDocumentProvider extends FileDocumentProvider {

	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		MultiLevelModelEditorInput input = (MultiLevelModelEditorInput)element;
		
		if (document != null) {
			IDocumentPartitioner partitioner =
				new FastPartitioner(
					input.getMultiLevelModelPartitionScanner(),
					input.getMultiLevelModelPartitionScanner().getPartitionNames());
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}
}