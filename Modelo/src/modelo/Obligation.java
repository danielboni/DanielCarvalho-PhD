/**
 */
package modelo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obligation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.Obligation#getSla <em>Sla</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getObligation()
 * @model
 * @generated
 */
public interface Obligation extends Guaranty {
	/**
	 * Returns the value of the '<em><b>Sla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.SLA#getObligation <em>Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sla</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sla</em>' container reference.
	 * @see #setSla(SLA)
	 * @see modelo.ModeloPackage#getObligation_Sla()
	 * @see modelo.SLA#getObligation
	 * @model opposite="obligation" transient="false"
	 * @generated
	 */
	SLA getSla();

	/**
	 * Sets the value of the '{@link modelo.Obligation#getSla <em>Sla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sla</em>' container reference.
	 * @see #getSla()
	 * @generated
	 */
	void setSla(SLA value);

} // Obligation
