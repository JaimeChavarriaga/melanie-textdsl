package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
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
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import com.borlander.gmftools.samples.inthemiddle.gmf.gnep.ITMGraphicalNodeEditPolicy;

/**
 * @generated
 */
public class Model2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

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
	public Model2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.Model2ItemSemanticEditPolicy());
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
		return primaryShape = new ModelFigure();
	}

	/**
	 * @generated
	 */
	public ModelFigure getPrimaryShape() {
		return (ModelFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelNameEditPart) {
			((de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOntologyLevelNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelNameEditPart) {
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(150, 150);
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
				.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ModelFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureOntologyLevelNameFigure;

		/**
		 * @generated
		 */
		public ModelFigure() {
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(300),
					getMapMode().DPtoLP(300)));
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
			nameRectangle1.setFill(false);
			nameRectangle1.setOutline(false);

			innerRectangle0.add(nameRectangle1);

			GridLayout layoutNameRectangle1 = new GridLayout();
			layoutNameRectangle1.numColumns = 1;
			layoutNameRectangle1.makeColumnsEqualWidth = true;
			nameRectangle1.setLayoutManager(layoutNameRectangle1);

			fFigureOntologyLevelNameFigure = new WrappingLabel();
			fFigureOntologyLevelNameFigure.setText("");

			fFigureOntologyLevelNameFigure
					.setFont(FFIGUREONTOLOGYLEVELNAMEFIGURE_FONT);

			fFigureOntologyLevelNameFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(20)));

			GridData constraintFFigureOntologyLevelNameFigure = new GridData();
			constraintFFigureOntologyLevelNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureOntologyLevelNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureOntologyLevelNameFigure.horizontalIndent = 0;
			constraintFFigureOntologyLevelNameFigure.horizontalSpan = 1;
			constraintFFigureOntologyLevelNameFigure.verticalSpan = 1;
			constraintFFigureOntologyLevelNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureOntologyLevelNameFigure.grabExcessVerticalSpace = true;
			nameRectangle1.add(fFigureOntologyLevelNameFigure,
					constraintFFigureOntologyLevelNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOntologyLevelNameFigure() {
			return fFigureOntologyLevelNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREONTOLOGYLEVELNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 11, SWT.NORMAL);

}
