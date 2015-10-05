/**
 */
package modelo.tests;

import junit.textui.TestRunner;

import modelo.ModeloFactory;
import modelo.ServiceSLA;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service SLA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceSLATest extends SLATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceSLATest.class);
	}

	/**
	 * Constructs a new Service SLA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSLATest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Service SLA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServiceSLA getFixture() {
		return (ServiceSLA)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloFactory.eINSTANCE.createServiceSLA());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ServiceSLATest
