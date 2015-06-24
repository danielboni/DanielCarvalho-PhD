/**
 */
package SLAModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching Units</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SLAModel.MatchingUnits#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see SLAModel.SLAModelPackage#getMatchingUnits()
 * @model
 * @generated
 */
public interface MatchingUnits extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference list.
	 * The list contents are of type {@link SLAModel.Unit}.
	 * It is bidirectional and its opposite is '{@link SLAModel.Unit#getMatchingunits <em>Matchingunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference list.
	 * @see SLAModel.SLAModelPackage#getMatchingUnits_Unit()
	 * @see SLAModel.Unit#getMatchingunits
	 * @model opposite="matchingunits" lower="2" upper="2"
	 * @generated
	 */
	EList<Unit> getUnit();

} // MatchingUnits
