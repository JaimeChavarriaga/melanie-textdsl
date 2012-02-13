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
	
	public final static String ID = "de.uni_mannheim.informatik.swt.plm.refactoring.service.commands.changefeaturedurabilitycommand";
	
	/**
	 * The constructor.
	 */
	public ChangeFeatureDurabilityCommand() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}

//	/**
//	 * the command has been executed, so extract extract the needed information
//	 * from the application context.
//	 */
//	public Object execute(ExecutionEvent event) throws ExecutionException {
//		//TODO: Change once rename feature is working as reference implementation
//		
//		
//		Feature featureToChange = (Feature)event.getObjectParameterForExecution("feature");
//		String oldValue = event.getParameter("oldValue") != null ? event.getParameter("oldValue") : String.valueOf(featureToChange.getDurability());
//		
//		ChangeValueDialog dialog = null;
//		
//		if (event.getParameter("newValue") != null)
//			dialog = showChangeValueDialog(event.getParameter("newValue").toString(), oldValue, event);
//		else
//			dialog = showChangeValueDialog(featureToChange.getName(), oldValue, event);
//		
//		if (dialog != null)
//			if (oldValue ==  null)
//				return runRefactoring(featureToChange, PLMPackage.eINSTANCE.getFeature_Durability(), String.valueOf(featureToChange.getDurability()), dialog.getNewValue(), dialog.getChangeOntologicalTypes(), dialog.getChangeSubtypes(), dialog.getChangeSupertypes());
//			else
//				return runRefactoring(featureToChange, PLMPackage.eINSTANCE.getFeature_Durability(), oldValue, dialog.getNewValue(), dialog.getChangeOntologicalTypes(), dialog.getChangeSubtypes(), dialog.getChangeSupertypes());
//				
//		else
//			return false;
//	}
}