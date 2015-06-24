/**
 */
package SLAModel.impl;

import SLAModel.*;

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
public class SLAModelFactoryImpl extends EFactoryImpl implements SLAModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SLAModelFactory init() {
		try {
			SLAModelFactory theSLAModelFactory = (SLAModelFactory)EPackage.Registry.INSTANCE.getEFactory(SLAModelPackage.eNS_URI);
			if (theSLAModelFactory != null) {
				return theSLAModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SLAModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLAModelFactoryImpl() {
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
			case SLAModelPackage.SLA: return createSLA();
			case SLAModelPackage.OBLIGATIONS: return createObligations();
			case SLAModelPackage.PARTIES: return createParties();
			case SLAModelPackage.SERVICE_CONSUMER: return createServiceConsumer();
			case SLAModelPackage.SERVICE_PROVIDER: return createServiceProvider();
			case SLAModelPackage.GARANTEE: return createGarantee();
			case SLAModelPackage.METRIC: return createMetric();
			case SLAModelPackage.INTEGRATION_SLA: return createIntegrationSLA();
			case SLAModelPackage.SERVICE_DEFINITION: return createServiceDefinition();
			case SLAModelPackage.QUERY: return createQuery();
			case SLAModelPackage.UNIT: return createUnit();
			case SLAModelPackage.SERVICE_COMPOSITION: return createServiceComposition();
			case SLAModelPackage.MATCHING_UNITS: return createMatchingUnits();
			case SLAModelPackage.MATCHING_METRICS: return createMatchingMetrics();
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
	public Obligations createObligations() {
		ObligationsImpl obligations = new ObligationsImpl();
		return obligations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parties createParties() {
		PartiesImpl parties = new PartiesImpl();
		return parties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConsumer createServiceConsumer() {
		ServiceConsumerImpl serviceConsumer = new ServiceConsumerImpl();
		return serviceConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProvider createServiceProvider() {
		ServiceProviderImpl serviceProvider = new ServiceProviderImpl();
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Garantee createGarantee() {
		GaranteeImpl garantee = new GaranteeImpl();
		return garantee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
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
	public ServiceDefinition createServiceDefinition() {
		ServiceDefinitionImpl serviceDefinition = new ServiceDefinitionImpl();
		return serviceDefinition;
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
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
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
	public MatchingUnits createMatchingUnits() {
		MatchingUnitsImpl matchingUnits = new MatchingUnitsImpl();
		return matchingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingMetrics createMatchingMetrics() {
		MatchingMetricsImpl matchingMetrics = new MatchingMetricsImpl();
		return matchingMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLAModelPackage getSLAModelPackage() {
		return (SLAModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SLAModelPackage getPackage() {
		return SLAModelPackage.eINSTANCE;
	}

} //SLAModelFactoryImpl
