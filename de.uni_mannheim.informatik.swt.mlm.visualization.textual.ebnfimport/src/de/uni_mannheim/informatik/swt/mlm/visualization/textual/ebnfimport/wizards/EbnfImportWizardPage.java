/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Nikolai Hellwig - extending with EBNF functionality
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.wizards;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class EbnfImportWizardPage extends WizardNewFileCreationPage {

	protected FileFieldEditor editor;
	public IPath path;

	public EbnfImportWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setTitle(pageName); // NON-NLS-1
		setDescription("Import an EBNF file from the local file system into the workspace"); // NON-NLS-1
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.dialogs.WizardNewFileCreationPage#createAdvancedControls
	 * (org.eclipse.swt.widgets.Composite)
	 */
	protected void createAdvancedControls(Composite parent) {
		setPageComplete(false);
		
		Composite fileSelectionArea = new Composite(parent, SWT.NONE);
		GridData fileSelectionData = new GridData(GridData.GRAB_HORIZONTAL
				| GridData.FILL_HORIZONTAL);
		fileSelectionArea.setLayoutData(fileSelectionData);

		GridLayout fileSelectionLayout = new GridLayout();
		fileSelectionLayout.numColumns = 3;
		fileSelectionLayout.makeColumnsEqualWidth = false;
		fileSelectionLayout.marginWidth = 0;
		fileSelectionLayout.marginHeight = 0;
		fileSelectionArea.setLayout(fileSelectionLayout);

		editor = new FileFieldEditor("fileSelect", "Select EBNF File: ",
				fileSelectionArea); // NON-NLS-1 //NON-NLS-2
		editor.getTextControl(fileSelectionArea).addModifyListener(
				new ModifyListener() {
					public void modifyText(ModifyEvent e) {
						if(EbnfImportWizardPage.this.editor.getStringValue().isEmpty()){
							setPageComplete(false);
							return;
						}
						path = new Path(EbnfImportWizardPage.this.editor
								.getStringValue());
						setFileName(path.removeFileExtension().lastSegment()
								+ ".lml");
						setPageComplete(true);
					}
				});
		String[] extensions = new String[] { "*.ebnf" }; // NON-NLS-1
		editor.setFileExtensions(extensions);

		fileSelectionArea.moveAbove(null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createLinkTarget()
	 */
	protected void createLinkTarget() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.dialogs.WizardNewFileCreationPage#getInitialContents()
	 */
	protected InputStream getInitialContents() {
		try {
			return new FileInputStream(new File(editor.getStringValue()));
		} catch (FileNotFoundException e) {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getNewFileLabel()
	 */
	protected String getNewFileLabel() {
		return "New EBNF File:"; // NON-NLS-1
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.dialogs.WizardNewFileCreationPage#validateLinkedResource()
	 */
	protected IStatus validateLinkedResource() {
		return new Status(IStatus.OK,
				"de.uni_mannheim.informatik.swt.models.ebnf", IStatus.OK, "",
				null); // NON-NLS-1 //NON-NLS-2
	}

	public IPath getOrginalPath() {
		return path;
	}

}
