package com.marcus.product.domain.usecase.impl

import com.marcus.product.domain.model.Product
import com.marcus.product.domain.usecase.CalculateTotalListPriceWithDiscountUseCase

internal class CalculateTotalListPriceWithDiscountUseCaseImpl :
    CalculateTotalListPriceWithDiscountUseCase {

    override suspend fun invoke(productList: List<Product>): Float {
        var totalWithDiscount = 0f
        productList.forEach { product ->
            totalWithDiscount += product.priceWithDiscount
        }
        return totalWithDiscount
    }
}