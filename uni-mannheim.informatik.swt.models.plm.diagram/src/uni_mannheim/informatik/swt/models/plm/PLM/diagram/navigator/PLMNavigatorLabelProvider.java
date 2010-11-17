package uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class PLMNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem
				&& !isOwnView(((uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup) {
			uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup group = (uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup) element;
			return uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) {
			uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem navigatorItem = (uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PConnectorParticipantsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://swt.informatik.uni-mannheim.de/PLM?PConnector?participants", uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PConnectorParticipants_4005); //$NON-NLS-1$
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://swt.informatik.uni-mannheim.de/PLM?PNode", uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PNode_2001); //$NON-NLS-1$
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://swt.informatik.uni-mannheim.de/PLM?PRelationship", uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PRelationship_2002); //$NON-NLS-1$
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://swt.informatik.uni-mannheim.de/PLM?Model", uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Model_1000); //$NON-NLS-1$
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://swt.informatik.uni-mannheim.de/PLM?PGeneralization", uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PGeneralization_4001); //$NON-NLS-1$
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://swt.informatik.uni-mannheim.de/PLM?PInstantiation", uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PInstantiation_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
						.isKnownElementType(elementType)) {
			image = uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup) {
			uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup group = (uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) {
			uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem navigatorItem = (uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PConnectorParticipantsEditPart.VISUAL_ID:
			return getPConnectorParticipants_4005Text(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeEditPart.VISUAL_ID:
			return getPNode_2001Text(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipEditPart.VISUAL_ID:
			return getPRelationship_2002Text(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID:
			return getPGeneralization_4001Text(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID:
			return getPInstantiation_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPConnectorParticipants_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPNode_2001Text(View view) {
		IParser parser = uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PNode_2001,
						view.getElement() != null ? view.getElement() : view,
						uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
								.getType(uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeNamePotencyEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPRelationship_2002Text(View view) {
		IParser parser = uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PRelationship_2002,
						view.getElement() != null ? view.getElement() : view,
						uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
								.getType(uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipNamePotencyEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPGeneralization_4001Text(View view) {
		uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization domainModelElement = (uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPInstantiation_4003Text(View view) {
		IParser parser = uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PInstantiation_4003,
						view.getElement() != null ? view.getElement() : view,
						uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
								.getType(uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
						.getModelID(view));
	}

}
