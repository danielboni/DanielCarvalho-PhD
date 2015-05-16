/**
 */
package modelo.impl;

import java.util.Collection;
import modelo.IntegrationSLA;
import modelo.ModeloPackage;
import modelo.Obligation;
import modelo.Party;
import modelo.SLA;
import modelo.SLAParameters;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SLA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelo.impl.SLAImpl#getSlaparameters <em>Slaparameters</em>}</li>
 *   <li>{@link modelo.impl.SLAImpl#getIntegrationsla <em>Integrationsla</em>}</li>
 *   <li>{@link modelo.impl.SLAImpl#getParty <em>Party</em>}</li>
 *   <li>{@link modelo.impl.SLAImpl#getObligation <em>Obligation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SLAImpl extends MinimalEObjectImpl.Container implements SLA {
	/**
	 * The cached value of the '{@link #getSlaparameters() <em>Slaparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SLAParameters> slaparameters;

	/**
	 * The cached value of the '{@link #getIntegrationsla() <em>Integrationsla</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationsla()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrationSLA> integrationsla;

	/**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected EList<Party> party;

	/**
	 * The cached value of the '{@link #getObligation() <em>Obligation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligation()
	 * @generated
	 * @ordered
	 */
	protected EList<Obligation> obligation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.SLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SLAParameters> getSlaparameters() {
		if (slaparameters == null) {
			slaparameters = new EObjectContainmentWithInverseEList<SLAParameters>(SLAParameters.class, this, ModeloPackage.SLA__SLAPARAMETERS, ModeloPackage.SLA_PARAMETERS__SLA);
		}
		return slaparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrationSLA> getIntegrationsla() {
		if (integrationsla == null) {
			integrationsla = new EObjectContainmentWithInverseEList<IntegrationSLA>(IntegrationSLA.class, this, ModeloPackage.SLA__INTEGRATIONSLA, ModeloPackage.INTEGRATION_SLA__SLA);
		}
		return integrationsla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Party> getParty() {
		if (party == null) {
			party = new EObjectContainmentWithInverseEList<Party>(Party.class, this, ModeloPackage.SLA__PARTY, ModeloPackage.PARTY__SLA);
		}
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Obligation> getObligation() {
		if (obligation == null) {
			obligation = new EObjectContainmentWithInverseEList<Obligation>(Obligation.class, this, ModeloPackage.SLA__OBLIGATION, ModeloPackage.OBLIGATION__SLA);
		}
		return obligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloPackage.SLA__SLAPARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSlaparameters()).basicAdd(otherEnd, msgs);
			case ModeloPackage.SLA__INTEGRATIONSLA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegrationsla()).basicAdd(otherEnd, msgs);
			case ModeloPackage.SLA__PARTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParty()).basicAdd(otherEnd, msgs);
			case ModeloPackage.SLA__OBLIGATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObligation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloPackage.SLA__SLAPARAMETERS:
				return ((InternalEList<?>)getSlaparameters()).basicRemove(otherEnd, msgs);
			case ModeloPackage.SLA__INTEGRATIONSLA:
				return ((InternalEList<?>)getIntegrationsla()).basicRemove(otherEnd, msgs);
			case ModeloPackage.SLA__PARTY:
				return ((InternalEList<?>)getParty()).basicRemove(otherEnd, msgs);
			case ModeloPackage.SLA__OBLIGATION:
				return ((InternalEList<?>)getObligation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloPackage.SLA__SLAPARAMETERS:
				return getSlaparameters();
			case ModeloPackage.SLA__INTEGRATIONSLA:
				return getIntegrationsla();
			case ModeloPackage.SLA__PARTY:
				return getParty();
			case ModeloPackage.SLA__OBLIGATION:
				return getObligation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModeloPackage.SLA__SLAPARAMETERS:
				getSlaparameters().clear();
				getSlaparameters().addAll((Collection<? extends SLAParameters>)newValue);
				return;
			case ModeloPackage.SLA__INTEGRATIONSLA:
				getIntegrationsla().clear();
				getIntegrationsla().addAll((Collection<? extends IntegrationSLA>)newValue);
				return;
			case ModeloPackage.SLA__PARTY:
				getParty().clear();
				getParty().addAll((Collection<? extends Party>)newValue);
				return;
			case ModeloPackage.SLA__OBLIGATION:
				getObligation().clear();
				getObligation().addAll((Collection<? extends Obligation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModeloPackage.SLA__SLAPARAMETERS:
				getSlaparameters().clear();
				return;
			case ModeloPackage.SLA__INTEGRATIONSLA:
				getIntegrationsla().clear();
				return;
			case ModeloPackage.SLA__PARTY:
				getParty().clear();
				return;
			case ModeloPackage.SLA__OBLIGATION:
				getObligation().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModeloPackage.SLA__SLAPARAMETERS:
				return slaparameters != null && !slaparameters.isEmpty();
			case ModeloPackage.SLA__INTEGRATIONSLA:
				return integrationsla != null && !integrationsla.isEmpty();
			case ModeloPackage.SLA__PARTY:
				return party != null && !party.isEmpty();
			case ModeloPackage.SLA__OBLIGATION:
				return obligation != null && !obligation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SLAImpl
