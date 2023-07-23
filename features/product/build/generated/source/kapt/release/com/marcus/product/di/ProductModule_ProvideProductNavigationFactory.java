package com.marcus.product.di;

import com.marcus.navigation.ProductNavigation;
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
public final class ProductModule_ProvideProductNavigationFactory implements Factory<ProductNavigation> {
  private final ProductModule module;

  public ProductModule_ProvideProductNavigationFactory(ProductModule module) {
    this.module = module;
  }

  @Override
  public ProductNavigation get() {
    return provideProductNavigation(module);
  }

  public static ProductModule_ProvideProductNavigationFactory create(ProductModule module) {
    return new ProductModule_ProvideProductNavigationFactory(module);
  }

  public static ProductNavigation provideProductNavigation(ProductModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideProductNavigation());
  }
}
