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

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration.MultiLevelModelPartitionScanner;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.textualdslmodelinterpreter.TextualDSLModelInterpreter;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;

/**
 * http://wiki.eclipse.org/FAQ_How_do_I_open_an_editor_on_something_that_is_not_a_file%3F
 */
public class MultiLevelModelEditorInput implements IStorageEditorInput {

	private IStorage storage;
	private Model modelToEdit;
	
	private MultiLevelModelPartitionScanner partitionScanner;
	
	public MultiLevelModelPartitionScanner getMultiLevelModelPartitionScanner(){
		return partitionScanner;
	}
	
	public MultiLevelModelEditorInput(Model modelToEdit){
		this.modelToEdit = modelToEdit;
		storage = new MultiLevelModelStorage(modelToEdit);
		partitionScanner = new MultiLevelModelPartitionScanner();
	}
	
	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return modelToEdit.getOntology().getName() + "::" + modelToEdit.getName();
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return modelToEdit.getOntology().getName() + "::" + modelToEdit.getName();
	}

	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}

	@Override
	public IStorage getStorage() throws CoreException {
		return storage;
	}
	
	public class MultiLevelModelStorage implements IStorage{

		private Model modelToEdit;
		
		public MultiLevelModelStorage(Model modelToEdit) {
			this.modelToEdit = modelToEdit;
		}
		
		@Override
		public Object getAdapter(Class adapter) {
			return null;
		}

		@Override
		public InputStream getContents() throws CoreException {
			TextualDSLModelInterpreter interpreter = new TextualDSLModelInterpreter(partitionScanner);
			String input = interpreter.getTextualRepresentation(modelToEdit);
			input = String.format(input);
			return new ByteArrayInputStream((input!= "" ? input : "No textual representation found!").getBytes());
		}

		@Override
		public IPath getFullPath() {
			return null;
		}

		@Override
		public String getName() {
			return modelToEdit.getOntology().getName() + "::" + modelToEdit.getName();
		}

		@Override
		public boolean isReadOnly() {
			return false;
		}
	}
}
