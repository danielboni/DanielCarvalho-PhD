/**
 */
package modelo;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.SLA#getSlaparameters <em>Slaparameters</em>}</li>
 *   <li>{@link modelo.SLA#getIntegrationsla <em>Integrationsla</em>}</li>
 *   <li>{@link modelo.SLA#getParty <em>Party</em>}</li>
 *   <li>{@link modelo.SLA#getObligation <em>Obligation</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getSLA()
 * @model
 * @generated
 */
public interface SLA extends EObject {
	/**
	 * Returns the value of the '<em><b>Slaparameters</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.SLAParameters}.
	 * It is bidirectional and its opposite is '{@link modelo.SLAParameters#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slaparameters</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slaparameters</em>' containment reference list.
	 * @see modelo.ModeloPackage#getSLA_Slaparameters()
	 * @see modelo.SLAParameters#getSla
	 * @model opposite="sla" containment="true"
	 * @generated
	 */
	EList<SLAParameters> getSlaparameters();

	/**
	 * Returns the value of the '<em><b>Integrationsla</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.IntegrationSLA}.
	 * It is bidirectional and its opposite is '{@link modelo.IntegrationSLA#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integrationsla</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrationsla</em>' containment reference list.
	 * @see modelo.ModeloPackage#getSLA_Integrationsla()
	 * @see modelo.IntegrationSLA#getSla
	 * @model opposite="sla" containment="true"
	 * @generated
	 */
	EList<IntegrationSLA> getIntegrationsla();

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.Party}.
	 * It is bidirectional and its opposite is '{@link modelo.Party#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' containment reference list.
	 * @see modelo.ModeloPackage#getSLA_Party()
	 * @see modelo.Party#getSla
	 * @model opposite="sla" containment="true"
	 * @generated
	 */
	EList<Party> getParty();

	/**
	 * Returns the value of the '<em><b>Obligation</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.Obligation}.
	 * It is bidirectional and its opposite is '{@link modelo.Obligation#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obligation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligation</em>' containment reference list.
	 * @see modelo.ModeloPackage#getSLA_Obligation()
	 * @see modelo.Obligation#getSla
	 * @model opposite="sla" containment="true"
	 * @generated
	 */
	EList<Obligation> getObligation();

} // SLA
