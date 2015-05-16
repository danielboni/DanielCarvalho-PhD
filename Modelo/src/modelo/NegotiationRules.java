/**
 */
package modelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negotiation Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.NegotiationRules#getIntegrationsla <em>Integrationsla</em>}</li>
 *   <li>{@link modelo.NegotiationRules#getGuaranty <em>Guaranty</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getNegotiationRules()
 * @model
 * @generated
 */
public interface NegotiationRules extends EObject {
	/**
	 * Returns the value of the '<em><b>Integrationsla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.IntegrationSLA#getNegotiationrules <em>Negotiationrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integrationsla</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrationsla</em>' container reference.
	 * @see #setIntegrationsla(IntegrationSLA)
	 * @see modelo.ModeloPackage#getNegotiationRules_Integrationsla()
	 * @see modelo.IntegrationSLA#getNegotiationrules
	 * @model opposite="negotiationrules" transient="false"
	 * @generated
	 */
	IntegrationSLA getIntegrationsla();

	/**
	 * Sets the value of the '{@link modelo.NegotiationRules#getIntegrationsla <em>Integrationsla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrationsla</em>' container reference.
	 * @see #getIntegrationsla()
	 * @generated
	 */
	void setIntegrationsla(IntegrationSLA value);

	/**
	 * Returns the value of the '<em><b>Guaranty</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link modelo.Guaranty#getNegotiationrules <em>Negotiationrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guaranty</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guaranty</em>' containment reference.
	 * @see #setGuaranty(Guaranty)
	 * @see modelo.ModeloPackage#getNegotiationRules_Guaranty()
	 * @see modelo.Guaranty#getNegotiationrules
	 * @model opposite="negotiationrules" containment="true"
	 * @generated
	 */
	Guaranty getGuaranty();

	/**
	 * Sets the value of the '{@link modelo.NegotiationRules#getGuaranty <em>Guaranty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guaranty</em>' containment reference.
	 * @see #getGuaranty()
	 * @generated
	 */
	void setGuaranty(Guaranty value);

} // NegotiationRules
