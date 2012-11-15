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
