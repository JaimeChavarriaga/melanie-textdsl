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
package de.uni_mannheim.informatik.swt.plm.workbench.interfaces;

import java.util.List;
import java.util.Set;

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

/**
 * Interface that must be implemented for all reasoing engines
 *
 */
public interface IReasoningService {
	
	public Model getModel(Clabject c);
	
	public Set<Clabject> getAllClabjects(Model m);
	
	public Set<Entity> getAllEntities(Model m);
	
	public Set<Connection> getAllConnections(Model m);
	
	public Set<Generalization> getAllGeneralizations(Model m);
	
	public Set<Instantiation> getAllInstantiations(Model m);
	
	public Set<Clabject> getAllModelSupertypes(Clabject c);
	
	public Set<Clabject> getAllModelSubtypes(Clabject c);
	
	public Set<Clabject> getAllModelTypes(Clabject c);
	
	public boolean isModelInstanceOf(Clabject instance, Clabject type);
	
	public boolean isModelTypeOf(Clabject instance, Clabject type);
	
	public Set<Clabject> getAllModelInstances(Clabject t);
	
	public Set<Instantiation> getAllModelInstantiationsAsInstance(Clabject i);
	
	public Set<Instantiation> getAllModelInstantiationsAsType(Clabject t);
	
	public Clabject getParticipantForRoleName(Connection c, String roleName);
	
	public String getRoleNameForParticipant(Connection c, Clabject p);
	
	public boolean isNavigableForRoleName(Connection c, String roleName);
	
	public boolean isNavigableParticipant(Connection con, Clabject p);
	
	public int getLowerForRoleName(Connection c, String roleName);
	
	public int getUpperForRoleName(Connection c, String roleName);
	
	public Set<Connection> getConnections(Clabject c);
	
	public Set<Clabject> getAllAssociates(Clabject c);
	
	public Set<String> getAssociateRoleNames(Clabject c);
	
	public Set<Clabject> getAssociatesForRoleName(Clabject source, String roleName);
	
	public Set<Feature> getAllFeatures(Clabject c);
	
	public Set<Attribute> getAllAttributes(Clabject c);
	
	public Set<Method> getAllMethods(Clabject c);
	
	public void dressInstanceFromType(Clabject type, Clabject instance) throws Exception;
	
	public Attribute createAttribute(Attribute type);
	
	public Method createMethod(Method type);
	
	/**
	 * Checks whether a connection can exist between source and target
	 * 
	 * @param source Connection source
	 *
	 * @param target Connection target
	 * 
	 * @return true => Connection can exist; false => else
	 */
	public boolean canConnectionExist(Connection source, Clabject target);
	

	
	/**
	 * Returns all types from which instances can be created in e. e can
	 * be a clabject, model etc.
	 * 
	 * @param e Container to get possible types that can be instantiated for
	 * 
	 * @return A list with possible types for creating instances
	 */
	Set<Clabject> getAllPossibleTypeForModel(Model m);

	public boolean attributeConforms(Attribute type, Attribute instance);
	
	public boolean methodConforms(Method type, Method instance);
	
	public boolean featureConforms( Feature type, Feature instance);
	
	public boolean localConformsClabject( Clabject type, Clabject instance);
	
	public boolean localConstructionConformsConnection( Connection type, Connection instance );
	
	public boolean localConformsConnection( Connection type, Connection instance);
	
	public boolean localConforms(Clabject type, Clabject instance);
	
	public boolean neighbourhoodConforms(Clabject type, Clabject instance);
	
	public boolean neighbourhoodConformsConnection(Connection type, Connection instance);
	
	public boolean neighbourhoodConstructionConformsConnection( Connection type, Connection instance );
	
	public Set<Connection> getModelConnections(Clabject c);
	
	public Set<Connection> getAllConnections(Clabject c);
	
	public Element getElementByXMIID(String id, Element modelElement);
	
	public boolean multiplicityConforms(Connection con);
	
	public Set<String> getPossibleRoleNamesForConnectionParticipant(Connection con, Clabject part);
	
	public Set<Boolean> getPossibleNavigabilityForConnectionParticipant(Connection con, Clabject part);
	
	public Set<Connection> getClassifyingConstructionConformanceDomain(Connection c);
	
}