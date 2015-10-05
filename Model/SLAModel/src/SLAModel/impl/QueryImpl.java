/**
 */
package SLAModel.impl;

import SLAModel.IntegrationSLA;
import SLAModel.Query;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SLAModel.impl.QueryImpl#getServicecomposition <em>Servicecomposition</em>}</li>
 *   <li>{@link SLAModel.impl.QueryImpl#getIntegrationsla <em>Integrationsla</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryImpl extends MinimalEObjectImpl.Container implements Query {
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
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SLAModelPackage.Literals.QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceComposition> getServicecomposition() {
		if (servicecomposition == null) {
			servicecomposition = new EObjectContainmentWithInverseEList<ServiceComposition>(ServiceComposition.class, this, SLAModelPackage.QUERY__SERVICECOMPOSITION, SLAModelPackage.SERVICE_COMPOSITION__QUERY);
		}
		return servicecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationSLA getIntegrationsla() {
		if (eContainerFeatureID() != SLAModelPackage.QUERY__INTEGRATIONSLA) return null;
		return (IntegrationSLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegrationsla(IntegrationSLA newIntegrationsla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIntegrationsla, SLAModelPackage.QUERY__INTEGRATIONSLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrationsla(IntegrationSLA newIntegrationsla) {
		if (newIntegrationsla != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.QUERY__INTEGRATIONSLA && newIntegrationsla != null)) {
			if (EcoreUtil.isAncestor(this, newIntegrationsla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIntegrationsla != null)
				msgs = ((InternalEObject)newIntegrationsla).eInverseAdd(this, SLAModelPackage.INTEGRATION_SLA__QUERY, IntegrationSLA.class, msgs);
			msgs = basicSetIntegrationsla(newIntegrationsla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.QUERY__INTEGRATIONSLA, newIntegrationsla, newIntegrationsla));
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
			case SLAModelPackage.QUERY__SERVICECOMPOSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServicecomposition()).basicAdd(otherEnd, msgs);
			case SLAModelPackage.QUERY__INTEGRATIONSLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIntegrationsla((IntegrationSLA)otherEnd, msgs);
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
			case SLAModelPackage.QUERY__SERVICECOMPOSITION:
				return ((InternalEList<?>)getServicecomposition()).basicRemove(otherEnd, msgs);
			case SLAModelPackage.QUERY__INTEGRATIONSLA:
				return basicSetIntegrationsla(null, msgs);
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
			case SLAModelPackage.QUERY__INTEGRATIONSLA:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.INTEGRATION_SLA__QUERY, IntegrationSLA.class, msgs);
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
			case SLAModelPackage.QUERY__SERVICECOMPOSITION:
				return getServicecomposition();
			case SLAModelPackage.QUERY__INTEGRATIONSLA:
				return getIntegrationsla();
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
			case SLAModelPackage.QUERY__SERVICECOMPOSITION:
				getServicecomposition().clear();
				getServicecomposition().addAll((Collection<? extends ServiceComposition>)newValue);
				return;
			case SLAModelPackage.QUERY__INTEGRATIONSLA:
				setIntegrationsla((IntegrationSLA)newValue);
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
			case SLAModelPackage.QUERY__SERVICECOMPOSITION:
				getServicecomposition().clear();
				return;
			case SLAModelPackage.QUERY__INTEGRATIONSLA:
				setIntegrationsla((IntegrationSLA)null);
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
			case SLAModelPackage.QUERY__SERVICECOMPOSITION:
				return servicecomposition != null && !servicecomposition.isEmpty();
			case SLAModelPackage.QUERY__INTEGRATIONSLA:
				return getIntegrationsla() != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryImpl
