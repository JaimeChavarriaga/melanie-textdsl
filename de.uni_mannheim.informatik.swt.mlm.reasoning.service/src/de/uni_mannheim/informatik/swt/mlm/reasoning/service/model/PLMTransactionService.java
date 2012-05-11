/*******************************************************************************
 * Copyright (c) 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.reasoning.service.model;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import de.uni_mannheim.informatik.swt.mlm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

public class PLMTransactionService {
	
	Model model;
	TransactionalEditingDomain domain;
	CompoundCommand cCommand;
	
	public PLMTransactionService(Model model, String name) {
		this.model = model;
		domain = TransactionUtil.getEditingDomain(model);
		cCommand = new CompoundCommand(name);
	}
	
	public void newModelElement(Element element) {
		Command command = AddCommand.create(domain, model, PLMPackage.eINSTANCE.getModel_Content(), element);
		cCommand.append(command);
	}
	
	public void deleteModelElement(EObject element) {
		Command command = DeleteCommand.create(domain, element);
		cCommand.append(command);
	}
	
	public void execute() {
		if (!cCommand.isEmpty()) {
			try {		
				ExtensionPointService.Instance().getActiveEmendationService().stopListening(EcoreUtil.getRootContainer(model));
				domain.getCommandStack().execute(cCommand);
				ExtensionPointService.Instance().getActiveEmendationService().startListening(EcoreUtil.getRootContainer(model));
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

}
