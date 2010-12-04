package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part;

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
		paletteRoot.add(createLevels1Group());
		paletteRoot.add(createDomainElements2Group());
		paletteRoot.add(createConnections3Group());
	}

	/**
	 * Creates "Levels" palette tool group
	 * @generated
	 */
	private PaletteContainer createLevels1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.Levels1Group_title);
		paletteContainer.setId("createLevels1Group"); //$NON-NLS-1$
		paletteContainer.add(createOntology1CreationTool());
		paletteContainer.add(createModel2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Domain Elements" palette tool group
	 * @generated
	 */
	private PaletteContainer createDomainElements2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainElements2Group_title);
		paletteContainer.setId("createDomainElements2Group"); //$NON-NLS-1$
		paletteContainer.add(createDomainEntity1CreationTool());
		paletteContainer.add(createDomainEntityField2CreationTool());
		paletteContainer.add(createDomainConnection3CreationTool());
		paletteContainer.add(createDomainConnectionParticipants4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.Connections3Group_title);
		paletteContainer.setId("createConnections3Group"); //$NON-NLS-1$
		paletteContainer.add(createInstantiation1CreationTool());
		paletteContainer.add(createBinaryGeneralization2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOntology1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.Ontology1CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.Ontology1CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Ontology_2002));
		entry.setId("createOntology1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Ontology_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModel2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.Model2CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.Model2CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Model_3004));
		entry.setId("createModel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Model_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainEntity1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainEntity1CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainEntity1CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3005));
		entry.setId("createDomainEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainEntityField2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainEntityField2CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainEntityField2CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Field_3007));
		entry.setId("createDomainEntityField2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Field_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainConnection3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainConnection3CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainConnection3CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3006));
		entry.setId("createDomainConnection3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainConnectionParticipants4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainConnectionParticipants4CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainConnectionParticipants4CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnectionParticipant_4003));
		entry.setId("createDomainConnectionParticipants4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnectionParticipant_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInstantiation1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.Instantiation1CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.Instantiation1CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002));
		entry.setId("createInstantiation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBinaryGeneralization2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.BinaryGeneralization2CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.BinaryGeneralization2CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004));
		entry.setId("createBinaryGeneralization2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004));
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
