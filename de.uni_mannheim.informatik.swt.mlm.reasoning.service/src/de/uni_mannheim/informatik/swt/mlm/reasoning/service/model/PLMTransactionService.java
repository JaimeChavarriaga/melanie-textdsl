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

import java.util.Iterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.mlm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditor;

public class PLMTransactionService {
	
	Model model;
	TransactionalEditingDomain domain;
	CompoundCommand cCommand;
	
	public PLMTransactionService(Model model, String name) {
		this.model = model;
		domain = TransactionUtil.getEditingDomain(model);
		cCommand = new CompoundCommand(name);
	}
	
	public void newModelElement(EObject semanticElement) {
		Command command = AddCommand.create(domain, model, PLMPackage.eINSTANCE.getModel_Content(), semanticElement);
		cCommand.append(command);
	}
	
	public void deleteModelElement(EObject semanticElement) {
		Command deleteSemanticElementCommand = DeleteCommand.create(domain, semanticElement);
		cCommand.append(deleteSemanticElementCommand);
		View viewForSemanticElement = null;
		PLMDiagramEditor editor= (PLMDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		Diagram d = editor.getDiagram();
		Iterator<EObject> iter = d.eAllContents();
		while(iter.hasNext()){
			EObject obj = (EObject)iter.next(); 
			if (obj instanceof View && ((View)obj).getElement() == semanticElement){
				viewForSemanticElement = (View)obj;
				break;
			}
		}
		Command deleteViewCommand = DeleteCommand.create(domain, viewForSemanticElement);
		cCommand.append(deleteViewCommand);		
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
