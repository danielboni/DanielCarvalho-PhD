/**
 */
package modelo.tests;

import junit.textui.TestRunner;

import modelo.ModeloFactory;
import modelo.Obligation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Obligation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObligationTest extends GuarantyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObligationTest.class);
	}

	/**
	 * Constructs a new Obligation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Obligation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Obligation getFixture() {
		return (Obligation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloFactory.eINSTANCE.createObligation());
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

} //ObligationTest
