package com.marcus.product.view;

import com.marcus.product.domain.usecase.CalculateFinalPriceUseCase;
import com.marcus.product.domain.usecase.CalculateTotalListPriceUseCase;
import com.marcus.product.domain.usecase.CalculateTotalListPriceWithDiscountUseCase;
import com.marcus.product.domain.usecase.GetProductUseCase;
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
public final class ProductListViewModel_Factory implements Factory<ProductListViewModel> {
  private final Provider<GetProductUseCase> getProductUseCaseProvider;

  private final Provider<CalculateFinalPriceUseCase> calculateFinalPriceUseCaseProvider;

  private final Provider<CalculateTotalListPriceUseCase> calculateTotalListPriceUseCaseProvider;

  private final Provider<CalculateTotalListPriceWithDiscountUseCase> calculateTotalListPriceWithDiscountUseCaseProvider;

  public ProductListViewModel_Factory(Provider<GetProductUseCase> getProductUseCaseProvider,
      Provider<CalculateFinalPriceUseCase> calculateFinalPriceUseCaseProvider,
      Provider<CalculateTotalListPriceUseCase> calculateTotalListPriceUseCaseProvider,
      Provider<CalculateTotalListPriceWithDiscountUseCase> calculateTotalListPriceWithDiscountUseCaseProvider) {
    this.getProductUseCaseProvider = getProductUseCaseProvider;
    this.calculateFinalPriceUseCaseProvider = calculateFinalPriceUseCaseProvider;
    this.calculateTotalListPriceUseCaseProvider = calculateTotalListPriceUseCaseProvider;
    this.calculateTotalListPriceWithDiscountUseCaseProvider = calculateTotalListPriceWithDiscountUseCaseProvider;
  }

  @Override
  public ProductListViewModel get() {
    return newInstance(getProductUseCaseProvider.get(), calculateFinalPriceUseCaseProvider.get(), calculateTotalListPriceUseCaseProvider.get(), calculateTotalListPriceWithDiscountUseCaseProvider.get());
  }

  public static ProductListViewModel_Factory create(
      Provider<GetProductUseCase> getProductUseCaseProvider,
      Provider<CalculateFinalPriceUseCase> calculateFinalPriceUseCaseProvider,
      Provider<CalculateTotalListPriceUseCase> calculateTotalListPriceUseCaseProvider,
      Provider<CalculateTotalListPriceWithDiscountUseCase> calculateTotalListPriceWithDiscountUseCaseProvider) {
    return new ProductListViewModel_Factory(getProductUseCaseProvider, calculateFinalPriceUseCaseProvider, calculateTotalListPriceUseCaseProvider, calculateTotalListPriceWithDiscountUseCaseProvider);
  }

  public static ProductListViewModel newInstance(GetProductUseCase getProductUseCase,
      CalculateFinalPriceUseCase calculateFinalPriceUseCase,
      CalculateTotalListPriceUseCase calculateTotalListPriceUseCase,
      CalculateTotalListPriceWithDiscountUseCase calculateTotalListPriceWithDiscountUseCase) {
    return new ProductListViewModel(getProductUseCase, calculateFinalPriceUseCase, calculateTotalListPriceUseCase, calculateTotalListPriceWithDiscountUseCase);
  }
}
