/**
 */
package modelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.ServiceComposition#getQuery <em>Query</em>}</li>
 *   <li>{@link modelo.ServiceComposition#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getServiceComposition()
 * @model
 * @generated
 */
public interface ServiceComposition extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.Service#getServicecomposition <em>Servicecomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' container reference.
	 * @see #setService(Service)
	 * @see modelo.ModeloPackage#getServiceComposition_Service()
	 * @see modelo.Service#getServicecomposition
	 * @model opposite="servicecomposition" transient="false"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link modelo.ServiceComposition#getService <em>Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' container reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.Query#getServicecomposition <em>Servicecomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' container reference.
	 * @see #setQuery(Query)
	 * @see modelo.ModeloPackage#getServiceComposition_Query()
	 * @see modelo.Query#getServicecomposition
	 * @model opposite="servicecomposition" transient="false"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link modelo.ServiceComposition#getQuery <em>Query</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' container reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

} // ServiceComposition
