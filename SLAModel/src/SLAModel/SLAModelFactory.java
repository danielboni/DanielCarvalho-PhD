/**
 */
package SLAModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SLAModel.SLAModelPackage
 * @generated
 */
public interface SLAModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SLAModelFactory eINSTANCE = SLAModel.impl.SLAModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SLA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLA</em>'.
	 * @generated
	 */
	SLA createSLA();

	/**
	 * Returns a new object of class '<em>Obligations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obligations</em>'.
	 * @generated
	 */
	Obligations createObligations();

	/**
	 * Returns a new object of class '<em>Parties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parties</em>'.
	 * @generated
	 */
	Parties createParties();

	/**
	 * Returns a new object of class '<em>Service Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Consumer</em>'.
	 * @generated
	 */
	ServiceConsumer createServiceConsumer();

	/**
	 * Returns a new object of class '<em>Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Provider</em>'.
	 * @generated
	 */
	ServiceProvider createServiceProvider();

	/**
	 * Returns a new object of class '<em>Garantee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Garantee</em>'.
	 * @generated
	 */
	Garantee createGarantee();

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SLAModelPackage getSLAModelPackage();

} //SLAModelFactory
