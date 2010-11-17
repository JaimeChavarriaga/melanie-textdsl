package uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers;

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
	public static final IElementType Model_1000 = getElementType("uni-mannheim.informatik.swt.models.plm.diagram.Model_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PNode_2001 = getElementType("uni-mannheim.informatik.swt.models.plm.diagram.PNode_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PRelationship_2002 = getElementType("uni-mannheim.informatik.swt.models.plm.diagram.PRelationship_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PConnectorParticipants_4005 = getElementType("uni-mannheim.informatik.swt.models.plm.diagram.PConnectorParticipants_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PGeneralization_4001 = getElementType("uni-mannheim.informatik.swt.models.plm.diagram.PGeneralization_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PInstantiation_4003 = getElementType("uni-mannheim.informatik.swt.models.plm.diagram.PInstantiation_4003"); //$NON-NLS-1$

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
				return uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
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
					uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getModel());

			elements.put(
					PNode_2001,
					uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getPNode());

			elements.put(
					PRelationship_2002,
					uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getPRelationship());

			elements.put(
					PConnectorParticipants_4005,
					uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getPConnector_Participants());

			elements.put(
					PGeneralization_4001,
					uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getPGeneralization());

			elements.put(
					PInstantiation_4003,
					uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getPInstantiation());
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
			KNOWN_ELEMENT_TYPES.add(PNode_2001);
			KNOWN_ELEMENT_TYPES.add(PRelationship_2002);
			KNOWN_ELEMENT_TYPES.add(PConnectorParticipants_4005);
			KNOWN_ELEMENT_TYPES.add(PGeneralization_4001);
			KNOWN_ELEMENT_TYPES.add(PInstantiation_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return Model_1000;
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeEditPart.VISUAL_ID:
			return PNode_2001;
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipEditPart.VISUAL_ID:
			return PRelationship_2002;
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PConnectorParticipantsEditPart.VISUAL_ID:
			return PConnectorParticipants_4005;
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PGeneralizationEditPart.VISUAL_ID:
			return PGeneralization_4001;
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PInstantiationEditPart.VISUAL_ID:
			return PInstantiation_4003;
		}
		return null;
	}

}
