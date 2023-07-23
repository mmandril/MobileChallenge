package com.marcus.product.domain.mapper.impl

import com.marcus.product.data.remote.model.ProductModelResponse
import com.marcus.product.domain.mapper.ProductMapper
import com.marcus.product.domain.model.Product

internal class ProductMapperImpl : ProductMapper {

    override fun transform(source: ProductModelResponse): List<Product> {
        return source.productList?.map { product ->
            mapProduct(product)
        } ?: emptyList()
    }

    private fun mapProduct(product: ProductModelResponse.Product): Product {
        return Product(
            code = getCode(product.code),
            name = product.name,
            price = product.price,
            quantityDiscount = product.quantityDiscount,
            priceDiscount = product.priceDiscount,
            quantityToOne = product.quantityToOne,
        )
    }

    private fun getCode(code: ProductModelResponse.Product.ProductCode): Product.ProductCode {
        return when (code) {
            ProductModelResponse.Product.ProductCode.VOUCHER -> Product.ProductCode.VOUCHER
            ProductModelResponse.Product.ProductCode.TSHIRT -> Product.ProductCode.TSHIRT
            ProductModelResponse.Product.ProductCode.MUG -> Product.ProductCode.MUG
        }
    }

}