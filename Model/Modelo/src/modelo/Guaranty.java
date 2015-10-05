/**
 */
package modelo;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guaranty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.Guaranty#getSlaparameters <em>Slaparameters</em>}</li>
 *   <li>{@link modelo.Guaranty#getGuaranty <em>Guaranty</em>}</li>
 *   <li>{@link modelo.Guaranty#getGuarantyeOpposite <em>Guarantye Opposite</em>}</li>
 *   <li>{@link modelo.Guaranty#getNegotiationrules <em>Negotiationrules</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getGuaranty()
 * @model
 * @generated
 */
public interface Guaranty extends EObject {
	/**
	 * Returns the value of the '<em><b>Slaparameters</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.SLAParameters}.
	 * It is bidirectional and its opposite is '{@link modelo.SLAParameters#getGuaranty <em>Guaranty</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slaparameters</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slaparameters</em>' containment reference list.
	 * @see modelo.ModeloPackage#getGuaranty_Slaparameters()
	 * @see modelo.SLAParameters#getGuaranty
	 * @model opposite="guaranty" containment="true"
	 * @generated
	 */
	EList<SLAParameters> getSlaparameters();

	/**
	 * Returns the value of the '<em><b>Guaranty</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.Guaranty}.
	 * It is bidirectional and its opposite is '{@link modelo.Guaranty#getGuarantyeOpposite <em>Guarantye Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guaranty</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guaranty</em>' containment reference list.
	 * @see modelo.ModeloPackage#getGuaranty_Guaranty()
	 * @see modelo.Guaranty#getGuarantyeOpposite
	 * @model opposite="guarantyeOpposite" containment="true"
	 * @generated
	 */
	EList<Guaranty> getGuaranty();

	/**
	 * Returns the value of the '<em><b>Guarantye Opposite</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.Guaranty#getGuaranty <em>Guaranty</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guarantye Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guarantye Opposite</em>' container reference.
	 * @see #setGuarantyeOpposite(Guaranty)
	 * @see modelo.ModeloPackage#getGuaranty_GuarantyeOpposite()
	 * @see modelo.Guaranty#getGuaranty
	 * @model opposite="guaranty" transient="false"
	 * @generated
	 */
	Guaranty getGuarantyeOpposite();

	/**
	 * Sets the value of the '{@link modelo.Guaranty#getGuarantyeOpposite <em>Guarantye Opposite</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guarantye Opposite</em>' container reference.
	 * @see #getGuarantyeOpposite()
	 * @generated
	 */
	void setGuarantyeOpposite(Guaranty value);

	/**
	 * Returns the value of the '<em><b>Negotiationrules</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.NegotiationRules#getGuaranty <em>Guaranty</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negotiationrules</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negotiationrules</em>' container reference.
	 * @see #setNegotiationrules(NegotiationRules)
	 * @see modelo.ModeloPackage#getGuaranty_Negotiationrules()
	 * @see modelo.NegotiationRules#getGuaranty
	 * @model opposite="guaranty" transient="false"
	 * @generated
	 */
	NegotiationRules getNegotiationrules();

	/**
	 * Sets the value of the '{@link modelo.Guaranty#getNegotiationrules <em>Negotiationrules</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negotiationrules</em>' container reference.
	 * @see #getNegotiationrules()
	 * @generated
	 */
	void setNegotiationrules(NegotiationRules value);

} // Guaranty
