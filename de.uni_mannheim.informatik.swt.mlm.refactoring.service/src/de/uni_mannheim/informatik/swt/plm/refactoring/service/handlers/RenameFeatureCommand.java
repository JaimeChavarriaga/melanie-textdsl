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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_mannheim.informatik.swt.mlm.refactoring.service.dialogs.FeatureRenameDialog;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class RenameFeatureCommand extends FeatureBaseCommand {
	
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
		
		FeatureRenameDialog dialog = new FeatureRenameDialog(window.getShell(), featureToChange.getName());
		
		String newName = null;
		
		if (dialog.open() == Window.OK)
			newName = dialog.getNewName();
		else
			return false;
		
		if (newName == null || newName.equals(featureToChange.getName()))
			return false;
		
		
		return runRefactoring(featureToChange, newName, dialog.getRenameOntologicalTypes(), dialog.getRenameSubtypes(), dialog.getRenameSupertypes());
	}
	
	private boolean runRefactoring(Feature featureToChange, String newName, boolean renameOntologicalTypes, boolean renameSubtypes, boolean renameSuperTypes){
		Clabject containingClabject = (Clabject)featureToChange.eContainer();
		
		//Kepp out duplicates for performance reasons
		Set<Clabject> currentLevelEffectedClabjects = new HashSet<Clabject>();
		currentLevelEffectedClabjects.add(containingClabject);
		Set<Clabject> typeLevelEffectedClabjects = new HashSet<Clabject>();
		Set<Clabject> instanceLevelEffectedClabjects = new HashSet<Clabject>();
		
		
		//***************************************************************
		//Collect current level
		//***************************************************************
		if (renameSubtypes){
			currentLevelEffectedClabjects.addAll(containingClabject.getModelSubtypes());
		}
		if (renameSuperTypes){
			currentLevelEffectedClabjects.addAll(containingClabject.getModelSupertypes());
		}
		
		//***************************************************************
		//Collect all type levels
		//***************************************************************
		if (renameOntologicalTypes){
			for(Clabject c:currentLevelEffectedClabjects)
				typeLevelEffectedClabjects.addAll(c.getEigenModelClassificationTreeAsInstance());
		}
		//***************************************************************
		//Collect instance level
		//***************************************************************
		if (true){
			for(Clabject c:currentLevelEffectedClabjects)
				typeLevelEffectedClabjects.addAll(c.getEigenModelClassificationTreeAsType());
		}
		
		Set<Clabject> allEffectedClabjects = new HashSet<Clabject>();
		allEffectedClabjects.addAll(instanceLevelEffectedClabjects);
		allEffectedClabjects.addAll(typeLevelEffectedClabjects);
		allEffectedClabjects.addAll(currentLevelEffectedClabjects);
		
		//***************************************************************
		//Execute rename operation
		//***************************************************************
		CompoundCommand refactoringCommand = new CompoundCommand("Refactoring - Rename");
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(featureToChange);
		
		for (Clabject instance: allEffectedClabjects)
			for (Feature feature : instance.getAllFeatures())
				if (featuresMatch(featureToChange, feature))
					refactoringCommand.append(SetCommand.create(domain, feature, PLMPackage.eINSTANCE.getElement_Name(), newName));
					
		
		refactoringCommand.append(SetCommand.create(domain, featureToChange, PLMPackage.eINSTANCE.getElement_Name(), newName));
		domain.getCommandStack().execute(refactoringCommand);
		
		return false;
	}
}