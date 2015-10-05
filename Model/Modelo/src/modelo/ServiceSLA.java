/**
 */
package modelo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service SLA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.ServiceSLA#getCloud <em>Cloud</em>}</li>
 *   <li>{@link modelo.ServiceSLA#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getServiceSLA()
 * @model
 * @generated
 */
public interface ServiceSLA extends SLA {

	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link modelo.Cloud#getServicesla <em>Servicesla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' containment reference.
	 * @see #setCloud(Cloud)
	 * @see modelo.ModeloPackage#getServiceSLA_Cloud()
	 * @see modelo.Cloud#getServicesla
	 * @model opposite="servicesla" containment="true" required="true"
	 * @generated
	 */
	Cloud getCloud();

	/**
	 * Sets the value of the '{@link modelo.ServiceSLA#getCloud <em>Cloud</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud</em>' containment reference.
	 * @see #getCloud()
	 * @generated
	 */
	void setCloud(Cloud value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link modelo.Service#getServicesla <em>Servicesla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(Service)
	 * @see modelo.ModeloPackage#getServiceSLA_Service()
	 * @see modelo.Service#getServicesla
	 * @model opposite="servicesla" containment="true" required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link modelo.ServiceSLA#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);
} // ServiceSLA
