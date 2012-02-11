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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Role;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;

public class MultiplicityConformsCommand extends AbstractHandler {

	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.multiplicityconformscommand";
	
	IReasoningService reasoner = (new ReasoningService()).Instance();
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Connection connection = (Connection)event.getObjectParameterForExecution("connection");
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Multiplicity " + ReasoningServiceUtil.getDateString());
		Check check = compute(connection);
		resultModel.getChildren().add(check);

		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		
		return check.isResult();
	}
	
	protected Check compute(Connection type) {
		return multiplicityConforms(type);
	}
	
	private Check multiplicityConforms(Connection con) {
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		Model classifiedModel = con.getModel().getOntology().getContent().get(con.getModel().getLevel() + 1);
		Set<Connection> domain = new HashSet<Connection>();
		//FIXME
		Check domainSearch = ReasoningResultFactory.eINSTANCE.createCheck();//("DomainSearch", con, classifiedModel, "delta_i in Sigma_{delta.level + 1}.connection: delta_.neighbourhoodConforms(delta)");
		result.getChildren().add(domainSearch);
		for (Connection possible:classifiedModel.getAllConnections()) {
			Check possibleCon = (new NeighbourhoodConformsCommand()).compute(con, possible);
			domainSearch.getChildren().add(possibleCon);
			if (possibleCon.isResult()) {
				domain.add(possible);
			}
		}
		domainSearch.setResult(true);
		//FIXME
		//result.setNoOfDomainConnection(domain.size());
		for (Role r:con.getAllRoles()) {
			Check roleCheck = ReasoningResultFactory.eINSTANCE.createCheck();
			//FIXME
			//roleCheck.setRoleName(r.roleName());
			result.getChildren().add(roleCheck);
			Map<Clabject,Integer> count = new HashMap<Clabject, Integer>();
			int lower = r.getLower();
			int upper = r.getUpper();
			//FIXME
//			roleCheck.setLower(lower);
//			roleCheck.setUpper(upper);
			for (Connection domCon: domain) {
				for (Role role: domCon.getRole()) {
					if (!role.getDestination().equals(r.getDestination())) {
						Clabject part = role.getDestination();
						if (!count.containsKey(part)) {
							count.put(part, 0);
						}
						count.put(part, count.get(part) + 1);
					}
				}
			}
			for (Entry<Clabject,Integer> entry:count.entrySet()) {
				Integer value = entry.getValue();
				//FIXME
				//roleCheck.getCounts().add(value);
				if (value < lower || (upper != -1 && value > upper)) {
					return result;
				}
			}
			roleCheck.setResult(true);
		}
		result.setResult(true);
		return result;
	}

	
}