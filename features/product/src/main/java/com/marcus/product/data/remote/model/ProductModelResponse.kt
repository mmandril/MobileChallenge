package com.marcus.product.data.remote.model

import com.google.gson.annotations.SerializedName
import com.marcus.product.domain.model.Product

data class ProductModelResponse(
    @SerializedName("products")
    val productList: List<Product>? = null,
) {
    data class Product(
        @SerializedName("code")
        val code: ProductCode,
        @SerializedName("name")
        val name: String,
        @SerializedName("price")
        val price: Float,
        @SerializedName("quantity_discount")
        val quantityDiscount: Int? = null,
        @SerializedName("price_discount")
        val priceDiscount: Float? = null,
        @SerializedName("quantity_to_one")
        val quantityToOne: Int? = null,
    ) {
        enum class ProductCode {
            VOUCHER, TSHIRT, MUG
        }
    }
}



