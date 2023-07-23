package com.marcus.product.domain.usecase.impl

import com.marcus.product.domain.model.Product
import com.marcus.product.domain.usecase.CalculateFinalPriceUseCase

internal class CalculateFinalPriceUseCaseImpl : CalculateFinalPriceUseCase {

    override suspend operator fun invoke(product: Product?, quantity: Int): Float {
        return calculatePrice(product, quantity)
    }

    private fun calculatePrice(product: Product?, quantity: Int): Float {
        var finalPrice = 0f
        product?.let {
            if (it.quantityToOne != null) {
                finalPrice = calculateQuantityToOne(it.price, quantity, it.quantityToOne)
            } else if (it.quantityDiscount != null) {
                finalPrice =
                    calculateQuantityDiscount(
                        it.price,
                        quantity,
                        it.quantityDiscount,
                        it.priceDiscount
                    )
            } else {
                finalPrice = calculateNormalPrice(it.price, quantity)
            }
        }

        return finalPrice
    }

    private fun calculateQuantityToOne(price: Float, quantity: Int, quantityToOne: Int): Float {
        val inPromotion = quantity / quantityToOne
        val notInPromotion = quantity % quantityToOne

        return (inPromotion * price) + (notInPromotion * price)
    }

    private fun calculateNormalPrice(price: Float, quantity: Int): Float {
        return quantity * price
    }

    private fun calculateQuantityDiscount(
        price: Float,
        quantity: Int,
        quantityDiscount: Int,
        priceDiscount: Float?
    ): Float {
        return if (quantity >= quantityDiscount && priceDiscount != null) {
            quantity * priceDiscount
        } else {
            quantity * price
        }
    }
}