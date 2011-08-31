/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel, Ralph Gerbig
 *    				 - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.plm.reasoning.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Method;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.MultipleSpecialization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMFactoryImpl;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.FeatureConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.LocalConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.Predicate;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class ReasoningService implements IReasoningService {
	
	private static IReasoningService instance = null;
	private List<IPropertyChangeListener> listeners = new LinkedList<IPropertyChangeListener>(); 
	
	@Override
	public void addPropertyChangeListener(IPropertyChangeListener listener) {
		if (!listeners.contains(listener))
			listeners.add(listener);
	}

	@Override
	public void removePropertyChangeListener(IPropertyChangeListener listener) {
		listeners.remove(listener);
	}	
	
	/**
	 * This is used to record all reasoning results
	 */
	private List<ReasoningResultModel> reasoningResults = new LinkedList<ReasoningResultModel>(){
		/**
		 * Does additionally notify all listeners.
		 */
		public void addLast(ReasoningResultModel e) {
			super.addLast(e);
			
			//Notify all listeners on addLast
			for (IPropertyChangeListener listener : listeners)
				listener.propertyChange(new PropertyChangeEvent(this, "reasoningResults", new LinkedList<ReasoningResultModel>(this).remove(e), this));
		};
		
		@Override
		public boolean add(ReasoningResultModel e) {
			/**
			 * Does additionally notify all listeners.
			 */
			boolean result = super.add(e);
			
			//Notify all listeners on addLast
			for (IPropertyChangeListener listener : listeners)
				listener.propertyChange(new PropertyChangeEvent(this, "reasoningResults", new LinkedList<ReasoningResultModel>(this).remove(e), this));
			
			return result;
		}
	};
	
	@Override
	public List<ReasoningResultModel> getReasoningHistory() {
		return reasoningResults;
	}


	@Override
	public ReasoningResultModel getLastResult() {
		return ((LinkedList<ReasoningResultModel>)reasoningResults).getLast();
	}
	
	@Override
	public IReasoningService Instance() {
		
		if (instance == null){
			instance = new ReasoningService();
			return instance;
		}
		
		return instance;
	}


	@Override
	public boolean run(String commandID, Object[] parameters) {
		
		if (commandID == IReasoningService.ATTRIBUTE_CONFORMS)
			return attributeConforms((Attribute)parameters[0], (Attribute)parameters[1]);
		else if (commandID == ReasoningService.CAN_CONNECTION_EXIST)
			return canConnectionExist((Connection)parameters[0], (Connection)parameters[1]);
		else if (commandID == ReasoningService.CREATE_ATTRIBUTE)
			return createAttribute((Attribute)parameters[0]) != null;
		else if (commandID == ReasoningService.CREATE_METHOD)
			return createMethod((Method)parameters[0]) != null;
		else if (commandID == ReasoningService.DRESS_INSTANCE_FROM_TYPE)
			try {dressInstanceFromType((Clabject)parameters[0], (Clabject)parameters[1]);} 
			catch (Exception e) {e.printStackTrace();}
		else if (commandID == ReasoningService.FEATURE_CONFORMS){
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			FeatureConformsCommand command = new FeatureConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				return (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//*********************
		//Missing Constants..
		//*********************
		else if (commandID == ReasoningService.LOCAL_CONFORMS){
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			LocalConformsCommand command = new LocalConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				return (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return true;
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
		
		for (Feature f : type.getAllFeatures())
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
		System.out.println("attributeConforms " + type + instance);
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
		} else if (type.getMutability()> -1 && !((instance.getMutability()+1 == type.getMutability()) || (type.getMutability() == 0 && instance.getMutability() == 0))) {
			System.out.println("not mutability. type: " + type.getMutability() + " | instance: " + instance.getMutability());
			return false;
		} else if (type.getMutability() == 0 && !(type.getValue().equals(instance.getValue()))) {
			System.out.println("not value");
			return false;
		}
		System.out.println("... true!");
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
		System.out.println("Mismatching Linguistic types " + type + instance);
		return false;
	}


	//In MM
	@Override
	public boolean localConformsClabject(Clabject type, Clabject instance) {
		if (type.getLevel() + 1 != instance.getLevel()) {
			System.out.println("not level");
			return false;
		}
		for (Feature current: type.getAllFeatures()) {
			boolean found = false;
			for (Feature possible : instance.getAllFeatures()) {
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


	//In MM
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
			if (! (instance.isNavigableForRoleName(rN) == (type.isNavigableForRoleName(rN)))) {
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
		for (String rN:type.getAllAssociateRoleNames()) {
			for (Clabject t :type.getAllAssociatesForRoleName(rN)) {
				boolean found = false;
				for (Clabject i:instance.getAllAssociatesForRoleName(rN)) {
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
		for(Connection t:type.getAllConnections()) {
			boolean found = false;
			for (Connection i: instance.getAllConnections()) {
				if (localConforms(t,i)) {
					boolean error = false;
					for (String rN: t.getRoleName()) {
						if (!localConforms(t.getParticipantForRoleName(rN), i.getParticipantForRoleName(rN))) {
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
		if (!(neighbourhoodConformsClabject(type, instance)))
			return false;
		for (String rN: type.getRoleName()) {
			if (!localConforms(type.getParticipantForRoleName(rN), instance.getParticipantForRoleName(rN))) {
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
			Clabject destI = instance.getParticipantForRoleName(rN);
			Clabject destT = type.getParticipantForRoleName(rN);
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


	@Override
	public boolean multiplicityConforms(Connection con) {
		Model classifiedModel = con.getModel().getOntology().getContent().get(con.getModel().getLevel() + 1);
		Set<Connection> domain = new HashSet<Connection>();
		for (Connection possible:classifiedModel.getAllConnections()) {
			if (neighbourhoodConforms(con, possible)) {
				domain.add(possible);
			}
		}
		for (String rN:con.getRoleName()) {
			Map<Clabject,Integer> count = new HashMap<Clabject, Integer>();
			int lower = con.getLowerForRoleName(rN);
			int upper = con.getUpperForRoleName(rN);
			for (Connection delta:domain) {
				for (Clabject part:delta.getParticipant()) {
					if (!delta.getParticipantForRoleName(rN).equals(part)) {
						if (!count.containsKey(part)) {
							count.put(part, 0);
						}
						count.put(part, count.get(part) + 1);
					}
				}
			}
			for (Entry<Clabject,Integer> entry:count.entrySet()) {
				Integer value = entry.getValue();
				if (value < lower || (upper != -1 && value > upper)) { 
					return false;
				}
			}
		}
		return true;
	}


	@Override
	public Set<String> getPossibleRoleNamesForConnectionParticipant(
			Connection con, Clabject part) {
		Set<String> result = new HashSet<String>();
		Set<Connection> domain = getClassifyingConstructionConformanceDomain(con);
		for (Connection type: domain) {
			for (String rn: type.getRoleName()) {
				if (localConforms(type.getParticipantForRoleName(rn), part)) {
					result.add(rn);
				}
			}
		}
		return result;
	}

	@Override
	public Set<Boolean> getPossibleNavigabilityForConnectionParticipant(Connection con,
			Clabject part) {
		Set<Boolean> result = new HashSet<Boolean>();
		Set<Connection> domain = getClassifyingConstructionConformanceDomain(con);
		for (Connection type: domain) {
			for (String rn: type.getRoleName()) {
				if (localConforms(type.getParticipantForRoleName(rn), part)) {
					result.add(type.isNavigableForRoleName(rn));
				}
			}
		}
		return result;
	}


	@Override
	public Set<Connection> getClassifyingConstructionConformanceDomain(Connection c) {
		Model classifyingModel = c.getModel().getOntology().getContent().get(c.getModel().getLevel() - 1); 
		Set<Connection> result = new HashSet<Connection>();
		for (Connection possible:classifyingModel.getAllConnections()) {
			if (neighbourhoodConstructionConformsConnection(possible, c)) {
				result.add(possible);
			}
		}
		return result;
	}

	@Override
	public boolean isExpressedInstanceOfExcluded(Clabject type,
			final Clabject instance) {
		Set<Instantiation> classifications = new HashSet<Instantiation>(instance.getModel().getAllInstantiations());
		classifications = (Set<Instantiation>) ReasoningServiceUtil.filter(classifications, new Predicate<Instantiation>() {
			public boolean apply(Instantiation inst) {
				if (inst.isExpressed())
					return inst.getInstance().equals(instance);
				return false;
			}
		});
		Set<Clabject> expressedTypes = new HashSet<Clabject>();
		Set<Clabject> temp = new HashSet<Clabject>();
		for (Instantiation inst: classifications) {
			temp.add(inst.getType());
		}
		for (Clabject current: temp) {
			expressedTypes.add(current);
			expressedTypes.addAll(current.getModelSupertypes());
		}
		Set<Clabject> disjointTwins = new HashSet<Clabject>();
		Set<Generalization> generalizationsA = new HashSet<Generalization>(type.getModel().getAllGeneralizations());
		generalizationsA = (Set<Generalization>) ReasoningServiceUtil.filter(generalizationsA, new Predicate<Generalization>() {
			public boolean apply(Generalization gener) {
				if (gener instanceof MultipleSpecialization) 
					return ((MultipleSpecialization) gener).isDisjoint();
				return false;
			}
		});
		Set<MultipleSpecialization> generalizations = new HashSet<MultipleSpecialization>((Collection<? extends MultipleSpecialization>) generalizationsA); 
		for (MultipleSpecialization gener:generalizations) {
			if(ReasoningServiceUtil.intersect(new HashSet<Clabject>(gener.getSubtype()), expressedTypes).size() > 0) {
				disjointTwins.addAll(gener.getSubtype());
			}
		}
		temp = new HashSet<Clabject>();
		for (Clabject current : disjointTwins) {
			temp.add(current);
			temp.addAll(current.getModelSupertypes());
		}
		disjointTwins = new HashSet<Clabject>(temp);
		disjointTwins.removeAll(expressedTypes);
		Set<Clabject> conflicts = new HashSet<Clabject>();
		conflicts.add(type);
		conflicts.addAll(type.getModelSupertypes());
		if (ReasoningServiceUtil.intersect(disjointTwins, conflicts).size() > 0)
			return true;
		return false;
	}
	
	@Override
	public boolean propertyConforms(Clabject type, Clabject instance) {
		if (type instanceof Connection && instance instanceof Connection)
			return propertyConformsConnection((Connection) type, (Connection) instance);
		if (type instanceof Entity && instance instanceof Entity)
			return propertyConformsClabject(type, instance);
		System.out.println("mismatching types");
		return false;
	}

	@Override
	public boolean propertyConformsClabject(Clabject type, Clabject instance) {
		if (!neighbourhoodConforms(type, instance)) {
			return false;
		}
		for(Connection deltaT:type.getAllConnections()) {
			boolean found = false;
			for (Connection deltaI: instance.getAllConnections()) {
				if(propertyConforms(deltaT, deltaI)) {
					found = true;
					break;
				}
			}
			if (!found)
				return false;
		}
		if (isExpressedInstanceOfExcluded(type, instance))
			return false;
		return true;
	}

	@Override
	public boolean propertyConformsConnection(Connection type,
			Connection instance) {
		if (!propertyConformsClabject(type, instance))
			return false;
		if (!multiplicityConforms(type))
			return false;
		for(String rN:type.getRoleName()) {
			if (!propertyConforms(type.getParticipantForRoleName(rN), instance.getParticipantForRoleName(rN)))
				return false;
		}
		return true;
	}
	
	
	
}
