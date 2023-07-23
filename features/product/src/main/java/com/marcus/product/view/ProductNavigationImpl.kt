package com.marcus.product.view

import android.content.Context
import android.content.Intent
import com.marcus.navigation.ProductNavigation

internal class ProductNavigationImpl : ProductNavigation {

    override fun navigateToProductList(context: Context) {
        context.startActivity(
            Intent(context, ProductListActivity::class.java)
        )
    }
}