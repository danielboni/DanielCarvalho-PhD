/**
 */
package SLAModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.Unit#getMetric <em>Metric</em>}</li>
 *   <li>{@link SLAModel.Unit#getMatchingunits <em>Matchingunits</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EObject {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.Metric#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' container reference.
	 * @see #setMetric(Metric)
	 * @see SLAModel.SLAModelPackage#getUnit_Metric()
	 * @see SLAModel.Metric#getUnit
	 * @model opposite="unit" transient="false"
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link SLAModel.Unit#getMetric <em>Metric</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' container reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

	/**
	 * Returns the value of the '<em><b>Matchingunits</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.MatchingUnits#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matchingunits</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchingunits</em>' reference.
	 * @see #setMatchingunits(MatchingUnits)
	 * @see SLAModel.SLAModelPackage#getUnit_Matchingunits()
	 * @see SLAModel.MatchingUnits#getUnit
	 * @model opposite="unit" required="true"
	 * @generated
	 */
	MatchingUnits getMatchingunits();

	/**
	 * Sets the value of the '{@link SLAModel.Unit#getMatchingunits <em>Matchingunits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchingunits</em>' reference.
	 * @see #getMatchingunits()
	 * @generated
	 */
	void setMatchingunits(MatchingUnits value);

} // Unit
