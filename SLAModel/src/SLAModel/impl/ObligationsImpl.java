/**
 */
package SLAModel.impl;

import SLAModel.Garantee;
import SLAModel.Obligations;
import SLAModel.SLA;
import SLAModel.SLAModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obligations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SLAModel.impl.ObligationsImpl#getSla <em>Sla</em>}</li>
 *   <li>{@link SLAModel.impl.ObligationsImpl#getGarantee <em>Garantee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObligationsImpl extends MinimalEObjectImpl.Container implements Obligations {
	/**
	 * The cached value of the '{@link #getGarantee() <em>Garantee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGarantee()
	 * @generated
	 * @ordered
	 */
	protected EList<Garantee> garantee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObligationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SLAModelPackage.Literals.OBLIGATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLA getSla() {
		if (eContainerFeatureID() != SLAModelPackage.OBLIGATIONS__SLA) return null;
		return (SLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSla(SLA newSla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSla, SLAModelPackage.OBLIGATIONS__SLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSla(SLA newSla) {
		if (newSla != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.OBLIGATIONS__SLA && newSla != null)) {
			if (EcoreUtil.isAncestor(this, newSla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSla != null)
				msgs = ((InternalEObject)newSla).eInverseAdd(this, SLAModelPackage.SLA__OBLIGATIONS, SLA.class, msgs);
			msgs = basicSetSla(newSla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.OBLIGATIONS__SLA, newSla, newSla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Garantee> getGarantee() {
		if (garantee == null) {
			garantee = new EObjectContainmentWithInverseEList<Garantee>(Garantee.class, this, SLAModelPackage.OBLIGATIONS__GARANTEE, SLAModelPackage.GARANTEE__OBLIGATIONS);
		}
		return garantee;
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
			case SLAModelPackage.OBLIGATIONS__SLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSla((SLA)otherEnd, msgs);
			case SLAModelPackage.OBLIGATIONS__GARANTEE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGarantee()).basicAdd(otherEnd, msgs);
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
			case SLAModelPackage.OBLIGATIONS__SLA:
				return basicSetSla(null, msgs);
			case SLAModelPackage.OBLIGATIONS__GARANTEE:
				return ((InternalEList<?>)getGarantee()).basicRemove(otherEnd, msgs);
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
			case SLAModelPackage.OBLIGATIONS__SLA:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.SLA__OBLIGATIONS, SLA.class, msgs);
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
			case SLAModelPackage.OBLIGATIONS__SLA:
				return getSla();
			case SLAModelPackage.OBLIGATIONS__GARANTEE:
				return getGarantee();
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
			case SLAModelPackage.OBLIGATIONS__SLA:
				setSla((SLA)newValue);
				return;
			case SLAModelPackage.OBLIGATIONS__GARANTEE:
				getGarantee().clear();
				getGarantee().addAll((Collection<? extends Garantee>)newValue);
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
			case SLAModelPackage.OBLIGATIONS__SLA:
				setSla((SLA)null);
				return;
			case SLAModelPackage.OBLIGATIONS__GARANTEE:
				getGarantee().clear();
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
			case SLAModelPackage.OBLIGATIONS__SLA:
				return getSla() != null;
			case SLAModelPackage.OBLIGATIONS__GARANTEE:
				return garantee != null && !garantee.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObligationsImpl
