package com.marcus.product.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.collectAsState
import com.marcus.designsystem.MainTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
internal class ProductListActivity : AppCompatActivity() {

    private val viewModel by viewModels<ProductListViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            with(viewModel.productListState.collectAsState().value) {
                MainTheme {
                    ProductScreen(
                        productListState = this,
                        onQuantityChange = { code, quantity ->
                            viewModel.changeQuantity(
                                code,
                                quantity
                            )
                        },
                        onCheckoutClick = { }
                    )
                }
            }
        }
    }
}