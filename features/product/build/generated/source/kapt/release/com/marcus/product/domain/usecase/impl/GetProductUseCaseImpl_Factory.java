package com.marcus.product.domain.usecase.impl;

import com.marcus.product.domain.mapper.ProductMapper;
import com.marcus.product.domain.repository.ProductRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class GetProductUseCaseImpl_Factory implements Factory<GetProductUseCaseImpl> {
  private final Provider<ProductRepository> repositoryProvider;

  private final Provider<ProductMapper> mapperProvider;

  public GetProductUseCaseImpl_Factory(Provider<ProductRepository> repositoryProvider,
      Provider<ProductMapper> mapperProvider) {
    this.repositoryProvider = repositoryProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public GetProductUseCaseImpl get() {
    return newInstance(repositoryProvider.get(), mapperProvider.get());
  }

  public static GetProductUseCaseImpl_Factory create(Provider<ProductRepository> repositoryProvider,
      Provider<ProductMapper> mapperProvider) {
    return new GetProductUseCaseImpl_Factory(repositoryProvider, mapperProvider);
  }

  public static GetProductUseCaseImpl newInstance(ProductRepository repository,
      ProductMapper mapper) {
    return new GetProductUseCaseImpl(repository, mapper);
  }
}
