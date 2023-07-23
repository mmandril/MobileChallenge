package com.marcus.product.domain.repository

import com.marcus.product.data.remote.model.ProductModelResponse

interface ProductRepository {

    suspend fun getProductList(): ProductModelResponse
}