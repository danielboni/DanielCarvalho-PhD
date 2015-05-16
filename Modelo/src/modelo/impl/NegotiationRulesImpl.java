/**
 */
package modelo.impl;

import modelo.Guaranty;
import modelo.IntegrationSLA;
import modelo.ModeloPackage;
import modelo.NegotiationRules;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negotiation Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelo.impl.NegotiationRulesImpl#getIntegrationsla <em>Integrationsla</em>}</li>
 *   <li>{@link modelo.impl.NegotiationRulesImpl#getGuaranty <em>Guaranty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegotiationRulesImpl extends MinimalEObjectImpl.Container implements NegotiationRules {
	/**
	 * The cached value of the '{@link #getGuaranty() <em>Guaranty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuaranty()
	 * @generated
	 * @ordered
	 */
	protected Guaranty guaranty;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegotiationRulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.NEGOTIATION_RULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrationSLA getIntegrationsla() {
		if (eContainerFeatureID() != ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA) return null;
		return (IntegrationSLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegrationsla(IntegrationSLA newIntegrationsla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIntegrationsla, ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrationsla(IntegrationSLA newIntegrationsla) {
		if (newIntegrationsla != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA && newIntegrationsla != null)) {
			if (EcoreUtil.isAncestor(this, newIntegrationsla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIntegrationsla != null)
				msgs = ((InternalEObject)newIntegrationsla).eInverseAdd(this, ModeloPackage.INTEGRATION_SLA__NEGOTIATIONRULES, IntegrationSLA.class, msgs);
			msgs = basicSetIntegrationsla(newIntegrationsla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA, newIntegrationsla, newIntegrationsla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guaranty getGuaranty() {
		return guaranty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuaranty(Guaranty newGuaranty, NotificationChain msgs) {
		Guaranty oldGuaranty = guaranty;
		guaranty = newGuaranty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModeloPackage.NEGOTIATION_RULES__GUARANTY, oldGuaranty, newGuaranty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuaranty(Guaranty newGuaranty) {
		if (newGuaranty != guaranty) {
			NotificationChain msgs = null;
			if (guaranty != null)
				msgs = ((InternalEObject)guaranty).eInverseRemove(this, ModeloPackage.GUARANTY__NEGOTIATIONRULES, Guaranty.class, msgs);
			if (newGuaranty != null)
				msgs = ((InternalEObject)newGuaranty).eInverseAdd(this, ModeloPackage.GUARANTY__NEGOTIATIONRULES, Guaranty.class, msgs);
			msgs = basicSetGuaranty(newGuaranty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.NEGOTIATION_RULES__GUARANTY, newGuaranty, newGuaranty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIntegrationsla((IntegrationSLA)otherEnd, msgs);
			case ModeloPackage.NEGOTIATION_RULES__GUARANTY:
				if (guaranty != null)
					msgs = ((InternalEObject)guaranty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModeloPackage.NEGOTIATION_RULES__GUARANTY, null, msgs);
				return basicSetGuaranty((Guaranty)otherEnd, msgs);
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
			case ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA:
				return basicSetIntegrationsla(null, msgs);
			case ModeloPackage.NEGOTIATION_RULES__GUARANTY:
				return basicSetGuaranty(null, msgs);
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
			case ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.INTEGRATION_SLA__NEGOTIATIONRULES, IntegrationSLA.class, msgs);
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
			case ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA:
				return getIntegrationsla();
			case ModeloPackage.NEGOTIATION_RULES__GUARANTY:
				return getGuaranty();
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
			case ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA:
				setIntegrationsla((IntegrationSLA)newValue);
				return;
			case ModeloPackage.NEGOTIATION_RULES__GUARANTY:
				setGuaranty((Guaranty)newValue);
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
			case ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA:
				setIntegrationsla((IntegrationSLA)null);
				return;
			case ModeloPackage.NEGOTIATION_RULES__GUARANTY:
				setGuaranty((Guaranty)null);
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
			case ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA:
				return getIntegrationsla() != null;
			case ModeloPackage.NEGOTIATION_RULES__GUARANTY:
				return guaranty != null;
		}
		return super.eIsSet(featureID);
	}

} //NegotiationRulesImpl
