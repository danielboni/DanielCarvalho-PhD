/**
 */
package modelo.tests;

import junit.textui.TestRunner;

import modelo.ModeloFactory;
import modelo.UserSLA;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User SLA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserSLATest extends SLATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserSLATest.class);
	}

	/**
	 * Constructs a new User SLA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSLATest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User SLA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UserSLA getFixture() {
		return (UserSLA)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloFactory.eINSTANCE.createUserSLA());
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

} //UserSLATest
