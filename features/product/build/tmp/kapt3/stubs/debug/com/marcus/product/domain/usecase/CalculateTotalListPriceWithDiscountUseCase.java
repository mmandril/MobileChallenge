package com.marcus.product.domain.usecase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a6B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/marcus/product/domain/usecase/CalculateTotalListPriceWithDiscountUseCase;", "", "invoke", "", "productList", "", "Lcom/marcus/product/domain/model/Product;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "product_debug"})
public abstract interface CalculateTotalListPriceWithDiscountUseCase {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.util.List<com.marcus.product.domain.model.Product> productList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Float> $completion);
}