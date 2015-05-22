/**
 */
package modelo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modelo.ModeloFactory;
import modelo.ServiceComposition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Composition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceCompositionTest extends TestCase {

	/**
	 * The fixture for this Service Composition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceComposition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceCompositionTest.class);
	}

	/**
	 * Constructs a new Service Composition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCompositionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Composition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceComposition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Composition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceComposition getFixture() {
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
		setFixture(ModeloFactory.eINSTANCE.createServiceComposition());
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

} //ServiceCompositionTest
