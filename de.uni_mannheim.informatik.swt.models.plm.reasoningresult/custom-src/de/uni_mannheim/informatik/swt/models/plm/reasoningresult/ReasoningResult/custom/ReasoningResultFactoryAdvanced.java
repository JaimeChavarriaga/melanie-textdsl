/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.custom;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LocalConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNameLocalConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeFeatureCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ValueComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultFactoryImpl;

/**
 * Extends the ReasoningResultFactory by setting up values at creation
 *
 * @deprecated
 */
public class ReasoningResultFactoryAdvanced extends ReasoningResultFactoryImpl {

	/**
	 * 
	 * @param name
	 * @param expression
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public CompositeCheck createCompositeCheck(String name, String expression, Element source, Element target){
		CompositeCheck result = super.createCompositeCheck();
		result.setExpression(expression);
		result.setName(name);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param expression
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public NameComparison createNameComparison(String expression, Feature source, Feature target){
		NameComparison result = super.createNameComparison();
		result.setExpression(expression);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param expression
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public DurabilityComparison createDurabilityComparison(String expression, Feature source, Feature target){
		DurabilityComparison result = super.createDurabilityComparison();
		result.setExpression(expression);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param expression
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public MutabilityComparison createMutabilityComparison(String expression, Attribute source, Attribute target){
		MutabilityComparison result = super.createMutabilityComparison();
		result.setExpression(expression);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param expression
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public DatatypeComparison createDataTypeComparison(String expression, Attribute source, Attribute target){
		DatatypeComparison result = super.createDatatypeComparison();
		result.setExpression(expression);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	

	/**
	 * 
	 * @param name
	 * @param expression
	 * @param source
	 * @param noTypeConnection
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public AllConnectionsCheck createAllConnectionsCheck(String name, String expression, Element source, int noTypeConnection, Element target){
		AllConnectionsCheck result = super.createAllConnectionsCheck();
		result.setExpression(expression);
		result.setName(name);
		result.setNoTypeConnection(noTypeConnection);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param expression
	 * @param noSearchedConnections
	 * @param source
	 * @param target
	 * @param type
	 * @return
	 * 
	 * @deprecated
	 */
	public TypeConnectionSearch createTypeConnectionSearch(String name, String expression, int noSearchedConnections,
				Element source, Element target, Connection type){
		TypeConnectionSearch result = super.createTypeConnectionSearch();
		result.setExpression(expression);
		result.setName(name);
		result.setNoSearchedConnections(noSearchedConnections);
		result.setSource(source);
		result.setTarget(target);
		result.setTypeConnection(type);
		
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param expression
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public ExpressedInstanceExcludedCheck createExpressedInstanceExcludedCheck(String name, String expression, Element source, Element target){
		ExpressedInstanceExcludedCheck result = super.createExpressedInstanceExcludedCheck();
		result.setExpression(expression);
		result.setName(name);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param expression
	 * @param noOfDomainConnections
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public MultiplicityCheck createMultiplicityCheck(String name, String expression, int noOfDomainConnections, Element source, Element target){
		MultiplicityCheck result = super.createMultiplicityCheck();
		result.setExpression(expression);
		result.setName(name);
		result.setNoOfDomainConnection(noOfDomainConnections);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param expression
	 * @param lower
	 * @param upper
	 * @param roleName
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public MultiplicityRoleNameCheck createMultiplicityRoleNameCheck(String name, String expression, int lower, int upper, String roleName, Element source, Element target){
		MultiplicityRoleNameCheck result = super.createMultiplicityRoleNameCheck();
		result.setExpression(expression);
		result.setLower(lower);
		result.setUpper(upper);
		result.setName(name);
		result.setRoleName(roleName);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param expression
	 * @param roleName
	 * @param instanceParticipant
	 * @param typeParticipant
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public RoleNamePropertyConformanceCheck createRoleNamePropertyConformanceCheck(String name, String expression, String roleName,
				Clabject instanceParticipant, Clabject typeParticipant, Element source, Element target){
		RoleNamePropertyConformanceCheck result = super.createRoleNamePropertyConformanceCheck();
		result.setExpression(expression);
		result.setInstanceParticipant(instanceParticipant);
		result.setName(name);
		result.setRoleName(roleName);
		result.setSource(source);
		result.setTarget(target);
		result.setTypeParticipant(typeParticipant);
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param expression
	 * @param roleName
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public RoleNameLocalConformanceCheck createRoleNameLocalConformanceCheck(String name, String expression, String roleName, Element source, Element target){
		RoleNameLocalConformanceCheck result = super.createRoleNameLocalConformanceCheck();
		result.setExpression(expression);
		result.setName(name);
		result.setRoleName(roleName);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param expression
	 * @param noTypeConnections
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public ConnectionsLocalConformanceCheck createConnectionsLocalConformanceCheck(String name, String expression, int noTypeConnections, Element source, Element target){
		ConnectionsLocalConformanceCheck result = super.createConnectionsLocalConformanceCheck();
		result.setExpression(expression);
		result.setName(name);
		result.setNoTypeConnections(noTypeConnections);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param expression
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public LocalConformanceCheck createLocalConformanceCheck(String name, String expression, Element source, Element target){
		LocalConformanceCheck result = super.createLocalConformanceCheck();
		result.setExpression(expression);
		result.setName(name);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param expression
	 * @param noOfFeatures
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public TypeFeatureCheck createTypeFeatureCheck(String name, String expression, int noOfFeatures, Element source, Element target){
		TypeFeatureCheck result = super.createTypeFeatureCheck();
		result.setExpression(expression);
		result.setName(name);
		result.setNoFeatures(noOfFeatures);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param expression
	 * @param noFeatures
	 * @param source
	 * @param target
	 * @param typeFeature
	 * @return
	 * 
	 * @deprecated
	 */
	public FeatureSearchCheck createFeatureSearchCheck(String name, String expression, int noFeatures, Element source, Element target, Feature typeFeature){
		FeatureSearchCheck result = super.createFeatureSearchCheck();
		result.setExpression(expression);
		result.setName(name);
		result.setNoFeatures(noFeatures);
		result.setSource(source);
		result.setTarget(target);
		result.setTypeFeature(typeFeature);
		return result;
	}
	
	/**
	 * 
	 * @param name
	 * @param expression
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public FeatureConformanceCheck createFeatureConformanceCheck(String name, String expression, Element source, Element target){
		FeatureConformanceCheck result = super.createFeatureConformanceCheck();
		result.setExpression(expression);
		result.setName(name);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
	
	/**
	 * 
	 * @param expression
	 * @param instanceLevel
	 * @param targetLevel
	 * @return
	 * 
	 * @deprecated
	 */
	public LevelComparison createLevelComparison(String expression, int instanceLevel, int targetLevel){
		LevelComparison result = super.createLevelComparison();
		result.setExpression(expression);
		result.setInstanceLevel(instanceLevel);
		result.setTargetLevel(targetLevel);
		return result;
	}
	
	/**
	 * 
	 * @param expression
	 * @param source
	 * @param target
	 * @return
	 * 
	 * @deprecated
	 */
	public ValueComparison createValueComparison(String expression, Attribute source, Attribute target){
		ValueComparison result = super.createValueComparison();
		result.setExpression(expression);
		result.setSource(source);
		result.setTarget(target);
		return result;
	}
}
