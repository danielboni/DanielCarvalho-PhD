/**
 */
package SLAModel.impl;

import SLAModel.Garantee;
import SLAModel.SLA;
import SLAModel.SLAModelPackage;
import SLAModel.ServiceComposition;
import SLAModel.ServiceDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SLAModel.impl.ServiceDefinitionImpl#getSla <em>Sla</em>}</li>
 *   <li>{@link SLAModel.impl.ServiceDefinitionImpl#getGarantee <em>Garantee</em>}</li>
 *   <li>{@link SLAModel.impl.ServiceDefinitionImpl#getServiceComposition <em>Service Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDefinitionImpl extends MinimalEObjectImpl.Container implements ServiceDefinition {
	/**
	 * The cached value of the '{@link #getGarantee() <em>Garantee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGarantee()
	 * @generated
	 * @ordered
	 */
	protected Garantee garantee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SLAModelPackage.Literals.SERVICE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLA getSla() {
		if (eContainerFeatureID() != SLAModelPackage.SERVICE_DEFINITION__SLA) return null;
		return (SLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSla(SLA newSla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSla, SLAModelPackage.SERVICE_DEFINITION__SLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSla(SLA newSla) {
		if (newSla != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.SERVICE_DEFINITION__SLA && newSla != null)) {
			if (EcoreUtil.isAncestor(this, newSla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSla != null)
				msgs = ((InternalEObject)newSla).eInverseAdd(this, SLAModelPackage.SLA__SERVICEDEFINITION, SLA.class, msgs);
			msgs = basicSetSla(newSla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.SERVICE_DEFINITION__SLA, newSla, newSla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Garantee getGarantee() {
		if (garantee != null && garantee.eIsProxy()) {
			InternalEObject oldGarantee = (InternalEObject)garantee;
			garantee = (Garantee)eResolveProxy(oldGarantee);
			if (garantee != oldGarantee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SLAModelPackage.SERVICE_DEFINITION__GARANTEE, oldGarantee, garantee));
			}
		}
		return garantee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Garantee basicGetGarantee() {
		return garantee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGarantee(Garantee newGarantee, NotificationChain msgs) {
		Garantee oldGarantee = garantee;
		garantee = newGarantee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SLAModelPackage.SERVICE_DEFINITION__GARANTEE, oldGarantee, newGarantee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGarantee(Garantee newGarantee) {
		if (newGarantee != garantee) {
			NotificationChain msgs = null;
			if (garantee != null)
				msgs = ((InternalEObject)garantee).eInverseRemove(this, SLAModelPackage.GARANTEE__SERVICEDEFINITION, Garantee.class, msgs);
			if (newGarantee != null)
				msgs = ((InternalEObject)newGarantee).eInverseAdd(this, SLAModelPackage.GARANTEE__SERVICEDEFINITION, Garantee.class, msgs);
			msgs = basicSetGarantee(newGarantee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.SERVICE_DEFINITION__GARANTEE, newGarantee, newGarantee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComposition getServiceComposition() {
		if (eContainerFeatureID() != SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION) return null;
		return (ServiceComposition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceComposition(ServiceComposition newServiceComposition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServiceComposition, SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceComposition(ServiceComposition newServiceComposition) {
		if (newServiceComposition != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION && newServiceComposition != null)) {
			if (EcoreUtil.isAncestor(this, newServiceComposition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServiceComposition != null)
				msgs = ((InternalEObject)newServiceComposition).eInverseAdd(this, SLAModelPackage.SERVICE_COMPOSITION__SERVICES, ServiceComposition.class, msgs);
			msgs = basicSetServiceComposition(newServiceComposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION, newServiceComposition, newServiceComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SLAModelPackage.SERVICE_DEFINITION__SLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSla((SLA)otherEnd, msgs);
			case SLAModelPackage.SERVICE_DEFINITION__GARANTEE:
				if (garantee != null)
					msgs = ((InternalEObject)garantee).eInverseRemove(this, SLAModelPackage.GARANTEE__SERVICEDEFINITION, Garantee.class, msgs);
				return basicSetGarantee((Garantee)otherEnd, msgs);
			case SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServiceComposition((ServiceComposition)otherEnd, msgs);
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
			case SLAModelPackage.SERVICE_DEFINITION__SLA:
				return basicSetSla(null, msgs);
			case SLAModelPackage.SERVICE_DEFINITION__GARANTEE:
				return basicSetGarantee(null, msgs);
			case SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION:
				return basicSetServiceComposition(null, msgs);
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
			case SLAModelPackage.SERVICE_DEFINITION__SLA:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.SLA__SERVICEDEFINITION, SLA.class, msgs);
			case SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.SERVICE_COMPOSITION__SERVICES, ServiceComposition.class, msgs);
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
			case SLAModelPackage.SERVICE_DEFINITION__SLA:
				return getSla();
			case SLAModelPackage.SERVICE_DEFINITION__GARANTEE:
				if (resolve) return getGarantee();
				return basicGetGarantee();
			case SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION:
				return getServiceComposition();
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
			case SLAModelPackage.SERVICE_DEFINITION__SLA:
				setSla((SLA)newValue);
				return;
			case SLAModelPackage.SERVICE_DEFINITION__GARANTEE:
				setGarantee((Garantee)newValue);
				return;
			case SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION:
				setServiceComposition((ServiceComposition)newValue);
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
			case SLAModelPackage.SERVICE_DEFINITION__SLA:
				setSla((SLA)null);
				return;
			case SLAModelPackage.SERVICE_DEFINITION__GARANTEE:
				setGarantee((Garantee)null);
				return;
			case SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION:
				setServiceComposition((ServiceComposition)null);
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
			case SLAModelPackage.SERVICE_DEFINITION__SLA:
				return getSla() != null;
			case SLAModelPackage.SERVICE_DEFINITION__GARANTEE:
				return garantee != null;
			case SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION:
				return getServiceComposition() != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceDefinitionImpl
