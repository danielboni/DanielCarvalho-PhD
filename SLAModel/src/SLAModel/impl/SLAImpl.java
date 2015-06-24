/**
 */
package SLAModel.impl;

import SLAModel.IntegrationSLA;
import SLAModel.Obligations;
import SLAModel.Parties;
import SLAModel.SLA;
import SLAModel.SLAModelPackage;

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
 * An implementation of the model object '<em><b>SLA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SLAModel.impl.SLAImpl#getObligations <em>Obligations</em>}</li>
 *   <li>{@link SLAModel.impl.SLAImpl#getParties <em>Parties</em>}</li>
 *   <li>{@link SLAModel.impl.SLAImpl#getServicedefinition <em>Servicedefinition</em>}</li>
 *   <li>{@link SLAModel.impl.SLAImpl#getIntegrationSLA <em>Integration SLA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SLAImpl extends MinimalEObjectImpl.Container implements SLA {
	/**
	 * The cached value of the '{@link #getObligations() <em>Obligations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligations()
	 * @generated
	 * @ordered
	 */
	protected EList<Obligations> obligations;

	/**
	 * The cached value of the '{@link #getParties() <em>Parties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParties()
	 * @generated
	 * @ordered
	 */
	protected Parties parties;

	/**
	 * The cached value of the '{@link #getServicedefinition() <em>Servicedefinition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicedefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDefinition> servicedefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SLAModelPackage.Literals.SLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Obligations> getObligations() {
		if (obligations == null) {
			obligations = new EObjectContainmentWithInverseEList<Obligations>(Obligations.class, this, SLAModelPackage.SLA__OBLIGATIONS, SLAModelPackage.OBLIGATIONS__SLA);
		}
		return obligations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parties getParties() {
		return parties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParties(Parties newParties, NotificationChain msgs) {
		Parties oldParties = parties;
		parties = newParties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SLAModelPackage.SLA__PARTIES, oldParties, newParties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParties(Parties newParties) {
		if (newParties != parties) {
			NotificationChain msgs = null;
			if (parties != null)
				msgs = ((InternalEObject)parties).eInverseRemove(this, SLAModelPackage.PARTIES__SLA, Parties.class, msgs);
			if (newParties != null)
				msgs = ((InternalEObject)newParties).eInverseAdd(this, SLAModelPackage.PARTIES__SLA, Parties.class, msgs);
			msgs = basicSetParties(newParties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.SLA__PARTIES, newParties, newParties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDefinition> getServicedefinition() {
		if (servicedefinition == null) {
			servicedefinition = new EObjectContainmentWithInverseEList<ServiceDefinition>(ServiceDefinition.class, this, SLAModelPackage.SLA__SERVICEDEFINITION, SLAModelPackage.SERVICE_DEFINITION__SLA);
		}
		return servicedefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationSLA getIntegrationSLA() {
		if (eContainerFeatureID() != SLAModelPackage.SLA__INTEGRATION_SLA) return null;
		return (IntegrationSLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegrationSLA(IntegrationSLA newIntegrationSLA, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIntegrationSLA, SLAModelPackage.SLA__INTEGRATION_SLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrationSLA(IntegrationSLA newIntegrationSLA) {
		if (newIntegrationSLA != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.SLA__INTEGRATION_SLA && newIntegrationSLA != null)) {
			if (EcoreUtil.isAncestor(this, newIntegrationSLA))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIntegrationSLA != null)
				msgs = ((InternalEObject)newIntegrationSLA).eInverseAdd(this, SLAModelPackage.INTEGRATION_SLA__SLAS, IntegrationSLA.class, msgs);
			msgs = basicSetIntegrationSLA(newIntegrationSLA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.SLA__INTEGRATION_SLA, newIntegrationSLA, newIntegrationSLA));
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
			case SLAModelPackage.SLA__OBLIGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObligations()).basicAdd(otherEnd, msgs);
			case SLAModelPackage.SLA__PARTIES:
				if (parties != null)
					msgs = ((InternalEObject)parties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SLAModelPackage.SLA__PARTIES, null, msgs);
				return basicSetParties((Parties)otherEnd, msgs);
			case SLAModelPackage.SLA__SERVICEDEFINITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServicedefinition()).basicAdd(otherEnd, msgs);
			case SLAModelPackage.SLA__INTEGRATION_SLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIntegrationSLA((IntegrationSLA)otherEnd, msgs);
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
			case SLAModelPackage.SLA__OBLIGATIONS:
				return ((InternalEList<?>)getObligations()).basicRemove(otherEnd, msgs);
			case SLAModelPackage.SLA__PARTIES:
				return basicSetParties(null, msgs);
			case SLAModelPackage.SLA__SERVICEDEFINITION:
				return ((InternalEList<?>)getServicedefinition()).basicRemove(otherEnd, msgs);
			case SLAModelPackage.SLA__INTEGRATION_SLA:
				return basicSetIntegrationSLA(null, msgs);
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
			case SLAModelPackage.SLA__INTEGRATION_SLA:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.INTEGRATION_SLA__SLAS, IntegrationSLA.class, msgs);
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
			case SLAModelPackage.SLA__OBLIGATIONS:
				return getObligations();
			case SLAModelPackage.SLA__PARTIES:
				return getParties();
			case SLAModelPackage.SLA__SERVICEDEFINITION:
				return getServicedefinition();
			case SLAModelPackage.SLA__INTEGRATION_SLA:
				return getIntegrationSLA();
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
			case SLAModelPackage.SLA__OBLIGATIONS:
				getObligations().clear();
				getObligations().addAll((Collection<? extends Obligations>)newValue);
				return;
			case SLAModelPackage.SLA__PARTIES:
				setParties((Parties)newValue);
				return;
			case SLAModelPackage.SLA__SERVICEDEFINITION:
				getServicedefinition().clear();
				getServicedefinition().addAll((Collection<? extends ServiceDefinition>)newValue);
				return;
			case SLAModelPackage.SLA__INTEGRATION_SLA:
				setIntegrationSLA((IntegrationSLA)newValue);
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
			case SLAModelPackage.SLA__OBLIGATIONS:
				getObligations().clear();
				return;
			case SLAModelPackage.SLA__PARTIES:
				setParties((Parties)null);
				return;
			case SLAModelPackage.SLA__SERVICEDEFINITION:
				getServicedefinition().clear();
				return;
			case SLAModelPackage.SLA__INTEGRATION_SLA:
				setIntegrationSLA((IntegrationSLA)null);
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
			case SLAModelPackage.SLA__OBLIGATIONS:
				return obligations != null && !obligations.isEmpty();
			case SLAModelPackage.SLA__PARTIES:
				return parties != null;
			case SLAModelPackage.SLA__SERVICEDEFINITION:
				return servicedefinition != null && !servicedefinition.isEmpty();
			case SLAModelPackage.SLA__INTEGRATION_SLA:
				return getIntegrationSLA() != null;
		}
		return super.eIsSet(featureID);
	}

} //SLAImpl
