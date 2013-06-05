/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Nikolai Hellwig - extending with EBNF transformation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.wizards;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.parser.EBNF2EcoreParser;

public class EbnfImportWizard extends Wizard implements IImportWizard {
	EbnfImportWizardPage firstPage;

	public EbnfImportWizard() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	public boolean performFinish() {

		try {
			this.getContainer().run(false, true, new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					IFile outputFile = firstPage.createNewFile();
					// check if file creation
					if (outputFile == null)
						return;

					EBNF2EcoreParser parser = new EBNF2EcoreParser();
					try {
						// try transforming the EBNF
						parser.transform(new File(firstPage.getOrginalPath()
								.toString()), outputFile.getFullPath()
								.toString(), monitor);
					} catch (Exception e) {
						throw new InvocationTargetException(e);
					}

					monitor.done();
				}
			});
		} catch (InvocationTargetException e) {
			// ErrorDialog.openError(this.getShell(),"Error while transforming",
			// e.getMessage(), null, Status.ERROR);
			MessageDialog.openError(this.getShell(),
					"Error while transforming", e.getTargetException()
							.getMessage());
		} catch (InterruptedException e) {

		}

		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 * org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("EBNF File Import"); // NON-NLS-1
		setNeedsProgressMonitor(true);

		firstPage = new EbnfImportWizardPage("EBNF File Selection", selection); // NON-NLS-1
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 */
	public void addPages() {
		super.addPages();
		addPage(firstPage);
	}

}
