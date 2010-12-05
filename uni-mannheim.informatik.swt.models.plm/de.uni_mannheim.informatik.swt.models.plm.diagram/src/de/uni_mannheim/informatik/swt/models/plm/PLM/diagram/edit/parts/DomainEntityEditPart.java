package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import com.borlander.gmftools.samples.inthemiddle.gmf.gnep.ITMGraphicalNodeEditPolicy;

/**
 * @generated
 */
public class DomainEntityEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

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
	public DomainEntityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.DomainEntityItemSemanticEditPolicy());
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
		return primaryShape = new DomainEntityFigure();
	}

	/**
	 * @generated
	 */
	public DomainEntityFigure getPrimaryShape() {
		return (DomainEntityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNamePotencyEditPart) {
			((de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNamePotencyEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDomainEntityNameFigure());
			return true;
		}
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameExpressedPotencyLevEditPart) {
			((de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameExpressedPotencyLevEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDomainEntityPotencyLabel());
			return true;
		}
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameExpressedPotencyLev2EditPart) {
			((de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameExpressedPotencyLev2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDomainEntityAVSFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNamePotencyEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameExpressedPotencyLevEditPart) {
			return true;
		}
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameExpressedPotencyLev2EditPart) {
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
				.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNamePotencyEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
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
		if (relationshipType == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002) {
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
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Field_3007) {
				return getChildBySemanticHint(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
						.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityDomainEntityFieldsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class DomainEntityFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDomainEntityNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDomainEntityAVSFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDomainEntityPotencyLabel;

		/**
		 * @generated
		 */
		public DomainEntityFigure() {

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(0),
					getMapMode().DPtoLP(0)));
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

			ToolbarLayout layoutInnerRectangle0 = new ToolbarLayout();
			layoutInnerRectangle0.setStretchMinorAxis(true);
			layoutInnerRectangle0.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutInnerRectangle0.setSpacing(0);
			layoutInnerRectangle0.setVertical(true);

			innerRectangle0.setLayoutManager(layoutInnerRectangle0);

			RectangleFigure nameRectangle1 = new RectangleFigure();

			innerRectangle0.add(nameRectangle1);

			GridLayout layoutNameRectangle1 = new GridLayout();
			layoutNameRectangle1.numColumns = 2;
			layoutNameRectangle1.makeColumnsEqualWidth = false;
			nameRectangle1.setLayoutManager(layoutNameRectangle1);

			fFigureDomainEntityNameFigure = new WrappingLabel();
			fFigureDomainEntityNameFigure.setText("");

			GridData constraintFFigureDomainEntityNameFigure = new GridData();
			constraintFFigureDomainEntityNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureDomainEntityNameFigure.horizontalAlignment = GridData.END;
			constraintFFigureDomainEntityNameFigure.horizontalIndent = 0;
			constraintFFigureDomainEntityNameFigure.horizontalSpan = 1;
			constraintFFigureDomainEntityNameFigure.verticalSpan = 1;
			constraintFFigureDomainEntityNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureDomainEntityNameFigure.grabExcessVerticalSpace = false;
			nameRectangle1.add(fFigureDomainEntityNameFigure,
					constraintFFigureDomainEntityNameFigure);

			fFigureDomainEntityPotencyLabel = new WrappingLabel();
			fFigureDomainEntityPotencyLabel.setText("");

			fFigureDomainEntityPotencyLabel.setBorder(new MarginBorder(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(-2),
					getMapMode().DPtoLP(10), getMapMode().DPtoLP(0)));

			GridData constraintFFigureDomainEntityPotencyLabel = new GridData();
			constraintFFigureDomainEntityPotencyLabel.verticalAlignment = GridData.CENTER;
			constraintFFigureDomainEntityPotencyLabel.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureDomainEntityPotencyLabel.horizontalIndent = 0;
			constraintFFigureDomainEntityPotencyLabel.horizontalSpan = 1;
			constraintFFigureDomainEntityPotencyLabel.verticalSpan = 1;
			constraintFFigureDomainEntityPotencyLabel.grabExcessHorizontalSpace = true;
			constraintFFigureDomainEntityPotencyLabel.grabExcessVerticalSpace = false;
			nameRectangle1.add(fFigureDomainEntityPotencyLabel,
					constraintFFigureDomainEntityPotencyLabel);

			RectangleFigure aVSRectangle1 = new RectangleFigure();

			innerRectangle0.add(aVSRectangle1);

			GridLayout layoutAVSRectangle1 = new GridLayout();
			layoutAVSRectangle1.numColumns = 3;
			layoutAVSRectangle1.makeColumnsEqualWidth = false;
			aVSRectangle1.setLayoutManager(layoutAVSRectangle1);

			WrappingLabel firstCurlyBracket2 = new WrappingLabel();
			firstCurlyBracket2.setText("{");

			aVSRectangle1.add(firstCurlyBracket2);

			fFigureDomainEntityAVSFigure = new WrappingLabel();
			fFigureDomainEntityAVSFigure.setText("");

			aVSRectangle1.add(fFigureDomainEntityAVSFigure);

			WrappingLabel secondCurlyBracket2 = new WrappingLabel();
			secondCurlyBracket2.setText("}");

			aVSRectangle1.add(secondCurlyBracket2);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDomainEntityNameFigure() {
			return fFigureDomainEntityNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDomainEntityAVSFigure() {
			return fFigureDomainEntityAVSFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDomainEntityPotencyLabel() {
			return fFigureDomainEntityPotencyLabel;
		}

	}

}
