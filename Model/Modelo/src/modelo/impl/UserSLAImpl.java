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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User SLA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelo.impl.UserSLAImpl#getUser <em>User</em>}</li>
 *   <li>{@link modelo.impl.UserSLAImpl#getCloud <em>Cloud</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserSLAImpl extends SLAImpl implements UserSLA {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;
	/**
	 * The cached value of the '{@link #getCloud() <em>Cloud</em>}' containment reference.
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
	protected UserSLAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.USER_SLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeloPackage.USER_SLA__USER, oldUser, newUser);
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
				msgs = ((InternalEObject)user).eInverseRemove(this, ModeloPackage.USER__USERSLA, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, ModeloPackage.USER__USERSLA, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.USER_SLA__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud getCloud() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeloPackage.USER_SLA__CLOUD, oldCloud, newCloud);
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
				msgs = ((InternalEObject)cloud).eInverseRemove(this, ModeloPackage.CLOUD__USERSLA, Cloud.class, msgs);
			if (newCloud != null)
				msgs = ((InternalEObject)newCloud).eInverseAdd(this, ModeloPackage.CLOUD__USERSLA, Cloud.class, msgs);
			msgs = basicSetCloud(newCloud, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.USER_SLA__CLOUD, newCloud, newCloud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloPackage.USER_SLA__USER:
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModeloPackage.USER_SLA__USER, null, msgs);
				return basicSetUser((User)otherEnd, msgs);
			case ModeloPackage.USER_SLA__CLOUD:
				if (cloud != null)
					msgs = ((InternalEObject)cloud).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModeloPackage.USER_SLA__CLOUD, null, msgs);
				return basicSetCloud((Cloud)otherEnd, msgs);
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
			case ModeloPackage.USER_SLA__USER:
				return basicSetUser(null, msgs);
			case ModeloPackage.USER_SLA__CLOUD:
				return basicSetCloud(null, msgs);
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
			case ModeloPackage.USER_SLA__USER:
				return getUser();
			case ModeloPackage.USER_SLA__CLOUD:
				return getCloud();
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
			case ModeloPackage.USER_SLA__USER:
				setUser((User)newValue);
				return;
			case ModeloPackage.USER_SLA__CLOUD:
				setCloud((Cloud)newValue);
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
			case ModeloPackage.USER_SLA__USER:
				setUser((User)null);
				return;
			case ModeloPackage.USER_SLA__CLOUD:
				setCloud((Cloud)null);
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
			case ModeloPackage.USER_SLA__USER:
				return user != null;
			case ModeloPackage.USER_SLA__CLOUD:
				return cloud != null;
		}
		return super.eIsSet(featureID);
	}

} //UserSLAImpl
