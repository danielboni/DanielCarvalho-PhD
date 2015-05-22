/**
 */
package SLAModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.ServiceProvider#getParties <em>Parties</em>}</li>
 *   <li>{@link SLAModel.ServiceProvider#getServiceProviderName <em>Service Provider Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getServiceProvider()
 * @model
 * @generated
 */
public interface ServiceProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Parties</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.Parties#getServiceprovider <em>Serviceprovider</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parties</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parties</em>' container reference.
	 * @see #setParties(Parties)
	 * @see SLAModel.SLAModelPackage#getServiceProvider_Parties()
	 * @see SLAModel.Parties#getServiceprovider
	 * @model opposite="serviceprovider" transient="false"
	 * @generated
	 */
	Parties getParties();

	/**
	 * Sets the value of the '{@link SLAModel.ServiceProvider#getParties <em>Parties</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parties</em>' container reference.
	 * @see #getParties()
	 * @generated
	 */
	void setParties(Parties value);

	/**
	 * Returns the value of the '<em><b>Service Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provider Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provider Name</em>' attribute.
	 * @see #setServiceProviderName(String)
	 * @see SLAModel.SLAModelPackage#getServiceProvider_ServiceProviderName()
	 * @model
	 * @generated
	 */
	String getServiceProviderName();

	/**
	 * Sets the value of the '{@link SLAModel.ServiceProvider#getServiceProviderName <em>Service Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider Name</em>' attribute.
	 * @see #getServiceProviderName()
	 * @generated
	 */
	void setServiceProviderName(String value);

} // ServiceProvider
