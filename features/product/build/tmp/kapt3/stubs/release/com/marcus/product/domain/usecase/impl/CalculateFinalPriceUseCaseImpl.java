package com.marcus.product.domain.usecase.impl;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J#\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/marcus/product/domain/usecase/impl/CalculateFinalPriceUseCaseImpl;", "Lcom/marcus/product/domain/usecase/CalculateFinalPriceUseCase;", "()V", "calculateMuchPrice", "", "price", "quantity", "", "calculateTShirtPrice", "calculateVoucherPrice", "invoke", "product", "Lcom/marcus/product/domain/model/Product;", "(Lcom/marcus/product/domain/model/Product;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "product_release"})
public final class CalculateFinalPriceUseCaseImpl implements com.marcus.product.domain.usecase.CalculateFinalPriceUseCase {
    
    public CalculateFinalPriceUseCaseImpl() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable
    com.marcus.product.domain.model.Product product, int quantity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Float> $completion) {
        return null;
    }
    
    private final float calculateVoucherPrice(float price, int quantity) {
        return 0.0F;
    }
    
    private final float calculateMuchPrice(float price, int quantity) {
        return 0.0F;
    }
    
    private final float calculateTShirtPrice(float price, int quantity) {
        return 0.0F;
    }
}