/**
 */
package modelo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modelo.ModeloFactory;
import modelo.SLA;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SLA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SLATest extends TestCase {

	/**
	 * The fixture for this SLA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLA fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SLATest.class);
	}

	/**
	 * Constructs a new SLA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLATest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this SLA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SLA fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this SLA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLA getFixture() {
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
		setFixture(ModeloFactory.eINSTANCE.createSLA());
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

} //SLATest
