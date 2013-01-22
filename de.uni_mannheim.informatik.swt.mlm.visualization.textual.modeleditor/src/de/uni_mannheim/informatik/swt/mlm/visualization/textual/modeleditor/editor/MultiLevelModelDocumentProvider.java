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
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.ui.editors.text.FileDocumentProvider;



public class MultiLevelModelDocumentProvider extends FileDocumentProvider {
	
	private AnnotationModel annotationModel = new AnnotationModel();

	
	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		MultiLevelModelEditorInput input = (MultiLevelModelEditorInput)element;
		//annotationModel.connect(document);
		
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
	
	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element,
			IDocument document, boolean overwrite) throws CoreException {
		super.doSaveDocument(monitor, element, document, overwrite);
		
		MultiLevelModelEditorInput input = (MultiLevelModelEditorInput)element;
		
		try {
			input.getModelToEdit().eResource().save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public IAnnotationModel getAnnotationModel(Object element) {
		return annotationModel;
	}
}