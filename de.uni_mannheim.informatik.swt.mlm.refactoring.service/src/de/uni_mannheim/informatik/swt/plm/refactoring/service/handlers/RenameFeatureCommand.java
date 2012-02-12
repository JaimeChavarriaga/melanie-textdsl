/*******************************************************************************
 * Copyright (c) 2011, 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.plm.refactoring.service.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.refactoring.service.dialogs.ChangeValueDialog;
import de.uni_mannheim.informatik.swt.mlm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IRefactoringService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.plm.refactoring.service.Refactorer;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class RenameFeatureCommand extends ChangeFeatureTraitBaseCommand {
	
	public final static String ID = "de.uni_mannheim.informatik.swt.plm.refactoring.service.commands.renamefeaturecommand";
	
	/**
	 * The constructor.
	 */
	public RenameFeatureCommand() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IRefactoringService service = null;
		boolean result = false;
		
		try {
			
			service = ExtensionPointService.Instance().getRefactoringService(Refactorer.ID);

			//Do we already have running a refactoring operation?
			if (service.getRefactoringOperationIsRunning())
				//Here a return is needed to not end the refactoring operation later in code
				return false;
			
			//Tell the service that we have such an operation already running
			service.setRefactoringOperationIsRunning(true);
		
			Feature featureToChange = (Feature)event.getObjectParameterForExecution("feature");
			
			ChangeValueDialog dialog = null;
			
			if (event.getParameter("value") != null)
				dialog = showChangeValueDialog(event.getParameter("value").toString(), event);
			else
				dialog = showChangeValueDialog(featureToChange.getName(), event);
			
			if (dialog != null)
				result = runRefactoring(featureToChange, PLMPackage.eINSTANCE.getElement_Name(), dialog.getNewValue(), dialog.getChangeOntologicalTypes(), dialog.getChangeSubtypes(), dialog.getChangeSupertypes());
			else
				result = false;
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
		
		service.setRefactoringOperationIsRunning(false);
		return result;
	}
}