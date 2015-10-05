/**
 */
package SLAModel.provider;

import SLAModel.util.SLAModelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SLAModelItemProviderAdapterFactory extends SLAModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLAModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.SLA} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLAItemProvider slaItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.SLA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSLAAdapter() {
		if (slaItemProvider == null) {
			slaItemProvider = new SLAItemProvider(this);
		}

		return slaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.Obligations} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObligationsItemProvider obligationsItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.Obligations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObligationsAdapter() {
		if (obligationsItemProvider == null) {
			obligationsItemProvider = new ObligationsItemProvider(this);
		}

		return obligationsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.Parties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartiesItemProvider partiesItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.Parties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartiesAdapter() {
		if (partiesItemProvider == null) {
			partiesItemProvider = new PartiesItemProvider(this);
		}

		return partiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.ServiceConsumer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceConsumerItemProvider serviceConsumerItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.ServiceConsumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceConsumerAdapter() {
		if (serviceConsumerItemProvider == null) {
			serviceConsumerItemProvider = new ServiceConsumerItemProvider(this);
		}

		return serviceConsumerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.ServiceProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceProviderItemProvider serviceProviderItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.ServiceProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceProviderAdapter() {
		if (serviceProviderItemProvider == null) {
			serviceProviderItemProvider = new ServiceProviderItemProvider(this);
		}

		return serviceProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.Garantee} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaranteeItemProvider garanteeItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.Garantee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGaranteeAdapter() {
		if (garanteeItemProvider == null) {
			garanteeItemProvider = new GaranteeItemProvider(this);
		}

		return garanteeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.Metric} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricItemProvider metricItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetricAdapter() {
		if (metricItemProvider == null) {
			metricItemProvider = new MetricItemProvider(this);
		}

		return metricItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.IntegrationSLA} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegrationSLAItemProvider integrationSLAItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.IntegrationSLA}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegrationSLAAdapter() {
		if (integrationSLAItemProvider == null) {
			integrationSLAItemProvider = new IntegrationSLAItemProvider(this);
		}

		return integrationSLAItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.ServiceDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDefinitionItemProvider serviceDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.ServiceDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceDefinitionAdapter() {
		if (serviceDefinitionItemProvider == null) {
			serviceDefinitionItemProvider = new ServiceDefinitionItemProvider(this);
		}

		return serviceDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.Query} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryItemProvider queryItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryAdapter() {
		if (queryItemProvider == null) {
			queryItemProvider = new QueryItemProvider(this);
		}

		return queryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.Unit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitItemProvider unitItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnitAdapter() {
		if (unitItemProvider == null) {
			unitItemProvider = new UnitItemProvider(this);
		}

		return unitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.ServiceComposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCompositionItemProvider serviceCompositionItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.ServiceComposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServiceCompositionAdapter() {
		if (serviceCompositionItemProvider == null) {
			serviceCompositionItemProvider = new ServiceCompositionItemProvider(this);
		}

		return serviceCompositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.MatchingUnits} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchingUnitsItemProvider matchingUnitsItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.MatchingUnits}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatchingUnitsAdapter() {
		if (matchingUnitsItemProvider == null) {
			matchingUnitsItemProvider = new MatchingUnitsItemProvider(this);
		}

		return matchingUnitsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SLAModel.MatchingMetrics} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchingMetricsItemProvider matchingMetricsItemProvider;

	/**
	 * This creates an adapter for a {@link SLAModel.MatchingMetrics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatchingMetricsAdapter() {
		if (matchingMetricsItemProvider == null) {
			matchingMetricsItemProvider = new MatchingMetricsItemProvider(this);
		}

		return matchingMetricsItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (slaItemProvider != null) slaItemProvider.dispose();
		if (obligationsItemProvider != null) obligationsItemProvider.dispose();
		if (partiesItemProvider != null) partiesItemProvider.dispose();
		if (serviceConsumerItemProvider != null) serviceConsumerItemProvider.dispose();
		if (serviceProviderItemProvider != null) serviceProviderItemProvider.dispose();
		if (garanteeItemProvider != null) garanteeItemProvider.dispose();
		if (metricItemProvider != null) metricItemProvider.dispose();
		if (integrationSLAItemProvider != null) integrationSLAItemProvider.dispose();
		if (serviceDefinitionItemProvider != null) serviceDefinitionItemProvider.dispose();
		if (queryItemProvider != null) queryItemProvider.dispose();
		if (unitItemProvider != null) unitItemProvider.dispose();
		if (serviceCompositionItemProvider != null) serviceCompositionItemProvider.dispose();
		if (matchingUnitsItemProvider != null) matchingUnitsItemProvider.dispose();
		if (matchingMetricsItemProvider != null) matchingMetricsItemProvider.dispose();
	}

}