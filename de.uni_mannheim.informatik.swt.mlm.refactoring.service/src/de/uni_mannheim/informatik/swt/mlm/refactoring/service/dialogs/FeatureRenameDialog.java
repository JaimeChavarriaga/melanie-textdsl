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
package de.uni_mannheim.informatik.swt.mlm.refactoring.service.dialogs;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class FeatureRenameDialog extends TitleAreaDialog {

	public FeatureRenameDialog(Shell parentShell, String oldName) {
		super(parentShell);
		newName = oldName;
	}
	
	Button renameOntologicalTypesButton;
	Button renameSupertypesButton;
	Button renameSubtypesButton;
	Text newNameText;
	
	private boolean renameSubtypes = true;
	private boolean renameSupertypes = false;
	private boolean renameOntologicalTypes = true;
	private String newName = "";
	
	public void setNewName(String value){
		newName = value;
	}
	
	public String getNewName(){
		return newName;
	}
	
	public boolean getRenameSubtypes(){
		return renameSubtypes;
	}
	
	public boolean getRenameSupertypes(){
		return renameSupertypes;
	}
	
	public boolean getRenameOntologicalTypes(){
		return renameOntologicalTypes;
	}
	
	@Override
	protected Control createDialogArea(
			Composite parent) {
		
		setTitle("Rename Feature");
	 
	    parent.setLayout(new GridLayout(1, false));
	    
	    Composite composite = (Composite) super.createDialogArea(parent);
	    composite.setLayout(new GridLayout(1, false));
	    composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    Composite dialogArea = new Composite(composite, SWT.None);
	    dialogArea.setLayout(new GridLayout(2, false));
	    dialogArea.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    ((GridData)composite.getLayoutData()).grabExcessHorizontalSpace = true;
	    
        Label label = new Label(dialogArea, SWT.NONE);
        label.setText("New Name");
        
        newNameText = new Text(dialogArea, SWT.SINGLE | SWT.BORDER);
        GridData newNameTextGridData = new GridData(GridData.FILL_HORIZONTAL);
        newNameTextGridData.grabExcessHorizontalSpace = true;
        newNameText.setLayoutData(newNameTextGridData);
        newNameText.setText(newName);
        
        GridData optionGridData = new GridData();
        optionGridData.horizontalSpan = 2;
        
        renameSubtypesButton = new Button(dialogArea, SWT.CHECK);
        renameSubtypesButton.setText("Rename Subtypes");
        renameSubtypesButton.setLayoutData(optionGridData);
        renameSubtypesButton.setSelection(renameSubtypes);
        
        renameSupertypesButton = new Button(dialogArea, SWT.CHECK);
        renameSupertypesButton.setText("Rename Supertypes");
        renameSupertypesButton.setLayoutData(optionGridData);
        renameSupertypesButton.setSelection(renameSupertypes);
        
        renameOntologicalTypesButton = new Button(dialogArea, SWT.CHECK);
        renameOntologicalTypesButton.setText("Rename Ontological Types");
        renameOntologicalTypesButton.setLayoutData(optionGridData);
        renameOntologicalTypesButton.setSelection(renameOntologicalTypes);
        
        return composite;
        
//      LocalResourceManager resources
//      	= new LocalResourceManager(JFaceResources.getResources(), getShell());
//		ImageDescriptor title = Activator.getImageDescriptor("/icons/imagetitle.png");
//		setTitleImage(resources.createImage(title));                    
//		setErrorMessage("Error message");
	}

	@Override
	protected void okPressed() {
		renameOntologicalTypes = renameOntologicalTypesButton.getSelection();
		renameSubtypes = renameSubtypesButton.getSelection();
		renameSupertypes = renameSupertypesButton.getSelection();
		newName = newNameText.getText();
		super.okPressed();
	}
}