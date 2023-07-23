package com.marcus.product.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/marcus/product/di/ProductModule;", "", "()V", "provideCalculateFinalPriceUseCase", "Lcom/marcus/product/domain/usecase/CalculateFinalPriceUseCase;", "provideCalculateTotalListPriceUseCase", "Lcom/marcus/product/domain/usecase/CalculateTotalListPriceUseCase;", "provideCalculateTotalListPriceWithDiscountUseCase", "Lcom/marcus/product/domain/usecase/CalculateTotalListPriceWithDiscountUseCase;", "provideGetProductUseCase", "Lcom/marcus/product/domain/usecase/GetProductUseCase;", "productRepository", "Lcom/marcus/product/domain/repository/ProductRepository;", "productMapper", "Lcom/marcus/product/domain/mapper/ProductMapper;", "provideProductMapper", "provideProductNavigation", "Lcom/marcus/navigation/ProductNavigation;", "provideProductRepository", "httpClient", "Lcom/marcus/core/provider/HttpClient;", "product_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ProductModule {
    
    public ProductModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.marcus.product.domain.repository.ProductRepository provideProductRepository(@org.jetbrains.annotations.NotNull
    com.marcus.core.provider.HttpClient httpClient) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.marcus.product.domain.mapper.ProductMapper provideProductMapper() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.marcus.product.domain.usecase.GetProductUseCase provideGetProductUseCase(@org.jetbrains.annotations.NotNull
    com.marcus.product.domain.repository.ProductRepository productRepository, @org.jetbrains.annotations.NotNull
    com.marcus.product.domain.mapper.ProductMapper productMapper) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.marcus.product.domain.usecase.CalculateFinalPriceUseCase provideCalculateFinalPriceUseCase() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.marcus.navigation.ProductNavigation provideProductNavigation() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.marcus.product.domain.usecase.CalculateTotalListPriceUseCase provideCalculateTotalListPriceUseCase() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.marcus.product.domain.usecase.CalculateTotalListPriceWithDiscountUseCase provideCalculateTotalListPriceWithDiscountUseCase() {
        return null;
    }
}