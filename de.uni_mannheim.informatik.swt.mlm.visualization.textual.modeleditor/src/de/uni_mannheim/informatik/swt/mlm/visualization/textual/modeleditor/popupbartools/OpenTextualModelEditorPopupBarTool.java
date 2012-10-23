package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.popupbartools;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;

public class OpenTextualModelEditorPopupBarTool extends AbstractPopupBarTool{

	
	
	public OpenTextualModelEditorPopupBarTool(EditPart epHost, CreateRequest theRequest) {
		super(epHost, theRequest);
	}

	@Override
	protected Request createTargetRequest() {
		ChangePropertyValueRequest req = new ChangePropertyValueRequest("open", "open");
		return req;
	}

	@Override
	protected Command getCommand() {
		return new OpenTextualModelEditorOnModelElementCommand((IGraphicalEditPart)getHost());
	}
	
}