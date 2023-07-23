package com.marcus.product.domain.usecase.impl

import com.marcus.product.domain.mapper.ProductMapper
import com.marcus.product.domain.model.Product
import com.marcus.product.domain.repository.ProductRepository
import com.marcus.product.domain.usecase.GetProductUseCase
import javax.inject.Inject

internal class GetProductUseCaseImpl @Inject constructor(
    private val repository: ProductRepository,
    private val mapper: ProductMapper,
) : GetProductUseCase {
    override suspend fun invoke(): List<Product> {
        return mapper.transform(repository.getProductList())
    }
}