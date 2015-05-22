/**
 */
package modelo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modelo.ModeloFactory;
import modelo.SLAParameters;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SLA Parameters</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SLAParametersTest extends TestCase {

	/**
	 * The fixture for this SLA Parameters test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLAParameters fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SLAParametersTest.class);
	}

	/**
	 * Constructs a new SLA Parameters test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLAParametersTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this SLA Parameters test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SLAParameters fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this SLA Parameters test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLAParameters getFixture() {
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
		setFixture(ModeloFactory.eINSTANCE.createSLAParameters());
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

} //SLAParametersTest
