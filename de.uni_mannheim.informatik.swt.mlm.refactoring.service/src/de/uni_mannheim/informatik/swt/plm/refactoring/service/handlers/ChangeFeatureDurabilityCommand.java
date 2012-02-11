/*******************************************************************************
 * Copyright (c) 2011, 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.plm.refactoring.service.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.refactoring.service.dialogs.ChangeValueDialog;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ChangeFeatureDurabilityCommand extends ChangeFeatureTraitBaseCommand {
	
	public final static String ID = "de.uni_mannheim.informatik.swt.plm.refactoring.service.commands.renamefeaturecommand";
	
	/**
	 * The constructor.
	 */
	public ChangeFeatureDurabilityCommand() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Feature featureToChange = (Feature)event.getObjectParameterForExecution("feature");
		
		ChangeValueDialog dialog = showChangeValueDialog(featureToChange.getName(), event);
		
		if (dialog != null)
			return runRefactoring(featureToChange, PLMPackage.eINSTANCE.getFeature_Durability(), dialog.getNewValue(), dialog.getChangeOntologicalTypes(), dialog.getChangeSubtypes(), dialog.getChangeSupertypes());
		else
			return false;
	}
}