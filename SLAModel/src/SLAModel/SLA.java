/**
 */
package SLAModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.SLA#getObligations <em>Obligations</em>}</li>
 *   <li>{@link SLAModel.SLA#getParties <em>Parties</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getSLA()
 * @model
 * @generated
 */
public interface SLA extends EObject {
	/**
	 * Returns the value of the '<em><b>Obligations</b></em>' containment reference list.
	 * The list contents are of type {@link SLAModel.Obligations}.
	 * It is bidirectional and its opposite is '{@link SLAModel.Obligations#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obligations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligations</em>' containment reference list.
	 * @see SLAModel.SLAModelPackage#getSLA_Obligations()
	 * @see SLAModel.Obligations#getSla
	 * @model opposite="sla" containment="true" required="true"
	 * @generated
	 */
	EList<Obligations> getObligations();

	/**
	 * Returns the value of the '<em><b>Parties</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.Parties#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parties</em>' containment reference.
	 * @see #setParties(Parties)
	 * @see SLAModel.SLAModelPackage#getSLA_Parties()
	 * @see SLAModel.Parties#getSla
	 * @model opposite="sla" containment="true"
	 * @generated
	 */
	Parties getParties();

	/**
	 * Sets the value of the '{@link SLAModel.SLA#getParties <em>Parties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parties</em>' containment reference.
	 * @see #getParties()
	 * @generated
	 */
	void setParties(Parties value);

} // SLA
