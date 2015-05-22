/**
 */
package SLAModel.impl;

import SLAModel.Parties;
import SLAModel.SLAModelPackage;
import SLAModel.ServiceConsumer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SLAModel.impl.ServiceConsumerImpl#getParties <em>Parties</em>}</li>
 *   <li>{@link SLAModel.impl.ServiceConsumerImpl#getServiceConsumerName <em>Service Consumer Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceConsumerImpl extends MinimalEObjectImpl.Container implements ServiceConsumer {
	/**
	 * The default value of the '{@link #getServiceConsumerName() <em>Service Consumer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConsumerName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_CONSUMER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceConsumerName() <em>Service Consumer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConsumerName()
	 * @generated
	 * @ordered
	 */
	protected String serviceConsumerName = SERVICE_CONSUMER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SLAModelPackage.Literals.SERVICE_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parties getParties() {
		if (eContainerFeatureID() != SLAModelPackage.SERVICE_CONSUMER__PARTIES) return null;
		return (Parties)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParties(Parties newParties, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParties, SLAModelPackage.SERVICE_CONSUMER__PARTIES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParties(Parties newParties) {
		if (newParties != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.SERVICE_CONSUMER__PARTIES && newParties != null)) {
			if (EcoreUtil.isAncestor(this, newParties))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParties != null)
				msgs = ((InternalEObject)newParties).eInverseAdd(this, SLAModelPackage.PARTIES__SERVICECONSUMER, Parties.class, msgs);
			msgs = basicSetParties(newParties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.SERVICE_CONSUMER__PARTIES, newParties, newParties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceConsumerName() {
		return serviceConsumerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConsumerName(String newServiceConsumerName) {
		String oldServiceConsumerName = serviceConsumerName;
		serviceConsumerName = newServiceConsumerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.SERVICE_CONSUMER__SERVICE_CONSUMER_NAME, oldServiceConsumerName, serviceConsumerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SLAModelPackage.SERVICE_CONSUMER__PARTIES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParties((Parties)otherEnd, msgs);
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
			case SLAModelPackage.SERVICE_CONSUMER__PARTIES:
				return basicSetParties(null, msgs);
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
			case SLAModelPackage.SERVICE_CONSUMER__PARTIES:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.PARTIES__SERVICECONSUMER, Parties.class, msgs);
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
			case SLAModelPackage.SERVICE_CONSUMER__PARTIES:
				return getParties();
			case SLAModelPackage.SERVICE_CONSUMER__SERVICE_CONSUMER_NAME:
				return getServiceConsumerName();
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
			case SLAModelPackage.SERVICE_CONSUMER__PARTIES:
				setParties((Parties)newValue);
				return;
			case SLAModelPackage.SERVICE_CONSUMER__SERVICE_CONSUMER_NAME:
				setServiceConsumerName((String)newValue);
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
			case SLAModelPackage.SERVICE_CONSUMER__PARTIES:
				setParties((Parties)null);
				return;
			case SLAModelPackage.SERVICE_CONSUMER__SERVICE_CONSUMER_NAME:
				setServiceConsumerName(SERVICE_CONSUMER_NAME_EDEFAULT);
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
			case SLAModelPackage.SERVICE_CONSUMER__PARTIES:
				return getParties() != null;
			case SLAModelPackage.SERVICE_CONSUMER__SERVICE_CONSUMER_NAME:
				return SERVICE_CONSUMER_NAME_EDEFAULT == null ? serviceConsumerName != null : !SERVICE_CONSUMER_NAME_EDEFAULT.equals(serviceConsumerName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serviceConsumerName: ");
		result.append(serviceConsumerName);
		result.append(')');
		return result.toString();
	}

} //ServiceConsumerImpl
