package com.marcus.product.di;

import com.marcus.product.domain.usecase.CalculateTotalListPriceWithDiscountUseCase;
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
public final class ProductModule_ProvideCalculateTotalListPriceWithDiscountUseCaseFactory implements Factory<CalculateTotalListPriceWithDiscountUseCase> {
  private final ProductModule module;

  public ProductModule_ProvideCalculateTotalListPriceWithDiscountUseCaseFactory(
      ProductModule module) {
    this.module = module;
  }

  @Override
  public CalculateTotalListPriceWithDiscountUseCase get() {
    return provideCalculateTotalListPriceWithDiscountUseCase(module);
  }

  public static ProductModule_ProvideCalculateTotalListPriceWithDiscountUseCaseFactory create(
      ProductModule module) {
    return new ProductModule_ProvideCalculateTotalListPriceWithDiscountUseCaseFactory(module);
  }

  public static CalculateTotalListPriceWithDiscountUseCase provideCalculateTotalListPriceWithDiscountUseCase(
      ProductModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCalculateTotalListPriceWithDiscountUseCase());
  }
}
