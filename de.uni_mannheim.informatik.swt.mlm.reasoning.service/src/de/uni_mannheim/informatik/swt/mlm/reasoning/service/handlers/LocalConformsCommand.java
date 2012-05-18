/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel - initial API and implementation and initial documentation
 *    Ralph Gerbig - non reasoning related programming
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.reasoning.service.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Role;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;

public class LocalConformsCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.localconformscommand";
	
	IReasoningService reasoner = new ReasoningService().Instance();
	public boolean forceClabject = false;
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Local Conformance " + ReasoningServiceUtil.getDateString());
		Clabject type = (Clabject)event.getObjectParameterForExecution("type");
		Clabject instance = (Clabject)event.getObjectParameterForExecution("instance");
		forceClabject = ((String)event.getParameters().get("forceClabject")).equals("false?") ? false:true;
		
		Check check = compute(type, instance);
		resultModel.getChildren().add(check);

		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected Check compute(Clabject type, Clabject instance) {
		return localConforms(type, instance);
	}

	private Check localConforms(Clabject type, Clabject instance) {
		Check child = null;
		if (forceClabject) {
			child =  localConformsClabject(type, instance);
		} else if (type instanceof Connection && instance instanceof Connection) {
			child =  localConformsConnection((Connection) type, (Connection) instance);
		} else if (type instanceof Entity && instance instanceof Entity) {
			child =  localConformsClabject(type, instance);
		} else if ((type instanceof Entity && instance instanceof Connection) || 
				(instance instanceof Entity && type instanceof Connection)){
			child = ReasoningResultFactory.eINSTANCE.createCheck();
			child.setTarget(type);
			child.setSource(instance);
			child.setName("Linguistic type");
		} else {
			//System.out.println("mismatching types. NPE??");
		}
		return child;
	}
	
	private Check localConformsConnection(Connection type, Connection instance) {
		//FIXME
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();//("LocalConformance[Connection]", instance, type, instance.getName() + ".localConforms("+type.getName()+")");
		Check clabCheck = localConformsClabject(type, instance);
		result.getChildren().add(clabCheck);
		if (!clabCheck.isResult()) {
			return result;
		} 
		//FIXME
		Check roleCheck = ReasoningResultFactory.eINSTANCE.createCheck();//reasoner.createCheck("LocalConformance[RoleName]", instance, type,
//				"$ forall rN_t in "+ type.getName() +".roleName: (exists rN_i in "+ instance.getName() +
//				".roleName: rN_i = rN_t land "+ instance.getName() +".isNav(rN_t) = "+ type.getName() +".isNav(rN_t)))$");
		result.getChildren().add(roleCheck);
		for (Role r: type.getRole()) {
			Check roleNameCheck = ReasoningResultFactory.eINSTANCE.createCheck(instance, type, roleCheck);
			roleNameCheck.setName(r.roleName());
			//FIXME
			//roleNameCheck.setRoleName(r.roleName());
			boolean found = false;
			for (Role rI: instance.getRole()) {
				if (rI.conforms(r)) {
					found = true;
				}
			}
			if (!found) {
				return result;
			}
			roleNameCheck.setResult(true);
		}
		roleCheck.setResult(true);
		result.setResult(true);
		return result;
	}
	
	private Check localConformsClabject(Clabject type, Clabject instance) {
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setSource(instance);
		result.setTarget(type);
		result.setName("LocalConformance[Clabject]");
		result.setExpression(instance.getName() + ".localConformsClabject("+type.getName() + ")");
		result.setExpression(instance.getName() + ".localConformsClabject(" + type.getName() + ")");
		Check levelC = ReasoningResultFactory.eINSTANCE.createCheck();
		result.getChildren().add(levelC);
		levelC.setName("Level");
//		FIXME
//		levelC.setTargetLevel(type.getLevel());
//		levelC.setInstanceLevel(instance.getLevel());
		levelC.setExpression(instance.getName() + ".level - 1 = " + type.getName() + ".level");
		if (type.getLevel() + 1 != instance.getLevel()) {
			return result;
		}
		levelC.setResult(true);
		Check featureC = ReasoningResultFactory.eINSTANCE.createCheck();
		featureC.setSource(instance);
		featureC.setTarget(type);
		featureC.setName("Features");
		featureC.setExpression("forall pi_t in " + type.getName() + ".getAllFeatures(): pi.durability > 0: exists pi_i in " + instance.getName()+".getAllFeatures() : pi_i.conforms(pi_t)");
		result.getChildren().add(featureC);
		for (Feature current: type.getAllFeatures()) {
			if (current.getDurability() > 0) {
				//FIXME
				//featureC.setNoFeatures(featureC.getNoFeatures() + 1);
				boolean found = false;
				Check featSearchC = ReasoningResultFactory.eINSTANCE.createCheck();
				featSearchC.setSource(instance);
				featSearchC.setTarget(type);
				//FIXME
				//featSearchC.setTypeFeature(current);
				featSearchC.setName(current.represent());
				featSearchC.setExpression("exists pi_i in " + instance.getName()+".getAllFeatures() : pi_i.conforms("+type.getName() + "." + current.getName()+")");
				featureC.getChildren().add(featSearchC);
				for (Feature possible : instance.getAllFeatures()) {
					//FIXME
					//featSearchC.setNoFeatures(featSearchC.getNoFeatures() + 1);
					Check featCheck = (new FeatureConformsCommand()).compute(current, possible);
					featSearchC.getChildren().add(featCheck);
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