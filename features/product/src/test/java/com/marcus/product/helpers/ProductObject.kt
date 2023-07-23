package com.marcus.product.helpers

import com.marcus.product.data.remote.model.ProductModelResponse
import com.marcus.product.domain.model.Product

fun getProductResponse(): ProductModelResponse {
    return ProductModelResponse(
        arrayListOf(
            ProductModelResponse.Product(
                code = ProductModelResponse.Product.ProductCode.TSHIRT,
                name = "T-SHIRT",
                price = 20f
            ),
            ProductModelResponse.Product(
                code = ProductModelResponse.Product.ProductCode.MUG,
                name = "MUG",
                price = 10f
            ),
            ProductModelResponse.Product(
                code = ProductModelResponse.Product.ProductCode.VOUCHER,
                name = "Voucher",
                price = 5f
            ),
        )
    )
}

fun getProductList(): List<Product> {
    return arrayListOf(
        Product(
            code = Product.ProductCode.TSHIRT,
            name = "T-SHIRT",
            price = 20f,
            quantity = 3,
            priceWithDiscount = 57f
        ),
        Product(
            code = Product.ProductCode.MUG,
            name = "MUG",
            price = 10f,
            quantity = 2,
            priceWithDiscount = 20f
        ),
        Product(
            code = Product.ProductCode.VOUCHER,
            name = "Voucher",
            price = 5f,
            quantity = 2,
            priceWithDiscount = 5f
        ),
    )
}