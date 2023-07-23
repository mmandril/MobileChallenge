package com.marcus.product.domain.usecase

import com.marcus.product.BaseTest
import com.marcus.product.domain.model.Product
import com.marcus.product.domain.usecase.impl.CalculateFinalPriceUseCaseImpl
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class CalculateFinalPriceUseCaseTest : BaseTest() {

    private lateinit var calculateFinalPriceUseCase: CalculateFinalPriceUseCase

    @Before
    fun setup() {
        calculateFinalPriceUseCase = CalculateFinalPriceUseCaseImpl()
    }

    @Test
    fun `GIVEN a VOUCHER with 2 items THEN should return price with discount equals a 5`() = runTest {
        val product = Product(
            code = Product.ProductCode.VOUCHER,
            name = "VOUCHER",
            price = 5f,
            quantityToOne = 2
        )

        val result = calculateFinalPriceUseCase(product, 2)

        assertEquals(5f, result)
    }

    @Test
    fun `GIVEN a VOUCHER with 3 items THEN should return price with discount equals a 10`() = runTest {
        val product = Product(
            code = Product.ProductCode.VOUCHER,
            name = "VOUCHER",
            price = 5f,
            quantityToOne = 2
        )

        val result = calculateFinalPriceUseCase(product, 3)

        assertEquals(10f, result)
    }

    @Test
    fun `GIVEN a T-SHIRT with 3 items THEN should return price with discount equals a 57`() = runTest {
        val product = Product(
            code = Product.ProductCode.TSHIRT,
            name = "T-Shirt",
            price = 20f,
            quantityDiscount = 3,
            priceDiscount = 19f
        )

        val result = calculateFinalPriceUseCase(product, 3)

        assertEquals(57f, result)
    }
}