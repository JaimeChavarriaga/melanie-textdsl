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
	public static final IElementType Model_1000 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.Model_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ontology_2001 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.Ontology_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OntologyLevel_3001 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.OntologyLevel_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainEntity_3002 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.DomainEntity_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainConnection_3003 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.DomainConnection_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DomainConnection_4001 = getElementType("de.uni_mannheim.informatik.swt.models.plm.diagram.DomainConnection_4001"); //$NON-NLS-1$

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
					Model_1000,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getModel());

			elements.put(
					Ontology_2001,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getOntology());

			elements.put(
					OntologyLevel_3001,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getOntologyLevel());

			elements.put(
					DomainEntity_3002,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getDomainEntity());

			elements.put(
					DomainConnection_3003,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getDomainConnection());

			elements.put(
					DomainConnection_4001,
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getDomainConnection());
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
			KNOWN_ELEMENT_TYPES.add(Model_1000);
			KNOWN_ELEMENT_TYPES.add(Ontology_2001);
			KNOWN_ELEMENT_TYPES.add(OntologyLevel_3001);
			KNOWN_ELEMENT_TYPES.add(DomainEntity_3002);
			KNOWN_ELEMENT_TYPES.add(DomainConnection_3003);
			KNOWN_ELEMENT_TYPES.add(DomainConnection_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return Model_1000;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyEditPart.VISUAL_ID:
			return Ontology_2001;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyLevelEditPart.VISUAL_ID:
			return OntologyLevel_3001;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityEditPart.VISUAL_ID:
			return DomainEntity_3002;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionEditPart.VISUAL_ID:
			return DomainConnection_3003;
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnection2EditPart.VISUAL_ID:
			return DomainConnection_4001;
		}
		return null;
	}

}
