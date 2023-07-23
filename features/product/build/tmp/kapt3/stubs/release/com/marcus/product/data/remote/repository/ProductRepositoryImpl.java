package com.marcus.product.data.remote.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/marcus/product/data/remote/repository/ProductRepositoryImpl;", "Lcom/marcus/product/domain/repository/ProductRepository;", "productApi", "Lcom/marcus/product/data/remote/api/ProductApi;", "(Lcom/marcus/product/data/remote/api/ProductApi;)V", "getProductList", "Lcom/marcus/product/data/remote/model/ProductModelResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "product_release"})
public final class ProductRepositoryImpl implements com.marcus.product.domain.repository.ProductRepository {
    @org.jetbrains.annotations.NotNull
    private final com.marcus.product.data.remote.api.ProductApi productApi = null;
    
    @javax.inject.Inject
    public ProductRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.marcus.product.data.remote.api.ProductApi productApi) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getProductList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.marcus.product.data.remote.model.ProductModelResponse> $completion) {
        return null;
    }
}