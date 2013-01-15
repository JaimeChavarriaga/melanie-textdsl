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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultiLevelModelColorConstants;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultiLevelModelPartitionScanner;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultilevelLiteralScanner;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.textualdslmodelinterpreter.TextualDSLModelInterpreter;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.M2TWeavingFactory;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

/**
 * http://wiki.eclipse.org/FAQ_How_do_I_open_an_editor_on_something_that_is_not_a_file%3F
 */
public class MultiLevelModelEditorInput implements IStorageEditorInput {

	private IStorage storage;
	private Model modelToEdit;
	private String modelText;
	
	private MultiLevelModelPartitionScanner partitionScanner;
	private MultilevelLiteralScanner keyWordScanner;
	private MultiLevelModelColorConstants colorConstants;
	private WeavingModel weavingModel;
	
	public static MultiLevelModelEditorInput LatestInstance;
	
	public Model getModelToEdit(){
		return modelToEdit;
	}
	
	public TransactionalEditingDomain getEditingDomain(){
		return TransactionUtil.getEditingDomain(modelToEdit);
	}
	
	public String getModelText(){
		return modelText;
	}
	
	public WeavingModel getWeavingModel(){
		return weavingModel;
	}
	
	public MultiLevelModelPartitionScanner getMultiLevelModelPartitionScanner(){
		return partitionScanner;
	}
	
	public MultilevelLiteralScanner getMultiLevelKeywordScanner(){
		return keyWordScanner;
	}
	
	public MultiLevelModelEditorInput(Model modelToEdit){
		this.modelToEdit = modelToEdit;
		storage = new MultiLevelModelStorage(modelToEdit);
		partitionScanner = new MultiLevelModelPartitionScanner();
		keyWordScanner = new MultilevelLiteralScanner();
		colorConstants = new MultiLevelModelColorConstants();
		weavingModel = M2TWeavingFactory.eINSTANCE.createWeavingModel();
		LatestInstance = this;
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
			TextualDSLModelInterpreter interpreter = new TextualDSLModelInterpreter(partitionScanner, keyWordScanner, colorConstants, weavingModel);
			String input = interpreter.getTextFromModel(modelToEdit, null);
			input = String.format(input);
			
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.createResource(URI.createPlatformResourceURI("/TargetWSProject/xxx_tempWeavingModel.m2tweaving", true));
			resource.getContents().add(weavingModel);
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			modelText = input;
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
