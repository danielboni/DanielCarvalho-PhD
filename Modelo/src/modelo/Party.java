/**
 */
package modelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.Party#getSla <em>Sla</em>}</li>
 *   <li>{@link modelo.Party#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getParty()
 * @model
 * @generated
 */
public interface Party extends EObject {
	/**
	 * Returns the value of the '<em><b>Sla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.SLA#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sla</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sla</em>' container reference.
	 * @see #setSla(SLA)
	 * @see modelo.ModeloPackage#getParty_Sla()
	 * @see modelo.SLA#getParty
	 * @model opposite="party" transient="false"
	 * @generated
	 */
	SLA getSla();

	/**
	 * Sets the value of the '{@link modelo.Party#getSla <em>Sla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sla</em>' container reference.
	 * @see #getSla()
	 * @generated
	 */
	void setSla(SLA value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see modelo.ModeloPackage#getParty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link modelo.Party#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Party
