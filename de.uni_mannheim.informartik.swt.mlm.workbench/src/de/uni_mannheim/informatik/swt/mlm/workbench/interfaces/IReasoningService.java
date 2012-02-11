/*******************************************************************************
 * Copyright (c) 2011, 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *    Bastian Kennel - minor changes of constants to fit reasoning engine needs
 *******************************************************************************/ 
package de.uni_mannheim.informatik.swt.mlm.workbench.interfaces;


import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.util.IPropertyChangeListener;

/**
 * Use getInstance to get an instance of the reasoning service.
 * 
 * Interface that must be implemented for all reasoning engines.
 *
 */
public interface IReasoningService {
	
	/**
	 * Adds a property change listener which listens to changes on reasoning
	 * history. Mainly used to register views which are updating themselves 
	 * automatically on changes.
	 * 
	 * @param listener Listener to register
	 */
	public void addPropertyChangeListener(IPropertyChangeListener listener);
	
	/**
	 * Removes an IPropertyChangeListener.
	 * 
	 * @param listener Listener to remove
	 */
	public void removePropertyChangeListener(IPropertyChangeListener listener);
	
	/**
	 * 
	 * @return a List with all executed reasonings
	 */
	public List<EObject> getReasoningHistory();
	
	/**
	 * 
	 * @param modelElement EObject to execute reasoning on
	 * 
	 * @return Returns all commands that can be executed on the EObject
	 */
	public List<ContributionItem> getAvailableReasoningCommands(EObject[] modelElements);
	
	/**
	 * 
	 * @return the last executed reasoning
	 */
	public EObject getLastResult();
	
	/**
	 * Returns a global instance of the reasoning service.
	 * 
	 * @return
	 */
	public IReasoningService Instance();

	/**
	 * Runs a command in verbose mode. Should call 
	 * run(String commandID, Object[] parameters, boolean silent)
	 * with silent = false in standard implementations.
	 * 
	 * @param commandID Id defined by {@link IReasoningService}
	 * @param parameters Parameters defined by the ids
	 * 
	 * @return true -> operation sucessful; false -> operation failed
	 */
	public boolean run(String commandID, Object[] parameters);
	
	/**
	 * 
	 * @param commandID Id defined by {@link IReasoningService}
	 * @param parameters Parameters defined by the ids
	 * @param run this one command in silent mode, all others will be verbose again
	 * 
	 * @return true -> operation sucessful; false -> operation failed
	 */
	public boolean run(String commandID, Object[] parameters, boolean silent);	
		
	/**
	 * param[0] = Feature - type <br />
	 * param[1] = Feature - instance
	 */
	public static final String FEATURE_CONFORMS = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.featureconforms";
	
	/**
	 * param[0] = Clabject - type <br />
	 * param[1] = Clabject - instance <br />
	 * param[2] = Boolean - forceClabject - optional - default false
	 */
	//TODO: What is forceClabject doing???
	public static final String LOCAL_CONFORMS = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.localconforms";
	
	/**
	 * param[0] = Clabject - type <br />
	 * param[1] = Clabject - instance
	 */
	public static final String NEIGHBOURHOOD_CONFORMS = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.neighbourhoodconforms";
	
	/**
	 * param[0] = Connection - connection <br />
	 */
	public static final String MULTIPLICITY_CONFORMS = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.multiplicityconforms";
	
		
	/**
	 * param[0] = Connection - connection
	 */
	public static final String GET_CLASSIFYING_CONSTRUCTION_CONFORMANCE_DOMAIN = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.getclassifyingconstructionconformancedomain";
	
	/**
	 * param[0] = Clabject - instance <br />
	 * param[1] = Clabject - type
	 */
	public static final String IS_EXPRESSED_INSTANCE_OF_EXCLUDED = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.isexpressedinstanceofexcluded";

	/**
	 * param[0] = Clabject - instance <br />
	 * param[1] = Clabject - type
	 */
	public static final String PROPERTY_CONFORMS = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.propertyconforms";
	
	/**
	 * param[0] = Clabject - instance <br />
	 * param[1] = Clabject - type
	 */
	public static final String HAS_ADDITIONAL_PROPERTIES = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.hasadditionalproperties";
	
	/**
	 * param[0] = Clabject - instance <br />
	 * param[1] = Clabject - type
	 */
	public static final String IS_ISONYM = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.isisonym";
	
	/**
	 * param[0] = Clabject - instance <br />
	 * param[1] = Clabject - type
	 */
	public static final String IS_HYPONYM = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.ishyponym";
	
	/**
	 * param[0] = Clabject - instance <br />
	 * param[1] = Clabject - type
	 */
	public static final String IS_INSTANCE = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.isinstance";
	
	/**
	 * param[0] = Model 
	 */
	public static final String IS_CONSISTENTLY_CLASSIFIED = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.isconsistentlyclassified";
	
	/**
	 * param[0] = Ontology - the element to be checked for consistency. 
	 */
	public static final String ONTOLOGY_CONSISTENCY = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.ontologyconsistency";
	
	/**
	 * param[0] = Generalization - the element to be checked for consistency. 
	 */
	public static final String GENERALIZATION_CONSISTENCY = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.generalizationconsistency";
	
	/**
	 * param[0] = Classification - the element to be checked for consistency. 
	 */
	public static final String CLASSIFICATION_CONSISTENCY = "de.uni_mannheim.informatik.swt.plm.workbench.reasoning.classificationconsistency";
}