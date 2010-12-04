package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
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
		public DomainEntityFigure() {
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure rect0 = new RectangleFigure();

			this.add(rect0);

			GridLayout layoutRect0 = new GridLayout();
			layoutRect0.numColumns = 3;
			layoutRect0.makeColumnsEqualWidth = false;
			rect0.setLayoutManager(layoutRect0);

			fFigureDomainEntityNameFigure = new WrappingLabel();
			fFigureDomainEntityNameFigure.setText("");

			GridData constraintFFigureDomainEntityNameFigure = new GridData();
			constraintFFigureDomainEntityNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureDomainEntityNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureDomainEntityNameFigure.horizontalIndent = 0;
			constraintFFigureDomainEntityNameFigure.horizontalSpan = 3;
			constraintFFigureDomainEntityNameFigure.verticalSpan = 1;
			constraintFFigureDomainEntityNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureDomainEntityNameFigure.grabExcessVerticalSpace = false;
			rect0.add(fFigureDomainEntityNameFigure,
					constraintFFigureDomainEntityNameFigure);

			WrappingLabel firstCurlyBracket1 = new WrappingLabel();
			firstCurlyBracket1.setText("{");

			rect0.add(firstCurlyBracket1);

			fFigureDomainEntityAVSFigure = new WrappingLabel();
			fFigureDomainEntityAVSFigure.setText("");

			rect0.add(fFigureDomainEntityAVSFigure);

			WrappingLabel secondCurlyBracket1 = new WrappingLabel();
			secondCurlyBracket1.setText("}");

			rect0.add(secondCurlyBracket1);

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

	}

}
