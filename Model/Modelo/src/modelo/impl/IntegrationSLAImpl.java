/**
 */
package modelo.impl;

import java.util.Collection;
import modelo.Concepts;
import modelo.IntegrationSLA;
import modelo.ModeloPackage;
import modelo.NegotiationRules;
import modelo.SLA;

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
 * An implementation of the model object '<em><b>Integration SLA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelo.impl.IntegrationSLAImpl#getSla <em>Sla</em>}</li>
 *   <li>{@link modelo.impl.IntegrationSLAImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link modelo.impl.IntegrationSLAImpl#getNegotiationrules <em>Negotiationrules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegrationSLAImpl extends MinimalEObjectImpl.Container implements IntegrationSLA {
	/**
	 * The cached value of the '{@link #getNegotiationrules() <em>Negotiationrules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiationrules()
	 * @generated
	 * @ordered
	 */
	protected EList<NegotiationRules> negotiationrules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationSLAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.INTEGRATION_SLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLA getSla() {
		if (eContainerFeatureID() != ModeloPackage.INTEGRATION_SLA__SLA) return null;
		return (SLA)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSla(SLA newSla, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSla, ModeloPackage.INTEGRATION_SLA__SLA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSla(SLA newSla) {
		if (newSla != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.INTEGRATION_SLA__SLA && newSla != null)) {
			if (EcoreUtil.isAncestor(this, newSla))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSla != null)
				msgs = ((InternalEObject)newSla).eInverseAdd(this, ModeloPackage.SLA__INTEGRATIONSLA, SLA.class, msgs);
			msgs = basicSetSla(newSla, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.INTEGRATION_SLA__SLA, newSla, newSla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concepts getConcepts() {
		if (eContainerFeatureID() != ModeloPackage.INTEGRATION_SLA__CONCEPTS) return null;
		return (Concepts)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcepts(Concepts newConcepts, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConcepts, ModeloPackage.INTEGRATION_SLA__CONCEPTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcepts(Concepts newConcepts) {
		if (newConcepts != eInternalContainer() || (eContainerFeatureID() != ModeloPackage.INTEGRATION_SLA__CONCEPTS && newConcepts != null)) {
			if (EcoreUtil.isAncestor(this, newConcepts))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConcepts != null)
				msgs = ((InternalEObject)newConcepts).eInverseAdd(this, ModeloPackage.CONCEPTS__INTEGRATIONSLA, Concepts.class, msgs);
			msgs = basicSetConcepts(newConcepts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPackage.INTEGRATION_SLA__CONCEPTS, newConcepts, newConcepts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NegotiationRules> getNegotiationrules() {
		if (negotiationrules == null) {
			negotiationrules = new EObjectContainmentWithInverseEList<NegotiationRules>(NegotiationRules.class, this, ModeloPackage.INTEGRATION_SLA__NEGOTIATIONRULES, ModeloPackage.NEGOTIATION_RULES__INTEGRATIONSLA);
		}
		return negotiationrules;
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
			case ModeloPackage.INTEGRATION_SLA__SLA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSla((SLA)otherEnd, msgs);
			case ModeloPackage.INTEGRATION_SLA__CONCEPTS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConcepts((Concepts)otherEnd, msgs);
			case ModeloPackage.INTEGRATION_SLA__NEGOTIATIONRULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNegotiationrules()).basicAdd(otherEnd, msgs);
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
			case ModeloPackage.INTEGRATION_SLA__SLA:
				return basicSetSla(null, msgs);
			case ModeloPackage.INTEGRATION_SLA__CONCEPTS:
				return basicSetConcepts(null, msgs);
			case ModeloPackage.INTEGRATION_SLA__NEGOTIATIONRULES:
				return ((InternalEList<?>)getNegotiationrules()).basicRemove(otherEnd, msgs);
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
			case ModeloPackage.INTEGRATION_SLA__SLA:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.SLA__INTEGRATIONSLA, SLA.class, msgs);
			case ModeloPackage.INTEGRATION_SLA__CONCEPTS:
				return eInternalContainer().eInverseRemove(this, ModeloPackage.CONCEPTS__INTEGRATIONSLA, Concepts.class, msgs);
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
			case ModeloPackage.INTEGRATION_SLA__SLA:
				return getSla();
			case ModeloPackage.INTEGRATION_SLA__CONCEPTS:
				return getConcepts();
			case ModeloPackage.INTEGRATION_SLA__NEGOTIATIONRULES:
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
			case ModeloPackage.INTEGRATION_SLA__SLA:
				setSla((SLA)newValue);
				return;
			case ModeloPackage.INTEGRATION_SLA__CONCEPTS:
				setConcepts((Concepts)newValue);
				return;
			case ModeloPackage.INTEGRATION_SLA__NEGOTIATIONRULES:
				getNegotiationrules().clear();
				getNegotiationrules().addAll((Collection<? extends NegotiationRules>)newValue);
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
			case ModeloPackage.INTEGRATION_SLA__SLA:
				setSla((SLA)null);
				return;
			case ModeloPackage.INTEGRATION_SLA__CONCEPTS:
				setConcepts((Concepts)null);
				return;
			case ModeloPackage.INTEGRATION_SLA__NEGOTIATIONRULES:
				getNegotiationrules().clear();
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
			case ModeloPackage.INTEGRATION_SLA__SLA:
				return getSla() != null;
			case ModeloPackage.INTEGRATION_SLA__CONCEPTS:
				return getConcepts() != null;
			case ModeloPackage.INTEGRATION_SLA__NEGOTIATIONRULES:
				return negotiationrules != null && !negotiationrules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntegrationSLAImpl
