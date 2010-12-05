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
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://swt.informatik.uni-mannheim.de/PLM?BinaryGeneralization", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://swt.informatik.uni-mannheim.de/PLM?Field", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Field_3007); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://swt.informatik.uni-mannheim.de/PLM?Instantiation", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://swt.informatik.uni-mannheim.de/PLM?DomainConnection", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3006); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://swt.informatik.uni-mannheim.de/PLM?Ontology", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Ontology_2002); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://swt.informatik.uni-mannheim.de/PLM?DomainEntity", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3005); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.Model2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://swt.informatik.uni-mannheim.de/PLM?Model", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Model_3004); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://swt.informatik.uni-mannheim.de/PLM?LMLModel", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.LMLModel_1000); //$NON-NLS-1$
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionParticipantEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://swt.informatik.uni-mannheim.de/PLM?DomainConnection?participant", de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnectionParticipant_4003); //$NON-NLS-1$
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
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID:
			return getBinaryGeneralization_4004Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart.VISUAL_ID:
			return getField_3007Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID:
			return getInstantiation_4002Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return getDomainConnection_3006Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
			return getOntology_2002Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return getDomainEntity_3005Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.Model2EditPart.VISUAL_ID:
			return getModel_3004Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getLMLModel_1000Text(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionParticipantEditPart.VISUAL_ID:
			return getDomainConnectionParticipant_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getInstantiation_4002Text(View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation domainModelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModel_3004Text(View view) {
		IParser parser = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Model_3004,
						view.getElement() != null ? view.getElement() : view,
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
								.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLMLModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOntology_2002Text(View view) {
		IParser parser = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Ontology_2002,
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
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomainEntity_3005Text(View view) {
		IParser parser = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3005,
						view.getElement() != null ? view.getElement() : view,
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
								.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNamePotencyEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomainConnectionParticipant_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBinaryGeneralization_4004Text(View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization domainModelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getField_3007Text(View view) {
		IParser parser = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Field_3007,
						view.getElement() != null ? view.getElement() : view,
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
								.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldNamePotencyEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomainConnection_3006Text(View view) {
		IParser parser = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMParserProvider
				.getParser(
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3006,
						view.getElement() != null ? view.getElement() : view,
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
								.getType(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionNamePotencyEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
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
