package com.marcus.product.domain.mapper

import com.marcus.product.data.remote.model.ProductModelResponse
import com.marcus.product.domain.mapper.impl.ProductMapperImpl
import io.mockk.mockk
import org.junit.Assert.assertNotNull
import org.junit.Test

class ProductMapperTest {

    private val productMapper: ProductMapper = ProductMapperImpl()

    @Test
    fun `GIVEN a ProductModelResponse WHEN transform from mapper is called THEN should not return a emptyList`() {
        val mockProductResponse = mockk<ProductModelResponse>(relaxed = true)

        val result = productMapper.transform(mockProductResponse)

        assertNotNull(result)
    }
}