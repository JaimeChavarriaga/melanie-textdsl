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
package de.uni_mannheim.informatik.swt.plm.reasoning.service;

import java.util.List;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

/**
 * @author User01
 *
 */
public class Reasoner implements IReasoningService {

	/* (non-Javadoc)
	 * @see de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService#createInstanceFrom(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 */
	@Override
	public Clabject createInstanceFrom(Clabject type) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService#getAllInstancesOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 */
	@Override
	public List<Clabject> getAllInstancesOf(Clabject type) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService#getAllSubClabjectsOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 */
	@Override
	public List<Clabject> getAllSubClabjectsOf(Clabject c) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService#getAllSyperClabjectsOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 */
	@Override
	public List<Clabject> getAllSyperClabjectsOf(Clabject c) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService#canConnectionExist(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject, de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 */
	@Override
	public boolean canConnectionExist(Clabject source, Clabject target) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService#canAddAsChild(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject, de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 */
	@Override
	public boolean canAddAsChild(Clabject parent, Clabject child) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService#getAllPossibleTypeForParent(de.uni_mannheim.informatik.swt.models.plm.PLM.Element)
	 */
	@Override
	public List<Clabject> getAllPossibleTypeForParent(Element e) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService#isInstanceOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject, de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 */
	@Override
	public boolean isInstanceOf(Clabject instance, Clabject type) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService#isTypeOf(de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject, de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)
	 */
	@Override
	public boolean isTypeOf(Clabject type, Clabject instance) {
		// TODO Auto-generated method stub
		return false;
	}

}
