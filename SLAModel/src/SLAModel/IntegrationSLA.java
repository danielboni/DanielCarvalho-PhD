/**
 */
package SLAModel;

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
 *   <li>{@link SLAModel.IntegrationSLA#getQuery <em>Query</em>}</li>
 *   <li>{@link SLAModel.IntegrationSLA#getServiceComposition <em>Service Composition</em>}</li>
 *   <li>{@link SLAModel.IntegrationSLA#getSlas <em>Slas</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getIntegrationSLA()
 * @model
 * @generated
 */
public interface IntegrationSLA extends EObject {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.Query#getIntegrationsla <em>Integrationsla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Query)
	 * @see SLAModel.SLAModelPackage#getIntegrationSLA_Query()
	 * @see SLAModel.Query#getIntegrationsla
	 * @model opposite="integrationsla" containment="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link SLAModel.IntegrationSLA#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Service Composition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.ServiceComposition#getIntegrationSLA <em>Integration SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Composition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Composition</em>' containment reference.
	 * @see #setServiceComposition(ServiceComposition)
	 * @see SLAModel.SLAModelPackage#getIntegrationSLA_ServiceComposition()
	 * @see SLAModel.ServiceComposition#getIntegrationSLA
	 * @model opposite="integrationSLA" containment="true"
	 * @generated
	 */
	ServiceComposition getServiceComposition();

	/**
	 * Sets the value of the '{@link SLAModel.IntegrationSLA#getServiceComposition <em>Service Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Composition</em>' containment reference.
	 * @see #getServiceComposition()
	 * @generated
	 */
	void setServiceComposition(ServiceComposition value);

	/**
	 * Returns the value of the '<em><b>Slas</b></em>' containment reference list.
	 * The list contents are of type {@link SLAModel.SLA}.
	 * It is bidirectional and its opposite is '{@link SLAModel.SLA#getIntegrationSLA <em>Integration SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slas</em>' containment reference list.
	 * @see SLAModel.SLAModelPackage#getIntegrationSLA_Slas()
	 * @see SLAModel.SLA#getIntegrationSLA
	 * @model opposite="integrationSLA" containment="true" required="true"
	 * @generated
	 */
	EList<SLA> getSlas();

} // IntegrationSLA
