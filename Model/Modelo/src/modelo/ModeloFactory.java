/**
 */
package modelo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modelo.ModeloPackage
 * @generated
 */
public interface ModeloFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloFactory eINSTANCE = modelo.impl.ModeloFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLA</em>'.
	 * @generated
	 */
	SLA createSLA();

	/**
	 * Returns a new object of class '<em>User SLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User SLA</em>'.
	 * @generated
	 */
	UserSLA createUserSLA();

	/**
	 * Returns a new object of class '<em>Service SLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service SLA</em>'.
	 * @generated
	 */
	ServiceSLA createServiceSLA();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud</em>'.
	 * @generated
	 */
	Cloud createCloud();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party</em>'.
	 * @generated
	 */
	Party createParty();

	/**
	 * Returns a new object of class '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query</em>'.
	 * @generated
	 */
	Query createQuery();

	/**
	 * Returns a new object of class '<em>Service Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Composition</em>'.
	 * @generated
	 */
	ServiceComposition createServiceComposition();

	/**
	 * Returns a new object of class '<em>Concepts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concepts</em>'.
	 * @generated
	 */
	Concepts createConcepts();

	/**
	 * Returns a new object of class '<em>Integration SLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integration SLA</em>'.
	 * @generated
	 */
	IntegrationSLA createIntegrationSLA();

	/**
	 * Returns a new object of class '<em>Negotiation Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negotiation Rules</em>'.
	 * @generated
	 */
	NegotiationRules createNegotiationRules();

	/**
	 * Returns a new object of class '<em>Guaranty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guaranty</em>'.
	 * @generated
	 */
	Guaranty createGuaranty();

	/**
	 * Returns a new object of class '<em>Obligation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obligation</em>'.
	 * @generated
	 */
	Obligation createObligation();

	/**
	 * Returns a new object of class '<em>SLA Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLA Parameters</em>'.
	 * @generated
	 */
	SLAParameters createSLAParameters();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModeloPackage getModeloPackage();

} //ModeloFactory
