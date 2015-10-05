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
	 * The feature id for the '<em><b>Servicedefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__SERVICEDEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Integration SLA</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__INTEGRATION_SLA = 3;

	/**
	 * The number of structural features of the '<em>SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Servicedefinition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARANTEE__SERVICEDEFINITION = 4;

	/**
	 * The number of structural features of the '<em>Garantee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARANTEE_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__PREDICATE = 3;

	/**
	 * The feature id for the '<em><b>Metric ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__METRIC_ID = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__UNIT = 5;

	/**
	 * The feature id for the '<em><b>Matchingmetrics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__MATCHINGMETRICS = 6;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link SLAModel.impl.IntegrationSLAImpl <em>Integration SLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.IntegrationSLAImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getIntegrationSLA()
	 * @generated
	 */
	int INTEGRATION_SLA = 7;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SLA__QUERY = 0;

	/**
	 * The feature id for the '<em><b>Service Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SLA__SERVICE_COMPOSITION = 1;

	/**
	 * The feature id for the '<em><b>Slas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SLA__SLAS = 2;

	/**
	 * The number of structural features of the '<em>Integration SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SLA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Integration SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.ServiceDefinitionImpl <em>Service Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.ServiceDefinitionImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getServiceDefinition()
	 * @generated
	 */
	int SERVICE_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__SLA = 0;

	/**
	 * The feature id for the '<em><b>Garantee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__GARANTEE = 1;

	/**
	 * The feature id for the '<em><b>Service Composition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION__SERVICE_COMPOSITION = 2;

	/**
	 * The number of structural features of the '<em>Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.QueryImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 9;

	/**
	 * The feature id for the '<em><b>Servicecomposition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SERVICECOMPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Integrationsla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__INTEGRATIONSLA = 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.UnitImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 10;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__METRIC = 0;

	/**
	 * The feature id for the '<em><b>Matchingunits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__MATCHINGUNITS = 1;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.ServiceCompositionImpl <em>Service Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.ServiceCompositionImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getServiceComposition()
	 * @generated
	 */
	int SERVICE_COMPOSITION = 11;

	/**
	 * The feature id for the '<em><b>Query</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION__QUERY = 0;

	/**
	 * The feature id for the '<em><b>Integration SLA</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION__INTEGRATION_SLA = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION__SERVICES = 2;

	/**
	 * The number of structural features of the '<em>Service Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.MatchingUnitsImpl <em>Matching Units</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.MatchingUnitsImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getMatchingUnits()
	 * @generated
	 */
	int MATCHING_UNITS = 12;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_UNITS__UNIT = 0;

	/**
	 * The number of structural features of the '<em>Matching Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_UNITS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Matching Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_UNITS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SLAModel.impl.MatchingMetricsImpl <em>Matching Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SLAModel.impl.MatchingMetricsImpl
	 * @see SLAModel.impl.SLAModelPackageImpl#getMatchingMetrics()
	 * @generated
	 */
	int MATCHING_METRICS = 13;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_METRICS__METRIC = 0;

	/**
	 * The number of structural features of the '<em>Matching Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_METRICS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Matching Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHING_METRICS_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link SLAModel.SLA#getServicedefinition <em>Servicedefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicedefinition</em>'.
	 * @see SLAModel.SLA#getServicedefinition()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Servicedefinition();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.SLA#getIntegrationSLA <em>Integration SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Integration SLA</em>'.
	 * @see SLAModel.SLA#getIntegrationSLA()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_IntegrationSLA();

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
	 * Returns the meta object for the reference list '{@link SLAModel.Garantee#getServicedefinition <em>Servicedefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Servicedefinition</em>'.
	 * @see SLAModel.Garantee#getServicedefinition()
	 * @see #getGarantee()
	 * @generated
	 */
	EReference getGarantee_Servicedefinition();

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
	 * Returns the meta object for the containment reference '{@link SLAModel.Metric#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see SLAModel.Metric#getUnit()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Unit();

	/**
	 * Returns the meta object for the reference '{@link SLAModel.Metric#getMatchingmetrics <em>Matchingmetrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matchingmetrics</em>'.
	 * @see SLAModel.Metric#getMatchingmetrics()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Matchingmetrics();

	/**
	 * Returns the meta object for class '{@link SLAModel.IntegrationSLA <em>Integration SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration SLA</em>'.
	 * @see SLAModel.IntegrationSLA
	 * @generated
	 */
	EClass getIntegrationSLA();

	/**
	 * Returns the meta object for the containment reference '{@link SLAModel.IntegrationSLA#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see SLAModel.IntegrationSLA#getQuery()
	 * @see #getIntegrationSLA()
	 * @generated
	 */
	EReference getIntegrationSLA_Query();

	/**
	 * Returns the meta object for the containment reference '{@link SLAModel.IntegrationSLA#getServiceComposition <em>Service Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Composition</em>'.
	 * @see SLAModel.IntegrationSLA#getServiceComposition()
	 * @see #getIntegrationSLA()
	 * @generated
	 */
	EReference getIntegrationSLA_ServiceComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link SLAModel.IntegrationSLA#getSlas <em>Slas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slas</em>'.
	 * @see SLAModel.IntegrationSLA#getSlas()
	 * @see #getIntegrationSLA()
	 * @generated
	 */
	EReference getIntegrationSLA_Slas();

	/**
	 * Returns the meta object for class '{@link SLAModel.ServiceDefinition <em>Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Definition</em>'.
	 * @see SLAModel.ServiceDefinition
	 * @generated
	 */
	EClass getServiceDefinition();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.ServiceDefinition#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sla</em>'.
	 * @see SLAModel.ServiceDefinition#getSla()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EReference getServiceDefinition_Sla();

	/**
	 * Returns the meta object for the reference '{@link SLAModel.ServiceDefinition#getGarantee <em>Garantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Garantee</em>'.
	 * @see SLAModel.ServiceDefinition#getGarantee()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EReference getServiceDefinition_Garantee();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.ServiceDefinition#getServiceComposition <em>Service Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service Composition</em>'.
	 * @see SLAModel.ServiceDefinition#getServiceComposition()
	 * @see #getServiceDefinition()
	 * @generated
	 */
	EReference getServiceDefinition_ServiceComposition();

	/**
	 * Returns the meta object for class '{@link SLAModel.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see SLAModel.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link SLAModel.Query#getServicecomposition <em>Servicecomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicecomposition</em>'.
	 * @see SLAModel.Query#getServicecomposition()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Servicecomposition();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.Query#getIntegrationsla <em>Integrationsla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Integrationsla</em>'.
	 * @see SLAModel.Query#getIntegrationsla()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Integrationsla();

	/**
	 * Returns the meta object for class '{@link SLAModel.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see SLAModel.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.Unit#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metric</em>'.
	 * @see SLAModel.Unit#getMetric()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Metric();

	/**
	 * Returns the meta object for the reference '{@link SLAModel.Unit#getMatchingunits <em>Matchingunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matchingunits</em>'.
	 * @see SLAModel.Unit#getMatchingunits()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Matchingunits();

	/**
	 * Returns the meta object for class '{@link SLAModel.ServiceComposition <em>Service Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Composition</em>'.
	 * @see SLAModel.ServiceComposition
	 * @generated
	 */
	EClass getServiceComposition();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.ServiceComposition#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Query</em>'.
	 * @see SLAModel.ServiceComposition#getQuery()
	 * @see #getServiceComposition()
	 * @generated
	 */
	EReference getServiceComposition_Query();

	/**
	 * Returns the meta object for the container reference '{@link SLAModel.ServiceComposition#getIntegrationSLA <em>Integration SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Integration SLA</em>'.
	 * @see SLAModel.ServiceComposition#getIntegrationSLA()
	 * @see #getServiceComposition()
	 * @generated
	 */
	EReference getServiceComposition_IntegrationSLA();

	/**
	 * Returns the meta object for the containment reference list '{@link SLAModel.ServiceComposition#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see SLAModel.ServiceComposition#getServices()
	 * @see #getServiceComposition()
	 * @generated
	 */
	EReference getServiceComposition_Services();

	/**
	 * Returns the meta object for class '{@link SLAModel.MatchingUnits <em>Matching Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Units</em>'.
	 * @see SLAModel.MatchingUnits
	 * @generated
	 */
	EClass getMatchingUnits();

	/**
	 * Returns the meta object for the reference list '{@link SLAModel.MatchingUnits#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unit</em>'.
	 * @see SLAModel.MatchingUnits#getUnit()
	 * @see #getMatchingUnits()
	 * @generated
	 */
	EReference getMatchingUnits_Unit();

	/**
	 * Returns the meta object for class '{@link SLAModel.MatchingMetrics <em>Matching Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matching Metrics</em>'.
	 * @see SLAModel.MatchingMetrics
	 * @generated
	 */
	EClass getMatchingMetrics();

	/**
	 * Returns the meta object for the reference '{@link SLAModel.MatchingMetrics#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see SLAModel.MatchingMetrics#getMetric()
	 * @see #getMatchingMetrics()
	 * @generated
	 */
	EReference getMatchingMetrics_Metric();

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
		 * The meta object literal for the '<em><b>Servicedefinition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__SERVICEDEFINITION = eINSTANCE.getSLA_Servicedefinition();

		/**
		 * The meta object literal for the '<em><b>Integration SLA</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__INTEGRATION_SLA = eINSTANCE.getSLA_IntegrationSLA();

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
		 * The meta object literal for the '<em><b>Servicedefinition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GARANTEE__SERVICEDEFINITION = eINSTANCE.getGarantee_Servicedefinition();

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
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__UNIT = eINSTANCE.getMetric_Unit();

		/**
		 * The meta object literal for the '<em><b>Matchingmetrics</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__MATCHINGMETRICS = eINSTANCE.getMetric_Matchingmetrics();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.IntegrationSLAImpl <em>Integration SLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.IntegrationSLAImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getIntegrationSLA()
		 * @generated
		 */
		EClass INTEGRATION_SLA = eINSTANCE.getIntegrationSLA();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_SLA__QUERY = eINSTANCE.getIntegrationSLA_Query();

		/**
		 * The meta object literal for the '<em><b>Service Composition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_SLA__SERVICE_COMPOSITION = eINSTANCE.getIntegrationSLA_ServiceComposition();

		/**
		 * The meta object literal for the '<em><b>Slas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_SLA__SLAS = eINSTANCE.getIntegrationSLA_Slas();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.ServiceDefinitionImpl <em>Service Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.ServiceDefinitionImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getServiceDefinition()
		 * @generated
		 */
		EClass SERVICE_DEFINITION = eINSTANCE.getServiceDefinition();

		/**
		 * The meta object literal for the '<em><b>Sla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEFINITION__SLA = eINSTANCE.getServiceDefinition_Sla();

		/**
		 * The meta object literal for the '<em><b>Garantee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEFINITION__GARANTEE = eINSTANCE.getServiceDefinition_Garantee();

		/**
		 * The meta object literal for the '<em><b>Service Composition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEFINITION__SERVICE_COMPOSITION = eINSTANCE.getServiceDefinition_ServiceComposition();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.QueryImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Servicecomposition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__SERVICECOMPOSITION = eINSTANCE.getQuery_Servicecomposition();

		/**
		 * The meta object literal for the '<em><b>Integrationsla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__INTEGRATIONSLA = eINSTANCE.getQuery_Integrationsla();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.UnitImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__METRIC = eINSTANCE.getUnit_Metric();

		/**
		 * The meta object literal for the '<em><b>Matchingunits</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__MATCHINGUNITS = eINSTANCE.getUnit_Matchingunits();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.ServiceCompositionImpl <em>Service Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.ServiceCompositionImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getServiceComposition()
		 * @generated
		 */
		EClass SERVICE_COMPOSITION = eINSTANCE.getServiceComposition();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPOSITION__QUERY = eINSTANCE.getServiceComposition_Query();

		/**
		 * The meta object literal for the '<em><b>Integration SLA</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPOSITION__INTEGRATION_SLA = eINSTANCE.getServiceComposition_IntegrationSLA();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPOSITION__SERVICES = eINSTANCE.getServiceComposition_Services();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.MatchingUnitsImpl <em>Matching Units</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.MatchingUnitsImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getMatchingUnits()
		 * @generated
		 */
		EClass MATCHING_UNITS = eINSTANCE.getMatchingUnits();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING_UNITS__UNIT = eINSTANCE.getMatchingUnits_Unit();

		/**
		 * The meta object literal for the '{@link SLAModel.impl.MatchingMetricsImpl <em>Matching Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SLAModel.impl.MatchingMetricsImpl
		 * @see SLAModel.impl.SLAModelPackageImpl#getMatchingMetrics()
		 * @generated
		 */
		EClass MATCHING_METRICS = eINSTANCE.getMatchingMetrics();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHING_METRICS__METRIC = eINSTANCE.getMatchingMetrics_Metric();

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
