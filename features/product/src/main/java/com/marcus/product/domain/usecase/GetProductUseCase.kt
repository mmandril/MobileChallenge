package com.marcus.product.domain.usecase

import com.marcus.product.domain.model.Product

interface GetProductUseCase {

    suspend operator fun invoke(): List<Product>
}