package com.marcus.product.domain.repository

import com.marcus.product.data.remote.api.ProductApi
import com.marcus.product.data.remote.repository.ProductRepositoryImpl
import com.marcus.product.helpers.getProductResponse
import io.mockk.coEvery
import io.mockk.mockk
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class ProductRepositoryTest {

    private val productApi = mockk<ProductApi>()
    private lateinit var productRepository: ProductRepository

    @Before
    fun setup() {
        productRepository = ProductRepositoryImpl(productApi)
    }

    @Test
    fun `getProductList should return a object ProductModelResponse with a list with 3 items`() =
        runTest {
            //GIVEN
            coEvery { productApi.getProductList() } returns getProductResponse()

            //WHEN
            val result = productRepository.getProductList()

            //THEN
            assertEquals(3, result.productList?.size)
        }
}