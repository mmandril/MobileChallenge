package com.marcus.product.domain.usecase

import com.marcus.product.domain.usecase.impl.CalculateTotalListPriceWithDiscountUseCaseImpl
import com.marcus.product.helpers.getProductList
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class CalculateTotalListPriceWithDiscountUseCaseTest {

    private lateinit var calculateTotalListPriceWithDiscountUseCase: CalculateTotalListPriceWithDiscountUseCase


    @Before
    fun setup() {
        calculateTotalListPriceWithDiscountUseCase =
            CalculateTotalListPriceWithDiscountUseCaseImpl()
    }

    @Test
    fun `GIVEN a list of product should return the total price with discount`() = runTest {
        val productList = getProductList()

        val result = calculateTotalListPriceWithDiscountUseCase(productList)

        assertEquals(82f, result)
    }
}
