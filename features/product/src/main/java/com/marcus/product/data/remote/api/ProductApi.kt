package com.marcus.product.data.remote.api

import com.marcus.product.data.remote.model.ProductModelResponse
import retrofit2.http.GET

interface ProductApi {

    @GET("Products.json")
    suspend fun getProductList(): ProductModelResponse
}