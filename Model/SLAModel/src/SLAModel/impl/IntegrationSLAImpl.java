/**
 */
package SLAModel.impl;

import SLAModel.IntegrationSLA;
import SLAModel.Query;
import SLAModel.SLA;
import SLAModel.SLAModelPackage;
import SLAModel.ServiceComposition;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integration SLA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SLAModel.impl.IntegrationSLAImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link SLAModel.impl.IntegrationSLAImpl#getServiceComposition <em>Service Composition</em>}</li>
 *   <li>{@link SLAModel.impl.IntegrationSLAImpl#getSlas <em>Slas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegrationSLAImpl extends MinimalEObjectImpl.Container implements IntegrationSLA {
	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected Query query;

	/**
	 * The cached value of the '{@link #getServiceComposition() <em>Service Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceComposition()
	 * @generated
	 * @ordered
	 */
	protected ServiceComposition serviceComposition;

	/**
	 * The cached value of the '{@link #getSlas() <em>Slas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlas()
	 * @generated
	 * @ordered
	 */
	protected EList<SLA> slas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationSLAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SLAModelPackage.Literals.INTEGRATION_SLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs) {
		Query oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SLAModelPackage.INTEGRATION_SLA__QUERY, oldQuery, newQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(Query newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, SLAModelPackage.QUERY__INTEGRATIONSLA, Query.class, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, SLAModelPackage.QUERY__INTEGRATIONSLA, Query.class, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.INTEGRATION_SLA__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComposition getServiceComposition() {
		return serviceComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceComposition(ServiceComposition newServiceComposition, NotificationChain msgs) {
		ServiceComposition oldServiceComposition = serviceComposition;
		serviceComposition = newServiceComposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SLAModelPackage.INTEGRATION_SLA__SERVICE_COMPOSITION, oldServiceComposition, newServiceComposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceComposition(ServiceComposition newServiceComposition) {
		if (newServiceComposition != serviceComposition) {
			NotificationChain msgs = null;
			if (serviceComposition != null)
				msgs = ((InternalEObject)serviceComposition).eInverseRemove(this, SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA, ServiceComposition.class, msgs);
			if (newServiceComposition != null)
				msgs = ((InternalEObject)newServiceComposition).eInverseAdd(this, SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA, ServiceComposition.class, msgs);
			msgs = basicSetServiceComposition(newServiceComposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.INTEGRATION_SLA__SERVICE_COMPOSITION, newServiceComposition, newServiceComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SLA> getSlas() {
		if (slas == null) {
			slas = new EObjectContainmentWithInverseEList<SLA>(SLA.class, this, SLAModelPackage.INTEGRATION_SLA__SLAS, SLAModelPackage.SLA__INTEGRATION_SLA);
		}
		return slas;
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
			case SLAModelPackage.INTEGRATION_SLA__QUERY:
				if (query != null)
					msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SLAModelPackage.INTEGRATION_SLA__QUERY, null, msgs);
				return basicSetQuery((Query)otherEnd, msgs);
			case SLAModelPackage.INTEGRATION_SLA__SERVICE_COMPOSITION:
				if (serviceComposition != null)
					msgs = ((InternalEObject)serviceComposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SLAModelPackage.INTEGRATION_SLA__SERVICE_COMPOSITION, null, msgs);
				return basicSetServiceComposition((ServiceComposition)otherEnd, msgs);
			case SLAModelPackage.INTEGRATION_SLA__SLAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSlas()).basicAdd(otherEnd, msgs);
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
			case SLAModelPackage.INTEGRATION_SLA__QUERY:
				return basicSetQuery(null, msgs);
			case SLAModelPackage.INTEGRATION_SLA__SERVICE_COMPOSITION:
				return basicSetServiceComposition(null, msgs);
			case SLAModelPackage.INTEGRATION_SLA__SLAS:
				return ((InternalEList<?>)getSlas()).basicRemove(otherEnd, msgs);
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
			case SLAModelPackage.INTEGRATION_SLA__QUERY:
				return getQuery();
			case SLAModelPackage.INTEGRATION_SLA__SERVICE_COMPOSITION:
				return getServiceComposition();
			case SLAModelPackage.INTEGRATION_SLA__SLAS:
				return getSlas();
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
			case SLAModelPackage.INTEGRATION_SLA__QUERY:
				setQuery((Query)newValue);
				return;
			case SLAModelPackage.INTEGRATION_SLA__SERVICE_COMPOSITION:
				setServiceComposition((ServiceComposition)newValue);
				return;
			case SLAModelPackage.INTEGRATION_SLA__SLAS:
				getSlas().clear();
				getSlas().addAll((Collection<? extends SLA>)newValue);
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
			case SLAModelPackage.INTEGRATION_SLA__QUERY:
				setQuery((Query)null);
				return;
			case SLAModelPackage.INTEGRATION_SLA__SERVICE_COMPOSITION:
				setServiceComposition((ServiceComposition)null);
				return;
			case SLAModelPackage.INTEGRATION_SLA__SLAS:
				getSlas().clear();
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
			case SLAModelPackage.INTEGRATION_SLA__QUERY:
				return query != null;
			case SLAModelPackage.INTEGRATION_SLA__SERVICE_COMPOSITION:
				return serviceComposition != null;
			case SLAModelPackage.INTEGRATION_SLA__SLAS:
				return slas != null && !slas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntegrationSLAImpl
