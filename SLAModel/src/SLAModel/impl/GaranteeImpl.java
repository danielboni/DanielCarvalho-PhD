/**
 */
package SLAModel.impl;

import SLAModel.Garantee;
import SLAModel.Metric;
import SLAModel.Obligations;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Garantee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SLAModel.impl.GaranteeImpl#getObligations <em>Obligations</em>}</li>
 *   <li>{@link SLAModel.impl.GaranteeImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link SLAModel.impl.GaranteeImpl#getGaranteeName <em>Garantee Name</em>}</li>
 *   <li>{@link SLAModel.impl.GaranteeImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link SLAModel.impl.GaranteeImpl#getServicedefinition <em>Servicedefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GaranteeImpl extends MinimalEObjectImpl.Container implements Garantee {
	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected EList<Metric> metric;

	/**
	 * The default value of the '{@link #getGaranteeName() <em>Garantee Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGaranteeName()
	 * @generated
	 * @ordered
	 */
	protected static final String GARANTEE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGaranteeName() <em>Garantee Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGaranteeName()
	 * @generated
	 * @ordered
	 */
	protected String garanteeName = GARANTEE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServicedefinition() <em>Servicedefinition</em>}' reference list.
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
	protected GaranteeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SLAModelPackage.Literals.GARANTEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obligations getObligations() {
		if (eContainerFeatureID() != SLAModelPackage.GARANTEE__OBLIGATIONS) return null;
		return (Obligations)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObligations(Obligations newObligations, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newObligations, SLAModelPackage.GARANTEE__OBLIGATIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObligations(Obligations newObligations) {
		if (newObligations != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.GARANTEE__OBLIGATIONS && newObligations != null)) {
			if (EcoreUtil.isAncestor(this, newObligations))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newObligations != null)
				msgs = ((InternalEObject)newObligations).eInverseAdd(this, SLAModelPackage.OBLIGATIONS__GARANTEE, Obligations.class, msgs);
			msgs = basicSetObligations(newObligations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.GARANTEE__OBLIGATIONS, newObligations, newObligations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metric> getMetric() {
		if (metric == null) {
			metric = new EObjectContainmentWithInverseEList<Metric>(Metric.class, this, SLAModelPackage.GARANTEE__METRIC, SLAModelPackage.METRIC__GARANTEE);
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGaranteeName() {
		return garanteeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGaranteeName(String newGaranteeName) {
		String oldGaranteeName = garanteeName;
		garanteeName = newGaranteeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.GARANTEE__GARANTEE_NAME, oldGaranteeName, garanteeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.GARANTEE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDefinition> getServicedefinition() {
		if (servicedefinition == null) {
			servicedefinition = new EObjectWithInverseResolvingEList<ServiceDefinition>(ServiceDefinition.class, this, SLAModelPackage.GARANTEE__SERVICEDEFINITION, SLAModelPackage.SERVICE_DEFINITION__GARANTEE);
		}
		return servicedefinition;
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
			case SLAModelPackage.GARANTEE__OBLIGATIONS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetObligations((Obligations)otherEnd, msgs);
			case SLAModelPackage.GARANTEE__METRIC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetric()).basicAdd(otherEnd, msgs);
			case SLAModelPackage.GARANTEE__SERVICEDEFINITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServicedefinition()).basicAdd(otherEnd, msgs);
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
			case SLAModelPackage.GARANTEE__OBLIGATIONS:
				return basicSetObligations(null, msgs);
			case SLAModelPackage.GARANTEE__METRIC:
				return ((InternalEList<?>)getMetric()).basicRemove(otherEnd, msgs);
			case SLAModelPackage.GARANTEE__SERVICEDEFINITION:
				return ((InternalEList<?>)getServicedefinition()).basicRemove(otherEnd, msgs);
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
			case SLAModelPackage.GARANTEE__OBLIGATIONS:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.OBLIGATIONS__GARANTEE, Obligations.class, msgs);
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
			case SLAModelPackage.GARANTEE__OBLIGATIONS:
				return getObligations();
			case SLAModelPackage.GARANTEE__METRIC:
				return getMetric();
			case SLAModelPackage.GARANTEE__GARANTEE_NAME:
				return getGaranteeName();
			case SLAModelPackage.GARANTEE__SERVICE_NAME:
				return getServiceName();
			case SLAModelPackage.GARANTEE__SERVICEDEFINITION:
				return getServicedefinition();
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
			case SLAModelPackage.GARANTEE__OBLIGATIONS:
				setObligations((Obligations)newValue);
				return;
			case SLAModelPackage.GARANTEE__METRIC:
				getMetric().clear();
				getMetric().addAll((Collection<? extends Metric>)newValue);
				return;
			case SLAModelPackage.GARANTEE__GARANTEE_NAME:
				setGaranteeName((String)newValue);
				return;
			case SLAModelPackage.GARANTEE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case SLAModelPackage.GARANTEE__SERVICEDEFINITION:
				getServicedefinition().clear();
				getServicedefinition().addAll((Collection<? extends ServiceDefinition>)newValue);
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
			case SLAModelPackage.GARANTEE__OBLIGATIONS:
				setObligations((Obligations)null);
				return;
			case SLAModelPackage.GARANTEE__METRIC:
				getMetric().clear();
				return;
			case SLAModelPackage.GARANTEE__GARANTEE_NAME:
				setGaranteeName(GARANTEE_NAME_EDEFAULT);
				return;
			case SLAModelPackage.GARANTEE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case SLAModelPackage.GARANTEE__SERVICEDEFINITION:
				getServicedefinition().clear();
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
			case SLAModelPackage.GARANTEE__OBLIGATIONS:
				return getObligations() != null;
			case SLAModelPackage.GARANTEE__METRIC:
				return metric != null && !metric.isEmpty();
			case SLAModelPackage.GARANTEE__GARANTEE_NAME:
				return GARANTEE_NAME_EDEFAULT == null ? garanteeName != null : !GARANTEE_NAME_EDEFAULT.equals(garanteeName);
			case SLAModelPackage.GARANTEE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case SLAModelPackage.GARANTEE__SERVICEDEFINITION:
				return servicedefinition != null && !servicedefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (garanteeName: ");
		result.append(garanteeName);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(')');
		return result.toString();
	}

} //GaranteeImpl
