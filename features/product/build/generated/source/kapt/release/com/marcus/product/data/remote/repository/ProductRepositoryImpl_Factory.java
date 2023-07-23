package com.marcus.product.data.remote.repository;

import com.marcus.product.data.remote.api.ProductApi;
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
public final class ProductRepositoryImpl_Factory implements Factory<ProductRepositoryImpl> {
  private final Provider<ProductApi> productApiProvider;

  public ProductRepositoryImpl_Factory(Provider<ProductApi> productApiProvider) {
    this.productApiProvider = productApiProvider;
  }

  @Override
  public ProductRepositoryImpl get() {
    return newInstance(productApiProvider.get());
  }

  public static ProductRepositoryImpl_Factory create(Provider<ProductApi> productApiProvider) {
    return new ProductRepositoryImpl_Factory(productApiProvider);
  }

  public static ProductRepositoryImpl newInstance(ProductApi productApi) {
    return new ProductRepositoryImpl(productApi);
  }
}
