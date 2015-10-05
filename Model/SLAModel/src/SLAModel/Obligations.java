/**
 */
package SLAModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obligations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.Obligations#getSla <em>Sla</em>}</li>
 *   <li>{@link SLAModel.Obligations#getGarantee <em>Garantee</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getObligations()
 * @model
 * @generated
 */
public interface Obligations extends EObject {
	/**
	 * Returns the value of the '<em><b>Sla</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.SLA#getObligations <em>Obligations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sla</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sla</em>' container reference.
	 * @see #setSla(SLA)
	 * @see SLAModel.SLAModelPackage#getObligations_Sla()
	 * @see SLAModel.SLA#getObligations
	 * @model opposite="obligations" transient="false"
	 * @generated
	 */
	SLA getSla();

	/**
	 * Sets the value of the '{@link SLAModel.Obligations#getSla <em>Sla</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sla</em>' container reference.
	 * @see #getSla()
	 * @generated
	 */
	void setSla(SLA value);

	/**
	 * Returns the value of the '<em><b>Garantee</b></em>' containment reference list.
	 * The list contents are of type {@link SLAModel.Garantee}.
	 * It is bidirectional and its opposite is '{@link SLAModel.Garantee#getObligations <em>Obligations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Garantee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Garantee</em>' containment reference list.
	 * @see SLAModel.SLAModelPackage#getObligations_Garantee()
	 * @see SLAModel.Garantee#getObligations
	 * @model opposite="obligations" containment="true"
	 * @generated
	 */
	EList<Garantee> getGarantee();

} // Obligations
