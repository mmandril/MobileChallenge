package com.marcus.core.provider

interface HttpClient {
    fun <T> create(service: Class<T>): T
}