/**
 */
package SLAModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.ServiceConsumer#getParties <em>Parties</em>}</li>
 *   <li>{@link SLAModel.ServiceConsumer#getServiceConsumerName <em>Service Consumer Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getServiceConsumer()
 * @model
 * @generated
 */
public interface ServiceConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Parties</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.Parties#getServiceconsumer <em>Serviceconsumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parties</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parties</em>' container reference.
	 * @see #setParties(Parties)
	 * @see SLAModel.SLAModelPackage#getServiceConsumer_Parties()
	 * @see SLAModel.Parties#getServiceconsumer
	 * @model opposite="serviceconsumer" transient="false"
	 * @generated
	 */
	Parties getParties();

	/**
	 * Sets the value of the '{@link SLAModel.ServiceConsumer#getParties <em>Parties</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parties</em>' container reference.
	 * @see #getParties()
	 * @generated
	 */
	void setParties(Parties value);

	/**
	 * Returns the value of the '<em><b>Service Consumer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Consumer Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Consumer Name</em>' attribute.
	 * @see #setServiceConsumerName(String)
	 * @see SLAModel.SLAModelPackage#getServiceConsumer_ServiceConsumerName()
	 * @model
	 * @generated
	 */
	String getServiceConsumerName();

	/**
	 * Sets the value of the '{@link SLAModel.ServiceConsumer#getServiceConsumerName <em>Service Consumer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Consumer Name</em>' attribute.
	 * @see #getServiceConsumerName()
	 * @generated
	 */
	void setServiceConsumerName(String value);

} // ServiceConsumer
