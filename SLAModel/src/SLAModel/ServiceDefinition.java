/**
 */
package SLAModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.ServiceDefinition#getSla <em>Sla</em>}</li>
 *   <li>{@link SLAModel.ServiceDefinition#getGarantee <em>Garantee</em>}</li>
 *   <li>{@link SLAModel.ServiceDefinition#getServiceComposition <em>Service Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getServiceDefinition()
 * @model
 * @generated
 */
public interface ServiceDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Sla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.SLA#getServicedefinition <em>Servicedefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sla</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sla</em>' container reference.
	 * @see #setSla(SLA)
	 * @see SLAModel.SLAModelPackage#getServiceDefinition_Sla()
	 * @see SLAModel.SLA#getServicedefinition
	 * @model opposite="servicedefinition" transient="false"
	 * @generated
	 */
	SLA getSla();

	/**
	 * Sets the value of the '{@link SLAModel.ServiceDefinition#getSla <em>Sla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sla</em>' container reference.
	 * @see #getSla()
	 * @generated
	 */
	void setSla(SLA value);

	/**
	 * Returns the value of the '<em><b>Garantee</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.Garantee#getServicedefinition <em>Servicedefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Garantee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Garantee</em>' reference.
	 * @see #setGarantee(Garantee)
	 * @see SLAModel.SLAModelPackage#getServiceDefinition_Garantee()
	 * @see SLAModel.Garantee#getServicedefinition
	 * @model opposite="servicedefinition"
	 * @generated
	 */
	Garantee getGarantee();

	/**
	 * Sets the value of the '{@link SLAModel.ServiceDefinition#getGarantee <em>Garantee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Garantee</em>' reference.
	 * @see #getGarantee()
	 * @generated
	 */
	void setGarantee(Garantee value);

	/**
	 * Returns the value of the '<em><b>Service Composition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.ServiceComposition#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Composition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Composition</em>' container reference.
	 * @see #setServiceComposition(ServiceComposition)
	 * @see SLAModel.SLAModelPackage#getServiceDefinition_ServiceComposition()
	 * @see SLAModel.ServiceComposition#getServices
	 * @model opposite="services" transient="false"
	 * @generated
	 */
	ServiceComposition getServiceComposition();

	/**
	 * Sets the value of the '{@link SLAModel.ServiceDefinition#getServiceComposition <em>Service Composition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Composition</em>' container reference.
	 * @see #getServiceComposition()
	 * @generated
	 */
	void setServiceComposition(ServiceComposition value);

} // ServiceDefinition
