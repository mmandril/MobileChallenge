package com.marcus.core.di

import com.marcus.core.interceptor.InterceptorProvider
import com.marcus.core.provider.HttpClient
import com.marcus.core.provider.impl.HttpClientImpl
import com.marcus.core.retrofitclient.RetrofitClient
import core.remotedata.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    @Singleton
    fun provideBaseUrl() = BuildConfig.BASE_URL

    @Provides
    @Singleton
    fun provideInterceptor() = InterceptorProvider.provider()

    @Provides
    @Singleton
    fun provideRetrofit(baseUrl: String, okHttpClient: OkHttpClient) =
        RetrofitClient.newInstance(baseUrl, okHttpClient)

    @Provides
    @Singleton
    fun provideHttpClient(retrofit: Retrofit): HttpClient = HttpClientImpl(retrofit)
}