/**
 */
package modelo.impl;

import java.util.Collection;
import modelo.Guaranty;
import modelo.ModeloPackage;
import modelo.NegotiationRules;
import modelo.SLAParameters;

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
 * An implementation of the model object '<em><b>Guaranty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelo.impl.GuarantyImpl#getSlaparameters <em>Slaparameters</em>}</li>
 *   <li>{@link modelo.impl.GuarantyImpl#getGuaranty <em>Guaranty</em>}</li>
 *   <li>{@link modelo.impl.GuarantyImpl#getGuarantyeOpposite <em>Guarantye Opposite</em>}</li>
 *   <li>{@link modelo.impl.GuarantyImpl#getNegotiationrules <em>Negotiationrules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuarantyImpl extends MinimalEObjectImpl.Container implements Guaranty {
	/**
	 * The cached value of the '{@link #getSlaparameters() <em>Slaparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SLAParameters> slaparameters;

	/**
	 * The cached value of the '{@link #getGuaranty() <em>Guaranty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuaranty()
	 * @generated
	 * @ordered
	 */
	protected EList<Guaranty> guaranty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuarantyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.GUARANTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SLAParameters> getSlaparameters() {
		if (slaparameters == null) {
			slaparameters = new EObjectContainmentWithInverseEList<SLAParameters>(SLAParameters.class, this, ModeloPackage.GUARANTY__SLAPARAMETERS, ModeloPackage.SLA_PARAMETERS__GUARANTY);
		}
		return slaparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guaranty> getGuaranty() {
		if (guaranty == null) {
			guaranty = new EObjectContainmentWithInverseEList<Guaranty>(Guaranty.class, this, ModeloPackage.GUARANTY__GUARANTY, ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE);
		}
		return guaranty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guaranty getGuarantyeOpposite() {
		if (eContainerFeatureID() != ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE) return null;
		return (Guaranty)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuarantyeOpposite(Guaranty newGuarantyeOpposite, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGuarantyeOpposite, ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuarantyeOpposite(Guaranty newGuarantyeOpposite) {
		if (newGuarantyeOpposite != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE && newGuarantyeOpposite != null)) {
			if (EcoreUtil.isAncestor(this, newGuarantyeOpposite))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGuarantyeOpposite != null)
				msgs = ((InternalEObject)newGuarantyeOpposite).eInverseAdd(this, ModeloPackage.GUARANTY__GUARANTY, Guaranty.class, msgs);
			msgs = basicSetGuarantyeOpposite(newGuarantyeOpposite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE, newGuarantyeOpposite, newGuarantyeOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegotiationRules getNegotiationrules() {
		if (eContainerFeatureID() != ModeloPackage.GUARANTY__NEGOTIATIONRULES) return null;
		return (NegotiationRules)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegotiationrules(NegotiationRules newNegotiationrules, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNegotiationrules, ModeloPackage.GUARANTY__NEGOTIATIONRULES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegotiationrules(NegotiationRules newNegotiationrules) {
		if (newNegotiationrules != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.GUARANTY__NEGOTIATIONRULES && newNegotiationrules != null)) {
			if (EcoreUtil.isAncestor(this, newNegotiationrules))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNegotiationrules != null)
				msgs = ((InternalEObject)newNegotiationrules).eInverseAdd(this, ModeloPackage.NEGOTIATION_RULES__GUARANTY, NegotiationRules.class, msgs);
			msgs = basicSetNegotiationrules(newNegotiationrules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.GUARANTY__NEGOTIATIONRULES, newNegotiationrules, newNegotiationrules));
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
			case ModeloPackage.GUARANTY__SLAPARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSlaparameters()).basicAdd(otherEnd, msgs);
			case ModeloPackage.GUARANTY__GUARANTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGuaranty()).basicAdd(otherEnd, msgs);
			case ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGuarantyeOpposite((Guaranty)otherEnd, msgs);
			case ModeloPackage.GUARANTY__NEGOTIATIONRULES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNegotiationrules((NegotiationRules)otherEnd, msgs);
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
			case ModeloPackage.GUARANTY__SLAPARAMETERS:
				return ((InternalEList<?>)getSlaparameters()).basicRemove(otherEnd, msgs);
			case ModeloPackage.GUARANTY__GUARANTY:
				return ((InternalEList<?>)getGuaranty()).basicRemove(otherEnd, msgs);
			case ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE:
				return basicSetGuarantyeOpposite(null, msgs);
			case ModeloPackage.GUARANTY__NEGOTIATIONRULES:
				return basicSetNegotiationrules(null, msgs);
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
			case ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.GUARANTY__GUARANTY, Guaranty.class, msgs);
			case ModeloPackage.GUARANTY__NEGOTIATIONRULES:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.NEGOTIATION_RULES__GUARANTY, NegotiationRules.class, msgs);
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
			case ModeloPackage.GUARANTY__SLAPARAMETERS:
				return getSlaparameters();
			case ModeloPackage.GUARANTY__GUARANTY:
				return getGuaranty();
			case ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE:
				return getGuarantyeOpposite();
			case ModeloPackage.GUARANTY__NEGOTIATIONRULES:
				return getNegotiationrules();
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
			case ModeloPackage.GUARANTY__SLAPARAMETERS:
				getSlaparameters().clear();
				getSlaparameters().addAll((Collection<? extends SLAParameters>)newValue);
				return;
			case ModeloPackage.GUARANTY__GUARANTY:
				getGuaranty().clear();
				getGuaranty().addAll((Collection<? extends Guaranty>)newValue);
				return;
			case ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE:
				setGuarantyeOpposite((Guaranty)newValue);
				return;
			case ModeloPackage.GUARANTY__NEGOTIATIONRULES:
				setNegotiationrules((NegotiationRules)newValue);
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
			case ModeloPackage.GUARANTY__SLAPARAMETERS:
				getSlaparameters().clear();
				return;
			case ModeloPackage.GUARANTY__GUARANTY:
				getGuaranty().clear();
				return;
			case ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE:
				setGuarantyeOpposite((Guaranty)null);
				return;
			case ModeloPackage.GUARANTY__NEGOTIATIONRULES:
				setNegotiationrules((NegotiationRules)null);
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
			case ModeloPackage.GUARANTY__SLAPARAMETERS:
				return slaparameters != null && !slaparameters.isEmpty();
			case ModeloPackage.GUARANTY__GUARANTY:
				return guaranty != null && !guaranty.isEmpty();
			case ModeloPackage.GUARANTY__GUARANTYE_OPPOSITE:
				return getGuarantyeOpposite() != null;
			case ModeloPackage.GUARANTY__NEGOTIATIONRULES:
				return getNegotiationrules() != null;
		}
		return super.eIsSet(featureID);
	}

} //GuarantyImpl
