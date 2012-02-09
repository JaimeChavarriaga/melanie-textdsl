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
package de.uni_mannheim.informatik.swt.plm.refactoring.service.handlers;

import org.eclipse.core.commands.AbstractHandler;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;

public abstract class FeatureBaseCommand extends AbstractHandler {
	
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
	 * @param f1
	 * @param f2
	 * 
	 * @return is f2 relevant for changes to f1
	 */
	protected boolean featuresMatch(Feature f1, Feature f2){
		if (!f1.getName().equals(f2.getName()))
			return false;
		
		if ((f1.getDurability() == -1) && (f1.getDurability() == f2.getDurability()))
			return true;
		
		int f1Level = f1.getClabject().getLevel();
		int f2Level = f2.getClabject().getLevel();
		
		if (f1Level < f2Level){
			if (f1.getDurability() == -1)
				return true;
			else if (f2.getDurability() == -1)
				return f1.getDurability() == -1;
			else
				return f2.getDurability() == f1.getDurability() - (f2Level - f1Level); 
		}
		else{
			if (f1.getDurability() == -1)
				return f2.getDurability() == -1;
			else if (f2.getDurability() ==  -1)
				return true;
			else
				return f1.getDurability() == f2.getDurability() - (f1Level - f2Level);
		}
	}
	
}
