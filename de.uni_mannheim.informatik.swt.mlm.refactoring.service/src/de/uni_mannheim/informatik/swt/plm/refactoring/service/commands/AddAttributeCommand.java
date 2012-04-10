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
package de.uni_mannheim.informatik.swt.plm.refactoring.service.commands;

import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.mlm.refactoring.service.dialogs.AddAttributeDialog;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.plm.refactoring.service.ImpactAnalyzer;

public class AddAttributeCommand<T extends DomainElement>{
	
	public void run(T refactoringOrigin, EStructuralFeature attributeToChange, Attribute newValue){
		try {
			AddAttributeDialog dialog = showAddModelElementDialog(newValue);
			
			if (dialog == null)
				return;
			
			runRefactoring(refactoringOrigin, attributeToChange, newValue, dialog.getChangeOntologicalTypes(), dialog.getChangeSubtypes(), dialog.getChangeSupertypes(), dialog.getNewName(), dialog.getNewDurability(), dialog.getNewMutability());
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	protected AddAttributeDialog showAddModelElementDialog(Attribute newValue) throws ExecutionException{
		AddAttributeDialog dialog = new AddAttributeDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		
		
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
	protected boolean runRefactoring(T refactoringOrigin, EStructuralFeature traitToChange, Attribute newValue, boolean changeOntologicalTypes, boolean changeSubtypes, boolean changeSuperTypes,
			String name, int durability, int mutability){
		Set<T> refactoredElements = (Set<T>)new ImpactAnalyzer().calculateImpactOfChange((Clabject)refactoringOrigin, traitToChange, changeOntologicalTypes, changeSubtypes, changeSuperTypes);
				
		//***************************************************************
		//Execute change operation
		//***************************************************************
		final CompoundCommand refactoringCommand = new CompoundCommand("Refactoring - " + traitToChange.getName());
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(refactoringOrigin);
		
		for (T element : refactoredElements)
			if (element != refactoringOrigin)
			{
				Attribute newAttribute =  PLMFactory.eINSTANCE.createAttribute();
				newAttribute.setName(name);
				newAttribute.setDurability(durability);
				newAttribute.setMutability(mutability);
				refactoringCommand.append(AddCommand.create(domain, element, traitToChange, newAttribute));
			}
		
		newValue.setName(name);
		newValue.setDurability(durability);
		newValue.setMutability(mutability);
		
		domain.getCommandStack().execute(refactoringCommand);
		
		return true;
	}
}