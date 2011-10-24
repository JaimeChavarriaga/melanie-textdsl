package de.uni_mannheim.informatik.swt.gmf.plm.popupbartools;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;

import de.uni_mannheim.informatik.swt.gmf.plm.commands.ToggleCommand;

public class TogglePopupBarTool extends AbstractPopupBarTool{

	
	
	public TogglePopupBarTool(EditPart epHost, CreateRequest theRequest) {
		super(epHost, theRequest);
	}

	@Override
	protected Request createTargetRequest() {
		ChangePropertyValueRequest req = new ChangePropertyValueRequest("toggle", "toggle");
		return req;
	}

	@Override
	protected Command getCommand() {
		return new ToggleCommand((IGraphicalEditPart)getHost());
	}
	
}