package de.uni_mannheim.informatik.swt.mlm.reasoning.service.view.popupbartools;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;

import de.uni_mannheim.informatik.swt.mlm.reasoning.service.view.popupbartools.commands.SetReasoningSourceCommand;

public class SetReasoningSourcePopupBarTool extends AbstractPopupBarTool{

	
	
	public SetReasoningSourcePopupBarTool(EditPart epHost, CreateRequest theRequest) {
		super(epHost, theRequest);
	}

	@Override
	protected Request createTargetRequest() {
		ChangePropertyValueRequest req = new ChangePropertyValueRequest("Set as Reasoning Source", "Set as Reasoning Source");
		return req;
	}

	@Override
	protected Command getCommand() {
		return new SetReasoningSourceCommand((IGraphicalEditPart)getHost());
	}
	
}