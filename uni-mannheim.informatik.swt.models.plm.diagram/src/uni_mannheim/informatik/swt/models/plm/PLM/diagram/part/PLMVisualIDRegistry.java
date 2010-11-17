package uni_mannheim.informatik.swt.models.plm.PLM.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PLMVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "uni-mannheim.informatik.swt.models.plm.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.MODEL_ID
					.equals(view.getType())) {
				return uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
				.getModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((uni_mannheim.informatik.swt.models.plm.PLM.Model) domainElement)) {
			return uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getModelID(containerView);
		if (!uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			if (uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getPNode().isSuperTypeOf(domainElement.eClass())) {
				return uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeEditPart.VISUAL_ID;
			}
			if (uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getPRelationship().isSuperTypeOf(domainElement.eClass())) {
				return uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getModelID(containerView);
		if (!uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeEditPart.VISUAL_ID:
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeNamePotencyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipEditPart.VISUAL_ID:
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipNamePotencyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID:
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
				.getPGeneralization().isSuperTypeOf(domainElement.eClass())) {
			return uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID;
		}
		if (uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
				.getPInstantiation().isSuperTypeOf(domainElement.eClass())) {
			return uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			uni_mannheim.informatik.swt.models.plm.PLM.Model element) {
		return true;
	}

}
