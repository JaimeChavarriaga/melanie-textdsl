/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel, Ralph Gerbig, Bjoern Goss
 *    				 - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.plm.reasoning.service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Method;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleGeneralization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMFactoryImpl;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class Reasoner implements IReasoningService {
	
	  

	@Override
	public Model getModel(Clabject c) {
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
		return m;
	}


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
	public Set<Clabject> getAllModelSubtypes(Clabject c)  
	{
		Set<Clabject> result = new HashSet<Clabject>();
		
		Model m = getModel(c);
		
		if (m == null)
			return result;
		
		//Get all generalizations from the containing model
		Set<Generalization> generalizations = getAllGeneralizations(m);
		
		//Go through all generalizations and check if we are a supertype
		for (Generalization g : generalizations) 
		{
			if (g instanceof BinaryGeneralization
					&& ((BinaryGeneralization)g).getSupertype() != null
					&& ((BinaryGeneralization)g).getSubtype() != null
					&& ((BinaryGeneralization) g).getSupertype().equals(c))
			{
				//Add this supertype and all
				result.add(((BinaryGeneralization) g).getSubtype());
				//Find all supertypes of supertype
				result.addAll(getAllModelSubtypes(((BinaryGeneralization) g).getSubtype()));
			}
			else if (g instanceof MultipleSpecialization
						&& ((MultipleSpecialization)g).getSupertype() != null
						&& ((MultipleSpecialization)g).getSubtype().size() > 0
						&& ((MultipleSpecialization) g).getSupertype().equals(c))
			{
				//Add this subtypes
				result.addAll(((MultipleSpecialization) g).getSubtype());
				//Find all subtypes of subtype
				for (Clabject subType : ((MultipleSpecialization) g).getSubtype())
					result.addAll(getAllModelSubtypes(subType));
			}
			else if (g instanceof MultipleGeneralization
						&& ((MultipleGeneralization)g).getSupertype().size() > 0
						&& ((MultipleGeneralization)g).getSubtype() != null
						&& ((MultipleGeneralization) g).getSupertype().contains(c))
			{
				//Add this subtype
				result.add(((MultipleGeneralization) g).getSubtype());
				//Find all subtypes of subtype
				result.addAll(getAllModelSupertypes(((MultipleGeneralization) g).getSubtype()));
			}
		}
		
		return result;
	}

	@Override
	public Set<Clabject> getAllModelSupertypes(Clabject c) 
	{
		Set<Clabject> result = new HashSet<Clabject>();
		
		Model m = getModel(c);
		
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
						&& ((MultipleSpecialization) g).getSubtype().contains(c))
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
		Set<Clabject> result = new HashSet<Clabject>();
		Queue<Clabject> queue = new ConcurrentLinkedQueue<Clabject>();
		queue.add(c);
		queue.addAll(getAllModelSupertypes(c));
		Clabject current;
		while (! queue.isEmpty()) {
			current = queue.poll();
			Set<Instantiation> insts = getAllModelInstantiationsAsInstance(current);
			for(Instantiation inst:insts) {
				result.add(inst.getType());
				result.addAll(getAllModelSupertypes(inst.getType()));
			}
		}
		return result;
	}
	
	@Override
	public Set<Clabject> getAllModelInstances(Clabject t) {
		Set<Clabject> result = new HashSet<Clabject>();
		Queue<Clabject> queue = new ConcurrentLinkedQueue<Clabject>();
		queue.add(t);
		queue.addAll(getAllModelSubtypes(t));
		Clabject current;
		while (! queue.isEmpty()) {
			current = queue.poll();
			Set<Instantiation> insts = getAllModelInstantiationsAsType(current);
			for(Instantiation inst:insts) {
				result.add(inst.getInstance());
				result.addAll(getAllModelSubtypes(inst.getInstance()));
			}
		}
		return result;
	}
	
	@Override
	public Set<Instantiation> getAllModelInstantiationsAsInstance(Clabject i) {
		Set<Instantiation> result = new HashSet<Instantiation>();
		
		OCL ocl = OCL.newInstance();
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		OCLExpression<EClassifier> q;
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.CLABJECT);
		try 
		{	
			//Find the containing model
			q = helper.createQuery("Instantiation.allInstances()->select(i|i.instance = self)");
			result = (Set<Instantiation>) ocl.evaluate(i, q);
		}
		catch (ParserException e) {
			e.printStackTrace();
		}
		return result;
	};
	
	@Override
	public Set<Instantiation> getAllModelInstantiationsAsType(Clabject t) {
		Set<Instantiation> result = new HashSet<Instantiation>();
		
		OCL ocl = OCL.newInstance();
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		OCLExpression<EClassifier> q;
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.CLABJECT);
		try 
		{	
			//Find the containing model
			q = helper.createQuery("Instantiation.allInstances()->select(i|i.type = self)");
			result = (Set<Instantiation>) ocl.evaluate(t, q);
		}
		catch (ParserException e) {
			e.printStackTrace();
		}
		return result;
	};


	@Override
	public boolean isModelInstanceOf(Clabject instance, Clabject type) {
		return getAllModelInstances(type).contains(instance);
	}


	@Override
	public boolean isModelTypeOf(Clabject instance, Clabject type) {
		return getAllModelTypes(instance).contains(type);
	}


	@Override
	public Clabject geParticipantForRoleName(Connection c, String roleName) {
		if (!c.getRoleName().contains(roleName))
			return null;
		return c.getParticipant().get(c.getRoleName().indexOf(roleName));
	}

	
	@Override
	public String getRoleNameForParticipant(Connection c, Clabject p) {
		if (!c.getParticipant().contains(p))
			return null;
		return c.getRoleName().get(c.getParticipant().indexOf(p));
	}


	@Override
	public boolean isNavigableForRoleName(Connection c, String roleName) {
		if (!c.getRoleName().contains(roleName))
			return false;
		return c.getIsNavigable().get(c.getRoleName().indexOf(roleName));
	}
	
	@Override
	public boolean isNavigableParticipant(Connection con, Clabject p) {
		if (!con.getParticipant().contains(p))
			return false;
		return con.getIsNavigable().get(con.getParticipant().indexOf(p));
	}


	@Override
	public int getLowerForRoleName(Connection c, String roleName) {
		if (!c.getRoleName().contains(roleName))
			return Integer.MAX_VALUE;
		return c.getLower().get(c.getRoleName().indexOf(roleName));
	}


	@Override
	public int getUpperForRoleName(Connection c, String roleName) {
		if (!c.getRoleName().contains(roleName))
			return Integer.MIN_VALUE;
		return c.getUpper().get(c.getRoleName().indexOf(roleName));
	}


	@Override
	public Set<Connection> getConnections(Clabject c) {
		Set<Connection> result = new HashSet<Connection>();
		
		OCL ocl = OCL.newInstance();
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		OCLExpression<EClassifier> q;
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.CLABJECT);
		try 
		{	
			//Find the containing model
			q = helper.createQuery("Connection.allInstances()->select(c|c.participant->contains(self))");
			result = (Set<Connection>) ocl.evaluate(c, q);
		}
		catch (ParserException e) {
			e.printStackTrace();
		}
		return result;
	}


	@Override
	public Set<Clabject> getAllAssociates(Clabject c) {
		Set<Clabject> result = new HashSet<Clabject>();
		for (Connection con: getConnections(c)) {
			for (Clabject p: con.getParticipant()) {
				if (isNavigableParticipant(con, p)) {
					result.add(p);
				}
			}
		}
		return result;
	}


	@Override
	public Set<String> getAssociateRoleNames(Clabject c) {
		Set<String> result = new HashSet<String>();
		for (Connection con: getConnections(c)) {
			for (Clabject p: con.getParticipant()) {
				if (isNavigableParticipant(con, p)) {
					result.add(getRoleNameForParticipant(con, p));
				}
			}
		}
		return result;
	}


	@Override
	public Set<Clabject> getAssociatesForRoleName(Clabject source, String roleName) {
		Set<Clabject> result = new HashSet<Clabject>();
		for (Connection con : getConnections(source)) {
			if (con.getRoleName().contains(roleName) && isNavigableForRoleName(con, roleName)) {
				result.add(geParticipantForRoleName(con, roleName));
			}
		}
		return result;
	}


	@Override
	public Set<Feature> getAllFeatures(Clabject c) {
		Set<Feature> result = new HashSet<Feature>();
		Queue<Clabject> queue = new ConcurrentLinkedQueue<Clabject>();
		queue.add(c);
		queue.addAll(getAllModelSupertypes(c));
		while (!queue.isEmpty()) {
			Clabject current = queue.poll();
			result.addAll(current.getFeature());
		}
		return result;
	}


	@Override
	public Set<Attribute> getAllAttributes(Clabject c) {
		Set<Attribute> result = new HashSet<Attribute>();
		Set<Feature> features = getAllFeatures(c);
		
		for (Feature f : features)
			if (f instanceof Attribute)
				result.add((Attribute)f);
		
		return result;
	}


	@Override
	public Set<Method> getAllMethods(Clabject c) {
		Set<Method> result = new HashSet<Method>();
		Set<Feature> features = getAllFeatures(c);
		
		for (Feature f : features)
			if (f instanceof Method)
				result.add((Method)f);
		
		return result;
	}

	@Override
	public void dressInstanceFromType(Clabject type, Clabject instance) throws Exception {
		
		if (!type.isInstantiable())
			throw new Exception("Not instantiable clabject cannot be instantiated!");
		else if (type.getPotency() == 0)
			throw new Exception("Cannot create instance of type with potency 0.");
		
		instance.setBlueprint(type);
		instance.setLevel(type.getLevel() + 1);
		instance.setElided(type.isElided());
		instance.setExpressed(type.isExpressed());
		instance.setOrigin(type.getOrigin());
		
		//Quick hack to get a visualizer from type in
		instance.getVisualizer().clear();
		instance.getVisualizer().add(EcoreUtil.copy(type.getVisualizer().get(0)));
		
		int newPotency = -1;
		
		if (type.getPotency() == -1)
			newPotency = -1;
		else if (type.getPotency() > 0)
			newPotency = type.getPotency() - 1;
		
		instance.setPotency(newPotency);
		instance.setRelevant(type.isRelevant());
		instance.setVisualizersShown(type.getVisualizersShown());
		
		List<Feature> features = new LinkedList<Feature>();
		
		for (Feature f : getAllFeatures(type))
		{
			if (f.getDurability() == 0)
				continue;
			
			Feature newFeature = f instanceof Attribute? createAttribute((Attribute) f): createMethod((Method) f);
			
			features.add(newFeature);
		}
		instance.getFeature().addAll(features);
		
		Instantiation i = PLMFactoryImpl.eINSTANCE.createInstantiation();
		i.setType(type);
		i.setInstance(instance);
		((Model)instance.eContainer()).getContent().add(i);
	}


	@Override
	public Attribute createAttribute(Attribute type) {
		Attribute result = PLMFactoryImpl.eINSTANCE.createAttribute();
		
		int newDurability = -1;
		if (type.getDurability() == -1)
			newDurability = -1;
		else if (type.getDurability() > 0)
			newDurability = type.getDurability() - 1;
		
		result.setDurability(newDurability);
		result.setElided(type.isElided());
		result.setExpressed(type.isExpressed());
		result.setName(type.getName());
		result.setRelevant(type.isRelevant());
		
		//Quick hack to get a visualizer from type in
		result.getVisualizer().add(EcoreUtil.copy(type.getVisualizer().get(0)));
		
		result.setDatatype(type.getDatatype());
		int newMutability = -1;
		if (type.getMutability() == -1)
			newMutability = -1;
		else 
			newMutability = java.lang.Math.max(0, (type.getMutability() - 1));
		result.setValue(type.getValue());
		result.setMutability(newMutability);
		
		return result;
	}


	@Override
	public Method createMethod(Method type) {
		Method result = PLMFactoryImpl.eINSTANCE.createMethod();
		
		int newDurability = -1;
		if (type.getDurability() == -1)
			newDurability = -1;
		else if (type.getDurability() > 0)
			newDurability = type.getDurability() - 1;
		
		result.setDurability(newDurability);
		result.setElided(type.isElided());
		result.setExpressed(type.isExpressed());
		result.setName(type.getName());
		result.setRelevant(type.isRelevant());
		
		//Quick hack to get a visualizer from type in
		result.getVisualizer().add(EcoreUtil.copy(type.getVisualizer().get(0)));
		
		return result;
	}


	@Override
	public boolean canConnectionExist(Clabject source, Clabject target) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Set<Clabject> getAllPossibleTypeForModel(Model m) {
		OCL ocl = OCL.newInstance();
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();
		OCLExpression<EClassifier> q;
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.MODEL);
		
		int index = ((Ontology)m.eContainer()).getContent().indexOf(m);
		
		if (index <= 0)
			new HashSet<Clabject>();
		
		Model typeModel = ((Ontology)m.eContainer()).getContent().get(index - 1);
		
		Set result = null;

		try
		{	
			//Find the containing model
			q = helper.createQuery("self.content->select(c | c.oclIsKindOf(Clabject) and c.oclAsType(Clabject).instantiable and (c.oclAsType(Clabject).potency > 0 or c.oclAsType(Clabject).potency = -1))");
			result = (Set)ocl.evaluate(typeModel, q);
		}
		catch (ParserException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
