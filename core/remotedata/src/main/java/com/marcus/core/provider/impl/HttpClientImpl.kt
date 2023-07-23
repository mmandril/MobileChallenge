package com.marcus.core.provider.impl

import com.marcus.core.provider.HttpClient
import retrofit2.Retrofit

internal class HttpClientImpl(
    private val retrofit: Retrofit
) : HttpClient {
    override fun <T> create(service: Class<T>): T {
        return retrofit.create(service)
    }
}