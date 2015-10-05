/**
 */
package modelo.tests;

import junit.textui.TestRunner;

import modelo.Cloud;
import modelo.ModeloFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudTest extends PartyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CloudTest.class);
	}

	/**
	 * Constructs a new Cloud test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cloud test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cloud getFixture() {
		return (Cloud)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloFactory.eINSTANCE.createCloud());
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

} //CloudTest
