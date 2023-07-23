package com.marcus.product.view

import com.marcus.product.domain.model.Product
import com.marcus.product.domain.usecase.CalculateFinalPriceUseCase
import com.marcus.product.domain.usecase.CalculateTotalListPriceUseCase
import com.marcus.product.domain.usecase.CalculateTotalListPriceWithDiscountUseCase
import com.marcus.product.domain.usecase.GetProductUseCase
import com.marcus.product.helpers.MainDispatcherRule
import com.marcus.product.helpers.getProductList
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class ProductViewModelTest {

    @get:Rule
    val mainDispatcher = MainDispatcherRule()

    private val mockProductUseCase = mockk<GetProductUseCase>(relaxed = true)
    private val mockCalculateFinalPriceUseCase = mockk<CalculateFinalPriceUseCase>(relaxed = true)
    private val mockCalculateTotalListPriceUseCase =
        mockk<CalculateTotalListPriceUseCase>(relaxed = true)
    private val mockCalculateTotalListPriceWithDiscountUseCase =
        mockk<CalculateTotalListPriceWithDiscountUseCase>(relaxed = true)
    private lateinit var productViewModel: ProductListViewModel

    @Before
    fun setup() = runTest {
        coEvery { mockProductUseCase() } returns getProductList()
        productViewModel = ProductListViewModel(
            mockProductUseCase,
            mockCalculateFinalPriceUseCase,
            mockCalculateTotalListPriceUseCase,
            mockCalculateTotalListPriceWithDiscountUseCase
        )
    }

    @Test
    fun `WHEN initialize viewModel should call getProductUseCase one time`() {
        coEvery {
            mockProductUseCase()
        }
    }

    @Test
    fun `WHEN changing the quantity CalculateFinalPriceUseCase should be call to get product price`() {
        val product = getProductList().find { it.code == Product.ProductCode.MUG }

        productViewModel.changeQuantity("MUG", 1)

        coVerify {
            mockCalculateFinalPriceUseCase(
                product, 1
            )
        }
    }

    @Test
    fun `WHEN changing the quantity CalculateTotalListPriceUseCase should be call to get the final price with no discount`() {
        productViewModel.changeQuantity("MUG", 1)

        val productList = productViewModel.productListState.value.productList

        coVerify {
            mockCalculateTotalListPriceUseCase(
                productList
            )
        }
    }

    @Test
    fun `WHEN changing the quantity CalculateTotalListPriceWithDiscountUseCase should be call to get the final price with discount`() {
        productViewModel.changeQuantity("MUG", 1)

        val productList = productViewModel.productListState.value.productList

        coVerify {
            mockCalculateTotalListPriceUseCase(
                productList
            )
        }
    }
}