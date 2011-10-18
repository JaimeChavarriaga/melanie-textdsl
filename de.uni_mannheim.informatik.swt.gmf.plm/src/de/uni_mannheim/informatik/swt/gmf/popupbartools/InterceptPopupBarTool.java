package de.uni_mannheim.informatik.swt.gmf.popupbartools;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;

import de.uni_mannheim.informatik.swt.gmf.commands.InterceptCommand;
import de.uni_mannheim.informatik.swt.gmf.commands.ToggleCommand;

public class InterceptPopupBarTool extends AbstractPopupBarTool{

	
	
	public InterceptPopupBarTool(EditPart epHost, CreateRequest theRequest) {
		super(epHost, theRequest);
	}

	@Override
	protected Request createTargetRequest() {
		ChangePropertyValueRequest req = new ChangePropertyValueRequest("Intercept", "Intercept");
		return req;
	}

	@Override
	protected Command getCommand() {
		return new InterceptCommand((IGraphicalEditPart)getHost());
	}
	
}