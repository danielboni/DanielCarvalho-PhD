/**
 */
package modelo;

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
 * @see modelo.ModeloFactory
 * @model kind="package"
 * @generated
 */
public interface ModeloPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modelo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloPackage eINSTANCE = modelo.impl.ModeloPackageImpl.init();

	/**
	 * The meta object id for the '{@link modelo.impl.SLAImpl <em>SLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.SLAImpl
	 * @see modelo.impl.ModeloPackageImpl#getSLA()
	 * @generated
	 */
	int SLA = 0;

	/**
	 * The feature id for the '<em><b>Slaparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__SLAPARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Integrationsla</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__INTEGRATIONSLA = 1;

	/**
	 * The feature id for the '<em><b>Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__PARTY = 2;

	/**
	 * The feature id for the '<em><b>Obligation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__OBLIGATION = 3;

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
	 * The meta object id for the '{@link modelo.impl.UserSLAImpl <em>User SLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.UserSLAImpl
	 * @see modelo.impl.ModeloPackageImpl#getUserSLA()
	 * @generated
	 */
	int USER_SLA = 1;

	/**
	 * The feature id for the '<em><b>Slaparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SLA__SLAPARAMETERS = SLA__SLAPARAMETERS;

	/**
	 * The feature id for the '<em><b>Integrationsla</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SLA__INTEGRATIONSLA = SLA__INTEGRATIONSLA;

	/**
	 * The feature id for the '<em><b>Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SLA__PARTY = SLA__PARTY;

	/**
	 * The feature id for the '<em><b>Obligation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SLA__OBLIGATION = SLA__OBLIGATION;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SLA__USER = SLA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SLA__CLOUD = SLA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SLA_FEATURE_COUNT = SLA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SLA_OPERATION_COUNT = SLA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelo.impl.ServiceSLAImpl <em>Service SLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.ServiceSLAImpl
	 * @see modelo.impl.ModeloPackageImpl#getServiceSLA()
	 * @generated
	 */
	int SERVICE_SLA = 2;

	/**
	 * The feature id for the '<em><b>Slaparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SLA__SLAPARAMETERS = SLA__SLAPARAMETERS;

	/**
	 * The feature id for the '<em><b>Integrationsla</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SLA__INTEGRATIONSLA = SLA__INTEGRATIONSLA;

	/**
	 * The feature id for the '<em><b>Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SLA__PARTY = SLA__PARTY;

	/**
	 * The feature id for the '<em><b>Obligation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SLA__OBLIGATION = SLA__OBLIGATION;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SLA__CLOUD = SLA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SLA__SERVICE = SLA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SLA_FEATURE_COUNT = SLA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SLA_OPERATION_COUNT = SLA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelo.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.PartyImpl
	 * @see modelo.impl.ModeloPackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 6;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__SLA = 0;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelo.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.UserImpl
	 * @see modelo.impl.ModeloPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SLA = PARTY__SLA;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CLOUD = PARTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usersla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERSLA = PARTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = PARTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelo.impl.CloudImpl <em>Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.CloudImpl
	 * @see modelo.impl.ModeloPackageImpl#getCloud()
	 * @generated
	 */
	int CLOUD = 4;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__SLA = PARTY__SLA;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__USER = PARTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__SERVICE = PARTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usersla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__USERSLA = PARTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Servicesla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__SERVICESLA = PARTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_FEATURE_COUNT = PARTY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelo.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.ServiceImpl
	 * @see modelo.impl.ModeloPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SLA = PARTY__SLA;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__QUERY = PARTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CLOUD = PARTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Servicesla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICESLA = PARTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Servicecomposition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICECOMPOSITION = PARTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = PARTY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelo.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.QueryImpl
	 * @see modelo.impl.ModeloPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 7;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CONCEPTS = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Querye Opposite</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__QUERYE_OPPOSITE = 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Servicecomposition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SERVICECOMPOSITION = 4;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelo.impl.ServiceCompositionImpl <em>Service Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.ServiceCompositionImpl
	 * @see modelo.impl.ModeloPackageImpl#getServiceComposition()
	 * @generated
	 */
	int SERVICE_COMPOSITION = 8;

	/**
	 * The feature id for the '<em><b>Query</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION__QUERY = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION__SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Service Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelo.impl.ConceptsImpl <em>Concepts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.ConceptsImpl
	 * @see modelo.impl.ModeloPackageImpl#getConcepts()
	 * @generated
	 */
	int CONCEPTS = 9;

	/**
	 * The feature id for the '<em><b>Integrationsla</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTS__INTEGRATIONSLA = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTS__QUERY = 1;

	/**
	 * The number of structural features of the '<em>Concepts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Concepts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelo.impl.IntegrationSLAImpl <em>Integration SLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.IntegrationSLAImpl
	 * @see modelo.impl.ModeloPackageImpl#getIntegrationSLA()
	 * @generated
	 */
	int INTEGRATION_SLA = 10;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SLA__SLA = 0;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SLA__CONCEPTS = 1;

	/**
	 * The feature id for the '<em><b>Negotiationrules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_SLA__NEGOTIATIONRULES = 2;

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
	 * The meta object id for the '{@link modelo.impl.NegotiationRulesImpl <em>Negotiation Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.NegotiationRulesImpl
	 * @see modelo.impl.ModeloPackageImpl#getNegotiationRules()
	 * @generated
	 */
	int NEGOTIATION_RULES = 11;

	/**
	 * The feature id for the '<em><b>Integrationsla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOTIATION_RULES__INTEGRATIONSLA = 0;

	/**
	 * The feature id for the '<em><b>Guaranty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOTIATION_RULES__GUARANTY = 1;

	/**
	 * The number of structural features of the '<em>Negotiation Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOTIATION_RULES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Negotiation Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGOTIATION_RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelo.impl.GuarantyImpl <em>Guaranty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.GuarantyImpl
	 * @see modelo.impl.ModeloPackageImpl#getGuaranty()
	 * @generated
	 */
	int GUARANTY = 12;

	/**
	 * The feature id for the '<em><b>Slaparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTY__SLAPARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Guaranty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTY__GUARANTY = 1;

	/**
	 * The feature id for the '<em><b>Guarantye Opposite</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTY__GUARANTYE_OPPOSITE = 2;

	/**
	 * The feature id for the '<em><b>Negotiationrules</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTY__NEGOTIATIONRULES = 3;

	/**
	 * The number of structural features of the '<em>Guaranty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Guaranty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARANTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelo.impl.ObligationImpl <em>Obligation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.ObligationImpl
	 * @see modelo.impl.ModeloPackageImpl#getObligation()
	 * @generated
	 */
	int OBLIGATION = 13;

	/**
	 * The feature id for the '<em><b>Slaparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION__SLAPARAMETERS = GUARANTY__SLAPARAMETERS;

	/**
	 * The feature id for the '<em><b>Guaranty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION__GUARANTY = GUARANTY__GUARANTY;

	/**
	 * The feature id for the '<em><b>Guarantye Opposite</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION__GUARANTYE_OPPOSITE = GUARANTY__GUARANTYE_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Negotiationrules</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION__NEGOTIATIONRULES = GUARANTY__NEGOTIATIONRULES;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION__SLA = GUARANTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_FEATURE_COUNT = GUARANTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Obligation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBLIGATION_OPERATION_COUNT = GUARANTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelo.impl.SLAParametersImpl <em>SLA Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelo.impl.SLAParametersImpl
	 * @see modelo.impl.ModeloPackageImpl#getSLAParameters()
	 * @generated
	 */
	int SLA_PARAMETERS = 14;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_PARAMETERS__SLA = 0;

	/**
	 * The feature id for the '<em><b>Guaranty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_PARAMETERS__GUARANTY = 1;

	/**
	 * The number of structural features of the '<em>SLA Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_PARAMETERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SLA Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_PARAMETERS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link modelo.SLA <em>SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLA</em>'.
	 * @see modelo.SLA
	 * @generated
	 */
	EClass getSLA();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.SLA#getSlaparameters <em>Slaparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slaparameters</em>'.
	 * @see modelo.SLA#getSlaparameters()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Slaparameters();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.SLA#getIntegrationsla <em>Integrationsla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integrationsla</em>'.
	 * @see modelo.SLA#getIntegrationsla()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Integrationsla();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.SLA#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Party</em>'.
	 * @see modelo.SLA#getParty()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Party();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.SLA#getObligation <em>Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obligation</em>'.
	 * @see modelo.SLA#getObligation()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Obligation();

	/**
	 * Returns the meta object for class '{@link modelo.UserSLA <em>User SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User SLA</em>'.
	 * @see modelo.UserSLA
	 * @generated
	 */
	EClass getUserSLA();

	/**
	 * Returns the meta object for the containment reference '{@link modelo.UserSLA#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see modelo.UserSLA#getUser()
	 * @see #getUserSLA()
	 * @generated
	 */
	EReference getUserSLA_User();

	/**
	 * Returns the meta object for the containment reference '{@link modelo.UserSLA#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cloud</em>'.
	 * @see modelo.UserSLA#getCloud()
	 * @see #getUserSLA()
	 * @generated
	 */
	EReference getUserSLA_Cloud();

	/**
	 * Returns the meta object for class '{@link modelo.ServiceSLA <em>Service SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service SLA</em>'.
	 * @see modelo.ServiceSLA
	 * @generated
	 */
	EClass getServiceSLA();

	/**
	 * Returns the meta object for the containment reference '{@link modelo.ServiceSLA#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cloud</em>'.
	 * @see modelo.ServiceSLA#getCloud()
	 * @see #getServiceSLA()
	 * @generated
	 */
	EReference getServiceSLA_Cloud();

	/**
	 * Returns the meta object for the containment reference '{@link modelo.ServiceSLA#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see modelo.ServiceSLA#getService()
	 * @see #getServiceSLA()
	 * @generated
	 */
	EReference getServiceSLA_Service();

	/**
	 * Returns the meta object for class '{@link modelo.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see modelo.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference '{@link modelo.User#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cloud</em>'.
	 * @see modelo.User#getCloud()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Cloud();

	/**
	 * Returns the meta object for the container reference '{@link modelo.User#getUsersla <em>Usersla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Usersla</em>'.
	 * @see modelo.User#getUsersla()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Usersla();

	/**
	 * Returns the meta object for class '{@link modelo.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud</em>'.
	 * @see modelo.Cloud
	 * @generated
	 */
	EClass getCloud();

	/**
	 * Returns the meta object for the reference '{@link modelo.Cloud#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see modelo.Cloud#getUser()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_User();

	/**
	 * Returns the meta object for the reference '{@link modelo.Cloud#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see modelo.Cloud#getService()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Service();

	/**
	 * Returns the meta object for the container reference '{@link modelo.Cloud#getUsersla <em>Usersla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Usersla</em>'.
	 * @see modelo.Cloud#getUsersla()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Usersla();

	/**
	 * Returns the meta object for the container reference '{@link modelo.Cloud#getServicesla <em>Servicesla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Servicesla</em>'.
	 * @see modelo.Cloud#getServicesla()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_Servicesla();

	/**
	 * Returns the meta object for class '{@link modelo.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see modelo.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.Service#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see modelo.Service#getQuery()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.Service#getServicecomposition <em>Servicecomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicecomposition</em>'.
	 * @see modelo.Service#getServicecomposition()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Servicecomposition();

	/**
	 * Returns the meta object for the reference '{@link modelo.Service#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cloud</em>'.
	 * @see modelo.Service#getCloud()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Cloud();

	/**
	 * Returns the meta object for the container reference '{@link modelo.Service#getServicesla <em>Servicesla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Servicesla</em>'.
	 * @see modelo.Service#getServicesla()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Servicesla();

	/**
	 * Returns the meta object for class '{@link modelo.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see modelo.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the container reference '{@link modelo.Party#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sla</em>'.
	 * @see modelo.Party#getSla()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_Sla();

	/**
	 * Returns the meta object for class '{@link modelo.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see modelo.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.Query#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concepts</em>'.
	 * @see modelo.Query#getConcepts()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Concepts();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.Query#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see modelo.Query#getQuery()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Query();

	/**
	 * Returns the meta object for the container reference '{@link modelo.Query#getQueryeOpposite <em>Querye Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Querye Opposite</em>'.
	 * @see modelo.Query#getQueryeOpposite()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_QueryeOpposite();

	/**
	 * Returns the meta object for the container reference '{@link modelo.Query#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see modelo.Query#getService()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.Query#getServicecomposition <em>Servicecomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicecomposition</em>'.
	 * @see modelo.Query#getServicecomposition()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Servicecomposition();

	/**
	 * Returns the meta object for class '{@link modelo.ServiceComposition <em>Service Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Composition</em>'.
	 * @see modelo.ServiceComposition
	 * @generated
	 */
	EClass getServiceComposition();

	/**
	 * Returns the meta object for the container reference '{@link modelo.ServiceComposition#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see modelo.ServiceComposition#getService()
	 * @see #getServiceComposition()
	 * @generated
	 */
	EReference getServiceComposition_Service();

	/**
	 * Returns the meta object for the container reference '{@link modelo.ServiceComposition#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Query</em>'.
	 * @see modelo.ServiceComposition#getQuery()
	 * @see #getServiceComposition()
	 * @generated
	 */
	EReference getServiceComposition_Query();

	/**
	 * Returns the meta object for class '{@link modelo.Concepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concepts</em>'.
	 * @see modelo.Concepts
	 * @generated
	 */
	EClass getConcepts();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.Concepts#getIntegrationsla <em>Integrationsla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integrationsla</em>'.
	 * @see modelo.Concepts#getIntegrationsla()
	 * @see #getConcepts()
	 * @generated
	 */
	EReference getConcepts_Integrationsla();

	/**
	 * Returns the meta object for the container reference '{@link modelo.Concepts#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Query</em>'.
	 * @see modelo.Concepts#getQuery()
	 * @see #getConcepts()
	 * @generated
	 */
	EReference getConcepts_Query();

	/**
	 * Returns the meta object for class '{@link modelo.IntegrationSLA <em>Integration SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration SLA</em>'.
	 * @see modelo.IntegrationSLA
	 * @generated
	 */
	EClass getIntegrationSLA();

	/**
	 * Returns the meta object for the container reference '{@link modelo.IntegrationSLA#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sla</em>'.
	 * @see modelo.IntegrationSLA#getSla()
	 * @see #getIntegrationSLA()
	 * @generated
	 */
	EReference getIntegrationSLA_Sla();

	/**
	 * Returns the meta object for the container reference '{@link modelo.IntegrationSLA#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Concepts</em>'.
	 * @see modelo.IntegrationSLA#getConcepts()
	 * @see #getIntegrationSLA()
	 * @generated
	 */
	EReference getIntegrationSLA_Concepts();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.IntegrationSLA#getNegotiationrules <em>Negotiationrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Negotiationrules</em>'.
	 * @see modelo.IntegrationSLA#getNegotiationrules()
	 * @see #getIntegrationSLA()
	 * @generated
	 */
	EReference getIntegrationSLA_Negotiationrules();

	/**
	 * Returns the meta object for class '{@link modelo.NegotiationRules <em>Negotiation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negotiation Rules</em>'.
	 * @see modelo.NegotiationRules
	 * @generated
	 */
	EClass getNegotiationRules();

	/**
	 * Returns the meta object for the container reference '{@link modelo.NegotiationRules#getIntegrationsla <em>Integrationsla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Integrationsla</em>'.
	 * @see modelo.NegotiationRules#getIntegrationsla()
	 * @see #getNegotiationRules()
	 * @generated
	 */
	EReference getNegotiationRules_Integrationsla();

	/**
	 * Returns the meta object for the containment reference '{@link modelo.NegotiationRules#getGuaranty <em>Guaranty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guaranty</em>'.
	 * @see modelo.NegotiationRules#getGuaranty()
	 * @see #getNegotiationRules()
	 * @generated
	 */
	EReference getNegotiationRules_Guaranty();

	/**
	 * Returns the meta object for class '{@link modelo.Guaranty <em>Guaranty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guaranty</em>'.
	 * @see modelo.Guaranty
	 * @generated
	 */
	EClass getGuaranty();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.Guaranty#getSlaparameters <em>Slaparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slaparameters</em>'.
	 * @see modelo.Guaranty#getSlaparameters()
	 * @see #getGuaranty()
	 * @generated
	 */
	EReference getGuaranty_Slaparameters();

	/**
	 * Returns the meta object for the containment reference list '{@link modelo.Guaranty#getGuaranty <em>Guaranty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guaranty</em>'.
	 * @see modelo.Guaranty#getGuaranty()
	 * @see #getGuaranty()
	 * @generated
	 */
	EReference getGuaranty_Guaranty();

	/**
	 * Returns the meta object for the container reference '{@link modelo.Guaranty#getGuarantyeOpposite <em>Guarantye Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Guarantye Opposite</em>'.
	 * @see modelo.Guaranty#getGuarantyeOpposite()
	 * @see #getGuaranty()
	 * @generated
	 */
	EReference getGuaranty_GuarantyeOpposite();

	/**
	 * Returns the meta object for the container reference '{@link modelo.Guaranty#getNegotiationrules <em>Negotiationrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Negotiationrules</em>'.
	 * @see modelo.Guaranty#getNegotiationrules()
	 * @see #getGuaranty()
	 * @generated
	 */
	EReference getGuaranty_Negotiationrules();

	/**
	 * Returns the meta object for class '{@link modelo.Obligation <em>Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obligation</em>'.
	 * @see modelo.Obligation
	 * @generated
	 */
	EClass getObligation();

	/**
	 * Returns the meta object for the container reference '{@link modelo.Obligation#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sla</em>'.
	 * @see modelo.Obligation#getSla()
	 * @see #getObligation()
	 * @generated
	 */
	EReference getObligation_Sla();

	/**
	 * Returns the meta object for class '{@link modelo.SLAParameters <em>SLA Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLA Parameters</em>'.
	 * @see modelo.SLAParameters
	 * @generated
	 */
	EClass getSLAParameters();

	/**
	 * Returns the meta object for the container reference '{@link modelo.SLAParameters#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sla</em>'.
	 * @see modelo.SLAParameters#getSla()
	 * @see #getSLAParameters()
	 * @generated
	 */
	EReference getSLAParameters_Sla();

	/**
	 * Returns the meta object for the container reference '{@link modelo.SLAParameters#getGuaranty <em>Guaranty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Guaranty</em>'.
	 * @see modelo.SLAParameters#getGuaranty()
	 * @see #getSLAParameters()
	 * @generated
	 */
	EReference getSLAParameters_Guaranty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModeloFactory getModeloFactory();

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
		 * The meta object literal for the '{@link modelo.impl.SLAImpl <em>SLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.SLAImpl
		 * @see modelo.impl.ModeloPackageImpl#getSLA()
		 * @generated
		 */
		EClass SLA = eINSTANCE.getSLA();

		/**
		 * The meta object literal for the '<em><b>Slaparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__SLAPARAMETERS = eINSTANCE.getSLA_Slaparameters();

		/**
		 * The meta object literal for the '<em><b>Integrationsla</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__INTEGRATIONSLA = eINSTANCE.getSLA_Integrationsla();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__PARTY = eINSTANCE.getSLA_Party();

		/**
		 * The meta object literal for the '<em><b>Obligation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__OBLIGATION = eINSTANCE.getSLA_Obligation();

		/**
		 * The meta object literal for the '{@link modelo.impl.UserSLAImpl <em>User SLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.UserSLAImpl
		 * @see modelo.impl.ModeloPackageImpl#getUserSLA()
		 * @generated
		 */
		EClass USER_SLA = eINSTANCE.getUserSLA();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_SLA__USER = eINSTANCE.getUserSLA_User();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_SLA__CLOUD = eINSTANCE.getUserSLA_Cloud();

		/**
		 * The meta object literal for the '{@link modelo.impl.ServiceSLAImpl <em>Service SLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.ServiceSLAImpl
		 * @see modelo.impl.ModeloPackageImpl#getServiceSLA()
		 * @generated
		 */
		EClass SERVICE_SLA = eINSTANCE.getServiceSLA();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SLA__CLOUD = eINSTANCE.getServiceSLA_Cloud();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SLA__SERVICE = eINSTANCE.getServiceSLA_Service();

		/**
		 * The meta object literal for the '{@link modelo.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.UserImpl
		 * @see modelo.impl.ModeloPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__CLOUD = eINSTANCE.getUser_Cloud();

		/**
		 * The meta object literal for the '<em><b>Usersla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USERSLA = eINSTANCE.getUser_Usersla();

		/**
		 * The meta object literal for the '{@link modelo.impl.CloudImpl <em>Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.CloudImpl
		 * @see modelo.impl.ModeloPackageImpl#getCloud()
		 * @generated
		 */
		EClass CLOUD = eINSTANCE.getCloud();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__USER = eINSTANCE.getCloud_User();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__SERVICE = eINSTANCE.getCloud_Service();

		/**
		 * The meta object literal for the '<em><b>Usersla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__USERSLA = eINSTANCE.getCloud_Usersla();

		/**
		 * The meta object literal for the '<em><b>Servicesla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__SERVICESLA = eINSTANCE.getCloud_Servicesla();

		/**
		 * The meta object literal for the '{@link modelo.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.ServiceImpl
		 * @see modelo.impl.ModeloPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__QUERY = eINSTANCE.getService_Query();

		/**
		 * The meta object literal for the '<em><b>Servicecomposition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICECOMPOSITION = eINSTANCE.getService_Servicecomposition();

		/**
		 * The meta object literal for the '<em><b>Cloud</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CLOUD = eINSTANCE.getService_Cloud();

		/**
		 * The meta object literal for the '<em><b>Servicesla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICESLA = eINSTANCE.getService_Servicesla();

		/**
		 * The meta object literal for the '{@link modelo.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.PartyImpl
		 * @see modelo.impl.ModeloPackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

		/**
		 * The meta object literal for the '<em><b>Sla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__SLA = eINSTANCE.getParty_Sla();

		/**
		 * The meta object literal for the '{@link modelo.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.QueryImpl
		 * @see modelo.impl.ModeloPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Concepts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__CONCEPTS = eINSTANCE.getQuery_Concepts();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__QUERY = eINSTANCE.getQuery_Query();

		/**
		 * The meta object literal for the '<em><b>Querye Opposite</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__QUERYE_OPPOSITE = eINSTANCE.getQuery_QueryeOpposite();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__SERVICE = eINSTANCE.getQuery_Service();

		/**
		 * The meta object literal for the '<em><b>Servicecomposition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__SERVICECOMPOSITION = eINSTANCE.getQuery_Servicecomposition();

		/**
		 * The meta object literal for the '{@link modelo.impl.ServiceCompositionImpl <em>Service Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.ServiceCompositionImpl
		 * @see modelo.impl.ModeloPackageImpl#getServiceComposition()
		 * @generated
		 */
		EClass SERVICE_COMPOSITION = eINSTANCE.getServiceComposition();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPOSITION__SERVICE = eINSTANCE.getServiceComposition_Service();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPOSITION__QUERY = eINSTANCE.getServiceComposition_Query();

		/**
		 * The meta object literal for the '{@link modelo.impl.ConceptsImpl <em>Concepts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.ConceptsImpl
		 * @see modelo.impl.ModeloPackageImpl#getConcepts()
		 * @generated
		 */
		EClass CONCEPTS = eINSTANCE.getConcepts();

		/**
		 * The meta object literal for the '<em><b>Integrationsla</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTS__INTEGRATIONSLA = eINSTANCE.getConcepts_Integrationsla();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPTS__QUERY = eINSTANCE.getConcepts_Query();

		/**
		 * The meta object literal for the '{@link modelo.impl.IntegrationSLAImpl <em>Integration SLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.IntegrationSLAImpl
		 * @see modelo.impl.ModeloPackageImpl#getIntegrationSLA()
		 * @generated
		 */
		EClass INTEGRATION_SLA = eINSTANCE.getIntegrationSLA();

		/**
		 * The meta object literal for the '<em><b>Sla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_SLA__SLA = eINSTANCE.getIntegrationSLA_Sla();

		/**
		 * The meta object literal for the '<em><b>Concepts</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_SLA__CONCEPTS = eINSTANCE.getIntegrationSLA_Concepts();

		/**
		 * The meta object literal for the '<em><b>Negotiationrules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_SLA__NEGOTIATIONRULES = eINSTANCE.getIntegrationSLA_Negotiationrules();

		/**
		 * The meta object literal for the '{@link modelo.impl.NegotiationRulesImpl <em>Negotiation Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.NegotiationRulesImpl
		 * @see modelo.impl.ModeloPackageImpl#getNegotiationRules()
		 * @generated
		 */
		EClass NEGOTIATION_RULES = eINSTANCE.getNegotiationRules();

		/**
		 * The meta object literal for the '<em><b>Integrationsla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGOTIATION_RULES__INTEGRATIONSLA = eINSTANCE.getNegotiationRules_Integrationsla();

		/**
		 * The meta object literal for the '<em><b>Guaranty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGOTIATION_RULES__GUARANTY = eINSTANCE.getNegotiationRules_Guaranty();

		/**
		 * The meta object literal for the '{@link modelo.impl.GuarantyImpl <em>Guaranty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.GuarantyImpl
		 * @see modelo.impl.ModeloPackageImpl#getGuaranty()
		 * @generated
		 */
		EClass GUARANTY = eINSTANCE.getGuaranty();

		/**
		 * The meta object literal for the '<em><b>Slaparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARANTY__SLAPARAMETERS = eINSTANCE.getGuaranty_Slaparameters();

		/**
		 * The meta object literal for the '<em><b>Guaranty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARANTY__GUARANTY = eINSTANCE.getGuaranty_Guaranty();

		/**
		 * The meta object literal for the '<em><b>Guarantye Opposite</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARANTY__GUARANTYE_OPPOSITE = eINSTANCE.getGuaranty_GuarantyeOpposite();

		/**
		 * The meta object literal for the '<em><b>Negotiationrules</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARANTY__NEGOTIATIONRULES = eINSTANCE.getGuaranty_Negotiationrules();

		/**
		 * The meta object literal for the '{@link modelo.impl.ObligationImpl <em>Obligation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.ObligationImpl
		 * @see modelo.impl.ModeloPackageImpl#getObligation()
		 * @generated
		 */
		EClass OBLIGATION = eINSTANCE.getObligation();

		/**
		 * The meta object literal for the '<em><b>Sla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBLIGATION__SLA = eINSTANCE.getObligation_Sla();

		/**
		 * The meta object literal for the '{@link modelo.impl.SLAParametersImpl <em>SLA Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelo.impl.SLAParametersImpl
		 * @see modelo.impl.ModeloPackageImpl#getSLAParameters()
		 * @generated
		 */
		EClass SLA_PARAMETERS = eINSTANCE.getSLAParameters();

		/**
		 * The meta object literal for the '<em><b>Sla</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA_PARAMETERS__SLA = eINSTANCE.getSLAParameters_Sla();

		/**
		 * The meta object literal for the '<em><b>Guaranty</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA_PARAMETERS__GUARANTY = eINSTANCE.getSLAParameters_Guaranty();

	}

} //ModeloPackage
