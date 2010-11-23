package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PLMDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> getSemanticChildren(
			View view) {
		switch (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
			return getOntology_2001SemanticChildren(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyLevelEditPart.VISUAL_ID:
			return getOntologyLevel_3001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> getModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.Model modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) view
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor>();
		{
			de.uni_mannheim.informatik.swt.models.plm.PLM.Element childElement = modelElement
					.getElements();
			int visualID = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID) {
				result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> getOntology_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology) view
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOntologyLevels().iterator(); it
				.hasNext();) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.OntologyLevel childElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.OntologyLevel) it
					.next();
			int visualID = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyLevelEditPart.VISUAL_ID) {
				result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> getOntologyLevel_3001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.OntologyLevel modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.OntologyLevel) view
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.OwnedElement childElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.OwnedElement) it
					.next();
			int visualID = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID) {
				result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID) {
				result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getContainedLinks(
			View view) {
		switch (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
			return getOntology_2001ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyLevelEditPart.VISUAL_ID:
			return getOntologyLevel_3001ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return getDomainEntity_3002ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return getDomainConnection_3003ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnection2EditPart.VISUAL_ID:
			return getDomainConnection_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getIncomingLinks(
			View view) {
		switch (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
			return getOntology_2001IncomingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyLevelEditPart.VISUAL_ID:
			return getOntologyLevel_3001IncomingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return getDomainEntity_3002IncomingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return getDomainConnection_3003IncomingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnection2EditPart.VISUAL_ID:
			return getDomainConnection_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
			return getOntology_2001OutgoingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyLevelEditPart.VISUAL_ID:
			return getOntologyLevel_3001OutgoingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return getDomainEntity_3002OutgoingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return getDomainConnection_3003OutgoingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnection2EditPart.VISUAL_ID:
			return getDomainConnection_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getModel_1000ContainedLinks(
			View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.Model modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) view
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_DomainConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOntology_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOntologyLevel_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainEntity_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainConnection_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOntology_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOntologyLevel_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainEntity_3002IncomingLinks(
			View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DomainConnection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainConnection_3003IncomingLinks(
			View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DomainConnection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainConnection_4001IncomingLinks(
			View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DomainConnection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOntology_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOntologyLevel_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainEntity_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainConnection_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getContainedTypeModelFacetLinks_DomainConnection_4001(
			de.uni_mannheim.informatik.swt.models.plm.PLM.Model container) {
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		de.uni_mannheim.informatik.swt.models.plm.PLM.Element linkObject = container
				.getElements();
		if (false == linkObject instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) {
			return result;
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection link = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) linkObject;
		if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnection2EditPart.VISUAL_ID != de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getLinkWithClassVisualID(link)) {
			return result;
		}
		List targets = link.getParticipant();
		Object theTarget = targets.size() == 1 ? targets.get(0) : null;
		if (false == theTarget instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) {
			return result;
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject dst = (de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) theTarget;
		result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
				container,
				dst,
				link,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_4001,
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnection2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getIncomingTypeModelFacetLinks_DomainConnection_4001(
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getDomainConnection_Participant()
					|| false == setting.getEObject() instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection link = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) setting
					.getEObject();
			if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnection2EditPart.VISUAL_ID != de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Model) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.Model container = (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) link
					.eContainer();
			result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					container,
					target,
					link,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_4001,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnection2EditPart.VISUAL_ID));

		}
		return result;
	}

}
