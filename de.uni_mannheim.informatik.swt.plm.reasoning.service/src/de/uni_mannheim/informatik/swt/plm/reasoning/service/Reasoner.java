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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class Reasoner implements IReasoningService {

	@Override
	public Set<Generalization> getAllGeneralizations(Model m) 
	{
		Set<Generalization> result = new HashSet<Generalization>();
		OCL ocl = OCL.newInstance();
		
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		OCLExpression<EClassifier> q;
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.MODEL);
		
		try 
		{
			q = helper.createQuery("self.content->select(e|e.oclIsKindOf(Generalization))->asSet()");
			result = (HashSet) ocl.evaluate(m, q);
		} 
		catch (ParserException e) 
		{
			e.printStackTrace();
		}
		
		return result;
	}


	@Override
	public Set<Clabject> getAllClabjects(Model m) 
	{
		Set<Clabject> result = new HashSet<Clabject>();
		OCL ocl = OCL.newInstance();
		
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		OCLExpression<EClassifier> q;
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.MODEL);
		
		try 
		{
			q = helper.createQuery("self.content->select(e|e.oclIsKindOf(Clabject))->asSet()");
			result = (HashSet) ocl.evaluate(m, q);
		} 
		catch (ParserException e) 
		{
			e.printStackTrace();
		}
		
		return result;
	}


	@Override
	public Set<Entity> getAllEntities(Model m) 
	{
		Set<Entity> result = new HashSet<Entity>();
		OCL ocl = OCL.newInstance();
		
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		OCLExpression<EClassifier> q;
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.MODEL);
		
		try 
		{
			q = helper.createQuery("self.content->select(e|e.oclIsKindOf(Entity))->asSet()");
			result = (HashSet) ocl.evaluate(m, q);
		} 
		catch (ParserException e) 
		{
			e.printStackTrace();
		}
		
		return result;
	}


	@Override
	public Set<Connection> getAllConnections(Model m) 
	{
		Set<Connection> result = new HashSet<Connection>();
		OCL ocl = OCL.newInstance();
		
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		OCLExpression<EClassifier> q;
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.MODEL);
		
		try 
		{
			q = helper.createQuery("self.content->select(e|e.oclIsKindOf(Connection))->asSet()");
			result = (HashSet) ocl.evaluate(m, q);
		} 
		catch (ParserException e) 
		{
			e.printStackTrace();
		}
		
		return result;
	}


	@Override
	public Set<Instantiation> getAllInstantiations(Model m) 
	{
		Set<Instantiation> result = new HashSet<Instantiation>();
		OCL ocl = OCL.newInstance();
		
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		OCLExpression<EClassifier> q;
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.MODEL);
		
		try 
		{
			q = helper.createQuery("self.content->select(e|e.oclIsKindOf(Instantiation))->asSet()");
			result = (HashSet) ocl.evaluate(m, q);
		} 
		catch (ParserException e) 
		{
			e.printStackTrace();
		}
		
		return result;
	}


	@Override
	public Set<Clabject> getAllModelSupertypes(Clabject c) 
	{
		Set<Clabject> result = new HashSet<Clabject>();
		
		OCL ocl = OCL.newInstance();
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		OCLExpression<EClassifier> q;
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.CLABJECT);
		
		Model m = null;
		
		try 
		{	
			//Find the containing model
			q = helper.createQuery("self.oclAsType(ecore::EObject).eContainer()");
			m = (Model) ocl.evaluate(c, q);
		}
		catch (ParserException e) {
			e.printStackTrace();
		}
		
		if (m == null)
			return result;
		
		//Get all generalizations from the containing model
		Set<Generalization> generalizations = getAllGeneralizations(m);
		
		//Go through all generalizations and check if we are a subtype
		for (Generalization g : generalizations) 
		{
			if (g instanceof BinaryGeneralization
					&& ((BinaryGeneralization)g).getSupertype() != null
					&& ((BinaryGeneralization)g).getSubtype() != null
					&& ((BinaryGeneralization) g).getSubtype().equals(c))
			{
				//Add this supertype and all
				result.add(((BinaryGeneralization) g).getSupertype());
				//Find all supertypes of supertype
				result.addAll(getAllModelSupertypes(((BinaryGeneralization) g).getSupertype()));
			}
			else if (g instanceof MultipleSpecialization
						&& ((MultipleSpecialization)g).getSupertype() != null
						&& ((MultipleSpecialization)g).getSubtype().size() > 0
						&& ((MultipleSpecialization) g).getSubtype().equals(c))
			{
				//Add this supertype
				result.add(((MultipleSpecialization) g).getSupertype());
				//Find all supertypes of supertype
				result.addAll(getAllModelSupertypes(((MultipleSpecialization) g).getSupertype()));
			}
			else if (g instanceof MultipleGeneralization
						&& ((MultipleGeneralization)g).getSupertype().size() > 0
						&& ((MultipleGeneralization)g).getSubtype() != null
						&& ((MultipleGeneralization) g).getSubtype().equals(c))
			{
				//Add this supertype
				result.addAll(((MultipleGeneralization) g).getSupertype());
				//Find all supertypes of supertype
				for (Clabject superType : ((MultipleGeneralization) g).getSupertype())
					result.addAll(getAllModelSupertypes(superType));
			}
		}
		
		return result;
	}


	@Override
	public Set<Clabject> getAllModelTypes(Clabject c) 
	{
		// alle model instantiations (vom model von c) durchsuchen
		//wenn c oder ein supertyp von c die instance ist sind der type und alle supertypen vom type im erg
		return null;
	}


	@Override
	public boolean isModelInstanceOf(Clabject instance, Clabject type) {
		// für alle instantiations inst in model(instance)
//		wenn inst.instance in (instance vereinigt instance.supertypes()) ist:
//		wenn inst.type in (type vereinigt type.subtypes()) ist:
//		True
		return false;
	}


	@Override
	public boolean isModelTypeOf(Clabject instance, Clabject type) {
		// reverse call zu is modelinstance of
		return false;
	}


	@Override
	public Set<Clabject> getAllModelInstances(Clabject t) {
		// entweder man gathered über alle instantiations oder man ruft auf allen clabjects ismodelinstance auf
		return null;
	}


	@Override
	public Set<Clabject> getAllModelSubtypes(Clabject sup) {
		// recursives durchsuchen der generalizations analog getmodelsupertypes
		return null;
	}


	@Override
	public Clabject createInstanceFrom(Clabject type) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean canConnectionExist(Clabject source, Clabject target) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Clabject> getAllPossibleTypeForModel(Element e) {
		// TODO Auto-generated method stub
		return null;
	}
}
