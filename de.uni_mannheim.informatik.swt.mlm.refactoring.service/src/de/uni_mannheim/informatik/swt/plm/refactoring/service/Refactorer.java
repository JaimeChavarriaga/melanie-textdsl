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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IRefactoringService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.plm.refactoring.service.handlers.ChangeTraitCommand;


public class Refactorer implements IRefactoringService {
	
	public static String ID = "de.uni_mannheim.informatik.swt.mlm.refactoring.service";

	private Set<EObject> refactoredObjects = new HashSet<EObject>();
	
	
	private boolean checkIfRefactoredAndRemove(EObject object) {
		return refactoredObjects.remove(object);
	}
	
	@Override
	public void addRefactoredObjects(Collection<? extends EObject> objects){
		refactoredObjects.addAll(objects);
	}
	
	@Override
	public void startListening(EObject modelRoot) {
		modelRoot.eAdapters().add(new EContentAdapter(){
			@Override
			public void notifyChanged(Notification notification) {
				//Handles adding removing this adapter to new elements
				//in the containment hierarchy
				super.notifyChanged(notification);
				
				if (notification.getNotifier() instanceof Element 
						&& !checkIfRefactoredAndRemove((EObject)notification.getNotifier())
						&& notification.getNewValue() != null
					)
				{
					if (notification.getFeature() instanceof EStructuralFeature){
						new ChangeTraitCommand().run((Feature)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldStringValue(), notification.getNewStringValue());
					}
				}
			}
		});
	}

	@Override
	public void stopListening(EObject modelRoot) {
		// TODO Auto-generated method stub
	}
}