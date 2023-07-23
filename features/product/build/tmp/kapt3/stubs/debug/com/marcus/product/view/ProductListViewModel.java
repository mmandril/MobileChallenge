package com.marcus.product.view;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0011\u0010\u0019\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ \u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/marcus/product/view/ProductListViewModel;", "Landroidx/lifecycle/ViewModel;", "getProductUseCase", "Lcom/marcus/product/domain/usecase/GetProductUseCase;", "calculateFinalPriceUseCase", "Lcom/marcus/product/domain/usecase/CalculateFinalPriceUseCase;", "calculateTotalListPriceUseCase", "Lcom/marcus/product/domain/usecase/CalculateTotalListPriceUseCase;", "calculateTotalListPriceWithDiscountUseCase", "Lcom/marcus/product/domain/usecase/CalculateTotalListPriceWithDiscountUseCase;", "(Lcom/marcus/product/domain/usecase/GetProductUseCase;Lcom/marcus/product/domain/usecase/CalculateFinalPriceUseCase;Lcom/marcus/product/domain/usecase/CalculateTotalListPriceUseCase;Lcom/marcus/product/domain/usecase/CalculateTotalListPriceWithDiscountUseCase;)V", "_productListState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/marcus/product/view/ProductListState;", "productListState", "Lkotlinx/coroutines/flow/StateFlow;", "getProductListState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeQuantity", "", "code", "", "quantity", "", "getProductList", "updateStateWithListPrice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateStateWithProductFinalPrice", "finalPrice", "", "product_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ProductListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.marcus.product.domain.usecase.GetProductUseCase getProductUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.marcus.product.domain.usecase.CalculateFinalPriceUseCase calculateFinalPriceUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.marcus.product.domain.usecase.CalculateTotalListPriceUseCase calculateTotalListPriceUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.marcus.product.domain.usecase.CalculateTotalListPriceWithDiscountUseCase calculateTotalListPriceWithDiscountUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.marcus.product.view.ProductListState> _productListState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.marcus.product.view.ProductListState> productListState = null;
    
    @javax.inject.Inject
    public ProductListViewModel(@org.jetbrains.annotations.NotNull
    com.marcus.product.domain.usecase.GetProductUseCase getProductUseCase, @org.jetbrains.annotations.NotNull
    com.marcus.product.domain.usecase.CalculateFinalPriceUseCase calculateFinalPriceUseCase, @org.jetbrains.annotations.NotNull
    com.marcus.product.domain.usecase.CalculateTotalListPriceUseCase calculateTotalListPriceUseCase, @org.jetbrains.annotations.NotNull
    com.marcus.product.domain.usecase.CalculateTotalListPriceWithDiscountUseCase calculateTotalListPriceWithDiscountUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.marcus.product.view.ProductListState> getProductListState() {
        return null;
    }
    
    private final void getProductList() {
    }
    
    public final void changeQuantity(@org.jetbrains.annotations.NotNull
    java.lang.String code, int quantity) {
    }
    
    private final void updateStateWithProductFinalPrice(float finalPrice, java.lang.String code, int quantity) {
    }
    
    private final java.lang.Object updateStateWithListPrice(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}