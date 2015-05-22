/**
 */
package SLAModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.Metric#getGarantee <em>Garantee</em>}</li>
 *   <li>{@link SLAModel.Metric#getMetricName <em>Metric Name</em>}</li>
 *   <li>{@link SLAModel.Metric#getUnit <em>Unit</em>}</li>
 *   <li>{@link SLAModel.Metric#getValue <em>Value</em>}</li>
 *   <li>{@link SLAModel.Metric#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link SLAModel.Metric#getMetricID <em>Metric ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getMetric()
 * @model
 * @generated
 */
public interface Metric extends EObject {
	/**
	 * Returns the value of the '<em><b>Garantee</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SLAModel.Garantee#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Garantee</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Garantee</em>' container reference.
	 * @see #setGarantee(Garantee)
	 * @see SLAModel.SLAModelPackage#getMetric_Garantee()
	 * @see SLAModel.Garantee#getMetric
	 * @model opposite="metric" transient="false"
	 * @generated
	 */
	Garantee getGarantee();

	/**
	 * Sets the value of the '{@link SLAModel.Metric#getGarantee <em>Garantee</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Garantee</em>' container reference.
	 * @see #getGarantee()
	 * @generated
	 */
	void setGarantee(Garantee value);

	/**
	 * Returns the value of the '<em><b>Metric Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Name</em>' attribute.
	 * @see #setMetricName(String)
	 * @see SLAModel.SLAModelPackage#getMetric_MetricName()
	 * @model
	 * @generated
	 */
	String getMetricName();

	/**
	 * Sets the value of the '{@link SLAModel.Metric#getMetricName <em>Metric Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Name</em>' attribute.
	 * @see #getMetricName()
	 * @generated
	 */
	void setMetricName(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see SLAModel.SLAModelPackage#getMetric_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link SLAModel.Metric#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see SLAModel.SLAModelPackage#getMetric_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link SLAModel.Metric#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #setPredicate(String)
	 * @see SLAModel.SLAModelPackage#getMetric_Predicate()
	 * @model
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link SLAModel.Metric#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);

	/**
	 * Returns the value of the '<em><b>Metric ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric ID</em>' attribute.
	 * @see #setMetricID(String)
	 * @see SLAModel.SLAModelPackage#getMetric_MetricID()
	 * @model
	 * @generated
	 */
	String getMetricID();

	/**
	 * Sets the value of the '{@link SLAModel.Metric#getMetricID <em>Metric ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric ID</em>' attribute.
	 * @see #getMetricID()
	 * @generated
	 */
	void setMetricID(String value);

} // Metric
