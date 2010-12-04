package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import com.borlander.gmftools.samples.inthemiddle.gmf.gnep.ITMGraphicalNodeEditPolicy;

/**
 * @generated
 */
public class PLMEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getVisualID(view)) {

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyNameEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyNameEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.Model2EditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.Model2EditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelNameEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelNameEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNamePotencyEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNamePotencyEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameExpressedPotencyLevEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameExpressedPotencyLevEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldNamePotencyEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldNamePotencyEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionNamePotencyEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionNamePotencyEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyOntologyLevelCompartmentEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyOntologyLevelCompartmentEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelDomainElementsComartmentEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelDomainElementsComartmentEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityDomainEntityFieldsCompartmentEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityDomainEntityFieldsCompartmentEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionParticipantEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionParticipantEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart(
						view);

			case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID:
				return new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart(
						view);

			}
			if (ViewType.NOTE.equals(view.getType())) {
				return new ITMGraphicalNodeEditPolicy.ITMNoteEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel) {
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		} else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

}
