package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class MultiLevelModelTextEditor extends TextEditor {

	private ColorManager colorManager;

	public MultiLevelModelTextEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new MultiLevelModelViewerConfiguration(colorManager));
		setDocumentProvider(new MultiLevelModelDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
