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
			return getLMLModel_1000SemanticChildren(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyOntologyLevelCompartmentEditPart.VISUAL_ID:
			return getOntologyModelCompartment_7003SemanticChildren(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelDomainElementsComartmentEditPart.VISUAL_ID:
			return getModelDomainElementsComartment_7004SemanticChildren(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityDomainEntityFieldsCompartmentEditPart.VISUAL_ID:
			return getDomainEntityDomainEntityFieldsCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> getLMLModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.LMLModel) view
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor>();
		{
			de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology childElement = modelElement
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
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> getOntologyModelCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.Ontology) containerView
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getModels().iterator(); it.hasNext();) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.Model childElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) it
					.next();
			int visualID = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.Model2EditPart.VISUAL_ID) {
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
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> getModelDomainElementsComartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.Model modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) containerView
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.Element childElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.Element) it
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
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> getDomainEntityDomainEntityFieldsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity) containerView
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFields().iterator(); it.hasNext();) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.Field childElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.Field) it
					.next();
			int visualID = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart.VISUAL_ID) {
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
			return getLMLModel_1000ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
			return getOntology_2002ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.Model2EditPart.VISUAL_ID:
			return getModel_3004ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return getDomainEntity_3005ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart.VISUAL_ID:
			return getField_3007ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return getDomainConnection_3006ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID:
			return getInstantiation_4002ContainedLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID:
			return getBinaryGeneralization_4004ContainedLinks(view);
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
			return getOntology_2002IncomingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.Model2EditPart.VISUAL_ID:
			return getModel_3004IncomingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return getDomainEntity_3005IncomingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart.VISUAL_ID:
			return getField_3007IncomingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return getDomainConnection_3006IncomingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID:
			return getInstantiation_4002IncomingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID:
			return getBinaryGeneralization_4004IncomingLinks(view);
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
			return getOntology_2002OutgoingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.Model2EditPart.VISUAL_ID:
			return getModel_3004OutgoingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return getDomainEntity_3005OutgoingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart.VISUAL_ID:
			return getField_3007OutgoingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return getDomainConnection_3006OutgoingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID:
			return getInstantiation_4002OutgoingLinks(view);
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID:
			return getBinaryGeneralization_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getLMLModel_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOntology_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getModel_3004ContainedLinks(
			View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.Model modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) view
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Instantiation_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_BinaryGeneralization_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainEntity_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getField_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainConnection_3006ContainedLinks(
			View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) view
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DomainConnection_Participant_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getInstantiation_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getBinaryGeneralization_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOntology_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getModel_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainEntity_3005IncomingLinks(
			View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DomainConnection_Participant_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Instantiation_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BinaryGeneralization_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getField_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainConnection_3006IncomingLinks(
			View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_DomainConnection_Participant_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Instantiation_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BinaryGeneralization_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getInstantiation_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getBinaryGeneralization_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOntology_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getModel_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainEntity_3005OutgoingLinks(
			View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainEntity) view
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Instantiation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_BinaryGeneralization_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getField_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getDomainConnection_3006OutgoingLinks(
			View view) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection modelElement = (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) view
				.getElement();
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_DomainConnection_Participant_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Instantiation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_BinaryGeneralization_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getInstantiation_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getBinaryGeneralization_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getContainedTypeModelFacetLinks_Instantiation_4002(
			de.uni_mannheim.informatik.swt.models.plm.PLM.Model container) {
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation link = (de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation) linkObject;
			if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID != de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject dst = link
					.getType();
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject src = link
					.getInstance();
			result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					dst,
					link,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getContainedTypeModelFacetLinks_BinaryGeneralization_4004(
			de.uni_mannheim.informatik.swt.models.plm.PLM.Model container) {
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization link = (de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization) linkObject;
			if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID != de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject dst = link
					.getSupertype();
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject src = link
					.getSubtype();
			result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					dst,
					link,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getIncomingFeatureModelFacetLinks_DomainConnection_Participant_4003(
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getDomainConnection_Participant()) {
				result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
						setting.getEObject(),
						target,
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnectionParticipant_4003,
						de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionParticipantEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getIncomingTypeModelFacetLinks_Instantiation_4002(
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getInstantiation_Type()
					|| false == setting.getEObject() instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation link = (de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation) setting
					.getEObject();
			if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID != de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject src = link
					.getInstance();
			result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					target,
					link,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getIncomingTypeModelFacetLinks_BinaryGeneralization_4004(
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getBinaryGeneralization_Supertype()
					|| false == setting.getEObject() instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization link = (de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization) setting
					.getEObject();
			if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID != de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject src = link
					.getSubtype();
			result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					target,
					link,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOutgoingFeatureModelFacetLinks_DomainConnection_Participant_4003(
			de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection source) {
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		for (Iterator<?> destinations = source.getParticipant().iterator(); destinations
				.hasNext();) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject destination = (de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) destinations
					.next();
			result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					source,
					destination,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnectionParticipant_4003,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionParticipantEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOutgoingTypeModelFacetLinks_Instantiation_4002(
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject source) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Model) {
				container = (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation link = (de.uni_mannheim.informatik.swt.models.plm.PLM.Instantiation) linkObject;
			if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID != de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject dst = link
					.getType();
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject src = link
					.getInstance();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					dst,
					link,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Instantiation_4002,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> getOutgoingTypeModelFacetLinks_BinaryGeneralization_4004(
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject source) {
		de.uni_mannheim.informatik.swt.models.plm.PLM.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Model) {
				container = (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor> result = new LinkedList<de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization link = (de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization) linkObject;
			if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID != de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject dst = link
					.getSupertype();
			de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject src = link
					.getSubtype();
			if (src != source) {
				continue;
			}
			result.add(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMLinkDescriptor(
					src,
					dst,
					link,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.BinaryGeneralization_4004,
					de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID));
		}
		return result;
	}

}
