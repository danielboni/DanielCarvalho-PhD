/**
 */
package modelo.impl;

import java.util.Collection;
import modelo.Concepts;
import modelo.IntegrationSLA;
import modelo.ModeloPackage;
import modelo.Query;

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
 * An implementation of the model object '<em><b>Concepts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelo.impl.ConceptsImpl#getIntegrationsla <em>Integrationsla</em>}</li>
 *   <li>{@link modelo.impl.ConceptsImpl#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptsImpl extends MinimalEObjectImpl.Container implements Concepts {
	/**
	 * The cached value of the '{@link #getIntegrationsla() <em>Integrationsla</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrationsla()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegrationSLA> integrationsla;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.CONCEPTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegrationSLA> getIntegrationsla() {
		if (integrationsla == null) {
			integrationsla = new EObjectContainmentWithInverseEList<IntegrationSLA>(IntegrationSLA.class, this, ModeloPackage.CONCEPTS__INTEGRATIONSLA, ModeloPackage.INTEGRATION_SLA__CONCEPTS);
		}
		return integrationsla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getQuery() {
		if (eContainerFeatureID() != ModeloPackage.CONCEPTS__QUERY) return null;
		return (Query)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Query newQuery, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQuery, ModeloPackage.CONCEPTS__QUERY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(Query newQuery) {
		if (newQuery != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.CONCEPTS__QUERY && newQuery != null)) {
			if (EcoreUtil.isAncestor(this, newQuery))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, ModeloPackage.QUERY__CONCEPTS, Query.class, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.CONCEPTS__QUERY, newQuery, newQuery));
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
			case ModeloPackage.CONCEPTS__INTEGRATIONSLA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntegrationsla()).basicAdd(otherEnd, msgs);
			case ModeloPackage.CONCEPTS__QUERY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQuery((Query)otherEnd, msgs);
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
			case ModeloPackage.CONCEPTS__INTEGRATIONSLA:
				return ((InternalEList<?>)getIntegrationsla()).basicRemove(otherEnd, msgs);
			case ModeloPackage.CONCEPTS__QUERY:
				return basicSetQuery(null, msgs);
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
			case ModeloPackage.CONCEPTS__QUERY:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.QUERY__CONCEPTS, Query.class, msgs);
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
			case ModeloPackage.CONCEPTS__INTEGRATIONSLA:
				return getIntegrationsla();
			case ModeloPackage.CONCEPTS__QUERY:
				return getQuery();
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
			case ModeloPackage.CONCEPTS__INTEGRATIONSLA:
				getIntegrationsla().clear();
				getIntegrationsla().addAll((Collection<? extends IntegrationSLA>)newValue);
				return;
			case ModeloPackage.CONCEPTS__QUERY:
				setQuery((Query)newValue);
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
			case ModeloPackage.CONCEPTS__INTEGRATIONSLA:
				getIntegrationsla().clear();
				return;
			case ModeloPackage.CONCEPTS__QUERY:
				setQuery((Query)null);
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
			case ModeloPackage.CONCEPTS__INTEGRATIONSLA:
				return integrationsla != null && !integrationsla.isEmpty();
			case ModeloPackage.CONCEPTS__QUERY:
				return getQuery() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptsImpl
