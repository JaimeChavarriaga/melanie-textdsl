package uni_mannheim.informatik.swt.models.plm.PLM.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class PLMPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPLM1Group());
	}

	/**
	 * Creates "PLM" palette tool group
	 * @generated
	 */
	private PaletteContainer createPLM1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.PLM1Group_title);
		paletteContainer.setId("createPLM1Group"); //$NON-NLS-1$
		paletteContainer.add(createPNode1CreationTool());
		paletteContainer.add(createPGeneralization2CreationTool());
		paletteContainer.add(createPInstantiation3CreationTool());
		paletteContainer.add(createPRelationshipNode4CreationTool());
		paletteContainer
				.add(createPRelationshipNode_Participants5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.PNode1CreationTool_title,
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.PNode1CreationTool_desc,
				Collections
						.singletonList(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PNode_2001));
		entry.setId("createPNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PNode_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPGeneralization2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.PGeneralization2CreationTool_title,
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.PGeneralization2CreationTool_desc,
				Collections
						.singletonList(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PGeneralization_4001));
		entry.setId("createPGeneralization2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PGeneralization_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPInstantiation3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.PInstantiation3CreationTool_title,
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.PInstantiation3CreationTool_desc,
				Collections
						.singletonList(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PInstantiation_4003));
		entry.setId("createPInstantiation3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PInstantiation_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPRelationshipNode4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.PRelationshipNode4CreationTool_title,
				null,
				Collections
						.singletonList(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PRelationship_2002));
		entry.setId("createPRelationshipNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PRelationship_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPRelationshipNode_Participants5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.PRelationshipNode_Participants5CreationTool_title,
				null,
				Collections
						.singletonList(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PConnectorParticipants_4005));
		entry.setId("createPRelationshipNode_Participants5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PConnectorParticipants_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
