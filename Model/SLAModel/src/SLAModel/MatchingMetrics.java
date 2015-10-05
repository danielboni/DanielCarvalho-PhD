/**
 */
package SLAModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.MatchingMetrics#getMetric <em>Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getMatchingMetrics()
 * @model
 * @generated
 */
public interface MatchingMetrics extends EObject {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.Metric#getMatchingmetrics <em>Matchingmetrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(Metric)
	 * @see SLAModel.SLAModelPackage#getMatchingMetrics_Metric()
	 * @see SLAModel.Metric#getMatchingmetrics
	 * @model opposite="matchingmetrics"
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link SLAModel.MatchingMetrics#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

} // MatchingMetrics
