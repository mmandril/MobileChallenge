package com.marcus.product.di;

import com.marcus.core.provider.HttpClient;
import com.marcus.product.domain.repository.ProductRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductModule_ProvideProductRepositoryFactory implements Factory<ProductRepository> {
  private final ProductModule module;

  private final Provider<HttpClient> httpClientProvider;

  public ProductModule_ProvideProductRepositoryFactory(ProductModule module,
      Provider<HttpClient> httpClientProvider) {
    this.module = module;
    this.httpClientProvider = httpClientProvider;
  }

  @Override
  public ProductRepository get() {
    return provideProductRepository(module, httpClientProvider.get());
  }

  public static ProductModule_ProvideProductRepositoryFactory create(ProductModule module,
      Provider<HttpClient> httpClientProvider) {
    return new ProductModule_ProvideProductRepositoryFactory(module, httpClientProvider);
  }

  public static ProductRepository provideProductRepository(ProductModule instance,
      HttpClient httpClient) {
    return Preconditions.checkNotNullFromProvides(instance.provideProductRepository(httpClient));
  }
}
