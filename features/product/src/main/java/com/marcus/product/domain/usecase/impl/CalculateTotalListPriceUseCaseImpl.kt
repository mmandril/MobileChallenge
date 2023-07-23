package com.marcus.product.domain.usecase.impl

import com.marcus.product.domain.model.Product
import com.marcus.product.domain.usecase.CalculateTotalListPriceUseCase

internal class CalculateTotalListPriceUseCaseImpl : CalculateTotalListPriceUseCase {

    override suspend fun invoke(productList: List<Product>): Float {
        var totalPrice = 0f
        productList.forEach { product ->
            totalPrice += product.price * product.quantity
        }
        return totalPrice
    }
}