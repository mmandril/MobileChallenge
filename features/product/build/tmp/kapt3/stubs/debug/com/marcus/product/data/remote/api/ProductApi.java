package com.marcus.product.data.remote.api;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/marcus/product/data/remote/api/ProductApi;", "", "getProductList", "Lcom/marcus/product/data/remote/model/ProductModelResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "product_debug"})
public abstract interface ProductApi {
    
    @retrofit2.http.GET(value = "Products.json")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProductList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.marcus.product.data.remote.model.ProductModelResponse> $completion);
}