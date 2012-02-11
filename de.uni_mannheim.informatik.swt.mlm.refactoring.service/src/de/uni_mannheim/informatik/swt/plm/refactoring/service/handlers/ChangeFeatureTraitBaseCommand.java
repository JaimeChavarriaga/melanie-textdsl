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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_mannheim.informatik.swt.mlm.refactoring.service.dialogs.ChangeValueDialog;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

public abstract class ChangeFeatureTraitBaseCommand extends AbstractHandler {
	
	protected ChangeValueDialog showChangeValueDialog(String oldValue, ExecutionEvent event) throws ExecutionException{
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		ChangeValueDialog dialog = new ChangeValueDialog(window.getShell(), oldValue);
		
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
	 * @param newValue the new value to set
	 * @param changeOntologicalTypes change ontological types? 
	 * @param changeSubtypes change subtypes?
	 * @param changeSuperTypes change supertypes?
	 * @return
	 */
	protected boolean runRefactoring(Feature refactoringOrigin, EAttribute attributeToChange, String newValue, boolean changeOntologicalTypes, boolean changeSubtypes, boolean changeSuperTypes){
		Clabject refactorOriginContainingClabject = (Clabject)refactoringOrigin.eContainer();
		
		//Kepp out duplicates for performance reasons
		Set<Clabject> currentLevelEffectedClabjects = new HashSet<Clabject>();
		currentLevelEffectedClabjects.add(refactorOriginContainingClabject);
		Set<Clabject> typeLevelEffectedClabjects = new HashSet<Clabject>();
		Set<Clabject> instanceLevelEffectedClabjects = new HashSet<Clabject>();
		
		
		//***************************************************************
		//Collect current level
		//***************************************************************
		if (changeSubtypes){
			currentLevelEffectedClabjects.addAll(refactorOriginContainingClabject.getModelSubtypes());
		}
		if (changeSuperTypes){
			currentLevelEffectedClabjects.addAll(refactorOriginContainingClabject.getModelSupertypes());
		}
		
		//***************************************************************
		//Collect all type levels
		//***************************************************************
		if (changeOntologicalTypes){
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
		CompoundCommand refactoringCommand = new CompoundCommand("Refactoring - " + attributeToChange.getName());
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(refactoringOrigin);
		
		for (Clabject instance: allEffectedClabjects)
			for (Feature feature : instance.getAllFeatures())
				if (featuresMatch(refactoringOrigin, feature))
					refactoringCommand.append(SetCommand.create(domain, feature, attributeToChange, computeNewValue(refactoringOrigin, feature, newValue, attributeToChange)));
					
		
		//For the refactoring origin we do not have to compute a new value as this is set by the user
		refactoringCommand.append(SetCommand.create(domain, refactoringOrigin, attributeToChange, computeNewValue(refactoringOrigin, refactoringOrigin, newValue, attributeToChange)));
		domain.getCommandStack().execute(refactoringCommand);
		
		return true;
	}
	
	protected Object computeNewValue(Feature refactoringOrigin, Feature machtingFeature, String newValue, EAttribute attributeToChange){
		if (isPotencyValue(attributeToChange)){
			int refactoringOriginLevel = refactoringOrigin.getClabject().getLevel();
			int matchingFeatureLevel = machtingFeature.getClabject().getLevel();
			int levelDistance = refactoringOriginLevel - matchingFeatureLevel;
			return Integer.parseInt(newValue) + levelDistance;
		}
		
		return newValue;
	}
	
	protected boolean isPotencyValue(EAttribute attributeToChange){
		return attributeToChange == PLMPackage.eINSTANCE.getClabject_Potency() || attributeToChange == PLMPackage.eINSTANCE.getFeature_Durability() || attributeToChange == PLMPackage.eINSTANCE.getAttribute_Mutability();
	}
	
	/**
	 * 
	 * This checks whether two features are relevant for refactoring.
	 * The conditions are:
	 * 
	 * <ul>
	 * 	<li>Name must be equal</li>
	 *  <li>
	 *  	Potency rules are not allowed to be violated
	 *  	<ul>
	 *  		<li>f1.potency = -1 && f2.potency = -1</li>
	 *  		<li>f1.potency = -1 && f1.level < f2.level => f2.potency > -2
	 *  		<li>f1.potency = -1 && f1.level > f2.level => f2.potency = -1
	 *  		<li>f1.potency > -1 && f1.level < f2.level => f2.potency = f1.potency - (f2.level - f1.level)</li>
	 *  		<li>f1.potency > -1 && f1.level > f2.level => f1.potency = f2.potency - (f1.level - f2.level)</li>
	 *  	</ul>
	 *  </li>
	 * </ul>
	 * 
	 * @param f1
	 * @param f2
	 * 
	 * @return is f2 relevant for changes to f1
	 */
	protected boolean featuresMatch(Feature f1, Feature f2){
		if (!f1.getName().equals(f2.getName()))
			return false;
		
		if ((f1.getDurability() == -1) && (f1.getDurability() == f2.getDurability()))
			return true;
		
		int f1Level = f1.getClabject().getLevel();
		int f2Level = f2.getClabject().getLevel();
		
		if (f1Level < f2Level){
			if (f1.getDurability() == -1)
				return true;
			else if (f2.getDurability() == -1)
				return f1.getDurability() == -1;
			else
				return f2.getDurability() == f1.getDurability() - (f2Level - f1Level); 
		}
		else{
			if (f1.getDurability() == -1)
				return f2.getDurability() == -1;
			else if (f2.getDurability() ==  -1)
				return true;
			else
				return f1.getDurability() == f2.getDurability() - (f1Level - f2Level);
		}
	}
}