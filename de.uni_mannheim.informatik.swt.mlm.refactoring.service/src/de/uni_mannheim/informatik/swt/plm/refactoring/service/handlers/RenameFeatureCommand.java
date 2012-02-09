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
		Set<Clabject> effectedClabjects = new HashSet<Clabject>();
		effectedClabjects.add(containingClabject);
		
		//If we have rename subtypes all subtypes and all instances including those
		//from the instances to get renamed
		if (renameSubtypes){
			effectedClabjects.addAll(containingClabject.getModelInstances());
			effectedClabjects.addAll(containingClabject.getModelSubtypes());
		}
		else {
			effectedClabjects.addAll(containingClabject.getEigenModelInstances());
		}
		
		
//		if (renameSubtypes)
//			effectedClabjects.addAll(containingClabject.getModelSubtypes());
//		if (renameSuperTypes)
//			effectedClabjects.addAll(containingClabject.getModelSupertypes());
//		if (renameOntologicalTypes)
//			effectedClabjects.addAll(containingClabject.getModelTypes());
		
		CompoundCommand refactoringCommand = new CompoundCommand("Refactoring");
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(featureToChange);
		
		for (Clabject instance: effectedClabjects)
			for (Feature feature : instance.getAllFeatures())
				if (featuresMatch(featureToChange, feature))
					refactoringCommand.append(SetCommand.create(domain, feature, PLMPackage.eINSTANCE.getElement_Name(), newName));
					
		
		refactoringCommand.append(SetCommand.create(domain, featureToChange, PLMPackage.eINSTANCE.getElement_Name(), newName));
		domain.getCommandStack().execute(refactoringCommand);
		featuresMatch(null, null);
		return false;
	}
}