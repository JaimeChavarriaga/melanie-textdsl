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

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.PlatformUI;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.model.PLMTransactionService;
import de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.ReasoningServiceUtil;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Generalization;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Role;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditor;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.Information;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;

public class GeneralizationRealizationCommand extends AbstractHandler {
	
	public static final String ID_GENER_REALIZATION = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.generalizationrealizationcommand";
	IReasoningService reasoner = (new ReasoningService()).Instance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		resultModel.setName("Subsumtion " + ReasoningServiceUtil.getDateString());
		Check check = null;
		Generalization gener = (Generalization) event.getObjectParameterForExecution("generalization");  
		check = compute(gener);
		resultModel.getChildren().add(check);		
		
		Boolean silent = event.getParameters().get("silent") == null?
				false: Boolean.parseBoolean(event.getParameters().get("silent").toString());
		if (!silent)
			reasoner.getReasoningHistory().add(resultModel);
		return check.isResult();
	}

	Check compute(Generalization gener) {
		Check result = ReasoningResultFactory.eINSTANCE.createCheck();
		result.setName("Generalization Realization");
		result.setResult(true);
		PLMTransactionService pts = new PLMTransactionService(gener.getModel(), "Generalization Realization Transaction");
		// Detect the duplicate Features
		Information featureChecks = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Feature Equality Checks", result);
		for (Clabject supertype : gener.getSupertype()) {
			Information supertypeInfo = ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Supertype " + supertype.getName(), featureChecks);
			for (Feature superF : supertype.getAllFeatures()) {
				Information superFInfo = ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Feature " + superF.getName(), supertypeInfo);
				for (Clabject subtype : gener.getSubtype()) {
					Information subtypeInfo = ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Subtype " + subtype.getName(), superFInfo);
					// The subtype feature has to be modeled
					Feature subF = null;
					for (Feature f:subtype.getFeature()) {
						if (f.getName().equals(superF.getName())) {
							subF = f;
						}
					}
					if (subF != null) {
						ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Subtype Feature found", subtypeInfo);
						Check currentCheck = new EqualityCommand().compute(superF, subF);
						subtypeInfo.getChildren().add(currentCheck);
						if (currentCheck.isResult()) {
							// delete subF
							pts.deleteModelElement(subF);
						}
					}
					
				}
			}
		}
		// Detect redundant Roles in Connections
		// Hack check to see which kind of clabjects the generalization connects
		if (gener.getSupertype().get(0) instanceof Connection) {
			Information roleChecks = ReasoningResultFactory.eINSTANCE.createInformation(gener, "Role Equality Checks", result);
			for (Clabject supert : gener.getSupertype()) {
				Connection supertype = (Connection) supert;
				Information supertypeInfo = ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Supertype " + supertype.getName(), roleChecks);
				for (Role superR: supertype.getAllRoles()) {
					Information superRInfo = ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Role " + superR.getName(), supertypeInfo);
					for (Clabject subt : gener.getSubtype()) {
						Connection subtype = (Connection) subt;
						Information subtypeInfo = ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Subtype " + subtype.getName(), superRInfo);
						// The subtype role has to be modeled
						Role subR = null;
						for (Role r:subtype.getRole()) {
							if (r.conforms(superR)) {
								subR = r;
							}
						}
						if (subR != null) {
							ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Conforming Role Found", subtypeInfo);
							Clabject superDestination = superR.getDestination();
							Clabject subDestination = subR.getDestination();
							if (subDestination.getModelSupertypes().contains(superDestination)) {
								// Delete subR
								pts.deleteModelElement(subR);
							} else {
								// Almost hit: The roles match, but the destinations are not _modeled_ matches
								// If the Subsumption is performed correctly, modeled should be equivalent to computed at this time
								ReasoningResultFactory.eINSTANCE.createInformation(supertype, "Destinations not in generalization", subtypeInfo);
							}
						}
					}
				}
			}
		}
		pts.execute();
		return result;
	}
	
	

}
