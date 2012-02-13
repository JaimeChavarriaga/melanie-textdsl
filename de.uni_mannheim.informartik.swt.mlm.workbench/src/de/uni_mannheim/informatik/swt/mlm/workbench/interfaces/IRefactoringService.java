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
package de.uni_mannheim.informatik.swt.mlm.workbench.interfaces;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.ContributionItem;

/**
 * Interface for refactoring extension point.
 *
 */
public interface IRefactoringService {

	/**
	 * Starts listening to a model
	 * 
	 * @param modelRoot
	 */
	public void startListening(EObject modelRoot);
	
	/**
	 * Stops listening to a model
	 * 
	 * @param modelRoot
	 */
	public void stopListening(EObject modelRoot);
	
	public List<ContributionItem> getAvailableRefactoringCommands(EObject[] modelElements);
		
	/**
	 * param[0] - Element - RefactoringOrigin<br />
	 * param[1] - String - oldValue <br />
	 * param[2] - String - newValue <br />
	 * param[3] - EStructuralFeature - attributeToChange
	 */
	public static final String CHANGE_VALUE = "de.uni_mannheim.informatik.swt.plm.workbench.refactoring.changevalue";
	
	/**
	 *  
	 * @param commandID Id defined by {@link IReasoningService}
	 * @param parameters Parameters defined by the id's javadoc
	 * 
	 * @return true -> operation successful; false -> operation failed
	 */
	public boolean run(String commandID, Object[] parameters);

	void addRefactoredObjects(Collection<? extends EObject> objects);
}