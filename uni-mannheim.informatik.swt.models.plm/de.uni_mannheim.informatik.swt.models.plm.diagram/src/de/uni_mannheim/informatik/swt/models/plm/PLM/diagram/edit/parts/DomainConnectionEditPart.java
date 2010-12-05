package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import com.borlander.gmftools.samples.inthemiddle.gmf.gnep.ITMGraphicalNodeEditPolicy;

/**
 * @generated
 */
public class DomainConnectionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public DomainConnectionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.DomainConnectionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new ITMGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new DomainConnectionFigure();
	}

	/**
	 * @generated
	 */
	public DomainConnectionFigure getPrimaryShape() {
		return (DomainConnectionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionNamePotencyEditPart) {
			((de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionNamePotencyEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDomainConnectionNameFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionPotencyEditPart) {
			((de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionPotencyEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDomainConnectionPotencyFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionNamePotencyEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionPotencyEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionNamePotencyEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnectionParticipant_4003);
		types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002);
		types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnectionParticipant_4003);
		}
		if (targetEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnectionParticipant_4003);
		}
		if (targetEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002);
		}
		if (targetEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002);
		}
		if (targetEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004);
		}
		if (targetEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnectionParticipant_4003) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3005);
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3006);
		} else if (relationshipType == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3005);
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3006);
		} else if (relationshipType == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3005);
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnectionParticipant_4003);
		types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002);
		types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnectionParticipant_4003) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3006);
		} else if (relationshipType == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3005);
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3006);
		} else if (relationshipType == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004) {
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3005);
			types.add(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class DomainConnectionFigure extends ScalablePolygonShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDomainConnectionNameFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDomainConnectionPotencyFigure;

		/**
		 * @generated
		 */
		public DomainConnectionFigure() {
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(20)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(60)));
			this.addPoint(new Point(getMapMode().DPtoLP(20), getMapMode()
					.DPtoLP(80)));
			this.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode()
					.DPtoLP(60)));
			this.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode()
					.DPtoLP(20)));
			this.addPoint(new Point(getMapMode().DPtoLP(20), getMapMode()
					.DPtoLP(0)));
			this.setFill(true);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure innerRectangle0 = new RectangleFigure();
			innerRectangle0.setFill(false);
			innerRectangle0.setOutline(false);

			this.add(innerRectangle0);

			RectangleFigure nameRectangle0 = new RectangleFigure();
			nameRectangle0.setFill(false);
			nameRectangle0.setOutline(false);

			this.add(nameRectangle0);

			GridLayout layoutNameRectangle0 = new GridLayout();
			layoutNameRectangle0.numColumns = 2;
			layoutNameRectangle0.makeColumnsEqualWidth = false;
			nameRectangle0.setLayoutManager(layoutNameRectangle0);

			fFigureDomainConnectionNameFigure = new WrappingLabel();
			fFigureDomainConnectionNameFigure.setText("");

			GridData constraintFFigureDomainConnectionNameFigure = new GridData();
			constraintFFigureDomainConnectionNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureDomainConnectionNameFigure.horizontalAlignment = GridData.END;
			constraintFFigureDomainConnectionNameFigure.horizontalIndent = 0;
			constraintFFigureDomainConnectionNameFigure.horizontalSpan = 1;
			constraintFFigureDomainConnectionNameFigure.verticalSpan = 1;
			constraintFFigureDomainConnectionNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureDomainConnectionNameFigure.grabExcessVerticalSpace = false;
			nameRectangle0.add(fFigureDomainConnectionNameFigure,
					constraintFFigureDomainConnectionNameFigure);

			fFigureDomainConnectionPotencyFigure = new WrappingLabel();
			fFigureDomainConnectionPotencyFigure.setText("");

			fFigureDomainConnectionPotencyFigure.setBorder(new MarginBorder(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(0)));

			GridData constraintFFigureDomainConnectionPotencyFigure = new GridData();
			constraintFFigureDomainConnectionPotencyFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureDomainConnectionPotencyFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureDomainConnectionPotencyFigure.horizontalIndent = 0;
			constraintFFigureDomainConnectionPotencyFigure.horizontalSpan = 1;
			constraintFFigureDomainConnectionPotencyFigure.verticalSpan = 1;
			constraintFFigureDomainConnectionPotencyFigure.grabExcessHorizontalSpace = true;
			constraintFFigureDomainConnectionPotencyFigure.grabExcessVerticalSpace = false;
			nameRectangle0.add(fFigureDomainConnectionPotencyFigure,
					constraintFFigureDomainConnectionPotencyFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDomainConnectionNameFigure() {
			return fFigureDomainConnectionNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDomainConnectionPotencyFigure() {
			return fFigureDomainConnectionPotencyFigure;
		}

	}

}
