/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;





import de.uni_mannheim.informatik.swt.models.plm.PLM.*;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReasoningResultFactoryImpl extends EFactoryImpl implements ReasoningResultFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReasoningResultFactory init() {
		try {
			ReasoningResultFactory theReasoningResultFactory = (ReasoningResultFactory)EPackage.Registry.INSTANCE.getEFactory("http://swt.informatik.uni-mannheim.de/ReasoningResult"); 
			if (theReasoningResultFactory != null) {
				return theReasoningResultFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReasoningResultFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningResultFactoryImpl() {
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
			case ReasoningResultPackage.REASONING_RESULT_MODEL: return createReasoningResultModel();
			case ReasoningResultPackage.COMPOSITE_CHECK: return createCompositeCheck();
			case ReasoningResultPackage.NAME_COMPARISON: return createNameComparison();
			case ReasoningResultPackage.DURABILITY_COMPARISON: return createDurabilityComparison();
			case ReasoningResultPackage.MUTABILITY_COMPARISON: return createMutabilityComparison();
			case ReasoningResultPackage.DATATYPE_COMPARISON: return createDatatypeComparison();
			case ReasoningResultPackage.ALL_CONNECTIONS_CHECK: return createAllConnectionsCheck();
			case ReasoningResultPackage.TYPE_CONNECTION_SEARCH: return createTypeConnectionSearch();
			case ReasoningResultPackage.EXPRESSED_INSTANCE_EXCLUDED_CHECK: return createExpressedInstanceExcludedCheck();
			case ReasoningResultPackage.MULTIPLICITY_CHECK: return createMultiplicityCheck();
			case ReasoningResultPackage.MULTIPLICITY_ROLE_NAME_CHECK: return createMultiplicityRoleNameCheck();
			case ReasoningResultPackage.ROLE_NAME_PROPERTY_CONFORMANCE_CHECK: return createRoleNamePropertyConformanceCheck();
			case ReasoningResultPackage.ROLE_NAME_LOCAL_CONFORMANCE_CHECK: return createRoleNameLocalConformanceCheck();
			case ReasoningResultPackage.CONNECTIONS_LOCAL_CONFORMANCE_CHECK: return createConnectionsLocalConformanceCheck();
			case ReasoningResultPackage.LOCAL_CONFORMANCE_CHECK: return createLocalConformanceCheck();
			case ReasoningResultPackage.TYPE_FEATURE_CHECK: return createTypeFeatureCheck();
			case ReasoningResultPackage.FEATURE_SEARCH_CHECK: return createFeatureSearchCheck();
			case ReasoningResultPackage.FEATURE_CONFORMANCE_CHECK: return createFeatureConformanceCheck();
			case ReasoningResultPackage.LEVEL_COMPARISON: return createLevelComparison();
			case ReasoningResultPackage.VALUE_COMPARISON: return createValueComparison();
			case ReasoningResultPackage.HAS_ADDITIONAL_PROPERTIES_CHECK: return createHasAdditionalPropertiesCheck();
			case ReasoningResultPackage.POTENCY_COMPARISON: return createPotencyComparison();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningResultModel createReasoningResultModel() {
		ReasoningResultModelImpl reasoningResultModel = new ReasoningResultModelImpl();
		return reasoningResultModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCheck createCompositeCheck() {
		CompositeCheckImpl compositeCheck = new CompositeCheckImpl();
		return compositeCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameComparison createNameComparison() {
		NameComparisonImpl nameComparison = new NameComparisonImpl();
		return nameComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurabilityComparison createDurabilityComparison() {
		DurabilityComparisonImpl durabilityComparison = new DurabilityComparisonImpl();
		return durabilityComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutabilityComparison createMutabilityComparison() {
		MutabilityComparisonImpl mutabilityComparison = new MutabilityComparisonImpl();
		return mutabilityComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeComparison createDatatypeComparison() {
		DatatypeComparisonImpl datatypeComparison = new DatatypeComparisonImpl();
		return datatypeComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllConnectionsCheck createAllConnectionsCheck() {
		AllConnectionsCheckImpl allConnectionsCheck = new AllConnectionsCheckImpl();
		return allConnectionsCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConnectionSearch createTypeConnectionSearch() {
		TypeConnectionSearchImpl typeConnectionSearch = new TypeConnectionSearchImpl();
		return typeConnectionSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressedInstanceExcludedCheck createExpressedInstanceExcludedCheck() {
		ExpressedInstanceExcludedCheckImpl expressedInstanceExcludedCheck = new ExpressedInstanceExcludedCheckImpl();
		return expressedInstanceExcludedCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityCheck createMultiplicityCheck() {
		MultiplicityCheckImpl multiplicityCheck = new MultiplicityCheckImpl();
		return multiplicityCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityRoleNameCheck createMultiplicityRoleNameCheck() {
		MultiplicityRoleNameCheckImpl multiplicityRoleNameCheck = new MultiplicityRoleNameCheckImpl();
		return multiplicityRoleNameCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNamePropertyConformanceCheck createRoleNamePropertyConformanceCheck() {
		RoleNamePropertyConformanceCheckImpl roleNamePropertyConformanceCheck = new RoleNamePropertyConformanceCheckImpl();
		return roleNamePropertyConformanceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNameLocalConformanceCheck createRoleNameLocalConformanceCheck() {
		RoleNameLocalConformanceCheckImpl roleNameLocalConformanceCheck = new RoleNameLocalConformanceCheckImpl();
		return roleNameLocalConformanceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionsLocalConformanceCheck createConnectionsLocalConformanceCheck() {
		ConnectionsLocalConformanceCheckImpl connectionsLocalConformanceCheck = new ConnectionsLocalConformanceCheckImpl();
		return connectionsLocalConformanceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalConformanceCheck createLocalConformanceCheck() {
		LocalConformanceCheckImpl localConformanceCheck = new LocalConformanceCheckImpl();
		return localConformanceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFeatureCheck createTypeFeatureCheck() {
		TypeFeatureCheckImpl typeFeatureCheck = new TypeFeatureCheckImpl();
		return typeFeatureCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSearchCheck createFeatureSearchCheck() {
		FeatureSearchCheckImpl featureSearchCheck = new FeatureSearchCheckImpl();
		return featureSearchCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConformanceCheck createFeatureConformanceCheck() {
		FeatureConformanceCheckImpl featureConformanceCheck = new FeatureConformanceCheckImpl();
		return featureConformanceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelComparison createLevelComparison() {
		LevelComparisonImpl levelComparison = new LevelComparisonImpl();
		return levelComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueComparison createValueComparison() {
		ValueComparisonImpl valueComparison = new ValueComparisonImpl();
		return valueComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasAdditionalPropertiesCheck createHasAdditionalPropertiesCheck() {
		HasAdditionalPropertiesCheckImpl hasAdditionalPropertiesCheck = new HasAdditionalPropertiesCheckImpl();
		return hasAdditionalPropertiesCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotencyComparison createPotencyComparison() {
		PotencyComparisonImpl potencyComparison = new PotencyComparisonImpl();
		return potencyComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningResultPackage getReasoningResultPackage() {
		return (ReasoningResultPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReasoningResultPackage getPackage() {
		return ReasoningResultPackage.eINSTANCE;
	}

	
	  
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public ReasoningResultModel createReasoningResultModel(String name) {
	    
			ReasoningResultModelImpl reasoningResultModel = new ReasoningResultModelImpl();
	    
	    	
	    	//Set the values
	    
			reasoningResultModel.setName(name);
			
			
			return reasoningResultModel;
		}
	  
	
	
	  
	
	  
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public CompositeCheck createCompositeCheck(Element source, Element target, CompositeCheck parent) {
	    
			CompositeCheckImpl compositeCheck = new CompositeCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "CompositeCheck" + "(" + target.getName()+ ")";
				compositeCheck.setExpression(exprValue);
			
			compositeCheck.setSource(source);
			
			compositeCheck.setTarget(target);
			
				exprValue ="CompositeCheck";
				compositeCheck.setName(exprValue);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(compositeCheck);
	    	
			return compositeCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public NameComparison createNameComparison(Feature source, Feature target, CompositeCheck parent) {
	    
			NameComparisonImpl nameComparison = new NameComparisonImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "NameComparison" + "(" + target.getName()+ ")";
				nameComparison.setExpression(exprValue);
			
			nameComparison.setSource(source);
			
			nameComparison.setTarget(target);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(nameComparison);
	    	
			return nameComparison;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public DurabilityComparison createDurabilityComparison(Feature source, Feature target, CompositeCheck parent) {
	    
			DurabilityComparisonImpl durabilityComparison = new DurabilityComparisonImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "DurabilityComparison" + "(" + target.getName()+ ")";
				durabilityComparison.setExpression(exprValue);
			
			durabilityComparison.setSource(source);
			
			durabilityComparison.setTarget(target);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(durabilityComparison);
	    	
			return durabilityComparison;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public MutabilityComparison createMutabilityComparison(Attribute source, Attribute target, CompositeCheck parent) {
	    
			MutabilityComparisonImpl mutabilityComparison = new MutabilityComparisonImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "MutabilityComparison" + "(" + target.getName()+ ")";
				mutabilityComparison.setExpression(exprValue);
			
			mutabilityComparison.setSource(source);
			
			mutabilityComparison.setTarget(target);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(mutabilityComparison);
	    	
			return mutabilityComparison;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public DatatypeComparison createDatatypeComparison(Attribute source, Attribute target, CompositeCheck parent) {
	    
			DatatypeComparisonImpl datatypeComparison = new DatatypeComparisonImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "DatatypeComparison" + "(" + target.getName()+ ")";
				datatypeComparison.setExpression(exprValue);
			
			datatypeComparison.setSource(source);
			
			datatypeComparison.setTarget(target);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(datatypeComparison);
	    	
			return datatypeComparison;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public AllConnectionsCheck createAllConnectionsCheck(Element source, Element target, CompositeCheck parent) {
	    
			AllConnectionsCheckImpl allConnectionsCheck = new AllConnectionsCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "AllConnectionsCheck" + "(" + target.getName()+ ")";
				allConnectionsCheck.setExpression(exprValue);
			
			allConnectionsCheck.setSource(source);
			
			allConnectionsCheck.setTarget(target);
			
				exprValue ="AllConnectionsCheck";
				allConnectionsCheck.setName(exprValue);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(allConnectionsCheck);
	    	
			return allConnectionsCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public TypeConnectionSearch createTypeConnectionSearch(Element source, Element target, Connection typeConnection, CompositeCheck parent) {
	    
			TypeConnectionSearchImpl typeConnectionSearch = new TypeConnectionSearchImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "TypeConnectionSearch" + "(" + target.getName()+ ")";
				typeConnectionSearch.setExpression(exprValue);
			
			typeConnectionSearch.setSource(source);
			
			typeConnectionSearch.setTarget(target);
			
				exprValue ="TypeConnectionSearch";
				typeConnectionSearch.setName(exprValue);
			
			typeConnectionSearch.setTypeConnection(typeConnection);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(typeConnectionSearch);
	    	
			return typeConnectionSearch;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public ExpressedInstanceExcludedCheck createExpressedInstanceExcludedCheck(Element source, Element target, CompositeCheck parent) {
	    
			ExpressedInstanceExcludedCheckImpl expressedInstanceExcludedCheck = new ExpressedInstanceExcludedCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "ExpressedInstanceExcludedCheck" + "(" + target.getName()+ ")";
				expressedInstanceExcludedCheck.setExpression(exprValue);
			
			expressedInstanceExcludedCheck.setSource(source);
			
			expressedInstanceExcludedCheck.setTarget(target);
			
				exprValue ="ExpressedInstanceExcludedCheck";
				expressedInstanceExcludedCheck.setName(exprValue);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(expressedInstanceExcludedCheck);
	    	
			return expressedInstanceExcludedCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public MultiplicityCheck createMultiplicityCheck(Element source, Element target, CompositeCheck parent) {
	    
			MultiplicityCheckImpl multiplicityCheck = new MultiplicityCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "MultiplicityCheck" + "(" + target.getName()+ ")";
				multiplicityCheck.setExpression(exprValue);
			
			multiplicityCheck.setSource(source);
			
			multiplicityCheck.setTarget(target);
			
				exprValue ="MultiplicityCheck";
				multiplicityCheck.setName(exprValue);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(multiplicityCheck);
	    	
			return multiplicityCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public MultiplicityRoleNameCheck createMultiplicityRoleNameCheck(Element source, Element target, String roleName, CompositeCheck parent) {
	    
			MultiplicityRoleNameCheckImpl multiplicityRoleNameCheck = new MultiplicityRoleNameCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "MultiplicityRoleNameCheck" + "(" + target.getName()+ ")";
				multiplicityRoleNameCheck.setExpression(exprValue);
			
			multiplicityRoleNameCheck.setSource(source);
			
			multiplicityRoleNameCheck.setTarget(target);
			
				exprValue ="MultiplicityRoleNameCheck";
				multiplicityRoleNameCheck.setName(exprValue);
			
			multiplicityRoleNameCheck.setRoleName(roleName);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(multiplicityRoleNameCheck);
	    	
			return multiplicityRoleNameCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public RoleNamePropertyConformanceCheck createRoleNamePropertyConformanceCheck(Element source, Element target, Clabject typeParticipant, Clabject instanceParticipant, CompositeCheck parent) {
	    
			RoleNamePropertyConformanceCheckImpl roleNamePropertyConformanceCheck = new RoleNamePropertyConformanceCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "RoleNamePropertyConformanceCheck" + "(" + target.getName()+ ")";
				roleNamePropertyConformanceCheck.setExpression(exprValue);
			
			roleNamePropertyConformanceCheck.setSource(source);
			
			roleNamePropertyConformanceCheck.setTarget(target);
			
				exprValue ="RoleNamePropertyConformanceCheck";
				roleNamePropertyConformanceCheck.setName(exprValue);
			
			roleNamePropertyConformanceCheck.setTypeParticipant(typeParticipant);
			
			roleNamePropertyConformanceCheck.setInstanceParticipant(instanceParticipant);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(roleNamePropertyConformanceCheck);
	    	
			return roleNamePropertyConformanceCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public RoleNameLocalConformanceCheck createRoleNameLocalConformanceCheck(Element source, Element target, CompositeCheck parent) {
	    
			RoleNameLocalConformanceCheckImpl roleNameLocalConformanceCheck = new RoleNameLocalConformanceCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "RoleNameLocalConformanceCheck" + "(" + target.getName()+ ")";
				roleNameLocalConformanceCheck.setExpression(exprValue);
			
			roleNameLocalConformanceCheck.setSource(source);
			
			roleNameLocalConformanceCheck.setTarget(target);
			
				exprValue ="RoleNameLocalConformanceCheck";
				roleNameLocalConformanceCheck.setName(exprValue);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(roleNameLocalConformanceCheck);
	    	
			return roleNameLocalConformanceCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public ConnectionsLocalConformanceCheck createConnectionsLocalConformanceCheck(Element source, Element target, CompositeCheck parent) {
	    
			ConnectionsLocalConformanceCheckImpl connectionsLocalConformanceCheck = new ConnectionsLocalConformanceCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "ConnectionsLocalConformanceCheck" + "(" + target.getName()+ ")";
				connectionsLocalConformanceCheck.setExpression(exprValue);
			
			connectionsLocalConformanceCheck.setSource(source);
			
			connectionsLocalConformanceCheck.setTarget(target);
			
				exprValue ="ConnectionsLocalConformanceCheck";
				connectionsLocalConformanceCheck.setName(exprValue);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(connectionsLocalConformanceCheck);
	    	
			return connectionsLocalConformanceCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public LocalConformanceCheck createLocalConformanceCheck(Element source, Element target, CompositeCheck parent) {
	    
			LocalConformanceCheckImpl localConformanceCheck = new LocalConformanceCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "LocalConformanceCheck" + "(" + target.getName()+ ")";
				localConformanceCheck.setExpression(exprValue);
			
			localConformanceCheck.setSource(source);
			
			localConformanceCheck.setTarget(target);
			
				exprValue ="LocalConformanceCheck";
				localConformanceCheck.setName(exprValue);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(localConformanceCheck);
	    	
			return localConformanceCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public TypeFeatureCheck createTypeFeatureCheck(Element source, Element target, CompositeCheck parent) {
	    
			TypeFeatureCheckImpl typeFeatureCheck = new TypeFeatureCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "TypeFeatureCheck" + "(" + target.getName()+ ")";
				typeFeatureCheck.setExpression(exprValue);
			
			typeFeatureCheck.setSource(source);
			
			typeFeatureCheck.setTarget(target);
			
				exprValue ="TypeFeatureCheck";
				typeFeatureCheck.setName(exprValue);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(typeFeatureCheck);
	    	
			return typeFeatureCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public FeatureSearchCheck createFeatureSearchCheck(Element source, Element target, Feature typeFeature, CompositeCheck parent) {
	    
			FeatureSearchCheckImpl featureSearchCheck = new FeatureSearchCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "FeatureSearchCheck" + "(" + target.getName()+ ")";
				featureSearchCheck.setExpression(exprValue);
			
			featureSearchCheck.setSource(source);
			
			featureSearchCheck.setTarget(target);
			
				exprValue ="FeatureSearchCheck";
				featureSearchCheck.setName(exprValue);
			
			featureSearchCheck.setTypeFeature(typeFeature);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(featureSearchCheck);
	    	
			return featureSearchCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public FeatureConformanceCheck createFeatureConformanceCheck(Element source, Element target, CompositeCheck parent) {
	    
			FeatureConformanceCheckImpl featureConformanceCheck = new FeatureConformanceCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "FeatureConformanceCheck" + "(" + target.getName()+ ")";
				featureConformanceCheck.setExpression(exprValue);
			
			featureConformanceCheck.setSource(source);
			
			featureConformanceCheck.setTarget(target);
			
				exprValue ="FeatureConformanceCheck";
				featureConformanceCheck.setName(exprValue);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(featureConformanceCheck);
	    	
			return featureConformanceCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public LevelComparison createLevelComparison(Clabject source, Clabject target, CompositeCheck parent) {
	    
			LevelComparisonImpl levelComparison = new LevelComparisonImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "LevelComparison" + "(" + target.getName()+ ")";
				levelComparison.setExpression(exprValue);
			
			levelComparison.setSource(source);
			
			levelComparison.setTarget(target);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(levelComparison);
	    	
			return levelComparison;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public ValueComparison createValueComparison(Attribute source, Attribute target, CompositeCheck parent) {
	    
			ValueComparisonImpl valueComparison = new ValueComparisonImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "ValueComparison" + "(" + target.getName()+ ")";
				valueComparison.setExpression(exprValue);
			
			valueComparison.setSource(source);
			
			valueComparison.setTarget(target);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(valueComparison);
	    	
			return valueComparison;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public HasAdditionalPropertiesCheck createHasAdditionalPropertiesCheck(Element source, Element target, Element commonProperties, Element additionalProperties, CompositeCheck parent) {
	    
			HasAdditionalPropertiesCheckImpl hasAdditionalPropertiesCheck = new HasAdditionalPropertiesCheckImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "HasAdditionalPropertiesCheck" + "(" + target.getName()+ ")";
				hasAdditionalPropertiesCheck.setExpression(exprValue);
			
			hasAdditionalPropertiesCheck.setSource(source);
			
			hasAdditionalPropertiesCheck.setTarget(target);
			
				exprValue ="HasAdditionalPropertiesCheck";
				hasAdditionalPropertiesCheck.setName(exprValue);
			
			hasAdditionalPropertiesCheck.setCommonProperties(commonProperties);
			
			hasAdditionalPropertiesCheck.setAdditionalProperties(additionalProperties);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(hasAdditionalPropertiesCheck);
	    	
			return hasAdditionalPropertiesCheck;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		
		
		public PotencyComparison createPotencyComparison(Clabject source, Clabject target, CompositeCheck parent) {
	    
			PotencyComparisonImpl potencyComparison = new PotencyComparisonImpl();
	    
	    	
	    	//Set the values
	    
				String exprValue = source.getName() + "." + "PotencyComparison" + "(" + target.getName()+ ")";
				potencyComparison.setExpression(exprValue);
			
			potencyComparison.setSource(source);
			
			potencyComparison.setTarget(target);
			
		
			//Set the parent
			if (parent != null)
				parent.getCheck().add(potencyComparison);
	    	
			return potencyComparison;
		}
	  
	
	
} //ReasoningResultFactoryImpl
