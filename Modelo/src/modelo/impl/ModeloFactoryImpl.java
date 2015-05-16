/**
 */
package modelo.impl;

import modelo.*;

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
public class ModeloFactoryImpl extends EFactoryImpl implements ModeloFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModeloFactory init() {
		try {
			ModeloFactory theModeloFactory = (ModeloFactory)EPackage.Registry.INSTANCE.getEFactory(ModeloPackage.eNS_URI);
			if (theModeloFactory != null) {
				return theModeloFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModeloFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloFactoryImpl() {
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
			case ModeloPackage.SLA: return createSLA();
			case ModeloPackage.USER_SLA: return createUserSLA();
			case ModeloPackage.SERVICE_SLA: return createServiceSLA();
			case ModeloPackage.USER: return createUser();
			case ModeloPackage.CLOUD: return createCloud();
			case ModeloPackage.SERVICE: return createService();
			case ModeloPackage.PARTY: return createParty();
			case ModeloPackage.QUERY: return createQuery();
			case ModeloPackage.SERVICE_COMPOSITION: return createServiceComposition();
			case ModeloPackage.CONCEPTS: return createConcepts();
			case ModeloPackage.INTEGRATION_SLA: return createIntegrationSLA();
			case ModeloPackage.NEGOTIATION_RULES: return createNegotiationRules();
			case ModeloPackage.GUARANTY: return createGuaranty();
			case ModeloPackage.OBLIGATION: return createObligation();
			case ModeloPackage.SLA_PARAMETERS: return createSLAParameters();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLA createSLA() {
		SLAImpl sla = new SLAImpl();
		return sla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSLA createUserSLA() {
		UserSLAImpl userSLA = new UserSLAImpl();
		return userSLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSLA createServiceSLA() {
		ServiceSLAImpl serviceSLA = new ServiceSLAImpl();
		return serviceSLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud createCloud() {
		CloudImpl cloud = new CloudImpl();
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party createParty() {
		PartyImpl party = new PartyImpl();
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComposition createServiceComposition() {
		ServiceCompositionImpl serviceComposition = new ServiceCompositionImpl();
		return serviceComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concepts createConcepts() {
		ConceptsImpl concepts = new ConceptsImpl();
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationSLA createIntegrationSLA() {
		IntegrationSLAImpl integrationSLA = new IntegrationSLAImpl();
		return integrationSLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegotiationRules createNegotiationRules() {
		NegotiationRulesImpl negotiationRules = new NegotiationRulesImpl();
		return negotiationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guaranty createGuaranty() {
		GuarantyImpl guaranty = new GuarantyImpl();
		return guaranty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obligation createObligation() {
		ObligationImpl obligation = new ObligationImpl();
		return obligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLAParameters createSLAParameters() {
		SLAParametersImpl slaParameters = new SLAParametersImpl();
		return slaParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloPackage getModeloPackage() {
		return (ModeloPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModeloPackage getPackage() {
		return ModeloPackage.eINSTANCE;
	}

} //ModeloFactoryImpl
