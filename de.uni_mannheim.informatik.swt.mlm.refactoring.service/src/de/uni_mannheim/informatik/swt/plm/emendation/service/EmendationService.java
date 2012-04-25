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
package de.uni_mannheim.informatik.swt.plm.emendation.service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IEmendationService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.plm.emendation.service.commands.AddAttributeCommand;
import de.uni_mannheim.informatik.swt.plm.emendation.service.commands.ChangeTraitCommand;
import de.uni_mannheim.informatik.swt.plm.emendation.service.commands.RemoveAttributeCommand;


public class EmendationService extends EContentAdapter implements IEmendationService {
	
	public static String ID = "de.uni_mannheim.informatik.swt.mlm.refactoring.service";
	
	@Override
	public void startListening(EObject modelRoot) {
		modelRoot.eAdapters().add(this);
	}

	@Override
	public void stopListening(EObject modelRoot) {
		modelRoot.eAdapters().remove(this);
	}
	
	//Used to pause refactoring while executing a refactoring operation 
	private boolean inRefactoring = false;
	
	@Override
	public void notifyChanged(Notification notification) {
		//Handles adding removing this adapter to new elements
		//in the containment hierarchy
		super.notifyChanged(notification);
		
		
		//Used to pause refactoring while executing a refactoring operation 
		if (inRefactoring)
			return;
		
		inRefactoring = true;
		
		try{
			//*********************************************
			// Model trait change
			//*********************************************
			
			//NO DELETE
			if (notification.getNotifier() instanceof DomainElement 
					&& notification.getNewValue() != null
				)
			{
				//*********************************************
				// Refactor Feature
				//*********************************************
				if (notification.getFeature() instanceof EStructuralFeature
						&& notification.getNotifier() instanceof Feature
						&& (
								((EStructuralFeature)notification.getFeature()).getName().equals("name") 
								|| ((EStructuralFeature)notification.getFeature()).getName().equals("durability")
								|| ((EStructuralFeature)notification.getFeature()).getName().equals("mutability")
								//|| ((EStructuralFeature)notification.getFeature()).getName().equals("value")
							)
					){
					ImpactAnalyzer<Feature> analyzer = new ImpactAnalyzer<Feature>();
					Collection<? extends Element> effectedModelElements = analyzer.calculateMaximalImpact((Feature)notification.getNotifier(), notification.getOldStringValue(), (EStructuralFeature)notification.getFeature());
					if (effectedModelElements.size() > 1)
						new ChangeTraitCommand<Feature>().run((Feature)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldStringValue(), notification.getNewStringValue());
				}
				//*********************************************
				// Refactor Clabject Trait change
				//*********************************************
				else if (notification.getFeature() instanceof EStructuralFeature
						&& ((EStructuralFeature)notification.getFeature()).getName().equals("potency")){
					ImpactAnalyzer<Clabject> analyzer = new ImpactAnalyzer<Clabject>();
					Collection<? extends Element> effectedModelElements = analyzer.calculateMaximalImpact((Clabject)notification.getNotifier(), notification.getOldStringValue(), (EStructuralFeature)notification.getFeature());
					if (effectedModelElements.size() > 1)
						new ChangeTraitCommand<Clabject>().run((Clabject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldStringValue(), notification.getNewStringValue());
				}
				//*********************************************
				// Refactor Clabject feature change
				//*********************************************
				
				//Clabject is added
				else if (notification.getFeature() instanceof EStructuralFeature
						&& ((EStructuralFeature)notification.getFeature()).getName().equals("feature")
						&& notification.getNewValue() instanceof Attribute){
					ImpactAnalyzer<Clabject> analyzer = new ImpactAnalyzer<Clabject>();
					Collection<? extends Element> effectedModelElements = analyzer.calculateMaximalImpact((Clabject)notification.getNotifier(), notification.getOldStringValue(), (EStructuralFeature)notification.getFeature());
	
					if (effectedModelElements.size() > 1)
						new AddAttributeCommand<Clabject>().run((Clabject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), (Attribute)notification.getNewValue());
				}
			}
			
			//DELETE value of a trait
			else if (notification.getNotifier() instanceof DomainElement 
					 && notification.getNewValue() == null){
				
				//Clabject is deleted
				if (notification.getFeature() instanceof EStructuralFeature
						&& ((EStructuralFeature)notification.getFeature()).getName().equals("feature")
						&& notification.getNewValue() == null){
					ImpactAnalyzer<Clabject> analyzer = new ImpactAnalyzer<Clabject>();
					Collection<? extends Element> effectedModelElements = analyzer.calculateMaximalImpact((Clabject)notification.getNotifier(), notification.getOldStringValue(), (EStructuralFeature)notification.getFeature());
	
					if (effectedModelElements.size() > 1)
						new RemoveAttributeCommand<Clabject>().run((Clabject)notification.getNotifier(), (Feature)notification.getOldValue());
				}
			}
		}
		finally{
			inRefactoring = false;
		}
		
		inRefactoring = false;
	}
}