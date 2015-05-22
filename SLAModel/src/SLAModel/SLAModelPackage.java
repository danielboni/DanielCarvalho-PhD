/**
 */
package SLAModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SLAModel.SLAModelFactory
 * @model kind="package"
 * @generated
 */
public interface SLAModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SLAModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urimodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prefixmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SLAModelPackage eINSTANCE = SLAModel.impl.SLAModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link SLAModel.impl.SLAImpl <em>SLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.SLAImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getSLA()
	 * @generated
	 */
	int SLA = 0;

	/**
	 * The feature id for the '<em><b>Obligations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__OBLIGATIONS = 0;

	/**
	 * The feature id for the '<em><b>Parties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__PARTIES = 1;

	/**
	 * The number of structural features of the '<em>SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.ObligationsImpl <em>Obligations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.ObligationsImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getObligations()
	 * @generated
	 */
	int OBLIGATIONS = 1;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATIONS__SLA = 0;

	/**
	 * The feature id for the '<em><b>Garantee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATIONS__GARANTEE = 1;

	/**
	 * The number of structural features of the '<em>Obligations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Obligations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.PartiesImpl <em>Parties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.PartiesImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getParties()
	 * @generated
	 */
	int PARTIES = 2;

	/**
	 * The feature id for the '<em><b>Serviceconsumer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIES__SERVICECONSUMER = 0;

	/**
	 * The feature id for the '<em><b>Serviceprovider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIES__SERVICEPROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIES__SLA = 2;

	/**
	 * The number of structural features of the '<em>Parties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.ServiceConsumerImpl <em>Service Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.ServiceConsumerImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getServiceConsumer()
	 * @generated
	 */
	int SERVICE_CONSUMER = 3;

	/**
	 * The feature id for the '<em><b>Parties</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSUMER__PARTIES = 0;

	/**
	 * The feature id for the '<em><b>Service Consumer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSUMER__SERVICE_CONSUMER_NAME = 1;

	/**
	 * The number of structural features of the '<em>Service Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSUMER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONSUMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.ServiceProviderImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getServiceProvider()
	 * @generated
	 */
	int SERVICE_PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>Parties</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__PARTIES = 0;

	/**
	 * The feature id for the '<em><b>Service Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER__SERVICE_PROVIDER_NAME = 1;

	/**
	 * The number of structural features of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.GaranteeImpl <em>Garantee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.GaranteeImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getGarantee()
	 * @generated
	 */
	int GARANTEE = 5;

	/**
	 * The feature id for the '<em><b>Obligations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARANTEE__OBLIGATIONS = 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARANTEE__METRIC = 1;

	/**
	 * The feature id for the '<em><b>Garantee Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARANTEE__GARANTEE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARANTEE__SERVICE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Garantee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARANTEE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Garantee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARANTEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.MetricImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 6;

	/**
	 * The feature id for the '<em><b>Garantee</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__GARANTEE = 0;

	/**
	 * The feature id for the '<em><b>Metric Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__METRIC_NAME = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__PREDICATE = 4;

	/**
	 * The feature id for the '<em><b>Metric ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__METRIC_ID = 5;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link SLAModel.SLA <em>SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLA</em>'.
	 * @see SLAModel.SLA
	 * @generated
	 */
	EClass getSLA();

	/**
	 * Returns the meta object for the containment reference list '{@link SLAModel.SLA#getObligations <em>Obligations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obligations</em>'.
	 * @see SLAModel.SLA#getObligations()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Obligations();

	/**
	 * Returns the meta object for the containment reference '{@link SLAModel.SLA#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parties</em>'.
	 * @see SLAModel.SLA#getParties()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Parties();

	/**
	 * Returns the meta object for class '{@link SLAModel.Obligations <em>Obligations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obligations</em>'.
	 * @see SLAModel.Obligations
	 * @generated
	 */
	EClass getObligations();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.Obligations#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sla</em>'.
	 * @see SLAModel.Obligations#getSla()
	 * @see #getObligations()
	 * @generated
	 */
	EReference getObligations_Sla();

	/**
	 * Returns the meta object for the containment reference list '{@link SLAModel.Obligations#getGarantee <em>Garantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Garantee</em>'.
	 * @see SLAModel.Obligations#getGarantee()
	 * @see #getObligations()
	 * @generated
	 */
	EReference getObligations_Garantee();

	/**
	 * Returns the meta object for class '{@link SLAModel.Parties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parties</em>'.
	 * @see SLAModel.Parties
	 * @generated
	 */
	EClass getParties();

	/**
	 * Returns the meta object for the containment reference '{@link SLAModel.Parties#getServiceconsumer <em>Serviceconsumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serviceconsumer</em>'.
	 * @see SLAModel.Parties#getServiceconsumer()
	 * @see #getParties()
	 * @generated
	 */
	EReference getParties_Serviceconsumer();

	/**
	 * Returns the meta object for the containment reference '{@link SLAModel.Parties#getServiceprovider <em>Serviceprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serviceprovider</em>'.
	 * @see SLAModel.Parties#getServiceprovider()
	 * @see #getParties()
	 * @generated
	 */
	EReference getParties_Serviceprovider();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.Parties#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sla</em>'.
	 * @see SLAModel.Parties#getSla()
	 * @see #getParties()
	 * @generated
	 */
	EReference getParties_Sla();

	/**
	 * Returns the meta object for class '{@link SLAModel.ServiceConsumer <em>Service Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Consumer</em>'.
	 * @see SLAModel.ServiceConsumer
	 * @generated
	 */
	EClass getServiceConsumer();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.ServiceConsumer#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parties</em>'.
	 * @see SLAModel.ServiceConsumer#getParties()
	 * @see #getServiceConsumer()
	 * @generated
	 */
	EReference getServiceConsumer_Parties();

	/**
	 * Returns the meta object for the attribute '{@link SLAModel.ServiceConsumer#getServiceConsumerName <em>Service Consumer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Consumer Name</em>'.
	 * @see SLAModel.ServiceConsumer#getServiceConsumerName()
	 * @see #getServiceConsumer()
	 * @generated
	 */
	EAttribute getServiceConsumer_ServiceConsumerName();

	/**
	 * Returns the meta object for class '{@link SLAModel.ServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Provider</em>'.
	 * @see SLAModel.ServiceProvider
	 * @generated
	 */
	EClass getServiceProvider();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.ServiceProvider#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parties</em>'.
	 * @see SLAModel.ServiceProvider#getParties()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EReference getServiceProvider_Parties();

	/**
	 * Returns the meta object for the attribute '{@link SLAModel.ServiceProvider#getServiceProviderName <em>Service Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Provider Name</em>'.
	 * @see SLAModel.ServiceProvider#getServiceProviderName()
	 * @see #getServiceProvider()
	 * @generated
	 */
	EAttribute getServiceProvider_ServiceProviderName();

	/**
	 * Returns the meta object for class '{@link SLAModel.Garantee <em>Garantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Garantee</em>'.
	 * @see SLAModel.Garantee
	 * @generated
	 */
	EClass getGarantee();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.Garantee#getObligations <em>Obligations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Obligations</em>'.
	 * @see SLAModel.Garantee#getObligations()
	 * @see #getGarantee()
	 * @generated
	 */
	EReference getGarantee_Obligations();

	/**
	 * Returns the meta object for the containment reference list '{@link SLAModel.Garantee#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric</em>'.
	 * @see SLAModel.Garantee#getMetric()
	 * @see #getGarantee()
	 * @generated
	 */
	EReference getGarantee_Metric();

	/**
	 * Returns the meta object for the attribute '{@link SLAModel.Garantee#getGaranteeName <em>Garantee Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Garantee Name</em>'.
	 * @see SLAModel.Garantee#getGaranteeName()
	 * @see #getGarantee()
	 * @generated
	 */
	EAttribute getGarantee_GaranteeName();

	/**
	 * Returns the meta object for the attribute '{@link SLAModel.Garantee#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see SLAModel.Garantee#getServiceName()
	 * @see #getGarantee()
	 * @generated
	 */
	EAttribute getGarantee_ServiceName();

	/**
	 * Returns the meta object for class '{@link SLAModel.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see SLAModel.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.Metric#getGarantee <em>Garantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Garantee</em>'.
	 * @see SLAModel.Metric#getGarantee()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Garantee();

	/**
	 * Returns the meta object for the attribute '{@link SLAModel.Metric#getMetricName <em>Metric Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric Name</em>'.
	 * @see SLAModel.Metric#getMetricName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_MetricName();

	/**
	 * Returns the meta object for the attribute '{@link SLAModel.Metric#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see SLAModel.Metric#getUnit()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Unit();

	/**
	 * Returns the meta object for the attribute '{@link SLAModel.Metric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SLAModel.Metric#getValue()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Value();

	/**
	 * Returns the meta object for the attribute '{@link SLAModel.Metric#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see SLAModel.Metric#getPredicate()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Predicate();

	/**
	 * Returns the meta object for the attribute '{@link SLAModel.Metric#getMetricID <em>Metric ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric ID</em>'.
	 * @see SLAModel.Metric#getMetricID()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_MetricID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SLAModelFactory getSLAModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SLAModel.impl.SLAImpl <em>SLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.SLAImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getSLA()
		 * @generated
		 */
		EClass SLA = eINSTANCE.getSLA();

		/**
		 * The meta object literal for the '<em><b>Obligations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__OBLIGATIONS = eINSTANCE.getSLA_Obligations();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__PARTIES = eINSTANCE.getSLA_Parties();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.ObligationsImpl <em>Obligations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.ObligationsImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getObligations()
		 * @generated
		 */
		EClass OBLIGATIONS = eINSTANCE.getObligations();

		/**
		 * The meta object literal for the '<em><b>Sla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBLIGATIONS__SLA = eINSTANCE.getObligations_Sla();

		/**
		 * The meta object literal for the '<em><b>Garantee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBLIGATIONS__GARANTEE = eINSTANCE.getObligations_Garantee();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.PartiesImpl <em>Parties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.PartiesImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getParties()
		 * @generated
		 */
		EClass PARTIES = eINSTANCE.getParties();

		/**
		 * The meta object literal for the '<em><b>Serviceconsumer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIES__SERVICECONSUMER = eINSTANCE.getParties_Serviceconsumer();

		/**
		 * The meta object literal for the '<em><b>Serviceprovider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIES__SERVICEPROVIDER = eINSTANCE.getParties_Serviceprovider();

		/**
		 * The meta object literal for the '<em><b>Sla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIES__SLA = eINSTANCE.getParties_Sla();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.ServiceConsumerImpl <em>Service Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.ServiceConsumerImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getServiceConsumer()
		 * @generated
		 */
		EClass SERVICE_CONSUMER = eINSTANCE.getServiceConsumer();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONSUMER__PARTIES = eINSTANCE.getServiceConsumer_Parties();

		/**
		 * The meta object literal for the '<em><b>Service Consumer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONSUMER__SERVICE_CONSUMER_NAME = eINSTANCE.getServiceConsumer_ServiceConsumerName();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.ServiceProviderImpl <em>Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.ServiceProviderImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getServiceProvider()
		 * @generated
		 */
		EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PROVIDER__PARTIES = eINSTANCE.getServiceProvider_Parties();

		/**
		 * The meta object literal for the '<em><b>Service Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PROVIDER__SERVICE_PROVIDER_NAME = eINSTANCE.getServiceProvider_ServiceProviderName();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.GaranteeImpl <em>Garantee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.GaranteeImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getGarantee()
		 * @generated
		 */
		EClass GARANTEE = eINSTANCE.getGarantee();

		/**
		 * The meta object literal for the '<em><b>Obligations</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GARANTEE__OBLIGATIONS = eINSTANCE.getGarantee_Obligations();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GARANTEE__METRIC = eINSTANCE.getGarantee_Metric();

		/**
		 * The meta object literal for the '<em><b>Garantee Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GARANTEE__GARANTEE_NAME = eINSTANCE.getGarantee_GaranteeName();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GARANTEE__SERVICE_NAME = eINSTANCE.getGarantee_ServiceName();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.MetricImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Garantee</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__GARANTEE = eINSTANCE.getMetric_Garantee();

		/**
		 * The meta object literal for the '<em><b>Metric Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__METRIC_NAME = eINSTANCE.getMetric_MetricName();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__UNIT = eINSTANCE.getMetric_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__VALUE = eINSTANCE.getMetric_Value();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__PREDICATE = eINSTANCE.getMetric_Predicate();

		/**
		 * The meta object literal for the '<em><b>Metric ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__METRIC_ID = eINSTANCE.getMetric_MetricID();

	}

} //SLAModelPackage
