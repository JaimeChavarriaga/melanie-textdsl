package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.popupbartools;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.Activator;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IPopupToolBarProvider;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;

public class TextualModelEditorPopupToolBarProvider implements IPopupToolBarProvider {

	public TextualModelEditorPopupToolBarProvider() {
		super();
	}

	@Override
	public List<PopupToolBarToolWrapper> getPopUpToolbarButtonsForDiagramElement(
			Object host) {
		List<PopupToolBarToolWrapper> result = new LinkedList<>();
		
		Image image = null;
		
		ImageDescriptor imageDescriptor = null;
		
		if (((IGraphicalEditPart)host).resolveSemanticElement() instanceof Model){
			imageDescriptor = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/text16.gif");
			image = imageDescriptor.createImage();
			result.add(new PopupToolBarToolWrapper(image, new OpenTextualModelEditorPopupBarTool((IGraphicalEditPart)host, null), "Open in Textual Model Editor", "textualDSL"));
		}
			
		
		return result;
	}

}