/**
 */
package modelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLA Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.SLAParameters#getSla <em>Sla</em>}</li>
 *   <li>{@link modelo.SLAParameters#getGuaranty <em>Guaranty</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getSLAParameters()
 * @model
 * @generated
 */
public interface SLAParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Sla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.SLA#getSlaparameters <em>Slaparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sla</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sla</em>' container reference.
	 * @see #setSla(SLA)
	 * @see modelo.ModeloPackage#getSLAParameters_Sla()
	 * @see modelo.SLA#getSlaparameters
	 * @model opposite="slaparameters" transient="false"
	 * @generated
	 */
	SLA getSla();

	/**
	 * Sets the value of the '{@link modelo.SLAParameters#getSla <em>Sla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sla</em>' container reference.
	 * @see #getSla()
	 * @generated
	 */
	void setSla(SLA value);

	/**
	 * Returns the value of the '<em><b>Guaranty</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.Guaranty#getSlaparameters <em>Slaparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guaranty</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guaranty</em>' container reference.
	 * @see #setGuaranty(Guaranty)
	 * @see modelo.ModeloPackage#getSLAParameters_Guaranty()
	 * @see modelo.Guaranty#getSlaparameters
	 * @model opposite="slaparameters" transient="false"
	 * @generated
	 */
	Guaranty getGuaranty();

	/**
	 * Sets the value of the '{@link modelo.SLAParameters#getGuaranty <em>Guaranty</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guaranty</em>' container reference.
	 * @see #getGuaranty()
	 * @generated
	 */
	void setGuaranty(Guaranty value);

} // SLAParameters
