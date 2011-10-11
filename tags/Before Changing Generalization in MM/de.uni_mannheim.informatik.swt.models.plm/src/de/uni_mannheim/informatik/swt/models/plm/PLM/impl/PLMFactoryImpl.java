package de.uni_mannheim.informatik.swt.models.plm.PLM.impl;


import de.uni_mannheim.informatik.swt.models.plm.PLM.*;
import java.util.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PLMFactoryImpl extends EFactoryImpl implements PLMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PLMFactory init() {
		try {
			PLMFactory thePLMFactory = (PLMFactory)EPackage.Registry.INSTANCE.getEFactory("http://swt.informatik.uni-mannheim.de/PLM"); 
			if (thePLMFactory != null) {
				return thePLMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PLMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PLMPackage.LML_MODEL: return createLMLModel();
			case PLMPackage.MODEL: return createModel();
			case PLMPackage.ONTOLOGY: return createOntology();
			case PLMPackage.EQUALITY: return createEquality();
			case PLMPackage.INVERSION: return createInversion();
			case PLMPackage.COMPLEMENT: return createComplement();
			case PLMPackage.GENERALIZATION: return createGeneralization();
			case PLMPackage.BINARY_GENERALIZATION: return createBinaryGeneralization();
			case PLMPackage.MULTIPLE_SPECIALIZATION: return createMultipleSpecialization();
			case PLMPackage.MULTIPLE_GENERALIZATION: return createMultipleGeneralization();
			case PLMPackage.CLASSIFICATION: return createClassification();
			case PLMPackage.CLABJECT: return createClabject();
			case PLMPackage.FEATURE: return createFeature();
			case PLMPackage.ENTITY: return createEntity();
			case PLMPackage.CONNECTION: return createConnection();
			case PLMPackage.VISUALIZER: return createVisualizer();
			case PLMPackage.ATTRIBUTE: return createAttribute();
			case PLMPackage.METHOD: return createMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PLMPackage.CLASSIFICATION_KIND:
				return createClassificationKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PLMPackage.CLASSIFICATION_KIND:
				return convertClassificationKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LMLModel createLMLModel() {
		LMLModelImpl lmlModel = new LMLModelImpl();
		return lmlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ontology createOntology() {
		OntologyImpl ontology = new OntologyImpl();
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equality createEquality() {
		EqualityImpl equality = new EqualityImpl();
		return equality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inversion createInversion() {
		InversionImpl inversion = new InversionImpl();
		return inversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complement createComplement() {
		ComplementImpl complement = new ComplementImpl();
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryGeneralization createBinaryGeneralization() {
		BinaryGeneralizationImpl binaryGeneralization = new BinaryGeneralizationImpl();
		return binaryGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSpecialization createMultipleSpecialization() {
		MultipleSpecializationImpl multipleSpecialization = new MultipleSpecializationImpl();
		return multipleSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleGeneralization createMultipleGeneralization() {
		MultipleGeneralizationImpl multipleGeneralization = new MultipleGeneralizationImpl();
		return multipleGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification createClassification() {
		ClassificationImpl classification = new ClassificationImpl();
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clabject createClabject() {
		ClabjectImpl clabject = new ClabjectImpl();
		return clabject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualizer createVisualizer() {
		VisualizerImpl visualizer = new VisualizerImpl();
		return visualizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationKind createClassificationKindFromString(EDataType eDataType, String initialValue) {
		ClassificationKind result = ClassificationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassificationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLMPackage getPLMPackage() {
		return (PLMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PLMPackage getPackage() {
		return PLMPackage.eINSTANCE;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
		public void dressInstanceFromType(Clabject type, Clabject instance) {
			if (!type.isInstantiable())
			throw new RuntimeException("Not instantiable clabject cannot be instantiated!");
			else if (type.getPotency() == 0)
				throw new RuntimeException("Cannot create instance of type with potency 0.");
			
			instance.setLevel(type.getLevel() + 1);
			instance.setElided(type.isElided());
			instance.setExpressed(type.isExpressed());
			instance.setOrigin(type.getOrigin());
			
			//Quick hack to get a visualizer from type in
			instance.getVisualizer().clear();
			instance.getVisualizer().add(EcoreUtil.copy(type.getVisualizer().get(0)));
			
			int newPotency = -1;
			
			if (type.getPotency() == -1)
				newPotency = -1;
			else if (type.getPotency() > 0)
				newPotency = type.getPotency() - 1;
			
			instance.setPotency(newPotency);
			instance.setRelevant(type.isRelevant());
			instance.setVisualizersShown(type.getVisualizersShown());
			
			List<Feature> features = new LinkedList<Feature>();
			
			for (Feature f : type.getAllFeatures()) {
				if (f.getDurability() == 0)
					continue;
				
				Feature newFeature = f instanceof Attribute? createAttribute((Attribute) f): createMethod((Method) f);
				
				features.add(newFeature);
			}
			instance.getFeature().addAll(features);
			
			Classification i = PLMFactoryImpl.eINSTANCE.createClassification();
			i.setType(type);
			i.setInstance(instance);
			((Model)instance.eContainer()).getContent().add(i);
		}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
		public Attribute createAttribute(Attribute type) {
			Attribute result = PLMFactoryImpl.eINSTANCE.createAttribute();
		
			int newDurability = -1;
			if (type.getDurability() == -1)
				newDurability = -1;
			else if (type.getDurability() > 0)
				newDurability = type.getDurability() - 1;
			
			result.setDurability(newDurability);
			result.setElided(type.isElided());
			result.setExpressed(type.isExpressed());
			result.setName(type.getName());
			result.setRelevant(type.isRelevant());
			
			//Quick hack to get a visualizer from type in
			result.getVisualizer().add(EcoreUtil.copy(type.getVisualizer().get(0)));
			
			result.setDatatype(type.getDatatype());
			int newMutability = -1;
			if (type.getMutability() == -1)
				newMutability = -1;
			else 
				newMutability = java.lang.Math.max(0, (type.getMutability() - 1));
			result.setValue(type.getValue());
			result.setMutability(newMutability);
			
			return result;
		}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
		public Method createMethod(Method type) {
			Method result = PLMFactoryImpl.eINSTANCE.createMethod();
		
			int newDurability = -1;
			if (type.getDurability() == -1)
				newDurability = -1;
			else if (type.getDurability() > 0)
				newDurability = type.getDurability() - 1;
			
			result.setDurability(newDurability);
			result.setElided(type.isElided());
			result.setExpressed(type.isExpressed());
			result.setName(type.getName());
			result.setRelevant(type.isRelevant());
			
			//Quick hack to get a visualizer from type in
			result.getVisualizer().add(EcoreUtil.copy(type.getVisualizer().get(0)));
			
			return result;
		}
	
} //PLMFactoryImpl