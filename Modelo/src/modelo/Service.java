/**
 */
package modelo;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.Service#getQuery <em>Query</em>}</li>
 *   <li>{@link modelo.Service#getCloud <em>Cloud</em>}</li>
 *   <li>{@link modelo.Service#getServicesla <em>Servicesla</em>}</li>
 *   <li>{@link modelo.Service#getServicecomposition <em>Servicecomposition</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Party {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.Query}.
	 * It is bidirectional and its opposite is '{@link modelo.Query#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference list.
	 * @see modelo.ModeloPackage#getService_Query()
	 * @see modelo.Query#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	EList<Query> getQuery();

	/**
	 * Returns the value of the '<em><b>Servicecomposition</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.ServiceComposition}.
	 * It is bidirectional and its opposite is '{@link modelo.ServiceComposition#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicecomposition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicecomposition</em>' containment reference list.
	 * @see modelo.ModeloPackage#getService_Servicecomposition()
	 * @see modelo.ServiceComposition#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	EList<ServiceComposition> getServicecomposition();

	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link modelo.Cloud#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' reference.
	 * @see #setCloud(Cloud)
	 * @see modelo.ModeloPackage#getService_Cloud()
	 * @see modelo.Cloud#getService
	 * @model opposite="service"
	 * @generated
	 */
	Cloud getCloud();

	/**
	 * Sets the value of the '{@link modelo.Service#getCloud <em>Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud</em>' reference.
	 * @see #getCloud()
	 * @generated
	 */
	void setCloud(Cloud value);

	/**
	 * Returns the value of the '<em><b>Servicesla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.ServiceSLA#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicesla</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicesla</em>' container reference.
	 * @see #setServicesla(ServiceSLA)
	 * @see modelo.ModeloPackage#getService_Servicesla()
	 * @see modelo.ServiceSLA#getService
	 * @model opposite="service" transient="false"
	 * @generated
	 */
	ServiceSLA getServicesla();

	/**
	 * Sets the value of the '{@link modelo.Service#getServicesla <em>Servicesla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicesla</em>' container reference.
	 * @see #getServicesla()
	 * @generated
	 */
	void setServicesla(ServiceSLA value);

} // Service
