package com.marcus.product.di;

import com.marcus.product.domain.usecase.CalculateFinalPriceUseCase;
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
public final class ProductModule_ProvideCalculateFinalPriceUseCaseFactory implements Factory<CalculateFinalPriceUseCase> {
  private final ProductModule module;

  public ProductModule_ProvideCalculateFinalPriceUseCaseFactory(ProductModule module) {
    this.module = module;
  }

  @Override
  public CalculateFinalPriceUseCase get() {
    return provideCalculateFinalPriceUseCase(module);
  }

  public static ProductModule_ProvideCalculateFinalPriceUseCaseFactory create(
      ProductModule module) {
    return new ProductModule_ProvideCalculateFinalPriceUseCaseFactory(module);
  }

  public static CalculateFinalPriceUseCase provideCalculateFinalPriceUseCase(
      ProductModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCalculateFinalPriceUseCase());
  }
}
