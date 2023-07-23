package com.marcus.product.data.remote.repository

import com.marcus.product.data.remote.api.ProductApi
import com.marcus.product.data.remote.model.ProductModelResponse
import com.marcus.product.domain.repository.ProductRepository
import javax.inject.Inject

internal class ProductRepositoryImpl @Inject constructor(
    private val productApi: ProductApi,
) : ProductRepository {

    override suspend fun getProductList(): ProductModelResponse {
        return productApi.getProductList()
    }
}