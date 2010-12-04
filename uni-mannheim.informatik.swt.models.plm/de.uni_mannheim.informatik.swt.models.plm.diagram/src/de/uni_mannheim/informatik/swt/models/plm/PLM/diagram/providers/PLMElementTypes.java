package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class PLMElementTypes {

	/**
	 * @generated
	 */
	private PLMElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType LMLModel_1000 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.LMLModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ontology_2002 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.Ontology_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Model_3004 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.Model_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainEntity_3005 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.DomainEntity_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Field_3007 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.Field_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainConnection_3006 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.DomainConnection_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainConnectionParticipant_4003 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.DomainConnectionParticipant_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Instantiation_4002 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.Instantiation_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BinaryGeneralization_4004 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.BinaryGeneralization_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(
					LMLModel_1000,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getLMLModel());

			elements.put(
					Ontology_2002,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getOntology());

			elements.put(
					Model_3004,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getModel());

			elements.put(
					DomainEntity_3005,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getDomainEntity());

			elements.put(
					Field_3007,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getField());

			elements.put(
					DomainConnection_3006,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getDomainConnection());

			elements.put(
					DomainConnectionParticipant_4003,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getDomainConnection_Participant());

			elements.put(
					Instantiation_4002,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getInstantiation());

			elements.put(
					BinaryGeneralization_4004,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getBinaryGeneralization());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(LMLModel_1000);
			KNOWN_ELEMENT_TYPES.add(Ontology_2002);
			KNOWN_ELEMENT_TYPES.add(Model_3004);
			KNOWN_ELEMENT_TYPES.add(DomainEntity_3005);
			KNOWN_ELEMENT_TYPES.add(Field_3007);
			KNOWN_ELEMENT_TYPES.add(DomainConnection_3006);
			KNOWN_ELEMENT_TYPES.add(DomainConnectionParticipant_4003);
			KNOWN_ELEMENT_TYPES.add(Instantiation_4002);
			KNOWN_ELEMENT_TYPES.add(BinaryGeneralization_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return LMLModel_1000;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
			return Ontology_2002;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.Model2EditPart.VISUAL_ID:
			return Model_3004;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return DomainEntity_3005;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldEditPart.VISUAL_ID:
			return Field_3007;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return DomainConnection_3006;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionParticipantEditPart.VISUAL_ID:
			return DomainConnectionParticipant_4003;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.InstantiationEditPart.VISUAL_ID:
			return Instantiation_4002;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.BinaryGeneralizationEditPart.VISUAL_ID:
			return BinaryGeneralization_4004;
		}
		return null;
	}

}
