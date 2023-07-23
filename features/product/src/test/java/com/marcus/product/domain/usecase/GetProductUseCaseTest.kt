package com.marcus.product.domain.usecase

import com.marcus.product.BaseTest
import com.marcus.product.domain.mapper.ProductMapper
import com.marcus.product.domain.repository.ProductRepository
import com.marcus.product.domain.usecase.impl.GetProductUseCaseImpl
import com.marcus.product.helpers.getProductList
import com.marcus.product.helpers.getProductResponse
import io.mockk.coEvery
import io.mockk.mockk
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class GetProductUseCaseTest : BaseTest() {

    private var mockMapper = mockk<ProductMapper>()
    private var mockProductRepository = mockk<ProductRepository>()
    private lateinit var getProductUseCase: GetProductUseCase

    @Before
    fun setup() {
        getProductUseCase = GetProductUseCaseImpl(mockProductRepository, mockMapper)
    }

    @Test
    fun `should return a list of products with 3 items`() = runTest {
        //GIVEN
        coEvery { mockProductRepository.getProductList() } returns getProductResponse()
        coEvery { mockMapper.transform(getProductResponse()) } returns getProductList()

        //WHEN
        val result = getProductUseCase()

        //THEN
        assertEquals(3, result.size)
    }
}