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

import java.util.EventObject;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.mlm.refactoring.service.dialogs.AddModelElementDialog;
import de.uni_mannheim.informatik.swt.mlm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IRefactoringService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.plm.refactoring.service.ImpactAnalyzer;
import de.uni_mannheim.informatik.swt.plm.refactoring.service.Refactorer;

public class AddModelElementCommand<T extends DomainElement>{// extends AbstractHandler {
	
	public void run(T refactoringOrigin, EStructuralFeature attributeToChange, DomainElement newValue){
		try {
			AddModelElementDialog dialog = showAddModelElementDialog(newValue);
			runRefactoring(refactoringOrigin, attributeToChange, newValue, dialog.getChangeOntologicalTypes(), dialog.getChangeSubtypes(), dialog.getChangeSupertypes());
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	protected AddModelElementDialog showAddModelElementDialog(DomainElement newValue) throws ExecutionException{
		AddModelElementDialog dialog = new AddModelElementDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		
		
		if (dialog.open() == Window.OK){
			newValue.setName(dialog.getNewValue());
			return dialog;
		}
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
	protected boolean runRefactoring(T refactoringOrigin, EStructuralFeature attributeToChange, DomainElement newValue, boolean changeOntologicalTypes, boolean changeSubtypes, boolean changeSuperTypes){
		Set<T> refactoredElements = (Set<T>)new ImpactAnalyzer().calculateImpactOfChange((Clabject)refactoringOrigin, attributeToChange, changeOntologicalTypes, changeSubtypes, changeSuperTypes);
				
		//***************************************************************
		//Execute change operation
		//***************************************************************
		final CompoundCommand refactoringCommand = new CompoundCommand("Refactoring - " + attributeToChange.getName());
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(refactoringOrigin);
		
		for (T element : refactoredElements)
			if (element != refactoringOrigin)
				refactoringCommand.append(AddCommand.create(domain, element, attributeToChange, PLMFactory.eINSTANCE.createAttribute((Attribute)newValue)));
		
		
		//Get the currently active refactoring service
		IRefactoringService service = null;
		
		try {
			service = ExtensionPointService.Instance().getActiveRefactoringService();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		//These two variables are needed to continue listening to changes after executing the command
		final EObject origin = refactoringOrigin;
		final IRefactoringService rService = service;
		
		//stop listening as executing the command raises many following refactoring actions
		if (service != null)
			service.stopListening(EcoreUtil.getRootContainer(refactoringOrigin, true));

		domain.getCommandStack().addCommandStackListener(new CommandStackListener() {
			
			@Override
			public void commandStackChanged(EventObject event) {
				
				if (event.getSource() instanceof CommandStack 
						&& ((CommandStack)event.getSource()).getMostRecentCommand().equals(refactoringCommand))
					
					//Go on listening after changes were made
					if (rService != null)
						rService.startListening(EcoreUtil.getRootContainer(origin, true));
			}
		});
		
		domain.getCommandStack().execute(refactoringCommand);
		
		return true;
	}
}