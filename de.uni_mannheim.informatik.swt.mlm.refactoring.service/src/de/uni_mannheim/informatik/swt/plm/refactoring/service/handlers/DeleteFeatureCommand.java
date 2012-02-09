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

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class DeleteFeatureCommand extends FeatureBaseCommand {
	
	public final static String ID = "de.uni_mannheim.informatik.swt.plm.refactoring.service.commands.deletefeaturecommand";
	
	/**
	 * The constructor.
	 */
	public DeleteFeatureCommand() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Feature featureToChange = (Feature)event.getObjectParameterForExecution("feature");
		Clabject containingClabject = (Clabject)featureToChange.eContainer();
		
		List<Clabject> instances = containingClabject.getModelInstances();
		
		CompoundCommand refactoringCommand = new CompoundCommand("Refactoring");
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(featureToChange);
		
		for (Clabject instance: instances)
			for (Feature feature : instance.getFeature())
				if (featuresMatch(featureToChange, feature))
					refactoringCommand.append(RemoveCommand.create(domain, feature));
		
		refactoringCommand.append(RemoveCommand.create(domain, featureToChange));
		domain.getCommandStack().execute(refactoringCommand);
		
		return false;
	}
}