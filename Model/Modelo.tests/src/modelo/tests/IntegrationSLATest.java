/**
 */
package modelo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modelo.IntegrationSLA;
import modelo.ModeloFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integration SLA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrationSLATest extends TestCase {

	/**
	 * The fixture for this Integration SLA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationSLA fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegrationSLATest.class);
	}

	/**
	 * Constructs a new Integration SLA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationSLATest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Integration SLA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IntegrationSLA fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Integration SLA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationSLA getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloFactory.eINSTANCE.createIntegrationSLA());
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

} //IntegrationSLATest
