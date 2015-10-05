/**
 */
package SLAModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.Query#getServicecomposition <em>Servicecomposition</em>}</li>
 *   <li>{@link SLAModel.Query#getIntegrationsla <em>Integrationsla</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Servicecomposition</b></em>' containment reference list.
	 * The list contents are of type {@link SLAModel.ServiceComposition}.
	 * It is bidirectional and its opposite is '{@link SLAModel.ServiceComposition#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicecomposition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicecomposition</em>' containment reference list.
	 * @see SLAModel.SLAModelPackage#getQuery_Servicecomposition()
	 * @see SLAModel.ServiceComposition#getQuery
	 * @model opposite="query" containment="true"
	 * @generated
	 */
	EList<ServiceComposition> getServicecomposition();

	/**
	 * Returns the value of the '<em><b>Integrationsla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.IntegrationSLA#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integrationsla</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrationsla</em>' container reference.
	 * @see #setIntegrationsla(IntegrationSLA)
	 * @see SLAModel.SLAModelPackage#getQuery_Integrationsla()
	 * @see SLAModel.IntegrationSLA#getQuery
	 * @model opposite="query" transient="false"
	 * @generated
	 */
	IntegrationSLA getIntegrationsla();

	/**
	 * Sets the value of the '{@link SLAModel.Query#getIntegrationsla <em>Integrationsla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrationsla</em>' container reference.
	 * @see #getIntegrationsla()
	 * @generated
	 */
	void setIntegrationsla(IntegrationSLA value);

} // Query
