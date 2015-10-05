/**
 */
package modelo.impl;

import modelo.Cloud;
import modelo.ModeloPackage;
import modelo.Service;
import modelo.ServiceSLA;
import modelo.User;

import modelo.UserSLA;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelo.impl.CloudImpl#getUser <em>User</em>}</li>
 *   <li>{@link modelo.impl.CloudImpl#getService <em>Service</em>}</li>
 *   <li>{@link modelo.impl.CloudImpl#getUsersla <em>Usersla</em>}</li>
 *   <li>{@link modelo.impl.CloudImpl#getServicesla <em>Servicesla</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudImpl extends PartyImpl implements Cloud {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.CLOUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloPackage.CLOUD__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeloPackage.CLOUD__USER, oldUser, newUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, ModeloPackage.USER__CLOUD, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, ModeloPackage.USER__CLOUD, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.CLOUD__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Service)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloPackage.CLOUD__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Service newService, NotificationChain msgs) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeloPackage.CLOUD__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, ModeloPackage.SERVICE__CLOUD, Service.class, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, ModeloPackage.SERVICE__CLOUD, Service.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.CLOUD__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSLA getUsersla() {
		if (eContainerFeatureID() != ModeloPackage.CLOUD__USERSLA) return null;
		return (UserSLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsersla(UserSLA newUsersla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUsersla, ModeloPackage.CLOUD__USERSLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsersla(UserSLA newUsersla) {
		if (newUsersla != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.CLOUD__USERSLA && newUsersla != null)) {
			if (EcoreUtil.isAncestor(this, newUsersla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUsersla != null)
				msgs = ((InternalEObject)newUsersla).eInverseAdd(this, ModeloPackage.USER_SLA__CLOUD, UserSLA.class, msgs);
			msgs = basicSetUsersla(newUsersla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.CLOUD__USERSLA, newUsersla, newUsersla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSLA getServicesla() {
		if (eContainerFeatureID() != ModeloPackage.CLOUD__SERVICESLA) return null;
		return (ServiceSLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicesla(ServiceSLA newServicesla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServicesla, ModeloPackage.CLOUD__SERVICESLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicesla(ServiceSLA newServicesla) {
		if (newServicesla != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.CLOUD__SERVICESLA && newServicesla != null)) {
			if (EcoreUtil.isAncestor(this, newServicesla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServicesla != null)
				msgs = ((InternalEObject)newServicesla).eInverseAdd(this, ModeloPackage.SERVICE_SLA__CLOUD, ServiceSLA.class, msgs);
			msgs = basicSetServicesla(newServicesla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.CLOUD__SERVICESLA, newServicesla, newServicesla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloPackage.CLOUD__USER:
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, ModeloPackage.USER__CLOUD, User.class, msgs);
				return basicSetUser((User)otherEnd, msgs);
			case ModeloPackage.CLOUD__SERVICE:
				if (service != null)
					msgs = ((InternalEObject)service).eInverseRemove(this, ModeloPackage.SERVICE__CLOUD, Service.class, msgs);
				return basicSetService((Service)otherEnd, msgs);
			case ModeloPackage.CLOUD__USERSLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUsersla((UserSLA)otherEnd, msgs);
			case ModeloPackage.CLOUD__SERVICESLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServicesla((ServiceSLA)otherEnd, msgs);
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
			case ModeloPackage.CLOUD__USER:
				return basicSetUser(null, msgs);
			case ModeloPackage.CLOUD__SERVICE:
				return basicSetService(null, msgs);
			case ModeloPackage.CLOUD__USERSLA:
				return basicSetUsersla(null, msgs);
			case ModeloPackage.CLOUD__SERVICESLA:
				return basicSetServicesla(null, msgs);
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
			case ModeloPackage.CLOUD__USERSLA:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.USER_SLA__CLOUD, UserSLA.class, msgs);
			case ModeloPackage.CLOUD__SERVICESLA:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.SERVICE_SLA__CLOUD, ServiceSLA.class, msgs);
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
			case ModeloPackage.CLOUD__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case ModeloPackage.CLOUD__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case ModeloPackage.CLOUD__USERSLA:
				return getUsersla();
			case ModeloPackage.CLOUD__SERVICESLA:
				return getServicesla();
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
			case ModeloPackage.CLOUD__USER:
				setUser((User)newValue);
				return;
			case ModeloPackage.CLOUD__SERVICE:
				setService((Service)newValue);
				return;
			case ModeloPackage.CLOUD__USERSLA:
				setUsersla((UserSLA)newValue);
				return;
			case ModeloPackage.CLOUD__SERVICESLA:
				setServicesla((ServiceSLA)newValue);
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
			case ModeloPackage.CLOUD__USER:
				setUser((User)null);
				return;
			case ModeloPackage.CLOUD__SERVICE:
				setService((Service)null);
				return;
			case ModeloPackage.CLOUD__USERSLA:
				setUsersla((UserSLA)null);
				return;
			case ModeloPackage.CLOUD__SERVICESLA:
				setServicesla((ServiceSLA)null);
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
			case ModeloPackage.CLOUD__USER:
				return user != null;
			case ModeloPackage.CLOUD__SERVICE:
				return service != null;
			case ModeloPackage.CLOUD__USERSLA:
				return getUsersla() != null;
			case ModeloPackage.CLOUD__SERVICESLA:
				return getServicesla() != null;
		}
		return super.eIsSet(featureID);
	}

} //CloudImpl
