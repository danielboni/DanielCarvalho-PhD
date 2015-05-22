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
