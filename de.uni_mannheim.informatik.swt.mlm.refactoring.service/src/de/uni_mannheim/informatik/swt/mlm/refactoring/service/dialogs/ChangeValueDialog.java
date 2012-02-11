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

public class ChangeValueDialog extends TitleAreaDialog {

	public ChangeValueDialog(Shell parentShell, String oldName) {
		super(parentShell);
		newValue = oldName;
	}
	
	Button changeOntologicalTypesButton;
	Button changeSupertypesButton;
	Button changeSubtypesButton;
	Text newNameText;
	
	private boolean changeSubtypes = true;
	private boolean changeSupertypes = false;
	private boolean changeOntologicalTypes = true;
	private String newValue = "";
	
	public void setValue(String value){
		newValue = value;
	}
	
	public String getNewValue(){
		return newValue;
	}
	
	public boolean getChangeSubtypes(){
		return changeSubtypes;
	}
	
	public boolean getChangeSupertypes(){
		return changeSupertypes;
	}
	
	public boolean getChangeOntologicalTypes(){
		return changeOntologicalTypes;
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
        newNameText.setText(newValue);
        
        GridData optionGridData = new GridData();
        optionGridData.horizontalSpan = 2;
        
        changeSubtypesButton = new Button(dialogArea, SWT.CHECK);
        changeSubtypesButton.setText("Rename Subtypes");
        changeSubtypesButton.setLayoutData(optionGridData);
        changeSubtypesButton.setSelection(changeSubtypes);
        
        changeSupertypesButton = new Button(dialogArea, SWT.CHECK);
        changeSupertypesButton.setText("Rename Supertypes");
        changeSupertypesButton.setLayoutData(optionGridData);
        changeSupertypesButton.setSelection(changeSupertypes);
        
        changeOntologicalTypesButton = new Button(dialogArea, SWT.CHECK);
        changeOntologicalTypesButton.setText("Rename Ontological Types");
        changeOntologicalTypesButton.setLayoutData(optionGridData);
        changeOntologicalTypesButton.setSelection(changeOntologicalTypes);
        
        return composite;
        
//      LocalResourceManager resources
//      	= new LocalResourceManager(JFaceResources.getResources(), getShell());
//		ImageDescriptor title = Activator.getImageDescriptor("/icons/imagetitle.png");
//		setTitleImage(resources.createImage(title));                    
//		setErrorMessage("Error message");
	}

	@Override
	protected void okPressed() {
		changeOntologicalTypes = changeOntologicalTypesButton.getSelection();
		changeSubtypes = changeSubtypesButton.getSelection();
		changeSupertypes = changeSupertypesButton.getSelection();
		newValue = newNameText.getText();
		super.okPressed();
	}
}