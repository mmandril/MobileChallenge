package com.marcus.product.domain.usecase

import com.marcus.product.domain.model.Product

interface CalculateTotalListPriceWithDiscountUseCase {
    suspend operator fun invoke(productList: List<Product>): Float
}