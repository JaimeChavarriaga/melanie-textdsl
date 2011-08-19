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

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
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
	
	  

	//In MM
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


	//In MM
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


	//In MM
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


	//In MM
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


	//In MM
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


	//In MM
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

	//In MM
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

	//In MM
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

	//In MM
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
	
	//In MM
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
	
	//In MM
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
	
	
	//In MM
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

	
	//In MM
	@Override
	public boolean isModelInstanceOf(Clabject instance, Clabject type) {
		return getAllModelInstances(type).contains(instance);
	}

	//Is MM
	@Override
	public boolean isModelTypeOf(Clabject instance, Clabject type) {
		return getAllModelTypes(instance).contains(type);
	}


	//In MM
	@Override
	public Clabject getParticipantForRoleName(Connection c, String roleName) {
		if (!c.getRoleName().contains(roleName))
			return null;
		return c.getParticipant().get(c.getRoleName().indexOf(roleName));
	}

	
	//In MM
	@Override
	public String getRoleNameForParticipant(Connection c, Clabject p) {
		if (!c.getParticipant().contains(p))
			return null;
		return c.getRoleName().get(c.getParticipant().indexOf(p));
	}


	//In MM
	@Override
	public boolean isNavigableForRoleName(Connection c, String roleName) {
		if (!c.getRoleName().contains(roleName))
			return false;
		return c.getIsNavigable().get(c.getRoleName().indexOf(roleName));
	}
	
	//In MM
	@Override
	public boolean isNavigableParticipant(Connection con, Clabject p) {
		if (!con.getParticipant().contains(p))
			return false;
		return con.getIsNavigable().get(con.getParticipant().indexOf(p));
	}


	//In MM
	@Override
	public int getLowerForRoleName(Connection c, String roleName) {
		if (!c.getRoleName().contains(roleName))
			return Integer.MAX_VALUE;
		return c.getLower().get(c.getRoleName().indexOf(roleName));
	}


	//In MM
	@Override
	public int getUpperForRoleName(Connection c, String roleName) {
		if (!c.getRoleName().contains(roleName))
			return Integer.MIN_VALUE;
		return c.getUpper().get(c.getRoleName().indexOf(roleName));
	}

	
	//In MM
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


	//In MM
	//getAllModelConnections
	@Override
	public Set<Connection> getModelConnections(Clabject c) {
		Set<Connection> result = new HashSet<Connection>();
		Queue<Clabject> queue = new ConcurrentLinkedQueue<Clabject>();
		queue.addAll(getAllModelSupertypes(c));
		Clabject current;
		while (! queue.isEmpty()) {
			current = queue.poll();
			result.addAll(getConnections(current));			
		}
		return result;
	}


	//In MM
	@Override
	public Set<Connection> getAllConnections(Clabject c) {
		Set<Connection> result = getModelConnections(c);
		result.addAll(getConnections(c));
		return result;
	}


	//In MM
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


	//In MM
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


	//In MM
	@Override
	public Set<Clabject> getAssociatesForRoleName(Clabject source, String roleName) {
		Set<Clabject> result = new HashSet<Clabject>();
		for (Connection con : getConnections(source)) {
			if (con.getRoleName().contains(roleName) && isNavigableForRoleName(con, roleName)) {
				result.add(getParticipantForRoleName(con, roleName));
			}
		}
		return result;
	}


	//In MM
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

	//In MM
	@Override
	public Set<Attribute> getAllAttributes(Clabject c) {
		Set<Attribute> result = new HashSet<Attribute>();
		Set<Feature> features = getAllFeatures(c);
		
		for (Feature f : features)
			if (f instanceof Attribute)
				result.add((Attribute)f);
		
		return result;
	}


	//In MM
	@Override
	public Set<Method> getAllMethods(Clabject c) {
		Set<Method> result = new HashSet<Method>();
		Set<Feature> features = getAllFeatures(c);
		
		for (Feature f : features)
			if (f instanceof Method)
				result.add((Method)f);
		
		return result;
	}

	//In EMF Factory?
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


	//In EMF Factory?
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


	//In EMF Factory?
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
	public boolean canConnectionExist(Connection source, Clabject target) {
		return false;
	}


	//In MM
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

	
	//In MM
	@Override
	public boolean attributeConforms(Attribute type, Attribute instance) {
		if (type.getName() == null) {
			throw new RuntimeException("Malformed type attribute " + type);
		} 
		if (!type.getName().equals(instance.getName())) {
			System.out.println("not name");
			return false;
		} //TODO: proper datatype handling
		else if(type.getDatatype() != null && (!type.getDatatype().equals(instance.getDatatype()))) {
			System.out.println("not datatype");
			return false;
		} else if (type.getDurability()> -1 && !(instance.getDurability()+1 == type.getDurability())) {
			System.out.println("not durability");
			return false;
		} else if (type.getMutability()> -1 && (!(instance.getMutability()+1 == type.getMutability()) || (type.getMutability() == 0 && instance.getMutability() == 0))) {
			System.out.println("not mutability");
			return false;
		} else if (type.getMutability() == 0 && !(type.getValue().equals(instance.getValue()))) {
			System.out.println("not value");
			return false;
		}
		return true;
	}

	//In MM
	@Override
	public boolean methodConforms(Method type, Method instance) {
		if (type.getName() == null) {
			throw new RuntimeException("Malformed type method " + type);
		} 
		if (!type.getName().equals(instance.getName())) {
			System.out.println("not name");
			return false;
		}  else if (type.getDurability()> -1 && !(instance.getDurability()+1 == type.getDurability())) {
			System.out.println("not durability");
			return false;
		}
		return true;
	}


	//In MM
	@Override
	public boolean featureConforms(Feature type, Feature instance) {
		if (type instanceof Method && instance instanceof Method)
			return methodConforms((Method) type, (Method) instance);
		if (type instanceof Attribute && instance instanceof Attribute)
			return attributeConforms((Attribute) type, (Attribute) instance);
		System.out.println("Mismatching Linguistic types");
		return false;
	}


	@Override
	public boolean localConformsClabject(Clabject type, Clabject instance) {
		if (type.getLevel() + 1 != instance.getLevel()) {
			System.out.println("not level");
			return false;
		}
		for (Feature current: getAllFeatures(type)) {
			boolean found = false;
			for (Feature possible : getAllFeatures(instance)) {
				if (featureConforms(current, possible)) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("not feature " + current.getName());
				return false;
			}
		}
		return true;
	}


	@Override
	public boolean localConstructionConformsConnection(Connection type,
			Connection instance) {
		return localConformsClabject(type, instance);
	}


	@Override
	public boolean localConformsConnection(Connection type, Connection instance) {
		if (!localConformsClabject(type, instance)) {
			return false;
		} 
		for (String rN : type.getRoleName()) {
			boolean found = instance.getRoleName().contains(rN);
			if (!found) {
				System.out.println("not roleName " + rN);
				return false;
			} 
			if (! (isNavigableForRoleName(instance, rN) == (isNavigableForRoleName(type, rN)))) {
				System.out.println("not navigability match " + rN);
				return false;
			}
		}
		return false;
	}


	@Override
	public boolean localConforms(Clabject type, Clabject instance) {
		if (type instanceof Connection && instance instanceof Connection)
			return localConformsConnection((Connection) type, (Connection) instance);
		if (type instanceof Entity && instance instanceof Entity)
			return localConformsClabject(type, instance);
		System.out.println("mismatching types");
		return false;
	}


	@Override
	public boolean neighbourhoodConforms(Clabject type, Clabject instance) {
		if (type instanceof Connection && instance instanceof Connection)
			return neighbourhoodConformsConnection((Connection) type, (Connection) instance);
		if (type instanceof Entity && instance instanceof Entity)
			return neighbourhoodConformsClabject(type, instance);
		System.out.println("mismatching types");
		return false;
	}


	@Override
	public boolean neighbourhoodConformsClabject(Clabject type,
			Clabject instance) {
		if (!localConforms(type, instance))
			return false;
		for (String rN:getAssociateRoleNames(type)) {
			for (Clabject t :getAssociatesForRoleName(type, rN)) {
				boolean found = false;
				for (Clabject i:getAssociatesForRoleName(instance, rN)) {
					if (localConforms(t, i)) {
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("not local conforming associate for roleName " + rN + "||"+ t);
				}
			}
		}
		for(Connection t:getAllConnections(type)) {
			boolean found = false;
			for (Connection i: getAllConnections(instance)) {
				if (localConforms(t,i)) {
					boolean error = false;
					for (String rN: t.getRoleName()) {
						if (!localConforms(getParticipantForRoleName(t, rN), getParticipantForRoleName(i, rN))) {
							error = true;
							break;
						}
					}
					if (!error) {
						found = true;
						break;
					}
				}
			}
			if (!found) {
				System.out.println("not type connection or participant " + t);
				return false;
			}
		}
		return true;
	}


	@Override
	public boolean neighbourhoodConformsConnection(Connection type,
			Connection instance) {
		if (!neighbourhoodConformsClabject(type, instance))
			return false;
		for (String rN: type.getRoleName()) {
			if (!localConforms(getParticipantForRoleName(type, rN), getParticipantForRoleName(instance, rN))) {
				System.out.println("not local conforming participant " + rN);
				return false;
			}
		}
		return true;
	}


	@Override
	public boolean neighbourhoodConstructionConformsConnection(Connection type,
			Connection instance) {
		if (!localConformsClabject(type, instance))
			return false;
		for (String rN: instance.getRoleName()) {
			Clabject destI = getParticipantForRoleName(instance, rN);
			Clabject destT = getParticipantForRoleName(type, rN);
			if (!localConforms(destT, destI)) {
				System.out.println("Wrong roleName " + rN);
				return false;
			}
		}
		return true;
	}


	@Override
	public Element getElementByXMIID(String id, Element modelElement) {
		TreeIterator<EObject> iter = EcoreUtil.getRootContainer(modelElement).eAllContents();
		while (iter.hasNext()) {
			EObject current = iter.next();
			if (EMFCoreUtil.getProxyID(current).equals(id)) 
				return (Element) current;
		}
		return null;
	}
}
