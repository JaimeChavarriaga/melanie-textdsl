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
package de.uni_mannheim.informatik.swt.plm.refactoring.service;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IRefactoringService;


public class Refactorer implements IRefactoringService {

	@Override
	public boolean changeValue(EObject modelElement,
			EStructuralFeature feature, Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(EObject modelElement) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getAvailableRefactoringCommands(EObject modelElement) {
		// TODO Auto-generated method stub
		return null;
	}

}
