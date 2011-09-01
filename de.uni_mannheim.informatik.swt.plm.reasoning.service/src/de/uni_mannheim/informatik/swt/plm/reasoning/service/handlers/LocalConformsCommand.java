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
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getParameters().get("type");
		Clabject instance = (Clabject)event.getParameters().get("instance");
		return localConforms(type, instance);
	}
	
	public boolean localConforms(Clabject type, Clabject instance) {
		LocalConformanceCheck check = ReasoningResultFactory.eINSTANCE.createLocalConformanceCheck();
		reasoner.registerCheck(check);
		boolean result = false;
		if (type instanceof Connection && instance instanceof Connection) {
			result =  localConformsConnection((Connection) type, (Connection) instance);
		} else if (type instanceof Entity && instance instanceof Entity) {
			result =  localConformsClabject(type, instance);
		} else {
			System.out.println("mismatching types");
		}
		check.setResult(result);
		reasoner.deRegisterCheck(check);
		return result;
	}
	
	public boolean localConformsConnection(Connection type, Connection instance) {
		CompositeCheck check = reasoner.createRegisterCompositeCheck("LocalConformance[Connection]", instance, type, instance.getName() + ".localConforms("+type.getName()+")");
		if (!localConformsClabject(type, instance)) {
			reasoner.deRegisterCheck(check);
			return false;
		} 
		CompositeCheck roleCheck = reasoner.createRegisterCompositeCheck("LocalConformance[RoleName]", instance, type, "$ forall rN_t in delta_t.roleName: (exists rN_i in delta_i.roleName: rN_i = rN_t land delta_i.isNav(rN_t) = delta_t.isNav(rN_t)))$");
		for (String rN : type.getRoleName()) {
			RoleNameLocalConformanceCheck roleNameCheck = ReasoningResultFactory.eINSTANCE.createRoleNameLocalConformanceCheck();
			reasoner.registerCheck(roleNameCheck);
			roleNameCheck.setRoleName(rN);
			boolean found = instance.getRoleName().contains(rN);
			if (!found) {
				reasoner.deRegisterCheck(roleNameCheck);
				reasoner.deRegisterCheck(roleCheck);
				reasoner.deRegisterCheck(check);
				return false;
			} 
			if (! (instance.isNavigableForRoleName(rN) == (type.isNavigableForRoleName(rN)))) {
				reasoner.deRegisterCheck(roleNameCheck);
				reasoner.deRegisterCheck(roleCheck);
				reasoner.deRegisterCheck(check);
				return false;
			}
			roleNameCheck.setResult(true);
			reasoner.deRegisterCheck(roleNameCheck);
		}
		roleCheck.setResult(true);
		reasoner.deRegisterCheck(roleCheck);
		check.setResult(true);
		reasoner.deRegisterCheck(check);
		return true;
	}
	
	public boolean localConformsClabject(Clabject type, Clabject instance) {
		LocalConformanceCheck check = ReasoningResultFactory.eINSTANCE.createLocalConformanceCheck();
		reasoner.registerCheck(check);
		check.setExpression(instance.getName() + ".localConformsClabject(" + type.getName() + ")");
		LevelComparison levelC = ReasoningResultFactory.eINSTANCE.createLevelComparison();
		levelC.setTargetLevel(type.getLevel());
		levelC.setInstanceLevel(instance.getLevel());
		levelC.setExpression(instance.getName() + ".level - 1 = " + type.getName() + ".level");
		reasoner.registerCheck(levelC);
		if (type.getLevel() + 1 != instance.getLevel()) {
			reasoner.deRegisterCheck(levelC);
			reasoner.deRegisterCheck(check);
			return false;
		}
		reasoner.deRegisterCheck(levelC);
		levelC.setResult(true);
		TypeFeatureCheck featureC = ReasoningResultFactory.eINSTANCE.createTypeFeatureCheck();
		reasoner.registerCheck(featureC);
		featureC.setExpression("forall pi_t in " + type.getName() + ".getAllFeatures(): pi.durability > 0: exists pi_i in " + instance.getName()+".getAllFeatures() : pi_i.conforms(pi_t)");
		for (Feature current: type.getAllFeatures()) {
			if (current.getDurability() > 0) {
				featureC.setNoFeatures(featureC.getNoFeatures() + 1);
				boolean found = false;
				FeatureSearchCheck featSearchC = ReasoningResultFactory.eINSTANCE.createFeatureSearchCheck();
				reasoner.registerCheck(featSearchC);
				featSearchC.setExpression("exists pi_i in " + instance.getName()+".getAllFeatures() : pi_i.conforms("+type.getName() + "." + current.getName()+")");
				for (Feature possible : instance.getAllFeatures()) {
					featSearchC.setNoFeatures(featSearchC.getNoFeatures() + 1);
					if (reasoner.run(IReasoningService.FEATURE_CONFORMS, new Object[]{current, possible})) {
						found = true;
						break;
					}
				}
				reasoner.deRegisterCheck(featSearchC);
				if (!found) {
					reasoner.deRegisterCheck(featureC);
					reasoner.deRegisterCheck(check);
					return false;
				}
			}
		}
		featureC.setResult(true);
		reasoner.deRegisterCheck(featureC);
		check.setResult(true);
		reasoner.deRegisterCheck(check);
		return true;
	}
}