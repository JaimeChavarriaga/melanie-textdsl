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
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.mlm.refactoring.service.dialogs.ChangeTraitDialog;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.plm.refactoring.service.ImpactAnalyzer;

public class ChangeTraitCommand<T extends DomainElement>{
	
	public void run(T refactoringOrigin, EStructuralFeature attributeToChange, String oldValue, String newValue){
		try {
			
			TransactionUtil.getEditingDomain(refactoringOrigin).getCommandStack().flush();
			ChangeTraitDialog dialog = showChangeValueDialog(newValue, oldValue, refactoringOrigin);
			runRefactoring(refactoringOrigin, attributeToChange, oldValue, newValue, dialog.getChangeOntologicalTypes(), dialog.getChangeSubtypes(), dialog.getChangeSupertypes());
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	protected ChangeTraitDialog showChangeValueDialog(String valueToDisplayValue, String oldValue, T refactoringOrigin) throws ExecutionException{
		ChangeTraitDialog dialog = new ChangeTraitDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), valueToDisplayValue);
		
		if (dialog.open() == Window.OK)
			return dialog;
		else
			return null;
	}
	
	/**
	 * 
	 * @param refactoringOrigin The element on which the original refactoring operation has been performed
	 * @param attributeToChange The EAttribut in the meta-model to change
	 * @param newValue can bee needed because if refactoring request comes from UI it can be already changed in 
	 * 					the feature
	 * @param newValue the new value to set
	 * @param changeOntologicalTypes change ontological types? 
	 * @param changeSubtypes change subtypes?
	 * @param changeSuperTypes change supertypes?
	 * @return
	 */
	protected boolean runRefactoring(T refactoringOrigin, EStructuralFeature attributeToChange, String oldValue, String newValue, boolean changeOntologicalTypes, boolean changeSubtypes, boolean changeSuperTypes){
		Set<T> refactoredElements = (Set<T>)new ImpactAnalyzer().calculateImpactOfChange((DomainElement)refactoringOrigin, oldValue, attributeToChange, changeOntologicalTypes, changeSubtypes, changeSuperTypes);
		
		//***************************************************************
		//Execute change operation
		//***************************************************************
		final CompoundCommand refactoringCommand = new CompoundCommand("Refactoring - " + attributeToChange.getName() + " - " + refactoringOrigin.getName());
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(refactoringOrigin);
		
		for (T element : refactoredElements)
			if (attributeToChange.getEType().getName().equals("EInt"))
				refactoringCommand.append(SetCommand.create(domain, element, attributeToChange, (Integer) computeNewValue(refactoringOrigin, element, newValue, attributeToChange)));
			else
				refactoringCommand.append(SetCommand.create(domain, element, attributeToChange, computeNewValue(refactoringOrigin, element, newValue, attributeToChange)));
		
		domain.getCommandStack().execute(refactoringCommand);
		
		return true;
	}
	
	protected Object computeNewValue(T refactoringOrigin, T machtingElement, String newValue, EStructuralFeature attributeToChange){
		if (refactoringOrigin instanceof Feature)
		{
			if (isPotencyValue(attributeToChange)){
				int refactoringOriginLevel = ((Feature)refactoringOrigin).getClabject().getLevel();
				int matchingFeatureLevel = ((Feature)machtingElement).getClabject().getLevel();
				int levelDistance = refactoringOriginLevel - matchingFeatureLevel;
				return Integer.parseInt(newValue) + levelDistance;
			}
		}
		else if(refactoringOrigin instanceof Clabject)
		{
			if (isPotencyValue(attributeToChange)){
				int refactoringOriginLevel = ((Clabject)refactoringOrigin).getLevel();
				int matchingFeatureLevel = ((Clabject)machtingElement).getLevel();
				int levelDistance = refactoringOriginLevel - matchingFeatureLevel;
				return Integer.parseInt(newValue) + levelDistance;
			}
		}
		return newValue;
	}
	
	protected boolean isPotencyValue(EStructuralFeature attributeToChange){
		return attributeToChange == PLMPackage.eINSTANCE.getClabject_Potency() || attributeToChange == PLMPackage.eINSTANCE.getFeature_Durability() || attributeToChange == PLMPackage.eINSTANCE.getAttribute_Mutability();
	}
}