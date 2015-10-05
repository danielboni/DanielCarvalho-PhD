/**
 */
package modelo;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.Query#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link modelo.Query#getQuery <em>Query</em>}</li>
 *   <li>{@link modelo.Query#getQueryeOpposite <em>Querye Opposite</em>}</li>
 *   <li>{@link modelo.Query#getService <em>Service</em>}</li>
 *   <li>{@link modelo.Query#getServicecomposition <em>Servicecomposition</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.Concepts}.
	 * It is bidirectional and its opposite is '{@link modelo.Concepts#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concepts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' containment reference list.
	 * @see modelo.ModeloPackage#getQuery_Concepts()
	 * @see modelo.Concepts#getQuery
	 * @model opposite="query" containment="true"
	 * @generated
	 */
	EList<Concepts> getConcepts();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.Query}.
	 * It is bidirectional and its opposite is '{@link modelo.Query#getQueryeOpposite <em>Querye Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference list.
	 * @see modelo.ModeloPackage#getQuery_Query()
	 * @see modelo.Query#getQueryeOpposite
	 * @model opposite="queryeOpposite" containment="true"
	 * @generated
	 */
	EList<Query> getQuery();

	/**
	 * Returns the value of the '<em><b>Querye Opposite</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.Query#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Querye Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Querye Opposite</em>' container reference.
	 * @see #setQueryeOpposite(Query)
	 * @see modelo.ModeloPackage#getQuery_QueryeOpposite()
	 * @see modelo.Query#getQuery
	 * @model opposite="query" transient="false"
	 * @generated
	 */
	Query getQueryeOpposite();

	/**
	 * Sets the value of the '{@link modelo.Query#getQueryeOpposite <em>Querye Opposite</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Querye Opposite</em>' container reference.
	 * @see #getQueryeOpposite()
	 * @generated
	 */
	void setQueryeOpposite(Query value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.Service#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' container reference.
	 * @see #setService(Service)
	 * @see modelo.ModeloPackage#getQuery_Service()
	 * @see modelo.Service#getQuery
	 * @model opposite="query" transient="false"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link modelo.Query#getService <em>Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' container reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Servicecomposition</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.ServiceComposition}.
	 * It is bidirectional and its opposite is '{@link modelo.ServiceComposition#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicecomposition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicecomposition</em>' containment reference list.
	 * @see modelo.ModeloPackage#getQuery_Servicecomposition()
	 * @see modelo.ServiceComposition#getQuery
	 * @model opposite="query" containment="true"
	 * @generated
	 */
	EList<ServiceComposition> getServicecomposition();

} // Query
