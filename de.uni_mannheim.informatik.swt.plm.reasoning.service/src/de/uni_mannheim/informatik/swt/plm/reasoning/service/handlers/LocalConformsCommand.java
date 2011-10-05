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
package de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LocalConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNameLocalConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeFeatureCheck;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class LocalConformsCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.localconformscommand";
	
	IReasoningService reasoner = new ReasoningService().Instance();
	public boolean forceClabject = false;
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getParameters().get("type");
		Clabject instance = (Clabject)event.getParameters().get("instance");
		forceClabject = (Boolean)event.getParameters().get("forceClabject");
		return localConforms(type, instance).isResult();
	}
	
	protected CompositeCheck compute(Clabject type, Clabject instance) {
		return localConforms(type, instance);
	}
	
	private CompositeCheck localConforms(Clabject type, Clabject instance) {
		LocalConformanceCheck check = ReasoningResultFactory.eINSTANCE.createLocalConformanceCheck();
		check.setSource(instance);
		check.setTarget(type);
		check.setName("LocalConformance[Delegation]");
		check.setExpression(instance.getName() + ".localConforms("+type.getName() + ")");
		CompositeCheck child = null;
		if (forceClabject) {
			check.setExpression("forced Clabject local conformance");
			child =  localConformsClabject(type, instance);
		} else if (type instanceof Connection && instance instanceof Connection) {
			child =  localConformsConnection((Connection) type, (Connection) instance);
		} else if (type instanceof Entity && instance instanceof Entity) {
			child =  localConformsClabject(type, instance);
		} else if ((type instanceof Entity && instance instanceof Connection) || 
				(instance instanceof Entity && type instanceof Connection)){
			child = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, check);
			check.setResult(false);
			child.setName("Linguistic type");
			return check;
		} else {
			System.out.println("mismatching types. NPE??");
		}
		check.getCheck().add(child);
		check.setResult(child.isResult());
		return check;
	}
	
	private CompositeCheck localConformsConnection(Connection type, Connection instance) {
		CompositeCheck result = reasoner.createCompositeCheck("LocalConformance[Connection]", instance, type, instance.getName() + ".localConforms("+type.getName()+")");
		CompositeCheck clabCheck = localConformsClabject(type, instance);
		result.getCheck().add(clabCheck);
		if (!clabCheck.isResult()) {
			return result;
		} 
		CompositeCheck roleCheck = reasoner.createCompositeCheck("LocalConformance[RoleName]", instance, type, "$ forall rN_t in delta_t.roleName: (exists rN_i in delta_i.roleName: rN_i = rN_t land delta_i.isNav(rN_t) = delta_t.isNav(rN_t)))$");
		result.getCheck().add(roleCheck);
		for (String rN : type.getRoleName()) {
			RoleNameLocalConformanceCheck roleNameCheck = ReasoningResultFactory.eINSTANCE.createRoleNameLocalConformanceCheck(instance, type, roleCheck);
			roleNameCheck.setName(rN);
			roleNameCheck.setRoleName(rN);
			boolean found = instance.getRoleName().contains(rN);
			if (!found) {
				return result;
			} 
			if (! (instance.isNavigableForRoleName(rN) == (type.isNavigableForRoleName(rN)))) {
				return result;
			}
			roleNameCheck.setResult(true);
		}
		roleCheck.setResult(true);
		result.setResult(true);
		return result;
	}
	
	private CompositeCheck localConformsClabject(Clabject type, Clabject instance) {
		LocalConformanceCheck result = ReasoningResultFactory.eINSTANCE.createLocalConformanceCheck();
		result.setSource(instance);
		result.setTarget(type);
		result.setName("LocalConformance[Clabject]");
		result.setExpression(instance.getName() + ".localConformsClabject("+type.getName() + ")");
		result.setExpression(instance.getName() + ".localConformsClabject(" + type.getName() + ")");
		LevelComparison levelC = ReasoningResultFactory.eINSTANCE.createLevelComparison();
		result.getCheck().add(levelC);
		levelC.setTargetLevel(type.getLevel());
		levelC.setInstanceLevel(instance.getLevel());
		levelC.setExpression(instance.getName() + ".level - 1 = " + type.getName() + ".level");
		if (type.getLevel() + 1 != instance.getLevel()) {
			return result;
		}
		levelC.setResult(true);
		TypeFeatureCheck featureC = ReasoningResultFactory.eINSTANCE.createTypeFeatureCheck();
		featureC.setSource(instance);
		featureC.setTarget(type);
		featureC.setName("AllTypeFeatures");
		featureC.setExpression("forall pi_t in " + type.getName() + ".getAllFeatures(): pi.durability > 0: exists pi_i in " + instance.getName()+".getAllFeatures() : pi_i.conforms(pi_t)");
		result.getCheck().add(featureC);
		for (Feature current: type.getAllFeatures()) {
			if (current.getDurability() > 0) {
				featureC.setNoFeatures(featureC.getNoFeatures() + 1);
				boolean found = false;
				FeatureSearchCheck featSearchC = ReasoningResultFactory.eINSTANCE.createFeatureSearchCheck();
				featSearchC.setSource(instance);
				featSearchC.setTarget(type);
				featSearchC.setTypeFeature(current);
				featSearchC.setName("SearchTypeFeature " + current.getName());
				featSearchC.setExpression("exists pi_i in " + instance.getName()+".getAllFeatures() : pi_i.conforms("+type.getName() + "." + current.getName()+")");
				featureC.getCheck().add(featSearchC);
				for (Feature possible : instance.getAllFeatures()) {
					featSearchC.setNoFeatures(featSearchC.getNoFeatures() + 1);
					CompositeCheck featCheck = (new FeatureConformsCommand()).compute(current, possible);
					featSearchC.getCheck().add(featCheck);
					if (featCheck.isResult()) {
						found = true;
						break;
					}
				}
				if (!found) {
					return result;
				}
				featSearchC.setResult(true);
			}
		}
		featureC.setResult(true);
		result.setResult(true);
		return result;
	}

	
}