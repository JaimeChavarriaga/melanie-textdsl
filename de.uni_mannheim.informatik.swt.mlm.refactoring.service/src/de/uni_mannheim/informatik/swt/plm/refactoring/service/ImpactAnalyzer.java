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
package de.uni_mannheim.informatik.swt.plm.refactoring.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;

public class ImpactAnalyzer<T extends DomainElement>{

	public static final String OPERATION_CHANGE = "change";
	public static final String OPERATION_DELETE = "delete";
	public static final String OPERATION_ADD = "add";
	
	/**
	 * Calculates the maximal possible impact of a change by retrieving the effected model 
	 * elements. If only one model element, the refactoring origin, is returned no impact is
	 * detected.
	 * 
	 * @return
	 */
	public Collection<T> calculateMaximalImpact(T refactoringOrigin, String oldValue, EStructuralFeature attributeToChange){
		
		return calculateImpactOfChange(refactoringOrigin, oldValue, attributeToChange, true, true, true);
	}
	
	public Collection<T> calculateImpactOfChange (Clabject refactoringOrigin, EStructuralFeature attributeToChange, boolean changeOntologicalTypes, boolean changeSubtypes, boolean changeSupertypes){
		return calculateImpactOfChange((T)refactoringOrigin, null, attributeToChange, changeOntologicalTypes, changeSubtypes, changeSupertypes);
	}
	
	/**
	 * Returns all effected Fearures.
	 * 
	 * @return
	 */
	public Collection<T> calculateImpactOfChange (T refactoringOrigin, String oldValue, EStructuralFeature attributeToChange, boolean changeOntologicalTypes, boolean changeSubtypes, boolean changeSupertypes){
		Clabject refactorOriginClabject = refactoringOrigin instanceof Clabject ? (Clabject)refactoringOrigin : (Clabject)refactoringOrigin.eContainer();
		
		
		//Kepp out duplicates for performance reasons
		Set<Clabject> currentLevelEffectedClabjects = new HashSet<Clabject>();
		currentLevelEffectedClabjects.add(refactorOriginClabject);
		Set<Clabject> typeLevelEffectedClabjects = new HashSet<Clabject>();
		Set<Clabject> instanceLevelEffectedClabjects = new HashSet<Clabject>();
		Set<T> result = new HashSet<T>();
		
		
		//***************************************************************
		//Collect current level
		//***************************************************************
		if (changeSubtypes)
			currentLevelEffectedClabjects.addAll(refactorOriginClabject.getModelSubtypes());
		if(changeSupertypes)
			currentLevelEffectedClabjects.addAll(refactorOriginClabject.getModelSupertypes());
		
		//***************************************************************
		//Collect all type levels
		//***************************************************************
		if (changeOntologicalTypes)
			for(Clabject c:currentLevelEffectedClabjects)
				typeLevelEffectedClabjects.addAll(c.getEigenModelClassificationTreeAsInstance());
		//***************************************************************
		//Collect instance level
		//***************************************************************
		for(Clabject c:currentLevelEffectedClabjects)
			typeLevelEffectedClabjects.addAll(c.getEigenModelClassificationTreeAsType());
		
		Set<Clabject> allEffectedClabjects = new HashSet<Clabject>();
		allEffectedClabjects.addAll(instanceLevelEffectedClabjects);
		allEffectedClabjects.addAll(typeLevelEffectedClabjects);
		allEffectedClabjects.addAll(currentLevelEffectedClabjects);
		
		//If features are looked for matching features in the related clabjects
		//need to be found
		if (refactoringOrigin instanceof Feature){
			for (Clabject instance: allEffectedClabjects)
				for (Feature feature : instance.getFeature())
					if (match((Feature)refactoringOrigin, feature, attributeToChange, oldValue))
						if (!attributeToChange.getName().equals("value"))
							result.add((T)feature);
						else
							//If the value is change only the ones that do have the same value
							//are taken. This shall provide annoying behavior when overriding
							//default values at instance levels
							if (
								(feature.eGet(attributeToChange) == null && oldValue == null)
									|| feature.eGet(attributeToChange).equals(oldValue))
								result.add((T)feature);
		}
		//We have a clabject
		else{
			result.addAll((Set<T>)allEffectedClabjects);
		}
		
		return result;
	}
	
	/**
	 * 
	 * This checks whether two features are relevant for refactoring.
	 * The conditions are:
	 * 
	 * <ul>
	 * 	<li>Name must be equal</li>
	 *  <li>
	 *  	Potency rules are not allowed to be violated
	 *  	<ul>
	 *  		<li>f1.potency = -1 && f2.potency = -1</li>
	 *  		<li>f1.potency = -1 && f1.level < f2.level => f2.potency > -2
	 *  		<li>f1.potency = -1 && f1.level > f2.level => f2.potency = -1
	 *  		<li>f1.potency > -1 && f1.level < f2.level => f2.potency = f1.potency - (f2.level - f1.level)</li>
	 *  		<li>f1.potency > -1 && f1.level > f2.level => f1.potency = f2.potency - (f1.level - f2.level)</li>
	 *  	</ul>
	 *  </li>
	 * </ul>
	 * 
	 * @param refactoringOrigin
	 * @param f2
	 * @param newValue can bee needed because if refactoring request comes from UI it can be already changed in 
	 * 					the feature
	 * @param attributeToChange
	 * @return is f2 relevant for changes to refactoringOrigin
	 */
	protected boolean match(Feature refactoringOrigin, Feature f2, EStructuralFeature attributeToChange, String oldValue){
		String originName = attributeToChange.getName().equals("name") ? oldValue : refactoringOrigin.getName();
		int originDurability = attributeToChange.getName().equals("durability") ? Integer.parseInt(oldValue) : refactoringOrigin.getDurability();
		
		if (originName == null || originName.length() == 0 || !originName.equals(f2.getName()))
			return false;
		
		if ((originDurability == -1) && (originDurability == f2.getDurability()))
			return true;
		
		int f1Level = refactoringOrigin.getClabject().getLevel();
		int f2Level = f2.getClabject().getLevel();
		
		if (f1Level < f2Level){
			if (originDurability == -1)
				return true;
			else if (f2.getDurability() == -1)
				return originDurability == -1;
			else
				return f2.getDurability() == originDurability - (f2Level - f1Level); 
		}
		else{
			if (originDurability == -1)
				return f2.getDurability() == -1;
			else if (f2.getDurability() ==  -1)
				return true;
			else
				return originDurability == f2.getDurability() - (f1Level - f2Level);
		}
	}
}