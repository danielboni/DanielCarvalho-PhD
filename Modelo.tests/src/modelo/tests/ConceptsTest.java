/**
 */
package modelo.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modelo.Concepts;
import modelo.ModeloFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Concepts</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptsTest extends TestCase {

	/**
	 * The fixture for this Concepts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Concepts fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConceptsTest.class);
	}

	/**
	 * Constructs a new Concepts test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Concepts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Concepts fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Concepts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Concepts getFixture() {
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
		setFixture(ModeloFactory.eINSTANCE.createConcepts());
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

} //ConceptsTest
