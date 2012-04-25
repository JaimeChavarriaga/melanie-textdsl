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
package de.uni_mannheim.informatik.swt.plm.emendation.service.commands;

import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.mlm.emendation.service.dialogs.RemoveAttributeDialog;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.plm.emendation.service.ImpactAnalyzer;

public class RemoveAttributeCommand<T extends DomainElement>{
	
	public void run(T refactoringOrigin, Feature featureToDelete){
		try {
			RemoveAttributeDialog dialog = showRemoveModelElementDialog();
			
			if (dialog == null)
				return;
			
			runRefactoring(refactoringOrigin, featureToDelete, dialog.getChangeOntologicalTypes(), dialog.getChangeSubtypes(), dialog.getChangeSupertypes());
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	protected RemoveAttributeDialog showRemoveModelElementDialog() throws ExecutionException{
		RemoveAttributeDialog dialog = new RemoveAttributeDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		
		if (dialog.open() == Window.OK)
			return dialog;
		else
			return null;
	}
	
	/**
	 * 
	 * @param refactoringOrigin The element on which the original refactoring operation has been performed
	 * @param traitToChange The EAttribut in the meta-model to change
	 * @param newValue can bee needed because if refactoring request comes from UI it can be already changed in 
	 * 					the feature
	 * @param newValue the new value to set
	 * @param changeOntologicalTypes change ontological types? 
	 * @param changeSubtypes change subtypes?
	 * @param changeSuperTypes change supertypes?
	 * @return
	 */
	protected boolean runRefactoring(T refactoringOrigin, Feature featureToDelete ,boolean changeOntologicalTypes, boolean changeSubtypes, boolean changeSuperTypes){
		((Clabject)refactoringOrigin).getFeature().add(featureToDelete);
		Set<Feature> refactoredElements = (Set<Feature>)new ImpactAnalyzer<Feature>().calculateImpactOfChange((Feature)featureToDelete, String.valueOf(featureToDelete.getDurability()), PLMPackage.eINSTANCE.getFeature_Durability(), changeOntologicalTypes, changeSubtypes, changeSuperTypes);
				
		//***************************************************************
		//Execute change operation
		//***************************************************************
		final CompoundCommand refactoringCommand = new CompoundCommand("Refactoring - Delete " + refactoringOrigin.getName());
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(refactoringOrigin);
		
		for (Feature element : refactoredElements)
			refactoringCommand.append(DeleteCommand.create(domain, element));
		
		domain.getCommandStack().execute(refactoringCommand);
		
		return true;
	}
}