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
		paletteRoot.add(createPLM1Group());
	}

	/**
	 * Creates "PLM" palette tool group
	 * @generated
	 */
	private PaletteContainer createPLM1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.PLM1Group_title);
		paletteContainer.setId("createPLM1Group"); //$NON-NLS-1$
		paletteContainer.add(createOntology1CreationTool());
		paletteContainer.add(createOntologyLevel2CreationTool());
		paletteContainer.add(createDomainEntity3CreationTool());
		paletteContainer.add(createDomainConnection4CreationTool());
		paletteContainer.add(createDomainConnectionParticipants5CreationTool());
		paletteContainer.add(createInstantiation6CreationTool());
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
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Ontology_2001));
		entry.setId("createOntology1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Ontology_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOntologyLevel2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.OntologyLevel2CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.OntologyLevel2CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.OntologyLevel_3001));
		entry.setId("createOntologyLevel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.OntologyLevel_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainEntity3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainEntity3CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainEntity3CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3002));
		entry.setId("createDomainEntity3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainConnection4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainConnection4CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainConnection4CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3003));
		entry.setId("createDomainConnection4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomainConnectionParticipants5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainConnectionParticipants5CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.DomainConnectionParticipants5CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_4001));
		entry.setId("createDomainConnectionParticipants5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInstantiation6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.Instantiation6CreationTool_title,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.Messages.Instantiation6CreationTool_desc,
				Collections
						.singletonList(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002));
		entry.setId("createInstantiation6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
				.getImageDescriptor(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002));
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
