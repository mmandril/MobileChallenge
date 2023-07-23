package com.marcus.product.di;

import com.marcus.product.domain.usecase.CalculateTotalListPriceUseCase;
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
public final class ProductModule_ProvideCalculateTotalListPriceUseCaseFactory implements Factory<CalculateTotalListPriceUseCase> {
  private final ProductModule module;

  public ProductModule_ProvideCalculateTotalListPriceUseCaseFactory(ProductModule module) {
    this.module = module;
  }

  @Override
  public CalculateTotalListPriceUseCase get() {
    return provideCalculateTotalListPriceUseCase(module);
  }

  public static ProductModule_ProvideCalculateTotalListPriceUseCaseFactory create(
      ProductModule module) {
    return new ProductModule_ProvideCalculateTotalListPriceUseCaseFactory(module);
  }

  public static CalculateTotalListPriceUseCase provideCalculateTotalListPriceUseCase(
      ProductModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCalculateTotalListPriceUseCase());
  }
}
