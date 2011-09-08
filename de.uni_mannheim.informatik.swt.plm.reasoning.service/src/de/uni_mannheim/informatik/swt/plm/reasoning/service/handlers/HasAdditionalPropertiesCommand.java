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
	
	IReasoningService reasoner = new ReasoningService().Instance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Clabject type = (Clabject)event.getParameters().get("type");
		Clabject instance = (Clabject)event.getParameters().get("instance");
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
		return check;
	}

}
