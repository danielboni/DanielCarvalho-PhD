/**
 */
package modelo.impl;

import java.util.Collection;
import modelo.Cloud;
import modelo.ModeloPackage;
import modelo.Query;
import modelo.Service;
import modelo.ServiceComposition;

import modelo.ServiceSLA;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelo.impl.ServiceImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link modelo.impl.ServiceImpl#getCloud <em>Cloud</em>}</li>
 *   <li>{@link modelo.impl.ServiceImpl#getServicesla <em>Servicesla</em>}</li>
 *   <li>{@link modelo.impl.ServiceImpl#getServicecomposition <em>Servicecomposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends PartyImpl implements Service {
	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> query;

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
	 * The cached value of the '{@link #getServicecomposition() <em>Servicecomposition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicecomposition()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceComposition> servicecomposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQuery() {
		if (query == null) {
			query = new EObjectContainmentWithInverseEList<Query>(Query.class, this, ModeloPackage.SERVICE__QUERY, ModeloPackage.QUERY__SERVICE);
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceComposition> getServicecomposition() {
		if (servicecomposition == null) {
			servicecomposition = new EObjectContainmentWithInverseEList<ServiceComposition>(ServiceComposition.class, this, ModeloPackage.SERVICE__SERVICECOMPOSITION, ModeloPackage.SERVICE_COMPOSITION__SERVICE);
		}
		return servicecomposition;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloPackage.SERVICE__CLOUD, oldCloud, cloud));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeloPackage.SERVICE__CLOUD, oldCloud, newCloud);
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
				msgs = ((InternalEObject)cloud).eInverseRemove(this, ModeloPackage.CLOUD__SERVICE, Cloud.class, msgs);
			if (newCloud != null)
				msgs = ((InternalEObject)newCloud).eInverseAdd(this, ModeloPackage.CLOUD__SERVICE, Cloud.class, msgs);
			msgs = basicSetCloud(newCloud, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.SERVICE__CLOUD, newCloud, newCloud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSLA getServicesla() {
		if (eContainerFeatureID() != ModeloPackage.SERVICE__SERVICESLA) return null;
		return (ServiceSLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServicesla(ServiceSLA newServicesla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServicesla, ModeloPackage.SERVICE__SERVICESLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicesla(ServiceSLA newServicesla) {
		if (newServicesla != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.SERVICE__SERVICESLA && newServicesla != null)) {
			if (EcoreUtil.isAncestor(this, newServicesla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServicesla != null)
				msgs = ((InternalEObject)newServicesla).eInverseAdd(this, ModeloPackage.SERVICE_SLA__SERVICE, ServiceSLA.class, msgs);
			msgs = basicSetServicesla(newServicesla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.SERVICE__SERVICESLA, newServicesla, newServicesla));
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
			case ModeloPackage.SERVICE__QUERY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQuery()).basicAdd(otherEnd, msgs);
			case ModeloPackage.SERVICE__CLOUD:
				if (cloud != null)
					msgs = ((InternalEObject)cloud).eInverseRemove(this, ModeloPackage.CLOUD__SERVICE, Cloud.class, msgs);
				return basicSetCloud((Cloud)otherEnd, msgs);
			case ModeloPackage.SERVICE__SERVICESLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServicesla((ServiceSLA)otherEnd, msgs);
			case ModeloPackage.SERVICE__SERVICECOMPOSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServicecomposition()).basicAdd(otherEnd, msgs);
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
			case ModeloPackage.SERVICE__QUERY:
				return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
			case ModeloPackage.SERVICE__CLOUD:
				return basicSetCloud(null, msgs);
			case ModeloPackage.SERVICE__SERVICESLA:
				return basicSetServicesla(null, msgs);
			case ModeloPackage.SERVICE__SERVICECOMPOSITION:
				return ((InternalEList<?>)getServicecomposition()).basicRemove(otherEnd, msgs);
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
			case ModeloPackage.SERVICE__SERVICESLA:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.SERVICE_SLA__SERVICE, ServiceSLA.class, msgs);
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
			case ModeloPackage.SERVICE__QUERY:
				return getQuery();
			case ModeloPackage.SERVICE__CLOUD:
				if (resolve) return getCloud();
				return basicGetCloud();
			case ModeloPackage.SERVICE__SERVICESLA:
				return getServicesla();
			case ModeloPackage.SERVICE__SERVICECOMPOSITION:
				return getServicecomposition();
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
			case ModeloPackage.SERVICE__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends Query>)newValue);
				return;
			case ModeloPackage.SERVICE__CLOUD:
				setCloud((Cloud)newValue);
				return;
			case ModeloPackage.SERVICE__SERVICESLA:
				setServicesla((ServiceSLA)newValue);
				return;
			case ModeloPackage.SERVICE__SERVICECOMPOSITION:
				getServicecomposition().clear();
				getServicecomposition().addAll((Collection<? extends ServiceComposition>)newValue);
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
			case ModeloPackage.SERVICE__QUERY:
				getQuery().clear();
				return;
			case ModeloPackage.SERVICE__CLOUD:
				setCloud((Cloud)null);
				return;
			case ModeloPackage.SERVICE__SERVICESLA:
				setServicesla((ServiceSLA)null);
				return;
			case ModeloPackage.SERVICE__SERVICECOMPOSITION:
				getServicecomposition().clear();
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
			case ModeloPackage.SERVICE__QUERY:
				return query != null && !query.isEmpty();
			case ModeloPackage.SERVICE__CLOUD:
				return cloud != null;
			case ModeloPackage.SERVICE__SERVICESLA:
				return getServicesla() != null;
			case ModeloPackage.SERVICE__SERVICECOMPOSITION:
				return servicecomposition != null && !servicecomposition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
