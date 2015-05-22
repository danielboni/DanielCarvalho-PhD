/**
 */
package SLAModel.impl;

import SLAModel.Parties;
import SLAModel.SLA;
import SLAModel.SLAModelPackage;
import SLAModel.ServiceConsumer;
import SLAModel.ServiceProvider;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SLAModel.impl.PartiesImpl#getServiceconsumer <em>Serviceconsumer</em>}</li>
 *   <li>{@link SLAModel.impl.PartiesImpl#getServiceprovider <em>Serviceprovider</em>}</li>
 *   <li>{@link SLAModel.impl.PartiesImpl#getSla <em>Sla</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartiesImpl extends MinimalEObjectImpl.Container implements Parties {
	/**
	 * The cached value of the '{@link #getServiceconsumer() <em>Serviceconsumer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceconsumer()
	 * @generated
	 * @ordered
	 */
	protected ServiceConsumer serviceconsumer;

	/**
	 * The cached value of the '{@link #getServiceprovider() <em>Serviceprovider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceprovider()
	 * @generated
	 * @ordered
	 */
	protected ServiceProvider serviceprovider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SLAModelPackage.Literals.PARTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConsumer getServiceconsumer() {
		return serviceconsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceconsumer(ServiceConsumer newServiceconsumer, NotificationChain msgs) {
		ServiceConsumer oldServiceconsumer = serviceconsumer;
		serviceconsumer = newServiceconsumer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SLAModelPackage.PARTIES__SERVICECONSUMER, oldServiceconsumer, newServiceconsumer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceconsumer(ServiceConsumer newServiceconsumer) {
		if (newServiceconsumer != serviceconsumer) {
			NotificationChain msgs = null;
			if (serviceconsumer != null)
				msgs = ((InternalEObject)serviceconsumer).eInverseRemove(this, SLAModelPackage.SERVICE_CONSUMER__PARTIES, ServiceConsumer.class, msgs);
			if (newServiceconsumer != null)
				msgs = ((InternalEObject)newServiceconsumer).eInverseAdd(this, SLAModelPackage.SERVICE_CONSUMER__PARTIES, ServiceConsumer.class, msgs);
			msgs = basicSetServiceconsumer(newServiceconsumer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.PARTIES__SERVICECONSUMER, newServiceconsumer, newServiceconsumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProvider getServiceprovider() {
		return serviceprovider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceprovider(ServiceProvider newServiceprovider, NotificationChain msgs) {
		ServiceProvider oldServiceprovider = serviceprovider;
		serviceprovider = newServiceprovider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SLAModelPackage.PARTIES__SERVICEPROVIDER, oldServiceprovider, newServiceprovider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceprovider(ServiceProvider newServiceprovider) {
		if (newServiceprovider != serviceprovider) {
			NotificationChain msgs = null;
			if (serviceprovider != null)
				msgs = ((InternalEObject)serviceprovider).eInverseRemove(this, SLAModelPackage.SERVICE_PROVIDER__PARTIES, ServiceProvider.class, msgs);
			if (newServiceprovider != null)
				msgs = ((InternalEObject)newServiceprovider).eInverseAdd(this, SLAModelPackage.SERVICE_PROVIDER__PARTIES, ServiceProvider.class, msgs);
			msgs = basicSetServiceprovider(newServiceprovider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.PARTIES__SERVICEPROVIDER, newServiceprovider, newServiceprovider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLA getSla() {
		if (eContainerFeatureID() != SLAModelPackage.PARTIES__SLA) return null;
		return (SLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSla(SLA newSla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSla, SLAModelPackage.PARTIES__SLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSla(SLA newSla) {
		if (newSla != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.PARTIES__SLA && newSla != null)) {
			if (EcoreUtil.isAncestor(this, newSla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSla != null)
				msgs = ((InternalEObject)newSla).eInverseAdd(this, SLAModelPackage.SLA__PARTIES, SLA.class, msgs);
			msgs = basicSetSla(newSla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.PARTIES__SLA, newSla, newSla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SLAModelPackage.PARTIES__SERVICECONSUMER:
				if (serviceconsumer != null)
					msgs = ((InternalEObject)serviceconsumer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SLAModelPackage.PARTIES__SERVICECONSUMER, null, msgs);
				return basicSetServiceconsumer((ServiceConsumer)otherEnd, msgs);
			case SLAModelPackage.PARTIES__SERVICEPROVIDER:
				if (serviceprovider != null)
					msgs = ((InternalEObject)serviceprovider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SLAModelPackage.PARTIES__SERVICEPROVIDER, null, msgs);
				return basicSetServiceprovider((ServiceProvider)otherEnd, msgs);
			case SLAModelPackage.PARTIES__SLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSla((SLA)otherEnd, msgs);
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
			case SLAModelPackage.PARTIES__SERVICECONSUMER:
				return basicSetServiceconsumer(null, msgs);
			case SLAModelPackage.PARTIES__SERVICEPROVIDER:
				return basicSetServiceprovider(null, msgs);
			case SLAModelPackage.PARTIES__SLA:
				return basicSetSla(null, msgs);
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
			case SLAModelPackage.PARTIES__SLA:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.SLA__PARTIES, SLA.class, msgs);
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
			case SLAModelPackage.PARTIES__SERVICECONSUMER:
				return getServiceconsumer();
			case SLAModelPackage.PARTIES__SERVICEPROVIDER:
				return getServiceprovider();
			case SLAModelPackage.PARTIES__SLA:
				return getSla();
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
			case SLAModelPackage.PARTIES__SERVICECONSUMER:
				setServiceconsumer((ServiceConsumer)newValue);
				return;
			case SLAModelPackage.PARTIES__SERVICEPROVIDER:
				setServiceprovider((ServiceProvider)newValue);
				return;
			case SLAModelPackage.PARTIES__SLA:
				setSla((SLA)newValue);
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
			case SLAModelPackage.PARTIES__SERVICECONSUMER:
				setServiceconsumer((ServiceConsumer)null);
				return;
			case SLAModelPackage.PARTIES__SERVICEPROVIDER:
				setServiceprovider((ServiceProvider)null);
				return;
			case SLAModelPackage.PARTIES__SLA:
				setSla((SLA)null);
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
			case SLAModelPackage.PARTIES__SERVICECONSUMER:
				return serviceconsumer != null;
			case SLAModelPackage.PARTIES__SERVICEPROVIDER:
				return serviceprovider != null;
			case SLAModelPackage.PARTIES__SLA:
				return getSla() != null;
		}
		return super.eIsSet(featureID);
	}

} //PartiesImpl
