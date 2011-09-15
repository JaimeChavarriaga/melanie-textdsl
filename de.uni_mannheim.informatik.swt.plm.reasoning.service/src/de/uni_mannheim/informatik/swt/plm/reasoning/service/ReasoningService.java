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

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Method;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology;
import de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMFactoryImpl;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.ConsistencyCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.ConsistentClassificationCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.FeatureConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.HasAdditionalPropertiesCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.HyponymCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.InstanceCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.IsExpressedInstanceOfExcludedCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.IsonymCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.LocalConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.MultiplicityConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.NeighbourhoodConformsCommand;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers.PropertyConformsCommand;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class ReasoningService implements IReasoningService {
	
	private static IReasoningService instance = null;
	private List<IPropertyChangeListener> listeners = new LinkedList<IPropertyChangeListener>(); 
	public ReasoningService() {
		
	}
	
	public CompositeCheck createCompositeCheck(String name, Element source, Element target, String expression) {
		CompositeCheck check = ReasoningResultFactory.eINSTANCE.createCompositeCheck();
		check.setName(name);
		check.setSource(source);
		check.setTarget(target);
		check.setExpression(expression);
		return check;
	}
	
	
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
		
		boolean result = false;
		if (this != instance) { 
			throw new RuntimeException("Deine Mutter heißt Horst und zieht Lastwagen auf Sport1");
		}
		if (commandID == ReasoningService.CAN_CONNECTION_EXIST) {
			return canConnectionExist((Connection)parameters[0], (Connection)parameters[1]);
		} else if (commandID == ReasoningService.CREATE_ATTRIBUTE) {
			return createAttribute((Attribute)parameters[0]) != null;
		} else if (commandID == ReasoningService.CREATE_METHOD) {
			return createMethod((Method)parameters[0]) != null;
		} else if (commandID == ReasoningService.DRESS_INSTANCE_FROM_TYPE) {
			try {
				dressInstanceFromType((Clabject)parameters[0], (Clabject)parameters[1]);
				} catch (Exception e) {
					e.printStackTrace();
				}
		} else if (commandID == ReasoningService.FEATURE_CONFORMS) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			FeatureConformsCommand command = new FeatureConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (commandID.equals(ReasoningService.LOCAL_CONFORMS)){
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			params.put("forceClabject", parameters.length > 2 ? parameters[2] : false);
			LocalConformsCommand command = new LocalConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.MULTIPLICITY_CONFORMS) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("connection", parameters[0]);
			MultiplicityConformsCommand command = new MultiplicityConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (commandID == ReasoningService.NEIGHBOURHOOD_CONFORMS) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			NeighbourhoodConformsCommand command = new NeighbourhoodConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.PROPERTY_CONFORMS) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			PropertyConformsCommand command = new PropertyConformsCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_EXPRESSED_INSTANCE_OF_EXCLUDED) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			IsExpressedInstanceOfExcludedCommand command = new IsExpressedInstanceOfExcludedCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean)command.execute(event);
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.HAS_ADDITIONAL_PROPERTIES) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			HasAdditionalPropertiesCommand command = new HasAdditionalPropertiesCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_HYPONYM) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			HyponymCommand command = new HyponymCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_ISONYM) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			IsonymCommand command = new IsonymCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_INSTANCE) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("type", parameters[0]);
			params.put("instance", parameters[1]);
			InstanceCommand command = new InstanceCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		} else if (commandID == ReasoningService.IS_CONSISTENT) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("element", parameters[0]);
			ConsistencyCommand command = new ConsistencyCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			} 
		} else if (commandID == ReasoningService.IS_CONSISTENTLY_CLASSIFIED) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("model", parameters[0]);
			ConsistentClassificationCommand command = new ConsistentClassificationCommand();
			ExecutionEvent event = new ExecutionEvent(null, params, this, this);
			try {
				result = (Boolean) command.execute(event);
			} catch (ExecutionException e) {
				e.printStackTrace();
			} 
		}else {
			System.out.println("Unrecognized (read:implemented) command " + commandID);
		}
		System.out.println("Command Execution finished: " + commandID);
		return result;
	}
	
	//In EMF Factory?
	@Override
	public void dressInstanceFromType(Clabject type, Clabject instance) throws Exception {
		
		if (!type.isInstantiable())
			throw new Exception("Not instantiable clabject cannot be instantiated!");
		else if (type.getPotency() == 0)
			throw new Exception("Cannot create instance of type with potency 0.");
		
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

	@Override
	public boolean localConstructionConformsConnection(Connection type,
			Connection instance) {
		return run(LOCAL_CONFORMS, new Object[]{type, instance, true});
	}


	@Override
	public boolean neighbourhoodConstructionConformsConnection(Connection type,
			Connection instance) {
		if (!localConstructionConformsConnection(type, instance)) {
			return false;
		}
		for (String rN: instance.getRoleName()) {
			Clabject destI = instance.getParticipantForRoleName(rN);
			Clabject destT = type.getParticipantForRoleName(rN);
			if (!run(LOCAL_CONFORMS, new Object[]{destT, destI})) {
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
	public Set<String> getPossibleRoleNamesForConnectionParticipant(
			Connection con, Clabject part) {
		Set<String> result = new HashSet<String>();
		Set<Connection> domain = getClassifyingConstructionConformanceDomain(con);
		for (Connection type: domain) {
			for (String rn: type.getRoleName()) {
				if (run(LOCAL_CONFORMS, new Object[]{type.getParticipantForRoleName(rn), part})) {
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
				if (run(LOCAL_CONFORMS, new Object[]{type.getParticipantForRoleName(rn), part})) {
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

	
	
	
	
	
	
}
