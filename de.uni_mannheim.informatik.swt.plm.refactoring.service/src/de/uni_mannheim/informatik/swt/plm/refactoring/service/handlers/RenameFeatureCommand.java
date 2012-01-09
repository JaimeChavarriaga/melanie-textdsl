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

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_mannheim.informatik.swt.mlm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class RenameFeatureCommand extends AbstractHandler {
	
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
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		Feature featureToChange = (Feature)event.getObjectParameterForExecution("feature");
				
		InputDialog newNameDialog = new InputDialog(window.getShell(),
				"New Feature Name", "New Feature Name", featureToChange.getName(), 
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
		
		if (newName == null || newName.equals(featureToChange.getName()))
			return false;
		
		
		return runRefactoring(featureToChange, newName);
	}
	
	private boolean runRefactoring(Feature featureToChange, String newName){
		Clabject containingClabject = (Clabject)featureToChange.eContainer();
		
		List<Clabject> instances = containingClabject.getModelInstances();
		
		CompoundCommand refactoringCommand = new CompoundCommand("Refactoring");
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(featureToChange);
		
		for (Clabject instance: instances)
			for (Feature feature : instance.getAllFeatures())
				try {
					if (ExtensionPointService.Instance().getActiveReasoningService().run(IReasoningService.FEATURE_CONFORMS, new Object[] {featureToChange, feature}, true)){
						refactoringCommand.append(SetCommand.create(domain, feature, PLMPackage.eINSTANCE.getElement_Name(), newName));
					}
						
				} catch (CoreException e) {
					e.printStackTrace();
				}
		
		refactoringCommand.append(SetCommand.create(domain, featureToChange, PLMPackage.eINSTANCE.getElement_Name(), newName));
		domain.getCommandStack().execute(refactoringCommand);
		
		return false;
	}
}