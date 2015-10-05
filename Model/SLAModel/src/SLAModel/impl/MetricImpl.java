/**
 */
package SLAModel.impl;

import SLAModel.Garantee;
import SLAModel.MatchingMetrics;
import SLAModel.Metric;
import SLAModel.SLAModelPackage;

import SLAModel.Unit;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SLAModel.impl.MetricImpl#getGarantee <em>Garantee</em>}</li>
 *   <li>{@link SLAModel.impl.MetricImpl#getMetricName <em>Metric Name</em>}</li>
 *   <li>{@link SLAModel.impl.MetricImpl#getValue <em>Value</em>}</li>
 *   <li>{@link SLAModel.impl.MetricImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link SLAModel.impl.MetricImpl#getMetricID <em>Metric ID</em>}</li>
 *   <li>{@link SLAModel.impl.MetricImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link SLAModel.impl.MetricImpl#getMatchingmetrics <em>Matchingmetrics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetricImpl extends MinimalEObjectImpl.Container implements Metric {
	/**
	 * The default value of the '{@link #getMetricName() <em>Metric Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricName()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetricName() <em>Metric Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricName()
	 * @generated
	 * @ordered
	 */
	protected String metricName = METRIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected String predicate = PREDICATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetricID() <em>Metric ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricID()
	 * @generated
	 * @ordered
	 */
	protected static final String METRIC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetricID() <em>Metric ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricID()
	 * @generated
	 * @ordered
	 */
	protected String metricID = METRIC_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit;

	/**
	 * The cached value of the '{@link #getMatchingmetrics() <em>Matchingmetrics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingmetrics()
	 * @generated
	 * @ordered
	 */
	protected MatchingMetrics matchingmetrics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SLAModelPackage.Literals.METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Garantee getGarantee() {
		if (eContainerFeatureID() != SLAModelPackage.METRIC__GARANTEE) return null;
		return (Garantee)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGarantee(Garantee newGarantee, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGarantee, SLAModelPackage.METRIC__GARANTEE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGarantee(Garantee newGarantee) {
		if (newGarantee != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.METRIC__GARANTEE && newGarantee != null)) {
			if (EcoreUtil.isAncestor(this, newGarantee))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGarantee != null)
				msgs = ((InternalEObject)newGarantee).eInverseAdd(this, SLAModelPackage.GARANTEE__METRIC, Garantee.class, msgs);
			msgs = basicSetGarantee(newGarantee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.METRIC__GARANTEE, newGarantee, newGarantee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetricName() {
		return metricName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetricName(String newMetricName) {
		String oldMetricName = metricName;
		metricName = newMetricName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.METRIC__METRIC_NAME, oldMetricName, metricName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(Unit newUnit, NotificationChain msgs) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SLAModelPackage.METRIC__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, SLAModelPackage.UNIT__METRIC, Unit.class, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, SLAModelPackage.UNIT__METRIC, Unit.class, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.METRIC__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingMetrics getMatchingmetrics() {
		if (matchingmetrics != null && matchingmetrics.eIsProxy()) {
			InternalEObject oldMatchingmetrics = (InternalEObject)matchingmetrics;
			matchingmetrics = (MatchingMetrics)eResolveProxy(oldMatchingmetrics);
			if (matchingmetrics != oldMatchingmetrics) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SLAModelPackage.METRIC__MATCHINGMETRICS, oldMatchingmetrics, matchingmetrics));
			}
		}
		return matchingmetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingMetrics basicGetMatchingmetrics() {
		return matchingmetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchingmetrics(MatchingMetrics newMatchingmetrics, NotificationChain msgs) {
		MatchingMetrics oldMatchingmetrics = matchingmetrics;
		matchingmetrics = newMatchingmetrics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SLAModelPackage.METRIC__MATCHINGMETRICS, oldMatchingmetrics, newMatchingmetrics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingmetrics(MatchingMetrics newMatchingmetrics) {
		if (newMatchingmetrics != matchingmetrics) {
			NotificationChain msgs = null;
			if (matchingmetrics != null)
				msgs = ((InternalEObject)matchingmetrics).eInverseRemove(this, SLAModelPackage.MATCHING_METRICS__METRIC, MatchingMetrics.class, msgs);
			if (newMatchingmetrics != null)
				msgs = ((InternalEObject)newMatchingmetrics).eInverseAdd(this, SLAModelPackage.MATCHING_METRICS__METRIC, MatchingMetrics.class, msgs);
			msgs = basicSetMatchingmetrics(newMatchingmetrics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.METRIC__MATCHINGMETRICS, newMatchingmetrics, newMatchingmetrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.METRIC__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(String newPredicate) {
		String oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.METRIC__PREDICATE, oldPredicate, predicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetricID() {
		return metricID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetricID(String newMetricID) {
		String oldMetricID = metricID;
		metricID = newMetricID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.METRIC__METRIC_ID, oldMetricID, metricID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SLAModelPackage.METRIC__GARANTEE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGarantee((Garantee)otherEnd, msgs);
			case SLAModelPackage.METRIC__UNIT:
				if (unit != null)
					msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SLAModelPackage.METRIC__UNIT, null, msgs);
				return basicSetUnit((Unit)otherEnd, msgs);
			case SLAModelPackage.METRIC__MATCHINGMETRICS:
				if (matchingmetrics != null)
					msgs = ((InternalEObject)matchingmetrics).eInverseRemove(this, SLAModelPackage.MATCHING_METRICS__METRIC, MatchingMetrics.class, msgs);
				return basicSetMatchingmetrics((MatchingMetrics)otherEnd, msgs);
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
			case SLAModelPackage.METRIC__GARANTEE:
				return basicSetGarantee(null, msgs);
			case SLAModelPackage.METRIC__UNIT:
				return basicSetUnit(null, msgs);
			case SLAModelPackage.METRIC__MATCHINGMETRICS:
				return basicSetMatchingmetrics(null, msgs);
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
			case SLAModelPackage.METRIC__GARANTEE:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.GARANTEE__METRIC, Garantee.class, msgs);
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
			case SLAModelPackage.METRIC__GARANTEE:
				return getGarantee();
			case SLAModelPackage.METRIC__METRIC_NAME:
				return getMetricName();
			case SLAModelPackage.METRIC__VALUE:
				return getValue();
			case SLAModelPackage.METRIC__PREDICATE:
				return getPredicate();
			case SLAModelPackage.METRIC__METRIC_ID:
				return getMetricID();
			case SLAModelPackage.METRIC__UNIT:
				return getUnit();
			case SLAModelPackage.METRIC__MATCHINGMETRICS:
				if (resolve) return getMatchingmetrics();
				return basicGetMatchingmetrics();
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
			case SLAModelPackage.METRIC__GARANTEE:
				setGarantee((Garantee)newValue);
				return;
			case SLAModelPackage.METRIC__METRIC_NAME:
				setMetricName((String)newValue);
				return;
			case SLAModelPackage.METRIC__VALUE:
				setValue((String)newValue);
				return;
			case SLAModelPackage.METRIC__PREDICATE:
				setPredicate((String)newValue);
				return;
			case SLAModelPackage.METRIC__METRIC_ID:
				setMetricID((String)newValue);
				return;
			case SLAModelPackage.METRIC__UNIT:
				setUnit((Unit)newValue);
				return;
			case SLAModelPackage.METRIC__MATCHINGMETRICS:
				setMatchingmetrics((MatchingMetrics)newValue);
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
			case SLAModelPackage.METRIC__GARANTEE:
				setGarantee((Garantee)null);
				return;
			case SLAModelPackage.METRIC__METRIC_NAME:
				setMetricName(METRIC_NAME_EDEFAULT);
				return;
			case SLAModelPackage.METRIC__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SLAModelPackage.METRIC__PREDICATE:
				setPredicate(PREDICATE_EDEFAULT);
				return;
			case SLAModelPackage.METRIC__METRIC_ID:
				setMetricID(METRIC_ID_EDEFAULT);
				return;
			case SLAModelPackage.METRIC__UNIT:
				setUnit((Unit)null);
				return;
			case SLAModelPackage.METRIC__MATCHINGMETRICS:
				setMatchingmetrics((MatchingMetrics)null);
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
			case SLAModelPackage.METRIC__GARANTEE:
				return getGarantee() != null;
			case SLAModelPackage.METRIC__METRIC_NAME:
				return METRIC_NAME_EDEFAULT == null ? metricName != null : !METRIC_NAME_EDEFAULT.equals(metricName);
			case SLAModelPackage.METRIC__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SLAModelPackage.METRIC__PREDICATE:
				return PREDICATE_EDEFAULT == null ? predicate != null : !PREDICATE_EDEFAULT.equals(predicate);
			case SLAModelPackage.METRIC__METRIC_ID:
				return METRIC_ID_EDEFAULT == null ? metricID != null : !METRIC_ID_EDEFAULT.equals(metricID);
			case SLAModelPackage.METRIC__UNIT:
				return unit != null;
			case SLAModelPackage.METRIC__MATCHINGMETRICS:
				return matchingmetrics != null;
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
		result.append(" (metricName: ");
		result.append(metricName);
		result.append(", value: ");
		result.append(value);
		result.append(", predicate: ");
		result.append(predicate);
		result.append(", metricID: ");
		result.append(metricID);
		result.append(')');
		return result.toString();
	}

} //MetricImpl
