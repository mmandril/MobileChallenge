package com.marcus.product.domain.usecase

import com.marcus.product.domain.usecase.impl.CalculateTotalListPriceUseCaseImpl
import com.marcus.product.helpers.getProductList
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculateTotalListPriceUseCaseTest {

    private lateinit var calculateTotalListPriceUseCase: CalculateTotalListPriceUseCase

    @Before
    fun setup() {
        calculateTotalListPriceUseCase = CalculateTotalListPriceUseCaseImpl()
    }

    @Test
    fun `GIVEN a list of product should return the total price with no discount`() = runTest {
        val productList = getProductList()

        val result = calculateTotalListPriceUseCase(productList)

        assertEquals(90f, result)
    }
}