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
package de.uni_mannheim.informatik.swt.mlm.emendation.service.dialogs;

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

public class RemoveAttributeDialog extends TitleAreaDialog {

	public RemoveAttributeDialog(Shell parentShell) {
		super(parentShell);
	}
	
	Button changeOntologicalTypesButton;
	Button changeSupertypesButton;
	Button changeSubtypesButton;
	
	private boolean changeSubtypes = true;
	private boolean changeSupertypes = false;
	private boolean changeOntologicalTypes = true;
	
	
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
		
		setTitle("Remove Model Element");
	 
	    parent.setLayout(new GridLayout(1, false));
	    
	    Composite composite = (Composite) super.createDialogArea(parent);
	    composite.setLayout(new GridLayout(1, false));
	    composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    Composite dialogArea = new Composite(composite, SWT.None);
	    dialogArea.setLayout(new GridLayout(2, false));
	    dialogArea.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    
	    ((GridData)composite.getLayoutData()).grabExcessHorizontalSpace = true;
	    
	    GridData newTextGridData = new GridData(GridData.FILL_HORIZONTAL);
        newTextGridData.grabExcessHorizontalSpace = true;
	    
	            
        GridData optionGridData = new GridData();
        optionGridData.horizontalSpan = 2;
        
        changeSubtypesButton = new Button(dialogArea, SWT.CHECK);
        changeSubtypesButton.setText("Change Subtypes");
        changeSubtypesButton.setLayoutData(optionGridData);
        changeSubtypesButton.setSelection(changeSubtypes);
        
        changeSupertypesButton = new Button(dialogArea, SWT.CHECK);
        changeSupertypesButton.setText("Change Supertypes");
        changeSupertypesButton.setLayoutData(optionGridData);
        changeSupertypesButton.setSelection(changeSupertypes);
        
        changeOntologicalTypesButton = new Button(dialogArea, SWT.CHECK);
        changeOntologicalTypesButton.setText("Change Ontological Types");
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
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Add Model Element");
	}
	
	@Override
	protected void okPressed() {
		changeOntologicalTypes = changeOntologicalTypesButton.getSelection();
		changeSubtypes = changeSubtypesButton.getSelection();
		changeSupertypes = changeSupertypesButton.getSelection();
	
		super.okPressed();
	}
}