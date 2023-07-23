package com.marcus.product.domain.usecase

import com.marcus.product.domain.model.Product

interface CalculateFinalPriceUseCase {
    suspend operator fun invoke(product: Product?, quantity: Int): Float
}