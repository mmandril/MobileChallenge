package com.marcus.product.view

import com.marcus.product.domain.model.Product

internal data class ProductListState(
    val productList: List<Product> = arrayListOf(),
    val totalPrice: Float = 0f,
    val totalPriceWithDiscount: Float = 0f
)