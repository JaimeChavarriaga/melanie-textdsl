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
package de.uni_mannheim.informatik.swt.plm.refactoring.service.handlers;

import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.mlm.refactoring.service.dialogs.ChangeValueDialog;
import de.uni_mannheim.informatik.swt.mlm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.plm.refactoring.service.ImpactAnalyzer;

public class ChangeTraitCommand{// extends AbstractHandler {
	
	public void run(Feature refactoringOrigin, EStructuralFeature attributeToChange, String oldValue, String newValue){
		try {
			ChangeValueDialog dialog = showChangeValueDialog(newValue, oldValue);
			runRefactoring(refactoringOrigin, attributeToChange, oldValue, newValue, dialog.getChangeOntologicalTypes(), dialog.getChangeSubtypes(), dialog.getChangeSupertypes());
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	protected ChangeValueDialog showChangeValueDialog(String valueToDisplayValue, String oldValue) throws ExecutionException{
		ChangeValueDialog dialog = new ChangeValueDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), valueToDisplayValue);
		
		String newValue = null;
		
		if (dialog.open() == Window.OK)
			newValue = dialog.getNewValue();
		else
			return null;
		
		if (newValue == null || newValue.equals(oldValue))
			return null;
		
		
		return dialog;
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
	protected boolean runRefactoring(Feature refactoringOrigin, EStructuralFeature attributeToChange, String oldValue, String newValue, boolean changeOntologicalTypes, boolean changeSubtypes, boolean changeSuperTypes){
		Set<Feature> refactoredElements = (Set<Feature>)new ImpactAnalyzer().calculateImpact(refactoringOrigin, oldValue, attributeToChange, ImpactAnalyzer.OPERATION_CHANGE);
		
		//***************************************************************
		//Execute change operation
		//***************************************************************
		CompoundCommand refactoringCommand = new CompoundCommand("Refactoring - " + attributeToChange.getName());
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(refactoringOrigin);
		
		for (Feature feature : refactoredElements)
			if (attributeToChange.getEType().getName().equals("EInt"))
				refactoringCommand.append(SetCommand.create(domain, feature, attributeToChange, (Integer) computeNewValue(refactoringOrigin, feature, newValue, attributeToChange)));
			else
				refactoringCommand.append(SetCommand.create(domain, feature, attributeToChange, computeNewValue(refactoringOrigin, feature, newValue, attributeToChange)));
		
		try {
			ExtensionPointService.Instance().getActiveRefactoringService().addRefactoredObjects(refactoredElements);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		domain.getCommandStack().execute(refactoringCommand);
		
		return true;
	}
	
	protected Object computeNewValue(Feature refactoringOrigin, Feature machtingFeature, String newValue, EStructuralFeature attributeToChange){
		if (isPotencyValue(attributeToChange)){
			int refactoringOriginLevel = refactoringOrigin.getClabject().getLevel();
			int matchingFeatureLevel = machtingFeature.getClabject().getLevel();
			int levelDistance = refactoringOriginLevel - matchingFeatureLevel;
			return Integer.parseInt(newValue) + levelDistance;
		}
		
		return newValue;
	}
	
	protected boolean isPotencyValue(EStructuralFeature attributeToChange){
		return attributeToChange == PLMPackage.eINSTANCE.getClabject_Potency() || attributeToChange == PLMPackage.eINSTANCE.getFeature_Durability() || attributeToChange == PLMPackage.eINSTANCE.getAttribute_Mutability();
	}
}