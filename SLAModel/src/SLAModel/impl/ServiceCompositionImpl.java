/**
 */
package SLAModel.impl;

import SLAModel.IntegrationSLA;
import SLAModel.Query;
import SLAModel.SLAModelPackage;
import SLAModel.ServiceComposition;
import SLAModel.ServiceDefinition;

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
 * An implementation of the model object '<em><b>Service Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SLAModel.impl.ServiceCompositionImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link SLAModel.impl.ServiceCompositionImpl#getIntegrationSLA <em>Integration SLA</em>}</li>
 *   <li>{@link SLAModel.impl.ServiceCompositionImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceCompositionImpl extends MinimalEObjectImpl.Container implements ServiceComposition {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDefinition> services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SLAModelPackage.Literals.SERVICE_COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getQuery() {
		if (eContainerFeatureID() != SLAModelPackage.SERVICE_COMPOSITION__QUERY) return null;
		return (Query)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQuery, SLAModelPackage.SERVICE_COMPOSITION__QUERY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(Query newQuery) {
		if (newQuery != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.SERVICE_COMPOSITION__QUERY && newQuery != null)) {
			if (EcoreUtil.isAncestor(this, newQuery))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, SLAModelPackage.QUERY__SERVICECOMPOSITION, Query.class, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.SERVICE_COMPOSITION__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationSLA getIntegrationSLA() {
		if (eContainerFeatureID() != SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA) return null;
		return (IntegrationSLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegrationSLA(IntegrationSLA newIntegrationSLA, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIntegrationSLA, SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrationSLA(IntegrationSLA newIntegrationSLA) {
		if (newIntegrationSLA != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA && newIntegrationSLA != null)) {
			if (EcoreUtil.isAncestor(this, newIntegrationSLA))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIntegrationSLA != null)
				msgs = ((InternalEObject)newIntegrationSLA).eInverseAdd(this, SLAModelPackage.INTEGRATION_SLA__SERVICE_COMPOSITION, IntegrationSLA.class, msgs);
			msgs = basicSetIntegrationSLA(newIntegrationSLA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA, newIntegrationSLA, newIntegrationSLA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDefinition> getServices() {
		if (services == null) {
			services = new EObjectContainmentWithInverseEList<ServiceDefinition>(ServiceDefinition.class, this, SLAModelPackage.SERVICE_COMPOSITION__SERVICES, SLAModelPackage.SERVICE_DEFINITION__SERVICE_COMPOSITION);
		}
		return services;
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
			case SLAModelPackage.SERVICE_COMPOSITION__QUERY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQuery((Query)otherEnd, msgs);
			case SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIntegrationSLA((IntegrationSLA)otherEnd, msgs);
			case SLAModelPackage.SERVICE_COMPOSITION__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
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
			case SLAModelPackage.SERVICE_COMPOSITION__QUERY:
				return basicSetQuery(null, msgs);
			case SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA:
				return basicSetIntegrationSLA(null, msgs);
			case SLAModelPackage.SERVICE_COMPOSITION__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
			case SLAModelPackage.SERVICE_COMPOSITION__QUERY:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.QUERY__SERVICECOMPOSITION, Query.class, msgs);
			case SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.INTEGRATION_SLA__SERVICE_COMPOSITION, IntegrationSLA.class, msgs);
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
			case SLAModelPackage.SERVICE_COMPOSITION__QUERY:
				return getQuery();
			case SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA:
				return getIntegrationSLA();
			case SLAModelPackage.SERVICE_COMPOSITION__SERVICES:
				return getServices();
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
			case SLAModelPackage.SERVICE_COMPOSITION__QUERY:
				setQuery((Query)newValue);
				return;
			case SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA:
				setIntegrationSLA((IntegrationSLA)newValue);
				return;
			case SLAModelPackage.SERVICE_COMPOSITION__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends ServiceDefinition>)newValue);
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
			case SLAModelPackage.SERVICE_COMPOSITION__QUERY:
				setQuery((Query)null);
				return;
			case SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA:
				setIntegrationSLA((IntegrationSLA)null);
				return;
			case SLAModelPackage.SERVICE_COMPOSITION__SERVICES:
				getServices().clear();
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
			case SLAModelPackage.SERVICE_COMPOSITION__QUERY:
				return getQuery() != null;
			case SLAModelPackage.SERVICE_COMPOSITION__INTEGRATION_SLA:
				return getIntegrationSLA() != null;
			case SLAModelPackage.SERVICE_COMPOSITION__SERVICES:
				return services != null && !services.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceCompositionImpl
