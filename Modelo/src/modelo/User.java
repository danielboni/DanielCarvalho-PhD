/**
 */
package modelo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.User#getCloud <em>Cloud</em>}</li>
 *   <li>{@link modelo.User#getUsersla <em>Usersla</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Party {
	/**
	 * Returns the value of the '<em><b>Cloud</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link modelo.Cloud#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud</em>' reference.
	 * @see #setCloud(Cloud)
	 * @see modelo.ModeloPackage#getUser_Cloud()
	 * @see modelo.Cloud#getUser
	 * @model opposite="user"
	 * @generated
	 */
	Cloud getCloud();

	/**
	 * Sets the value of the '{@link modelo.User#getCloud <em>Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud</em>' reference.
	 * @see #getCloud()
	 * @generated
	 */
	void setCloud(Cloud value);

	/**
	 * Returns the value of the '<em><b>Usersla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.UserSLA#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usersla</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usersla</em>' container reference.
	 * @see #setUsersla(UserSLA)
	 * @see modelo.ModeloPackage#getUser_Usersla()
	 * @see modelo.UserSLA#getUser
	 * @model opposite="user" transient="false"
	 * @generated
	 */
	UserSLA getUsersla();

	/**
	 * Sets the value of the '{@link modelo.User#getUsersla <em>Usersla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usersla</em>' container reference.
	 * @see #getUsersla()
	 * @generated
	 */
	void setUsersla(UserSLA value);

} // User
