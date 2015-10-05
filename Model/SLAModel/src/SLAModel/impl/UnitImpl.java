/**
 */
package SLAModel.impl;

import SLAModel.MatchingUnits;
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
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SLAModel.impl.UnitImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link SLAModel.impl.UnitImpl#getMatchingunits <em>Matchingunits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitImpl extends MinimalEObjectImpl.Container implements Unit {
	/**
	 * The cached value of the '{@link #getMatchingunits() <em>Matchingunits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingunits()
	 * @generated
	 * @ordered
	 */
	protected MatchingUnits matchingunits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SLAModelPackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric getMetric() {
		if (eContainerFeatureID() != SLAModelPackage.UNIT__METRIC) return null;
		return (Metric)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetric(Metric newMetric, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMetric, SLAModelPackage.UNIT__METRIC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(Metric newMetric) {
		if (newMetric != eInternalContainer() || (eContainerFeatureID() != SLAModelPackage.UNIT__METRIC && newMetric != null)) {
			if (EcoreUtil.isAncestor(this, newMetric))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMetric != null)
				msgs = ((InternalEObject)newMetric).eInverseAdd(this, SLAModelPackage.METRIC__UNIT, Metric.class, msgs);
			msgs = basicSetMetric(newMetric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.UNIT__METRIC, newMetric, newMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingUnits getMatchingunits() {
		if (matchingunits != null && matchingunits.eIsProxy()) {
			InternalEObject oldMatchingunits = (InternalEObject)matchingunits;
			matchingunits = (MatchingUnits)eResolveProxy(oldMatchingunits);
			if (matchingunits != oldMatchingunits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SLAModelPackage.UNIT__MATCHINGUNITS, oldMatchingunits, matchingunits));
			}
		}
		return matchingunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingUnits basicGetMatchingunits() {
		return matchingunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchingunits(MatchingUnits newMatchingunits, NotificationChain msgs) {
		MatchingUnits oldMatchingunits = matchingunits;
		matchingunits = newMatchingunits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SLAModelPackage.UNIT__MATCHINGUNITS, oldMatchingunits, newMatchingunits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingunits(MatchingUnits newMatchingunits) {
		if (newMatchingunits != matchingunits) {
			NotificationChain msgs = null;
			if (matchingunits != null)
				msgs = ((InternalEObject)matchingunits).eInverseRemove(this, SLAModelPackage.MATCHING_UNITS__UNIT, MatchingUnits.class, msgs);
			if (newMatchingunits != null)
				msgs = ((InternalEObject)newMatchingunits).eInverseAdd(this, SLAModelPackage.MATCHING_UNITS__UNIT, MatchingUnits.class, msgs);
			msgs = basicSetMatchingunits(newMatchingunits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SLAModelPackage.UNIT__MATCHINGUNITS, newMatchingunits, newMatchingunits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SLAModelPackage.UNIT__METRIC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMetric((Metric)otherEnd, msgs);
			case SLAModelPackage.UNIT__MATCHINGUNITS:
				if (matchingunits != null)
					msgs = ((InternalEObject)matchingunits).eInverseRemove(this, SLAModelPackage.MATCHING_UNITS__UNIT, MatchingUnits.class, msgs);
				return basicSetMatchingunits((MatchingUnits)otherEnd, msgs);
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
			case SLAModelPackage.UNIT__METRIC:
				return basicSetMetric(null, msgs);
			case SLAModelPackage.UNIT__MATCHINGUNITS:
				return basicSetMatchingunits(null, msgs);
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
			case SLAModelPackage.UNIT__METRIC:
				return eInternalContainer().eInverseRemove(this, SLAModelPackage.METRIC__UNIT, Metric.class, msgs);
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
			case SLAModelPackage.UNIT__METRIC:
				return getMetric();
			case SLAModelPackage.UNIT__MATCHINGUNITS:
				if (resolve) return getMatchingunits();
				return basicGetMatchingunits();
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
			case SLAModelPackage.UNIT__METRIC:
				setMetric((Metric)newValue);
				return;
			case SLAModelPackage.UNIT__MATCHINGUNITS:
				setMatchingunits((MatchingUnits)newValue);
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
			case SLAModelPackage.UNIT__METRIC:
				setMetric((Metric)null);
				return;
			case SLAModelPackage.UNIT__MATCHINGUNITS:
				setMatchingunits((MatchingUnits)null);
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
			case SLAModelPackage.UNIT__METRIC:
				return getMetric() != null;
			case SLAModelPackage.UNIT__MATCHINGUNITS:
				return matchingunits != null;
		}
		return super.eIsSet(featureID);
	}

} //UnitImpl
