package com.marcus.product.domain.model

data class Product(
    val code: ProductCode,
    val name: String,
    val price: Float,
    val quantity: Int = 0,
    val priceWithDiscount: Float = 0f,
    val quantityDiscount: Int? = null,
    val priceDiscount: Float? = null,
    val quantityToOne: Int? = null,
) {
    enum class ProductCode {
        VOUCHER, TSHIRT, MUG
    }
}