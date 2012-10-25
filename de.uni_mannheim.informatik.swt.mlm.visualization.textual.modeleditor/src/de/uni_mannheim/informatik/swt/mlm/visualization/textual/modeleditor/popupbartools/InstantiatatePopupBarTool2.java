package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.popupbartools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.SharedCursors;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.Tool;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.dnd.TransferDropTargetListener;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteListener;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.tools.AbstractTool;
import org.eclipse.gef.tools.TargetingTool;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IDiagramPreferenceSupport;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.LayoutHelper;
import org.eclipse.gmf.runtime.diagram.ui.internal.l10n.DiagramUIPluginImages;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.PopupBarTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Display;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.diagram.providers.PLMElementTypes;

public class InstantiatatePopupBarTool2 extends AbstractPopupBarTool{
	
	public InstantiatatePopupBarTool2(EditPart epHost, CreateRequest theRequest) {
		super(epHost, theRequest);
	}

	@Override
	protected Request createTargetRequest() {
		ChangePropertyValueRequest req = new ChangePropertyValueRequest("instantiate", "instantiate");
		return req;
	}

	@Override
	protected Command getCommand() {
		
		return new Command() {
			
			@Override
			public boolean canExecute() {
				return true;
			}
			
			@Override
			public void execute() {
				IGraphicalEditPart host = (IGraphicalEditPart)getHost();
				final PaletteDrawer instantiateDrawer = new PaletteDrawer("Instantiate");
				
				final PaletteViewer palette = ((EditDomain)host.getDiagramEditDomain()).getPaletteViewer();
				palette.getPaletteRoot().add(instantiateDrawer);
				
				List<IElementType> types = new ArrayList<IElementType>(2);
				types.add(de.uni_mannheim.informatik.swt.models.plm.diagram.providers.PLMElementTypes.Entity_3085);
				types.add(de.uni_mannheim.informatik.swt.models.plm.diagram.providers.PLMElementTypes.Entity_3069);
				
				Element type = ((Element)host.resolveSemanticElement()); 
				NodeToolEntry entry = new NodeToolEntry(
						type.getName(), "Creates a new " + type.getName(), types, instantiateDrawer);

				entry.setId("dsl." + EMFCoreUtil.getProxyID(type)
						+ ".CreationTool");
				entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.diagram.part.PLMDiagramEditorPlugin
						.findImageDescriptor("/de.uni_mannheim.informatik.swt.models.gmf/icons/clabject16.gif")); //$NON-NLS-1$
				entry.setLargeIcon(de.uni_mannheim.informatik.swt.models.plm.diagram.part.PLMDiagramEditorPlugin
						.findImageDescriptor("/de.uni_mannheim.informatik.swt.models.gmf/icons/clabject16.gif"));

				instantiateDrawer.add(entry);
				instantiateDrawer.setVisible(false);
				palette.setActiveTool(entry);
				
				palette.addPaletteListener(new PaletteListener() {
					
					@Override
					public void activeToolChanged(PaletteViewer palette, ToolEntry tool) {
						palette.getPaletteRoot().remove(instantiateDrawer);
						palette.removePaletteListener(this);
					}
				});
			}
		};
	}
	
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;
		private final PaletteDrawer containingDrawer;
		
		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes, PaletteDrawer containingDrawer) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
			this.containingDrawer = containingDrawer;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationToolEx(elementTypes, containingDrawer);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
	
	private static class UnspecifiedTypeCreationToolEx extends UnspecifiedTypeCreationTool{
		
		private PaletteDrawer containingDrawer = null;
		
		public UnspecifiedTypeCreationToolEx(List elementTypes) {
			super(elementTypes);
		}
		
		public UnspecifiedTypeCreationToolEx(List elementTypes, PaletteDrawer containingDrawer){
			this(elementTypes);
			this.containingDrawer = containingDrawer;
		}

		@Override
		protected void handleFinished() {
			containingDrawer.setVisible(true);
			super.handleFinished();
		}
	}
}