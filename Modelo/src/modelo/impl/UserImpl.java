/**
 */
package modelo.impl;

import modelo.Cloud;
import modelo.ModeloPackage;
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
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelo.impl.UserImpl#getCloud <em>Cloud</em>}</li>
 *   <li>{@link modelo.impl.UserImpl#getUsersla <em>Usersla</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends PartyImpl implements User {
	/**
	 * The cached value of the '{@link #getCloud() <em>Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloud()
	 * @generated
	 * @ordered
	 */
	protected Cloud cloud;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud getCloud() {
		if (cloud != null && cloud.eIsProxy()) {
			InternalEObject oldCloud = (InternalEObject)cloud;
			cloud = (Cloud)eResolveProxy(oldCloud);
			if (cloud != oldCloud) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloPackage.USER__CLOUD, oldCloud, cloud));
			}
		}
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud basicGetCloud() {
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloud(Cloud newCloud, NotificationChain msgs) {
		Cloud oldCloud = cloud;
		cloud = newCloud;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeloPackage.USER__CLOUD, oldCloud, newCloud);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloud(Cloud newCloud) {
		if (newCloud != cloud) {
			NotificationChain msgs = null;
			if (cloud != null)
				msgs = ((InternalEObject)cloud).eInverseRemove(this, ModeloPackage.CLOUD__USER, Cloud.class, msgs);
			if (newCloud != null)
				msgs = ((InternalEObject)newCloud).eInverseAdd(this, ModeloPackage.CLOUD__USER, Cloud.class, msgs);
			msgs = basicSetCloud(newCloud, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.USER__CLOUD, newCloud, newCloud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSLA getUsersla() {
		if (eContainerFeatureID() != ModeloPackage.USER__USERSLA) return null;
		return (UserSLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsersla(UserSLA newUsersla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUsersla, ModeloPackage.USER__USERSLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsersla(UserSLA newUsersla) {
		if (newUsersla != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.USER__USERSLA && newUsersla != null)) {
			if (EcoreUtil.isAncestor(this, newUsersla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUsersla != null)
				msgs = ((InternalEObject)newUsersla).eInverseAdd(this, ModeloPackage.USER_SLA__USER, UserSLA.class, msgs);
			msgs = basicSetUsersla(newUsersla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.USER__USERSLA, newUsersla, newUsersla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloPackage.USER__CLOUD:
				if (cloud != null)
					msgs = ((InternalEObject)cloud).eInverseRemove(this, ModeloPackage.CLOUD__USER, Cloud.class, msgs);
				return basicSetCloud((Cloud)otherEnd, msgs);
			case ModeloPackage.USER__USERSLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUsersla((UserSLA)otherEnd, msgs);
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
			case ModeloPackage.USER__CLOUD:
				return basicSetCloud(null, msgs);
			case ModeloPackage.USER__USERSLA:
				return basicSetUsersla(null, msgs);
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
			case ModeloPackage.USER__USERSLA:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.USER_SLA__USER, UserSLA.class, msgs);
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
			case ModeloPackage.USER__CLOUD:
				if (resolve) return getCloud();
				return basicGetCloud();
			case ModeloPackage.USER__USERSLA:
				return getUsersla();
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
			case ModeloPackage.USER__CLOUD:
				setCloud((Cloud)newValue);
				return;
			case ModeloPackage.USER__USERSLA:
				setUsersla((UserSLA)newValue);
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
			case ModeloPackage.USER__CLOUD:
				setCloud((Cloud)null);
				return;
			case ModeloPackage.USER__USERSLA:
				setUsersla((UserSLA)null);
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
			case ModeloPackage.USER__CLOUD:
				return cloud != null;
			case ModeloPackage.USER__USERSLA:
				return getUsersla() != null;
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
