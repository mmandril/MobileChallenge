package com.marcus.product.di;

import com.marcus.product.domain.mapper.ProductMapper;
import com.marcus.product.domain.repository.ProductRepository;
import com.marcus.product.domain.usecase.GetProductUseCase;
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
public final class ProductModule_ProvideGetProductUseCaseFactory implements Factory<GetProductUseCase> {
  private final ProductModule module;

  private final Provider<ProductRepository> productRepositoryProvider;

  private final Provider<ProductMapper> productMapperProvider;

  public ProductModule_ProvideGetProductUseCaseFactory(ProductModule module,
      Provider<ProductRepository> productRepositoryProvider,
      Provider<ProductMapper> productMapperProvider) {
    this.module = module;
    this.productRepositoryProvider = productRepositoryProvider;
    this.productMapperProvider = productMapperProvider;
  }

  @Override
  public GetProductUseCase get() {
    return provideGetProductUseCase(module, productRepositoryProvider.get(), productMapperProvider.get());
  }

  public static ProductModule_ProvideGetProductUseCaseFactory create(ProductModule module,
      Provider<ProductRepository> productRepositoryProvider,
      Provider<ProductMapper> productMapperProvider) {
    return new ProductModule_ProvideGetProductUseCaseFactory(module, productRepositoryProvider, productMapperProvider);
  }

  public static GetProductUseCase provideGetProductUseCase(ProductModule instance,
      ProductRepository productRepository, ProductMapper productMapper) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetProductUseCase(productRepository, productMapper));
  }
}
