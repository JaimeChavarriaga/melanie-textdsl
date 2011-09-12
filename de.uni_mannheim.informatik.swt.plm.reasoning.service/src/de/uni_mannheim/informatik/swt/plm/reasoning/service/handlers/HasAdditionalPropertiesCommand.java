package de.uni_mannheim.informatik.swt.plm.reasoning.service.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.HasAdditionalPropertiesCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.plm.reasoning.service.ReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class HasAdditionalPropertiesCommand extends AbstractHandler {
	
	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.commands.hasadditionalpropertiescommand";
	
	IReasoningService reasoner = new ReasoningService().Instance();
	boolean complexNavigationSearch = false;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getParameters().get("type");
		Clabject instance = (Clabject)event.getParameters().get("instance");
		//the command is executed standalone; so we check propertyConformance and not only for the name
		complexNavigationSearch = true;
		ReasoningResultModel resultModel = ReasoningResultFactory.eINSTANCE.createReasoningResultModel();
		CompositeCheck check = compute(type, instance);
		resultModel.getCheck().add(check);
		reasoner.getReasoningHistory().add(resultModel);
		return check.isResult();
	}
	
	protected CompositeCheck compute(Clabject type, Clabject instance) {
		return hasAdditionalFeatures(type, instance);
	}
	
	private CompositeCheck hasAdditionalFeatures(Clabject type, Clabject instance) {
		HasAdditionalPropertiesCheck check = ReasoningResultFactory.eINSTANCE.createHasAdditionalPropertiesCheck();
		check.setResult(false);
		check.setName("hasAdditionalProperties");
		check.setExpression("jo..");
		//First search the features
		CompositeCheck featuresCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, check);
		featuresCheck.setName("Features");
		featuresCheck.setExpression("exists pi_i in "+instance.getName()+".getAllFeatures(): nexists pi_t in "+ type.getName() +".getAllFeatures(): pi_i.conformsTo(pi_T)");
		for (Feature i: instance.getAllFeatures()) {
			CompositeCheck featCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, featuresCheck);
			featCheck.setName(i.getName());
			featCheck.setExpression("nexists pi_t in "+type.getName() + ".getAllFeatures(): "+i.getName() + ".conformsTo(pi_T)");
			boolean unique = true;
			for (Feature t: type.getAllFeatures()) {
				CompositeCheck actualFeatCheck = (new FeatureConformsCommand()).compute(t, i);
				featCheck.getCheck().add(actualFeatCheck);
				if (actualFeatCheck.isResult()) {
					unique = false;
					break;
				}
			}
			if (unique) {
				featCheck.setResult(true);
				featuresCheck.setResult(true);
				check.setResult(true);
				return check;
			}
		}
		//Then search for the Connections
		CompositeCheck navigationsCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, check);
		navigationsCheck.setName("Navigations");
		navigationsCheck.setExpression("exists rN in "+instance.getName()+".getAllAssociateRoleNames(): exists ... einiges");
		for (String rN:instance.getAllAssociateRoleNames()) {
			CompositeCheck roleNameCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, navigationsCheck);
			roleNameCheck.setName(rN);
			for (Clabject associate_i: instance.getAllAssociatesForRoleName(rN)) {
				CompositeCheck associateCheck = ReasoningResultFactory.eINSTANCE.createCompositeCheck(instance, type, roleNameCheck);
				associateCheck.setName(associate_i.getName());
				boolean found = true;
				for (Clabject associate_t:type.getAllAssociatesForRoleName(rN)) {
					CompositeCheck actualAssociateCheck = null;
					if (complexNavigationSearch) {
						 actualAssociateCheck = (new PropertyConformsCommand()).compute(associate_t, associate_i);
					} else {
						actualAssociateCheck = (new NeighbourhoodConformsCommand()).compute(associate_t, associate_i);
						
					}
					associateCheck.getCheck().add(actualAssociateCheck);
					if (actualAssociateCheck.isResult()) {
						found = false;
						break;
					}
				}
				if (found) {
					associateCheck.setResult(true);
					roleNameCheck.setResult(true);
					navigationsCheck.setResult(true);
					check.setResult(true);
					return check;
				}
			}
		}
		return check;
	}

}
