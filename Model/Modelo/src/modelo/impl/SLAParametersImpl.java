/**
 */
package modelo.impl;

import modelo.Guaranty;
import modelo.ModeloPackage;
import modelo.SLA;
import modelo.SLAParameters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SLA Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelo.impl.SLAParametersImpl#getSla <em>Sla</em>}</li>
 *   <li>{@link modelo.impl.SLAParametersImpl#getGuaranty <em>Guaranty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SLAParametersImpl extends MinimalEObjectImpl.Container implements SLAParameters {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLAParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.SLA_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLA getSla() {
		if (eContainerFeatureID() != ModeloPackage.SLA_PARAMETERS__SLA) return null;
		return (SLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSla(SLA newSla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSla, ModeloPackage.SLA_PARAMETERS__SLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSla(SLA newSla) {
		if (newSla != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.SLA_PARAMETERS__SLA && newSla != null)) {
			if (EcoreUtil.isAncestor(this, newSla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSla != null)
				msgs = ((InternalEObject)newSla).eInverseAdd(this, ModeloPackage.SLA__SLAPARAMETERS, SLA.class, msgs);
			msgs = basicSetSla(newSla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.SLA_PARAMETERS__SLA, newSla, newSla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guaranty getGuaranty() {
		if (eContainerFeatureID() != ModeloPackage.SLA_PARAMETERS__GUARANTY) return null;
		return (Guaranty)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuaranty(Guaranty newGuaranty, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGuaranty, ModeloPackage.SLA_PARAMETERS__GUARANTY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuaranty(Guaranty newGuaranty) {
		if (newGuaranty != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.SLA_PARAMETERS__GUARANTY && newGuaranty != null)) {
			if (EcoreUtil.isAncestor(this, newGuaranty))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGuaranty != null)
				msgs = ((InternalEObject)newGuaranty).eInverseAdd(this, ModeloPackage.GUARANTY__SLAPARAMETERS, Guaranty.class, msgs);
			msgs = basicSetGuaranty(newGuaranty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.SLA_PARAMETERS__GUARANTY, newGuaranty, newGuaranty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloPackage.SLA_PARAMETERS__SLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSla((SLA)otherEnd, msgs);
			case ModeloPackage.SLA_PARAMETERS__GUARANTY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGuaranty((Guaranty)otherEnd, msgs);
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
			case ModeloPackage.SLA_PARAMETERS__SLA:
				return basicSetSla(null, msgs);
			case ModeloPackage.SLA_PARAMETERS__GUARANTY:
				return basicSetGuaranty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModeloPackage.SLA_PARAMETERS__SLA:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.SLA__SLAPARAMETERS, SLA.class, msgs);
			case ModeloPackage.SLA_PARAMETERS__GUARANTY:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.GUARANTY__SLAPARAMETERS, Guaranty.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloPackage.SLA_PARAMETERS__SLA:
				return getSla();
			case ModeloPackage.SLA_PARAMETERS__GUARANTY:
				return getGuaranty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModeloPackage.SLA_PARAMETERS__SLA:
				setSla((SLA)newValue);
				return;
			case ModeloPackage.SLA_PARAMETERS__GUARANTY:
				setGuaranty((Guaranty)newValue);
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
			case ModeloPackage.SLA_PARAMETERS__SLA:
				setSla((SLA)null);
				return;
			case ModeloPackage.SLA_PARAMETERS__GUARANTY:
				setGuaranty((Guaranty)null);
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
			case ModeloPackage.SLA_PARAMETERS__SLA:
				return getSla() != null;
			case ModeloPackage.SLA_PARAMETERS__GUARANTY:
				return getGuaranty() != null;
		}
		return super.eIsSet(featureID);
	}

} //SLAParametersImpl
