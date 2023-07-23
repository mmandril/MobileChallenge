package com.marcus.product.domain.mapper

import com.marcus.product.data.remote.model.ProductModelResponse
import com.marcus.product.domain.model.Product

interface ProductMapper {

    fun transform(source: ProductModelResponse): List<Product>
}