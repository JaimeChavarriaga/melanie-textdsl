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
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Classification;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.plm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class DeleteClabjectCommand extends AbstractHandler {

	public final static String ID = "de.uni_mannheim.informatik.swt.plm.refactoring.service.commands.deleteclabjectcommand";
	
	private static final String DELETE_ALL_FEATURES_FROM_INSTANCE = "Delete all features from instances";
	private static final String MOVE_TO_SUPERTYPE = "Move features from this clabject to supertype";
	private static final String DO_NOTHING = "Do nothing";
	
	
	/**
	 * The constructor.
	 */
	public DeleteClabjectCommand() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Clabject clabjectToBeDeleted = (Clabject)event.getObjectParameterForExecution("clabject");
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ListDialog dialog = new ListDialog(window.getShell());
		dialog.setTitle("Delete Clabject Options");
		dialog.setMessage("Select which option shall be performed when the clabject is deleted.");
		dialog.setContentProvider(ArrayContentProvider.getInstance());
		dialog.setLabelProvider(new LabelProvider());
		dialog.setInput(new String[] 
				{DELETE_ALL_FEATURES_FROM_INSTANCE,
				MOVE_TO_SUPERTYPE,
				DO_NOTHING});
		
		if (dialog.open() == Window.OK){
			String result = (String)dialog.getResult()[0];
			if (result.equals(MOVE_TO_SUPERTYPE))
				return doMoveFeaturesToSupertype(clabjectToBeDeleted);
			else if (result.equals(DELETE_ALL_FEATURES_FROM_INSTANCE))
				return doDeleteFeatureFromInstances(clabjectToBeDeleted);
		}
		
		return false;
	}
	
	private boolean doMoveFeaturesToSupertype(Clabject clabjectToBeDeleted){
		
		List<Feature> featuresToBeMoved =  clabjectToBeDeleted.getFeature();
		List<Clabject> directSupertypes = clabjectToBeDeleted.getModelDirectSupertypes();
		
		Clabject targetSuperType = null;
		
		if (directSupertypes.size() > 1);
			//TODO: In this case the user needs to select where he wants to move to
		else
			targetSuperType = directSupertypes.get(0);
		
		if (targetSuperType == null)
			return false;
		
		CompoundCommand refactoringCommand = new CompoundCommand("Refactoring");
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(clabjectToBeDeleted);
		
		//Move all features to the supertype
		for(Feature f : featuresToBeMoved){
			Command removeCommand = RemoveCommand.create(domain, clabjectToBeDeleted, PLMPackage.eINSTANCE.getFeature(), f);
			Command addCommand = AddCommand.create(domain, targetSuperType, PLMPackage.eINSTANCE.getFeature(), f);
			refactoringCommand.append(removeCommand);
			refactoringCommand.append(addCommand);
		}
		
		//Delete the clabject
		refactoringCommand.append(RemoveCommand.create(domain, clabjectToBeDeleted));
		
		//The classifications must be moved to the supertype
		List<Classification> classificationsToBeChanged =  clabjectToBeDeleted.getModelClassificationsAsType();
		
		for (Classification c : classificationsToBeChanged)
			refactoringCommand.append(SetCommand.create(domain, c, PLMPackage.eINSTANCE.getClassification_Type(), targetSuperType));
		
		//Remove the generalization if necessary (has no subtypes afterwards)
		List<Generalization> generalizationsAsSubtype = clabjectToBeDeleted.getModelGeneralizationsAsSubtype();
		for (Generalization g : generalizationsAsSubtype)
			if (g.getSubtype().size() ==  1)
				refactoringCommand.append(RemoveCommand.create(domain, g));
		
		domain.getCommandStack().execute(refactoringCommand);
		
		return true;
	}
	
	private boolean doDeleteFeatureFromInstances(Clabject clabjectToBeDeleted){
		
		CompoundCommand refactoringCommand = new CompoundCommand("Refactoring");
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(clabjectToBeDeleted);
		
		List<Clabject> directSupertypes = clabjectToBeDeleted.getModelDirectSupertypes();
		Clabject targetSuperType = null;
		
		if (directSupertypes.size() > 1);
			//TODO: In this case the user needs to select where he wants to move to
		else
			targetSuperType = directSupertypes.get(0);
		
		List<Clabject> instances = clabjectToBeDeleted.getModelInstances();
		
		//Delete all conforming features in the instances
		for (Clabject i : instances)
			for(Feature instanceFeature : i.getFeature())
				for (Feature typeFeature : clabjectToBeDeleted.getFeature())
					try {
						if (ExtensionPointService.Instance().getActiveReasoningService().run(IReasoningService.FEATURE_CONFORMS, new Object[] {typeFeature, instanceFeature}, true))
							refactoringCommand.append(RemoveCommand.create(domain, instanceFeature));
					} catch (CoreException e) {
						e.printStackTrace();
						return false;
					}
		
		//The classifications must be moved to the supertype
		List<Classification> classificationsToBeChanged =  clabjectToBeDeleted.getModelClassificationsAsType();
		
		for (Classification c : classificationsToBeChanged)
			refactoringCommand.append(SetCommand.create(domain, c, PLMPackage.eINSTANCE.getClassification_Type(), targetSuperType));
		
		//Remove the generalization if necessary (has no subtypes afterwards)
				List<Generalization> generalizationsAsSubtype = clabjectToBeDeleted.getModelGeneralizationsAsSubtype();
				for (Generalization g : generalizationsAsSubtype)
					if (g.getSubtype().size() ==  1)
						refactoringCommand.append(RemoveCommand.create(domain, g));
		
		//Delete the clabject itself
		refactoringCommand.append(DeleteCommand.create(domain, clabjectToBeDeleted));
		
		domain.getCommandStack().execute(refactoringCommand);
		
		return true;
	}
}