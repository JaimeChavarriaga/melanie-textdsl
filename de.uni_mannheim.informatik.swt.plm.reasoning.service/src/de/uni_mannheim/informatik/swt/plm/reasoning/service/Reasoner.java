/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel - initial API and implementation and initial documentation
 *******************************************************************************/ 
package de.uni_mannheim.informatik.swt.plm.reasoning.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

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

	@Override
	public List<Clabject> getAllClabjects(Model m) {
		// 
		return null;
	}

	@Override
	public List<Entity> getAllEntities(Model m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Connection> getAllConnections(Model m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Generalization> getAllGeneralizations(Model m) {
		Set<Generalization> result = new HashSet<Generalization>();
		OCL ocl = OCL.newInstance();
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
				.createOCLHelper();
		OCLExpression<EClassifier> q;
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.MODEL);
		try {
			q = helper.createQuery("self.content->select(e|e.oclIsKindOf(Generalization))->asSet()");
			result = (HashSet) ocl.evaluate(m, q);
			}
		catch (ParserException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Instantiation> getAllInstantiations(Model m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clabject> getAllModelSupertypes(Clabject c) {
		// TODO Auto-generated method stub
		return null;
	}

}
