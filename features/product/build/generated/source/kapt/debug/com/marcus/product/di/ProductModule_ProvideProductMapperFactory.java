package com.marcus.product.di;

import com.marcus.product.domain.mapper.ProductMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class ProductModule_ProvideProductMapperFactory implements Factory<ProductMapper> {
  private final ProductModule module;

  public ProductModule_ProvideProductMapperFactory(ProductModule module) {
    this.module = module;
  }

  @Override
  public ProductMapper get() {
    return provideProductMapper(module);
  }

  public static ProductModule_ProvideProductMapperFactory create(ProductModule module) {
    return new ProductModule_ProvideProductMapperFactory(module);
  }

  public static ProductMapper provideProductMapper(ProductModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideProductMapper());
  }
}
