package com.marcus.product.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marcus.product.domain.usecase.CalculateFinalPriceUseCase
import com.marcus.product.domain.usecase.CalculateTotalListPriceUseCase
import com.marcus.product.domain.usecase.CalculateTotalListPriceWithDiscountUseCase
import com.marcus.product.domain.usecase.GetProductUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
internal class ProductListViewModel @Inject constructor(
    private val getProductUseCase: GetProductUseCase,
    private val calculateFinalPriceUseCase: CalculateFinalPriceUseCase,
    private val calculateTotalListPriceUseCase: CalculateTotalListPriceUseCase,
    private val calculateTotalListPriceWithDiscountUseCase: CalculateTotalListPriceWithDiscountUseCase
) : ViewModel() {

    private val _productListState = MutableStateFlow(ProductListState())
    val productListState = _productListState.asStateFlow()

    init {
        getProductList()
    }

    private fun getProductList() {
        viewModelScope.launch {
            _productListState.update {
                it.copy(
                    productList = getProductUseCase()
                )
            }
        }
    }

    fun changeQuantity(code: String, quantity: Int) {
        viewModelScope.launch {
            val finalPrice = calculateFinalPriceUseCase(
                _productListState.value.productList.find {
                    it.code.toString().equals(code, true)
                },
                quantity
            )

            updateStateWithProductFinalPrice(finalPrice, code, quantity)
            updateStateWithListPrice()
        }
    }


    private fun updateStateWithProductFinalPrice(
        finalPrice: Float,
        code: String,
        quantity: Int
    ) {
        _productListState.update { state ->
            state.copy(
                productList = state.productList.map { product ->
                    if (product.code.toString().equals(code, true)) {
                        product.copy(
                            priceWithDiscount = finalPrice,
                            quantity = quantity
                        )
                    } else product
                }
            )
        }
    }

    private suspend fun updateStateWithListPrice() {
        _productListState.update { state ->
            state.copy(
                totalPrice = calculateTotalListPriceUseCase(state.productList),
                totalPriceWithDiscount = calculateTotalListPriceWithDiscountUseCase(state.productList)
            )
        }
    }
}