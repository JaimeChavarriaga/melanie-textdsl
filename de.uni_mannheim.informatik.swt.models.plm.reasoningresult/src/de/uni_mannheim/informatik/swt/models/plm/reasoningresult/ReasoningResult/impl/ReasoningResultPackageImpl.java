/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl;

import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.AllConnectionsCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.Check;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ConnectionsLocalConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DatatypeComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.DurabilityComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ExpressedInstanceExcludedCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.FeatureSearchCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.HasAdditionalPropertiesCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LevelComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.LocalConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MultiplicityRoleNameCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.MutabilityComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.NameComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.PotencyComparison;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultFactory;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNameLocalConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.RoleNamePropertyConformanceCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeConnectionSearch;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.TypeFeatureCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ValueComparison;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReasoningResultPackageImpl extends EPackageImpl implements ReasoningResultPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasoningResultModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durabilityComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutabilityComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allConnectionsCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeConnectionSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressedInstanceExcludedCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityRoleNameCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleNamePropertyConformanceCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleNameLocalConformanceCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionsLocalConformanceCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localConformanceCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeFeatureCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSearchCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureConformanceCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasAdditionalPropertiesCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potencyComparisonEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReasoningResultPackageImpl() {
		super(eNS_URI, ReasoningResultFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ReasoningResultPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReasoningResultPackage init() {
		if (isInited) return (ReasoningResultPackage)EPackage.Registry.INSTANCE.getEPackage(ReasoningResultPackage.eNS_URI);

		// Obtain or create and register package
		ReasoningResultPackageImpl theReasoningResultPackage = (ReasoningResultPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReasoningResultPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReasoningResultPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PLMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReasoningResultPackage.createPackageContents();

		// Initialize created meta-data
		theReasoningResultPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReasoningResultPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReasoningResultPackage.eNS_URI, theReasoningResultPackage);
		return theReasoningResultPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasoningResultModel() {
		return reasoningResultModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReasoningResultModel_Check() {
		return (EReference)reasoningResultModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReasoningResultModel_Name() {
		return (EAttribute)reasoningResultModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheck() {
		return checkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_Result() {
		return (EAttribute)checkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheck_Expression() {
		return (EAttribute)checkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCheck() {
		return compositeCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCheck_Check() {
		return (EReference)compositeCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeCheck_Name() {
		return (EAttribute)compositeCheckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCheck_Source() {
		return (EReference)compositeCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCheck_Target() {
		return (EReference)compositeCheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameComparison() {
		return nameComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameComparison_Source() {
		return (EReference)nameComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameComparison_Target() {
		return (EReference)nameComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurabilityComparison() {
		return durabilityComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurabilityComparison_Source() {
		return (EReference)durabilityComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurabilityComparison_Target() {
		return (EReference)durabilityComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurabilityComparison_TypeDurability() {
		return (EAttribute)durabilityComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurabilityComparison_InstanceDurability() {
		return (EAttribute)durabilityComparisonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutabilityComparison() {
		return mutabilityComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutabilityComparison_Source() {
		return (EReference)mutabilityComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutabilityComparison_Target() {
		return (EReference)mutabilityComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutabilityComparison_TypeMutability() {
		return (EAttribute)mutabilityComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMutabilityComparison_InstanceMutability() {
		return (EAttribute)mutabilityComparisonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeComparison() {
		return datatypeComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeComparison_Source() {
		return (EReference)datatypeComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeComparison_Target() {
		return (EReference)datatypeComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllConnectionsCheck() {
		return allConnectionsCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllConnectionsCheck_NoTypeConnection() {
		return (EAttribute)allConnectionsCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeConnectionSearch() {
		return typeConnectionSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeConnectionSearch_TypeConnection() {
		return (EReference)typeConnectionSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeConnectionSearch_NoSearchedConnections() {
		return (EAttribute)typeConnectionSearchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressedInstanceExcludedCheck() {
		return expressedInstanceExcludedCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressedInstanceExcludedCheck_ExpressedTypes() {
		return (EReference)expressedInstanceExcludedCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressedInstanceExcludedCheck_AffectedTypes() {
		return (EReference)expressedInstanceExcludedCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressedInstanceExcludedCheck_DisjointSiblings() {
		return (EReference)expressedInstanceExcludedCheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressedInstanceExcludedCheck_AffectedDisjointIntersection() {
		return (EReference)expressedInstanceExcludedCheckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityCheck() {
		return multiplicityCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityCheck_NoOfDomainConnection() {
		return (EAttribute)multiplicityCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityRoleNameCheck() {
		return multiplicityRoleNameCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityRoleNameCheck_Lower() {
		return (EAttribute)multiplicityRoleNameCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityRoleNameCheck_Upper() {
		return (EAttribute)multiplicityRoleNameCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityRoleNameCheck_Counts() {
		return (EAttribute)multiplicityRoleNameCheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityRoleNameCheck_RoleName() {
		return (EAttribute)multiplicityRoleNameCheckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleNamePropertyConformanceCheck() {
		return roleNamePropertyConformanceCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleNamePropertyConformanceCheck_RoleName() {
		return (EAttribute)roleNamePropertyConformanceCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleNamePropertyConformanceCheck_TypeParticipant() {
		return (EReference)roleNamePropertyConformanceCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleNamePropertyConformanceCheck_InstanceParticipant() {
		return (EReference)roleNamePropertyConformanceCheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleNameLocalConformanceCheck() {
		return roleNameLocalConformanceCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleNameLocalConformanceCheck_RoleName() {
		return (EAttribute)roleNameLocalConformanceCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionsLocalConformanceCheck() {
		return connectionsLocalConformanceCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionsLocalConformanceCheck_NoTypeConnections() {
		return (EAttribute)connectionsLocalConformanceCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalConformanceCheck() {
		return localConformanceCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeFeatureCheck() {
		return typeFeatureCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeFeatureCheck_NoFeatures() {
		return (EAttribute)typeFeatureCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSearchCheck() {
		return featureSearchCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSearchCheck_NoFeatures() {
		return (EAttribute)featureSearchCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureSearchCheck_TypeFeature() {
		return (EReference)featureSearchCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureConformanceCheck() {
		return featureConformanceCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelComparison() {
		return levelComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLevelComparison_TargetLevel() {
		return (EAttribute)levelComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLevelComparison_InstanceLevel() {
		return (EAttribute)levelComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevelComparison_Source() {
		return (EReference)levelComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLevelComparison_Target() {
		return (EReference)levelComparisonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueComparison() {
		return valueComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueComparison_Source() {
		return (EReference)valueComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueComparison_Target() {
		return (EReference)valueComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasAdditionalPropertiesCheck() {
		return hasAdditionalPropertiesCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasAdditionalPropertiesCheck_CommonProperties() {
		return (EReference)hasAdditionalPropertiesCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasAdditionalPropertiesCheck_AdditionalProperties() {
		return (EReference)hasAdditionalPropertiesCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPotencyComparison() {
		return potencyComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPotencyComparison_TargetPotency() {
		return (EAttribute)potencyComparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPotencyComparison_InstancePotency() {
		return (EAttribute)potencyComparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPotencyComparison_Source() {
		return (EReference)potencyComparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPotencyComparison_Target() {
		return (EReference)potencyComparisonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningResultFactory getReasoningResultFactory() {
		return (ReasoningResultFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		reasoningResultModelEClass = createEClass(REASONING_RESULT_MODEL);
		createEReference(reasoningResultModelEClass, REASONING_RESULT_MODEL__CHECK);
		createEAttribute(reasoningResultModelEClass, REASONING_RESULT_MODEL__NAME);

		checkEClass = createEClass(CHECK);
		createEAttribute(checkEClass, CHECK__RESULT);
		createEAttribute(checkEClass, CHECK__EXPRESSION);

		compositeCheckEClass = createEClass(COMPOSITE_CHECK);
		createEReference(compositeCheckEClass, COMPOSITE_CHECK__CHECK);
		createEReference(compositeCheckEClass, COMPOSITE_CHECK__SOURCE);
		createEReference(compositeCheckEClass, COMPOSITE_CHECK__TARGET);
		createEAttribute(compositeCheckEClass, COMPOSITE_CHECK__NAME);

		nameComparisonEClass = createEClass(NAME_COMPARISON);
		createEReference(nameComparisonEClass, NAME_COMPARISON__SOURCE);
		createEReference(nameComparisonEClass, NAME_COMPARISON__TARGET);

		durabilityComparisonEClass = createEClass(DURABILITY_COMPARISON);
		createEReference(durabilityComparisonEClass, DURABILITY_COMPARISON__SOURCE);
		createEReference(durabilityComparisonEClass, DURABILITY_COMPARISON__TARGET);
		createEAttribute(durabilityComparisonEClass, DURABILITY_COMPARISON__TYPE_DURABILITY);
		createEAttribute(durabilityComparisonEClass, DURABILITY_COMPARISON__INSTANCE_DURABILITY);

		mutabilityComparisonEClass = createEClass(MUTABILITY_COMPARISON);
		createEReference(mutabilityComparisonEClass, MUTABILITY_COMPARISON__SOURCE);
		createEReference(mutabilityComparisonEClass, MUTABILITY_COMPARISON__TARGET);
		createEAttribute(mutabilityComparisonEClass, MUTABILITY_COMPARISON__TYPE_MUTABILITY);
		createEAttribute(mutabilityComparisonEClass, MUTABILITY_COMPARISON__INSTANCE_MUTABILITY);

		datatypeComparisonEClass = createEClass(DATATYPE_COMPARISON);
		createEReference(datatypeComparisonEClass, DATATYPE_COMPARISON__SOURCE);
		createEReference(datatypeComparisonEClass, DATATYPE_COMPARISON__TARGET);

		allConnectionsCheckEClass = createEClass(ALL_CONNECTIONS_CHECK);
		createEAttribute(allConnectionsCheckEClass, ALL_CONNECTIONS_CHECK__NO_TYPE_CONNECTION);

		typeConnectionSearchEClass = createEClass(TYPE_CONNECTION_SEARCH);
		createEReference(typeConnectionSearchEClass, TYPE_CONNECTION_SEARCH__TYPE_CONNECTION);
		createEAttribute(typeConnectionSearchEClass, TYPE_CONNECTION_SEARCH__NO_SEARCHED_CONNECTIONS);

		expressedInstanceExcludedCheckEClass = createEClass(EXPRESSED_INSTANCE_EXCLUDED_CHECK);
		createEReference(expressedInstanceExcludedCheckEClass, EXPRESSED_INSTANCE_EXCLUDED_CHECK__EXPRESSED_TYPES);
		createEReference(expressedInstanceExcludedCheckEClass, EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_TYPES);
		createEReference(expressedInstanceExcludedCheckEClass, EXPRESSED_INSTANCE_EXCLUDED_CHECK__DISJOINT_SIBLINGS);
		createEReference(expressedInstanceExcludedCheckEClass, EXPRESSED_INSTANCE_EXCLUDED_CHECK__AFFECTED_DISJOINT_INTERSECTION);

		multiplicityCheckEClass = createEClass(MULTIPLICITY_CHECK);
		createEAttribute(multiplicityCheckEClass, MULTIPLICITY_CHECK__NO_OF_DOMAIN_CONNECTION);

		multiplicityRoleNameCheckEClass = createEClass(MULTIPLICITY_ROLE_NAME_CHECK);
		createEAttribute(multiplicityRoleNameCheckEClass, MULTIPLICITY_ROLE_NAME_CHECK__LOWER);
		createEAttribute(multiplicityRoleNameCheckEClass, MULTIPLICITY_ROLE_NAME_CHECK__UPPER);
		createEAttribute(multiplicityRoleNameCheckEClass, MULTIPLICITY_ROLE_NAME_CHECK__COUNTS);
		createEAttribute(multiplicityRoleNameCheckEClass, MULTIPLICITY_ROLE_NAME_CHECK__ROLE_NAME);

		roleNamePropertyConformanceCheckEClass = createEClass(ROLE_NAME_PROPERTY_CONFORMANCE_CHECK);
		createEAttribute(roleNamePropertyConformanceCheckEClass, ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__ROLE_NAME);
		createEReference(roleNamePropertyConformanceCheckEClass, ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__TYPE_PARTICIPANT);
		createEReference(roleNamePropertyConformanceCheckEClass, ROLE_NAME_PROPERTY_CONFORMANCE_CHECK__INSTANCE_PARTICIPANT);

		roleNameLocalConformanceCheckEClass = createEClass(ROLE_NAME_LOCAL_CONFORMANCE_CHECK);
		createEAttribute(roleNameLocalConformanceCheckEClass, ROLE_NAME_LOCAL_CONFORMANCE_CHECK__ROLE_NAME);

		connectionsLocalConformanceCheckEClass = createEClass(CONNECTIONS_LOCAL_CONFORMANCE_CHECK);
		createEAttribute(connectionsLocalConformanceCheckEClass, CONNECTIONS_LOCAL_CONFORMANCE_CHECK__NO_TYPE_CONNECTIONS);

		localConformanceCheckEClass = createEClass(LOCAL_CONFORMANCE_CHECK);

		typeFeatureCheckEClass = createEClass(TYPE_FEATURE_CHECK);
		createEAttribute(typeFeatureCheckEClass, TYPE_FEATURE_CHECK__NO_FEATURES);

		featureSearchCheckEClass = createEClass(FEATURE_SEARCH_CHECK);
		createEAttribute(featureSearchCheckEClass, FEATURE_SEARCH_CHECK__NO_FEATURES);
		createEReference(featureSearchCheckEClass, FEATURE_SEARCH_CHECK__TYPE_FEATURE);

		featureConformanceCheckEClass = createEClass(FEATURE_CONFORMANCE_CHECK);

		levelComparisonEClass = createEClass(LEVEL_COMPARISON);
		createEAttribute(levelComparisonEClass, LEVEL_COMPARISON__TARGET_LEVEL);
		createEAttribute(levelComparisonEClass, LEVEL_COMPARISON__INSTANCE_LEVEL);
		createEReference(levelComparisonEClass, LEVEL_COMPARISON__SOURCE);
		createEReference(levelComparisonEClass, LEVEL_COMPARISON__TARGET);

		valueComparisonEClass = createEClass(VALUE_COMPARISON);
		createEReference(valueComparisonEClass, VALUE_COMPARISON__SOURCE);
		createEReference(valueComparisonEClass, VALUE_COMPARISON__TARGET);

		hasAdditionalPropertiesCheckEClass = createEClass(HAS_ADDITIONAL_PROPERTIES_CHECK);
		createEReference(hasAdditionalPropertiesCheckEClass, HAS_ADDITIONAL_PROPERTIES_CHECK__COMMON_PROPERTIES);
		createEReference(hasAdditionalPropertiesCheckEClass, HAS_ADDITIONAL_PROPERTIES_CHECK__ADDITIONAL_PROPERTIES);

		potencyComparisonEClass = createEClass(POTENCY_COMPARISON);
		createEAttribute(potencyComparisonEClass, POTENCY_COMPARISON__TARGET_POTENCY);
		createEAttribute(potencyComparisonEClass, POTENCY_COMPARISON__INSTANCE_POTENCY);
		createEReference(potencyComparisonEClass, POTENCY_COMPARISON__SOURCE);
		createEReference(potencyComparisonEClass, POTENCY_COMPARISON__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PLMPackage thePLMPackage = (PLMPackage)EPackage.Registry.INSTANCE.getEPackage(PLMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeCheckEClass.getESuperTypes().add(this.getCheck());
		nameComparisonEClass.getESuperTypes().add(this.getCheck());
		durabilityComparisonEClass.getESuperTypes().add(this.getCheck());
		mutabilityComparisonEClass.getESuperTypes().add(this.getCheck());
		datatypeComparisonEClass.getESuperTypes().add(this.getCheck());
		allConnectionsCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		typeConnectionSearchEClass.getESuperTypes().add(this.getCompositeCheck());
		expressedInstanceExcludedCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		multiplicityCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		multiplicityRoleNameCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		roleNamePropertyConformanceCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		roleNameLocalConformanceCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		connectionsLocalConformanceCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		localConformanceCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		typeFeatureCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		featureSearchCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		featureConformanceCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		levelComparisonEClass.getESuperTypes().add(this.getCheck());
		valueComparisonEClass.getESuperTypes().add(this.getCheck());
		hasAdditionalPropertiesCheckEClass.getESuperTypes().add(this.getCompositeCheck());
		potencyComparisonEClass.getESuperTypes().add(this.getCheck());

		// Initialize classes, features, and operations; add parameters
		initEClass(reasoningResultModelEClass, ReasoningResultModel.class, "ReasoningResultModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReasoningResultModel_Check(), this.getCheck(), null, "check", null, 0, -1, ReasoningResultModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReasoningResultModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReasoningResultModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkEClass, Check.class, "Check", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheck_Result(), ecorePackage.getEBoolean(), "result", "false", 1, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheck_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeCheckEClass, CompositeCheck.class, "CompositeCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeCheck_Check(), this.getCheck(), null, "check", null, 0, -1, CompositeCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeCheck_Source(), thePLMPackage.getElement(), null, "source", null, 1, 1, CompositeCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeCheck_Target(), thePLMPackage.getElement(), null, "target", null, 0, 1, CompositeCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeCheck_Name(), ecorePackage.getEString(), "name", null, 1, 1, CompositeCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameComparisonEClass, NameComparison.class, "NameComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameComparison_Source(), thePLMPackage.getFeature(), null, "source", null, 1, 1, NameComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameComparison_Target(), thePLMPackage.getFeature(), null, "target", null, 1, 1, NameComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durabilityComparisonEClass, DurabilityComparison.class, "DurabilityComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDurabilityComparison_Source(), thePLMPackage.getFeature(), null, "source", null, 1, 1, DurabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDurabilityComparison_Target(), thePLMPackage.getFeature(), null, "target", null, 1, 1, DurabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDurabilityComparison_TypeDurability(), ecorePackage.getEInt(), "typeDurability", null, 1, 1, DurabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDurabilityComparison_InstanceDurability(), ecorePackage.getEInt(), "instanceDurability", null, 1, 1, DurabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mutabilityComparisonEClass, MutabilityComparison.class, "MutabilityComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMutabilityComparison_Source(), thePLMPackage.getAttribute(), null, "source", null, 1, 1, MutabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutabilityComparison_Target(), thePLMPackage.getAttribute(), null, "target", null, 1, 1, MutabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMutabilityComparison_TypeMutability(), ecorePackage.getEInt(), "typeMutability", null, 1, 1, MutabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMutabilityComparison_InstanceMutability(), ecorePackage.getEInt(), "instanceMutability", null, 1, 1, MutabilityComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeComparisonEClass, DatatypeComparison.class, "DatatypeComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeComparison_Source(), thePLMPackage.getAttribute(), null, "source", null, 1, 1, DatatypeComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatatypeComparison_Target(), thePLMPackage.getAttribute(), null, "target", null, 1, 1, DatatypeComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allConnectionsCheckEClass, AllConnectionsCheck.class, "AllConnectionsCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllConnectionsCheck_NoTypeConnection(), ecorePackage.getEInt(), "noTypeConnection", "0", 1, 1, AllConnectionsCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeConnectionSearchEClass, TypeConnectionSearch.class, "TypeConnectionSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeConnectionSearch_TypeConnection(), thePLMPackage.getConnection(), null, "typeConnection", null, 1, 1, TypeConnectionSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeConnectionSearch_NoSearchedConnections(), ecorePackage.getEInt(), "noSearchedConnections", "0", 1, 1, TypeConnectionSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressedInstanceExcludedCheckEClass, ExpressedInstanceExcludedCheck.class, "ExpressedInstanceExcludedCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressedInstanceExcludedCheck_ExpressedTypes(), thePLMPackage.getClabject(), null, "expressedTypes", null, 0, -1, ExpressedInstanceExcludedCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressedInstanceExcludedCheck_AffectedTypes(), thePLMPackage.getClabject(), null, "affectedTypes", null, 0, -1, ExpressedInstanceExcludedCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressedInstanceExcludedCheck_DisjointSiblings(), thePLMPackage.getClabject(), null, "disjointSiblings", null, 0, -1, ExpressedInstanceExcludedCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressedInstanceExcludedCheck_AffectedDisjointIntersection(), thePLMPackage.getClabject(), null, "affectedDisjointIntersection", null, 0, -1, ExpressedInstanceExcludedCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityCheckEClass, MultiplicityCheck.class, "MultiplicityCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityCheck_NoOfDomainConnection(), ecorePackage.getEInt(), "noOfDomainConnection", "0", 1, 1, MultiplicityCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityRoleNameCheckEClass, MultiplicityRoleNameCheck.class, "MultiplicityRoleNameCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityRoleNameCheck_Lower(), ecorePackage.getEInt(), "lower", "0", 1, 1, MultiplicityRoleNameCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRoleNameCheck_Upper(), ecorePackage.getEInt(), "upper", "-1", 1, 1, MultiplicityRoleNameCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRoleNameCheck_Counts(), ecorePackage.getEInt(), "counts", null, 0, -1, MultiplicityRoleNameCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityRoleNameCheck_RoleName(), ecorePackage.getEString(), "roleName", null, 1, 1, MultiplicityRoleNameCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleNamePropertyConformanceCheckEClass, RoleNamePropertyConformanceCheck.class, "RoleNamePropertyConformanceCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleNamePropertyConformanceCheck_RoleName(), ecorePackage.getEString(), "roleName", "0", 1, 1, RoleNamePropertyConformanceCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleNamePropertyConformanceCheck_TypeParticipant(), thePLMPackage.getClabject(), null, "typeParticipant", null, 1, 1, RoleNamePropertyConformanceCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleNamePropertyConformanceCheck_InstanceParticipant(), thePLMPackage.getClabject(), null, "instanceParticipant", null, 1, 1, RoleNamePropertyConformanceCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleNameLocalConformanceCheckEClass, RoleNameLocalConformanceCheck.class, "RoleNameLocalConformanceCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleNameLocalConformanceCheck_RoleName(), ecorePackage.getEString(), "roleName", "0", 1, 1, RoleNameLocalConformanceCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionsLocalConformanceCheckEClass, ConnectionsLocalConformanceCheck.class, "ConnectionsLocalConformanceCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionsLocalConformanceCheck_NoTypeConnections(), ecorePackage.getEInt(), "noTypeConnections", "0", 1, 1, ConnectionsLocalConformanceCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localConformanceCheckEClass, LocalConformanceCheck.class, "LocalConformanceCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeFeatureCheckEClass, TypeFeatureCheck.class, "TypeFeatureCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeFeatureCheck_NoFeatures(), ecorePackage.getEInt(), "NoFeatures", "0", 1, 1, TypeFeatureCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSearchCheckEClass, FeatureSearchCheck.class, "FeatureSearchCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureSearchCheck_NoFeatures(), ecorePackage.getEInt(), "NoFeatures", "0", 1, 1, FeatureSearchCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureSearchCheck_TypeFeature(), thePLMPackage.getFeature(), null, "typeFeature", null, 1, 1, FeatureSearchCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureConformanceCheckEClass, FeatureConformanceCheck.class, "FeatureConformanceCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(levelComparisonEClass, LevelComparison.class, "LevelComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevelComparison_TargetLevel(), ecorePackage.getEInt(), "targetLevel", null, 1, 1, LevelComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLevelComparison_InstanceLevel(), ecorePackage.getEInt(), "instanceLevel", null, 1, 1, LevelComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevelComparison_Source(), thePLMPackage.getClabject(), null, "source", null, 1, 1, LevelComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevelComparison_Target(), thePLMPackage.getClabject(), null, "target", null, 0, 1, LevelComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueComparisonEClass, ValueComparison.class, "ValueComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueComparison_Source(), thePLMPackage.getAttribute(), null, "source", null, 1, 1, ValueComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueComparison_Target(), thePLMPackage.getAttribute(), null, "target", null, 1, 1, ValueComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasAdditionalPropertiesCheckEClass, HasAdditionalPropertiesCheck.class, "HasAdditionalPropertiesCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasAdditionalPropertiesCheck_CommonProperties(), thePLMPackage.getElement(), null, "commonProperties", null, 0, 1, HasAdditionalPropertiesCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHasAdditionalPropertiesCheck_AdditionalProperties(), thePLMPackage.getElement(), null, "additionalProperties", null, 0, 1, HasAdditionalPropertiesCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(potencyComparisonEClass, PotencyComparison.class, "PotencyComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPotencyComparison_TargetPotency(), ecorePackage.getEInt(), "targetPotency", null, 1, 1, PotencyComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPotencyComparison_InstancePotency(), ecorePackage.getEInt(), "instancePotency", null, 1, 1, PotencyComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPotencyComparison_Source(), thePLMPackage.getClabject(), null, "source", null, 1, 1, PotencyComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPotencyComparison_Target(), thePLMPackage.getClabject(), null, "target", null, 0, 1, PotencyComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ReasoningResultPackageImpl
