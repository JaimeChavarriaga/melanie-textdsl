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
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Method;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;

/**
 * Use getInstance to get an instance of the reasoning service.
 * 
 * Interface that must be implemented for all reasoning engines.
 *
 */
public interface IReasoningService {
	
	/**
	 * 
	 * @return a List with all executed reasonings
	 */
	public List<ReasoningResultModel> getReasoningHistory();
	
	/**
	 * 
	 * @return the last executed reasoning
	 */
	public ReasoningResultModel getLastResult();
	
	/**
	 * Returns a global instance of the reasoning service.
	 * 
	 * @return
	 */
	public IReasoningService getInstance();
	
	/**
	 * 
	 * @param commandID Id defined by {@link IReasoningService}
	 * @param parameters Parameters defined by the ids
	 * 
	 * @return true -> operation sucessful; false -> operation failed
	 */
	public boolean run(String commandID, List<?> parameters);
	
	
	/**
	 * param[0] = Clabject - type <br />
	 * param[1] = Clabject - instance
	 */
	public static final String DRESS_INSTANCE_FROM_TYPE = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.dressinstancefromtype";
	public void dressInstanceFromType(Clabject type, Clabject instance) throws Exception;
	
	/**
	 * param[0] = Attribute - type <br />
	 */
	public static final String CREATE_ATTRIBUTE = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.createattribute";
	public Attribute createAttribute(Attribute type);
	
	/**
	 * param[0] = Method - type <br />
	 */
	public static final String CREATE_METHOD= "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.createmethod";
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
	public static final String CAN_CONNECTION_EXIST = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.canconnectionexist";
	public boolean canConnectionExist(Connection source, Clabject target);
	
	/**
	 * Returns all types from which instances can be created in e. e can
	 * be a clabject, model etc.
	 * 
	 * @param e Container to get possible types that can be instantiated for
	 * 
	 * @return A list with possible types for creating instances
	 */
	public static final String GET_ALL_POSSIBLE_TYPES_FOR_MODEL= "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.getallpossibletypesformodel";
	Set<Clabject> getAllPossibleTypeForModel(Model m);

	/**
	 * param[0] = Attribute - type <br />
	 * param[1] = Attribute - instance
	 */
	public static final String ATTRIBUTE_CONFORMS = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.attributeconforms";
	public boolean attributeConforms(Attribute type, Attribute instance);
	
	/**
	 * param[0] = Method - type <br />
	 * param[1] = Method - instance
	 */
	public static final String METHOD_CONFORMS = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.methodconforms";
	public boolean methodConforms(Method type, Method instance);
	
	/**
	 * param[0] = Feature - type <br />
	 * param[1] = Feature - instance
	 */
	public static final String FEATURE_CONFORMS = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.featureconforms";
	public boolean featureConforms( Feature type, Feature instance);
	
	/**
	 * param[0] = Clabject - type <br />
	 * param[1] = Clabject - instance
	 */
	public static final String LOCAL_CONFORMS_CLABJECT = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.localconformsclabject";
	public boolean localConformsClabject( Clabject type, Clabject instance);
	
	/**
	 * param[0] = Connection - type <br />
	 * param[1] = Connection - instance
	 */
	public static final String LOCAL_CONSTRUCTION_CONFORMS_CONNECTION = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.localconstructionconformsconnection";
	public boolean localConstructionConformsConnection( Connection type, Connection instance );
	
	/**
	 * param[0] = Connection - type <br />
	 * param[1] = Connection - instance
	 */
	public static final String LOCAL_CONFORMS_CONNECTION = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.localconformsconnection";
	public boolean localConformsConnection( Connection type, Connection instance);
	
	/**
	 * param[0] = Clabject - type <br />
	 * param[1] = Clabject - instance
	 */
	public static final String LOCAL_CONFORMS = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.localconforms";
	public boolean localConforms(Clabject type, Clabject instance);
	
	/**
	 * param[0] = Clabject - type <br />
	 * param[1] = Clabject - instance
	 */
	public static final String NEIGHBOURHOOD_CONFORMS = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.neighbourhoodconforms";
	public boolean neighbourhoodConforms(Clabject type, Clabject instance);
	
	/**
	 * param[0] = Connection - type <br />
	 * param[1] = Connection - instance
	 */
	public static final String NEIGHBOURHOOD_CONFORMS_CONNECTION = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.neighbourhoodconformsconnection";
	public boolean neighbourhoodConformsConnection(Connection type, Connection instance);
	
	/**
	 * param[0] = Connection - type <br />
	 * param[1] = Connection - instance
	 */
	public static final String NEIGHBOURHOOD_CONSTRUCTION_CONFORMS_CONNECTION = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.neighbourhoodconstructionconformsconnection";
	public boolean neighbourhoodConstructionConformsConnection( Connection type, Connection instance );
	
	/**
	 * param[0] = String - id <br />
	 * param[1] = Element - modelElement
	 */
	public static final String GET_ELEMENT_BY_XMI_ID = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.getelementbyxmiid";
	public Element getElementByXMIID(String id, Element modelElement);
	
	/**
	 * param[0] = connection <br />
	 */
	public static final String MULTIPLICITY_CONFORMS = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.multiplicityconforms";
	public boolean multiplicityConforms(Connection con);
	
	/**
	 * param[0] = connection <br />
	 * param[1] = clabject
	 */
	public static final String GET_POSSIBLE_ROLE_NAMES_FOR_CONNECTION_PARTICIPANT = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.getpossiblerolenamesforconnectionparticipant";
	public Set<String> getPossibleRoleNamesForConnectionParticipant(Connection con, Clabject part);
	
	/**
	 * param[0] = connection <br />
	 * param[1] = clabject
	 */
	public static final String GET_POSSIBLE_NAVIGABILITY_FOR_CONNECTION_PARTICIPANT = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.getpossiblenavigabilityforconnectionparticipant";
	public Set<Boolean> getPossibleNavigabilityForConnectionParticipant(Connection con, Clabject part);
	
	/**
	 * param[0] = connection
	 */
	public static final String GET_CLASSIFYING_CONSTRUCTION_CONFORMANCE_DOMAIN = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.getclassifyingconstructionconformancedomain";
	public Set<Connection> getClassifyingConstructionConformanceDomain(Connection c);
}