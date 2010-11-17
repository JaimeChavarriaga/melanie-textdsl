package uni_mannheim.informatik.swt.models.plm.PLM.diagram.part;

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
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> getSemanticChildren(
			View view) {
		switch (uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> getModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		uni_mannheim.informatik.swt.models.plm.PLM.Model modelElement = (uni_mannheim.informatik.swt.models.plm.PLM.Model) view
				.getElement();
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			uni_mannheim.informatik.swt.models.plm.PLM.PElement childElement = (uni_mannheim.informatik.swt.models.plm.PLM.PElement) it
					.next();
			int visualID = uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeEditPart.VISUAL_ID) {
				result.add(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipEditPart.VISUAL_ID) {
				result.add(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getContainedLinks(
			View view) {
		switch (uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeEditPart.VISUAL_ID:
			return getPNode_2001ContainedLinks(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipEditPart.VISUAL_ID:
			return getPRelationship_2002ContainedLinks(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID:
			return getPGeneralization_4001ContainedLinks(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID:
			return getPInstantiation_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getIncomingLinks(
			View view) {
		switch (uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeEditPart.VISUAL_ID:
			return getPNode_2001IncomingLinks(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipEditPart.VISUAL_ID:
			return getPRelationship_2002IncomingLinks(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID:
			return getPGeneralization_4001IncomingLinks(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID:
			return getPInstantiation_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
				.getVisualID(view)) {
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeEditPart.VISUAL_ID:
			return getPNode_2001OutgoingLinks(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipEditPart.VISUAL_ID:
			return getPRelationship_2002OutgoingLinks(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID:
			return getPGeneralization_4001OutgoingLinks(view);
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID:
			return getPInstantiation_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getModel_1000ContainedLinks(
			View view) {
		uni_mannheim.informatik.swt.models.plm.PLM.Model modelElement = (uni_mannheim.informatik.swt.models.plm.PLM.Model) view
				.getElement();
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_PGeneralization_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_PInstantiation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPNode_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPRelationship_2002ContainedLinks(
			View view) {
		uni_mannheim.informatik.swt.models.plm.PLM.PRelationship modelElement = (uni_mannheim.informatik.swt.models.plm.PLM.PRelationship) view
				.getElement();
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PConnector_Participants_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPGeneralization_4001ContainedLinks(
			View view) {
		uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization modelElement = (uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization) view
				.getElement();
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PConnector_Participants_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPInstantiation_4003ContainedLinks(
			View view) {
		uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation modelElement = (uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation) view
				.getElement();
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PConnector_Participants_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPNode_2001IncomingLinks(
			View view) {
		uni_mannheim.informatik.swt.models.plm.PLM.PNode modelElement = (uni_mannheim.informatik.swt.models.plm.PLM.PNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PConnector_Participants_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PGeneralization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PInstantiation_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPRelationship_2002IncomingLinks(
			View view) {
		uni_mannheim.informatik.swt.models.plm.PLM.PRelationship modelElement = (uni_mannheim.informatik.swt.models.plm.PLM.PRelationship) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PConnector_Participants_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PGeneralization_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PInstantiation_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPGeneralization_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPInstantiation_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPNode_2001OutgoingLinks(
			View view) {
		uni_mannheim.informatik.swt.models.plm.PLM.PNode modelElement = (uni_mannheim.informatik.swt.models.plm.PLM.PNode) view
				.getElement();
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_PGeneralization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_PInstantiation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPRelationship_2002OutgoingLinks(
			View view) {
		uni_mannheim.informatik.swt.models.plm.PLM.PRelationship modelElement = (uni_mannheim.informatik.swt.models.plm.PLM.PRelationship) view
				.getElement();
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PConnector_Participants_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_PGeneralization_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_PInstantiation_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPGeneralization_4001OutgoingLinks(
			View view) {
		uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization modelElement = (uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization) view
				.getElement();
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PConnector_Participants_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getPInstantiation_4003OutgoingLinks(
			View view) {
		uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation modelElement = (uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation) view
				.getElement();
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PConnector_Participants_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getContainedTypeModelFacetLinks_PGeneralization_4001(
			uni_mannheim.informatik.swt.models.plm.PLM.Model container) {
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization link = (uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization) linkObject;
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID != uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getParticipants();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject dst = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) theTarget;
			List sources = link.getParticipants();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject src = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) theSource;
			result.add(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					dst,
					link,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PGeneralization_4001,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getContainedTypeModelFacetLinks_PInstantiation_4003(
			uni_mannheim.informatik.swt.models.plm.PLM.Model container) {
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation link = (uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation) linkObject;
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID != uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getParticipants();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject dst = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) theTarget;
			List sources = link.getParticipants();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject src = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) theSource;
			result.add(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					dst,
					link,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PInstantiation_4003,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getIncomingFeatureModelFacetLinks_PConnector_Participants_4005(
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getPConnector_Participants()) {
				result.add(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
						setting.getEObject(),
						target,
						uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PConnectorParticipants_4005,
						uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PConnectorParticipantsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getIncomingTypeModelFacetLinks_PGeneralization_4001(
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getPConnector_Participants()
					|| false == setting.getEObject() instanceof uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization link = (uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization) setting
					.getEObject();
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID != uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getParticipants();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject src = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) theSource;
			result.add(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					target,
					link,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PGeneralization_4001,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getIncomingTypeModelFacetLinks_PInstantiation_4003(
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getPConnector_Participants()
					|| false == setting.getEObject() instanceof uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation link = (uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation) setting
					.getEObject();
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID != uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getParticipants();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject src = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) theSource;
			result.add(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					target,
					link,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PInstantiation_4003,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOutgoingFeatureModelFacetLinks_PConnector_Participants_4005(
			uni_mannheim.informatik.swt.models.plm.PLM.PConnector source) {
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		for (Iterator<?> destinations = source.getParticipants().iterator(); destinations
				.hasNext();) {
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject destination = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) destinations
					.next();
			result.add(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					source,
					destination,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PConnectorParticipants_4005,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PConnectorParticipantsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOutgoingTypeModelFacetLinks_PGeneralization_4001(
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject source) {
		uni_mannheim.informatik.swt.models.plm.PLM.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof uni_mannheim.informatik.swt.models.plm.PLM.Model) {
				container = (uni_mannheim.informatik.swt.models.plm.PLM.Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization link = (uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization) linkObject;
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID != uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getParticipants();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject dst = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) theTarget;
			List sources = link.getParticipants();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject src = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) theSource;
			if (src != source) {
				continue;
			}
			result.add(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					dst,
					link,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PGeneralization_4001,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOutgoingTypeModelFacetLinks_PInstantiation_4003(
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject source) {
		uni_mannheim.informatik.swt.models.plm.PLM.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof uni_mannheim.informatik.swt.models.plm.PLM.Model) {
				container = (uni_mannheim.informatik.swt.models.plm.PLM.Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation link = (uni_mannheim.informatik.swt.models.plm.PLM.PInstantiation) linkObject;
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID != uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getParticipants();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject dst = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) theTarget;
			List sources = link.getParticipants();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject) {
				continue;
			}
			uni_mannheim.informatik.swt.models.plm.PLM.PClabject src = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) theSource;
			if (src != source) {
				continue;
			}
			result.add(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					dst,
					link,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PInstantiation_4003,
					uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID));
		}
		return result;
	}

}
