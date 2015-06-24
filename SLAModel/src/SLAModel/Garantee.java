/**
 */
package SLAModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Garantee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.Garantee#getObligations <em>Obligations</em>}</li>
 *   <li>{@link SLAModel.Garantee#getMetric <em>Metric</em>}</li>
 *   <li>{@link SLAModel.Garantee#getGaranteeName <em>Garantee Name</em>}</li>
 *   <li>{@link SLAModel.Garantee#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link SLAModel.Garantee#getServicedefinition <em>Servicedefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getGarantee()
 * @model
 * @generated
 */
public interface Garantee extends EObject {
	/**
	 * Returns the value of the '<em><b>Obligations</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.Obligations#getGarantee <em>Garantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obligations</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligations</em>' container reference.
	 * @see #setObligations(Obligations)
	 * @see SLAModel.SLAModelPackage#getGarantee_Obligations()
	 * @see SLAModel.Obligations#getGarantee
	 * @model opposite="garantee" transient="false"
	 * @generated
	 */
	Obligations getObligations();

	/**
	 * Sets the value of the '{@link SLAModel.Garantee#getObligations <em>Obligations</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obligations</em>' container reference.
	 * @see #getObligations()
	 * @generated
	 */
	void setObligations(Obligations value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' containment reference list.
	 * The list contents are of type {@link SLAModel.Metric}.
	 * It is bidirectional and its opposite is '{@link SLAModel.Metric#getGarantee <em>Garantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' containment reference list.
	 * @see SLAModel.SLAModelPackage#getGarantee_Metric()
	 * @see SLAModel.Metric#getGarantee
	 * @model opposite="garantee" containment="true"
	 * @generated
	 */
	EList<Metric> getMetric();

	/**
	 * Returns the value of the '<em><b>Garantee Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Garantee Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Garantee Name</em>' attribute.
	 * @see #setGaranteeName(String)
	 * @see SLAModel.SLAModelPackage#getGarantee_GaranteeName()
	 * @model
	 * @generated
	 */
	String getGaranteeName();

	/**
	 * Sets the value of the '{@link SLAModel.Garantee#getGaranteeName <em>Garantee Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Garantee Name</em>' attribute.
	 * @see #getGaranteeName()
	 * @generated
	 */
	void setGaranteeName(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see SLAModel.SLAModelPackage#getGarantee_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link SLAModel.Garantee#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Servicedefinition</b></em>' reference list.
	 * The list contents are of type {@link SLAModel.ServiceDefinition}.
	 * It is bidirectional and its opposite is '{@link SLAModel.ServiceDefinition#getGarantee <em>Garantee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicedefinition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicedefinition</em>' reference list.
	 * @see SLAModel.SLAModelPackage#getGarantee_Servicedefinition()
	 * @see SLAModel.ServiceDefinition#getGarantee
	 * @model opposite="garantee" required="true"
	 * @generated
	 */
	EList<ServiceDefinition> getServicedefinition();

} // Garantee
