package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator;

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
		de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem
				&& !isOwnView(((de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) element)
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
		if (element instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup group = (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup) element;
			return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem navigatorItem = (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) element;
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
		switch (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://swt.informatik.uni-mannheim.de/PLM?DomainEntity", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3002); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://swt.informatik.uni-mannheim.de/PLM?Ontology", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Ontology_2001); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://swt.informatik.uni-mannheim.de/PLM?Model", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Model_1000); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyLevelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://swt.informatik.uni-mannheim.de/PLM?OntologyLevel", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.OntologyLevel_3001); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnection2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://swt.informatik.uni-mannheim.de/PLM?DomainConnection", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_4001); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://swt.informatik.uni-mannheim.de/PLM?DomainConnection", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
						.isKnownElementType(elementType)) {
			image = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
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
		if (element instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup group = (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem navigatorItem = (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) element;
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
		switch (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return getDomainEntity_3002Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
			return getOntology_2001Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyLevelEditPart.VISUAL_ID:
			return getOntologyLevel_3001Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnection2EditPart.VISUAL_ID:
			return getDomainConnection_4001Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return getDomainConnection_3003Text(view);
		}
		return getUnknownElementText(view);
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
	private String getDomainConnection_4001Text(View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection domainModelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOntologyLevel_3001Text(View view) {
		IParser parser = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.OntologyLevel_3001,
						view.getElement() != null ? view.getElement() : view,
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
								.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyLevelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomainEntity_3002Text(View view) {
		IParser parser = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3002,
						view.getElement() != null ? view.getElement() : view,
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
								.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameLevelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOntology_2001Text(View view) {
		IParser parser = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Ontology_2001,
						view.getElement() != null ? view.getElement() : view,
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
								.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomainConnection_3003Text(View view) {
		IParser parser = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3003,
						view.getElement() != null ? view.getElement() : view,
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
								.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionNameLevelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
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
		return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
						.getModelID(view));
	}

}
