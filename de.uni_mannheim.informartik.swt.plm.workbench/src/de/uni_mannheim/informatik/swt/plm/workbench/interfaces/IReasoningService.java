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

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;

/**
 * Interface that must be implemented for all reasoing engines
 *
 */
public interface IReasoningService {
	
	public List<Clabject> getAllClabjects(Model m);
	
	public List<Entity> getAllEntities(Model m);
	
	public List<Connection> getAllConnections(Model m);
	
	public List<Generalization> getAllGeneralizations(Model m);
	
	public List<Instantiation> getAllInstantiations(Model m);
	
	public List<Clabject> getAllModelSupertypes(Clabject c);
	
	/**
	 * Creates an instance of the clabject c.
	 * 
	 * @param type The Clabject to create an instance from
	 * 
	 * @return The clabject which is an instance
	 */
	public Clabject createInstanceFrom(Clabject type);
	
	/**
	 * Returns all instances of the clabject type.
	 * 
	 * @param type The clabject to return all instances of
	 * 
	 * @return A list with instances of the clabject
	 */
	public List<Clabject> getAllInstancesOf(Clabject type);
	
	/**
	 * Returns all clabjects that inherit from clabject c.
	 * 
	 * @param c The clabject from which the sub clabjects are retrieved

	 * @return A list of clabjects that inherit from c
	 */
	public List<Clabject> getAllSubClabjectsOf(Clabject c);
	
	
	/**
	 * Returns all clabjects from which c inherits from
	 * 
	 * @param c The clabject to retrieve all super clabjects from
	 * 
	 * @return A list of super clabjects
	 */
	public List<Clabject> getAllSyperClabjectsOf(Clabject c);
	
	/**
	 * Checks whether a connection can exist between source and target
	 * 
	 * @param source Connection source
	 *
	 * @param target Connection target
	 * 
	 * @return true => Connection can exist; false => else
	 */
	public boolean canConnectionExist(Clabject source, Clabject target);
	
	/**
	 * Checks whether child can be added to parent
	 * 
	 * @param parent The element child is added to
	 * 
	 * @param child The element which is added to parent
	 * 
	 * @return true => child can be added; false => else
	 */
	public boolean canAddAsChild(Clabject parent, Clabject child);
	
	/**
	 * Returns all types from which instances can be created in e. e can
	 * be a clabject, model etc.
	 * 
	 * @param e Container to get possible types that can be instantiated for
	 * 
	 * @return A list with possible types for creating instances
	 */
	public List<Clabject> getAllPossibleTypeForParent(Element e);
	
	/**
	 * Checks whether instance is an instance of type
	 * 
	 * @param instance Clabject to check type for
	 * 
	 * @param type Clabject assumed as tyoe
	 * 
	 * @return true => instance is an instance of type; false => else
	 */
	public boolean isInstanceOf(Clabject instance, Clabject type);
	
	/**
	 * Checks whether type is a type of instance 
	 * 
	 * @param type Type to check type for
	 * 
	 * @param instance Clabject that is assumed to be an instance of type
	 * 
	 * @return true => type is type of instance; false => else
	 */
	public boolean isTypeOf(Clabject type, Clabject instance);
}