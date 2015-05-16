/**
 */
package modelo;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concepts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelo.Concepts#getIntegrationsla <em>Integrationsla</em>}</li>
 *   <li>{@link modelo.Concepts#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelo.ModeloPackage#getConcepts()
 * @model
 * @generated
 */
public interface Concepts extends EObject {
	/**
	 * Returns the value of the '<em><b>Integrationsla</b></em>' containment reference list.
	 * The list contents are of type {@link modelo.IntegrationSLA}.
	 * It is bidirectional and its opposite is '{@link modelo.IntegrationSLA#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integrationsla</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integrationsla</em>' containment reference list.
	 * @see modelo.ModeloPackage#getConcepts_Integrationsla()
	 * @see modelo.IntegrationSLA#getConcepts
	 * @model opposite="concepts" containment="true"
	 * @generated
	 */
	EList<IntegrationSLA> getIntegrationsla();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link modelo.Query#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' container reference.
	 * @see #setQuery(Query)
	 * @see modelo.ModeloPackage#getConcepts_Query()
	 * @see modelo.Query#getConcepts
	 * @model opposite="concepts" transient="false"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link modelo.Concepts#getQuery <em>Query</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' container reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

} // Concepts
