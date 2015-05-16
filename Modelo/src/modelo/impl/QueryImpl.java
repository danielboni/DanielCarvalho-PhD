/**
 */
package modelo.impl;

import java.util.Collection;
import modelo.Concepts;
import modelo.ModeloPackage;
import modelo.Query;
import modelo.Service;
import modelo.ServiceComposition;

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
 *   <li>{@link modelo.impl.QueryImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link modelo.impl.QueryImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link modelo.impl.QueryImpl#getQueryeOpposite <em>Querye Opposite</em>}</li>
 *   <li>{@link modelo.impl.QueryImpl#getService <em>Service</em>}</li>
 *   <li>{@link modelo.impl.QueryImpl#getServicecomposition <em>Servicecomposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryImpl extends MinimalEObjectImpl.Container implements Query {
	/**
	 * The cached value of the '{@link #getConcepts() <em>Concepts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<Concepts> concepts;

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
		return ModeloPackage.Literals.QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concepts> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectContainmentWithInverseEList<Concepts>(Concepts.class, this, ModeloPackage.QUERY__CONCEPTS, ModeloPackage.CONCEPTS__QUERY);
		}
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQuery() {
		if (query == null) {
			query = new EObjectContainmentWithInverseEList<Query>(Query.class, this, ModeloPackage.QUERY__QUERY, ModeloPackage.QUERY__QUERYE_OPPOSITE);
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getQueryeOpposite() {
		if (eContainerFeatureID() != ModeloPackage.QUERY__QUERYE_OPPOSITE) return null;
		return (Query)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryeOpposite(Query newQueryeOpposite, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQueryeOpposite, ModeloPackage.QUERY__QUERYE_OPPOSITE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryeOpposite(Query newQueryeOpposite) {
		if (newQueryeOpposite != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.QUERY__QUERYE_OPPOSITE && newQueryeOpposite != null)) {
			if (EcoreUtil.isAncestor(this, newQueryeOpposite))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQueryeOpposite != null)
				msgs = ((InternalEObject)newQueryeOpposite).eInverseAdd(this, ModeloPackage.QUERY__QUERY, Query.class, msgs);
			msgs = basicSetQueryeOpposite(newQueryeOpposite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.QUERY__QUERYE_OPPOSITE, newQueryeOpposite, newQueryeOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (eContainerFeatureID() != ModeloPackage.QUERY__SERVICE) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Service newService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newService, ModeloPackage.QUERY__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		if (newService != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.QUERY__SERVICE && newService != null)) {
			if (EcoreUtil.isAncestor(this, newService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, ModeloPackage.SERVICE__QUERY, Service.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.QUERY__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceComposition> getServicecomposition() {
		if (servicecomposition == null) {
			servicecomposition = new EObjectContainmentWithInverseEList<ServiceComposition>(ServiceComposition.class, this, ModeloPackage.QUERY__SERVICECOMPOSITION, ModeloPackage.SERVICE_COMPOSITION__QUERY);
		}
		return servicecomposition;
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
			case ModeloPackage.QUERY__CONCEPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcepts()).basicAdd(otherEnd, msgs);
			case ModeloPackage.QUERY__QUERY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQuery()).basicAdd(otherEnd, msgs);
			case ModeloPackage.QUERY__QUERYE_OPPOSITE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQueryeOpposite((Query)otherEnd, msgs);
			case ModeloPackage.QUERY__SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetService((Service)otherEnd, msgs);
			case ModeloPackage.QUERY__SERVICECOMPOSITION:
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
			case ModeloPackage.QUERY__CONCEPTS:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
			case ModeloPackage.QUERY__QUERY:
				return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
			case ModeloPackage.QUERY__QUERYE_OPPOSITE:
				return basicSetQueryeOpposite(null, msgs);
			case ModeloPackage.QUERY__SERVICE:
				return basicSetService(null, msgs);
			case ModeloPackage.QUERY__SERVICECOMPOSITION:
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
			case ModeloPackage.QUERY__QUERYE_OPPOSITE:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.QUERY__QUERY, Query.class, msgs);
			case ModeloPackage.QUERY__SERVICE:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.SERVICE__QUERY, Service.class, msgs);
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
			case ModeloPackage.QUERY__CONCEPTS:
				return getConcepts();
			case ModeloPackage.QUERY__QUERY:
				return getQuery();
			case ModeloPackage.QUERY__QUERYE_OPPOSITE:
				return getQueryeOpposite();
			case ModeloPackage.QUERY__SERVICE:
				return getService();
			case ModeloPackage.QUERY__SERVICECOMPOSITION:
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
			case ModeloPackage.QUERY__CONCEPTS:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends Concepts>)newValue);
				return;
			case ModeloPackage.QUERY__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends Query>)newValue);
				return;
			case ModeloPackage.QUERY__QUERYE_OPPOSITE:
				setQueryeOpposite((Query)newValue);
				return;
			case ModeloPackage.QUERY__SERVICE:
				setService((Service)newValue);
				return;
			case ModeloPackage.QUERY__SERVICECOMPOSITION:
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
			case ModeloPackage.QUERY__CONCEPTS:
				getConcepts().clear();
				return;
			case ModeloPackage.QUERY__QUERY:
				getQuery().clear();
				return;
			case ModeloPackage.QUERY__QUERYE_OPPOSITE:
				setQueryeOpposite((Query)null);
				return;
			case ModeloPackage.QUERY__SERVICE:
				setService((Service)null);
				return;
			case ModeloPackage.QUERY__SERVICECOMPOSITION:
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
			case ModeloPackage.QUERY__CONCEPTS:
				return concepts != null && !concepts.isEmpty();
			case ModeloPackage.QUERY__QUERY:
				return query != null && !query.isEmpty();
			case ModeloPackage.QUERY__QUERYE_OPPOSITE:
				return getQueryeOpposite() != null;
			case ModeloPackage.QUERY__SERVICE:
				return getService() != null;
			case ModeloPackage.QUERY__SERVICECOMPOSITION:
				return servicecomposition != null && !servicecomposition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QueryImpl
