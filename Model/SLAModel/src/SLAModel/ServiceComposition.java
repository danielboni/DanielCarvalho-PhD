/**
 */
package SLAModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.ServiceComposition#getQuery <em>Query</em>}</li>
 *   <li>{@link SLAModel.ServiceComposition#getIntegrationSLA <em>Integration SLA</em>}</li>
 *   <li>{@link SLAModel.ServiceComposition#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getServiceComposition()
 * @model
 * @generated
 */
public interface ServiceComposition extends EObject {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.Query#getServicecomposition <em>Servicecomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' container reference.
	 * @see #setQuery(Query)
	 * @see SLAModel.SLAModelPackage#getServiceComposition_Query()
	 * @see SLAModel.Query#getServicecomposition
	 * @model opposite="servicecomposition" transient="false"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link SLAModel.ServiceComposition#getQuery <em>Query</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' container reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Integration SLA</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.IntegrationSLA#getServiceComposition <em>Service Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integration SLA</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integration SLA</em>' container reference.
	 * @see #setIntegrationSLA(IntegrationSLA)
	 * @see SLAModel.SLAModelPackage#getServiceComposition_IntegrationSLA()
	 * @see SLAModel.IntegrationSLA#getServiceComposition
	 * @model opposite="serviceComposition" transient="false"
	 * @generated
	 */
	IntegrationSLA getIntegrationSLA();

	/**
	 * Sets the value of the '{@link SLAModel.ServiceComposition#getIntegrationSLA <em>Integration SLA</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integration SLA</em>' container reference.
	 * @see #getIntegrationSLA()
	 * @generated
	 */
	void setIntegrationSLA(IntegrationSLA value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link SLAModel.ServiceDefinition}.
	 * It is bidirectional and its opposite is '{@link SLAModel.ServiceDefinition#getServiceComposition <em>Service Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see SLAModel.SLAModelPackage#getServiceComposition_Services()
	 * @see SLAModel.ServiceDefinition#getServiceComposition
	 * @model opposite="serviceComposition" containment="true"
	 * @generated
	 */
	EList<ServiceDefinition> getServices();

} // ServiceComposition
