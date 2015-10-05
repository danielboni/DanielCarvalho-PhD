/**
 */
package SLAModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.Parties#getServiceconsumer <em>Serviceconsumer</em>}</li>
 *   <li>{@link SLAModel.Parties#getServiceprovider <em>Serviceprovider</em>}</li>
 *   <li>{@link SLAModel.Parties#getSla <em>Sla</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getParties()
 * @model
 * @generated
 */
public interface Parties extends EObject {
	/**
	 * Returns the value of the '<em><b>Serviceconsumer</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.ServiceConsumer#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviceconsumer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceconsumer</em>' containment reference.
	 * @see #setServiceconsumer(ServiceConsumer)
	 * @see SLAModel.SLAModelPackage#getParties_Serviceconsumer()
	 * @see SLAModel.ServiceConsumer#getParties
	 * @model opposite="parties" containment="true"
	 * @generated
	 */
	ServiceConsumer getServiceconsumer();

	/**
	 * Sets the value of the '{@link SLAModel.Parties#getServiceconsumer <em>Serviceconsumer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviceconsumer</em>' containment reference.
	 * @see #getServiceconsumer()
	 * @generated
	 */
	void setServiceconsumer(ServiceConsumer value);

	/**
	 * Returns the value of the '<em><b>Serviceprovider</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.ServiceProvider#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviceprovider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviceprovider</em>' containment reference.
	 * @see #setServiceprovider(ServiceProvider)
	 * @see SLAModel.SLAModelPackage#getParties_Serviceprovider()
	 * @see SLAModel.ServiceProvider#getParties
	 * @model opposite="parties" containment="true"
	 * @generated
	 */
	ServiceProvider getServiceprovider();

	/**
	 * Sets the value of the '{@link SLAModel.Parties#getServiceprovider <em>Serviceprovider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviceprovider</em>' containment reference.
	 * @see #getServiceprovider()
	 * @generated
	 */
	void setServiceprovider(ServiceProvider value);

	/**
	 * Returns the value of the '<em><b>Sla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.SLA#getParties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sla</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sla</em>' container reference.
	 * @see #setSla(SLA)
	 * @see SLAModel.SLAModelPackage#getParties_Sla()
	 * @see SLAModel.SLA#getParties
	 * @model opposite="parties" transient="false"
	 * @generated
	 */
	SLA getSla();

	/**
	 * Sets the value of the '{@link SLAModel.Parties#getSla <em>Sla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sla</em>' container reference.
	 * @see #getSla()
	 * @generated
	 */
	void setSla(SLA value);

} // Parties
