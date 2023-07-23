package com.marcus.mobilechallenge.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marcus.navigation.ProductNavigation
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity @Inject constructor() : AppCompatActivity() {

    @Inject
    lateinit var productNavigation: ProductNavigation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initProductView()
        closeMainActivity()
    }

    private fun initProductView() {
        productNavigation.navigateToProductList(this)
    }

    private fun closeMainActivity() {
        finish()
    }
}