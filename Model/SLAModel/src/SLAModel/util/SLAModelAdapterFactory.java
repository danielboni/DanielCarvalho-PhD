/**
 */
package SLAModel.util;

import SLAModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SLAModel.SLAModelPackage
 * @generated
 */
public class SLAModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SLAModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLAModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SLAModelPackage.eINSTANCE;
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
	protected SLAModelSwitch<Adapter> modelSwitch =
		new SLAModelSwitch<Adapter>() {
			@Override
			public Adapter caseSLA(SLA object) {
				return createSLAAdapter();
			}
			@Override
			public Adapter caseObligations(Obligations object) {
				return createObligationsAdapter();
			}
			@Override
			public Adapter caseParties(Parties object) {
				return createPartiesAdapter();
			}
			@Override
			public Adapter caseServiceConsumer(ServiceConsumer object) {
				return createServiceConsumerAdapter();
			}
			@Override
			public Adapter caseServiceProvider(ServiceProvider object) {
				return createServiceProviderAdapter();
			}
			@Override
			public Adapter caseGarantee(Garantee object) {
				return createGaranteeAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseIntegrationSLA(IntegrationSLA object) {
				return createIntegrationSLAAdapter();
			}
			@Override
			public Adapter caseServiceDefinition(ServiceDefinition object) {
				return createServiceDefinitionAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseServiceComposition(ServiceComposition object) {
				return createServiceCompositionAdapter();
			}
			@Override
			public Adapter caseMatchingUnits(MatchingUnits object) {
				return createMatchingUnitsAdapter();
			}
			@Override
			public Adapter caseMatchingMetrics(MatchingMetrics object) {
				return createMatchingMetricsAdapter();
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
	 * Creates a new adapter for an object of class '{@link SLAModel.SLA <em>SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.SLA
	 * @generated
	 */
	public Adapter createSLAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.Obligations <em>Obligations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.Obligations
	 * @generated
	 */
	public Adapter createObligationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.Parties <em>Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.Parties
	 * @generated
	 */
	public Adapter createPartiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.ServiceConsumer <em>Service Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.ServiceConsumer
	 * @generated
	 */
	public Adapter createServiceConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.ServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.ServiceProvider
	 * @generated
	 */
	public Adapter createServiceProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.Garantee <em>Garantee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.Garantee
	 * @generated
	 */
	public Adapter createGaranteeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.IntegrationSLA <em>Integration SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.IntegrationSLA
	 * @generated
	 */
	public Adapter createIntegrationSLAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.ServiceDefinition <em>Service Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.ServiceDefinition
	 * @generated
	 */
	public Adapter createServiceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.ServiceComposition <em>Service Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.ServiceComposition
	 * @generated
	 */
	public Adapter createServiceCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.MatchingUnits <em>Matching Units</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.MatchingUnits
	 * @generated
	 */
	public Adapter createMatchingUnitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SLAModel.MatchingMetrics <em>Matching Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SLAModel.MatchingMetrics
	 * @generated
	 */
	public Adapter createMatchingMetricsAdapter() {
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

} //SLAModelAdapterFactory
