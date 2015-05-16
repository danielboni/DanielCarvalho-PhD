/**
 */
package modelo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.Cloud#getUser <em>User</em>}</li>
 *   <li>{@link modelo.Cloud#getService <em>Service</em>}</li>
 *   <li>{@link modelo.Cloud#getUsersla <em>Usersla</em>}</li>
 *   <li>{@link modelo.Cloud#getServicesla <em>Servicesla</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getCloud()
 * @model
 * @generated
 */
public interface Cloud extends Party {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link modelo.User#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see modelo.ModeloPackage#getCloud_User()
	 * @see modelo.User#getCloud
	 * @model opposite="cloud"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link modelo.Cloud#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link modelo.Service#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see modelo.ModeloPackage#getCloud_Service()
	 * @see modelo.Service#getCloud
	 * @model opposite="cloud"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link modelo.Cloud#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Usersla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.UserSLA#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usersla</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usersla</em>' container reference.
	 * @see #setUsersla(UserSLA)
	 * @see modelo.ModeloPackage#getCloud_Usersla()
	 * @see modelo.UserSLA#getCloud
	 * @model opposite="cloud" transient="false"
	 * @generated
	 */
	UserSLA getUsersla();

	/**
	 * Sets the value of the '{@link modelo.Cloud#getUsersla <em>Usersla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usersla</em>' container reference.
	 * @see #getUsersla()
	 * @generated
	 */
	void setUsersla(UserSLA value);

	/**
	 * Returns the value of the '<em><b>Servicesla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.ServiceSLA#getCloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicesla</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicesla</em>' container reference.
	 * @see #setServicesla(ServiceSLA)
	 * @see modelo.ModeloPackage#getCloud_Servicesla()
	 * @see modelo.ServiceSLA#getCloud
	 * @model opposite="cloud" transient="false"
	 * @generated
	 */
	ServiceSLA getServicesla();

	/**
	 * Sets the value of the '{@link modelo.Cloud#getServicesla <em>Servicesla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicesla</em>' container reference.
	 * @see #getServicesla()
	 * @generated
	 */
	void setServicesla(ServiceSLA value);

} // Cloud
