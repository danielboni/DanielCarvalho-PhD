/**
 */
package modelo.util;

import modelo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see modelo.ModeloPackage
 * @generated
 */
public class ModeloAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModeloPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModeloPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeloSwitch<Adapter> modelSwitch =
		new ModeloSwitch<Adapter>() {
			@Override
			public Adapter caseSLA(SLA object) {
				return createSLAAdapter();
			}
			@Override
			public Adapter caseUserSLA(UserSLA object) {
				return createUserSLAAdapter();
			}
			@Override
			public Adapter caseServiceSLA(ServiceSLA object) {
				return createServiceSLAAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseCloud(Cloud object) {
				return createCloudAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseParty(Party object) {
				return createPartyAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseServiceComposition(ServiceComposition object) {
				return createServiceCompositionAdapter();
			}
			@Override
			public Adapter caseConcepts(Concepts object) {
				return createConceptsAdapter();
			}
			@Override
			public Adapter caseIntegrationSLA(IntegrationSLA object) {
				return createIntegrationSLAAdapter();
			}
			@Override
			public Adapter caseNegotiationRules(NegotiationRules object) {
				return createNegotiationRulesAdapter();
			}
			@Override
			public Adapter caseGuaranty(Guaranty object) {
				return createGuarantyAdapter();
			}
			@Override
			public Adapter caseObligation(Obligation object) {
				return createObligationAdapter();
			}
			@Override
			public Adapter caseSLAParameters(SLAParameters object) {
				return createSLAParametersAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link modelo.SLA <em>SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.SLA
	 * @generated
	 */
	public Adapter createSLAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.UserSLA <em>User SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.UserSLA
	 * @generated
	 */
	public Adapter createUserSLAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.ServiceSLA <em>Service SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.ServiceSLA
	 * @generated
	 */
	public Adapter createServiceSLAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.Cloud
	 * @generated
	 */
	public Adapter createCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.Party
	 * @generated
	 */
	public Adapter createPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.ServiceComposition <em>Service Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.ServiceComposition
	 * @generated
	 */
	public Adapter createServiceCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.Concepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.Concepts
	 * @generated
	 */
	public Adapter createConceptsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.IntegrationSLA <em>Integration SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.IntegrationSLA
	 * @generated
	 */
	public Adapter createIntegrationSLAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.NegotiationRules <em>Negotiation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.NegotiationRules
	 * @generated
	 */
	public Adapter createNegotiationRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.Guaranty <em>Guaranty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.Guaranty
	 * @generated
	 */
	public Adapter createGuarantyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.Obligation <em>Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.Obligation
	 * @generated
	 */
	public Adapter createObligationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelo.SLAParameters <em>SLA Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelo.SLAParameters
	 * @generated
	 */
	public Adapter createSLAParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModeloAdapterFactory
