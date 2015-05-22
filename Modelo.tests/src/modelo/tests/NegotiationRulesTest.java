/**
 */
package modelo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modelo.ModeloFactory;
import modelo.NegotiationRules;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Negotiation Rules</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NegotiationRulesTest extends TestCase {

	/**
	 * The fixture for this Negotiation Rules test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegotiationRules fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NegotiationRulesTest.class);
	}

	/**
	 * Constructs a new Negotiation Rules test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegotiationRulesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Negotiation Rules test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NegotiationRules fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Negotiation Rules test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegotiationRules getFixture() {
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
		setFixture(ModeloFactory.eINSTANCE.createNegotiationRules());
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

} //NegotiationRulesTest
