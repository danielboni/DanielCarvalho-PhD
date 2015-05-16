/**
 */
package modelo;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integration SLA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.IntegrationSLA#getSla <em>Sla</em>}</li>
 *   <li>{@link modelo.IntegrationSLA#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link modelo.IntegrationSLA#getNegotiationrules <em>Negotiationrules</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getIntegrationSLA()
 * @model
 * @generated
 */
public interface IntegrationSLA extends EObject {
	/**
	 * Returns the value of the '<em><b>Sla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.SLA#getIntegrationsla <em>Integrationsla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sla</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sla</em>' container reference.
	 * @see #setSla(SLA)
	 * @see modelo.ModeloPackage#getIntegrationSLA_Sla()
	 * @see modelo.SLA#getIntegrationsla
	 * @model opposite="integrationsla" transient="false"
	 * @generated
	 */
	SLA getSla();

	/**
	 * Sets the value of the '{@link modelo.IntegrationSLA#getSla <em>Sla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sla</em>' container reference.
	 * @see #getSla()
	 * @generated
	 */
	void setSla(SLA value);

	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.Concepts#getIntegrationsla <em>Integrationsla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concepts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' container reference.
	 * @see #setConcepts(Concepts)
	 * @see modelo.ModeloPackage#getIntegrationSLA_Concepts()
	 * @see modelo.Concepts#getIntegrationsla
	 * @model opposite="integrationsla" transient="false"
	 * @generated
	 */
	Concepts getConcepts();

	/**
	 * Sets the value of the '{@link modelo.IntegrationSLA#getConcepts <em>Concepts</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concepts</em>' container reference.
	 * @see #getConcepts()
	 * @generated
	 */
	void setConcepts(Concepts value);

	/**
	 * Returns the value of the '<em><b>Negotiationrules</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.NegotiationRules}.
	 * It is bidirectional and its opposite is '{@link modelo.NegotiationRules#getIntegrationsla <em>Integrationsla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negotiationrules</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negotiationrules</em>' containment reference list.
	 * @see modelo.ModeloPackage#getIntegrationSLA_Negotiationrules()
	 * @see modelo.NegotiationRules#getIntegrationsla
	 * @model opposite="integrationsla" containment="true"
	 * @generated
	 */
	EList<NegotiationRules> getNegotiationrules();

} // IntegrationSLA
