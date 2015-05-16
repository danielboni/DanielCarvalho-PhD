/**
 */
package modelo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User SLA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.UserSLA#getUser <em>User</em>}</li>
 *   <li>{@link modelo.UserSLA#getCloud <em>Cloud</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getUserSLA()
 * @model
 * @generated
 */
public interface UserSLA extends SLA {

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link modelo.User#getUsersla <em>Usersla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(User)
	 * @see modelo.ModeloPackage#getUserSLA_User()
	 * @see modelo.User#getUsersla
	 * @model opposite="usersla" containment="true" required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link modelo.UserSLA#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link modelo.Cloud#getUsersla <em>Usersla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' containment reference.
	 * @see #setCloud(Cloud)
	 * @see modelo.ModeloPackage#getUserSLA_Cloud()
	 * @see modelo.Cloud#getUsersla
	 * @model opposite="usersla" containment="true" required="true"
	 * @generated
	 */
	Cloud getCloud();

	/**
	 * Sets the value of the '{@link modelo.UserSLA#getCloud <em>Cloud</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud</em>' containment reference.
	 * @see #getCloud()
	 * @generated
	 */
	void setCloud(Cloud value);
} // UserSLA
