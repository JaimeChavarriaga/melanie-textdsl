/*******************************************************************************
 * Copyright (c) 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.workbench.interfaces;

import java.util.List;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Participation;

public interface IDSLService {
	
	/**
	 * Searches for all instantiable Connections between sourceInstance and targetInstance
	 * 
	 * @param sourceInstance The source of the connection
	 * @param targetInstance The target of the connection
	 * 
	 * @return A list of all instantiable participations
	 */
	public List<Connection> getInstantiableConnectionsBetween(Entity sourceInstance, Entity targetInstance);
	/**
	 * Searches for all instantiable Connections between sourceInstance and targetInstance
	 * 
	 * @param sourceInstance The source of the connection
	 * @param targetInstance The target of the connection
	 * 
	 * @return A list of all instantiable connections
	 */
	public List<Connection> getInstantiableConnectionsBetween(Connection sourceInstance, Connection targetInstance);
	/**
	 * Searches for all instantiable Connections between sourceInstance and targetInstance
	 * 
	 * @param sourceInstance The source of the connection
	 * @param targetInstance The target of the connection
	 * 
	 * @return A list of all instantiable connections
	 */
	public List<Connection> getInstantiableConnectionsBetween(Connection sourceInstance, Entity targetInstance);
	/**
	 * Searches for all instantiable Connections between sourceInstance and targetInstance
	 * 
	 * @param sourceInstance The source of the connection
	 * @param targetInstance The target of the connection
	 * 
	 * @return A list of all instantiable connections
	 */
	public List<Connection> getInstantiableConnectionsBetween(Entity sourceInstance, Connection targetInstance);
	
	/**
	 * Searches for all instantiable participations between sourceInstance and targetInstance
	 * 
	 * @param sourceInstance The source of the participation
	 * @param targetInstance The target of the participation
	 * 
	 * @return A list of all instantiable participations
	 */
	public List<Participation> getInstantiableParticipationsBetween(Connection sourceInstance, Connection tragetInstance);
	
	/**
	 * Searches for all instantiable participations between sourceInstance and targetInstance
	 * 
	 * @param sourceInstance The source of the participation
	 * @param targetInstance The target of the participation
	 * 
	 * @return A list of all instantiable participations
	 */
	public List<Participation> getInstantiableParticipationsBetween(Connection sourceInstance, Entity targetInstance);

}