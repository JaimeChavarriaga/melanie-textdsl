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
	
	
	
	/**
	 * Creates an instance of the clabject c.
	 * 
	 * @param type The Clabject to create an instance from
	 * 
	 * @return The clabject which is an instance
	 */
	public Clabject createInstanceFrom(Clabject type);
	
	
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
	 * Returns all types from which instances can be created in e. e can
	 * be a clabject, model etc.
	 * 
	 * @param e Container to get possible types that can be instantiated for
	 * 
	 * @return A list with possible types for creating instances
	 */
	public List<Clabject> getAllPossibleTypeForModel(Element e);
}