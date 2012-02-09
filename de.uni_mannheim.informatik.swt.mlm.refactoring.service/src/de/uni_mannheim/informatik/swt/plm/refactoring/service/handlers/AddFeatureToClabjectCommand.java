/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
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
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class AddFeatureToClabjectCommand extends FeatureBaseCommand {

	public final static String ID = "de.uni_mannheim.informatik.swt.plm.refactoring.service.commands.addfearuretoclabjectcommand";
	
	/**
	 * The constructor.
	 */
	public AddFeatureToClabjectCommand() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		Clabject clabjectToChange = (Clabject)event.getObjectParameterForExecution("clabject");
		
		InputDialog newNameDialog = new InputDialog(window.getShell(),
				"New Feature Name", "New Feature Name", "name", 
					new IInputValidator() {
					
						@Override
						public String isValid(String newText) {
							if (newText.contains(":") 
									|| newText.contains(";") 
									|| newText.contains(".")
									|| newText.contains("\"")
									|| newText.contains("'"))
								return "Name is not allowed to contain {:;.\"'}"; 
							
							if (newText.length() == 0)
								return "Cannot be empty";
							
							//Everything OK
							return null;
						}
				}
		);
		
		String newName = null;
		
		if (newNameDialog.open() == Window.OK)
			newName = newNameDialog.getValue();
		else
			return false;
		
		InputDialog newPotencyDialog = new InputDialog(window.getShell(),
				"New Feature Potency", "New Feature Potency", "-1", 
					new IInputValidator() {
					
						@Override
						public String isValid(String newText) {
							try{
								int value = Integer.parseInt(newText);
								
								if (value < -1)
									return "Must be greater than -1.";
							}
							catch (Exception e) {
								return "Must be a numeric value.";
							}
							
								 
							
							if (newText.length() == 0)
								return "Cannot be empty.";
							
							//Everything OK
							return null;
						}
				}
		);
		
		int newPotency;
		
		if (newPotencyDialog.open() == Window.OK)
			newPotency = Integer.parseInt(newPotencyDialog.getValue());
		else
			return false;
				
		return runRefactoring(clabjectToChange, newName, newPotency);
	}
	
	private boolean runRefactoring(Clabject clabjectToChange, String newName, int newPotency){
		
		return false;
	}
}
